package com.obwhatsapp;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class BottomSheetListView extends ListView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public BottomSheetListView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 0);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public boolean A00() {
        if (getChildCount() > 0) {
            return (getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0 && getLastVisiblePosition() != getChildCount()) ? false : true;
        }
        return false;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (A00()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
