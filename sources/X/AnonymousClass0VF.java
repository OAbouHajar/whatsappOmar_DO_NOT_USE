package X;

import android.view.View;

/* renamed from: X.0VF  reason: invalid class name */
public class AnonymousClass0VF {
    public static final AnonymousClass030 A01 = new C05900Tl().A00.A00().A00.A05().A00.A06().A00.A07();
    public final AnonymousClass030 A00;

    public AnonymousClass0VF(AnonymousClass030 r1) {
        this.A00 = r1;
    }

    public C06510Wk A00() {
        return A0A();
    }

    public C06510Wk A01() {
        return C06510Wk.A04;
    }

    public C06510Wk A02() {
        return A0A();
    }

    public C06510Wk A03() {
        return A0A();
    }

    public AnonymousClass0V6 A04() {
        return null;
    }

    public AnonymousClass030 A05() {
        return this.A00;
    }

    public AnonymousClass030 A06() {
        return this.A00;
    }

    public AnonymousClass030 A07() {
        return this.A00;
    }

    public void A08(C06510Wk r1) {
    }

    public boolean A09() {
        return false;
    }

    public C06510Wk A0A() {
        return C06510Wk.A04;
    }

    public C06510Wk A0B(int i2) {
        return C06510Wk.A04;
    }

    public C06510Wk A0C(int i2) {
        if ((i2 & 8) == 0) {
            return C06510Wk.A04;
        }
        throw AnonymousClass000.A0T("Unable to query the maximum insets for IME");
    }

    public AnonymousClass030 A0D(int i2, int i3, int i4, int i5) {
        return A01;
    }

    public void A0E(View view) {
    }

    public void A0F(AnonymousClass030 r1) {
    }

    public boolean A0G() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0VF)) {
            return false;
        }
        AnonymousClass0VF r4 = (AnonymousClass0VF) obj;
        return A0G() == r4.A0G() && A09() == r4.A09() && AnonymousClass08I.A01(A0A(), r4.A0A()) && AnonymousClass08I.A01(A01(), r4.A01()) && AnonymousClass08I.A01(A04(), r4.A04());
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1N(objArr, A0G());
        objArr[1] = Boolean.valueOf(A09());
        objArr[2] = A0A();
        objArr[3] = A01();
        objArr[4] = A04();
        return AnonymousClass08I.A00(objArr);
    }
}
