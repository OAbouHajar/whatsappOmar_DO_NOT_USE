package X;

/* renamed from: X.4SH  reason: invalid class name */
public final class AnonymousClass4SH {
    public float A00 = -3.4028235E38f;
    public float A01 = -3.4028235E38f;
    public float A02 = 1.0f;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = Integer.MIN_VALUE;
    public int A06 = 2;
    public int A07 = Integer.MIN_VALUE;
    public long A08 = 0;
    public long A09 = 0;
    public CharSequence A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1 == 5) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r2 == 0) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C88794b6 A00() {
        /*
            r8 = this;
            float r3 = r8.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r1 = r8.A06
            r0 = 4
            if (r1 == r0) goto L_0x008d
            r0 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x0015
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0015:
            int r5 = r8.A05
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r0) goto L_0x002b
            int r1 = r8.A06
            r0 = 1
            if (r1 == r0) goto L_0x008b
            r0 = 3
            if (r1 == r0) goto L_0x002a
            r0 = 4
            if (r1 == r0) goto L_0x008b
            r0 = 5
            r5 = 1
            if (r1 != r0) goto L_0x002b
        L_0x002a:
            r5 = 2
        L_0x002b:
            X.4b6 r4 = new X.4b6
            r4.<init>()
            int r1 = r8.A06
            r0 = 1
            if (r1 == r0) goto L_0x0088
            r0 = 2
            if (r1 == r0) goto L_0x0085
            r0 = 3
            if (r1 == r0) goto L_0x003e
            r0 = 4
            if (r1 == r0) goto L_0x0088
        L_0x003e:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x0040:
            r4.A0D = r0
            float r7 = r8.A00
            int r2 = r8.A04
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            if (r2 != 0) goto L_0x007b
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
        L_0x005a:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x005c:
            r4.A01 = r7
            r4.A07 = r2
            int r0 = r8.A03
            r4.A06 = r0
            r4.A02 = r3
            r4.A08 = r5
            float r2 = r8.A02
            if (r5 == 0) goto L_0x008f
            r0 = 1
            if (r5 == r0) goto L_0x0095
            r0 = 2
            if (r5 == r0) goto L_0x009e
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x007b:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r2 != 0) goto L_0x005c
            goto L_0x005a
        L_0x0085:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0040
        L_0x0088:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0040
        L_0x008b:
            r5 = 0
            goto L_0x002b
        L_0x008d:
            r3 = 0
            goto L_0x0015
        L_0x008f:
            float r6 = r6 - r3
            goto L_0x0093
        L_0x0091:
            float r6 = r6 - r3
            float r6 = r6 * r1
        L_0x0093:
            r3 = r6
            goto L_0x009e
        L_0x0095:
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0091
            float r3 = r3 * r1
        L_0x009e:
            float r0 = java.lang.Math.min(r2, r3)
            r4.A04 = r0
            int r0 = r8.A07
            r4.A0A = r0
            java.lang.CharSequence r0 = r8.A0A
            if (r0 == 0) goto L_0x00ae
            r4.A0E = r0
        L_0x00ae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SH.A00():X.4b6");
    }
}
