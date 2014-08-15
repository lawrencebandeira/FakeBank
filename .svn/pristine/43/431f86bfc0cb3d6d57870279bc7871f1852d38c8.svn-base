package com.malware.hsbcfake;

import java.util.List;

import android.app.ActivityManager;
import android.app.IntentService;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class HelloIntentService extends IntentService {

	  /**
	   * A constructor is required, and must call the super IntentService(String)
	   * constructor with a name for the worker thread.
	   */
	  public HelloIntentService() {
	      super("HelloIntentService");
	  }

	  /**
	   * The IntentService calls this method from the default worker thread with
	   * the intent that started the service. When this method returns, IntentService
	   * stops the service, as appropriate.
	   */
	  @Override
	  protected void onHandleIntent(Intent intent) {
		  
		  Toast.makeText(this, "Pablo", Toast.LENGTH_SHORT).show();
	      // Normally we would do some work here, like download a file.
	      // For our sample, we just sleep for 5 seconds.
//	      long endTime = System.currentTimeMillis() + 5*1000;
//	      while (System.currentTimeMillis() < endTime) {
//	          synchronized (this) {
//	              try {
//	                  wait(endTime - System.currentTimeMillis());
//	                  Toast.makeText(this, "Pablo", Toast.LENGTH_SHORT).show();
//	              } catch (Exception e) {
//	              }
//	          }
//	      }
	  }
	  
	private void process() {
		Log.d("SPY", "Processos");
		ActivityManager activityManager = (ActivityManager) this.getSystemService( ACTIVITY_SERVICE );
		List<RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
		for(int i = 0; i < procInfos.size(); i++){
		    if(procInfos.get(i).processName.equals("br.com.gastecnologia.protectorremote")) {
		        Toast.makeText(getApplicationContext(), "Protector Remote is running", Toast.LENGTH_LONG).show();
		    }
		}
	  }
	  
	  @Override
	  public int onStartCommand(Intent intent, int flags, int startId) {
	      Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
	      
//	      Runnable r = new Runnable() {
//	          public void run() {
//	        	  while (true) {
//	        		  process();
//	        		  Log.d("SPY", "Loop");
//	        	  }
//	          }
//	      };
//
//	      new Thread(r).start();
	      
	      return super.onStartCommand(intent,flags,startId);
	  }
	  
	}