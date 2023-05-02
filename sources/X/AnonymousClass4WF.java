package X;

/* renamed from: X.4WF  reason: invalid class name */
public final class AnonymousClass4WF {
    public C90024dN A00;
    public C90474eC A01;
    public boolean A02;
    public final C1043054u A03;

    public AnonymousClass4WF(C1043054u r3) {
        int i2 = r3.A00;
        if (i2 < 21 || (i2 & 3) != 1) {
            throw C69733fW.A00();
        }
        this.A03 = r3;
    }

    public final int A00(int i2, int i3, int i4) {
        boolean z2 = this.A02;
        C1043054u r0 = this.A03;
        boolean A032 = z2 ? r0.A03(i3, i2) : r0.A03(i2, i3);
        int i5 = i4 << 1;
        return A032 ? i5 | 1 : i5;
    }

    public C90024dN A01() {
        C90024dN r0 = this.A00;
        if (r0 == null) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 6; i4++) {
                i3 = A00(i4, 8, i3);
            }
            int A002 = A00(8, 7, A00(8, 8, A00(7, 8, i3)));
            int i5 = 5;
            do {
                A002 = A00(8, i5, A002);
                i5--;
            } while (i5 >= 0);
            int i6 = this.A03.A00;
            int i7 = i6 - 7;
            for (int i8 = i6 - 1; i8 >= i7; i8--) {
                i2 = A00(8, i8, i2);
            }
            for (int i9 = i6 - 8; i9 < i6; i9++) {
                i2 = A00(i9, 8, i2);
            }
            r0 = C90024dN.A00(A002, i2);
            if (r0 == null) {
                r0 = C90024dN.A00(A002 ^ 21522, i2 ^ 21522);
            }
            this.A00 = r0;
            if (r0 == null) {
                throw C69733fW.A00();
            }
        }
        return r0;
    }

    public C90474eC A02() {
        int i2;
        C90474eC r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        int i3 = this.A03.A00;
        int i4 = (i3 - 17) >> 2;
        if (i4 <= 6) {
            return C90474eC.A01(i4);
        }
        int i5 = i3 - 11;
        int i6 = 5;
        int i7 = 0;
        int i8 = 5;
        int i9 = 0;
        do {
            int i10 = i3 - 9;
            i2 = i10;
            while (i10 >= i5) {
                i9 = A00(i10, i8, i9);
                i10--;
            }
            i8--;
        } while (i8 >= 0);
        C90474eC A002 = C90474eC.A00(i9);
        if (A002 == null || (A002.A01 << 2) + 17 != i3) {
            do {
                for (int i11 = i2; i11 >= i5; i11--) {
                    i7 = A00(i6, i11, i7);
                }
                i6--;
            } while (i6 >= 0);
            A002 = C90474eC.A00(i7);
            if (A002 == null || (A002.A01 << 2) + 17 != i3) {
                throw C69733fW.A00();
            }
        }
        this.A01 = A002;
        return A002;
    }
}
