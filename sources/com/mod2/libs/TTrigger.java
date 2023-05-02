package com.mod2.libs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class TTrigger {
    /* access modifiers changed from: private */
    public TTR TR;
    private BroadcastReceiver broadcastHandler = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            TTrigger.this.procTriggerEvent.onTriggered(intent.getAction());
        }
    };
    private Context context;
    /* access modifiers changed from: private */
    public OnTriggerEvent procTriggerEvent;

    public interface OnTriggerEvent {
        void onTriggered(String str);
    }

    public TTrigger(Context context2, OnTriggerEvent onTriggerEvent) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.procTriggerEvent = onTriggerEvent;
    }

    public void DoFireUp(final String str, final int i2) {
        setOnTriggerEvent(str);
        new Thread(new Runnable() {
            public void run() {
                TTrigger.this.TR.Sleep((long) i2);
                TTrigger.this.DoPostEvent(str);
            }
        }).start();
    }

    public void DoPostEvent(String str) {
        this.context.sendBroadcast(new Intent().setAction(str));
    }

    public void DoTrigger(String str) {
        setOnTriggerEvent(str);
        DoPostEvent(str);
    }

    public void SetProperty(String str, int i2) {
        this.TR.SetSharedInteger(str, i2);
        DoPostEvent(str);
    }

    public void SetProperty(String str, Boolean bool) {
        this.TR.SetSharedBool(str, bool);
        DoPostEvent(str);
    }

    public void SetProperty(String str, String str2) {
        this.TR.SetSharedString(str, str2);
        DoPostEvent(str);
    }

    public void SetProperty(String str, byte[] bArr) {
        this.TR.SetSharedData(str, bArr);
        DoPostEvent(str);
    }

    public void setOnTriggerEvent(String str) {
        this.context.registerReceiver(this.broadcastHandler, new IntentFilter(str));
    }
}
