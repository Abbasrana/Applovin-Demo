package com.basindevapp.applovindemo

import android.app.Application
import com.applovin.sdk.AppLovinMediationProvider
import com.applovin.sdk.AppLovinSdk


class DemoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AppLovinSdk.getInstance(this).mediationProvider = AppLovinMediationProvider.MAX
        AppLovinSdk.initializeSdk(this) {
            // AppLovin SDK is initialized, start loading ads
        }
    }
}