package com.mod.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.mod.libs.TTrigger;

public abstract class TSwitchMod extends Switch implements TTrigger.OnTriggerEvent, CompoundButton.OnCheckedChangeListener {
    private TTR TR;
    private TTRLabel TRLabel;
    private TTrigger Trigger;
    private String idChecked;
    public String idOwner;

    public TSwitchMod(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRLabel = new TTRLabel(context, (View) this, "TSwitch", this.Trigger);
            InitSwitch(context, false, this, this);
        }
    }

    public TSwitchMod(Context context, AttributeSet attributeSet, Boolean bool) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.Trigger = new TTrigger(context, this);
            this.TRLabel = new TTRLabel(context, (View) this, "TSwitch", this.Trigger);
            InitSwitch(context, bool, this, this);
        }
    }

    public void InitSwitch(Context context, Boolean bool, Object obj, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.TR = new TTR(context);
        this.idOwner = this.TR.GetOwner(obj);
        this.idChecked = String.valueOf(this.idOwner) + ".Checked";
        if (Boolean.valueOf(this.TR.GetSharedContains(this.idChecked)).booleanValue()) {
            setChecked(this.TR.GetSharedBool(this.idChecked).booleanValue());
        } else {
            setChecked(bool.booleanValue());
            this.TR.SetSharedBool(this.idChecked, bool);
        }
        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        if (z2) {
            this.TR.SetSharedBool(this.idChecked, true);
            onSwitchON();
            return;
        }
        this.TR.SetSharedBool(this.idChecked, false);
        onSwitchOFF();
    }

    public abstract void onSwitchOFF();

    public abstract void onSwitchON();

    public void onTriggered(String str) {
        this.TRLabel.DoTrigger(str);
    }
}
