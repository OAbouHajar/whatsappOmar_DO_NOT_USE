package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0SC  reason: invalid class name */
public class AnonymousClass0SC {
    public AnonymousClass0Dp A00;
    public AnonymousClass0Dp A01;
    public AnonymousClass0P9 A02 = new AnonymousClass0P9();
    public C12350kF A03 = null;
    public ArrayList A04 = AnonymousClass000.A0u();
    public ArrayList A05 = AnonymousClass000.A0u();
    public ArrayList A06 = AnonymousClass000.A0u();
    public boolean A07 = true;
    public boolean A08 = true;

    public AnonymousClass0SC(AnonymousClass0Dp r2) {
        this.A00 = r2;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if ((r11 instanceof X.AnonymousClass0Dw) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        if ((r11 instanceof X.AnonymousClass0Dv) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r0 = r3.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r23 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass0Dp r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r0 = r0.A04
            r20 = r0
            int r19 = r20.size()
            r6 = 0
            r12 = 0
        L_0x000d:
            r0 = r19
            if (r12 >= r0) goto L_0x00e1
            r0 = r20
            java.lang.Object r2 = r0.get(r12)
            X.0QQ r2 = (X.AnonymousClass0QQ) r2
            X.0ar r11 = r2.A00
            boolean r0 = r11 instanceof X.AnonymousClass0Du
            r4 = 0
            r3 = r22
            r13 = r23
            if (r0 == 0) goto L_0x00cf
            int r0 = r11.A01
            if (r0 != r13) goto L_0x00d5
            if (r23 != 0) goto L_0x00dd
        L_0x002b:
            X.0Dw r0 = r3.A0c
        L_0x002d:
            X.0aq r1 = r0.A05
            if (r23 != 0) goto L_0x00cb
            X.0Dw r0 = r3.A0c
        L_0x0033:
            X.0aq r3 = r0.A04
            X.0aq r14 = r11.A05
            java.util.List r0 = r14.A08
            boolean r1 = r0.contains(r1)
            X.0aq r10 = r11.A04
            java.util.List r0 = r10.A08
            boolean r0 = r0.contains(r3)
            long r17 = r11.A0A()
            if (r1 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00a0
            long r8 = r2.A01(r14, r4)
            long r15 = r2.A00(r10, r4)
            long r8 = r8 - r17
            int r2 = r10.A00
            int r0 = -r2
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0061
            long r0 = (long) r2
            long r8 = r8 + r0
        L_0x0061:
            long r2 = -r15
            long r2 = r2 - r17
            int r0 = r14.A00
            long r0 = (long) r0
            long r2 = r2 - r0
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x006d
            long r2 = r2 - r0
        L_0x006d:
            X.0SN r11 = r11.A03
            if (r23 != 0) goto L_0x009d
            float r11 = r11.A02
        L_0x0073:
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x0082
            float r4 = (float) r2
            float r4 = r4 / r11
            float r3 = (float) r8
            float r2 = r14 - r11
            float r3 = r3 / r2
            float r4 = r4 + r3
            long r4 = (long) r4
        L_0x0082:
            float r8 = (float) r4
            float r3 = r8 * r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            long r4 = (long) r3
            float r14 = r14 - r11
            float r8 = r8 * r14
            float r8 = r8 + r2
            long r2 = (long) r8
            long r4 = r4 + r17
            long r4 = r4 + r2
            long r0 = r0 + r4
        L_0x0091:
            int r2 = r10.A00
            long r2 = (long) r2
            long r0 = r0 - r2
        L_0x0095:
            long r6 = java.lang.Math.max(r6, r0)
            int r12 = r12 + 1
            goto L_0x000d
        L_0x009d:
            float r11 = r11.A06
            goto L_0x0073
        L_0x00a0:
            int r0 = r14.A00
            long r0 = (long) r0
            long r1 = r2.A01(r14, r0)
            int r0 = r14.A00
            long r3 = (long) r0
            long r3 = r3 + r17
            goto L_0x00bd
        L_0x00ad:
            if (r0 == 0) goto L_0x00c2
            int r0 = r10.A00
            long r0 = (long) r0
            long r8 = r2.A00(r10, r0)
            int r0 = r10.A00
            int r0 = -r0
            long r3 = (long) r0
            long r3 = r3 + r17
            long r1 = -r8
        L_0x00bd:
            long r0 = java.lang.Math.max(r1, r3)
            goto L_0x0095
        L_0x00c2:
            int r0 = r14.A00
            long r0 = (long) r0
            long r2 = r11.A0A()
            long r0 = r0 + r2
            goto L_0x0091
        L_0x00cb:
            X.0Dv r0 = r3.A0d
            goto L_0x0033
        L_0x00cf:
            if (r23 != 0) goto L_0x00d8
            boolean r0 = r11 instanceof X.AnonymousClass0Dw
            if (r0 != 0) goto L_0x002b
        L_0x00d5:
            r0 = 0
            goto L_0x0095
        L_0x00d8:
            boolean r0 = r11 instanceof X.AnonymousClass0Dv
            if (r0 != 0) goto L_0x00dd
            goto L_0x00d5
        L_0x00dd:
            X.0Dv r0 = r3.A0d
            goto L_0x002d
        L_0x00e1:
            int r0 = (int) r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SC.A00(X.0Dp, int):int");
    }

    public void A01() {
        ArrayList arrayList = this.A05;
        arrayList.clear();
        AnonymousClass0Dp r3 = this.A01;
        AnonymousClass0Dw r1 = r3.A0c;
        r1.A0D();
        AnonymousClass0Dv r0 = r3.A0d;
        r0.A0D();
        arrayList.add(r1);
        arrayList.add(r0);
        Iterator it = r3.A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            AnonymousClass0SN r4 = (AnonymousClass0SN) it.next();
            if (r4 instanceof AnonymousClass0Dl) {
                arrayList.add(new AnonymousClass0Ds(r4));
            } else {
                if (r4.A0J()) {
                    AnonymousClass0Du r12 = r4.A0a;
                    if (r12 == null) {
                        r12 = new AnonymousClass0Du(r4, 0);
                        r4.A0a = r12;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r12);
                } else {
                    arrayList.add(r4.A0c);
                }
                if (r4.A0K()) {
                    AnonymousClass0Du r13 = r4.A0b;
                    if (r13 == null) {
                        r13 = new AnonymousClass0Du(r4, 1);
                        r4.A0b = r13;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r13);
                } else {
                    arrayList.add(r4.A0d);
                }
                if (r4 instanceof AnonymousClass0Do) {
                    arrayList.add(new AnonymousClass0Dt(r4));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C07250ar) it2.next()).A0D();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C07250ar r14 = (C07250ar) it3.next();
            if (r14.A03 != r3) {
                r14.A0B();
            }
        }
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        AnonymousClass0QQ.A03 = 0;
        AnonymousClass0Dp r15 = this.A00;
        A06(r15.A0c, arrayList2, 0);
        A06(r15.A0d, arrayList2, 1);
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r6 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r7 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r4.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r4.A02(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r21 = this;
            r11 = r21
            X.0Dp r0 = r11.A00
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r14 = r10.next()
            X.0SN r14 = (X.AnonymousClass0SN) r14
            boolean r0 = r14.A0i
            if (r0 != 0) goto L_0x000a
            X.0Jy[] r0 = r14.A0o
            r9 = 0
            r7 = r0[r9]
            r3 = 1
            r6 = r0[r3]
            int r2 = r14.A0D
            int r1 = r14.A0C
            X.0Jy r12 = X.C03810Jy.WRAP_CONTENT
            if (r7 == r12) goto L_0x0030
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r7 != r0) goto L_0x00a2
            if (r2 != r3) goto L_0x00a2
        L_0x0030:
            r8 = 1
        L_0x0031:
            if (r6 == r12) goto L_0x0039
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r6 != r0) goto L_0x003a
            if (r1 != r3) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            X.0Dw r0 = r14.A0c
            X.0Dr r5 = r0.A06
            boolean r1 = r5.A0B
            X.0Dv r2 = r14.A0d
            X.0Dr r4 = r2.A06
            boolean r0 = r4.A0B
            if (r1 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0066
            X.0Jy r12 = X.C03810Jy.FIXED
            int r15 = r5.A02
            int r0 = r4.A02
            r13 = r12
            r16 = r0
            r11.A03(r12, r13, r14, r15, r16)
        L_0x0056:
            r14.A0i = r3
        L_0x0058:
            boolean r0 = r14.A0i
            if (r0 == 0) goto L_0x000a
            X.0Dr r1 = r2.A01
            if (r1 == 0) goto L_0x000a
            int r0 = r14.A07
            r1.A02(r0)
            goto L_0x000a
        L_0x0066:
            if (r9 == 0) goto L_0x0058
            X.0Jy r16 = X.C03810Jy.FIXED
            int r1 = r5.A02
            int r0 = r4.A02
            r15 = r11
            r17 = r12
            r18 = r14
            r19 = r1
            r20 = r0
            r15.A03(r16, r17, r18, r19, r20)
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            int r1 = r14.A03()
            if (r6 != r0) goto L_0x009e
            goto L_0x009b
        L_0x0083:
            if (r0 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            int r15 = r5.A02
            X.0Jy r13 = X.C03810Jy.FIXED
            int r0 = r4.A02
            r16 = r0
            r11.A03(r12, r13, r14, r15, r16)
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            r4 = r5
            int r1 = r14.A04()
            if (r7 != r0) goto L_0x009e
        L_0x009b:
            r4.A00 = r1
            goto L_0x0058
        L_0x009e:
            r4.A02(r1)
            goto L_0x0056
        L_0x00a2:
            r8 = 0
            goto L_0x0031
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SC.A02():void");
    }

    public final void A03(C03810Jy r3, C03810Jy r4, AnonymousClass0SN r5, int i2, int i3) {
        AnonymousClass0P9 r1 = this.A02;
        r1.A05 = r3;
        r1.A06 = r4;
        r1.A00 = i2;
        r1.A04 = i3;
        this.A03.ALY(r5, r1);
        r5.A0A(r1.A03);
        r5.A09(r1.A02);
        r5.A0h = r1.A07;
        int i4 = r1.A01;
        r5.A07 = i4;
        r5.A0h = AnonymousClass000.A1Q(i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d0, code lost:
        if (r15[3].A03 != null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0217, code lost:
        if (r16[1].A03 != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0237, code lost:
        if (r1.A0C == 0) goto L_0x0227;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass0Dp r28) {
        /*
            r27 = this;
            r26 = r28
            r0 = r26
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r18 = r0.iterator()
        L_0x000a:
            boolean r0 = r18.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x023a
            java.lang.Object r1 = r18.next()
            X.0SN r1 = (X.AnonymousClass0SN) r1
            X.0Jy[] r0 = r1.A0o
            r10 = r0[r2]
            r6 = 1
            r9 = r0[r6]
            int r3 = r1.A0N
            r0 = 8
            if (r3 == r0) goto L_0x00f7
            float r11 = r1.A04
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r10 != r0) goto L_0x0033
            r0 = 2
            r1.A0D = r0
        L_0x0033:
            float r8 = r1.A03
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r9 != r0) goto L_0x0040
            r0 = 2
            r1.A0C = r0
        L_0x0040:
            float r3 = r1.A01
            r0 = 0
            r12 = 3
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            X.0Jy r3 = X.C03810Jy.MATCH_CONSTRAINT
            if (r10 != r3) goto L_0x021d
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            if (r9 == r0) goto L_0x0054
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r9 != r0) goto L_0x021d
        L_0x0054:
            r1.A0D = r12
        L_0x0056:
            X.0Jy r7 = X.C03810Jy.MATCH_CONSTRAINT
            if (r10 != r7) goto L_0x006c
            int r0 = r1.A0D
            if (r0 != r6) goto L_0x006c
            X.0S1 r0 = r1.A0W
            X.0S1 r0 = r0.A03
            if (r0 == 0) goto L_0x006a
            X.0S1 r0 = r1.A0X
            X.0S1 r0 = r0.A03
            if (r0 != 0) goto L_0x006c
        L_0x006a:
            X.0Jy r10 = X.C03810Jy.WRAP_CONTENT
        L_0x006c:
            if (r9 != r7) goto L_0x0080
            int r0 = r1.A0C
            if (r0 != r6) goto L_0x0080
            X.0S1 r0 = r1.A0Y
            X.0S1 r0 = r0.A03
            if (r0 == 0) goto L_0x007e
            X.0S1 r0 = r1.A0S
            X.0S1 r0 = r0.A03
            if (r0 != 0) goto L_0x0080
        L_0x007e:
            X.0Jy r9 = X.C03810Jy.WRAP_CONTENT
        L_0x0080:
            X.0Dw r3 = r1.A0c
            r3.A02 = r10
            int r5 = r1.A0D
            r3.A00 = r5
            X.0Dv r0 = r1.A0d
            r25 = r0
            r0.A02 = r9
            int r14 = r1.A0C
            r0.A00 = r14
            X.0Jy r13 = X.C03810Jy.MATCH_PARENT
            r19 = r27
            if (r10 == r13) goto L_0x00a0
            X.0Jy r4 = X.C03810Jy.FIXED
            if (r10 == r4) goto L_0x00a0
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            if (r10 != r0) goto L_0x00fb
        L_0x00a0:
            if (r9 == r13) goto L_0x00aa
            X.0Jy r4 = X.C03810Jy.FIXED
            if (r9 == r4) goto L_0x00aa
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            if (r9 != r0) goto L_0x00fb
        L_0x00aa:
            int r2 = r1.A04()
            if (r10 != r13) goto L_0x00c0
            int r2 = r26.A04()
            X.0S1 r0 = r1.A0W
            int r0 = r0.A01
            int r2 = r2 - r0
            X.0S1 r0 = r1.A0X
            int r0 = r0.A01
            int r2 = r2 - r0
            X.0Jy r10 = X.C03810Jy.FIXED
        L_0x00c0:
            int r5 = r1.A03()
            if (r9 != r13) goto L_0x00d6
            int r5 = r26.A03()
            X.0S1 r0 = r1.A0Y
            int r0 = r0.A01
            int r5 = r5 - r0
            X.0S1 r0 = r1.A0S
            int r0 = r0.A01
            int r5 = r5 - r0
            X.0Jy r9 = X.C03810Jy.FIXED
        L_0x00d6:
            r20 = r10
            r21 = r9
            r22 = r1
            r23 = r2
            r24 = r5
            r19.A03(r20, r21, r22, r23, r24)
            X.0Dr r2 = r3.A06
            int r0 = r1.A04()
            r2.A02(r0)
            r0 = r25
            X.0Dr r2 = r0.A06
            int r0 = r1.A03()
            r2.A02(r0)
        L_0x00f7:
            r1.A0i = r6
            goto L_0x000a
        L_0x00fb:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r10 != r7) goto L_0x0122
            if (r9 == r0) goto L_0x0103
            if (r9 != r4) goto L_0x0122
        L_0x0103:
            if (r5 != r12) goto L_0x01d3
            if (r9 != r0) goto L_0x0114
            r21 = r0
            r23 = 0
            r24 = 0
            r20 = r0
            r22 = r1
            r19.A03(r20, r21, r22, r23, r24)
        L_0x0114:
            int r5 = r1.A03()
            float r2 = (float) r5
            float r0 = r1.A01
            float r2 = r2 * r0
            float r2 = r2 + r17
            int r2 = (int) r2
        L_0x011f:
            r10 = r4
        L_0x0120:
            r9 = r4
            goto L_0x00d6
        L_0x0122:
            if (r9 != r7) goto L_0x014e
            if (r10 == r0) goto L_0x0128
            if (r10 != r4) goto L_0x014e
        L_0x0128:
            if (r14 != r12) goto L_0x0190
            if (r10 != r0) goto L_0x0139
            r21 = r0
            r23 = 0
            r24 = 0
            r20 = r0
            r22 = r1
            r19.A03(r20, r21, r22, r23, r24)
        L_0x0139:
            int r2 = r1.A04()
            float r7 = r1.A01
            int r5 = r1.A08
            r0 = -1
            if (r5 != r0) goto L_0x0148
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r0 / r7
        L_0x0148:
            float r8 = (float) r2
        L_0x0149:
            float r8 = r8 * r7
            float r8 = r8 + r17
            int r5 = (int) r8
            goto L_0x011f
        L_0x014e:
            if (r10 != r7) goto L_0x000a
            if (r9 != r7) goto L_0x000a
            if (r5 == r6) goto L_0x017a
            if (r14 == r6) goto L_0x017a
            r0 = 2
            if (r14 != r0) goto L_0x000a
            if (r5 != r0) goto L_0x000a
            r0 = r26
            X.0Jy[] r5 = r0.A0o
            r0 = r5[r2]
            if (r0 == r4) goto L_0x0165
            if (r0 != r4) goto L_0x000a
        L_0x0165:
            r0 = r5[r6]
            if (r0 == r4) goto L_0x016b
            if (r0 != r4) goto L_0x000a
        L_0x016b:
            int r0 = r26.A04()
            float r0 = (float) r0
            float r11 = r11 * r0
            float r11 = r11 + r17
            int r2 = (int) r11
            int r0 = r26.A03()
            float r7 = (float) r0
            goto L_0x0149
        L_0x017a:
            r21 = r0
            r23 = 0
            r24 = 0
            r20 = r0
            r22 = r1
            r19.A03(r20, r21, r22, r23, r24)
            X.0Dr r2 = r3.A06
            int r0 = r1.A04()
            r2.A00 = r0
            goto L_0x019c
        L_0x0190:
            if (r14 != r6) goto L_0x01a5
            r6 = 0
            r7 = 0
            r2 = r19
            r3 = r10
            r4 = r0
            r5 = r1
            r2.A03(r3, r4, r5, r6, r7)
        L_0x019c:
            r0 = r25
            X.0Dr r2 = r0.A06
            int r0 = r1.A03()
            goto L_0x01e8
        L_0x01a5:
            r16 = 2
            r15 = r16
            if (r14 != r15) goto L_0x01c4
            r12 = r26
            X.0Jy[] r12 = r12.A0o
            r12 = r12[r6]
            if (r12 == r4) goto L_0x01b5
            if (r12 != r13) goto L_0x014e
        L_0x01b5:
            int r2 = r1.A04()
            int r0 = r26.A03()
            float r0 = (float) r0
            float r8 = r8 * r0
            float r8 = r8 + r17
            int r5 = (int) r8
            goto L_0x0120
        L_0x01c4:
            X.0S1[] r15 = r1.A0n
            r13 = r15[r16]
            X.0S1 r13 = r13.A03
            if (r13 == 0) goto L_0x0219
            r12 = r15[r12]
            X.0S1 r12 = r12.A03
            if (r12 != 0) goto L_0x014e
            goto L_0x0219
        L_0x01d3:
            if (r5 != r6) goto L_0x01ec
            r23 = 0
            r24 = 0
            r20 = r0
            r21 = r9
            r22 = r1
            r19.A03(r20, r21, r22, r23, r24)
            X.0Dr r2 = r3.A06
            int r0 = r1.A04()
        L_0x01e8:
            r2.A00 = r0
            goto L_0x000a
        L_0x01ec:
            r15 = 2
            if (r5 != r15) goto L_0x0209
            r15 = r26
            X.0Jy[] r15 = r15.A0o
            r15 = r15[r2]
            if (r15 == r4) goto L_0x01f9
            if (r15 != r13) goto L_0x0122
        L_0x01f9:
            int r0 = r26.A04()
            float r0 = (float) r0
            float r11 = r11 * r0
            float r11 = r11 + r17
            int r2 = (int) r11
            int r5 = r1.A03()
            r10 = r4
            goto L_0x00d6
        L_0x0209:
            X.0S1[] r15 = r1.A0n
            r16 = r15
            r15 = r15[r2]
            X.0S1 r15 = r15.A03
            if (r15 == 0) goto L_0x0219
            r15 = r16[r6]
            X.0S1 r15 = r15.A03
            if (r15 != 0) goto L_0x0122
        L_0x0219:
            r10 = r0
            r5 = 0
            goto L_0x00d6
        L_0x021d:
            if (r9 != r3) goto L_0x022b
            X.0Jy r0 = X.C03810Jy.WRAP_CONTENT
            if (r10 == r0) goto L_0x0227
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r10 != r0) goto L_0x022b
        L_0x0227:
            r1.A0C = r12
            goto L_0x0056
        L_0x022b:
            if (r10 != r3) goto L_0x0056
            if (r9 != r3) goto L_0x0056
            int r0 = r1.A0D
            if (r0 != 0) goto L_0x0235
            r1.A0D = r12
        L_0x0235:
            int r0 = r1.A0C
            if (r0 != 0) goto L_0x0056
            goto L_0x0227
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SC.A04(X.0Dp):void");
    }

    public final void A05(C07240aq r19, C07240aq r20, AnonymousClass0QQ r21, ArrayList arrayList, int i2) {
        C07240aq r8;
        int i3;
        AnonymousClass0QQ r9 = r21;
        C07250ar r2 = r19.A06;
        if (r2.A07 == null) {
            AnonymousClass0Dp r1 = this.A00;
            if (r2 != r1.A0c && r2 != r1.A0d) {
                ArrayList arrayList2 = arrayList;
                if (r21 == null) {
                    r9 = new AnonymousClass0QQ(r2);
                    arrayList2.add(r9);
                }
                r2.A07 = r9;
                r9.A02.add(r2);
                r9.A01 = r2;
                C07240aq r5 = r2.A05;
                Iterator it = r5.A07.iterator();
                while (true) {
                    r8 = r20;
                    i3 = i2;
                    if (!it.hasNext()) {
                        break;
                    }
                    C12360kG r7 = (C12360kG) it.next();
                    if (r7 instanceof C07240aq) {
                        A05((C07240aq) r7, r8, r9, arrayList2, i3);
                    }
                }
                C07240aq r4 = r2.A04;
                for (C12360kG r72 : r4.A07) {
                    if (r72 instanceof C07240aq) {
                        A05((C07240aq) r72, r8, r9, arrayList2, i3);
                    }
                }
                if (i3 == 1 && (r2 instanceof AnonymousClass0Dv)) {
                    for (C12360kG r13 : ((AnonymousClass0Dv) r2).A00.A07) {
                        if (r13 instanceof C07240aq) {
                            A05((C07240aq) r13, r8, r9, arrayList2, 1);
                        }
                    }
                }
                for (C07240aq A052 : r5.A08) {
                    A05(A052, r8, r9, arrayList2, i3);
                }
                for (C07240aq A053 : r4.A08) {
                    A05(A053, r8, r9, arrayList2, i3);
                }
                if (i3 == 1 && (r2 instanceof AnonymousClass0Dv)) {
                    for (C07240aq A054 : ((AnonymousClass0Dv) r2).A00.A08) {
                        A05(A054, r8, r9, arrayList2, 1);
                    }
                }
            }
        }
    }

    public final void A06(C07250ar r15, ArrayList arrayList, int i2) {
        ArrayList arrayList2;
        int i3;
        C07240aq r9;
        C07240aq r3;
        C07240aq r10 = r15.A05;
        Iterator it = r10.A07.iterator();
        while (true) {
            arrayList2 = arrayList;
            i3 = i2;
            if (!it.hasNext()) {
                break;
            }
            C12360kG r32 = (C12360kG) it.next();
            if (r32 instanceof C07240aq) {
                r3 = (C07240aq) r32;
            } else if (r32 instanceof C07250ar) {
                r3 = ((C07250ar) r32).A05;
            }
            A05(r3, r15.A04, (AnonymousClass0QQ) null, arrayList2, i3);
        }
        for (C12360kG r92 : r15.A04.A07) {
            if (r92 instanceof C07240aq) {
                r9 = (C07240aq) r92;
            } else if (r92 instanceof C07250ar) {
                r9 = ((C07250ar) r92).A04;
            }
            A05(r9, r10, (AnonymousClass0QQ) null, arrayList2, i3);
        }
        if (i3 == 1) {
            for (C12360kG r33 : ((AnonymousClass0Dv) r15).A00.A07) {
                if (r33 instanceof C07240aq) {
                    A05((C07240aq) r33, (C07240aq) null, (AnonymousClass0QQ) null, arrayList2, 1);
                }
            }
        }
    }
}
