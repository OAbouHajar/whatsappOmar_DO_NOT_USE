package X;

/* renamed from: X.4bk  reason: invalid class name and case insensitive filesystem */
public abstract class C89194bk {
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public static byte[] A00(char[] cArr) {
        int length;
        int i2 = 0;
        if (cArr == null || (length = cArr.length) <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((length + 1) << 1)];
        do {
            char c2 = cArr[i2];
            bArr[AnonymousClass3K4.A0C(bArr, c2 >>> 8, i2 << 1)] = (byte) c2;
            i2++;
        } while (i2 != length);
        return bArr;
    }

    public C46932Gv A01(int i2) {
        if ((this instanceof AnonymousClass5JH) || (this instanceof AnonymousClass5JF) || !(this instanceof AnonymousClass5JG)) {
            return A02(i2);
        }
        int i3 = i2 >> 3;
        return new C46922Gu(((AnonymousClass5JG) this).A04(3, i3), i3);
    }

    public C46932Gv A02(int i2) {
        int i3;
        byte[] A04;
        if (this instanceof AnonymousClass5JH) {
            i3 = i2 >> 3;
            A04 = ((AnonymousClass5JH) this).A04(i3);
        } else if (this instanceof AnonymousClass5JF) {
            AnonymousClass5JF r1 = (AnonymousClass5JF) this;
            i3 = i2 >> 3;
            if (i3 <= r1.A00.ABn()) {
                A04 = r1.A04();
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Can't generate a derived key ");
                A0r.append(i3);
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(" bytes long.", A0r));
            }
        } else if (this instanceof AnonymousClass5JG) {
            i3 = i2 >> 3;
            A04 = ((AnonymousClass5JG) this).A04(1, i3);
        } else {
            i3 = i2 >> 3;
            A04 = ((AnonymousClass5JE) this).A04(i3);
        }
        return new C46922Gu(A04, i3);
    }

    public C46932Gv A03(int i2, int i3) {
        int i4;
        int i5;
        byte[] A04;
        if (this instanceof AnonymousClass5JH) {
            i4 = i2 >> 3;
            i5 = i3 >> 3;
            A04 = ((AnonymousClass5JH) this).A04(i4 + i5);
        } else if (this instanceof AnonymousClass5JF) {
            AnonymousClass5JF r1 = (AnonymousClass5JF) this;
            i4 = i2 >> 3;
            i5 = i3 >> 3;
            int i6 = i4 + i5;
            if (i6 <= r1.A00.ABn()) {
                A04 = r1.A04();
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Can't generate a derived key ");
                A0r.append(i6);
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(" bytes long.", A0r));
            }
        } else if (this instanceof AnonymousClass5JG) {
            AnonymousClass5JG r12 = (AnonymousClass5JG) this;
            int i7 = i2 >> 3;
            int i8 = i3 >> 3;
            byte[] A042 = r12.A04(1, i7);
            return new C1054259l(new C46922Gu(A042, i7), r12.A04(2, i8), 0, i8);
        } else {
            i4 = i2 >> 3;
            i5 = i3 >> 3;
            A04 = ((AnonymousClass5JE) this).A04(i4 + i5);
        }
        return new C1054259l(new C46922Gu(A04, i4), A04, i4, i5);
    }
}
