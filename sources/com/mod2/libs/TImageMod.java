package com.mod2.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mod2.libs.TTrigger;

public abstract class TImageMod extends ImageView implements View.OnClickListener, TTrigger.OnTriggerEvent {
    private TTR TR;
    private TTRImage TRImage;
    private TTRPanel TRPanel;
    private TTrigger Trigger;
    private String idOwner;
    private String idState;

    public TImageMod(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRPanel = new TTRPanel(context, (View) this, (Object) this, (Boolean) true);
            this.TRPanel.InitPanel(this.Trigger);
            this.TRImage = new TTRImage(context, this, this, this.Trigger);
            this.TR = new TTR(context);
            this.idOwner = this.TR.GetOwner(this);
            this.idState = String.valueOf(this.idOwner) + ".State";
            this.Trigger.setOnTriggerEvent(this.idState);
            SetButtonState();
            setOnClickListener(this);
        }
    }

    public void DoPushOFF() {
        this.Trigger.SetProperty(this.idState, (Boolean) false);
    }

    public void DoPushON() {
        this.Trigger.SetProperty(this.idState, (Boolean) true);
    }

    public void SetButtonState() {
        if (!this.TR.GetSharedBool(this.idState).booleanValue()) {
            setSelected(false);
        } else {
            setSelected(true);
        }
    }

    public void onClick(View view) {
        onClick(this.idOwner);
        if (!this.TR.GetSharedBool(this.idState).booleanValue()) {
            onPushON(this.idOwner);
        } else {
            onPushOFF(this.idOwner);
        }
    }

    public abstract void onClick(String str);

    public abstract void onPushOFF(String str);

    public abstract void onPushON(String str);

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
        if (str.equals(this.idState)) {
            SetButtonState();
        }
        this.TRImage.DoTrigger(str);
    }
}
