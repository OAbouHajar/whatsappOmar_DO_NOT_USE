package com.mod.libs;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.mod.libs.TTRButton;
import com.mod.libs.TTRCheckBox;
import com.mod.libs.TThread;
import com.mod.libs.TTimer;
import com.mod.libs.TTrigger;

public abstract class TForm extends Activity implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener, TTRCheckBox.OnCheckBoxClickEvent {
    public TTR TR = new TTR(this);
    public TTRButton TRButton = new TTRButton(this, this);
    public TTRCheckBox TRCheckBox = new TTRCheckBox(this, this);
    public TThread Thread = new TThread(this);
    public TTrigger Trigger = new TTrigger(this, this);

    public Button InitButton(String str) {
        return (Button) this.TRButton.InitButton(str);
    }

    public EditText InitEdit(String str) {
        return (EditText) this.TR.InitView(str);
    }

    public void InitForm(String str) {
        this.TR.InitForm(str);
    }

    public ImageButton InitImageButton(String str) {
        View InitView = InitView(str);
        InitView.setOnClickListener(this.TRButton.onClickListener);
        return (ImageButton) InitView;
    }

    public Spinner InitSpinner(String str) {
        return this.TR.InitSpinner(str);
    }

    public Spinner InitSpinner(String str, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return this.TR.InitSpinner(str, onItemSelectedListener);
    }

    public View InitView(String str) {
        return this.TR.InitView(str);
    }

    public abstract void onActCreate(Bundle bundle);

    public abstract void onActResult(int i2, int i3, Intent intent);

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
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
        super.onCreate(bundle);
        onActCreate(bundle);
    }

    public abstract void onDlgNegativeBtnClick(DialogInterface dialogInterface);

    public abstract void onDlgPositiveBtnClick(DialogInterface dialogInterface);

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (onSystemKeyDown(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public abstract boolean onSystemKeyDown(int i2, KeyEvent keyEvent);
}
