package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.mod2.libs.TTrigger;

public abstract class TButtonMod extends Button implements TTrigger.OnTriggerEvent, View.OnClickListener {
    private TTR TR;
    private TTRLabel TRLabel;
    private TTrigger Trigger;
    private String idDeliverData;
    private String idDeliverText;
    private String idOwner;

    public TButtonMod(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRLabel = new TTRLabel(context, (View) this, "TButton", this.Trigger);
            this.TR = new TTR(context);
            this.idOwner = this.TR.GetOwner(this);
            this.idDeliverText = String.valueOf(this.idOwner) + ".DeliverText";
            this.idDeliverData = String.valueOf(this.idOwner) + ".DeliverData";
            this.Trigger.setOnTriggerEvent(this.idDeliverText);
            this.Trigger.setOnTriggerEvent(this.idDeliverData);
            setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        onClick(this.idOwner);
    }

    public abstract void onClick(String str);

    public abstract void onDeliverData(String str, byte[] bArr);

    public abstract void onDeliverText(String str, String str2);

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
        if (str.equals(this.idDeliverText)) {
            onDeliverText(str, this.TR.GetSharedString(this.idDeliverText));
        }
        if (str.equals(this.idDeliverData)) {
            onDeliverData(str, this.TR.GetSharedData(this.idDeliverData));
        }
    }
}
