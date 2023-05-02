package X;

/* renamed from: X.4XJ  reason: invalid class name */
public abstract class AnonymousClass4XJ {
    public int A00;
    public C82754Ea A01;
    public final AnonymousClass5TN A02;

    public AnonymousClass4XJ(AnonymousClass5TN r1) {
        this.A02 = r1;
    }

    public static int A00(AnonymousClass4XJ r3, AnonymousClass5TN r4) {
        return r3.A01.A00[((C800942n) C800942n.A00.get(Integer.valueOf(r4.readByte() & 255))).typeId];
    }

    public int A01() {
        int readInt;
        boolean z2 = this instanceof C76963v0;
        A02();
        if (z2) {
            AnonymousClass5TN r3 = this.A02;
            r3.readInt();
            readInt = r3.readInt() * A00(this, r3);
            C102884zg r32 = (C102884zg) r3;
            r32.A00.AbR(new byte[readInt]);
            r32.A01.write(new byte[readInt]);
        } else {
            AnonymousClass5TN r0 = this.A02;
            r0.readInt();
            readInt = r0.readInt() * A00(this, r0);
            A04((long) readInt);
        }
        return this.A00 + 4 + 4 + 1 + readInt;
    }

    public long A02() {
        int i2;
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = this.A02.readByte();
        } else if (i3 == 2) {
            i2 = this.A02.readShort();
        } else if (i3 == 4) {
            i2 = this.A02.readInt();
        } else if (i3 == 8) {
            return this.A02.readLong();
        } else {
            throw AnonymousClass000.A0T("ID Length must be 1, 2, 4, or 8");
        }
        return (long) i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.42n[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02dd, code lost:
        A02();
        r5.readInt();
        r5.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02f1, code lost:
        r8 = (r6.A00 + 4) + 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r19 = this;
            X.4Ea r0 = new X.4Ea
            r0.<init>()
            r6 = r19
            r6.A01 = r0
        L_0x0009:
            X.5TN r5 = r6.A02     // Catch:{ EOFException -> 0x0350 }
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0350 }
            if (r0 != 0) goto L_0x0009
            int r3 = r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r6.A00 = r3     // Catch:{ EOFException -> 0x0350 }
            X.4Ea r7 = r6.A01     // Catch:{ EOFException -> 0x0350 }
            r4 = 0
            r8 = -1
            r2 = 0
            r1 = -1
        L_0x001d:
            X.42n[] r0 = X.C800942n.values()     // Catch:{ EOFException -> 0x0350 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0350 }
            if (r2 >= r0) goto L_0x0033
            X.42n[] r0 = X.C800942n.values()     // Catch:{ EOFException -> 0x0350 }
            r0 = r0[r2]     // Catch:{ EOFException -> 0x0350 }
            int r0 = r0.typeId     // Catch:{ EOFException -> 0x0350 }
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0033:
            int r0 = r1 + 1
            int[] r0 = new int[r0]     // Catch:{ EOFException -> 0x0350 }
            r7.A00 = r0     // Catch:{ EOFException -> 0x0350 }
            java.util.Arrays.fill(r0, r8)     // Catch:{ EOFException -> 0x0350 }
        L_0x003c:
            X.42n[] r0 = X.C800942n.values()     // Catch:{ EOFException -> 0x0350 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0350 }
            if (r4 >= r0) goto L_0x005a
            int[] r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            X.42n[] r0 = X.C800942n.values()     // Catch:{ EOFException -> 0x0350 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0350 }
            int r1 = r0.typeId     // Catch:{ EOFException -> 0x0350 }
            X.42n[] r0 = X.C800942n.values()     // Catch:{ EOFException -> 0x0350 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0350 }
            int r0 = r0.size     // Catch:{ EOFException -> 0x0350 }
            r2[r1] = r0     // Catch:{ EOFException -> 0x0350 }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005a:
            int[] r1 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            X.42n r4 = X.C800942n.OBJECT     // Catch:{ EOFException -> 0x0350 }
            int r0 = r4.typeId     // Catch:{ EOFException -> 0x0350 }
            r1[r0] = r3     // Catch:{ EOFException -> 0x0350 }
            r5.readLong()     // Catch:{ EOFException -> 0x0350 }
        L_0x0065:
            boolean r0 = r5.AHg()     // Catch:{ EOFException -> 0x0350 }
            if (r0 == 0) goto L_0x0350
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0350 }
            r7 = r0 & 255(0xff, float:3.57E-43)
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            int r0 = r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x0350 }
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 12
            if (r7 == r2) goto L_0x008b
            r2 = 28
            if (r7 == r2) goto L_0x008b
            r6.A04(r0)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x0065
        L_0x008b:
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            byte r2 = r5.readByte()     // Catch:{ EOFException -> 0x0350 }
            r7 = r2 & 255(0xff, float:3.57E-43)
            r2 = 1
            long r0 = r0 - r2
            r2 = 144(0x90, float:2.02E-43)
            if (r7 == r2) goto L_0x0313
            r2 = 195(0xc3, float:2.73E-43)
            if (r7 == r2) goto L_0x031f
            r2 = 254(0xfe, float:3.56E-43)
            if (r7 == r2) goto L_0x0308
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == r2) goto L_0x0313
            switch(r7) {
                case 1: goto L_0x02f8;
                case 2: goto L_0x02e7;
                case 3: goto L_0x02e7;
                case 4: goto L_0x02d2;
                case 5: goto L_0x0313;
                case 6: goto L_0x02d2;
                case 7: goto L_0x0313;
                case 8: goto L_0x02dd;
                default: goto L_0x00ad;
            }     // Catch:{ EOFException -> 0x0350 }
        L_0x00ad:
            switch(r7) {
                case 32: goto L_0x0174;
                case 33: goto L_0x00d9;
                case 34: goto L_0x00b5;
                case 35: goto L_0x00d3;
                default: goto L_0x00b0;
            }     // Catch:{ EOFException -> 0x0350 }
        L_0x00b0:
            switch(r7) {
                case 137: goto L_0x0313;
                case 138: goto L_0x0313;
                case 139: goto L_0x0313;
                case 140: goto L_0x0313;
                case 141: goto L_0x0313;
                case 142: goto L_0x02dd;
                default: goto L_0x00b3;
            }     // Catch:{ EOFException -> 0x0350 }
        L_0x00b3:
            goto L_0x0330
        L_0x00b5:
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r7 = r7 * r2
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r3 + 4
            int r8 = r2 + 4
            int r8 = r8 + r3
            int r8 = r8 + r7
            goto L_0x031b
        L_0x00d3:
            int r8 = r6.A01()     // Catch:{ EOFException -> 0x0350 }
            goto L_0x031b
        L_0x00d9:
            boolean r2 = r6 instanceof X.C76963v0     // Catch:{ EOFException -> 0x0350 }
            if (r2 == 0) goto L_0x0159
            r9 = r6
            X.3v0 r9 = (X.C76963v0) r9     // Catch:{ EOFException -> 0x0350 }
            r9.A02()     // Catch:{ EOFException -> 0x0350 }
            X.5TN r8 = r9.A02     // Catch:{ EOFException -> 0x0350 }
            r8.readInt()     // Catch:{ EOFException -> 0x0350 }
            long r10 = r9.A02()     // Catch:{ EOFException -> 0x0350 }
            int r14 = r8.readInt()     // Catch:{ EOFException -> 0x0350 }
            X.4EZ r2 = r9.A00     // Catch:{ EOFException -> 0x0350 }
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x0350 }
            java.util.Map r12 = r2.A00     // Catch:{ EOFException -> 0x0350 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ EOFException -> 0x0350 }
        L_0x00fc:
            java.lang.Object r2 = r12.get(r2)     // Catch:{ EOFException -> 0x0350 }
            X.4Kv r2 = (X.C84514Kv) r2     // Catch:{ EOFException -> 0x0350 }
            r13.add(r2)     // Catch:{ EOFException -> 0x0350 }
            long r2 = r2.A01     // Catch:{ EOFException -> 0x0350 }
            r10 = 0
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0112
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x00fc
        L_0x0112:
            java.util.Iterator r11 = r13.iterator()     // Catch:{ EOFException -> 0x0350 }
        L_0x0116:
            boolean r2 = r11.hasNext()     // Catch:{ EOFException -> 0x0350 }
            if (r2 == 0) goto L_0x014f
            java.lang.Object r2 = r11.next()     // Catch:{ EOFException -> 0x0350 }
            X.4Kv r2 = (X.C84514Kv) r2     // Catch:{ EOFException -> 0x0350 }
            java.util.List r2 = r2.A02     // Catch:{ EOFException -> 0x0350 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ EOFException -> 0x0350 }
        L_0x0128:
            boolean r2 = r10.hasNext()     // Catch:{ EOFException -> 0x0350 }
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r10.next()     // Catch:{ EOFException -> 0x0350 }
            X.42n r2 = (X.C800942n) r2     // Catch:{ EOFException -> 0x0350 }
            if (r2 != r4) goto L_0x013a
            r9.A02()     // Catch:{ EOFException -> 0x0350 }
            goto L_0x0128
        L_0x013a:
            r7 = r8
            X.4zg r7 = (X.C102884zg) r7     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2.size     // Catch:{ EOFException -> 0x0350 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0350 }
            X.5TN r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            r2.AbR(r3)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0350 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0350 }
            java.io.DataOutputStream r2 = r7.A01     // Catch:{ EOFException -> 0x0350 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x0128
        L_0x014f:
            int r3 = r9.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r14
            goto L_0x031b
        L_0x0159:
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r7
            goto L_0x031b
        L_0x0174:
            boolean r2 = r6 instanceof X.C76963v0     // Catch:{ EOFException -> 0x0350 }
            if (r2 == 0) goto L_0x021a
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r11 = r5.readShort()     // Catch:{ EOFException -> 0x0350 }
            r12 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r12
            int r10 = r2 + 2
            r7 = 0
            r9 = 0
        L_0x01a7:
            if (r9 >= r11) goto L_0x01bc
            r5.readShort()     // Catch:{ EOFException -> 0x0350 }
            int r8 = A00(r6, r5)     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r8 + 1
            int r2 = r2 + 2
            int r10 = r10 + r2
            int r9 = r9 + 1
            goto L_0x01a7
        L_0x01bc:
            short r11 = r5.readShort()     // Catch:{ EOFException -> 0x0350 }
            r11 = r11 & r12
            int r9 = r10 + 2
            r10 = 0
        L_0x01c4:
            if (r10 >= r11) goto L_0x0200
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            byte r3 = r5.readByte()     // Catch:{ EOFException -> 0x0350 }
            java.util.Map r2 = X.C800942n.A00     // Catch:{ EOFException -> 0x0350 }
            java.lang.Object r8 = X.AnonymousClass000.A0Y(r2, r3)     // Catch:{ EOFException -> 0x0350 }
            X.42n r8 = (X.C800942n) r8     // Catch:{ EOFException -> 0x0350 }
            if (r8 != r4) goto L_0x01eb
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
        L_0x01da:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r12 = r2 + 1
            X.4Ea r2 = r6.A01     // Catch:{ EOFException -> 0x0350 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0350 }
            int r9 = X.AnonymousClass3K4.A0E(r3, r2, r12, r9)     // Catch:{ EOFException -> 0x0350 }
            int r10 = r10 + 1
            goto L_0x01c4
        L_0x01eb:
            r12 = r5
            X.4zg r12 = (X.C102884zg) r12     // Catch:{ EOFException -> 0x0350 }
            int r2 = r8.size     // Catch:{ EOFException -> 0x0350 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0350 }
            X.5TN r2 = r12.A00     // Catch:{ EOFException -> 0x0350 }
            r2.AbR(r3)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0350 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0350 }
            java.io.DataOutputStream r2 = r12.A01     // Catch:{ EOFException -> 0x0350 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x01da
        L_0x0200:
            short r3 = r5.readShort()     // Catch:{ EOFException -> 0x0350 }
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r8 = r9 + 2
        L_0x020a:
            if (r7 >= r3) goto L_0x031b
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readByte()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r7 = r7 + 1
            goto L_0x020a
        L_0x021a:
            r7 = r6
            X.3uz r7 = (X.C76953uz) r7     // Catch:{ EOFException -> 0x0350 }
            long r15 = r7.A02()     // Catch:{ EOFException -> 0x0350 }
            X.5TN r12 = r7.A02     // Catch:{ EOFException -> 0x0350 }
            r12.readInt()     // Catch:{ EOFException -> 0x0350 }
            long r17 = r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            r12.readInt()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r9 = r12.readShort()     // Catch:{ EOFException -> 0x0350 }
            r14 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r14
            int r13 = r2 + 2
            r8 = 0
        L_0x024f:
            if (r8 >= r9) goto L_0x0264
            r12.readShort()     // Catch:{ EOFException -> 0x0350 }
            int r10 = A00(r7, r12)     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r10     // Catch:{ EOFException -> 0x0350 }
            r7.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r10 + 1
            int r2 = r2 + 2
            int r13 = r13 + r2
            int r8 = r8 + 1
            goto L_0x024f
        L_0x0264:
            short r11 = r12.readShort()     // Catch:{ EOFException -> 0x0350 }
            r11 = r11 & r14
            int r9 = r13 + 2
            r10 = 0
        L_0x026c:
            if (r10 >= r11) goto L_0x029a
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            byte r3 = r12.readByte()     // Catch:{ EOFException -> 0x0350 }
            java.util.Map r2 = X.C800942n.A00     // Catch:{ EOFException -> 0x0350 }
            java.lang.Object r8 = X.AnonymousClass000.A0Y(r2, r3)     // Catch:{ EOFException -> 0x0350 }
            X.42n r8 = (X.C800942n) r8     // Catch:{ EOFException -> 0x0350 }
            X.4Ea r2 = r7.A01     // Catch:{ EOFException -> 0x0350 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0350 }
            r2 = r3[r2]     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0350 }
            r7.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            int r3 = r2 + 1
            X.4Ea r2 = r7.A01     // Catch:{ EOFException -> 0x0350 }
            int[] r2 = r2.A00     // Catch:{ EOFException -> 0x0350 }
            int r8 = r8.typeId     // Catch:{ EOFException -> 0x0350 }
            int r9 = X.AnonymousClass3K4.A0E(r2, r8, r3, r9)     // Catch:{ EOFException -> 0x0350 }
            int r10 = r10 + 1
            goto L_0x026c
        L_0x029a:
            short r10 = r12.readShort()     // Catch:{ EOFException -> 0x0350 }
            r10 = r10 & r14
            X.42n[] r14 = new X.C800942n[r10]     // Catch:{ EOFException -> 0x0350 }
            int r8 = r9 + 2
            r9 = 0
        L_0x02a4:
            if (r9 >= r10) goto L_0x02bf
            r7.A02()     // Catch:{ EOFException -> 0x0350 }
            byte r2 = r12.readByte()     // Catch:{ EOFException -> 0x0350 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C800942n.A00     // Catch:{ EOFException -> 0x0350 }
            java.lang.Object r2 = X.AnonymousClass000.A0Y(r2, r3)     // Catch:{ EOFException -> 0x0350 }
            r14[r9] = r2     // Catch:{ EOFException -> 0x0350 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r9 = r9 + 1
            goto L_0x02a4
        L_0x02bf:
            X.4Kv r13 = new X.4Kv     // Catch:{ EOFException -> 0x0350 }
            r13.<init>(r14, r15, r17)     // Catch:{ EOFException -> 0x0350 }
            X.4EZ r2 = r7.A00     // Catch:{ EOFException -> 0x0350 }
            java.util.Map r7 = r2.A00     // Catch:{ EOFException -> 0x0350 }
            long r2 = r13.A00     // Catch:{ EOFException -> 0x0350 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0350 }
            r7.put(r2, r13)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x031b
        L_0x02d2:
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r8 = r2 + 4
            goto L_0x031b
        L_0x02dd:
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            goto L_0x02f1
        L_0x02e7:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 + 4
            int r2 = r2 + 4
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
        L_0x02f1:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r2 = r2 + 4
            int r8 = r2 + 4
            goto L_0x031b
        L_0x02f8:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0350 }
            long r0 = r0 - r2
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            goto L_0x031b
        L_0x0308:
            r5.readInt()     // Catch:{ EOFException -> 0x0350 }
            r6.A02()     // Catch:{ EOFException -> 0x0350 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            int r8 = r2 + 4
            goto L_0x031b
        L_0x0313:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0350 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0350 }
            r6.A04(r2)     // Catch:{ EOFException -> 0x0350 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0350 }
        L_0x031b:
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0350 }
            long r0 = r0 - r2
            goto L_0x008b
        L_0x031f:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ EOFException -> 0x0350 }
            java.lang.String r0 = "+--- PRIMITIVE ARRAY NODATA DUMP"
            r1.println(r0)     // Catch:{ EOFException -> 0x0350 }
            r6.A01()     // Catch:{ EOFException -> 0x0350 }
            java.lang.String r0 = "Don't know how to load a nodata array"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ EOFException -> 0x0350 }
            goto L_0x034f
        L_0x0330:
            java.lang.String r0 = "loadHeapDump loop with unknown tag "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ EOFException -> 0x0350 }
            r2.append(r7)     // Catch:{ EOFException -> 0x0350 }
            java.lang.String r0 = " with "
            r2.append(r0)     // Catch:{ EOFException -> 0x0350 }
            long r0 = r5.Abo()     // Catch:{ EOFException -> 0x0350 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0350 }
            java.lang.String r0 = " bytes possibly remaining"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ EOFException -> 0x0350 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ EOFException -> 0x0350 }
        L_0x034f:
            throw r0     // Catch:{ EOFException -> 0x0350 }
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XJ.A03():void");
    }

    public void A04(long j2) {
        AnonymousClass5TN r2 = this.A02;
        r2.AeN(r2.position() + j2);
    }
}
