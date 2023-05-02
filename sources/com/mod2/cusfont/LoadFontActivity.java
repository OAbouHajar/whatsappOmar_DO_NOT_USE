package com.mod2.cusfont;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.mod2.libs.TFormFileList;
import com.mod2.libs.TTR;
import com.mod2.libs.TTRButton;
import com.mod2.libs.TTrigger;

public class LoadFontActivity extends TFormFileList {
    private String FontFile = "";
    private TTR TR = new TTR(this);
    private TTRButton TRButton = new TTRButton(this, this);
    private TTrigger Trigger = new TTrigger(this, this);
    private Button buttonFontApply;
    private Button buttonFontReset;
    private TextView textview;

    public void SetCustomFonts(String str) {
        this.Trigger.SetProperty("TInlineEdit.Font", str);
        this.Trigger.SetProperty("TInlineLabel.Font", str);
        this.Trigger.SetProperty("TLinkifyLabel.Font", str);
        this.Trigger.SetProperty("LabelFontSize.Font", str);
        this.Trigger.SetProperty("TextMainbar.Font", str);
        this.Trigger.SetProperty("EditMessage.Font", str);
        this.Trigger.SetProperty("TButton.Font", str);
        this.Trigger.SetProperty("TLabel.Font", str);
        this.Trigger.SetProperty("TEdit.Font", str);
        this.Trigger.SetProperty("TSwitch.Font", str);
    }

    public void onActCreate(Bundle bundle) {
        this.TR.InitActivity("activity_load_font");
        InitFileList("font_path");
        this.textview = (TextView) this.TR.InitView("font_preview");
        this.buttonFontApply = (Button) this.TRButton.InitButton("button_font_apply");
        this.buttonFontReset = (Button) this.TRButton.InitButton("button_font_reset");
        this.FontFile = this.TR.GetSharedString("TLabel.Font");
    }

    public void onActResult(int i2, int i3, Intent intent) {
    }

    public void onButtonClick(View view) {
        if (view.equals(this.buttonFontApply)) {
            SetCustomFonts(this.FontFile);
            finish();
        }
        if (view.equals(this.buttonFontReset)) {
            SetCustomFonts("");
            finish();
        }
    }

    public void onClick(String str) {
        this.FontFile = str;
        try {
            this.textview.setTypeface(Typeface.createFromFile(str));
        } catch (Exception e2) {
            this.textview.setTypeface(Typeface.DEFAULT);
        }
    }

    public boolean onSystemKeyDown(int i2, KeyEvent keyEvent) {
        return false;
    }

    public void onThread(String str) {
    }

    public void onTimer(String str) {
    }

    public void onTriggered(String str) {
    }
}
