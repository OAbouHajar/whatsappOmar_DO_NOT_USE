package X;

import java.text.ParseException;

/* renamed from: X.1nA  reason: invalid class name and case insensitive filesystem */
public class C36201nA implements C36091mz {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    public C36201nA(C36411nV r12, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = {(byte) 51};
        C28581Wr A0U = AnonymousClass2LR.A04.A0U();
        A0U.A03();
        AnonymousClass2LR r1 = (AnonymousClass2LR) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = i2;
        A0U.A03();
        AnonymousClass2LR r13 = (AnonymousClass2LR) A0U.A00;
        r13.A00 |= 2;
        r13.A02 = i3;
        C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        AnonymousClass2LR r14 = (AnonymousClass2LR) A0U.A00;
        r14.A00 |= 4;
        r14.A03 = A012;
        byte[] A022 = A0U.A02().A02();
        byte[] A002 = C36581nm.A00(bArr2, A022);
        try {
            C36471nb A003 = C36471nb.A00();
            byte[] bArr3 = r12.A00;
            if (bArr3 == null || bArr3.length != 32) {
                throw new IllegalArgumentException("Invalid private key length!");
            }
            AnonymousClass5T9 r15 = A003.A00;
            this.A03 = C36581nm.A00(bArr2, A022, r15.calculateSignature(r15.AFM(64), bArr3, A002));
            this.A01 = i2;
            this.A00 = i3;
            this.A02 = bArr;
        } catch (C36291nJ e2) {
            throw new AssertionError(e2);
        }
    }

    public C36201nA(byte[] bArr) {
        try {
            byte[][] A022 = C36581nm.A02(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b2 = A022[0][0];
            byte[] bArr2 = A022[1];
            int i2 = (b2 & 255) >> 4;
            if (i2 < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i2);
                throw new C36171n7(sb.toString());
            } else if (i2 <= 3) {
                AnonymousClass2LR r3 = (AnonymousClass2LR) C28541Wm.A0E(AnonymousClass2LR.A04, bArr2);
                int i3 = r3.A00;
                if ((i3 & 1) == 1 && (i3 & 2) == 2 && (i3 & 4) == 4) {
                    this.A03 = bArr;
                    this.A01 = r3.A01;
                    this.A00 = r3.A02;
                    this.A02 = r3.A03.A04();
                    return;
                }
                throw new C36161n6("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i2);
                throw new C36161n6(sb2.toString());
            }
        } catch (C29791bD | ParseException e2) {
            throw new C36161n6(e2);
        }
    }

    public void A00(C36251nF r5) {
        try {
            byte[] bArr = this.A03;
            byte[][] A012 = C36581nm.A01(bArr, bArr.length - 64, 64);
            if (!C36471nb.A00().A01(r5.A00, A012[0], A012[1])) {
                throw new C36161n6("Invalid signature!");
            }
        } catch (C36291nJ e2) {
            throw new C36161n6((Throwable) e2);
        }
    }

    public byte[] AdU() {
        return this.A03;
    }

    public int getType() {
        return 4;
    }
}
