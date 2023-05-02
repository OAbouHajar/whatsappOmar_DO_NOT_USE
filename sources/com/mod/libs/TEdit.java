package com.mod.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.mod.libs.TTrigger;

public class TEdit extends EditText implements TTrigger.OnTriggerEvent {
    private TTREdit TREdit;
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    public TEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Trigger = new TTrigger(context, this);
        this.TRLabel = new TTRLabel(context, (View) this, (Object) this, this.Trigger);
        this.TREdit = new TTREdit(context, this, this, this.Trigger);
    }

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
        this.TREdit.DoTrigger(str);
    }
}
