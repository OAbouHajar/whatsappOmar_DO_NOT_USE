package X;

import android.view.View;

/* renamed from: X.4VD  reason: invalid class name */
public class AnonymousClass4VD {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public AnonymousClass4VD(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.A08 = iArr[0];
        this.A09 = iArr[1];
        this.A02 = view.getTranslationX();
        this.A03 = view.getTranslationY();
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A07 = view.getWidth();
        this.A04 = view.getHeight();
        this.A06 = view.getMeasuredWidth();
        this.A05 = view.getMeasuredHeight();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass4VD)) {
            return false;
        }
        AnonymousClass4VD r4 = (AnonymousClass4VD) obj;
        return r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A07 == this.A07 && r4.A04 == this.A04 && r4.A08 == this.A08 && r4.A09 == this.A09 && r4.A06 == this.A06 && r4.A05 == this.A05;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = Float.valueOf(this.A02);
        objArr[1] = Float.valueOf(this.A03);
        objArr[2] = Float.valueOf(this.A00);
        objArr[3] = Float.valueOf(this.A01);
        objArr[4] = Integer.valueOf(this.A07);
        objArr[5] = Integer.valueOf(this.A04);
        objArr[6] = Integer.valueOf(this.A08);
        return AnonymousClass000.A0F(Integer.valueOf(this.A09), objArr, 7);
    }
}
