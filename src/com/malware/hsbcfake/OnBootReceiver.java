package com.malware.hsbcfake;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class OnBootReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.d("Test","booot");
        Toast.makeText(context, "Test", Toast.LENGTH_LONG).show();
    }
}