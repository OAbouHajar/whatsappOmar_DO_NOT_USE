package androidx.appcompat.widget;

import X.AnonymousClass06G;
import X.AnonymousClass097;
import X.AnonymousClass098;
import X.AnonymousClass0SH;
import X.C016607w;
import X.C13260lj;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public AnonymousClass098 A06;
    public final Rect A07;

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A07 = new Rect();
    }

    public void A00(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.A00;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A00 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.A01;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A01 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.A02;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A02 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.A03;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A03 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.A04;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A04 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.A05;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A05 = typedValue2;
        return typedValue2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass098 r0 = this.A06;
        if (r0 != null) {
            AnonymousClass06G r2 = ((AnonymousClass097) r0).A00;
            C13260lj r02 = r2.A0M;
            if (r02 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r02;
                actionBarOverlayLayout.A01();
                actionBarOverlayLayout.A0A.A85();
            }
            if (r2.A09 != null) {
                r2.A08.getDecorView().removeCallbacks(r2.A0P);
                if (r2.A09.isShowing()) {
                    try {
                        r2.A09.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r2.A09 = null;
            }
            AnonymousClass0SH r03 = r2.A0N;
            if (r03 != null) {
                r03.A01();
            }
            C016607w r04 = r2.A0L(0).A0A;
            if (r04 != null) {
                r04.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r6 = r0.getDisplayMetrics()
            int r1 = r6.widthPixels
            int r0 = r6.heightPixels
            r10 = 0
            if (r1 >= r0) goto L_0x0014
            r10 = 1
        L_0x0014:
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = 6
            r2 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x00d3
            if (r10 == 0) goto L_0x00cf
            android.util.TypedValue r8 = r11.A03
        L_0x0028:
            if (r8 == 0) goto L_0x00d3
            int r0 = r8.type
            if (r0 == 0) goto L_0x00d3
            if (r0 != r2) goto L_0x00c4
            float r0 = r8.getDimension(r6)
        L_0x0034:
            int r9 = (int) r0
            if (r9 <= 0) goto L_0x00d3
            android.graphics.Rect r0 = r11.A07
            int r8 = r0.left
            int r0 = r0.right
            int r8 = r8 + r0
            int r9 = r9 - r8
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = java.lang.Math.min(r9, r0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r9 = 1
        L_0x004c:
            if (r4 != r1) goto L_0x0075
            if (r10 == 0) goto L_0x00c1
            android.util.TypedValue r4 = r11.A00
        L_0x0052:
            if (r4 == 0) goto L_0x0075
            int r0 = r4.type
            if (r0 == 0) goto L_0x0075
            if (r0 != r2) goto L_0x00b7
            float r0 = r4.getDimension(r6)
        L_0x005e:
            int r8 = (int) r0
            if (r8 <= 0) goto L_0x0075
            android.graphics.Rect r0 = r11.A07
            int r4 = r0.top
            int r0 = r0.bottom
            int r4 = r4 + r0
            int r8 = r8 - r4
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = java.lang.Math.min(r8, r0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L_0x0075:
            super.onMeasure(r12, r13)
            int r4 = r11.getMeasuredWidth()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            if (r9 != 0) goto L_0x00a7
            if (r7 != r1) goto L_0x00a7
            if (r10 == 0) goto L_0x00b4
            android.util.TypedValue r1 = r11.A05
        L_0x0087:
            if (r1 == 0) goto L_0x00a7
            int r0 = r1.type
            if (r0 == 0) goto L_0x00a7
            if (r0 != r2) goto L_0x00a8
            float r0 = r1.getDimension(r6)
        L_0x0093:
            int r2 = (int) r0
            if (r2 <= 0) goto L_0x009e
            android.graphics.Rect r0 = r11.A07
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r2 = r2 - r1
        L_0x009e:
            if (r4 >= r2) goto L_0x00a7
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            super.onMeasure(r0, r13)
        L_0x00a7:
            return
        L_0x00a8:
            if (r0 != r5) goto L_0x00b2
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r1.getFraction(r0, r0)
            goto L_0x0093
        L_0x00b2:
            r2 = 0
            goto L_0x009e
        L_0x00b4:
            android.util.TypedValue r1 = r11.A04
            goto L_0x0087
        L_0x00b7:
            if (r0 != r5) goto L_0x0075
            int r0 = r6.heightPixels
            float r0 = (float) r0
            float r0 = r4.getFraction(r0, r0)
            goto L_0x005e
        L_0x00c1:
            android.util.TypedValue r4 = r11.A01
            goto L_0x0052
        L_0x00c4:
            if (r0 != r5) goto L_0x00d3
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r8.getFraction(r0, r0)
            goto L_0x0034
        L_0x00cf:
            android.util.TypedValue r8 = r11.A02
            goto L_0x0028
        L_0x00d3:
            r9 = 0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(AnonymousClass098 r1) {
        this.A06 = r1;
    }
}
