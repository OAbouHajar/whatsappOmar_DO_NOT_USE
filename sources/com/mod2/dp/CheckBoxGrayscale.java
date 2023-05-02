package com.mod2.dp;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TCheckBoxMod;
import com.mod2.libs.TTrigger;

public class CheckBoxGrayscale extends TCheckBoxMod {
    private TTrigger Trigger;

    public CheckBoxGrayscale(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
    }

    public void onSwitchOFF() {
        this.Trigger.SetProperty("TImage.Grayscale", (Boolean) false);
    }

    public void onSwitchON() {
        this.Trigger.SetProperty("TImage.Grayscale", (Boolean) true);
    }
}
