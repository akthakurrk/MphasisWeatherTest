package com.example.mphasisweatherdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import com.example.mphasisweatherdemo.databinding.ActivityMainBinding
import com.example.mphasisweatherdemo.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import com.example.mphasisweatherdemo.networks.Status
import com.example.mphasisweatherdemo.utility.ConstValue
import com.example.mphasisweatherdemo.utility.SharePreferences
import com.example.mphasisweatherdemo.utility.Utils

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var sharePre: SharePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       if (supportActionBar != null) supportActionBar?.hide()

        initView()
    }

    private fun initView() {
        sharePre= SharePreferences(this)

        // on below line we are adding on query
        // listener for our search view.
        binding.actionBar.searchView.setOnQueryTextListener(object : OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query!!.isNotEmpty()){

                    getWeatherAPI(query, ConstValue.LIMIT, ConstValue.APP_ID)
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return false
            }
        })


        getWeatherAPI(sharePre.location.toString(), ConstValue.LIMIT, ConstValue.APP_ID)
    }

    @SuppressLint("SetTextI18n")
    private fun getWeatherAPI(
        cityName: String,
        limit: String,
        appId: String
    ) {
        viewModel.getWeatherAPi(cityName, limit, appId).observe(this) {
            it?.let { resource ->
                when (resource.status) {
                    Status.Success -> {
                        val data = resource.data
                        sharePre.location= data?.name

                        binding.tvTemp.text ="${Utils.convertKelvinToCelsius(data?.main?.temp!!.toFloat())} \u2103"
                        binding.tvWeather.text=data.weather[0].main
                        binding.humidity.text=data.main.humidity.toString()
                        binding.tempMin.text = "${Utils.convertKelvinToCelsius(data.main.temp_min.toFloat())} \u2103"
                        binding.tempMax.text = "${Utils.convertKelvinToCelsius(data.main.temp_max.toFloat())} \u2103"
                    }
                    Status.Failure -> {
                        Toast.makeText(this@MainActivity, "${resource.message}", Toast.LENGTH_LONG).show()
                    }
                    Status.Loading -> {}
                }
            }
        }
    }

}