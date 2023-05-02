package com.mod.libs;

import android.content.Context;
import android.widget.ImageView;

public class TTRImage {
    private TTR TR = new TTR(this.context);
    private Context context;
    private String idReqData;
    private ImageView imageView;
    private TTrigger thisTrigger;

    public TTRImage(Context context2, ImageView imageView2, Object obj, TTrigger tTrigger) {
        this.context = context2;
        this.thisTrigger = tTrigger;
        this.imageView = imageView2;
        InitImage(this.TR.GetOwner(obj));
    }

    public void DoTrigger(String str) {
        if (str.equals(this.idReqData)) {
            this.thisTrigger.SetProperty(String.valueOf(this.TR.GetSharedString(this.idReqData)) + ".DeliverData", this.TR.ImageToArray(this.imageView));
        }
    }

    public void InitImage(String str) {
        this.idReqData = String.valueOf(str) + ".ReqData";
        this.thisTrigger.setOnTriggerEvent(this.idReqData);
    }
}
