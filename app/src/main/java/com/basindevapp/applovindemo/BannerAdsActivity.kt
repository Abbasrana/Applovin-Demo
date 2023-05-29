package com.basindevapp.applovindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.applovin.mediation.MaxAd
import com.applovin.mediation.MaxAdViewAdListener
import com.applovin.mediation.MaxError
import com.applovin.mediation.ads.MaxAdView

class BannerAdsActivity : AppCompatActivity(), MaxAdViewAdListener {
    lateinit var adTop : MaxAdView
    lateinit var adBottom : MaxAdView
    lateinit var interstitialads: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_ads)
        adTop = findViewById(R.id.adTop)
        adBottom = findViewById(R.id.adBottom)
        interstitialads = findViewById(R.id.interstitialads)
        adTop.loadAd()
        adBottom.loadAd()
        interstitialads.setOnClickListener { startActivity(Intent(this,InterstitialAdsActivity::class.java)) }
    }

    override fun onAdLoaded(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdDisplayed(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdHidden(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdClicked(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdLoadFailed(p0: String?, p1: MaxError?) {
        TODO("Not yet implemented")
    }

    override fun onAdDisplayFailed(p0: MaxAd?, p1: MaxError?) {
        TODO("Not yet implemented")
    }

    override fun onAdExpanded(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdCollapsed(p0: MaxAd?) {
        TODO("Not yet implemented")
    }
}