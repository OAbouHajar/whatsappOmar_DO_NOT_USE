package com.mod2.flash;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.mod2.libs.TForm;
import com.mod2.libs.TTR;

public class FlashLampActivity extends TForm {
    private TTR TR = new TTR(this);

    public void onActCreate(Bundle bundle) {
        this.TR.StartService(FlashLampService.class);
        this.TR.Halt();
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
        return false;
    }

    public void onThread(String str) {
    }

    public void onTimer(String str) {
    }

    public void onTriggered(String str) {
    }
}
