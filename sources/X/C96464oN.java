package X;

/* renamed from: X.4oN  reason: invalid class name and case insensitive filesystem */
public final class C96464oN implements AnonymousClass5R9 {
    public final int A00;
    public final AnonymousClass4Bs A01 = new AnonymousClass4Bs();
    public final C90654eW A02;

    public C96464oN(C90654eW r2, int i2) {
        this.A02 = r2;
        this.A00 = i2;
    }

    public final long A00(C55142iu r18) {
        C55142iu r8;
        long length;
        long j2;
        int AaH;
        while (true) {
            r8 = r18;
            long AEy = r8.AEy();
            length = r8.getLength();
            j2 = length - 6;
            if (AEy >= j2) {
                break;
            }
            C90654eW r11 = this.A02;
            int i2 = this.A00;
            AnonymousClass4Bs r9 = this.A01;
            byte[] bArr = new byte[2];
            r8.AaL(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i2) {
                C90504eH A05 = C90504eH.A05(16);
                System.arraycopy(bArr, 0, A05.A02, 0, 2);
                byte[] bArr2 = A05.A02;
                int i3 = 0;
                do {
                    AaH = r8.AaH(bArr2, i3 + 2, 14 - i3);
                    if (AaH == -1 || (i3 = i3 + AaH) >= 14) {
                        A05.A0R(i3);
                        r8.AcS();
                        r8.A4m((int) (AEy - r8.AF7()));
                    }
                    AaH = r8.AaH(bArr2, i3 + 2, 14 - i3);
                    break;
                } while ((i3 = i3 + AaH) >= 14);
                A05.A0R(i3);
                r8.AcS();
                r8.A4m((int) (AEy - r8.AF7()));
                if (C87514Xe.A01(r9, r11, A05, i2)) {
                    break;
                }
            } else {
                r8.AcS();
                r8.A4m((int) (AEy - r8.AF7()));
            }
            r8.A4m(1);
        }
        long AEy2 = r8.AEy();
        if (AEy2 < j2) {
            return this.A01.A00;
        }
        r8.A4m((int) (length - AEy2));
        return this.A02.A09;
    }

    public /* synthetic */ void AWs() {
    }

    public C88084Zv Ad7(C55142iu r15, long j2) {
        long AF7 = r15.AF7();
        long A002 = A00(r15);
        long AEy = r15.AEy();
        r15.A4m(Math.max(6, this.A02.A06));
        long A003 = A00(r15);
        return (A002 > j2 || A003 <= j2) ? A003 <= j2 ? new C88084Zv(-2, A003, r15.AEy()) : new C88084Zv(-1, A002, AF7) : new C88084Zv(0, -9223372036854775807L, AEy);
    }
}
