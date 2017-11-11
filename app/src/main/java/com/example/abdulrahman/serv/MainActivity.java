package com.example.abdulrahman.serv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intentSer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!Servis.IsRunning){
            Servis.IsRunning=true;
            intentSer=new Intent(this,Servis.class);
            startService(intentSer);
        }
    }

    public void butStop(View view) {
        Servis.IsRunning=false;
        stopService(intentSer);
    }
}
