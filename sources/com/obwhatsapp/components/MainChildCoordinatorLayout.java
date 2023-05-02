package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MainChildCoordinatorLayout extends CoordinatorLayout implements AnonymousClass006 {
    public int A00;
    public C52662eE A01;
    public boolean A02;

    public MainChildCoordinatorLayout(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0C);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0C);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public boolean A0I(View view, int i2, int i3) {
        return (view != null && view.getId() == this.A00) || super.A0I(view, i2, i3);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
