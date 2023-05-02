package com.mod2.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mod2.libs.Const;
import com.mod2.libs.TTR;

public class ViewPopup extends View {
    private TTR TR;

    public ViewPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TR = new TTR(context);
        if (isInEditMode()) {
            return;
        }
        if (this.TR.FreshSharedVar(Const.PopupNotif).booleanValue() || this.TR.GetSharedBool(Const.PopupNotif).booleanValue()) {
            this.TR.StartService(PopupService.class);
        }
    }
}
