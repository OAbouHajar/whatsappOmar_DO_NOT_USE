package com.obwhatsapp.wds.components.button;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass22K;
import X.AnonymousClass22L;
import X.AnonymousClass4B2;
import X.C11020i4;
import X.C13680ns;
import X.C16150sX;
import X.C18450wi;
import X.C52652eD;
import X.C52662eE;
import X.C54392hN;
import X.C797641e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1;

public final class WDSButtonGroup extends ViewGroup implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C797641e A01;
    public C797641e A02;
    public C52662eE A03;
    public boolean A04;
    public final List A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
        C797641e r4 = C797641e.AUTO;
        this.A02 = r4;
        this.A01 = C797641e.HORIZONTAL;
        this.A05 = new LinkedList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4B2.A01, 0, 0);
            C18450wi.A0B(obtainStyledAttributes);
            int i2 = obtainStyledAttributes.getInt(0, -1);
            C797641e[] values = C797641e.values();
            if (i2 >= 0) {
                C18450wi.A0H(values, 0);
                if (i2 <= values.length - 1) {
                    r4 = values[i2];
                }
            }
            setOrientationMode(r4);
            obtainStyledAttributes.recycle();
        }
    }

    public WDSButtonGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSButtonGroup(Context context, AttributeSet attributeSet, int i2, C54392hN r5) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C797641e getOrientationMode() {
        return this.A02;
    }

    public final AnonymousClass013 getWhatsAppLocale() {
        return this.A00;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        List list = this.A05;
        list.clear();
        AnonymousClass22L r1 = new AnonymousClass22L(new AnonymousClass22K(new IDxLambdaShape58S0000000_2_I1(5), new C11020i4(this), true));
        while (r1.hasNext()) {
            list.add(r1.next());
        }
        int size = list.size();
        if (size <= 2) {
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (size == 1) {
                ((View) list.remove(0)).layout(0, 0, i6, i7);
            } else if (size == 2) {
                View view = (View) list.remove(0);
                View view2 = (View) list.remove(0);
                if (this.A01 == C797641e.VERTICAL) {
                    int i8 = i7 >> 1;
                    view.layout(0, 0, i6, i8);
                    view2.layout(0, i8, i6, i7);
                    return;
                }
                int i9 = i6 >> 1;
                AnonymousClass013 r0 = this.A00;
                if (r0 == null || C13680ns.A1Z(r0)) {
                    view.layout(0, 0, i9, i7);
                    view2.layout(i9, 0, i6, i7);
                    return;
                }
                view.layout(i9, 0, i6, i7);
                view2.layout(0, 0, i9, i7);
            }
        } else {
            throw AnonymousClass000.A0V("WDSButtonGroup should not have more than 2 visible children!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if ((r8 << 1) > r6) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        r0 = X.C797641e.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r11.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (X.C11490ir.A00(r7) != 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        super.onMeasure(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r0 = X.C797641e.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r11.A01 != X.C797641e.A02) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r10 = r6 / X.C11490ir.A00(r7);
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, 1073741824);
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        r2 = new X.AnonymousClass22L(r7);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r2.hasNext() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r1 = (android.view.View) r2.next();
        measureChild(r1, r9, r3);
        r4 = java.lang.Math.max(r4, r1.getMeasuredHeight());
        r5 = android.view.ViewGroup.combineMeasuredStates(r5, r1.getMeasuredState());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r6, 1073741824);
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2 / X.C11490ir.A00(r7), r3);
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, 1073741824);
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, 1073741824);
        r1 = new X.AnonymousClass22L(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        if (r1.hasNext() == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        ((android.view.View) r1.next()).measure(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        if (r11.A01 != X.C797641e.A03) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r4 = r4 * X.C11490ir.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        setMeasuredDimension(android.view.ViewGroup.resolveSizeAndState(r6, r12, r5), android.view.ViewGroup.resolveSizeAndState(r4, r13, r5 << 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r12)
            int r6 = android.view.View.MeasureSpec.getSize(r12)
            int r3 = android.view.View.MeasureSpec.getMode(r13)
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            X.0i4 r4 = new X.0i4
            r4.<init>(r11)
            r0 = 6
            kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1 r1 = new kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1
            r1.<init>(r0)
            r0 = 1
            X.22K r7 = new X.22K
            r7.<init>(r1, r4, r0)
            int r1 = X.C11490ir.A00(r7)
            r0 = 2
            r4 = 0
            if (r1 > r0) goto L_0x00f7
            X.41e r0 = r11.A02
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0076;
                case 2: goto L_0x0068;
                default: goto L_0x0032;
            }
        L_0x0032:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0038:
            X.22L r9 = new X.22L
            r9.<init>(r7)
            r8 = 0
            r5 = 0
        L_0x003f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r9.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r12, r13)
            int r0 = r1.getMeasuredWidth()
            int r8 = java.lang.Math.max(r8, r0)
            r1.getMeasuredHeight()
            int r0 = r1.getMeasuredState()
            int r5 = android.view.ViewGroup.combineMeasuredStates(r5, r0)
            goto L_0x003f
        L_0x0062:
            if (r10 == 0) goto L_0x0076
            int r0 = r8 << 1
            if (r0 <= r6) goto L_0x0076
        L_0x0068:
            X.41e r0 = X.C797641e.VERTICAL
        L_0x006a:
            r11.A01 = r0
            int r0 = X.C11490ir.A00(r7)
            if (r0 != 0) goto L_0x0079
            super.onMeasure(r12, r13)
            return
        L_0x0076:
            X.41e r0 = X.C797641e.HORIZONTAL
            goto L_0x006a
        L_0x0079:
            X.41e r1 = r11.A01
            X.41e r0 = X.C797641e.HORIZONTAL
            r8 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00b2
            int r0 = X.C11490ir.A00(r7)
            int r10 = r6 / r0
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            r3 = r13
        L_0x008c:
            X.22L r2 = new X.22L
            r2.<init>(r7)
            r5 = 0
        L_0x0092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r9, r3)
            int r0 = r1.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r1.getMeasuredState()
            int r5 = android.view.ViewGroup.combineMeasuredStates(r5, r0)
            goto L_0x0092
        L_0x00b2:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r0 = X.C11490ir.A00(r7)
            int r2 = r2 / r0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r10 = r6
            goto L_0x008c
        L_0x00c1:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            X.22L r1 = new X.22L
            r1.<init>(r7)
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.measure(r3, r2)
            goto L_0x00ce
        L_0x00de:
            X.41e r1 = r11.A01
            X.41e r0 = X.C797641e.VERTICAL
            if (r1 != r0) goto L_0x00e9
            int r0 = X.C11490ir.A00(r7)
            int r4 = r4 * r0
        L_0x00e9:
            int r1 = android.view.ViewGroup.resolveSizeAndState(r6, r12, r5)
            int r0 = r5 << 16
            int r0 = android.view.ViewGroup.resolveSizeAndState(r4, r13, r0)
            r11.setMeasuredDimension(r1, r0)
            return
        L_0x00f7:
            java.lang.String r0 = "WDSButtonGroup should not have more than 2 visible children!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.button.WDSButtonGroup.onMeasure(int, int):void");
    }

    public final void setOrientationMode(C797641e r2) {
        C18450wi.A0H(r2, 0);
        boolean A1a = C13680ns.A1a(this.A02, r2);
        this.A02 = r2;
        if (A1a) {
            requestLayout();
        }
    }

    public final void setWhatsAppLocale(AnonymousClass013 r1) {
        this.A00 = r1;
    }
}
