package com.example.abdulrahman.serv;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by Abdulrahman on 11/11/17.
 */

public class Servis extends IntentService {
    public static boolean IsRunning=false;
    public Servis( ) {
        super("Servis");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
       while (IsRunning){
           Intent Broad=new Intent();
           Broad.setAction("SendSer");
           Broad.putExtra("msg","Heelo word ");
           sendBroadcast(Broad);
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}
