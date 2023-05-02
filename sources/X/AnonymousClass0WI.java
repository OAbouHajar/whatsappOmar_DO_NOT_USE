package X;

import java.util.Locale;

/* renamed from: X.0WI  reason: invalid class name */
public final class AnonymousClass0WI {
    public static final AnonymousClass0PJ A07 = new AnonymousClass0PJ();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass0WI(String str, String str2, String str3, int i2, int i3, boolean z2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z2;
        this.A02 = i2;
        this.A03 = str3;
        this.A01 = i3;
        this.A00 = A00(str2);
    }

    public static final int A00(String str) {
        Locale locale = Locale.US;
        C18450wi.A0D(locale);
        String upperCase = str.toUpperCase(locale);
        C18450wi.A0B(upperCase);
        if (C008603x.A0F(upperCase, "INT")) {
            return 3;
        }
        if (C008603x.A0F(upperCase, "CHAR") || C008603x.A0F(upperCase, "CLOB") || C008603x.A0F(upperCase, "TEXT")) {
            return 2;
        }
        if (C008603x.A0F(upperCase, "BLOB")) {
            return 5;
        }
        return (C008603x.A0F(upperCase, "REAL") || C008603x.A0F(upperCase, "FLOA") || C008603x.A0F(upperCase, "DOUB")) ? 4 : 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r1.A00(r2, r0) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r4 = 1
            if (r7 == r8) goto L_0x0075
            boolean r0 = r8 instanceof X.AnonymousClass0WI
            r6 = 0
            if (r0 == 0) goto L_0x003d
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 20
            if (r1 < r0) goto L_0x0049
            int r1 = r7.A02
            X.0WI r8 = (X.AnonymousClass0WI) r8
            int r0 = r8.A02
        L_0x0014:
            if (r1 != r0) goto L_0x003d
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x003d
            boolean r1 = r7.A06
            boolean r0 = r8.A06
            if (r1 != r0) goto L_0x003d
            int r5 = r7.A01
            r0 = 2
            int r3 = r8.A01
            if (r5 != r4) goto L_0x003e
            if (r3 != r0) goto L_0x0058
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x006e
            X.0PJ r1 = A07
            java.lang.String r0 = r8.A03
        L_0x0037:
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0058
        L_0x003d:
            return r6
        L_0x003e:
            if (r3 != r4) goto L_0x0058
            java.lang.String r2 = r8.A03
            if (r2 == 0) goto L_0x0058
            X.0PJ r1 = A07
            java.lang.String r0 = r7.A03
            goto L_0x0037
        L_0x0049:
            int r0 = r7.A02
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            X.0WI r8 = (X.AnonymousClass0WI) r8
            int r0 = r8.A02
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            goto L_0x0014
        L_0x0058:
            if (r5 != r3) goto L_0x006e
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0069
            X.0PJ r1 = A07
            java.lang.String r0 = r8.A03
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x006e
            return r6
        L_0x0069:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x006e
            return r6
        L_0x006e:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0075
            r4 = 0
        L_0x0075:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WI.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        return ((hashCode + i2) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Column{name='");
        A0r.append(this.A04);
        A0r.append("', type='");
        A0r.append(this.A05);
        A0r.append("', affinity='");
        A0r.append(this.A00);
        A0r.append("', notNull=");
        A0r.append(this.A06);
        A0r.append(", primaryKeyPosition=");
        A0r.append(this.A02);
        A0r.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A0r.append(str);
        return AnonymousClass000.A0h("'}", A0r);
    }
}
