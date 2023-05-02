package X;

import android.view.animation.Interpolator;

/* renamed from: X.0Qd  reason: invalid class name and case insensitive filesystem */
public final class C05310Qd {
    public int A00 = -1;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public C03570Ja A05 = C03570Ja.BOTTOM;
    public C12720kr A06;
    public C12730ks A07;
    public AnonymousClass2Wa A08;
    public String A09;
    public boolean A0A = false;
    public final C14990q7 A0B;

    public C05310Qd(C14990q7 r2) {
        this.A0B = r2;
    }

    public AnonymousClass0WD A00() {
        String str;
        AnonymousClass2Wa r8 = this.A08;
        if (r8 != null) {
            int i2 = this.A00;
            if (i2 != -1) {
                C14990q7 r7 = this.A0B;
                int i3 = this.A02;
                int i4 = this.A01;
                Interpolator interpolator = this.A04;
                Interpolator interpolator2 = this.A03;
                C12730ks r6 = this.A07;
                return new AnonymousClass0WD(interpolator, interpolator2, (AnonymousClass0e2) null, this.A05, this.A06, r6, r7, r8, this.A09, i2, i3, i4, this.A0A);
            }
            str = "Auto-dismiss duration must be >= 0ms";
        } else {
            str = "Bloks content cannot be null in popover window";
        }
        throw AnonymousClass000.A0T(str);
    }

    public void A01(AnonymousClass2Wa r1) {
        this.A08 = r1;
    }
}
