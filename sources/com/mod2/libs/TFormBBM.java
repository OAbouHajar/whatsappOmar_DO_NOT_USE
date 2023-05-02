package com.mod2.libs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bbm.bali.ui.main.a.e;
import com.mod2.libs.TTRButton;
import com.mod2.libs.TThread;
import com.mod2.libs.TTimer;
import com.mod2.libs.TTrigger;

public abstract class TFormBBM extends e implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener {
    public final void ShowBBMToolbar(String str) {
        try {
            a(findViewById(getResources().getIdentifier("main_toolbar", "id", getPackageName())), str);
        } catch (Exception e2) {
        }
    }

    public abstract void onActCreate(Bundle bundle);

    public abstract void onActResult(int i2, int i3, Intent intent);

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        TFormBBM.super.onActivityResult(i2, i3, intent);
        onActResult(i2, i3, intent);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            onDlgPositiveBtnClick(dialogInterface);
        } else {
            onDlgNegativeBtnClick(dialogInterface);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TFormBBM.super.onCreate(bundle);
        onActCreate(bundle);
    }

    public abstract void onDlgNegativeBtnClick(DialogInterface dialogInterface);

    public abstract void onDlgPositiveBtnClick(DialogInterface dialogInterface);

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (onSystemKeyDown(i2, keyEvent)) {
            return true;
        }
        return TFormBBM.super.onKeyDown(i2, keyEvent);
    }

    public abstract boolean onSystemKeyDown(int i2, KeyEvent keyEvent);
}
