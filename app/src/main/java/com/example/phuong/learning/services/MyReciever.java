package com.example.phuong.learning.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
        protected  final static String TAG = "MyReciever";

    public MyReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"oh ho");
       // Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}
