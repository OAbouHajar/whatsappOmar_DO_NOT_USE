package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mod2.libs.TTrigger;

public class TLabel extends TextView implements TTrigger.OnTriggerEvent {
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    public TLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRLabel = new TTRLabel(context, (View) this, (Object) this, this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
    }
}
