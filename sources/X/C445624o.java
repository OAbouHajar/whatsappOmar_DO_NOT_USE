package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.24o  reason: invalid class name and case insensitive filesystem */
public final class C445624o extends C28541Wm implements C28561Wp {
    public static final C445624o A04;
    public static volatile C47872Kz A05;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public String A03 = "";

    static {
        C445624o r0 = new C445624o();
        A04 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        return A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r8.ordinal()
            r4 = 0
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x00a4;
                case 2: goto L_0x002c;
                case 3: goto L_0x0085;
                case 4: goto L_0x00e8;
                case 5: goto L_0x00e2;
                case 6: goto L_0x007e;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0010:
            X.2Kz r0 = A05
            if (r0 != 0) goto L_0x0029
            java.lang.Class<X.24o> r2 = X.C445624o.class
            monitor-enter(r2)
            X.2Kz r0 = A05     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0024
            X.24o r1 = A04     // Catch:{ all -> 0x0026 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            A05 = r0     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            X.2Kz r0 = A05
            return r0
        L_0x002c:
            X.2Kx r9 = (X.C47852Kx) r9
        L_0x002e:
            int r1 = r9.A03()     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            if (r1 == 0) goto L_0x007e
            r0 = 10
            if (r1 == r0) goto L_0x005b
            r0 = 16
            if (r1 == r0) goto L_0x0043
            boolean r0 = r7.A0a(r9, r1)     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            if (r0 != 0) goto L_0x002e
            goto L_0x007e
        L_0x0043:
            int r1 = r9.A02()     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            if (r1 == 0) goto L_0x0052
            if (r1 == r2) goto L_0x0052
            r0 = 2
            if (r1 == r0) goto L_0x0052
            super.A0X(r0, r1)     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            goto L_0x002e
        L_0x0052:
            int r0 = r7.A01     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            r0 = r0 | 2
            r7.A01 = r0     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            r7.A02 = r1     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            goto L_0x002e
        L_0x005b:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            int r0 = r7.A01     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            r0 = r0 | 1
            r7.A01 = r0     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            r7.A03 = r1     // Catch:{ 1bD -> 0x0088, IOException -> 0x0086 }
            goto L_0x002e
        L_0x0068:
            byte r0 = r7.A00
            if (r0 == r2) goto L_0x007e
            if (r0 == 0) goto L_0x0085
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
            int r0 = r7.A01
            r0 = r0 & 1
            if (r0 != r2) goto L_0x0081
            if (r1 == 0) goto L_0x007e
            r7.A00 = r2
        L_0x007e:
            X.24o r0 = A04
            return r0
        L_0x0081:
            if (r1 == 0) goto L_0x0085
            r7.A00 = r4
        L_0x0085:
            return r3
        L_0x0086:
            r0 = move-exception
            goto L_0x0091
        L_0x0088:
            r0 = move-exception
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x00a2 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a1
        L_0x0091:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00a2 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x00a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a2 }
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x00a2 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            throw r0
        L_0x00a4:
            X.2L6 r9 = (X.AnonymousClass2L6) r9
            X.24o r10 = (X.C445624o) r10
            int r6 = r7.A01
            r4 = 1
            r0 = r6 & 1
            if (r0 == r2) goto L_0x00b0
            r4 = 0
        L_0x00b0:
            java.lang.String r3 = r7.A03
            int r5 = r10.A01
            r1 = 1
            r0 = r5 & 1
            if (r0 == r2) goto L_0x00ba
            r1 = 0
        L_0x00ba:
            java.lang.String r0 = r10.A03
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A03 = r0
            r1 = 2
            r0 = r6 & 2
            r4 = 0
            if (r0 != r1) goto L_0x00c9
            r4 = 1
        L_0x00c9:
            int r3 = r7.A02
            r2 = r5 & 2
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x00d2
            r1 = 1
        L_0x00d2:
            int r0 = r10.A02
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A02 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r9 != r0) goto L_0x00e1
            r6 = r6 | r5
            r7.A01 = r6
        L_0x00e1:
            return r7
        L_0x00e2:
            X.3er r0 = new X.3er
            r0.<init>()
            return r0
        L_0x00e8:
            X.24o r0 = new X.24o
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C445624o.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A03);
        }
        if ((this.A01 & 2) == 2) {
            i3 += CodedOutputStream.A00(2, this.A02);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A03);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A09(2, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
