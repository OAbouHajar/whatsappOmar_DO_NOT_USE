package com.mod2.fab;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TCheckBoxMod;
import com.mod2.libs.TTrigger;

public class CheckBoxFAB extends TCheckBoxMod {
    private TTrigger Trigger;

    public CheckBoxFAB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
    }

    public void onSwitchOFF() {
        this.Trigger.SetProperty("FloatingActionButton.Visibled", (Boolean) false);
    }

    public void onSwitchON() {
        this.Trigger.SetProperty("FloatingActionButton.Visibled", (Boolean) true);
    }
}
