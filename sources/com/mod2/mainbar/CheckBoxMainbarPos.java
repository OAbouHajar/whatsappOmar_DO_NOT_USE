package com.mod2.mainbar;

import android.content.Context;
import android.util.AttributeSet;
import com.mod2.libs.TCheckBoxMod;
import com.mod2.libs.TTrigger;

public class CheckBoxMainbarPos extends TCheckBoxMod {
    private TTrigger Trigger;

    public CheckBoxMainbarPos(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
        this.Trigger = new TTrigger(context, (TTrigger.OnTriggerEvent) null);
    }

    public void onSwitchOFF() {
        this.Trigger.SetProperty("MainTabBar.LayoutTop", (Boolean) true);
        this.Trigger.SetProperty("WPMainTabBar.LayoutTop", (Boolean) false);
        this.Trigger.SetProperty("MainFrame.LayoutBelowAboveOf", "layout_maintab|layout_wp_maintab");
    }

    public void onSwitchON() {
        this.Trigger.SetProperty("MainTabBar.LayoutTop", (Boolean) false);
        this.Trigger.SetProperty("WPMainTabBar.LayoutTop", (Boolean) true);
        this.Trigger.SetProperty("MainFrame.LayoutBelowAboveOf", "layout_wp_maintab|layout_maintab");
    }
}
