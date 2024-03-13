package com.example.tajbiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

   Button button1, button2, button3 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1= findViewById(R.id.button1) ;
        button2= findViewById(R.id.button2) ;
        button3= findViewById(R.id.button3) ;


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/yfcStFBApzc" ;

                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/oCAj84fs1bA" ;

                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_link= "https://www.youtube.com/embed/ELooYmhh0MY" ;

                Intent myIntent= new Intent(MainActivity.this, MainActivity2.class) ;
                startActivity(myIntent);

            }
        });


















    }





}