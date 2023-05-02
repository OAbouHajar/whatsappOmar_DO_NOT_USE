package com.mod2.popup;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TCheckBoxMod;
import com.mod2.libs.TTR;

public class CheckBoxPopupNotif extends TCheckBoxMod {
    private TTR TR;

    public CheckBoxPopupNotif(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        this.TR = new TTR(context);
    }

    public void onSwitchOFF() {
        this.TR.StopService(Const.PopupService);
    }

    public void onSwitchON() {
        this.TR.StartService(PopupService.class);
    }
}
