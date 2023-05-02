package X;

/* renamed from: X.0Dn  reason: invalid class name */
public class AnonymousClass0Dn extends AnonymousClass0Do {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r18.A03() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r17.A03() != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r6 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        if (r7 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        if (r6 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0103, code lost:
        r16 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass0VD r21) {
        /*
            r20 = this;
            r2 = r20
            X.0S1[] r6 = r2.A0n
            X.0S1 r0 = r2.A0W
            r19 = r0
            r1 = 0
            r6[r1] = r0
            X.0S1 r5 = r2.A0Y
            r8 = 2
            r6[r8] = r5
            X.0S1 r0 = r2.A0X
            r18 = r0
            r9 = 1
            r6[r9] = r0
            X.0S1 r0 = r2.A0S
            r17 = r0
            r10 = 3
            r6[r10] = r0
            r7 = 0
        L_0x001f:
            int r0 = r6.length
            r3 = r21
            if (r7 >= r0) goto L_0x002f
            r4 = r6[r7]
            X.0SA r0 = r3.A06(r4)
            r4.A02 = r0
            int r7 = r7 + 1
            goto L_0x001f
        L_0x002f:
            int r13 = r2.A00
            if (r13 < 0) goto L_0x0143
            r4 = 4
            if (r13 >= r4) goto L_0x0143
            r11 = r6[r13]
            r12 = 0
        L_0x0039:
            int r0 = r2.A00
            if (r12 >= r0) goto L_0x004e
            X.0SN[] r0 = r2.A01
            r7 = r0[r12]
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0050
            boolean r0 = r7.A0I()
            if (r0 != 0) goto L_0x0050
        L_0x004b:
            int r12 = r12 + 1
            goto L_0x0039
        L_0x004e:
            r12 = 0
            goto L_0x0069
        L_0x0050:
            if (r13 == 0) goto L_0x0106
            if (r13 == r9) goto L_0x0106
            X.0Jy[] r0 = r7.A0o
            r6 = r0[r9]
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r6 != r0) goto L_0x004b
            X.0S1 r0 = r7.A0Y
            X.0S1 r0 = r0.A03
            if (r0 == 0) goto L_0x004b
            X.0S1 r0 = r7.A0S
        L_0x0064:
            X.0S1 r0 = r0.A03
            if (r0 == 0) goto L_0x004b
            r12 = 1
        L_0x0069:
            boolean r0 = r19.A03()
            if (r0 != 0) goto L_0x0076
            boolean r0 = r18.A03()
            r7 = 0
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r7 = 1
        L_0x0077:
            boolean r0 = r5.A03()
            if (r0 != 0) goto L_0x0084
            boolean r0 = r17.A03()
            r6 = 0
            if (r0 == 0) goto L_0x0085
        L_0x0084:
            r6 = 1
        L_0x0085:
            if (r12 != 0) goto L_0x008f
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00fa
            if (r0 != r8) goto L_0x00fd
            if (r6 != 0) goto L_0x0103
        L_0x008f:
            r16 = 4
        L_0x0091:
            r7 = 0
        L_0x0092:
            int r0 = r2.A00
            if (r7 >= r0) goto L_0x0118
            X.0SN[] r0 = r2.A01
            r6 = r0[r7]
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r6.A0I()
            if (r0 != 0) goto L_0x00a7
        L_0x00a4:
            int r7 = r7 + 1
            goto L_0x0092
        L_0x00a7:
            X.0S1[] r12 = r6.A0n
            int r0 = r2.A00
            r0 = r12[r0]
            X.0SA r6 = r3.A06(r0)
            int r13 = r2.A00
            r12 = r12[r13]
            r12.A02 = r6
            X.0S1 r0 = r12.A03
            if (r0 == 0) goto L_0x00f8
            X.0SN r0 = r0.A06
            if (r0 != r2) goto L_0x00f8
            int r12 = r12.A01
        L_0x00c1:
            if (r13 == 0) goto L_0x00e5
            if (r13 == r8) goto L_0x00e5
            X.0SA r0 = r11.A02
            int r15 = r2.A01
            int r15 = r15 + r12
            X.0an r14 = r3.A02()
            X.0SA r13 = r3.A03()
            r13.A04 = r1
            r14.A04(r0, r6, r13, r15)
        L_0x00d7:
            r3.A0A(r14)
            X.0SA r14 = r11.A02
            int r13 = r2.A01
            int r13 = r13 + r12
            r0 = r16
            r3.A0E(r14, r6, r13, r0)
            goto L_0x00a4
        L_0x00e5:
            X.0SA r0 = r11.A02
            int r15 = r2.A01
            int r15 = r15 - r12
            X.0an r14 = r3.A02()
            X.0SA r13 = r3.A03()
            r13.A04 = r1
            r14.A05(r0, r6, r13, r15)
            goto L_0x00d7
        L_0x00f8:
            r12 = 0
            goto L_0x00c1
        L_0x00fa:
            if (r7 != 0) goto L_0x0103
            goto L_0x008f
        L_0x00fd:
            if (r0 == r9) goto L_0x00fa
            if (r0 != r10) goto L_0x008f
            if (r6 == 0) goto L_0x008f
        L_0x0103:
            r16 = 5
            goto L_0x0091
        L_0x0106:
            X.0Jy[] r0 = r7.A0o
            r6 = r0[r1]
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r6 != r0) goto L_0x004b
            X.0S1 r0 = r7.A0W
            X.0S1 r0 = r0.A03
            if (r0 == 0) goto L_0x004b
            X.0S1 r0 = r7.A0X
            goto L_0x0064
        L_0x0118:
            int r0 = r2.A00
            r7 = 8
            if (r0 != 0) goto L_0x0144
            r0 = r18
            X.0SA r5 = r0.A02
            r0 = r19
            X.0SA r0 = r0.A02
            r3.A0E(r5, r0, r1, r7)
            r0 = r19
            X.0SA r5 = r0.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0X
            X.0SA r0 = r0.A02
            r3.A0E(r5, r0, r1, r4)
            r0 = r19
            X.0SA r4 = r0.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0W
        L_0x013e:
            X.0SA r0 = r0.A02
            r3.A0E(r4, r0, r1, r1)
        L_0x0143:
            return
        L_0x0144:
            if (r0 != r9) goto L_0x0167
            r0 = r19
            X.0SA r5 = r0.A02
            r0 = r18
            X.0SA r0 = r0.A02
            r3.A0E(r5, r0, r1, r7)
            r0 = r19
            X.0SA r5 = r0.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0W
            X.0SA r0 = r0.A02
            r3.A0E(r5, r0, r1, r4)
            r0 = r19
            X.0SA r4 = r0.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0X
            goto L_0x013e
        L_0x0167:
            if (r0 != r8) goto L_0x0184
            r0 = r17
            X.0SA r6 = r0.A02
            X.0SA r0 = r5.A02
            r3.A0E(r6, r0, r1, r7)
            X.0SA r6 = r5.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0S
            X.0SA r0 = r0.A02
            r3.A0E(r6, r0, r1, r4)
            X.0SA r4 = r5.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0Y
            goto L_0x013e
        L_0x0184:
            if (r0 != r10) goto L_0x0143
            X.0SA r6 = r5.A02
            r0 = r17
            X.0SA r0 = r0.A02
            r3.A0E(r6, r0, r1, r7)
            X.0SA r6 = r5.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0Y
            X.0SA r0 = r0.A02
            r3.A0E(r6, r0, r1, r4)
            X.0SA r4 = r5.A02
            X.0SN r0 = r2.A0Z
            X.0S1 r0 = r0.A0S
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dn.A0C(X.0VD):void");
    }

    public boolean A0I() {
        return true;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[Barrier] ");
        A0r.append(this.A0f);
        String A0h = AnonymousClass000.A0h(" {", A0r);
        for (int i2 = 0; i2 < this.A00; i2++) {
            AnonymousClass0SN r2 = this.A01[i2];
            if (i2 > 0) {
                A0h = AnonymousClass000.A0h(", ", AnonymousClass000.A0q(A0h));
            }
            A0h = AnonymousClass000.A0h(r2.A0f, AnonymousClass000.A0q(A0h));
        }
        return AnonymousClass000.A0h("}", AnonymousClass000.A0q(A0h));
    }
}
