package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: X.07e  reason: invalid class name and case insensitive filesystem */
public class C015007e extends AnonymousClass07f {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public float A02 = 4.0f;
    public float A03 = 0.0f;
    public float A04 = 1.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public Paint.Cap A07 = Paint.Cap.BUTT;
    public Paint.Join A08 = Paint.Join.MITER;
    public AnonymousClass07i A09;
    public AnonymousClass07i A0A;
    public int[] A0B;

    public C015007e() {
    }

    public C015007e(C015007e r3) {
        super(r3);
        this.A0B = r3.A0B;
        this.A0A = r3.A0A;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A09 = r3.A09;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A06 = r3.A06;
        this.A04 = r3.A04;
        this.A05 = r3.A05;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A02 = r3.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r1.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00() {
        /*
            r2 = this;
            X.07i r1 = r2.A09
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0012
            android.content.res.ColorStateList r0 = r1.A01
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            return r0
        L_0x0012:
            X.07i r1 = r2.A0A
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0023
            android.content.res.ColorStateList r0 = r1.A01
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0023
            goto L_0x0010
        L_0x0023:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015007e.A00():boolean");
    }

    public boolean A01(int[] iArr) {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        int colorForState;
        ColorStateList colorStateList2;
        int colorForState2;
        AnonymousClass07i r2 = this.A09;
        if (r2.A02 != null || (colorStateList2 = r2.A01) == null || !colorStateList2.isStateful() || (colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor())) == r2.A00) {
            z2 = false;
        } else {
            z2 = true;
            r2.A00 = colorForState2;
        }
        AnonymousClass07i r22 = this.A0A;
        if (r22.A02 != null || (colorStateList = r22.A01) == null || !colorStateList.isStateful() || (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) == r22.A00) {
            z3 = false;
        } else {
            z3 = true;
            r22.A00 = colorForState;
        }
        return z3 | z2;
    }

    public float getFillAlpha() {
        return this.A00;
    }

    public int getFillColor() {
        return this.A09.A00;
    }

    public float getStrokeAlpha() {
        return this.A01;
    }

    public int getStrokeColor() {
        return this.A0A.A00;
    }

    public float getStrokeWidth() {
        return this.A03;
    }

    public float getTrimPathEnd() {
        return this.A04;
    }

    public float getTrimPathOffset() {
        return this.A05;
    }

    public float getTrimPathStart() {
        return this.A06;
    }

    public void setFillAlpha(float f2) {
        this.A00 = f2;
    }

    public void setFillColor(int i2) {
        this.A09.A00 = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.A01 = f2;
    }

    public void setStrokeColor(int i2) {
        this.A0A.A00 = i2;
    }

    public void setStrokeWidth(float f2) {
        this.A03 = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.A04 = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.A05 = f2;
    }

    public void setTrimPathStart(float f2) {
        this.A06 = f2;
    }
}
