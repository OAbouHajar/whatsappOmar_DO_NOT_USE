package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: X.4pG  reason: invalid class name and case insensitive filesystem */
public class C97014pG implements AnonymousClass5RA {
    public final int A00;
    public final SparseArray A01 = new SparseArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final C90204dh A03 = new C90204dh(new byte[5], 5);
    public final /* synthetic */ C96514oS A04;

    public C97014pG(C96514oS r4, int i2) {
        this.A04 = r4;
        this.A00 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r29) {
        /*
            r28 = this;
            r10 = r29
            int r0 = r10.A0C()
            r9 = 2
            if (r0 != r9) goto L_0x02d2
            r5 = r28
            X.4oS r4 = r5.A04
            r1 = 0
            r3 = 1
            java.util.List r0 = r4.A0F
            java.lang.Object r25 = r0.get(r1)
            r0 = r25
            X.4X5 r0 = (X.AnonymousClass4X5) r0
            r25 = r0
            int r0 = r10.A0C()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02d2
            r10.A0T(r3)
            int r24 = r10.A0F()
            r6 = 3
            r10.A0T(r6)
            X.4dh r8 = r5.A03
            byte[] r0 = r8.A03
            r2 = 0
            r10.A0V(r0, r1, r9)
            r8.A07(r1)
            r8.A08(r6)
            r1 = 13
            int r0 = r8.A04(r1)
            r4.A01 = r0
            byte[] r0 = r8.A03
            r10.A0V(r0, r2, r9)
            r8.A07(r2)
            r14 = 4
            r8.A08(r14)
            r0 = 12
            int r0 = r8.A04(r0)
            r10.A0T(r0)
            android.util.SparseArray r0 = r5.A01
            r27 = r0
            r27.clear()
            android.util.SparseIntArray r0 = r5.A02
            r26 = r0
            r26.clear()
            int r0 = r10.A00
            r23 = r0
            int r0 = r10.A01
            int r23 = r23 - r0
        L_0x006f:
            if (r23 <= 0) goto L_0x0285
            r12 = 5
            byte[] r0 = r8.A03
            r10.A0V(r0, r2, r12)
            r8.A07(r2)
            r0 = 8
            int r11 = r8.A04(r0)
            int r7 = X.C90204dh.A01(r8, r6, r1)
            r8.A08(r14)
            r0 = 12
            int r22 = r8.A04(r0)
            int r0 = r10.A01
            r21 = r0
            int r13 = r22 + r0
            r20 = 0
            r6 = r20
            r1 = -1
        L_0x0098:
            int r0 = r10.A01
            if (r0 >= r13) goto L_0x013e
            int r15 = r10.A0C()
            int r16 = r10.A0C()
            int r0 = r10.A01
            int r19 = r0 + r16
            r0 = r19
            if (r0 > r13) goto L_0x013e
            if (r15 != r12) goto L_0x00da
            long r17 = r10.A0I()
            r15 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            r15 = 1161904947(0x45414333, double:5.74057318E-315)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            r15 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00ee
            r15 = 1212503619(0x48455643, double:5.990563836E-315)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            r1 = 36
        L_0x00d0:
            int r0 = r10.A01
            int r19 = r19 - r0
            r0 = r19
            r10.A0T(r0)
            goto L_0x0098
        L_0x00da:
            r0 = 106(0x6a, float:1.49E-43)
            if (r15 == r0) goto L_0x013b
            r0 = 122(0x7a, float:1.71E-43)
            if (r15 == r0) goto L_0x0138
            r0 = 127(0x7f, float:1.78E-43)
            if (r15 != r0) goto L_0x00f1
            int r15 = r10.A0C()
            r0 = 21
            if (r15 != r0) goto L_0x00d0
        L_0x00ee:
            r1 = 172(0xac, float:2.41E-43)
            goto L_0x00d0
        L_0x00f1:
            r0 = 123(0x7b, float:1.72E-43)
            if (r15 != r0) goto L_0x00f8
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x00d0
        L_0x00f8:
            r0 = 10
            if (r15 != r0) goto L_0x0106
            r0 = 3
            java.lang.String r0 = r10.A0O(r0)
            java.lang.String r20 = r0.trim()
            goto L_0x00d0
        L_0x0106:
            r0 = 89
            if (r15 != r0) goto L_0x0131
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
        L_0x010e:
            int r1 = r10.A01
            r0 = r19
            if (r1 >= r0) goto L_0x012e
            r0 = 3
            java.lang.String r0 = r10.A0O(r0)
            java.lang.String r15 = r0.trim()
            r10.A0C()
            byte[] r1 = new byte[r14]
            r10.A0V(r1, r2, r14)
            X.4GE r0 = new X.4GE
            r0.<init>(r15, r1)
            r6.add(r0)
            goto L_0x010e
        L_0x012e:
            r1 = 89
            goto L_0x00d0
        L_0x0131:
            r0 = 111(0x6f, float:1.56E-43)
            if (r15 != r0) goto L_0x00d0
            r1 = 257(0x101, float:3.6E-43)
            goto L_0x00d0
        L_0x0138:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x00d0
        L_0x013b:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x00d0
        L_0x013e:
            r10.A0S(r13)
            byte[] r14 = r10.A02
            r0 = r21
            byte[] r14 = java.util.Arrays.copyOfRange(r14, r0, r13)
            X.4LS r13 = new X.4LS
            r0 = r20
            r13.<init>(r0, r6, r14, r1)
            r0 = 6
            if (r11 == r0) goto L_0x0155
            if (r11 != r12) goto L_0x0157
        L_0x0155:
            int r11 = r13.A00
        L_0x0157:
            int r0 = r22 + 5
            int r23 = r23 - r0
            android.util.SparseBooleanArray r0 = r4.A09
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x01a9
            X.5LJ r6 = r4.A0D
            X.4pH r6 = (X.C97024pH) r6
            if (r11 == r9) goto L_0x0270
            r0 = 3
            if (r11 == r0) goto L_0x0262
            r0 = 4
            if (r11 == r0) goto L_0x0262
            r0 = 21
            if (r11 == r0) goto L_0x0256
            r0 = 27
            r1 = 0
            if (r11 == r0) goto L_0x0241
            r0 = 36
            if (r11 == r0) goto L_0x022c
            r0 = 89
            if (r11 == r0) goto L_0x021e
            r0 = 138(0x8a, float:1.93E-43)
            if (r11 == r0) goto L_0x0211
            r0 = 172(0xac, float:2.41E-43)
            if (r11 == r0) goto L_0x0204
            r0 = 257(0x101, float:3.6E-43)
            if (r11 == r0) goto L_0x01f7
            r0 = 129(0x81, float:1.81E-43)
            if (r11 == r0) goto L_0x01ea
            r0 = 130(0x82, float:1.82E-43)
            if (r11 == r0) goto L_0x019f
            r0 = 134(0x86, float:1.88E-43)
            if (r11 == r0) goto L_0x01dd
            r0 = 135(0x87, float:1.89E-43)
            if (r11 == r0) goto L_0x01ea
            switch(r11) {
                case 15: goto L_0x01d0;
                case 16: goto L_0x01bc;
                case 17: goto L_0x01af;
                default: goto L_0x019f;
            }
        L_0x019f:
            r0 = r26
            r0.put(r7, r7)
            r0 = r27
            r0.put(r7, r1)
        L_0x01a9:
            r6 = 3
            r14 = 4
            r1 = 13
            goto L_0x006f
        L_0x01af:
            java.lang.String r1 = r13.A01
            X.4pA r0 = new X.4pA
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x01bc:
            java.util.List r0 = r6.A00(r13)
            X.4TF r1 = new X.4TF
            r1.<init>(r0)
            X.4pD r0 = new X.4pD
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x01d0:
            java.lang.String r1 = r13.A01
            X.4pC r0 = new X.4pC
            r0.<init>(r1, r2)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x01dd:
            java.lang.String r1 = "application/x-scte35"
            X.4pF r0 = new X.4pF
            r0.<init>(r1)
            X.4pI r1 = new X.4pI
            r1.<init>(r0)
            goto L_0x019f
        L_0x01ea:
            java.lang.String r1 = r13.A01
            X.4p5 r0 = new X.4p5
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x01f7:
            java.lang.String r1 = "application/vnd.dvb.ait"
            X.4pF r0 = new X.4pF
            r0.<init>(r1)
            X.4pI r1 = new X.4pI
            r1.<init>(r0)
            goto L_0x019f
        L_0x0204:
            java.lang.String r1 = r13.A01
            X.4p6 r0 = new X.4p6
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0211:
            java.lang.String r1 = r13.A01
            X.4p4 r0 = new X.4p4
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x021e:
            java.util.List r1 = r13.A02
            X.4p2 r0 = new X.4p2
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x022c:
            java.util.List r0 = r6.A00(r13)
            X.4Qb r1 = new X.4Qb
            r1.<init>(r0)
            X.4p9 r0 = new X.4p9
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0241:
            java.util.List r0 = r6.A00(r13)
            X.4Qb r1 = new X.4Qb
            r1.<init>(r0)
            X.4p8 r0 = new X.4p8
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0256:
            X.4p3 r0 = new X.4p3
            r0.<init>()
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0262:
            java.lang.String r1 = r13.A01
            X.4p7 r0 = new X.4p7
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0270:
            java.util.List r0 = r6.A00(r13)
            X.4TF r1 = new X.4TF
            r1.<init>(r0)
            X.4pB r0 = new X.4pB
            r0.<init>(r1)
            X.4pJ r1 = new X.4pJ
            r1.<init>(r0)
            goto L_0x019f
        L_0x0285:
            int r10 = r26.size()
            r9 = 0
        L_0x028a:
            if (r9 >= r10) goto L_0x02c2
            r0 = r26
            int r12 = r0.keyAt(r9)
            int r11 = r0.valueAt(r9)
            android.util.SparseBooleanArray r0 = r4.A09
            r0.put(r12, r3)
            android.util.SparseBooleanArray r0 = r4.A0A
            r0.put(r11, r3)
            r0 = r27
            java.lang.Object r8 = r0.valueAt(r9)
            X.5SN r8 = (X.AnonymousClass5SN) r8
            if (r8 == 0) goto L_0x02bf
            X.0qG r7 = r4.A03
            r6 = 8192(0x2000, float:1.14794E-41)
            X.4WV r1 = new X.4WV
            r0 = r24
            r1.<init>(r0, r12, r6)
            r0 = r25
            r8.AI2(r7, r1, r0)
            android.util.SparseArray r0 = r4.A08
            r0.put(r11, r8)
        L_0x02bf:
            int r9 = r9 + 1
            goto L_0x028a
        L_0x02c2:
            android.util.SparseArray r1 = r4.A08
            int r0 = r5.A00
            r1.remove(r0)
            r4.A02 = r2
            X.0qG r0 = r4.A03
            r0.A8W()
            r4.A07 = r3
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97014pG.A6b(X.4eH):void");
    }

    public void AI2(C15060qG r1, AnonymousClass4WV r2, AnonymousClass4X5 r3) {
    }
}
