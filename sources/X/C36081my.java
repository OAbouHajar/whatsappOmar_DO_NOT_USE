package X;

/* renamed from: X.1my  reason: invalid class name and case insensitive filesystem */
public class C36081my implements C36091mz {
    public final int A00;
    public final int A01;
    public final C36251nF A02;
    public final byte[] A03;
    public final byte[] A04;

    public C36081my(C36251nF r8, byte[] bArr, int i2, int i3) {
        C28581Wr A0U = AnonymousClass2LT.A05.A0U();
        A0U.A03();
        AnonymousClass2LT r1 = (AnonymousClass2LT) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = i2;
        A0U.A03();
        AnonymousClass2LT r12 = (AnonymousClass2LT) A0U.A00;
        r12.A00 |= 2;
        r12.A02 = i3;
        C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        AnonymousClass2LT r13 = (AnonymousClass2LT) A0U.A00;
        r13.A00 |= 4;
        r13.A03 = A012;
        byte[] A002 = r8.A00();
        C28631Ww A013 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        AnonymousClass2LT r14 = (AnonymousClass2LT) A0U.A00;
        r14.A00 |= 8;
        r14.A04 = A013;
        byte[] A022 = A0U.A02().A02();
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = bArr;
        this.A02 = r8;
        this.A04 = C36581nm.A00(new byte[]{(byte) 51}, A022);
    }

    public C36081my(byte[] bArr) {
        try {
            byte[][] A012 = C36581nm.A01(bArr, 1, bArr.length - 1);
            byte b2 = A012[0][0];
            byte[] bArr2 = A012[1];
            int i2 = (b2 & 255) >> 4;
            if (i2 < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i2);
                throw new C36171n7(sb.toString());
            } else if (i2 <= 3) {
                AnonymousClass2LT r3 = (AnonymousClass2LT) C28541Wm.A0E(AnonymousClass2LT.A05, bArr2);
                int i3 = r3.A00;
                if ((i3 & 1) == 1 && (i3 & 2) == 2 && (i3 & 4) == 4 && (i3 & 8) == 8) {
                    this.A04 = bArr;
                    this.A00 = r3.A01;
                    this.A01 = r3.A02;
                    this.A03 = r3.A03.A04();
                    this.A02 = C36241nE.A00(r3.A04.A04());
                    return;
                }
                throw new C36161n6("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i2);
                throw new C36161n6(sb2.toString());
            }
        } catch (C29791bD | C36291nJ e2) {
            throw new C36161n6(e2);
        }
    }

    public byte[] AdU() {
        return this.A04;
    }

    public int getType() {
        return 5;
    }
}
