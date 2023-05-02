package X;

/* renamed from: X.4pq  reason: invalid class name and case insensitive filesystem */
public final class C97344pq implements C109525Sm {
    public final int A00;
    public final /* synthetic */ C15050qF A01;

    public C97344pq(C15050qF r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean AJY() {
        C15050qF r2 = this.A01;
        return !r2.A0E && !r2.A07() && r2.A0L[this.A00].A06(r2.A0D);
    }

    public void ALU() {
        C15050qF r2 = this.A01;
        C55102iq r0 = r2.A0L[this.A00].A0C;
        if (r0 != null) {
            throw ((C96374oE) r0).A00;
        }
        r2.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        return -5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r3.A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        return -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (X.AnonymousClass4XM.A00(r10) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r10.A01 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r10.A04 != 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a7, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
        r0 = r9.A0T;
        r18 = r0;
        r7 = r0.A02;
        r6 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        if (X.AnonymousClass000.A1R(r10.flags & 1073741824, 1073741824) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        r4 = r8.A01;
        r6.A0Q(1);
        r2 = X.C90084dT.A01(r7, r6.A02, 1, r4);
        r4 = r4 + 1;
        r11 = 0;
        r1 = r6.A02[0];
        r14 = X.AnonymousClass000.A1O(r1 & 128);
        r1 = r1 & Byte.MAX_VALUE;
        r3 = r10.A05;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r0 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        r3.A02 = new byte[16];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r7 = X.C90084dT.A01(r2, r3.A02, r1, r4);
        r4 = r4 + ((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        if (r14 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        r6.A0Q(2);
        r7 = X.C90084dT.A01(r7, r6.A02, 2, r4);
        r4 = r4 + 2;
        r13 = r6.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        r12 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        if (r12 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        if (r12.length >= r13) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        r12 = new int[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0107, code lost:
        r2 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0109, code lost:
        if (r2 == null) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        if (r2.length >= r13) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r2 = new int[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r14 == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        r1 = r13 * 6;
        r6.A0Q(r1);
        r7 = X.C90084dT.A01(r7, r6.A02, r1, r4);
        r4 = r4 + ((long) r1);
        r6.A0S(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0122, code lost:
        if (r11 >= r13) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0124, code lost:
        r12[r11] = r6.A0F();
        r2[r11] = r6.A0E();
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0133, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0135, code lost:
        java.util.Arrays.fill(r0, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0139, code lost:
        r12[0] = 0;
        r2[0] = r8.A00 - ((int) (r4 - r8.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0145, code lost:
        r11 = r8.A02;
        r15 = r11.A03;
        r14 = r3.A02;
        r1 = r11.A01;
        r16 = r11.A02;
        r11 = r11.A00;
        r3.A01 = r13;
        r3.A04 = r12;
        r3.A05 = r2;
        r3.A03 = r15;
        r3.A02 = r14;
        r3.A00 = r1;
        r0 = r3.A06;
        r0.numSubSamples = r13;
        r0.numBytesOfClearData = r12;
        r0.numBytesOfEncryptedData = r2;
        r0.key = r15;
        r0.iv = r14;
        r0.mode = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0171, code lost:
        if (X.AnonymousClass3C1.A01 < 24) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0173, code lost:
        X.AnonymousClass4ZX.A00(r3.A07, r16, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017a, code lost:
        r2 = r8.A01;
        r11 = (int) (r4 - r2);
        r8.A01 = r2 + ((long) r11);
        r8.A00 -= r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0190, code lost:
        if (X.AnonymousClass000.A1R(r10.flags & 268435456, 268435456) == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0192, code lost:
        r6.A0Q(4);
        r5 = X.C90084dT.A01(r7, r6.A02, 4, r8.A01);
        r4 = r6.A0E();
        r8.A01 += 4;
        r8.A00 -= 4;
        r10.A01(r4);
        r7 = X.C90084dT.A00(r5, r10.A01, r4, r8.A01);
        r8.A01 += (long) r4;
        r1 = r8.A00 - r4;
        r8.A00 = r1;
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c6, code lost:
        if (r0 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cc, code lost:
        if (r0.capacity() < r1) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ce, code lost:
        r10.A02.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d3, code lost:
        r0 = r8.A01;
        r3 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d7, code lost:
        r18.A02 = X.C90084dT.A00(r7, r3, r8.A00, r0);
        r9.A03++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e7, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e8, code lost:
        r10.A02 = java.nio.ByteBuffer.allocate(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ef, code lost:
        r10.A01(r8.A00);
        r0 = r8.A01;
        r3 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return -4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbT(X.AnonymousClass4G5 r20, X.AnonymousClass3UX r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            X.0qF r3 = r0.A01
            int r2 = r0.A00
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x01fc
            r3.A05(r2)
            X.2ip[] r0 = r3.A0L
            r9 = r0[r2]
            boolean r4 = r3.A0D
            X.4JZ r8 = r9.A0U
            monitor-enter(r9)
            r0 = 0
            r10 = r21
            r10.A03 = r0     // Catch:{ all -> 0x01f9 }
            int r1 = r9.A03     // Catch:{ all -> 0x01f9 }
            int r0 = r9.A02     // Catch:{ all -> 0x01f9 }
            r5 = r20
            if (r1 == r0) goto L_0x0075
            int r4 = r9.A04     // Catch:{ all -> 0x01f9 }
            int r4 = r4 + r1
            int r0 = r9.A01     // Catch:{ all -> 0x01f9 }
            if (r4 < r0) goto L_0x0031
            int r4 = r4 - r0
        L_0x0031:
            if (r22 != 0) goto L_0x006d
            X.1gT[] r0 = r9.A0O     // Catch:{ all -> 0x01f9 }
            r1 = r0[r4]     // Catch:{ all -> 0x01f9 }
            X.1gT r0 = r9.A08     // Catch:{ all -> 0x01f9 }
            if (r1 != r0) goto L_0x006d
            X.2iq r0 = r9.A0C     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x0043
            r0 = 1
            r10.A03 = r0     // Catch:{ all -> 0x01f9 }
            goto L_0x008c
        L_0x0043:
            int[] r0 = r9.A0J     // Catch:{ all -> 0x01f9 }
            r0 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r10.flags = r0     // Catch:{ all -> 0x01f9 }
            long[] r0 = r9.A0N     // Catch:{ all -> 0x01f9 }
            r2 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r10.A00 = r2     // Catch:{ all -> 0x01f9 }
            long r0 = r9.A07     // Catch:{ all -> 0x01f9 }
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x005a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.addFlag(r0)     // Catch:{ all -> 0x01f9 }
        L_0x005a:
            int[] r0 = r9.A0K     // Catch:{ all -> 0x01f9 }
            r0 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r8.A00 = r0     // Catch:{ all -> 0x01f9 }
            long[] r0 = r9.A0M     // Catch:{ all -> 0x01f9 }
            r0 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r8.A01 = r0     // Catch:{ all -> 0x01f9 }
            X.4Uh[] r0 = r9.A0P     // Catch:{ all -> 0x01f9 }
            r0 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r8.A02 = r0     // Catch:{ all -> 0x01f9 }
            goto L_0x0096
        L_0x006d:
            X.1gT[] r0 = r9.A0O     // Catch:{ all -> 0x01f9 }
            r0 = r0[r4]     // Catch:{ all -> 0x01f9 }
            r9.A03(r0, r5)     // Catch:{ all -> 0x01f9 }
            goto L_0x0088
        L_0x0075:
            if (r4 != 0) goto L_0x0093
            boolean r0 = r9.A0E     // Catch:{ all -> 0x01f9 }
            if (r0 != 0) goto L_0x0093
            X.1gT r1 = r9.A0B     // Catch:{ all -> 0x01f9 }
            if (r1 == 0) goto L_0x008c
            if (r22 != 0) goto L_0x0085
            X.1gT r0 = r9.A08     // Catch:{ all -> 0x01f9 }
            if (r1 == r0) goto L_0x008c
        L_0x0085:
            r9.A03(r1, r5)     // Catch:{ all -> 0x01f9 }
        L_0x0088:
            monitor-exit(r9)
            r17 = -5
            return r17
        L_0x008c:
            monitor-exit(r9)
            r17 = -3
            r3.A06(r2)
            return r17
        L_0x0093:
            r0 = 4
            r10.flags = r0     // Catch:{ all -> 0x01f9 }
        L_0x0096:
            monitor-exit(r9)
            r17 = -4
            boolean r0 = X.AnonymousClass4XM.A00(r10)
            if (r0 != 0) goto L_0x01fe
            java.nio.ByteBuffer r0 = r10.A01
            if (r0 != 0) goto L_0x00a8
            int r0 = r10.A04
            if (r0 != 0) goto L_0x00a8
            return r17
        L_0x00a8:
            X.4dT r0 = r9.A0T
            r18 = r0
            X.4My r7 = r0.A02
            X.4eH r6 = r0.A06
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r10.flags
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)
            if (r0 == 0) goto L_0x0187
            long r4 = r8.A01
            r1 = 1
            r6.A0Q(r1)
            byte[] r0 = r6.A02
            X.4My r2 = X.C90084dT.A01(r7, r0, r1, r4)
            r0 = 1
            long r4 = r4 + r0
            byte[] r0 = r6.A02
            r11 = 0
            byte r1 = r0[r11]
            r0 = r1 & 128(0x80, float:1.794E-43)
            boolean r14 = X.AnonymousClass000.A1O(r0)
            r1 = r1 & 127(0x7f, float:1.78E-43)
            X.4OQ r3 = r10.A05
            byte[] r0 = r3.A02
            if (r0 != 0) goto L_0x0135
            r0 = 16
            byte[] r0 = new byte[r0]
            r3.A02 = r0
        L_0x00e3:
            byte[] r0 = r3.A02
            X.4My r7 = X.C90084dT.A01(r2, r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            if (r14 == 0) goto L_0x0133
            r1 = 2
            r6.A0Q(r1)
            byte[] r0 = r6.A02
            X.4My r7 = X.C90084dT.A01(r7, r0, r1, r4)
            r0 = 2
            long r4 = r4 + r0
            int r13 = r6.A0F()
        L_0x00fe:
            int[] r12 = r3.A04
            if (r12 == 0) goto L_0x0105
            int r0 = r12.length
            if (r0 >= r13) goto L_0x0107
        L_0x0105:
            int[] r12 = new int[r13]
        L_0x0107:
            int[] r2 = r3.A05
            if (r2 == 0) goto L_0x010e
            int r0 = r2.length
            if (r0 >= r13) goto L_0x0110
        L_0x010e:
            int[] r2 = new int[r13]
        L_0x0110:
            if (r14 == 0) goto L_0x0139
            int r1 = r13 * 6
            r6.A0Q(r1)
            byte[] r0 = r6.A02
            X.4My r7 = X.C90084dT.A01(r7, r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            r6.A0S(r11)
        L_0x0122:
            if (r11 >= r13) goto L_0x0145
            int r0 = r6.A0F()
            r12[r11] = r0
            int r0 = r6.A0E()
            r2[r11] = r0
            int r11 = r11 + 1
            goto L_0x0122
        L_0x0133:
            r13 = 1
            goto L_0x00fe
        L_0x0135:
            java.util.Arrays.fill(r0, r11)
            goto L_0x00e3
        L_0x0139:
            r12[r11] = r11
            int r14 = r8.A00
            long r15 = r8.A01
            long r0 = r4 - r15
            int r15 = (int) r0
            int r14 = r14 - r15
            r2[r11] = r14
        L_0x0145:
            X.4Uh r11 = r8.A02
            byte[] r15 = r11.A03
            byte[] r14 = r3.A02
            int r1 = r11.A01
            int r0 = r11.A02
            r16 = r0
            int r11 = r11.A00
            r3.A01 = r13
            r3.A04 = r12
            r3.A05 = r2
            r3.A03 = r15
            r3.A02 = r14
            r3.A00 = r1
            android.media.MediaCodec$CryptoInfo r0 = r3.A06
            r0.numSubSamples = r13
            r0.numBytesOfClearData = r12
            r0.numBytesOfEncryptedData = r2
            r0.key = r15
            r0.iv = r14
            r0.mode = r1
            int r1 = X.AnonymousClass3C1.A01
            r0 = 24
            if (r1 < r0) goto L_0x017a
            X.4ZX r1 = r3.A07
            r0 = r16
            X.AnonymousClass4ZX.A00(r1, r0, r11)
        L_0x017a:
            long r2 = r8.A01
            long r4 = r4 - r2
            int r11 = (int) r4
            long r0 = (long) r11
            long r2 = r2 + r0
            r8.A01 = r2
            int r0 = r8.A00
            int r0 = r0 - r11
            r8.A00 = r0
        L_0x0187:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            int r0 = r10.flags
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)
            if (r0 == 0) goto L_0x01ef
            r11 = 4
            r6.A0Q(r11)
            long r0 = r8.A01
            byte[] r2 = r6.A02
            X.4My r5 = X.C90084dT.A01(r7, r2, r11, r0)
            int r4 = r6.A0E()
            long r2 = r8.A01
            r0 = 4
            long r2 = r2 + r0
            r8.A01 = r2
            int r0 = r8.A00
            int r0 = r0 - r11
            r8.A00 = r0
            r10.A01(r4)
            long r1 = r8.A01
            java.nio.ByteBuffer r0 = r10.A01
            X.4My r7 = X.C90084dT.A00(r5, r0, r4, r1)
            long r2 = r8.A01
            long r0 = (long) r4
            long r2 = r2 + r0
            r8.A01 = r2
            int r1 = r8.A00
            int r1 = r1 - r4
            r8.A00 = r1
            java.nio.ByteBuffer r0 = r10.A02
            if (r0 == 0) goto L_0x01e8
            int r0 = r0.capacity()
            if (r0 < r1) goto L_0x01e8
            java.nio.ByteBuffer r0 = r10.A02
            r0.clear()
        L_0x01d3:
            long r0 = r8.A01
            java.nio.ByteBuffer r3 = r10.A02
        L_0x01d7:
            int r2 = r8.A00
            X.4My r1 = X.C90084dT.A00(r7, r3, r2, r0)
            r0 = r18
            r0.A02 = r1
            int r0 = r9.A03
            int r0 = r0 + 1
            r9.A03 = r0
            return r17
        L_0x01e8:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            r10.A02 = r0
            goto L_0x01d3
        L_0x01ef:
            int r0 = r8.A00
            r10.A01(r0)
            long r0 = r8.A01
            java.nio.ByteBuffer r3 = r10.A01
            goto L_0x01d7
        L_0x01f9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x01fc:
            r17 = -3
        L_0x01fe:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97344pq.AbT(X.4G5, X.3UX, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        if ((r7.A03 + r9) > r7.A02) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Afw(long r14) {
        /*
            r13 = this;
            X.0qF r4 = r13.A01
            int r3 = r13.A00
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0066
            boolean r0 = r4.A07()
            if (r0 != 0) goto L_0x0066
            r4.A05(r3)
            X.2ip[] r0 = r4.A0L
            r7 = r0[r3]
            boolean r6 = r4.A0D
            monitor-enter(r7)
            int r5 = r7.A03     // Catch:{ all -> 0x0063 }
            int r8 = r7.A04     // Catch:{ all -> 0x0063 }
            int r8 = r8 + r5
            int r0 = r7.A01     // Catch:{ all -> 0x0063 }
            if (r8 < r0) goto L_0x0022
            int r8 = r8 - r0
        L_0x0022:
            int r9 = r7.A02     // Catch:{ all -> 0x0063 }
            if (r5 == r9) goto L_0x0036
            long[] r0 = r7.A0N     // Catch:{ all -> 0x0063 }
            r1 = r0[r8]     // Catch:{ all -> 0x0063 }
            r10 = r14
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            long r0 = r7.A06     // Catch:{ all -> 0x0063 }
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            goto L_0x0039
        L_0x0036:
            monitor-exit(r7)
            r9 = 0
            goto L_0x003d
        L_0x0039:
            if (r6 == 0) goto L_0x0041
            int r9 = r9 - r5
        L_0x003c:
            monitor-exit(r7)
        L_0x003d:
            monitor-enter(r7)
            if (r9 < 0) goto L_0x0053
            goto L_0x004b
        L_0x0041:
            int r9 = r9 - r5
            r12 = 1
            int r9 = r7.A00(r8, r9, r10, r12)     // Catch:{ all -> 0x0063 }
            r0 = -1
            if (r9 != r0) goto L_0x003c
            goto L_0x0036
        L_0x004b:
            int r2 = r7.A03     // Catch:{ all -> 0x0063 }
            int r2 = r2 + r9
            int r1 = r7.A02     // Catch:{ all -> 0x0063 }
            r0 = 1
            if (r2 <= r1) goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            X.C90524eJ.A03(r0)     // Catch:{ all -> 0x0063 }
            int r0 = r7.A03     // Catch:{ all -> 0x0063 }
            int r0 = r0 + r9
            r7.A03 = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r7)
            if (r9 != 0) goto L_0x0067
            r4.A06(r3)
            return r9
        L_0x0063:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0066:
            r9 = 0
        L_0x0067:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97344pq.Afw(long):int");
    }
}
