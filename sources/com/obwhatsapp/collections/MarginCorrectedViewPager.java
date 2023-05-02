package com.obwhatsapp.collections;

import X.C54682i0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.util.Log;

public class MarginCorrectedViewPager extends C54682i0 {
    public boolean A00;

    public MarginCorrectedViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    public MarginCorrectedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            Log.e("Exception while intercepting touch event", e2);
            return false;
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = this.A0K;
        super.onSizeChanged(i2 - i6, i3, i4 - i6, i5);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollEnabled(boolean z2) {
        this.A00 = z2;
    }
}
