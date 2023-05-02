package com.mod2.pvmode;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.EditText;
import com.mod2.libs.Const;
import com.mod2.libs.TButtonMod;
import com.mod2.libs.TTR;

public class ButtonSetPasswd extends TButtonMod implements DialogInterface.OnClickListener {
    private TTR TR = new TTR(this.context);
    private Context context;
    private EditText edPasswd;

    public ButtonSetPasswd(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        setOnClickListener(this);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            String GetEditText = this.TR.GetEditText(this.edPasswd);
            this.TR.SetSharedString(Const.PrivateMode_Passwd, GetEditText);
            if (GetEditText.equals("")) {
                this.TR.ShowToast("You Are Unsave");
            } else {
                this.TR.ShowToast("Password has been set successfully");
            }
        }
    }

    public void onClick(String str) {
        this.edPasswd = this.TR.ShowInputPasswdDlg("Set Password", this.edPasswd, "Save", "Cancel", this);
    }

    public void onDeliverData(String str, byte[] bArr) {
    }

    public void onDeliverText(String str, String str2) {
    }
}
