package com.example.fangyi.news;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by FANGYI on 2016/4/12.
 */
public class BrowseNewsActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivy_browse_news);

        webView = (WebView) findViewById(R.id.webView);
        String pic_url = getIntent().getStringExtra("content_url");
        webView.loadUrl(pic_url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);//缓存
    }
}
