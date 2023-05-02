package com.mod2.dp;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TCheckBoxMod;
import com.mod2.libs.TTrigger;

public class CheckBoxShowDP extends TCheckBoxMod {
    private TTrigger Trigger;

    public CheckBoxShowDP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
    }

    public void onSwitchOFF() {
        this.Trigger.SetProperty("HideShowDP.Visibled", (Boolean) false);
    }

    public void onSwitchON() {
        this.Trigger.SetProperty("HideShowDP.Visibled", (Boolean) true);
    }
}
