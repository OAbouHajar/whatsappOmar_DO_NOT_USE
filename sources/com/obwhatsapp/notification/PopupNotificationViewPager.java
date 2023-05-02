package com.obwhatsapp.notification;

import X.AnonymousClass006;
import X.AnonymousClass012;
import X.AnonymousClass3TI;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class PopupNotificationViewPager extends ViewPager implements AnonymousClass006 {
    public C52662eE A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;

    public PopupNotificationViewPager(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A02 = true;
        this.A01 = null;
    }

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A02 = true;
        this.A01 = null;
    }

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    private int getCurrentOffsetBlocks() {
        if (getAdapter().A01() <= 0) {
            return 0;
        }
        AnonymousClass012 adapter = getAdapter();
        if (adapter instanceof AnonymousClass3TI) {
            return this.A0A / ((AnonymousClass3TI) adapter).A00.A01();
        }
        return 0;
    }

    private int getDefaultOffsetBlocks() {
        return (getAdapter().A01() <= 0 || !(getAdapter() instanceof AnonymousClass3TI)) ? 0 : 5;
    }

    public void A0F(int i2, boolean z2) {
        A0O(i2, z2, !z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if ((Integer.MAX_VALUE - r6) > r2) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(int r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            X.012 r0 = r5.getAdapter()
            int r0 = r0.A01()
            if (r0 <= 0) goto L_0x0039
            X.012 r1 = r5.getAdapter()
            boolean r0 = r1 instanceof X.AnonymousClass3TI
            if (r0 == 0) goto L_0x0039
            X.3TI r1 = (X.AnonymousClass3TI) r1
            X.012 r0 = r1.A00
            int r4 = r0.A01()
            if (r6 >= 0) goto L_0x0021
            r0 = -1
        L_0x001d:
            if (r6 >= 0) goto L_0x0025
            int r6 = r6 + r4
            goto L_0x001d
        L_0x0021:
            r0 = 0
            if (r6 < r4) goto L_0x0025
            r0 = 1
        L_0x0025:
            int r6 = r6 % r4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L_0x003d
            int r3 = r3 - r6
            int r0 = r5.getDefaultOffsetBlocks()
            int r0 = r0 * r4
            if (r3 <= r0) goto L_0x0039
            int r2 = r5.getDefaultOffsetBlocks()
            int r2 = r2 * r4
        L_0x0038:
            int r6 = r6 + r2
        L_0x0039:
            super.A0F(r6, r7)
            return
        L_0x003d:
            int r2 = r5.getCurrentOffsetBlocks()
            int r2 = r2 + r0
            X.012 r0 = r5.getAdapter()
            int r1 = r0.A01()
            X.012 r0 = r5.getAdapter()
            X.3TI r0 = (X.AnonymousClass3TI) r0
            X.012 r0 = r0.A00
            int r0 = r0.A01()
            int r1 = r1 / r0
            if (r2 < 0) goto L_0x005b
            if (r2 < r1) goto L_0x0060
        L_0x005b:
            int r2 = r5.getDefaultOffsetBlocks()
            r7 = 0
        L_0x0060:
            int r3 = r3 - r6
            int r2 = r2 * r4
            if (r3 <= r2) goto L_0x0039
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.notification.PopupNotificationViewPager.A0O(int, boolean, boolean):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public int getCurrentItem() {
        if (getAdapter().A01() > 0) {
            AnonymousClass012 adapter = getAdapter();
            if (adapter instanceof AnonymousClass3TI) {
                return this.A0A % ((AnonymousClass3TI) adapter).A00.A01();
            }
        }
        return this.A0A;
    }

    public void onAttachedToWindow() {
        this.A02 = true;
        super.onAttachedToWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass012 adapter = getAdapter();
        if (!(adapter instanceof AnonymousClass3TI) || ((AnonymousClass3TI) adapter).A00.A01() > 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A02 = false;
        Integer num = this.A01;
        if (num != null) {
            A0F(num.intValue(), true);
            this.A01 = null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass012 adapter = getAdapter();
        if (!(adapter instanceof AnonymousClass3TI) || ((AnonymousClass3TI) adapter).A00.A01() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAdapter(AnonymousClass012 r2) {
        this.A02 = true;
        super.setAdapter(r2);
    }

    public void setCurrentItem(int i2) {
        A0F(i2, false);
    }
}
