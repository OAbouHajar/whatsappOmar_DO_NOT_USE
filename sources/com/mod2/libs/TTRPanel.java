package com.mod2.libs;

import android.content.Context;
import android.view.View;
import com.mod2.libs.TTrigger;

public class TTRPanel implements TTrigger.OnTriggerEvent {
    public Boolean SharedContainExist;
    private TTR TR = new TTR(this.context);
    private TTrigger Trigger;
    private Context context;
    private boolean fVisible;
    private String idBackground;
    private String idColBackground;
    private String idLayoutAboveOf;
    private String idLayoutBelowAboveOf;
    private String idLayoutBelowOf;
    private String idLayoutTop;
    private String idOwner;
    private String idResBackground;
    private String idVisibled;
    private View view;

    public TTRPanel(Context context2, View view2, Object obj, Boolean bool) {
        this.context = context2;
        this.view = view2;
        this.Trigger = new TTrigger(context2, this);
        this.idOwner = this.TR.GetOwner(obj);
        this.fVisible = bool.booleanValue();
    }

    public TTRPanel(Context context2, View view2, String str, Boolean bool) {
        this.context = context2;
        this.view = view2;
        this.Trigger = new TTrigger(context2, this);
        this.idOwner = str;
        this.fVisible = bool.booleanValue();
    }

    public void DoTrigger(String str) {
        if (str.equals(this.idVisibled)) {
            this.TR.SetVisibledProp(this.view, this.idVisibled);
        }
        if (str.equals(this.idBackground)) {
            this.TR.ClearSharedContains(this.idColBackground);
            this.TR.SetBackgroundProp(this.view, this.idBackground);
        }
        if (str.equals(this.idColBackground)) {
            this.TR.ClearSharedContains(this.idBackground);
            this.TR.SetColBackgroundProp(this.view, this.idColBackground);
        }
        if (str.equals(this.idResBackground)) {
            this.TR.ClearSharedContains(this.idBackground);
            this.TR.ClearSharedContains(this.idColBackground);
            this.TR.SetResBackgroundProp(this.view, this.idResBackground);
        }
        if (str.equals(this.idLayoutTop)) {
            this.TR.SetViewTopProp(this.view, this.idLayoutTop);
        }
        if (str.equals(this.idLayoutAboveOf)) {
            this.TR.SetViewAboveOfProp(this.view, this.idLayoutAboveOf, this.idLayoutBelowOf);
        }
        if (str.equals(this.idLayoutBelowOf)) {
            this.TR.SetViewBelowOfProp(this.view, this.idLayoutBelowOf, this.idLayoutAboveOf);
        }
        if (str.equals(this.idLayoutBelowAboveOf)) {
            this.TR.SetViewBelowAboveOfProp(this.view, this.idLayoutBelowAboveOf);
        }
    }

    public TTrigger InitPanel(TTrigger tTrigger) {
        this.idVisibled = String.valueOf(this.idOwner) + ".Visibled";
        this.idBackground = String.valueOf(this.idOwner) + ".Background";
        this.idResBackground = String.valueOf(this.idOwner) + ".ResBackground";
        this.idColBackground = String.valueOf(this.idOwner) + ".ColBackground";
        this.idLayoutTop = String.valueOf(this.idOwner) + ".LayoutTop";
        this.idLayoutAboveOf = String.valueOf(this.idOwner) + ".LayoutAboveOf";
        this.idLayoutBelowOf = String.valueOf(this.idOwner) + ".LayoutBelowOf";
        this.idLayoutBelowAboveOf = String.valueOf(this.idOwner) + ".LayoutBelowAboveOf";
        tTrigger.setOnTriggerEvent(this.idVisibled);
        tTrigger.setOnTriggerEvent(this.idBackground);
        tTrigger.setOnTriggerEvent(this.idResBackground);
        tTrigger.setOnTriggerEvent(this.idColBackground);
        tTrigger.setOnTriggerEvent(this.idLayoutTop);
        tTrigger.setOnTriggerEvent(this.idLayoutAboveOf);
        tTrigger.setOnTriggerEvent(this.idLayoutBelowOf);
        tTrigger.setOnTriggerEvent(this.idLayoutBelowAboveOf);
        this.SharedContainExist = this.TR.GetSharedContains(this.idVisibled);
        if (this.SharedContainExist.booleanValue()) {
            this.TR.SetVisibledProp(this.view, this.idVisibled);
        } else {
            this.TR.SetSharedBool(this.idVisibled, Boolean.valueOf(this.fVisible));
            this.TR.SetVisibledView(this.view, this.fVisible);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idBackground);
        if (this.SharedContainExist.booleanValue()) {
            this.TR.SetBackgroundProp(this.view, this.idBackground);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idColBackground);
        if (this.SharedContainExist.booleanValue()) {
            this.TR.SetColBackgroundProp(this.view, this.idColBackground);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idLayoutTop);
        if (this.SharedContainExist.booleanValue()) {
            this.Trigger.DoFireUp("OnLayerTop", 1);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idLayoutAboveOf);
        if (this.SharedContainExist.booleanValue()) {
            this.Trigger.DoFireUp("OnLayerAboveOf", 1);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idLayoutBelowOf);
        if (this.SharedContainExist.booleanValue()) {
            this.Trigger.DoFireUp("OnLayerBelowOf", 1);
        }
        this.SharedContainExist = this.TR.GetSharedContains(this.idLayoutBelowAboveOf);
        if (this.SharedContainExist.booleanValue()) {
            this.Trigger.DoFireUp("OnLayerBelowAboveOf", 1);
        }
        return tTrigger;
    }

    public void onTriggered(String str) {
        if (str.equals("OnLayerTop")) {
            this.TR.SetViewTopProp(this.view, this.idLayoutTop);
        }
        if (str.equals("OnLayerAboveOf")) {
            this.TR.SetViewAboveOfProp(this.view, this.idLayoutAboveOf, this.idLayoutBelowOf);
        }
        if (str.equals("OnLayerBelowOf")) {
            this.TR.SetViewBelowOfProp(this.view, this.idLayoutBelowOf, this.idLayoutAboveOf);
        }
        if (str.equals("OnLayerBelowAboveOf")) {
            this.TR.SetViewBelowAboveOfProp(this.view, this.idLayoutBelowAboveOf);
        }
    }
}
