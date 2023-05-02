package com.mod.libs;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.ArrayList;

public class TTRCheckBox {
    private TTR TR;
    private View.OnClickListener TextViewOnClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            for (int i2 = 0; i2 < TTRCheckBox.this.arrCheckBox.size(); i2++) {
                if (view.equals(TTRCheckBox.this.arrTextView.get(i2))) {
                    ((CheckBox) TTRCheckBox.this.arrCheckBox.get(i2)).performClick();
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public ArrayList<CheckBox> arrCheckBox;
    /* access modifiers changed from: private */
    public ArrayList<TextView> arrTextView;
    public CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            TTRCheckBox.this.thisOnCheckBoxClickEvent.onCheckBoxClick(compoundButton, z2);
        }
    };
    public CompoundButton thisCheckBox;
    /* access modifiers changed from: private */
    public OnCheckBoxClickEvent thisOnCheckBoxClickEvent;

    public interface OnCheckBoxClickEvent {
        void onCheckBoxClick(CompoundButton compoundButton, boolean z2);
    }

    public TTRCheckBox(Context context, OnCheckBoxClickEvent onCheckBoxClickEvent) {
        this.TR = new TTR(context);
        this.thisOnCheckBoxClickEvent = onCheckBoxClickEvent;
        CreateCheckBoxArray();
    }

    public void CreateCheckBoxArray() {
        this.arrTextView = new ArrayList<>();
        this.arrCheckBox = new ArrayList<>();
    }

    public CheckBox DoInitCheckBox(CheckBox checkBox, String str, boolean z2) {
        checkBox.setTag(str);
        String str2 = String.valueOf(str) + ".Checked";
        if (this.TR.GetSharedContains(str2)) {
            checkBox.setChecked(this.TR.GetSharedBool(str2).booleanValue());
        } else {
            checkBox.setChecked(z2);
            this.TR.SetSharedBool(str2, Boolean.valueOf(z2));
        }
        checkBox.setOnCheckedChangeListener(this.onCheckedChangeListener);
        return checkBox;
    }

    public CheckBox InitCheckBox(String str, String str2, boolean z2) {
        TextView textView = (TextView) this.TR.InitChildView(str, "setting_label");
        textView.setText(str2);
        CheckBox checkBox = (CheckBox) this.TR.InitChildView(str, "setting_compound_button");
        this.arrTextView.add(textView);
        textView.setOnClickListener(this.TextViewOnClickListener);
        this.arrCheckBox.add(checkBox);
        return DoInitCheckBox(checkBox, str, z2);
    }

    public CheckBox InitCheckBox(String str, boolean z2) {
        return DoInitCheckBox((CheckBox) this.TR.InitView(str), str, z2);
    }

    public void SetCheckBoxCheckedFlag(CompoundButton compoundButton, boolean z2) {
        this.TR.SetSharedBool(String.valueOf((String) compoundButton.getTag()) + ".Checked", Boolean.valueOf(z2));
    }

    public boolean SwitchOff(View view) {
        return this.thisCheckBox.equals(view);
    }

    public boolean SwitchOn(View view) {
        return this.thisCheckBox.equals(view);
    }
}
