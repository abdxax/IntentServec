package com.example.abdulrahman.serv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Abdulrahman on 11/11/17.
 */

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equalsIgnoreCase("SendSer")){
            String ms=intent.getStringExtra("msg");
            Toast.makeText(context,ms,Toast.LENGTH_LONG).show();
            NewMessageNotification messageNotification=new NewMessageNotification();
            messageNotification.notify(context,ms,125);

        }
    }
}
