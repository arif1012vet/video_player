package com.example.tajbiapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

LinearLayout layout1, layout2, layout3 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        layout1= findViewById(R.id.layout1) ;
        layout2= findViewById(R.id.layout2) ;
        layout3= findViewById(R.id.layout3) ;

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/yfcStFBApzc" ;
                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/ELooYmhh0MY" ;
                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/oCAj84fs1bA" ;
                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });














    }





}