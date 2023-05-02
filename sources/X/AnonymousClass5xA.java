package X;

import android.os.Build;
import java.security.InvalidParameterException;

/* renamed from: X.5xA  reason: invalid class name */
public class AnonymousClass5xA {
    public static AnonymousClass5xA A04;
    public static AnonymousClass5xA A05;
    public static AnonymousClass5xA A06;
    public static AnonymousClass5xA A07;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i2 = Build.VERSION.SDK_INT;
        A04 = new AnonymousClass5xA((String) null, str, str2, i2);
        A05 = new AnonymousClass5xA((String) null, str, str2, -1);
        String str3 = Build.PRODUCT;
        A06 = new AnonymousClass5xA(str3, (String) null, (String) null, i2);
        A07 = new AnonymousClass5xA(str3, (String) null, (String) null, -1);
    }

    public AnonymousClass5xA(String str, String str2, String str3, int i2) {
        str = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        str3 = str3 == null ? "" : str3;
        if (str2.isEmpty() == str3.isEmpty()) {
            this.A03 = str;
            this.A01 = str2;
            this.A02 = str3;
            this.A00 = i2;
            return;
        }
        throw new InvalidParameterException("Must specify manufacturer and model");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r7.A02.isEmpty() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r6.A02.isEmpty() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.AnonymousClass5xA
            r5 = 0
            if (r0 == 0) goto L_0x0065
            X.5xA r7 = (X.AnonymousClass5xA) r7
            java.lang.String r4 = r6.A01
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = r6.A02
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r3 = r7.A01
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r7.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r6.A02
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r7.A02
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            boolean r0 = r2.equals(r0)
        L_0x0057:
            if (r0 == 0) goto L_0x0065
            int r2 = r6.A00
            r1 = -1
            if (r2 == r1) goto L_0x0064
            int r0 = r7.A00
            if (r0 == r1) goto L_0x0064
            if (r2 != r0) goto L_0x0065
        L_0x0064:
            r5 = 1
        L_0x0065:
            return r5
        L_0x0066:
            java.lang.String r2 = r6.A03
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0065
            java.lang.String r1 = r7.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0065
            boolean r0 = r2.equals(r1)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xA.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A02.isEmpty() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int hashCode() {
        /*
            r4 = this;
            java.lang.String r3 = r4.A01
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r4.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r4.A02
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x002a:
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            int r0 = r4.A00
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0)
            int r0 = r0.hashCode()
            return r0
        L_0x003d:
            java.lang.String r0 = r4.A03
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xA.hashCode():int");
    }
}
