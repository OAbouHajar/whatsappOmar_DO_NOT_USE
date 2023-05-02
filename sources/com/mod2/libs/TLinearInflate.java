package com.mod2.libs;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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

public abstract class TLinearInflate extends TLinearLayout implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener {
    public TTR TR;
    public TTRButton TRButton;
    public TThread Thread;
    public TTrigger Trigger;

    public TLinearInflate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InitComps(context, (String) null);
    }

    public TLinearInflate(Context context, AttributeSet attributeSet, Boolean bool) {
        super(context, attributeSet, bool);
        InitComps(context, (String) null);
    }

    public TLinearInflate(Context context, AttributeSet attributeSet, Boolean bool, String str) {
        super(context, attributeSet, bool);
        InitComps(context, str);
    }

    public TLinearInflate(Context context, AttributeSet attributeSet, String str) {
        super(context, attributeSet);
        InitComps(context, str);
    }

    public void InitActivity(String str) {
        this.TR.InitActivity(str);
    }

    public Button InitButton(String str) {
        View InitView = InitView(str);
        InitView.setOnClickListener(this.TRButton.onClickListener);
        return (Button) InitView;
    }

    public void InitComps(Context context, String str) {
        this.TR = new TTR(context);
        this.TRButton = new TTRButton(context, this);
        this.Thread = new TThread(this);
        this.Trigger = new TTrigger(context, this);
        LayoutInflater.from(context).inflate(this.TR.GetLayout(str), this);
    }

    public EditText InitEdit(String str) {
        return (EditText) findViewById(this.TR.GetID(str));
    }

    public ImageButton InitImageButton(String str) {
        View InitView = InitView(str);
        InitView.setOnClickListener(this.TRButton.onClickListener);
        return (ImageButton) InitView;
    }

    public Spinner InitSpinner(String str) {
        return (Spinner) InitView(str);
    }

    public Spinner InitSpinner(String str, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        Spinner InitSpinner = InitSpinner(str);
        InitSpinner.setOnItemSelectedListener(onItemSelectedListener);
        return InitSpinner;
    }

    public View InitView(String str) {
        return findViewById(this.TR.GetID(str));
    }

    public void onButtonClick(View view) {
        onIButtonClick(view);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            onDlgPositiveBtnClick(dialogInterface);
        } else {
            onDlgNegativeBtnClick(dialogInterface);
        }
    }

    public abstract void onDlgNegativeBtnClick(DialogInterface dialogInterface);

    public abstract void onDlgPositiveBtnClick(DialogInterface dialogInterface);

    public abstract void onIButtonClick(View view);

    public abstract void onIThread(String str);

    public abstract void onITimer(String str);

    public abstract void onITriggered(String str);

    public void onThread(String str) {
        onIThread(str);
    }

    public void onTimer(String str) {
        onITimer(str);
    }

    public void onTriggered(String str) {
        super.onTriggered(str);
        onITriggered(str);
    }
}
