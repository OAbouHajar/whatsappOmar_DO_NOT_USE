package com.mod2.libs;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationListener;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import com.mod2.libs.TTRButton;
import com.mod2.libs.TThread;
import com.mod2.libs.TTimer;
import com.mod2.libs.TTrigger;

public abstract class TFormGPS extends Activity implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, LocationListener {
    public abstract void onActCreate(Bundle bundle);

    public abstract void onActResult(int i2, int i3, Intent intent);

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        onActResult(i2, i3, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onActCreate(bundle);
        try {
            turnGPSOn();
        } catch (Exception e2) {
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (onSystemKeyDown(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public abstract boolean onSystemKeyDown(int i2, KeyEvent keyEvent);

    public void turnGPSOn() {
        Intent intent = new Intent("android.location.GPS_ENABLED_CHANGE");
        intent.putExtra("enabled", true);
        sendBroadcast(intent);
        if (!Settings.Secure.getString(getContentResolver(), "location_providers_allowed").contains("gps")) {
            Intent intent2 = new Intent();
            intent2.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            intent2.addCategory("android.intent.category.ALTERNATIVE");
            intent2.setData(Uri.parse("3"));
            sendBroadcast(intent2);
        }
    }
}
