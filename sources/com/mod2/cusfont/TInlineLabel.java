package com.mod2.cusfont;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bbm.ui.InlineImageTextView;
import com.mod2.libs.TTRLabel;
import com.mod2.libs.TTrigger;

public class TInlineLabel extends InlineImageTextView implements TTrigger.OnTriggerEvent {
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, java.lang.Object, com.mod2.cusfont.TInlineLabel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public TInlineLabel(Context context) {
        super(context);
        this.Trigger = new TTrigger(context, this);
        this.TRLabel = new TTRLabel(context, (View) this, (Object) this, this.Trigger);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, java.lang.Object, com.mod2.cusfont.TInlineLabel, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public TInlineLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Trigger = new TTrigger(context, this);
        this.TRLabel = new TTRLabel(context, (View) this, (Object) this, this.Trigger);
    }

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
    }
}
