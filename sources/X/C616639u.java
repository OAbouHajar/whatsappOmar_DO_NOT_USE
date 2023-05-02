package X;

import java.io.File;

/* renamed from: X.39u  reason: invalid class name and case insensitive filesystem */
public abstract class C616639u {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public C616639u(int[] iArr, int i2, long j2) {
        this.A01 = j2;
        this.A00 = i2;
        if (iArr == null) {
            this.A02 = new int[i2];
        } else {
            this.A02 = iArr;
        }
    }

    public abstract int A00(int i2);

    public int A01(long j2) {
        boolean z2 = true;
        int i2 = 0;
        AnonymousClass00B.A0G(C13700nu.A0f((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
        if (j2 >= this.A01) {
            z2 = false;
        }
        AnonymousClass00B.A0G(z2);
        int i3 = 0;
        while (i2 < this.A00) {
            i3 += A00(i2);
            if (j2 < ((long) i3)) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public long A02() {
        long j2 = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            j2 += A04(i2);
        }
        return j2;
    }

    public long A03(int i2) {
        long j2 = 0;
        int i3 = 0;
        while (i3 < i2 && i3 < this.A00) {
            j2 += (long) A00(i3);
            i3++;
        }
        return j2;
    }

    public final synchronized long A04(int i2) {
        return (long) this.A02[i2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(long r7) {
        /*
            r6 = this;
            long r4 = r6.A01
            r2 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            int r4 = r6.A01(r7)
        L_0x000c:
            int r1 = r6.A00
            if (r4 >= r1) goto L_0x0019
            boolean r0 = r6.A08(r4)
            if (r0 == 0) goto L_0x0019
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0019:
            if (r4 == r1) goto L_0x0024
            long r2 = r6.A03(r4)
            long r0 = r6.A04(r4)
            long r2 = r2 + r0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616639u.A05(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r16 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r3 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.A02[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r1 != ((long) A00(r6))) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        X.C13690nt.A1O(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        throw X.AnonymousClass000.A0V(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A06(long r12, long r14, boolean r16) {
        /*
            r11 = this;
            r10 = r11
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
        L_0x0005:
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            int r7 = r11.A01(r12)
            long r3 = r11.A03(r7)
            long r1 = r12 - r3
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.C13700nu.A0f(r0)
            X.AnonymousClass00B.A0G(r0)
            int r0 = r11.A00(r7)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r6 = 0
        L_0x0029:
            X.AnonymousClass00B.A0G(r6)
            int r6 = r11.A01(r12)
            long r3 = r11.A04(r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            long r1 = r1 + r14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            int r7 = r11.A00(r6)
            long r3 = (long) r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            if (r16 == 0) goto L_0x004e
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x0067 }
            r0[r6] = r7     // Catch:{ all -> 0x0067 }
            monitor-exit(r10)
        L_0x004e:
            long r1 = r1 - r3
            int r3 = r6 + 1
            int r0 = r11.A00
            if (r3 >= r0) goto L_0x007b
            X.C13690nt.A1O(r5, r6)
            long r12 = r11.A03(r3)
            r14 = r1
            goto L_0x0005
        L_0x005e:
            if (r16 == 0) goto L_0x006b
            int r3 = (int) r1
            monitor-enter(r10)
            int[] r0 = r11.A02     // Catch:{ all -> 0x0067 }
            r0[r6] = r3     // Catch:{ all -> 0x0067 }
            goto L_0x006a
        L_0x0067:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x006a:
            monitor-exit(r10)
        L_0x006b:
            int r0 = r11.A00(r6)
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0082
            X.C13690nt.A1O(r5, r6)
            return r5
        L_0x0078:
            java.lang.String r0 = "gap in downloaded chunk"
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = "downloaded more bytes than chunks"
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616639u.A06(long, long, boolean):java.util.List");
    }

    public abstract void A07(File file);

    public synchronized boolean A08(int i2) {
        return AnonymousClass000.A1R(this.A02[i2], A00(i2));
    }

    public synchronized String toString() {
        StringBuilder A0o;
        String str;
        A0o = AnonymousClass000.A0o();
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append("totalBytes: ");
        A0o2.append(this.A01);
        A0o.append(AnonymousClass000.A0h(", ", A0o2));
        StringBuilder A0o3 = AnonymousClass000.A0o();
        A0o3.append("chunkCount: ");
        int i2 = this.A00;
        A0o3.append(i2);
        A0o.append(AnonymousClass000.A0h(", ", A0o3));
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            if (!A08(i4)) {
                if (i3 >= 0) {
                    int i5 = i4 - 1;
                    if (i5 != i3) {
                        StringBuilder A0o4 = AnonymousClass000.A0o();
                        A0o4.append("-");
                        A0o4.append(i5);
                        str = AnonymousClass000.A0h("]", A0o4);
                    } else {
                        str = "]";
                    }
                    A0o.append(str);
                    i3 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i4] > 0) {
                    StringBuilder A0o5 = AnonymousClass000.A0o();
                    A0o5.append("[");
                    A0o5.append(i4);
                    A0o5.append("] ");
                    A0o5.append(iArr[i4]);
                    A0o.append(AnonymousClass000.A0h(", ", A0o5));
                }
            } else if (i3 < 0) {
                A0o.append(C13680ns.A0i("[", AnonymousClass000.A0o(), i4));
                i3 = i4;
            }
        }
        if (i3 >= 0) {
            StringBuilder A0o6 = AnonymousClass000.A0o();
            A0o6.append("[");
            A0o6.append(i3);
            A0o6.append("-");
            A0o6.append(i2 - 1);
            A0o.append(AnonymousClass000.A0h("]", A0o6));
        }
        return A0o.toString();
    }
}
