package com.google.android.material.bottomappbar;

import X.AnonymousClass000;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public final Rect A00 = new Rect();

    public BottomAppBar$Behavior() {
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* bridge */ /* synthetic */ boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
        throw AnonymousClass000.A0W("getHideOnScroll");
    }

    public /* bridge */ /* synthetic */ boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        throw AnonymousClass000.A0W("findDependentFab");
    }

    public /* bridge */ /* synthetic */ void A0I(View view) {
        super.A0I((View) null);
        throw AnonymousClass000.A0W("findDependentFab");
    }

    public /* bridge */ /* synthetic */ void A0J(View view) {
        super.A0J((View) null);
        throw AnonymousClass000.A0W("findDependentFab");
    }
}
