package X;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: X.4aV  reason: invalid class name and case insensitive filesystem */
public final class C88444aV {
    public static final C88444aV A0G;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final CharSequence A0E;
    public final boolean A0F;

    static {
        C88794b6 r1 = new C88794b6();
        r1.A0E = "";
        A0G = r1.A00();
    }

    public C88444aV(Bitmap bitmap, Layout.Alignment alignment, CharSequence charSequence, float f2, float f3, float f4, float f5, float f6, float f7, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        if (charSequence != null) {
            C90524eJ.A03(AnonymousClass000.A1W(bitmap));
        }
        this.A0E = charSequence;
        this.A0D = alignment;
        this.A0C = bitmap;
        this.A01 = f2;
        this.A07 = i2;
        this.A06 = i3;
        this.A02 = f3;
        this.A08 = i4;
        this.A04 = f5;
        this.A00 = f6;
        this.A0F = z2;
        this.A0B = i6;
        this.A09 = i5;
        this.A05 = f4;
        this.A0A = i7;
        this.A03 = f7;
    }
}
