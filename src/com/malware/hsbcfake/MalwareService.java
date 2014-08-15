package com.malware.hsbcfake;

import java.util.List;

import android.app.ActivityManager;
import android.app.IntentService;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MalwareService extends Service {

	@Override
    public void onCreate() {
		Toast.makeText(getApplicationContext(), "Servico Iniciado", Toast.LENGTH_LONG).show();
		
		Toast.makeText(getApplicationContext(), "onBind", Toast.LENGTH_LONG).show();
		ActivityManager activityManager = (ActivityManager) this.getSystemService( ACTIVITY_SERVICE );
		List<RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
		for(int i = 0; i < procInfos.size(); i++){
		    if(procInfos.get(i).processName.equals("br.com.gastecnologia.protectorremote")) {
		        Toast.makeText(getApplicationContext(), "Browser is running", Toast.LENGTH_LONG).show();
		    }
		}
    }
	
	public void onStartCommand() {
		Toast.makeText(getApplicationContext(), "onStartCommand", Toast.LENGTH_LONG).show();
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		Toast.makeText(getApplicationContext(), "onBind", Toast.LENGTH_LONG).show();
		ActivityManager activityManager = (ActivityManager) this.getSystemService( ACTIVITY_SERVICE );
		List<RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
		for(int i = 0; i < procInfos.size(); i++){
		    if(procInfos.get(i).processName.equals("br.com.gastecnologia.protectorremote")) {
		        Toast.makeText(getApplicationContext(), "Browser is running", Toast.LENGTH_LONG).show();
		    }
		}
		
		return null;
	}


}
