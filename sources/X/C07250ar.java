package X;

import java.util.List;

/* renamed from: X.0ar  reason: invalid class name and case insensitive filesystem */
public abstract class C07250ar implements C12360kG {
    public int A00;
    public int A01 = 0;
    public C03810Jy A02;
    public AnonymousClass0SN A03;
    public C07240aq A04 = new C07240aq(this);
    public C07240aq A05 = new C07240aq(this);
    public AnonymousClass0Dr A06 = new AnonymousClass0Dr(this);
    public AnonymousClass0QQ A07;
    public AnonymousClass0JT A08 = AnonymousClass0JT.NONE;
    public boolean A09 = false;

    public C07250ar(AnonymousClass0SN r2) {
        this.A03 = r2;
    }

    public static final C07240aq A02(AnonymousClass0S1 r2) {
        AnonymousClass0S1 r0 = r2.A03;
        if (r0 != null) {
            AnonymousClass0SN r1 = r0.A06;
            switch (r0.A05.ordinal()) {
                case 1:
                    return r1.A0c.A05;
                case 2:
                    return r1.A0d.A05;
                case 3:
                    return r1.A0c.A04;
                case 4:
                    return r1.A0d.A04;
                case 5:
                    return r1.A0d.A00;
            }
        }
        return null;
    }

    public static final C07240aq A03(AnonymousClass0S1 r3, int i2) {
        AnonymousClass0S1 r32 = r3.A03;
        if (r32 != null) {
            AnonymousClass0SN r0 = r32.A06;
            C07250ar r1 = i2 == 0 ? r0.A0c : r0.A0d;
            switch (r32.A05.ordinal()) {
                case 1:
                case 2:
                    return r1.A05;
                case 3:
                case 4:
                    return r1.A04;
            }
        }
        return null;
    }

    public static List A04(C07240aq r3, C07250ar r4, C07250ar r5) {
        AnonymousClass0Dr r1 = r4.A06;
        r3.A08.add(r1);
        r1.A07.add(r3);
        r3.A09 = true;
        List list = r3.A07;
        list.add(r5.A05);
        return list;
    }

    public static void A05(AnonymousClass0S1 r0, C07240aq r1, C07240aq r2) {
        A06(r1, r2, -r0.A00());
    }

    public static final void A06(C07240aq r1, C07240aq r2, int i2) {
        r1.A08.add(r2);
        r1.A00 = i2;
        C07240aq.A00(r2, r1);
    }

    public static void A07(C07240aq r3, C07240aq r4, C07240aq r5) {
        int i2 = ((C07240aq) r3.A08.get(0)).A02 + r3.A00;
        int i3 = ((C07240aq) r4.A08.get(0)).A02 + r4.A00;
        r3.A02(i2);
        r4.A02(i3);
        r5.A02(i3 - i2);
    }

    public static void A08(C07240aq r0, Object obj, List list) {
        list.add(r0);
        r0.A08.add(obj);
    }

    public final int A09(int i2, int i3) {
        int i4;
        int i5;
        AnonymousClass0SN r0 = this.A03;
        if (i3 == 0) {
            i4 = r0.A0F;
            i5 = r0.A0H;
        } else {
            i4 = r0.A0E;
            i5 = r0.A0G;
        }
        int max = Math.max(i5, i2);
        if (i4 > 0) {
            max = Math.min(i4, i2);
        }
        return max != i2 ? max : i2;
    }

    public long A0A() {
        AnonymousClass0Dr r1 = this.A06;
        if (r1.A0B) {
            return (long) r1.A02;
        }
        return 0;
    }

    public abstract void A0B();

    public abstract void A0C();

