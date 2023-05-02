package com.mod2.dp;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TTrackBar;
import com.mod2.libs.TTrigger;

public class TrackBarCornerRadius extends TTrackBar {
    private TTrigger Trigger = new TTrigger(this.context, (TTrigger.OnTriggerEvent) null);
    private Context context;

    public TrackBarCornerRadius(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet, 100, 5);
        this.context = context2;
        SetPosition(Const.TrackBarRadiusDef);
    }

    public void onChange(String str, int i2) {
        this.Trigger.SetProperty("TImage.CornerRadius", i2);
    }

    public void onStart(String str) {
    }

    public void onStop(String str) {
    }
}
