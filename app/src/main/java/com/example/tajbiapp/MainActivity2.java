package com.example.tajbiapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    WebView webView ;
    ImageView main2LayoutImage ;
    public static String video_link= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        webView = findViewById(R.id.webView) ;
        main2LayoutImage= findViewById(R.id.main2LayoutImage) ;


        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(video_link);

    }
}