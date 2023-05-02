package X;

import java.util.Locale;

/* renamed from: X.0VC  reason: invalid class name */
public class AnonymousClass0VC {
    public int A00;
    public int A01 = 0;
    public AnonymousClass0UR A02 = new AnonymousClass0UR();
    public String A03;

    public AnonymousClass0VC(String str) {
        String trim = str.trim();
        this.A03 = trim;
        this.A00 = trim.length();
    }

    public static boolean A01(int i2) {
        return i2 == 32 || i2 == 10 || i2 == 13 || i2 == 9;
    }

    public float A02() {
        AnonymousClass0UR r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public float A03() {
        A0D();
        AnonymousClass0UR r3 = this.A02;
        float A002 = r3.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A002)) {
            this.A01 = r3.A00;
        }
        return A002;
    }

    public float A04(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        A0D();
        return A02();
    }

    public int A05() {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 + 1;
        this.A01 = i4;
        if (i4 < i3) {
            return this.A03.charAt(i4);
        }
        return -1;
    }

    public C09150f1 A06() {
        float A022 = A02();
        if (Float.isNaN(A022)) {
            return null;
        }
        C03770Ju A07 = A07();
        if (A07 == null) {
            A07 = C03770Ju.px;
        }
        return new C09150f1(A07, A022);
    }

    public C03770Ju A07() {
        if (!AnonymousClass000.A1R(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            int i2 = this.A01;
            if (charAt == '%') {
                this.A01 = i2 + 1;
                return C03770Ju.percent;
            } else if (i2 <= this.A00 - 2) {
                try {
                    C03770Ju valueOf = C03770Ju.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
                    this.A01 += 2;
                    return valueOf;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public Boolean A08(Object obj) {
        if (obj == null) {
            return null;
        }
        A0D();
        int i2 = this.A01;
        if (i2 == this.A00) {
            return null;
        }
        char charAt = this.A03.charAt(i2);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z2 = true;
        this.A01++;
        if (charAt != '1') {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public Integer A09() {
        int i2 = this.A01;
        if (i2 == this.A00) {
            return null;
        }
        String str = this.A03;
        this.A01 = i2 + 1;
        return Integer.valueOf(str.charAt(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r6.A01;
        r3 = r6.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0A() {
        /*
            r6 = this;
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x001b
            int r4 = r6.A01
            java.lang.String r3 = r6.A03
            char r2 = r3.charAt(r4)
            r0 = 39
            if (r2 == r0) goto L_0x001c
            r0 = 34
            if (r2 == r0) goto L_0x001c
        L_0x001b:
            return r5
        L_0x001c:
            int r1 = r6.A05()
            r0 = -1
            if (r1 == r0) goto L_0x0034
            if (r1 != r2) goto L_0x001c
            int r0 = r6.A01
            int r0 = r0 + 1
            r6.A01 = r0
            int r1 = r4 + 1
            int r0 = r0 + -1
            java.lang.String r0 = r3.substring(r1, r0)
            return r0
        L_0x0034:
            r6.A01 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VC.A0A():java.lang.String");
    }

    public String A0B(char c2, boolean z2) {
        if (!AnonymousClass000.A1R(this.A01, this.A00)) {
            String str = this.A03;
            char charAt = str.charAt(this.A01);
            if ((z2 || !A01(charAt)) && charAt != c2) {
                int i2 = this.A01;
                while (true) {
                    int A05 = A05();
                    if (A05 == -1 || A05 == c2 || (!z2 && A01(A05))) {
                    }
                }
                return str.substring(i2, this.A01);
            }
        }
        return null;
    }

    public void A0C() {
        while (true) {
            int i2 = this.A01;
            if (i2 < this.A00 && A01(this.A03.charAt(i2))) {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public boolean A0D() {
        A0C();
        int i2 = this.A01;
        if (i2 == this.A00 || this.A03.charAt(i2) != ',') {
            return false;
        }
        this.A01++;
        A0C();
        return true;
    }

    public boolean A0E(char c2) {
        int i2 = this.A01;
        if (i2 >= this.A00 || this.A03.charAt(i2) != c2) {
            return false;
        }
        this.A01++;
        return true;
    }

    public boolean A0F(String str) {
        int length = str.length();
        int i2 = this.A01;
        if (i2 > this.A00 - length || !this.A03.substring(i2, i2 + length).equals(str)) {
            return false;
        }
        this.A01 += length;
        return true;
    }
}
