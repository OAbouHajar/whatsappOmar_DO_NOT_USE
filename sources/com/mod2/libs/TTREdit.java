package com.mod2.libs;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

public class TTREdit {
    private Boolean SharedContainExist;
    private TTR TR = new TTR(this.context);
    private Context context;
    private String idOwner;
    private String idReqText;
    private String idText;
    private TTrigger thisTrigger;
    private View view;

    public TTREdit(Context context2, View view2, Object obj, TTrigger tTrigger) {
        this.context = context2;
        this.view = view2;
        this.thisTrigger = tTrigger;
        this.idOwner = this.TR.GetOwner(obj);
        this.idReqText = String.valueOf(this.idOwner) + ".ReqText";
        this.idText = String.valueOf(this.idOwner) + ".Text";
        this.thisTrigger.setOnTriggerEvent(this.idReqText);
        this.thisTrigger.setOnTriggerEvent(this.idText);
        this.SharedContainExist = this.TR.GetSharedContains(this.idText);
        if (this.SharedContainExist.booleanValue()) {
            ((EditText) this.view).setText(this.TR.GetSharedString(this.idText));
        }
    }

    public void DoTrigger(String str) {
        if (str.equals(this.idReqText)) {
            this.thisTrigger.SetProperty(String.valueOf(this.TR.GetSharedString(this.idReqText)) + ".DeliverText", ((EditText) this.view).getText().toString().trim());
        }
        if (str.equals(this.idText)) {
            ((EditText) this.view).setText(this.TR.GetSharedString(this.idText));
        }
    }
}
