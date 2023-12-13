package com.example.webviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button loadWebisteButton;
    EditText webAddressET;
    WebView websiteWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadWebisteButton = findViewById(R.id.load_btn);
        webAddressET = findViewById(R.id.web_address);
        websiteWebView = (WebView) findViewById(R.id.web_view);

        websiteWebView.setWebViewClient(new MyBrowser());

        //Now set onClick Listener on button
        loadWebisteButton.setOnClickListener(MainActivity.this);
    }
    @Override
    public void onClick(View v) {
        String websiteUrl = webAddressET.getText().toString();
        //In above line we are saving the web address inside a new String variable websiteUrl

        //Added some properties below on the WebView
        websiteWebView.getSettings().setLoadsImagesAutomatically(true);
        websiteWebView.getSettings().setJavaScriptEnabled(true);
        websiteWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //Passed the url of website saved inside String variable websiteUrl
        websiteWebView.loadUrl(websiteUrl);
    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

















//package com.example.webviewexample;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.View;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//
//    Button loadwebsiteButton;
//
//    EditText webAddressEt;
//    WebView websiteWebView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        loadwebsiteButton = findViewById(R.id.load_btn);
//        webAddressEt = findViewById(R.id.web_address);
//        websiteWebView = (WebView) findViewById(R.id.web_view);
//
//        websiteWebView.setWebViewClient(new MyBrowser());
//        loadwebsiteButton.setOnClickListener(MainActivity.this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        String websiteUrl=webAddressEt.getText().toString();
//        websiteWebView.getSettings().setLoadsImagesAutomatically(true);
//        websiteWebView.getSettings().setJavaScriptEnabled(true);
//        websiteWebView.setScrollBarStyle(view.SCROLLBARS_INSIDE_OVERLAY);
//        websiteWebView.loadUrl(websiteUrl);
//    }
//    private class MyBrowser extends WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view,String url){
//            view.loadUrl((url));
//            return true;
//        }
//    }
//}