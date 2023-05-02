package X;

/* renamed from: X.21N  reason: invalid class name */
public class AnonymousClass21N {
    public static final AnonymousClass21N A03 = new AnonymousClass21N(0, 0, 0);
    public final long A00;
    public final long A01;
    public final long A02;

    public AnonymousClass21N(long j2, long j3, long j4) {
        this.A00 = j2;
        this.A02 = j3;
        this.A01 = j4;
    }

    public int A00() {
        if (this.A01 > 0) {
            return 8;
        }
        if (this.A02 > 0) {
            return 13;
        }
        return this.A00 > 0 ? 5 : 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 != 13) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(int r6) {
        /*
            r5 = this;
            r0 = 5
            r3 = 0
            if (r6 == r0) goto L_0x000e
            r0 = 8
            if (r6 == r0) goto L_0x001c
            r0 = 13
            if (r6 == r0) goto L_0x0015
        L_0x000d:
            return r3
        L_0x000e:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            return r1
        L_0x0015:
            long r1 = r5.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            return r1
        L_0x001c:
            long r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass21N.A01(int):long");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.A00);
        sb.append("/");
        sb.append(this.A02);
        sb.append("/");
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }
}
