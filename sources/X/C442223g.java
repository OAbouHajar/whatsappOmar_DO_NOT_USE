package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.23g  reason: invalid class name and case insensitive filesystem */
public final class C442223g extends C28541Wm implements C28561Wp {
    public static final C442223g A04;
    public static volatile C47872Kz A05;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public C30441cM A03;

    static {
        C442223g r0 = new C442223g();
        A04 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ce, code lost:
        return A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            r5 = r14
            int r0 = r13.ordinal()
            r4 = 0
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00cf;
                case 2: goto L_0x002d;
                case 3: goto L_0x00c7;
                case 4: goto L_0x0108;
                case 5: goto L_0x0102;
                case 6: goto L_0x00cc;
                case 7: goto L_0x0011;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0011:
            X.2Kz r0 = A05
            if (r0 != 0) goto L_0x002a
            java.lang.Class<X.23g> r2 = X.C442223g.class
            monitor-enter(r2)
            X.2Kz r0 = A05     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            X.23g r1 = A04     // Catch:{ all -> 0x0027 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            A05 = r0     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            X.2Kz r0 = A05
            return r0
        L_0x002d:
            X.2Kx r5 = (X.C47852Kx) r5
            X.2Ky r15 = (X.C47862Ky) r15
        L_0x0031:
            int r1 = r5.A03()     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            if (r1 == 0) goto L_0x00cc
            r0 = 10
            if (r1 == r0) goto L_0x0054
            r0 = 16
            if (r1 == r0) goto L_0x0047
            boolean r0 = r12.A0a(r5, r1)     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            if (r0 != 0) goto L_0x0031
            goto L_0x00cc
        L_0x0047:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r0 = r0 | 2
            r12.A01 = r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            long r0 = r5.A06()     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r12.A02 = r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            goto L_0x0031
        L_0x0054:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r0 = r0 & 1
            if (r0 != r2) goto L_0x0071
            X.1cM r0 = r12.A03     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1cL r1 = (X.C30431cL) r1     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
        L_0x0062:
            X.1cM r0 = X.C30441cM.A0l     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1Wo r0 = r5.A09(r15, r0)     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1cM r0 = (X.C30441cM) r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            goto L_0x0073
        L_0x0071:
            r1 = r3
            goto L_0x0062
        L_0x0073:
            if (r1 == 0) goto L_0x0080
            r1.A04(r0)     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            X.1cM r0 = (X.C30441cM) r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
        L_0x0080:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            r0 = r0 | 1
            r12.A01 = r0     // Catch:{ 1bD -> 0x0089, IOException -> 0x0087 }
            goto L_0x0031
        L_0x0087:
            r0 = move-exception
            goto L_0x0092
        L_0x0089:
            r0 = move-exception
            r0.unfinishedMessage = r12     // Catch:{ all -> 0x00a3 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a2
        L_0x0092:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00a3 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x00a3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a3 }
            r0.unfinishedMessage = r12     // Catch:{ all -> 0x00a3 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            throw r0
        L_0x00a5:
            byte r0 = r12.A00
            if (r0 == r2) goto L_0x00cc
            if (r0 == 0) goto L_0x00c7
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
            int r0 = r12.A01
            r0 = r0 & 1
            if (r0 != r2) goto L_0x00c8
            X.1cM r0 = r12.A03
            if (r0 != 0) goto L_0x00bd
            X.1cM r0 = X.C30441cM.A0l
        L_0x00bd:
            boolean r0 = r0.A0Z()
            if (r0 != 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00c7
            r12.A00 = r4
        L_0x00c7:
            return r3
        L_0x00c8:
            if (r1 == 0) goto L_0x00cc
            r12.A00 = r2
        L_0x00cc:
            X.23g r0 = A04
            return r0
        L_0x00cf:
            X.2L6 r5 = (X.AnonymousClass2L6) r5
            X.23g r15 = (X.C442223g) r15
            X.1cM r1 = r12.A03
            X.1cM r0 = r15.A03
            X.1Wo r0 = r5.Ahu(r1, r0)
            X.1cM r0 = (X.C30441cM) r0
            r12.A03 = r0
            int r3 = r12.A01
            r1 = 2
            r0 = r3 & 2
            r10 = 0
            if (r0 != r1) goto L_0x00e8
            r10 = 1
        L_0x00e8:
            long r6 = r12.A02
            int r2 = r15.A01
            r0 = r2 & 2
            r11 = 0
            if (r0 != r1) goto L_0x00f2
            r11 = 1
        L_0x00f2:
            long r8 = r15.A02
            long r0 = r5.Aht(r6, r8, r10, r11)
            r12.A02 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r5 != r0) goto L_0x0101
            r3 = r3 | r2
            r12.A01 = r3
        L_0x0101:
            return r12
        L_0x0102:
            X.3es r0 = new X.3es
            r0.<init>()
            return r0
        L_0x0108:
            X.23g r0 = new X.23g
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C442223g.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            C30441cM r0 = this.A03;
            if (r0 == null) {
                r0 = C30441cM.A0l;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A01 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A03(this.A02);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            C30441cM r0 = this.A03;
            if (r0 == null) {
                r0 = C30441cM.A0l;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0C(2, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
