package X;

import java.util.Hashtable;

/* renamed from: X.59r  reason: invalid class name and case insensitive filesystem */
public class C1054559r implements C46912Gt {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public AnonymousClass5T8 A02;
    public AnonymousClass5SH A03;
    public AnonymousClass5SH A04;
    public byte[] A05;
    public byte[] A06;

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public C1054559r(AnonymousClass5T8 r4) {
        int intValue;
        if (r4 instanceof AnonymousClass5VO) {
            intValue = ((AnonymousClass5VO) r4).AAI();
        } else {
            Number number = (Number) A07.get(r4.A9q());
            if (number != null) {
                intValue = number.intValue();
            } else {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(r4.A9q(), AnonymousClass000.A0r("unknown digest passed: ")));
            }
        }
        this.A02 = r4;
        int ABn = r4.ABn();
        this.A01 = ABn;
        this.A00 = intValue;
        this.A05 = new byte[intValue];
        this.A06 = new byte[(intValue + ABn)];
    }

    public int A8A(byte[] bArr, int i2) {
        AnonymousClass5T8 r6 = this.A02;
        byte[] bArr2 = this.A06;
        int i3 = this.A00;
        r6.A8A(bArr2, i3);
        AnonymousClass5SH r1 = this.A04;
        if (r1 != null) {
            ((AnonymousClass5SH) r6).AcP(r1);
            r6.update(bArr2, i3, r6.ABn());
        } else {
            r6.update(bArr2, 0, bArr2.length);
        }
        int A8A = r6.A8A(bArr, i2);
        while (i3 < bArr2.length) {
            bArr2[i3] = 0;
            i3++;
        }
        AnonymousClass5SH r0 = this.A03;
        if (r0 != null) {
            ((AnonymousClass5SH) r6).AcP(r0);
            return A8A;
        }
        byte[] bArr3 = this.A05;
        r6.update(bArr3, 0, bArr3.length);
        return A8A;
    }

    public int ADH() {
        return this.A01;
    }

    public void AHz(C46932Gv r9) {
        byte[] bArr;
        int length;
        AnonymousClass5T8 r6 = this.A02;
        r6.reset();
        byte[] bArr2 = ((C46922Gu) r9).A00;
        int length2 = bArr2.length;
        int i2 = this.A00;
        if (length2 > i2) {
            r6.update(bArr2, 0, length2);
            bArr = this.A05;
            r6.A8A(bArr, 0);
            length2 = this.A01;
        } else {
            bArr = this.A05;
            System.arraycopy(bArr2, 0, bArr, 0, length2);
        }
        while (true) {
            length = bArr.length;
            if (length2 >= length) {
                break;
            }
            bArr[length2] = 0;
            length2++;
        }
        byte[] bArr3 = this.A06;
        System.arraycopy(bArr, 0, bArr3, 0, i2);
        for (int i3 = 0; i3 < i2; i3 = AnonymousClass3K4.A0C(bArr, bArr[i3] ^ 54, i3)) {
        }
        for (int i4 = 0; i4 < i2; i4 = AnonymousClass3K4.A0C(bArr3, bArr3[i4] ^ 92, i4)) {
        }
        boolean z2 = r6 instanceof AnonymousClass5SH;
        if (z2) {
            AnonymousClass5SH A6m = ((AnonymousClass5SH) r6).A6m();
            this.A04 = A6m;
            ((AnonymousClass5T8) A6m).update(bArr3, 0, i2);
        }
        r6.update(bArr, 0, length);
        if (z2) {
            this.A03 = ((AnonymousClass5SH) r6).A6m();
        }
    }

    public void AhH(byte b2) {
        this.A02.AhH(b2);
    }

    public void reset() {
        AnonymousClass5T8 r3 = this.A02;
        r3.reset();
        byte[] bArr = this.A05;
        r3.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.A02.update(bArr, i2, i3);
    }
}
