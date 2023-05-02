package com.mod2.wall;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TImageMod;
import com.mod2.libs.TTR;

public class ButtonMainWall extends TImageMod {
    private TTR TR = new TTR(this.context);
    private Context context;

    public ButtonMainWall(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
    }

    public void onClick(String str) {
        this.TR.SetSharedInteger(Const.BackgroundWidth, 540);
        this.TR.SetSharedInteger(Const.BackgroundHeight, 925);
        this.TR.SetSharedString(Const.BackgroundFileName, "background_main.jpg");
        this.TR.SetSharedString(Const.BackgroundPointer, "MainWall.Background");
        this.TR.StartActivity(BackgroundPickerActivity.class);
    }

    public void onPushOFF(String str) {
    }

    public void onPushON(String str) {
    }
}
