package com.obwhatsapp.status.playback.widget;

import X.C95474mh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.obwhatsapp.collections.MarginCorrectedViewPager;

public class StatusPlaybackPager extends MarginCorrectedViewPager {
    public boolean A00;
    public boolean A01;

    public StatusPlaybackPager(Context context) {
        super(context);
        A0O();
        this.A01 = true;
        A0H(new C95474mh(), true);
    }

    public StatusPlaybackPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
        this.A01 = true;
        A0H(new C95474mh(), true);
    }

    public StatusPlaybackPager(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A0O();
    }

    public void A0O() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A01 || (motionEvent.getPointerCount() > 1 && motionEvent.getActionMasked() == 2)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            if (i4 != 0 || i5 != 0) {
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    getChildAt(i6).setRotation(0.0f);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A01) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setScrollEnabled(boolean z2) {
        this.A01 = z2;
    }
}
