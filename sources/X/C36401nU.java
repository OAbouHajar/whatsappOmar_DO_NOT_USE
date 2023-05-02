package X;

/* renamed from: X.1nU  reason: invalid class name and case insensitive filesystem */
public class C36401nU implements C36091mz {
    public final int A00;
    public final int A01;
    public final C36251nF A02;
    public final byte[] A03;
    public final byte[][] A04;

    public C36401nU(C36251nF r11, byte[][] bArr, int i2, int i3) {
        byte[] bArr2 = {(byte) 51};
        C28581Wr A0U = AnonymousClass2LW.A05.A0U();
        A0U.A03();
        AnonymousClass2LW r1 = (AnonymousClass2LW) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = i2;
        A0U.A03();
        AnonymousClass2LW r12 = (AnonymousClass2LW) A0U.A00;
        r12.A00 |= 2;
        r12.A02 = i3;
        byte[] A002 = r11.A00();
        C28631Ww A012 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        AnonymousClass2LW r13 = (AnonymousClass2LW) A0U.A00;
        r13.A00 |= 4;
        r13.A03 = A012;
        for (byte[] bArr3 : bArr) {
            C28631Ww A013 = C28631Ww.A01(bArr3, 0, bArr3.length);
            A0U.A03();
            AnonymousClass2LW r2 = (AnonymousClass2LW) A0U.A00;
            AnonymousClass1XE r14 = r2.A04;
            if (!((AnonymousClass1XF) r14).A00) {
                r14 = C28541Wm.A0G(r14);
                r2.A04 = r14;
            }
            r14.add(A013);
        }
        byte[] A022 = A0U.A02().A02();
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = bArr;
        this.A02 = r11;
        this.A03 = C36581nm.A00(bArr2, A022);
    }

    public C36401nU(byte[] bArr) {
        try {
            byte[][] A012 = C36581nm.A01(bArr, 1, bArr.length - 1);
            int i2 = 0;
            byte b2 = A012[0][0];
            byte[] bArr2 = A012[1];
            int i3 = (b2 & 255) >> 4;
            if (i3 < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i3);
                throw new C36171n7(sb.toString());
            } else if (i3 <= 3) {
                AnonymousClass2LW r2 = (AnonymousClass2LW) C28541Wm.A0E(AnonymousClass2LW.A05, bArr2);
                int i4 = r2.A00;
                if ((i4 & 1) == 1 && (i4 & 2) == 2 && r2.A04.size() > 0 && (r2.A00 & 4) == 4) {
                    this.A03 = bArr;
                    this.A00 = r2.A01;
                    this.A01 = r2.A02;
                    this.A02 = C36241nE.A00(r2.A03.A04());
                    AnonymousClass1XE r22 = r2.A04;
                    this.A04 = new byte[r22.size()][];
                    while (true) {
                        byte[][] bArr3 = this.A04;
                        if (i2 < bArr3.length) {
                            bArr3[i2] = ((C28631Ww) r22.get(i2)).A04();
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new C36161n6("Incomplete message.");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i3);
                throw new C36161n6(sb2.toString());
            }
        } catch (C29791bD | C36291nJ e2) {
            throw new C36161n6(e2);
        }
    }

    public byte[] AdU() {
        return this.A03;
    }

    public int getType() {
        return 6;
    }
}
