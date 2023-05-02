package com.mod2.pvmode;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.EditText;
import com.mod2.libs.Const;
import com.mod2.libs.TImageMod;
import com.mod2.libs.TTR;
import com.mod2.libs.TTrigger;

public class ButtonHideShowMain extends TImageMod implements DialogInterface.OnClickListener {
    private TTR TR = new TTR(this.context);
    private TTrigger Trigger = new TTrigger(this.context, (TTrigger.OnTriggerEvent) null);
    private Context context;
    private EditText edPasswd;

    public ButtonHideShowMain(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            if (this.TR.CompareEdit(this.edPasswd, this.TR.GetSharedString(Const.PrivateMode_Passwd)).booleanValue()) {
                DoPushOFF();
                this.Trigger.SetProperty("HideShowMain.Visibled", (Boolean) true);
                return;
            }
            this.TR.ShowToast("Incorrect Password");
        }
    }

    public void onClick(String str) {
    }

    public void onPushOFF(String str) {
        if (this.TR.GetSharedString(Const.PrivateMode_Passwd).equals("")) {
            DoPushOFF();
            this.Trigger.SetProperty("HideShowMain.Visibled", (Boolean) true);
            return;
        }
        this.edPasswd = this.TR.ShowInputPasswdDlg("Input Password", this.edPasswd, "OK", "Cancel", this);
    }

    public void onPushON(String str) {
        DoPushON();
        this.Trigger.SetProperty("HideShowMain.Visibled", (Boolean) false);
    }
}
