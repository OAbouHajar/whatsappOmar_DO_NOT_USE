package com.mod.libs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.bbm.bali.ui.main.a.h;
import com.mod.libs.TTRButton;
import com.mod.libs.TTRCheckBox;
import com.mod.libs.TThread;
import com.mod.libs.TTimer;
import com.mod.libs.TTrigger;

public abstract class TFragBBM extends h implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, DialogInterface.OnClickListener, TTRCheckBox.OnCheckBoxClickEvent {
    public TTR TR;
    public TTRButton TRButton;
    public TTRCheckBox TRCheckBox;
    public TThread Thread;
    public TTrigger Trigger;
    private Context context;
    private LayoutInflater thisLayoutInflater;
    private ViewGroup thisViewGroup;
    private View view;

    public Button InitButton(String str) {
        View InitView = InitView(str);
        InitView.setOnClickListener(this.TRButton.onClickListener);
        return (Button) InitView;
    }

    public EditText InitEdit(String str) {
        return (EditText) InitView(str);
    }

    public void InitFragmentLayout(String str) {
        this.view = this.thisLayoutInflater.inflate(this.TR.GetLayout(str), this.thisViewGroup, false);
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
        return this.view.findViewById(this.TR.GetID(str));
    }

    public WebView InitWebView(String str) {
        return (WebView) InitView(str);
    }

    public void a() {
    }

    public void b() {
        b(onTitleCreate());
    }

    public void c() {
    }

    public abstract void onActResult(int i2, int i3, Intent intent);

    public void onActivityResult(int i2, int i3, Intent intent) {
        TFragBBM.super.onActivityResult(i2, i3, intent);
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.context = layoutInflater.getContext();
        this.TR = new TTR(this.context);
        this.TRButton = new TTRButton(this.context, this);
        this.Thread = new TThread(this);
        this.Trigger = new TTrigger(this.context, this);
        this.TRCheckBox = new TTRCheckBox(this.context, this);
        this.thisLayoutInflater = layoutInflater;
        this.thisViewGroup = viewGroup;
        this.TR.FreeMem();
        onFragmentCreate(this.context);
        return this.view;
    }

    public abstract void onDlgNegativeBtnClick(DialogInterface dialogInterface);

    public abstract void onDlgPositiveBtnClick(DialogInterface dialogInterface);

    public abstract void onFragmentCreate(Context context2);

    public abstract String onTitleCreate();
}
