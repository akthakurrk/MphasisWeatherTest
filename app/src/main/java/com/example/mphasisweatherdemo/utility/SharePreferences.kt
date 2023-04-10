package com.example.mphasisweatherdemo.utility

import android.content.Context
import android.content.SharedPreferences
import com.example.mphasisweatherdemo.networks.Keys

class SharePreferences(private val context: Context) {

    private val sharePref = context.getSharedPreferences("default", Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharePref.edit()


    var location = sharePref.getString(Keys.location, "")
        set(value) = sharePref.edit().putString(Keys.location, value).apply()
}