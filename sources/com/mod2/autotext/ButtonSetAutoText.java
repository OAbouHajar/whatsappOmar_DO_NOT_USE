package com.mod2.autotext;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.EditText;
import com.assem.Cint;
import com.mod2.libs.TImageMod;
import com.mod2.libs.TTR;

public class ButtonSetAutoText extends TImageMod implements DialogInterface.OnClickListener {
    private TTR TR;
    private EditText editAutoText;

    public ButtonSetAutoText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TR = new TTR(context);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            this.TR.SetSharedString("AutoText", this.TR.GetEditText(this.editAutoText));
        }
    }

    public void onClick(String str) {
        this.editAutoText = this.TR.ShowInputDlg(Cint.getString("set_auto_text"), this.editAutoText, this.TR.GetSharedString("AutoText"), Cint.getString("save"), Cint.getString("cancel"), this);
    }

    public void onPushOFF(String str) {
    }

    public void onPushON(String str) {
    }
}
