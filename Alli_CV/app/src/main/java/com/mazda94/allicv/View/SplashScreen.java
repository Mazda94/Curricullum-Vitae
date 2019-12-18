package com.mazda94.allicv.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mazda94.allicv.R;

public class SplashScreen extends AppCompatActivity {
    SplashScreen context = SplashScreen.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent( context, Home.class ) );
                finish();
            }
        }, 1500 );
    }
}
