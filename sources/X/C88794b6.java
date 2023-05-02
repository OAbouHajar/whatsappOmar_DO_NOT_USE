package X;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: X.4b6  reason: invalid class name and case insensitive filesystem */
public final class C88794b6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public Layout.Alignment A0D;
    public CharSequence A0E;
    public boolean A0F;

    public C88794b6() {
        this.A0E = null;
        this.A0C = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = Integer.MIN_VALUE;
        this.A06 = Integer.MIN_VALUE;
        this.A02 = -3.4028235E38f;
        this.A08 = Integer.MIN_VALUE;
        this.A09 = Integer.MIN_VALUE;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0F = false;
        this.A0B = -16777216;
        this.A0A = Integer.MIN_VALUE;
    }

    public C88794b6(C88444aV r2) {
        this.A0E = r2.A0E;
        this.A0C = r2.A0C;
        this.A0D = r2.A0D;
        this.A01 = r2.A01;
        this.A07 = r2.A07;
        this.A06 = r2.A06;
        this.A02 = r2.A02;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A00 = r2.A00;
        this.A0F = r2.A0F;
        this.A0B = r2.A0B;
        this.A0A = r2.A0A;
        this.A03 = r2.A03;
    }

    public C88444aV A00() {
        CharSequence charSequence = this.A0E;
        Layout.Alignment alignment = this.A0D;
        Bitmap bitmap = this.A0C;
        float f2 = this.A01;
        int i2 = this.A07;
        int i3 = this.A06;
        float f3 = this.A02;
        int i4 = this.A08;
        int i5 = this.A09;
        float f4 = this.A05;
        float f5 = this.A04;
        float f6 = this.A00;
        boolean z2 = this.A0F;
        int i6 = this.A0B;
        int i7 = this.A0A;
        int i8 = i6;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        return new C88444aV(bitmap, alignment, charSequence, f2, f3, f4, f5, f6, this.A03, i12, i11, i10, i9, i8, i7, z2);
    }
}
