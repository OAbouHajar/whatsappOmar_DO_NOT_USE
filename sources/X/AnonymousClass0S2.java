package X;

import org.apache.commons.io.IOUtils;

/* renamed from: X.0S2  reason: invalid class name */
public class AnonymousClass0S2 {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public AnonymousClass0WN A04;
    public AnonymousClass0WN A05;
    public AnonymousClass0WN A06;

    public AnonymousClass0S2() {
        AnonymousClass0WN r0 = new AnonymousClass0WN(-1, -1);
        this.A06 = r0;
        r0.A02 = 0;
        r0.A03 = 0;
        r0.A04 = 0;
        this.A04 = r0;
        this.A05 = r0;
        this.A00 = 0;
    }

    public final String A00(AnonymousClass0WN r8, int i2) {
        if (i2 < 0) {
            return "<snip>";
        }
        if (r8 == null) {
            return "\n{x}";
        }
        String A0h = AnonymousClass000.A0h(r8.toString(), AnonymousClass000.A0r(IOUtils.LINE_SEPARATOR_UNIX));
        for (AnonymousClass0WN A002 : r8.A0A) {
            A0h = AnonymousClass000.A0h(A00(A002, i2 - 1).replace(IOUtils.LINE_SEPARATOR_UNIX, "\n-"), AnonymousClass000.A0q(A0h));
        }
        return A0h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0098, code lost:
        X.AnonymousClass0V3.A01(X.AnonymousClass0V3.A0O, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x009d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r14 = this;
            long r2 = java.lang.System.nanoTime()
            int r5 = r14.A01     // Catch:{ all -> 0x0097 }
            r4 = -1
            if (r5 == r4) goto L_0x004c
            int r0 = r14.A02     // Catch:{ all -> 0x0097 }
            int r5 = r5 - r0
            int r1 = r14.A03     // Catch:{ all -> 0x0097 }
            r11 = 1
            int r0 = r1 << r11
            int r0 = r11 << r0
            if (r1 != r4) goto L_0x0016
            r0 = 0
        L_0x0016:
            int r5 = r5 + r0
            int r0 = r14.A00     // Catch:{ all -> 0x0097 }
            if (r0 <= r5) goto L_0x004c
            X.0WN r4 = r14.A04     // Catch:{ all -> 0x0097 }
        L_0x001d:
            int r0 = r14.A00     // Catch:{ all -> 0x0097 }
            r10 = 0
            if (r0 <= r5) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            android.graphics.Bitmap r0 = r4.A01()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0044
            int r1 = r4.A04     // Catch:{ all -> 0x0097 }
            int r0 = r14.A03     // Catch:{ all -> 0x0097 }
            if (r1 == r0) goto L_0x0044
            int r0 = r4.A0B     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x0097 }
            android.graphics.Bitmap r0 = r4.A05     // Catch:{ all -> 0x0047 }
            if (r0 == r10) goto L_0x003c
            r4.A03()     // Catch:{ all -> 0x0047 }
        L_0x003c:
            r4.A05 = r10     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            int r0 = r14.A00     // Catch:{ all -> 0x0097 }
            int r0 = r0 - r11
            r14.A00 = r0     // Catch:{ all -> 0x0097 }
        L_0x0044:
            X.0WN r4 = r4.A08     // Catch:{ all -> 0x0097 }
            goto L_0x001d
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x004a:
            if (r13 != 0) goto L_0x0052
        L_0x004c:
            X.0V3 r0 = X.AnonymousClass0V3.A0O
            X.AnonymousClass0V3.A01(r0, r2)
            return
        L_0x0052:
            X.0WN r9 = r14.A04     // Catch:{ all -> 0x0097 }
            r13 = 0
        L_0x0055:
            if (r9 == 0) goto L_0x004a
            r8 = 0
        L_0x0058:
            r12 = 4
            if (r8 >= r12) goto L_0x0094
            X.0WN[] r0 = r9.A0A     // Catch:{ all -> 0x0097 }
            r7 = r0[r8]     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x0091
            int r0 = r7.A0B     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0091
            android.graphics.Bitmap r0 = r7.A01()     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0091
            r6 = 0
            r1 = 0
            r5 = -1
        L_0x006e:
            X.0WN[] r4 = r7.A0A     // Catch:{ all -> 0x0097 }
            r0 = r4[r6]     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0077
            int r1 = r1 + 1
            r5 = r6
        L_0x0077:
            int r6 = r6 + 1
            if (r6 < r12) goto L_0x006e
            if (r1 != r11) goto L_0x0084
            X.0WN[] r1 = r9.A0A     // Catch:{ all -> 0x0097 }
            r0 = r4[r5]     // Catch:{ all -> 0x0097 }
            r1[r8] = r0     // Catch:{ all -> 0x0097 }
            goto L_0x008a
        L_0x0084:
            if (r1 != 0) goto L_0x0091
            X.0WN[] r0 = r9.A0A     // Catch:{ all -> 0x0097 }
            r0[r8] = r10     // Catch:{ all -> 0x0097 }
        L_0x008a:
            r14.A03(r7)     // Catch:{ all -> 0x0097 }
            r7.A02()     // Catch:{ all -> 0x0097 }
            r13 = 1
        L_0x0091:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0094:
            X.0WN r9 = r9.A08     // Catch:{ all -> 0x0097 }
            goto L_0x0055
        L_0x0097:
            r1 = move-exception
            X.0V3 r0 = X.AnonymousClass0V3.A0O
            X.AnonymousClass0V3.A01(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S2.A01():void");
    }

    public void A02(AnonymousClass0WN r11) {
        int i2;
        int i3;
        int i4;
        int A0A;
        AnonymousClass0WN[] r3;
        int i5;
        if (r11.A01() != null) {
            this.A00++;
        }
        AnonymousClass0WN r1 = this.A06;
        while (true) {
            i2 = r11.A02;
            i3 = r11.A03;
            i4 = r11.A04;
            A0A = AnonymousClass000.A0A(i4, r1.A04, i2, i3);
            r3 = r1.A0A;
            AnonymousClass0WN r5 = r3[A0A];
            if (r5 == null || i4 <= (i5 = r5.A04)) {
                break;
            }
            int i6 = i4 - i5;
            if ((i2 >> i6) != r5.A02 || (i3 >> i6) != r5.A03) {
                break;
            }
            r1 = r3[A0A];
        }
        AnonymousClass0WN r52 = r3[A0A];
        if (r52 == null) {
            r3[A0A] = r11;
        } else {
            int i7 = r52.A04;
            if (i4 < i7) {
                r3[A0A] = r11;
                r11.A0A[AnonymousClass000.A0A(i7, i4, r52.A02, r52.A03)] = r52;
            } else if (i7 == i4 && r52.A02 == i2 && r52.A03 == i3) {
                A03(r52);
                System.arraycopy(r52.A0A, 0, r11.A0A, 0, 4);
                r3[A0A] = r11;
                if (r52.A01() != null) {
                    this.A00--;
                }
                r52.A02();
            } else {
                int i8 = i4 - i7;
                int i9 = i2 >> i8;
                int i10 = i3 >> i8;
                int i11 = r52.A02;
                int i12 = r52.A03;
                while (true) {
                    if (i9 == i11 && i10 == i12) {
                        break;
                    }
                    i9 >>= 1;
                    i10 >>= 1;
                    i11 >>= 1;
                    i12 >>= 1;
                    i7--;
                }
                AnonymousClass0WN r4 = new AnonymousClass0WN(-1, -1);
                r4.A02 = i9;
                r4.A03 = i10;
                r4.A04 = i7;
                r3[A0A] = r4;
                AnonymousClass0WN[] r32 = r4.A0A;
                r32[AnonymousClass000.A0A(r52.A04, i7, r52.A02, r52.A03)] = r52;
                r32[AnonymousClass000.A0A(r11.A04, i7, r11.A02, r11.A03)] = r11;
                A03(r4);
                AnonymousClass0WN r0 = this.A05;
                r0.A08 = r4;
                r4.A07 = r0;
                this.A05 = r4;
            }
        }
        A03(r11);
        AnonymousClass0WN r02 = this.A05;
        r02.A08 = r11;
        r11.A07 = r02;
        this.A05 = r11;
        A01();
    }

    public final void A03(AnonymousClass0WN r3) {
        if (r3 == this.A04) {
            this.A04 = r3.A08;
        }
        if (r3 == this.A05) {
            this.A05 = r3.A07;
        }
        AnonymousClass0WN r1 = r3.A08;
        if (r1 != null) {
            r1.A07 = r3.A07;
        }
        AnonymousClass0WN r0 = r3.A07;
        if (r0 != null) {
            r0.A08 = r1;
        }
        r3.A08 = null;
        r3.A07 = null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A00(this.A06, 10));
        return AnonymousClass000.A0h(IOUtils.LINE_SEPARATOR_UNIX, A0o);
    }
}
