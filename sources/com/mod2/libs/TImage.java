package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mod2.libs.TTrigger;

public class TImage extends ImageView implements TTrigger.OnTriggerEvent {
    private TTRPanel TRPanel;
    private TTrigger Trigger;

    public TImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Trigger = new TTrigger(context, this);
        this.TRPanel = new TTRPanel(context, (View) this, (Object) this, (Boolean) true);
        this.TRPanel.InitPanel(this.Trigger);
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
    }
}
