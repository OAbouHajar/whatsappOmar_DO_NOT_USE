package com.mod2.popup;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mod2.libs.Const;
import com.mod2.libs.TForm;
import com.mod2.libs.TTR;

public class PopupActivity extends TForm {
    private TTR TR = new TTR(this);
    private ImageView imgSender;
    private TextView textBody;
    private TextView textSender;

    public void onActCreate(Bundle bundle) {
        this.TR.SetSharedBool(Const.flagExecApp, false);
        String GetSharedString = this.TR.GetSharedString(Const.PopupTitle);
        String GetSharedString2 = this.TR.GetSharedString(Const.PopupMsg);
        Bitmap GetSharedBitmap = this.TR.GetSharedBitmap(Const.PopupImage);
        this.TR.InitActivity("activity_popup");
        this.imgSender = (ImageView) this.TR.InitView("img_sender");
        this.textSender = (TextView) this.TR.InitView("text_sender");
        this.textBody = (TextView) this.TR.InitView("text_body");
        this.TR.Image(this.imgSender, GetSharedBitmap);
        this.TR.Text(this.textSender, GetSharedString);
        this.TR.SetScrollbarTextView(this.textBody, 5);
        this.TR.Text(this.textBody, GetSharedString2);
    }

    public void onActResult(int i2, int i3, Intent intent) {
    }

    public void onButtonClick(View view) {
    }

    public void onDlgNegativeBtnClick(DialogInterface dialogInterface) {
    }

    public void onDlgPositiveBtnClick(DialogInterface dialogInterface) {
    }

    public boolean onSystemKeyDown(int i2, KeyEvent keyEvent) {
        if (!this.TR.BackPress(i2, keyEvent).booleanValue()) {
            return false;
        }
        this.TR.Halt();
        return this.TR.AppMinimize().booleanValue();
    }

    public void onThread(String str) {
    }

    public void onTimer(String str) {
    }

    public void onTriggered(String str) {
    }
}
