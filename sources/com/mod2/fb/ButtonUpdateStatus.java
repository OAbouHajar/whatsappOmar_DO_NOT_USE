package com.mod2.fb;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.Const;
import com.mod2.libs.TButtonMod;
import com.mod2.libs.TTR;
import com.mod2.libs.TTrigger;

public class ButtonUpdateStatus extends TButtonMod {
    private String DescriptionStr;
    private TTR TR = new TTR(this.context);
    private TTrigger Trigger = new TTrigger(this.context, (TTrigger.OnTriggerEvent) null);
    private Context context;

    public ButtonUpdateStatus(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
    }

    public void onClick(String str) {
        this.Trigger.SetProperty("EditStatus.ReqText", str);
    }

    public void onDeliverData(String str, byte[] bArr) {
        this.TR.SetSharedString(Const.PhotoDescription, this.DescriptionStr);
        this.TR.SetSharedData(Const.PhotoToUpload, bArr);
        this.TR.StartActivity(UpdateStatusActivity.class);
        this.TR.Halt();
    }

    public void onDeliverText(String str, String str2) {
        this.DescriptionStr = str2;
        this.Trigger.SetProperty("AvatarView.ReqData", this.TR.GetOwner(this));
    }
}
