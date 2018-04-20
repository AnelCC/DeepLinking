package com.anelcalvo.www.deeplinking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView webView = findViewById(R.id.web_view);
        webView.loadUrl("https://cherryappsbyili.blogspot.com/");
    }
}
