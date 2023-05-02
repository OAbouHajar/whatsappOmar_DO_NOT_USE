package com.mod2.libs;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class TTRLabel {
    private Boolean SharedContainExist;
    private TTR TR = new TTR(this.context);
    private Context context;
    private String idCaption;
    private String idColor;
    private String idFont;
    private String idResColor;
    private String idSize;
    private TTrigger thisTrigger;
    private View view;

    public TTRLabel(Context context2, View view2, Object obj, TTrigger tTrigger) {
        this.context = context2;
        this.view = view2;
        this.thisTrigger = tTrigger;
        InitLabel(view2, this.TR.GetOwner(obj));
    }

    public TTRLabel(Context context2, View view2, String str, TTrigger tTrigger) {
        this.context = context2;
        this.view = view2;
        this.thisTrigger = tTrigger;
        InitLabel(view2, str);
    }

    public void DoTrigger(String str) {
        if (str.equals(this.idCaption)) {
            ((TextView) this.view).setText(this.TR.GetSharedString(this.idCaption));
        }
        if (str.equals(this.idSize)) {
            ((TextView) this.view).setTextSize((float) this.TR.GetSharedInteger(this.idSize));
        }
        if (str.equals(this.idFont)) {
            this.TR.SetFonts(this.view, this.TR.GetSharedString(this.idFont));
        }
        if (str.equals(this.idColor)) {
            ((TextView) this.view).setTextColor(this.TR.GetSharedInteger(this.idColor));
        }
        if (str.equals(this.idResColor)) {
            this.TR.ClearSharedContains(this.idColor);
            ((TextView) this.view).setTextColor(this.TR.GetColorFromRes(this.TR.GetSharedString(this.idResColor)));
        }
    }

    public void InitLabel(View view2, String str) {
        this.idCaption = String.valueOf(str) + ".Caption";
        this.idSize = String.valueOf(str) + ".Size";
        this.idFont = String.valueOf(str) + ".Font";
        this.idColor = String.valueOf(str) + ".Color";
        this.idResColor = String.valueOf(str) + ".ResColor";
        this.thisTrigger.setOnTriggerEvent(this.idCaption);
        this.thisTrigger.setOnTriggerEvent(this.idSize);
        this.thisTrigger.setOnTriggerEvent(this.idFont);
        this.thisTrigger.setOnTriggerEvent(this.idColor);
        this.thisTrigger.setOnTriggerEvent(this.idResColor);
        this.SharedContainExist = this.TR.GetSharedContains(this.idCaption);
        if (this.SharedContainExist.booleanValue()) {
            ((TextView) this.view).setText(this.TR.GetSharedString(this.idCaption));
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idSize);
        if (this.SharedContainExist.booleanValue()) {
            ((TextView) this.view).setTextSize((float) this.TR.GetSharedInteger(this.idSize));
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idColor);
        if (this.SharedContainExist.booleanValue()) {
            ((TextView) this.view).setTextColor(this.TR.GetSharedInteger(this.idColor));
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idFont);
        if (this.SharedContainExist.booleanValue()) {
            this.TR.SetFonts(this.view, this.TR.GetSharedString(this.idFont));
        }
    }
}
