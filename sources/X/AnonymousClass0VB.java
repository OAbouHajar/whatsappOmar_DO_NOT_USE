package X;

import android.content.Context;
import android.graphics.Canvas;
import com.facebook.redex.IDxComparatorShape18S0000000_I1;
import java.util.Comparator;

/* renamed from: X.0VB  reason: invalid class name */
public abstract class AnonymousClass0VB {
    public static int A0D;
    public static final Comparator A0E = new IDxComparatorShape18S0000000_I1(3);
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public final float A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final AnonymousClass074 A09;
    public final C06540Wn A0A;
    public final C05150Pm A0B = new C05150Pm();
    public final float[] A0C = new float[2];

    public AnonymousClass0VB(AnonymousClass074 r3) {
        int i2 = A0D;
        A0D = i2 + 1;
        this.A06 = i2;
        this.A09 = r3;
        this.A0A = r3.A0S;
        Context context = r3.A0R.getContext();
        this.A08 = context;
        this.A05 = AnonymousClass000.A0M(context).density;
        this.A07 = r3.A0O;
    }

    public int A00(float f2, float f3) {
        return 0;
    }

    public AnonymousClass020 A01() {
        return new AnonymousClass020(C06540Wn.A02(this.A01), (this.A00 * 360.0d) - 180.0d);
    }

    public void A02() {
        this.A09.A0R.invalidate();
    }

    public void A03() {
    }

    public void A04() {
    }

    public void A05() {
    }

    public void A06() {
        this.A09.A0C(this);
    }

    public void A07(float f2) {
        AnonymousClass074 r0 = this.A09;
        r0.A0C(this);
        this.A02 = f2;
        r0.A0B(this);
    }

    public void A08(float f2, float f3) {
    }

    public void A09(float f2, float f3) {
    }

    public void A0A(boolean z2) {
        this.A04 = z2;
        A02();
    }

    public boolean A0B(float f2, float f3) {
        return false;
    }

    public boolean A0C(float f2, float f3, float f4, float f5) {
        return false;
    }

    public abstract void A0D(Canvas canvas);
}
