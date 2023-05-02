package X;

import java.io.IOException;

/* renamed from: X.5IH  reason: invalid class name */
public class AnonymousClass5IH extends C32061fa {
    public static final C32041fY A03 = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.4");
    public static final C32041fY A04 = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.1");
    public static final C32041fY A05 = AnonymousClass3K2.A0t("2.5.29.35");
    public static final C32041fY A06 = AnonymousClass3K2.A0t("2.5.29.19");
    public static final C32041fY A07 = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.2");
    public static final C32041fY A08 = AnonymousClass3K2.A0t("2.5.29.31");
    public static final C32041fY A09 = AnonymousClass3K2.A0t("2.5.29.20");
    public static final C32041fY A0A = AnonymousClass3K2.A0t("2.5.29.29");
    public static final C32041fY A0B = AnonymousClass3K2.A0t("2.5.29.32");
    public static final C32041fY A0C = AnonymousClass3K2.A0t("2.5.29.27");
    public static final C32041fY A0D = AnonymousClass3K2.A0t("2.5.29.60");
    public static final C32041fY A0E = AnonymousClass3K2.A0t("2.5.29.37");
    public static final C32041fY A0F = AnonymousClass3K2.A0t("2.5.29.46");
    public static final C32041fY A0G = AnonymousClass3K2.A0t("2.5.29.54");
    public static final C32041fY A0H = AnonymousClass3K2.A0t("2.5.29.23");
    public static final C32041fY A0I = AnonymousClass3K2.A0t("2.5.29.24");
    public static final C32041fY A0J = AnonymousClass3K2.A0t("2.5.29.18");
    public static final C32041fY A0K = AnonymousClass3K2.A0t("2.5.29.28");
    public static final C32041fY A0L = AnonymousClass3K2.A0t("2.5.29.15");
    public static final C32041fY A0M = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.12");
    public static final C32041fY A0N = AnonymousClass3K2.A0t("2.5.29.30");
    public static final C32041fY A0O = AnonymousClass3K2.A0t("2.5.29.56");
    public static final C32041fY A0P = AnonymousClass3K2.A0t("2.5.29.36");
    public static final C32041fY A0Q = AnonymousClass3K2.A0t("2.5.29.33");
    public static final C32041fY A0R = AnonymousClass3K2.A0t("2.5.29.16");
    public static final C32041fY A0S = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.3");
    public static final C32041fY A0T = AnonymousClass3K2.A0t("2.5.29.21");
    public static final C32041fY A0U = AnonymousClass3K2.A0t("2.5.29.17");
    public static final C32041fY A0V = AnonymousClass3K2.A0t("2.5.29.9");
    public static final C32041fY A0W = AnonymousClass3K2.A0t("1.3.6.1.5.5.7.1.11");
    public static final C32041fY A0X = AnonymousClass3K2.A0t("2.5.29.14");
    public static final C32041fY A0Y = AnonymousClass3K2.A0t("2.5.29.55");
    public C32041fY A00;
    public C107405Ib A01;
    public boolean A02;

    public AnonymousClass5IH(C32041fY r2, byte[] bArr, boolean z2) {
        AnonymousClass5IT r0 = new AnonymousClass5IT(bArr);
        this.A00 = r2;
        this.A02 = z2;
        this.A01 = r0;
    }

    public AnonymousClass5IH(C32411gJ r6) {
        C32071fb A0C2;
        if (r6.A0A() == 2) {
            this.A00 = C32041fY.A00(r6.A0C(0));
            this.A02 = false;
            A0C2 = r6.A0C(1);
        } else if (r6.A0A() == 3) {
            this.A00 = C32041fY.A00(r6.A0C(0));
            this.A02 = AnonymousClass000.A1O(C33051hr.A00(r6.A0C(1)).A00);
            A0C2 = r6.A0C(2);
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r6.A0A()));
        }
        this.A01 = C107405Ib.A01(A0C2);
    }

    public C32071fb A03() {
        try {
            return C32051fZ.A02(this.A01.A00);
        } catch (IOException e2) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0g("can't convert extension: ", e2));
        }
    }

    public C32051fZ Agm() {
        C32391gH r1 = new C32391gH(3);
        r1.A02(this.A00);
        if (this.A02) {
            r1.A02(C33051hr.A02);
        }
        return AnonymousClass3K3.A0x(this.A01, r1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass5IH)) {
            return false;
        }
        AnonymousClass5IH r4 = (AnonymousClass5IH) obj;
        return r4.A00.A04(this.A00) && r4.A01.A04(this.A01) && r4.A02 == this.A02;
    }

    public int hashCode() {
        boolean z2 = this.A02;
        int hashCode = this.A01.hashCode() ^ this.A00.hashCode();
        return !z2 ? hashCode ^ -1 : hashCode;
    }
}
