package X;

/* renamed from: X.1pG  reason: invalid class name and case insensitive filesystem */
public abstract class C37501pG extends C29861bL implements C30081bi, C37481pE {
    public String A00;

    public C37501pG(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5j(X.AnonymousClass21Q r10, X.AnonymousClass1GC r11) {
        /*
            r9 = this;
            X.2eo r0 = X.C53002eo.A0F
            X.1Wr r6 = r0.A0U()
            X.3fK r6 = (X.C69613fK) r6
            X.43A r0 = X.AnonymousClass43A.A0B
            r6.A05(r0)
            X.2tw r0 = X.C58712tw.A04
            X.1Wr r5 = r0.A0U()
            X.3fD r5 = (X.C69543fD) r5
            boolean r3 = r9 instanceof X.C37491pF
            if (r3 == 0) goto L_0x00ce
            r0 = 0
        L_0x001a:
            X.42z r2 = X.C802142z.A00(r0)
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2tw r1 = (X.C58712tw) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            int r0 = r2.value
            r1.A01 = r0
        L_0x002f:
            java.lang.String r0 = r9.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0048
            java.lang.String r2 = r9.A00
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2tw r1 = (X.C58712tw) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A03 = r2
        L_0x0048:
            r1 = r9
            if (r3 == 0) goto L_0x00d5
            X.1pF r1 = (X.C37491pF) r1
            java.util.Map r0 = r1.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x0057:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            X.2tv r0 = X.C58702tv.A04
            X.1Wr r4 = r0.A0U()
            X.3eS r4 = (X.C69073eS) r4
            java.lang.Object r0 = r7.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            X.1pH r2 = (X.C37511pH) r2
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            int r0 = r2.value
            r1.A01 = r0
            java.lang.Object r0 = r7.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.1pI r0 = (X.C37521pI) r0
            if (r0 == 0) goto L_0x00a5
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
        L_0x0099:
            r1.A03 = r0
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r5.A05(r4)
            goto L_0x0057
        L_0x00a5:
            X.1pI r0 = X.C37521pI.A0I
            X.1Wr r3 = r0.A0U()
            X.3fG r3 = (X.C69573fG) r3
            java.lang.Object r0 = r7.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r0 = X.C28631Ww.A01(r1, r2, r0)
            r3.A05(r0)
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
            X.1Wm r0 = r3.A02()
            X.1pI r0 = (X.C37521pI) r0
            goto L_0x0099
        L_0x00ce:
            boolean r0 = r9 instanceof X.C37531pJ
            if (r0 != 0) goto L_0x002f
            r0 = 2
            goto L_0x001a
        L_0x00d5:
            boolean r0 = r9 instanceof X.C37531pJ
            if (r0 != 0) goto L_0x015c
            X.1pK r1 = (X.C37541pK) r1
            java.util.Map r0 = r1.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x00e5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            X.2tv r0 = X.C58702tv.A04
            X.1Wr r4 = r0.A0U()
            X.3eS r4 = (X.C69073eS) r4
            java.lang.Object r0 = r7.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            X.1pH r2 = (X.C37511pH) r2
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            int r0 = r2.value
            r1.A01 = r0
            java.lang.Object r0 = r7.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.1pL r0 = (X.C37551pL) r0
            if (r0 == 0) goto L_0x0133
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
        L_0x0127:
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r5.A05(r4)
            goto L_0x00e5
        L_0x0133:
            X.1pL r0 = X.C37551pL.A08
            X.1Wr r3 = r0.A0U()
            java.lang.Object r2 = r7.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.A03()
            X.1Wm r1 = r3.A00
            X.1pL r1 = (X.C37551pL) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A07 = r2
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2tv r1 = (X.C58702tv) r1
            X.1Wm r0 = r3.A02()
            X.1pL r0 = (X.C37551pL) r0
            goto L_0x0127
        L_0x015c:
            r6.A03()
            X.1Wm r1 = r6.A00
            X.2eo r1 = (X.C53002eo) r1
            X.1Wm r0 = r5.A02()
            X.2tw r0 = (X.C58712tw) r0
            r1.A0C = r0
            int r0 = r1.A00
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.A00 = r0
            X.1iE r0 = r10.A04
            r0.A09(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37501pG.A5j(X.21Q, X.1GC):void");
    }

    public /* synthetic */ String ADa() {
        return "peer_msg";
    }
}
