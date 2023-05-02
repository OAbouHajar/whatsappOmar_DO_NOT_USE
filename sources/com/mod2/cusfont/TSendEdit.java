package com.mod2.cusfont;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bbm.ui.SendEditText;
import com.mod2.libs.TTRLabel;
import com.mod2.libs.TTrigger;

public class TSendEdit extends SendEditText implements TTrigger.OnTriggerEvent {
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.mod2.cusfont.TSendEdit, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public TSendEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Trigger = new TTrigger(context, this);
        this.TRLabel = new TTRLabel(context, (View) this, "TEdit", this.Trigger);
    }

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
    }
}
