package com.example.ads

import android.app.Application
import com.google.android.gms.ads.MobileAds

class AdmobInitialize:Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}