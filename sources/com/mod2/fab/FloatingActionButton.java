package com.mod2.fab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mod2.libs.TTRPanel;
import com.mod2.libs.TTrigger;

public class FloatingActionButton extends com.bbm.ui.FloatingActionButton implements TTrigger.OnTriggerEvent {
    private TTRPanel TRPanel;
    private TTrigger Trigger;
    private Context context;

    public FloatingActionButton(Context context2) {
        super(context2);
        this.context = context2;
        InitView();
    }

    public FloatingActionButton(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        InitView();
    }

    public FloatingActionButton(Context context2, AttributeSet attributeSet, int i2) {
        super(context2, attributeSet, i2);
        this.context = context2;
        InitView();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, java.lang.Object, com.mod2.fab.FloatingActionButton, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public void InitView() {
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(this.context, this);
            this.TRPanel = new TTRPanel(this.context, (View) this, (Object) this, (Boolean) false);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
    }
}
