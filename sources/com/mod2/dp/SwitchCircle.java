package com.mod2.dp;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TSwitchMod;
import com.mod2.libs.TTrigger;

public class SwitchCircle extends TSwitchMod {
    private TTrigger Trigger;

    public SwitchCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
    }

    public void onSwitchOFF() {
        this.Trigger.SetProperty("TImage.Circle", (Boolean) false);
    }

    public void onSwitchON() {
        this.Trigger.SetProperty("TImage.Circle", (Boolean) true);
    }
}
