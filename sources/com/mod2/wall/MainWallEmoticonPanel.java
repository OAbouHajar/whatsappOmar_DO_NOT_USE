package com.mod2.wall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bbm.ui.EmoticonPanelViewLayout;
import com.mod2.libs.TTRPanel;
import com.mod2.libs.TTrigger;

public class MainWallEmoticonPanel extends EmoticonPanelViewLayout implements TTrigger.OnTriggerEvent {
    private TTRPanel TRPanel;
    private TTrigger Trigger;

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.mod2.wall.MainWallEmoticonPanel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public MainWallEmoticonPanel(Context context) {
        super(context, (AttributeSet) null);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, "MainWall", (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.mod2.wall.MainWallEmoticonPanel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public MainWallEmoticonPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, "MainWall", (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.mod2.wall.MainWallEmoticonPanel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public MainWallEmoticonPanel(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, "MainWall", (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, com.mod2.wall.MainWallEmoticonPanel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public MainWallEmoticonPanel(Context context, AttributeSet attributeSet, Boolean bool) {
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
