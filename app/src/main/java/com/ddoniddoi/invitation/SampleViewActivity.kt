package com.ddoniddoi.invitation

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import com.ddoniddoi.androidbasic.BaseActivity
import kotlinx.android.synthetic.main.activity_sample_view.*

class SampleViewActivity : BaseActivity() {

    private var webSettings : WebSettings? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_view)
        setValues()
        setupEvents()
    
    }
    override fun setValues() {
        
        sampleViewWebView.webViewClient = WebViewClient() //클릭 시 새창 안 뜨게
        webSettings = sampleViewWebView.settings //세부 세팅 등록
        webSettings!!.javaScriptEnabled = true // 웹페이지 자바스클비트 허용 여부
        webSettings!!.javaScriptCanOpenWindowsAutomatically = false // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
        webSettings!!.loadWithOverviewMode = true // 메타태그 허용 여부
        webSettings!!.useWideViewPort = true // 화면 사이즈 맞추기 허용 여부
        webSettings!!.builtInZoomControls = false // 화면 확대 축소 허용 여부
        webSettings!!.layoutAlgorithm = WebSettings.LayoutAlgorithm.SINGLE_COLUMN  // 컨텐츠 사이즈 맞추기
        webSettings!!.cacheMode = WebSettings.LOAD_NO_CACHE // 브라우저 캐시 허용 여부
        webSettings!!.domStorageEnabled = true // 로컬저장소 허용 여부
        webSettings!!.setSupportZoom(false) // 화면 줌 허용 여부
        webSettings!!.setSupportMultipleWindows(false) // 새창 띄우기 허용 여부

        sampleViewWebView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                if(newProgress < 100)
                    sampleViewProgressBar.visibility = ProgressBar.VISIBLE
                else if (newProgress == 100)
                    sampleViewProgressBar.visibility = ProgressBar.GONE
                sampleViewProgressBar.progress = newProgress
            }
        }

        sampleViewWebView.loadUrl("https://ddoniblog.blogspot.com/")
    }

    override fun setupEvents() {

    }

    override fun onBackPressed() {
        if(sampleViewWebView.canGoBack()) // 뒤로가기 눌렀을 때, 뒤로 갈 곳이 있을 경우
            sampleViewWebView.goBack()
        else //뒤로 갈 곳이 없는 경우
            super.onBackPressed()
    }
}
