package com.mod2.wall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mod2.libs.TTRPanel;
import com.mod2.libs.TTrigger;

public class MainWallView extends View implements TTrigger.OnTriggerEvent {
    private TTRPanel TRPanel;
    private TTrigger Trigger;

    public MainWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, "MainWall", (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    public MainWallView(Context context, AttributeSet attributeSet, Boolean bool) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, "MainWall", bool);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
    }
}