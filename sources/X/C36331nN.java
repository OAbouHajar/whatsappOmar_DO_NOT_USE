package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.1nN  reason: invalid class name and case insensitive filesystem */
public class C36331nN implements C36091mz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C36341nO A03;
    public final C36251nF A04;
    public final C36311nL A05;
    public final C36511nf A06;
    public final byte[] A07;

    public C36331nN(C36341nO r6, C36251nF r7, C36311nL r8, C36511nf r9, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = r9;
        this.A01 = i4;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        C28581Wr A0U = AnonymousClass27Y.A07.A0U();
        A0U.A03();
        AnonymousClass27Y r2 = (AnonymousClass27Y) A0U.A00;
        r2.A00 |= 4;
        r2.A03 = i4;
        byte[] A002 = r7.A00();
        C28631Ww A012 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        AnonymousClass27Y r22 = (AnonymousClass27Y) A0U.A00;
        r22.A00 |= 8;
        r22.A04 = A012;
        byte[] A003 = r6.A00.A00();
        C28631Ww A013 = C28631Ww.A01(A003, 0, A003.length);
        A0U.A03();
        AnonymousClass27Y r23 = (AnonymousClass27Y) A0U.A00;
        r23.A00 |= 16;
        r23.A05 = A013;
        byte[] bArr = r8.A04;
        C28631Ww A014 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        AnonymousClass27Y r24 = (AnonymousClass27Y) A0U.A00;
        r24.A00 |= 32;
        r24.A06 = A014;
        A0U.A03();
        AnonymousClass27Y r25 = (AnonymousClass27Y) A0U.A00;
        r25.A00 |= 1;
        r25.A02 = i3;
        if (r9 instanceof C36521ng) {
            int intValue = ((Number) r9.A00()).intValue();
            A0U.A03();
            AnonymousClass27Y r26 = (AnonymousClass27Y) A0U.A00;
            r26.A00 |= 2;
            r26.A01 = intValue;
        }
        this.A07 = C36581nm.A00(new byte[]{(byte) (((i2 << 4) | 3) & MotionEventCompat.ACTION_MASK)}, A0U.A02().A02());
    }

    public C36331nN(byte[] bArr) {
        try {
            int i2 = (bArr[0] & 255) >> 4;
            this.A02 = i2;
            if (i2 > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown version: ");
                sb.append(i2);
                throw new C36361nQ(sb.toString());
            } else if (i2 >= 3) {
                AnonymousClass27Y r2 = (AnonymousClass27Y) C28541Wm.A0A(C28631Ww.A01(bArr, 1, bArr.length - 1), AnonymousClass27Y.A07);
                int i3 = r2.A00;
                if ((i3 & 4) == 4 && (i3 & 8) == 8 && (i3 & 16) == 16 && (i3 & 32) == 32) {
                    this.A07 = bArr;
                    this.A00 = r2.A02;
                    this.A06 = (i3 & 2) == 2 ? new C36521ng(Integer.valueOf(r2.A01)) : C36501ne.A00;
                    this.A01 = r2.A03;
                    this.A04 = C36241nE.A00(r2.A04.A04());
                    this.A03 = new C36341nO(C36241nE.A00(r2.A05.A04()));
                    this.A05 = new C36311nL(r2.A06.A04());
                    return;
                }
                throw new C36161n6("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Legacy version: ");
                sb2.append(i2);
                throw new C36171n7(sb2.toString());
            }
        } catch (C29791bD | C36171n7 | C36291nJ e2) {
            throw new C36161n6(e2);
        }
    }

    public byte[] AdU() {
        return this.A07;
    }

    public int getType() {
        return 3;
    }
}
