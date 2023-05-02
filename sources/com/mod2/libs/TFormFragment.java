package com.mod2.libs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.mod2.libs.TTRButton;
import com.mod2.libs.TThread;
import com.mod2.libs.TTimer;
import com.mod2.libs.TTrigger;

public abstract class TFormFragment extends FragmentActivity implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener {
    public TTR TR = new TTR(this);
    public TTRButton TRButton = new TTRButton(this, this);
    public TThread Thread = new TThread(this);
    public TTrigger Trigger = new TTrigger(this, this);

    public void InitActivity(String str) {
        this.TR.InitActivity(str);
    }

    public Button InitButton(String str) {
        return (Button) this.TRButton.InitButton(str);
    }

    public EditText InitEdit(String str) {
        return (EditText) this.TR.InitView(str);
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
