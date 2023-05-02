package X;

import java.util.List;

/* renamed from: X.3Iw  reason: invalid class name and case insensitive filesystem */
public final class C63513Iw extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final /* synthetic */ List $delimitersList;
    public final /* synthetic */ boolean $ignoreCase = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63513Iw(List list) {
        super(2);
        this.$delimitersList = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r7 == r6) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object AIV(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r3 = X.AnonymousClass000.A0D(r13)
            r2 = 0
            X.C18450wi.A0H(r12, r2)
            java.util.List r9 = r11.$delimitersList
            boolean r8 = r11.$ignoreCase
            if (r8 != 0) goto L_0x0040
            int r1 = r9.size()
            r0 = 1
            if (r1 != r0) goto L_0x0040
            java.lang.Object r1 = X.C003101j.A05(r9)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = X.C008603x.A03(r12, r1, r3)
            if (r0 < 0) goto L_0x005a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1Jq r2 = new X.1Jq
            r2.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r1 = r2.first
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1Jq r2 = new X.1Jq
            r2.<init>(r1, r0)
            return r2
        L_0x0040:
            if (r3 >= r2) goto L_0x0043
            r3 = 0
        L_0x0043:
            int r0 = r12.length()
            X.22s r1 = new X.22s
            r1.<init>(r3, r0)
            boolean r0 = r12 instanceof java.lang.String
            int r7 = r1.A00
            int r6 = r1.A01
            int r5 = r1.A02
            if (r0 == 0) goto L_0x005c
            if (r5 <= 0) goto L_0x0087
            if (r7 <= r6) goto L_0x0089
        L_0x005a:
            r2 = 0
            return r2
        L_0x005c:
            if (r5 <= 0) goto L_0x0061
            if (r7 <= r6) goto L_0x0063
            goto L_0x005a
        L_0x0061:
            if (r6 > r7) goto L_0x005a
        L_0x0063:
            int r3 = r7 + r5
            java.util.Iterator r2 = r9.iterator()
        L_0x0069:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r4 = r2.next()
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.length()
            boolean r0 = X.C008603x.A0H(r1, r12, r7, r0, r8)
            if (r0 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x0083
            goto L_0x00ab
        L_0x0083:
            if (r7 == r6) goto L_0x005a
            r7 = r3
            goto L_0x0063
        L_0x0087:
            if (r6 > r7) goto L_0x005a
        L_0x0089:
            int r10 = r7 + r5
            java.util.Iterator r3 = r9.iterator()
        L_0x008f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r4 = r3.next()
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r2.length()
            boolean r0 = X.C008703y.A0Q(r2, r1, r7, r0, r8)
            if (r0 == 0) goto L_0x008f
            if (r4 == 0) goto L_0x00b6
        L_0x00ab:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.1Jq r2 = new X.1Jq
            r2.<init>(r0, r4)
            goto L_0x002c
        L_0x00b6:
            if (r7 == r6) goto L_0x005a
            r7 = r10
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63513Iw.AIV(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
