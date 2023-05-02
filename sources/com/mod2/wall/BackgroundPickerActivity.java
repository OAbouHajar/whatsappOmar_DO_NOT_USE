package com.mod2.wall;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.mod2.libs.Const;
import com.mod2.libs.TForm;
import com.mod2.libs.TTR;
import com.mod2.libs.TTRButton;
import com.mod2.libs.TTrigger;
import java.io.File;

public class BackgroundPickerActivity extends TForm {
    private TTR TR = new TTR(this);
    private TTRButton TRButton = new TTRButton(this, this);
    private TTrigger Trigger = new TTrigger(this, this);
    private Button button_clear;
    private Button button_start_camera;
    private Button button_start_gallery;
    private String picFolder;
    private String tmpCaptured = "captured.jpg";

    public void onActCreate(Bundle bundle) {
        this.TR.InitActivity("activity_background_picker");
        this.button_start_camera = (Button) this.TRButton.InitButton("button_start_camera");
        this.button_start_gallery = (Button) this.TRButton.InitButton("button_start_gallery");
        this.button_clear = (Button) this.TRButton.InitButton("button_clear");
    }

    public void onActResult(int i2, int i3, Intent intent) {
        String str = null;
        Boolean bool = false;
        if (i2 == Const.idCameraActivity && i3 == -1) {
            str = this.TR.DefFilePathStr(this.picFolder, this.tmpCaptured);
            bool = true;
        }
        if (i2 == Const.idGalleryActivity && i3 == -1 && intent != null) {
            str = this.TR.GetGalleryFileName(intent);
            bool = true;
        }
        if (bool.booleanValue()) {
            int GetSharedInteger = this.TR.GetSharedInteger(Const.BackgroundWidth);
            int GetSharedInteger2 = this.TR.GetSharedInteger(Const.BackgroundHeight);
            String GetSharedString = this.TR.GetSharedString(Const.BackgroundFileName);
            Bitmap ResizeImageDown = this.TR.ResizeImageDown(str, GetSharedInteger, GetSharedInteger2);
            File DefFilePath = this.TR.DefFilePath(this.picFolder, GetSharedString);
            this.TR.SaveImageToFile(ResizeImageDown, DefFilePath);
            this.Trigger.SetProperty(this.TR.GetSharedString(Const.BackgroundPointer), DefFilePath.toString());
            finish();
        }
    }

    public void onButtonClick(View view) {
        this.picFolder = String.valueOf(Const.DataFolder) + getPackageName() + Const.TargetPicFolder;
        if (!this.TR.DirExists(this.picFolder).booleanValue()) {
            this.TR.CreateDir(this.picFolder);
        }
        if (view.equals(this.button_start_camera)) {
            this.TR.StartCameraActivity(Const.idCameraActivity, this.picFolder, this.tmpCaptured);
        }
        if (view.equals(this.button_start_gallery)) {
            this.TR.StartGalleryActivity(Const.idGalleryActivity);
        }
        if (view.equals(this.button_clear)) {
            this.Trigger.SetProperty(this.TR.GetSharedString(Const.BackgroundPointer), "");
            this.TR.DefFilePath(this.picFolder, this.TR.GetSharedString(Const.BackgroundFileName)).delete();
            finish();
        }
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
