package com.malware.hsbcfake;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.MotionEvent;
import android.widget.Toast;

public class TouchService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {		
	    Timer timer  =  new Timer();
	    timer.scheduleAtFixedRate(new TimerTask() {
	    	
	    	public void run() {
	    		
//	    		@Override
//	    		public boolean onTouchEvent(MotionEvent event) {
//
//	    		    int X = (int) event.getX();
//	    		    int Y = (int) event.getY();
//
//	    		    int eventaction = event.getAction();
//
//	    		    switch (eventaction) {
//
//	    		    case MotionEvent.ACTION_DOWN:
//	    		        Toast.makeText(this, "ACTION_DOWN AT COORDS "+"X: "+X+" Y: "+Y,             Toast.LENGTH_SHORT).show();
//	    		        //isTouch = true;
//	    		        break;
//	    		    case MotionEvent.ACTION_MOVE:
//	    		        Toast.makeText(this, "MOVE "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
//	    		        break;
//	    		    case MotionEvent.ACTION_UP:
//	    		        Toast.makeText(this, "ACTION_UP "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
//	    		        break;
//	    		    }
//	    		    return true;
//
//	    		}
	        
	        }
	    }, 500, 500);
	    
	    return START_STICKY;   
	}

}
