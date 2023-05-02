package com.mod2.pvmode;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.mod2.libs.Const;
import com.mod2.libs.TForm;
import com.mod2.libs.TTR;

public class LockActivity extends TForm {
    private TTR TR = new TTR(this);
    private EditText editInputPasswd;

    public void gotoUnlock(View view) {
        if (this.TR.CompareEdit(this.editInputPasswd, this.TR.GetSharedString(Const.PrivateMode_Passwd)).booleanValue()) {
            this.TR.SetSharedBool(Const.ViewLocker, false);
            this.TR.Halt();
            return;
        }
        this.TR.ShowToast("Incorrect Password");
    }

    public void onActCreate(Bundle bundle) {
        this.TR.InitActivity("activity_lock");
        this.editInputPasswd = (EditText) this.TR.InitView("edit_input_passwd");
        this.editInputPasswd = this.TR.SetEditPasswdText(this.editInputPasswd);
        if (!this.TR.GetSharedBool(Const.ViewLocker).booleanValue()) {
            this.TR.SetSharedBool(Const.ViewLocker, true);
            this.TR.StartService(LockService.class);
        }
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
        if (this.TR.BackPress(i2, keyEvent).booleanValue()) {
            return this.TR.AppMinimize().booleanValue();
        }
        return false;
    }

    public void onThread(String str) {
    }

    public void onTimer(String str) {
    }

    public void onTriggered(String str) {
    }

    public void showDialog(View view) {
        AlertDialog.Builder builder;
        View view2 = view;
        View inflate = getLayoutInflater().inflate(2130903544, (ViewGroup) null);
        new AlertDialog.Builder(this);
        AlertDialog.Builder builder2 = builder;
        AlertDialog.Builder title = builder2.setTitle("Insert Password");
        AlertDialog.Builder view3 = builder2.setView(inflate);
        builder2.create().show();
    }
}
