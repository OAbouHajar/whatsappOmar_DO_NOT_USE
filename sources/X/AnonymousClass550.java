package X;

/* renamed from: X.550  reason: invalid class name */
public final class AnonymousClass550 implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r11 == null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass550(X.C32491gT r9, X.C65583Vi r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r8.<init>()
            r2 = 0
            r3 = r12 & 7
            r1 = 4
            r0 = 1
            if (r3 == r1) goto L_0x000b
            r0 = 0
        L_0x000b:
            r8.A08 = r0
            int r1 = r9.A0G
            int r0 = r10.A00
            r0 = r0 ^ -1
            r1 = r1 & r0
            r0 = r1 & 1
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r8.A05 = r0
            r0 = r1 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r8.A06 = r0
            r7 = 2147483647(0x7fffffff, float:NaN)
            X.1kb r5 = r10.A04
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = ""
            X.1kb r6 = X.C34641kb.of(r0)
        L_0x0035:
            r3 = 0
        L_0x0036:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x0093
            java.lang.String r1 = X.AnonymousClass000.A0n(r6, r3)
            boolean r0 = r10.A05
            int r4 = X.C65593Vj.A00(r9, r1, r0)
            if (r4 <= 0) goto L_0x0090
            r7 = r3
        L_0x0049:
            r8.A00 = r7
            r8.A01 = r4
            int r1 = r9.A0D
            int r0 = r10.A02
            r0 = r0 & r1
            int r3 = java.lang.Integer.bitCount(r0)
            r8.A02 = r3
            r0 = r1 & 1088(0x440, float:1.525E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r8.A04 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r11, r0)
            if (r0 != 0) goto L_0x0071
            r0 = 0
            if (r11 != 0) goto L_0x0072
        L_0x0071:
            r0 = 1
        L_0x0072:
            int r1 = X.C65593Vj.A00(r9, r11, r0)
            r8.A03 = r1
            if (r4 > 0) goto L_0x008c
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0082
            if (r3 > 0) goto L_0x008c
        L_0x0082:
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x008c
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x008d
            if (r1 <= 0) goto L_0x008d
        L_0x008c:
            r2 = 1
        L_0x008d:
            r8.A07 = r2
            return
        L_0x0090:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0093:
            r4 = 0
            goto L_0x0049
        L_0x0095:
            r6 = r5
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass550.<init>(X.1gT, X.3Vi, java.lang.String, int):void");
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass550 r7) {
        C90794ep A002 = AnonymousClass57I.A00(C90794ep.start().compareFalseFirst(this.A08, r7.A08), Integer.valueOf(this.A00), r7.A00);
        int i2 = this.A01;
        C90794ep compare = A002.compare(i2, r7.A01);
        int i3 = this.A02;
        C90794ep compareFalseFirst = compare.compare(i3, r7.A02).compareFalseFirst(this.A05, r7.A05);
        Boolean valueOf = Boolean.valueOf(this.A06);
        Boolean valueOf2 = Boolean.valueOf(r7.A06);
        AnonymousClass57I natural = AnonymousClass57I.natural();
        if (i2 != 0) {
            natural = natural.reverse();
        }
        C90794ep compare2 = compareFalseFirst.compare(valueOf, valueOf2, natural).compare(this.A03, r7.A03);
        if (i3 == 0) {
            compare2 = compare2.compareTrueFirst(this.A04, r7.A04);
        }
        return compare2.result();
    }
}
