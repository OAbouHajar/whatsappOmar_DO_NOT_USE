package X;

import java.io.OutputStream;

/* renamed from: X.5IY  reason: invalid class name */
public abstract class AnonymousClass5IY extends C32051fZ {
    public int A00;
    public C33041hq A01;
    public C32041fY A02;
    public C32051fZ A03;
    public C32051fZ A04;

    public AnonymousClass5IY(C32391gH r5) {
        String str;
        int i2 = 0;
        C32051fZ A002 = A00(r5, 0);
        if (A002 instanceof C32041fY) {
            this.A02 = (C32041fY) A002;
            A002 = A00(r5, 1);
            i2 = 1;
        }
        if (A002 instanceof C33041hq) {
            this.A01 = (C33041hq) A002;
            i2++;
            A002 = A00(r5, i2);
        }
        if (!(A002 instanceof C107525In)) {
            this.A03 = A002;
            i2++;
            A002 = A00(r5, i2);
        }
        if (r5.A00 != i2 + 1) {
            str = "input vector too large";
        } else if (A002 instanceof C107525In) {
            C107525In r2 = (C107525In) A002;
            int i3 = r2.A00;
            if (i3 < 0 || i3 > 2) {
                str = C13680ns.A0c(i3, "invalid encoding value: ");
            } else {
                this.A00 = i3;
                this.A04 = C107525In.A00(r2);
                return;
            }
        } else {
            str = "No tagged object found in vector. Structure doesn't seem to be of type External";
        }
        throw AnonymousClass000.A0T(str);
    }

    public AnonymousClass5IY(C33041hq r1, C32041fY r2, C32051fZ r3, C32051fZ r4, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i2;
        this.A04 = r4;
    }

    public static final C32051fZ A00(C32391gH r1, int i2) {
        if (r1.A00 > i2) {
            return r1.A01(i2).Agm();
        }
        throw AnonymousClass000.A0T("too few objects in input vector");
    }

    public static void A01(OutputStream outputStream, String str, C32061fa r3) {
        if (r3 != null) {
            outputStream.write(r3.A02(str));
        }
    }

    public C32051fZ A05() {
        C32041fY r2 = this.A02;
        return new C107255Ha(this.A01, r2, this.A03, this.A04, this.A00);
    }

    public boolean A08() {
        return true;
    }

    public boolean A09(C32051fZ r4) {
        C32051fZ r0;
        C33041hq r02;
        C32041fY r03;
        if (r4 instanceof AnonymousClass5IY) {
            if (this == r4) {
                return true;
            }
            AnonymousClass5IY r42 = (AnonymousClass5IY) r4;
            C32041fY r1 = this.A02;
            if (r1 != null && ((r03 = r42.A02) == null || !r03.A04(r1))) {
                return false;
            }
            C33041hq r12 = this.A01;
            if (r12 != null && ((r02 = r42.A01) == null || !r02.A04(r12))) {
                return false;
            }
            C32051fZ r13 = this.A03;
            if (r13 == null || ((r0 = r42.A03) != null && r0.A04(r13))) {
                return this.A04.A04(r42.A04);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        C32041fY r0 = this.A02;
        int hashCode = r0 != null ? r0.hashCode() : 0;
        C33041hq r02 = this.A01;
        if (r02 != null) {
            hashCode ^= r02.hashCode();
        }
        C32051fZ r03 = this.A03;
        if (r03 != null) {
            hashCode ^= r03.hashCode();
        }
        return hashCode ^ this.A04.hashCode();
    }
}
