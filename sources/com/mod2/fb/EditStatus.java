package com.mod2.fb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bbm.ui.SendEditText;
import com.mod2.libs.TTREdit;
import com.mod2.libs.TTRLabel;
import com.mod2.libs.TTrigger;

public class EditStatus extends SendEditText implements TTrigger.OnTriggerEvent {
    private TTREdit TREdit;
    private TTRLabel TRLabel;
    private TTrigger Trigger;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.mod2.fb.EditStatus, android.view.View, java.lang.Object, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public EditStatus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRLabel = new TTRLabel(context, (View) this, "TEdit", this.Trigger);
            this.TREdit = new TTREdit(context, this, this, this.Trigger);
        }
    }

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
        this.TREdit.DoTrigger(str);
    }
}
