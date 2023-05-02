package X;

/* renamed from: X.20g  reason: invalid class name and case insensitive filesystem */
public class C435020g extends C434520b {
    public int A00;
    public final int A01;
    public final CharSequence A02;

    public C435020g(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A01 = charSequence.length();
    }

    public int A01(int i2, long j2) {
        return j2 != -1 ? A02(i2, j2) : Character.charCount(Character.codePointAt(this.A02, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r1 = java.lang.Character.codePointAt(r5.A02, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r6, long r7) {
        /*
            r5 = this;
            r0 = 15
            long r7 = r7 & r0
            int r4 = (int) r7
            r3 = 0
            r2 = 0
        L_0x0006:
            if (r3 >= r4) goto L_0x001f
            java.lang.CharSequence r1 = r5.A02
            int r0 = r6 + r2
            int r1 = java.lang.Character.codePointAt(r1, r0)
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 != r0) goto L_0x001c
            int r3 = r3 + -1
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001f:
            int r6 = r6 + r2
            int r0 = r5.A01
            if (r6 >= r0) goto L_0x0034
            java.lang.CharSequence r0 = r5.A02
            int r1 = java.lang.Character.codePointAt(r0, r6)
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 != r0) goto L_0x0034
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435020g.A02(int, long):int");
    }
}
