package X;

/* renamed from: X.54z  reason: invalid class name and case insensitive filesystem */
public final class C1043554z implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C65583Vi A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0051, code lost:
        if (r1 < ((float) r8.A07)) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r1 < r8.A06) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0091 A[EDGE_INSN: B:58:0x0091->B:53:0x0091 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1043554z(X.C32491gT r7, X.C65583Vi r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.A03 = r8
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            r4 = 0
            r3 = -1
            if (r10 == 0) goto L_0x0099
            int r1 = r7.A0I
            if (r1 == r3) goto L_0x0014
            int r0 = r8.A05
            if (r1 > r0) goto L_0x0099
        L_0x0014:
            int r1 = r7.A09
            if (r1 == r3) goto L_0x001c
            int r0 = r8.A04
            if (r1 > r0) goto L_0x0099
        L_0x001c:
            float r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            int r0 = r8.A03
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0099
        L_0x0029:
            int r1 = r7.A05
            if (r1 == r3) goto L_0x0031
            int r0 = r8.A02
            if (r1 > r0) goto L_0x0099
        L_0x0031:
            r0 = 1
        L_0x0032:
            r6.A04 = r0
            if (r10 == 0) goto L_0x0097
            int r1 = r7.A0I
            if (r1 == r3) goto L_0x003e
            int r0 = r8.A09
            if (r1 < r0) goto L_0x0097
        L_0x003e:
            int r1 = r7.A09
            if (r1 == r3) goto L_0x0046
            int r0 = r8.A08
            if (r1 < r0) goto L_0x0097
        L_0x0046:
            float r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            int r0 = r8.A07
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
        L_0x0053:
            int r1 = r7.A05
            if (r1 == r3) goto L_0x005b
            int r0 = r8.A06
            if (r1 < r0) goto L_0x0097
        L_0x005b:
            r6.A05 = r2
            r2 = r9 & 7
            r1 = 4
            r0 = 1
            if (r2 == r1) goto L_0x0064
            r0 = 0
        L_0x0064:
            r6.A06 = r0
            int r0 = r7.A05
            r6.A00 = r0
            int r2 = r7.A0I
            r1 = -1
            if (r2 == r3) goto L_0x0075
            int r0 = r7.A09
            if (r0 == r3) goto L_0x0075
            int r1 = r2 * r0
        L_0x0075:
            r6.A01 = r1
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x007a:
            X.1kb r2 = r8.A0F
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x0091
            java.lang.String r1 = r7.A0T
            if (r1 == 0) goto L_0x0094
            java.lang.Object r0 = r2.get(r4)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0094
            r3 = r4
        L_0x0091:
            r6.A02 = r3
            return
        L_0x0094:
            int r4 = r4 + 1
            goto L_0x007a
        L_0x0097:
            r2 = 0
            goto L_0x005b
        L_0x0099:
            r0 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043554z.<init>(X.1gT, X.3Vi, int, boolean):void");
    }

    /* renamed from: A00 */
    public int compareTo(C1043554z r8) {
        AnonymousClass57I r6;
        AnonymousClass57I reverse;
        boolean z2 = this.A04;
        if (!z2 || !this.A06) {
            r6 = C65593Vj.A03;
            reverse = r6.reverse();
        } else {
            r6 = C65593Vj.A03;
            reverse = r6;
        }
        C90794ep A002 = AnonymousClass57I.A00(C90794ep.start().compareFalseFirst(this.A06, r8.A06).compareFalseFirst(z2, r8.A04).compareFalseFirst(this.A05, r8.A05), Integer.valueOf(this.A02), r8.A02);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        return A002.compare(valueOf, valueOf2, this.A03.A0Q ? r6.reverse() : C65593Vj.A04).compare(Integer.valueOf(this.A01), Integer.valueOf(r8.A01), reverse).compare(valueOf, valueOf2, reverse).result();
    }
}
