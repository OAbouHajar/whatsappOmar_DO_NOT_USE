package com.mod2.blockread;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TCheckBoxMod;

public class CheckBoxBlockRead extends TCheckBoxMod {
    public CheckBoxBlockRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
    }

    public void onSwitchOFF() {
        System.exit(0);
    }

    public void onSwitchON() {
    }
}
