package com.mod.libs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.bbm.bali.ui.main.a.c;
import com.mod.libs.TTRButton;
import com.mod.libs.TTRCheckBox;
import com.mod.libs.TThread;
import com.mod.libs.TTimer;
import com.mod.libs.TTrigger;

public abstract class TFormBBM extends c implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener, TTRCheckBox.OnCheckBoxClickEvent {
    public TTR TR = new TTR(this);
    public TTRButton TRButton = new TTRButton(this, this);
    public TTRCheckBox TRCheckBox = new TTRCheckBox(this, this);
    public TThread Thread = new TThread(this);
    public TTrigger Trigger = new TTrigger(this, this);

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

    public void onCheckBoxClick(CompoundButton compoundButton, boolean z2) {
        this.TRCheckBox.thisCheckBox = compoundButton;
        if (z2) {
            this.TRCheckBox.SetCheckBoxCheckedFlag(compoundButton, true);
            onCheckBoxOn();
            return;
        }
        this.TRCheckBox.SetCheckBoxCheckedFlag(compoundButton, false);
        onCheckBoxOff();
    }

    public abstract void onCheckBoxOff();

    public abstract void onCheckBoxOn();

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
        this.TR.FreeMem();
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
