package com.vynaloze.smartmirror.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.vynaloze.smartmirror.view.MainActivity;

public class StartupHandler extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            // Start application on boot
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
