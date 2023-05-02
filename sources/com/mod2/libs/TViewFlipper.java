package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewFlipper;
import com.mod2.libs.TTrigger;

public class TViewFlipper extends ViewFlipper implements TTrigger.OnTriggerEvent {
    private TTRPanel TRPanel;
    private TTrigger Trigger;

    public TViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, (Object) this, (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    public TViewFlipper(Context context, AttributeSet attributeSet, Boolean bool) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, (Object) this, bool);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
    }
}
