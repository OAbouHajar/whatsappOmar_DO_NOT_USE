package com.mod.libs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TGlobalTrigger extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        TGlobal.GetPublic().PostGlobalEvent(intent);
    }
}
