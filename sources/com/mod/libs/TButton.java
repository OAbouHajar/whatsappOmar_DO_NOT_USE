package com.mod.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.mod.libs.TTrigger;

public class TButton extends Button implements TTrigger.OnTriggerEvent {
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    public TButton(Context context, AttributeSet attributeSet) {
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
