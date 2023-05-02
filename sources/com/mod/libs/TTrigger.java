package com.mod.libs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.Observable;
import java.util.Observer;

public class TTrigger extends BroadcastReceiver {
    private TTR TR;
    private Context context;
    private Observer observer = new Observer() {
        public void update(Observable observable, Object obj) {
            TTrigger.this.procTriggerEvent.onTriggered(((Intent) obj).getAction());
        }
    };
    /* access modifiers changed from: private */
    public OnTriggerEvent procTriggerEvent;
    /* access modifiers changed from: private */
    public Handler timerHandler = new Handler();
    /* access modifiers changed from: private */
    public String timerID;
    /* access modifiers changed from: private */
    public Runnable timerThreadOnce = new Runnable() {
        public void run() {
            TTrigger.this.timerHandler.removeCallbacks(TTrigger.this.timerThreadOnce);
            TTrigger.this.procTriggerEvent.onTriggered(TTrigger.this.timerID);
        }
    };

    public interface OnTriggerEvent {
        void onTriggered(String str);
    }

    public TTrigger(Context context2, OnTriggerEvent onTriggerEvent) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.procTriggerEvent = onTriggerEvent;
        TGlobal.GetPublic().addObserver(this.observer);
    }

    public void DoFireUp(String str, int i2) {
        this.timerID = str;
        this.timerHandler.removeCallbacks(this.timerThreadOnce);
        this.timerHandler.postDelayed(this.timerThreadOnce, (long) i2);
    }

    public void DoPostEvent(String str) {
        this.context.sendBroadcast(new Intent().setAction(str));
    }

    public void DoTrigger(String str) {
        this.timerID = str;
        this.timerHandler.removeCallbacks(this.timerThreadOnce);
        this.timerHandler.postDelayed(this.timerThreadOnce, 1);
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

    public void onReceive(Context context2, Intent intent) {
        this.procTriggerEvent.onTriggered(intent.getAction());
    }

    public void setOnTriggerEvent(String str) {
        this.context.registerReceiver(this, new IntentFilter(str));
    }
}