    public abstract void A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1.A00 == 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AnonymousClass0S1 r16, X.AnonymousClass0S1 r17, int r18) {
        /*
            r15 = this;
            X.0aq r7 = A02(r16)
            X.0aq r2 = A02(r17)
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0066
            int r6 = r7.A02
            int r0 = r16.A00()
            int r6 = r6 + r0
            int r5 = r2.A02
            int r0 = r17.A00()
            int r5 = r5 - r0
            int r9 = r5 - r6
            X.0Dr r4 = r15.A06
            boolean r0 = r4.A0B
            r8 = r18
            if (r0 != 0) goto L_0x0054
            X.0Jy r0 = r15.A02
            X.0Jy r13 = X.C03810Jy.MATCH_CONSTRAINT
            if (r0 != r13) goto L_0x0054
            r0 = r9
            int r1 = r15.A00
            if (r1 == 0) goto L_0x00b4
            r10 = 1
            if (r1 == r10) goto L_0x008f
            r0 = 2
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x009a
            r12 = 3
            if (r1 != r12) goto L_0x0054
            X.0SN r11 = r15.A03
            X.0Dw r3 = r11.A0c
            X.0Jy r0 = r3.A02
            if (r0 != r13) goto L_0x00bf
            int r0 = r3.A00
            if (r0 != r12) goto L_0x00bf
            X.0Dv r1 = r11.A0d
            X.0Jy r0 = r1.A02
            if (r0 != r13) goto L_0x00bf
            int r0 = r1.A00
            if (r0 != r12) goto L_0x00bf
        L_0x0054:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0066
            int r1 = r4.A02
            if (r1 != r9) goto L_0x0067
            X.0aq r0 = r15.A05
            r0.A02(r6)
            X.0aq r1 = r15.A04
        L_0x0063:
            r1.A02(r5)
        L_0x0066:
            return
        L_0x0067:
            X.0SN r0 = r15.A03
            if (r18 != 0) goto L_0x008c
            float r3 = r0.A02
        L_0x006d:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r7 != r2) goto L_0x0077
            int r6 = r7.A02
            int r5 = r2.A02
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0077:
            int r5 = r5 - r6
            int r5 = r5 - r1
            X.0aq r2 = r15.A05
            float r1 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A02(r0)
            X.0aq r1 = r15.A04
            int r5 = r2.A02
            int r0 = r4.A02
            int r5 = r5 + r0
            goto L_0x0063
        L_0x008c:
            float r3 = r0.A06
            goto L_0x006d
        L_0x008f:
            int r0 = r4.A00
            int r0 = r15.A09(r0, r8)
            int r0 = java.lang.Math.min(r0, r9)
            goto L_0x00d3
        L_0x009a:
            X.0SN r1 = r15.A03
            X.0SN r0 = r1.A0Z
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00bc
            X.0Dw r0 = r0.A0c
        L_0x00a4:
            X.0Dr r3 = r0.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00b9
            float r1 = r1.A04
        L_0x00ae:
            int r0 = r3.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00b4:
            int r0 = r15.A09(r0, r8)
            goto L_0x00d3
        L_0x00b9:
            float r1 = r1.A03
            goto L_0x00ae
        L_0x00bc:
            X.0Dv r0 = r0.A0d
            goto L_0x00a4
        L_0x00bf:
            if (r18 != 0) goto L_0x00c3
            X.0Dv r3 = r11.A0d
        L_0x00c3:
            X.0Dr r3 = r3.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            float r1 = r11.A01
            int r0 = r3.A02
            float r0 = (float) r0
            if (r8 != r10) goto L_0x00d8
            float r0 = r0 / r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00d3:
            r4.A02(r0)
            goto L_0x0054
        L_0x00d8:
            float r1 = r1 * r0
            float r1 = r1 + r14
            int r0 = (int) r1
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07250ar.A0E(X.0S1, X.0S1, int):void");
    }

    public final void A0F(C07240aq r3, C07240aq r4, AnonymousClass0Dr r5, int i2) {
        List list = r3.A08;
        list.add(r4);
        list.add(this.A06);
        r3.A01 = i2;
        r3.A05 = r5;
        C07240aq.A00(r4, r3);
        C07240aq.A00(r5, r3);
    }

    public abstract boolean A0G();

    public abstract void AhI(C12360kG r1);
}
