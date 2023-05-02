package X;

/* renamed from: X.59n  reason: invalid class name */
public class AnonymousClass59n implements C46912Gt {
    public final C1055259y A00;

    public AnonymousClass59n(C1055259y r1) {
        this.A00 = r1;
    }

    public int A8A(byte[] bArr, int i2) {
        try {
            return this.A00.A8A(bArr, i2);
        } catch (AnonymousClass5JC e2) {
            throw AnonymousClass000.A0V(e2.toString());
        }
    }

    public int ADH() {
        return 16;
    }

    public void AHz(C46932Gv r8) {
        if (r8 instanceof C1054259l) {
            C1054259l r82 = (C1054259l) r8;
            this.A00.AI1(new C1053859h((C46922Gu) r82.A00, r82.A01, (byte[]) null, 128), true);
            return;
        }
        throw AnonymousClass000.A0T("GMAC requires ParametersWithIV");
    }

    public void AhH(byte b2) {
        C1055259y r4 = this.A00;
        r4.A06();
        byte[] bArr = r4.A0H;
        int i2 = r4.A00;
        bArr[i2] = b2;
        int i3 = i2 + 1;
        r4.A00 = i3;
        if (i3 == 16) {
            byte[] bArr2 = r4.A0F;
            AnonymousClass48D.A00(bArr2, bArr);
            r4.A09.A00(bArr2);
            r4.A00 = 0;
            r4.A04 += 16;
        }
    }

    public void reset() {
        this.A00.A08(true);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.A00.Aap(bArr, i2, i3);
    }
}
