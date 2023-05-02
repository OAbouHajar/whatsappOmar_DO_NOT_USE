package com.mod2.mainbar;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TTrackBar;
import com.mod2.libs.TTrigger;

public class TrackBarFontSize extends TTrackBar {
    private TTrigger Trigger;

    public TrackBarFontSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 50, 20);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
        SetPosition(Const.TrackBarDef);
    }

    public void onChange(String str, int i2) {
        this.Trigger.SetProperty("LabelFontSize.Caption", String.valueOf(i2));
        this.Trigger.SetProperty("TextMainbar.Size", i2);
    }

    public void onStart(String str) {
    }

    public void onStop(String str) {
    }
}
