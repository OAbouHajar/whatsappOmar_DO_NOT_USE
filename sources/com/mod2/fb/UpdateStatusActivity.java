package com.mod2.fb;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.mod2.fblibs.AuthListener;
import com.mod2.fblibs.FacebookFacade;
import com.mod2.libs.Const;
import com.mod2.libs.TForm;
import com.mod2.libs.TTR;

public class UpdateStatusActivity extends TForm {
    private TTR TR = new TTR(this);
    private FacebookFacade facebook;
    private TextView labelFBResult;
    private byte[] photoData;
    private String photoDescription;

    public void DoPost() {
        this.labelFBResult.setText("Posted To Facebook");
        this.facebook.publishImage(this.photoData, this.photoDescription);
    }

    public void onActCreate(Bundle bundle) {
        this.TR.InitActivity("activity_update_status");
        this.facebook = new FacebookFacade(this, "355198514515820");
        this.labelFBResult = (TextView) this.TR.InitView("label_fb_result");
        this.photoDescription = this.TR.GetSharedString(Const.PhotoDescription);
        this.photoData = this.TR.GetSharedData(Const.PhotoToUpload);
        if (!this.facebook.isAuthorized()) {
            this.labelFBResult.setText("Login Failed");
            this.facebook.authorize(new AuthListener() {
                public void onAuthFail(String str) {
                    UpdateStatusActivity.this.finish();
                }

                public void onAuthSucceed() {
                    UpdateStatusActivity.this.DoPost();
                }
            });
            return;
        }
        DoPost();
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
