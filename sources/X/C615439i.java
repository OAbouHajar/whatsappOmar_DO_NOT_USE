package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.39i  reason: invalid class name and case insensitive filesystem */
public class C615439i {
    public C62133Bt A00 = new C62133Bt();

    public static String A00(AnonymousClass5IP r0) {
        return C32941ha.A02(C33021ho.A00(r0.A01).A00);
    }

    public void A01(AnonymousClass5IP r5) {
        AnonymousClass43V r1;
        try {
            C62133Bt r3 = this.A00;
            int i2 = r5.A00;
            if (i2 == 0) {
                Set<Object> set = r3.A04;
                C107355Hw A002 = C107355Hw.A00(r5.A01);
                if (!set.isEmpty()) {
                    for (Object A003 : set) {
                        if (C107355Hw.A00(A003).equals(A002)) {
                            r1 = new AnonymousClass43V("OtherName is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i2 == 1) {
                Set set2 = r3.A02;
                String A004 = A00(r5);
                if (!set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (r3.A09(A004, AnonymousClass000.A0m(it))) {
                            r1 = new AnonymousClass43V("Email address is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i2 == 2) {
                Set set3 = r3.A01;
                String A005 = A00(r5);
                if (!set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        String A0m = AnonymousClass000.A0m(it2);
                        if (C62133Bt.A03(A005, A0m) || A005.equalsIgnoreCase(A0m)) {
                            r1 = new AnonymousClass43V("DNS is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i2 == 4) {
                r3.A07(AnonymousClass5IQ.A01(r5.A01));
                return;
            } else if (i2 == 6) {
                Set set4 = r3.A05;
                String A006 = A00(r5);
                if (!set4.isEmpty()) {
                    Iterator it3 = set4.iterator();
                    while (it3.hasNext()) {
                        if (r3.A0A(A006, AnonymousClass000.A0m(it3))) {
                            r1 = new AnonymousClass43V("URI is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i2 == 7) {
                Set<byte[]> set5 = r3.A03;
                byte[] bArr = C107405Ib.A01(r5.A01).A00;
                if (!set5.isEmpty()) {
                    for (byte[] A05 : set5) {
                        if (C62133Bt.A05(bArr, A05)) {
                            r1 = new AnonymousClass43V("IP is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            throw r1;
        } catch (AnonymousClass43V e2) {
            throw new C803343l(e2.getMessage(), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[Catch:{ 43V -> 0x011d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass5IP r6) {
        /*
            r5 = this;
            X.3Bt r4 = r5.A00     // Catch:{ 43V -> 0x011d }
            int r1 = r6.A00     // Catch:{ 43V -> 0x011d }
            if (r1 == 0) goto L_0x00e9
            r0 = 1
            if (r1 == r0) goto L_0x00b7
            r0 = 2
            if (r1 == r0) goto L_0x007f
            r0 = 4
            if (r1 == r0) goto L_0x0075
            r0 = 6
            if (r1 == r0) goto L_0x004b
            r0 = 7
            if (r1 != r0) goto L_0x011c
            java.util.Set r3 = r4.A09     // Catch:{ 43V -> 0x011d }
            X.1fb r0 = r6.A01     // Catch:{ 43V -> 0x011d }
            X.5Ib r0 = X.C107405Ib.A01(r0)     // Catch:{ 43V -> 0x011d }
            byte[] r2 = r0.A00     // Catch:{ 43V -> 0x011d }
            if (r3 == 0) goto L_0x011c
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 43V -> 0x011d }
        L_0x0025:
            boolean r0 = r1.hasNext()     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()     // Catch:{ 43V -> 0x011d }
            byte[] r0 = (byte[]) r0     // Catch:{ 43V -> 0x011d }
            boolean r0 = X.C62133Bt.A05(r2, r0)     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x0025
            return
        L_0x0038:
            int r0 = r2.length     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x0042
            int r0 = r3.size()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            java.lang.String r0 = "IP is not from a permitted subtree."
            X.43V r1 = new X.43V     // Catch:{ 43V -> 0x011d }
            r1.<init>(r0)     // Catch:{ 43V -> 0x011d }
            goto L_0x011b
        L_0x004b:
            java.util.Set r3 = r4.A0B     // Catch:{ 43V -> 0x011d }
            java.lang.String r2 = A00(r6)     // Catch:{ 43V -> 0x011d }
            if (r3 == 0) goto L_0x011c
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 43V -> 0x011d }
        L_0x0057:
            boolean r0 = r1.hasNext()     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.AnonymousClass000.A0m(r1)     // Catch:{ 43V -> 0x011d }
            boolean r0 = r4.A0A(r2, r0)     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x0057
            return
        L_0x0068:
            int r0 = r2.length()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x0114
            int r0 = r3.size()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x0114
            return
        L_0x0075:
            X.1fb r0 = r6.A01     // Catch:{ 43V -> 0x011d }
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r0)     // Catch:{ 43V -> 0x011d }
            r4.A08(r0)     // Catch:{ 43V -> 0x011d }
            return
        L_0x007f:
            java.util.Set r4 = r4.A07     // Catch:{ 43V -> 0x011d }
            java.lang.String r3 = A00(r6)     // Catch:{ 43V -> 0x011d }
            if (r4 == 0) goto L_0x011c
            java.util.Iterator r2 = r4.iterator()     // Catch:{ 43V -> 0x011d }
        L_0x008b:
            boolean r0 = r2.hasNext()     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)     // Catch:{ 43V -> 0x011d }
            boolean r0 = X.C62133Bt.A03(r3, r1)     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x011c
            boolean r0 = r3.equalsIgnoreCase(r1)     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x008b
            return
        L_0x00a2:
            int r0 = r3.length()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x00af
            int r0 = r4.size()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x00af
            return
        L_0x00af:
            java.lang.String r0 = "DNS is not from a permitted subtree."
            X.43V r1 = new X.43V     // Catch:{ 43V -> 0x011d }
            r1.<init>(r0)     // Catch:{ 43V -> 0x011d }
            goto L_0x011b
        L_0x00b7:
            java.util.Set r3 = r4.A08     // Catch:{ 43V -> 0x011d }
            java.lang.String r2 = A00(r6)     // Catch:{ 43V -> 0x011d }
            if (r3 == 0) goto L_0x011c
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 43V -> 0x011d }
        L_0x00c3:
            boolean r0 = r1.hasNext()     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = X.AnonymousClass000.A0m(r1)     // Catch:{ 43V -> 0x011d }
            boolean r0 = r4.A09(r2, r0)     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x00c3
            return
        L_0x00d4:
            int r0 = r2.length()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x00e1
            int r0 = r3.size()     // Catch:{ 43V -> 0x011d }
            if (r0 != 0) goto L_0x00e1
            return
        L_0x00e1:
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            X.43V r1 = new X.43V     // Catch:{ 43V -> 0x011d }
            r1.<init>(r0)     // Catch:{ 43V -> 0x011d }
            goto L_0x011b
        L_0x00e9:
            java.util.Set r1 = r4.A0A     // Catch:{ 43V -> 0x011d }
            X.1fb r0 = r6.A01     // Catch:{ 43V -> 0x011d }
            X.5Hw r2 = X.C107355Hw.A00(r0)     // Catch:{ 43V -> 0x011d }
            if (r1 == 0) goto L_0x011c
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 43V -> 0x011d }
        L_0x00f7:
            boolean r0 = r1.hasNext()     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r1.next()     // Catch:{ 43V -> 0x011d }
            X.5Hw r0 = X.C107355Hw.A00(r0)     // Catch:{ 43V -> 0x011d }
            boolean r0 = r0.equals(r2)     // Catch:{ 43V -> 0x011d }
            if (r0 == 0) goto L_0x00f7
            return
        L_0x010c:
            java.lang.String r0 = "Subject OtherName is not from a permitted subtree."
            X.43V r1 = new X.43V     // Catch:{ 43V -> 0x011d }
            r1.<init>(r0)     // Catch:{ 43V -> 0x011d }
            goto L_0x011b
        L_0x0114:
            java.lang.String r0 = "URI is not from a permitted subtree."
            X.43V r1 = new X.43V     // Catch:{ 43V -> 0x011d }
            r1.<init>(r0)     // Catch:{ 43V -> 0x011d }
        L_0x011b:
            throw r1     // Catch:{ 43V -> 0x011d }
        L_0x011c:
            return
        L_0x011d:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.43l r0 = new X.43l
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615439i.A02(X.5IP):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C615439i)) {
            return false;
        }
        return this.A00.equals(((C615439i) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
