package X;

import java.io.OutputStream;

/* renamed from: X.2x9  reason: invalid class name and case insensitive filesystem */
public class C59372x9 extends C70853hq {
    public final AnonymousClass2GB A00;

    public C59372x9(C40731ub r6, AnonymousClass2G7 r7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(r6, bArr, bArr2, bArr3);
        C28581Wr A0U = AnonymousClass2GB.A05.A0U();
        AnonymousClass42E r2 = AnonymousClass42E.A02;
        AnonymousClass2GB r1 = (AnonymousClass2GB) C28581Wr.A00(A0U);
        r1.A00 |= 1;
        r1.A01 = r2.value;
        C28581Wr A0U2 = AnonymousClass2u8.A06.A0U();
        byte[] bArr4 = r6.A03;
        C28631Ww A01 = C28631Ww.A01(bArr4, 0, bArr4.length);
        AnonymousClass2u8 r12 = (AnonymousClass2u8) C28581Wr.A00(A0U2);
        r12.A00 |= 1;
        r12.A01 = A01;
        String str = r6.A00;
        AnonymousClass2u8 r13 = (AnonymousClass2u8) C28581Wr.A00(A0U2);
        r13.A00 |= 2;
        r13.A05 = str;
        byte[] bArr5 = r6.A04;
        C28631Ww A012 = C28631Ww.A01(bArr5, 0, bArr5.length);
        AnonymousClass2u8 r14 = (AnonymousClass2u8) C28581Wr.A00(A0U2);
        r14.A00 |= 4;
        r14.A04 = A012;
        byte[] bArr6 = r6.A02;
        C28631Ww A013 = C28631Ww.A01(bArr6, 0, bArr6.length);
        AnonymousClass2u8 r15 = (AnonymousClass2u8) C28581Wr.A00(A0U2);
        r15.A00 |= 8;
        r15.A03 = A013;
        byte[] bArr7 = r6.A01;
        C28631Ww A014 = C28631Ww.A01(bArr7, 0, bArr7.length);
        AnonymousClass2u8 r16 = (AnonymousClass2u8) C28581Wr.A00(A0U2);
        r16.A00 |= 16;
        r16.A02 = A014;
        AnonymousClass2GB r17 = (AnonymousClass2GB) C28581Wr.A00(A0U);
        r17.A04 = (AnonymousClass2u8) A0U2.A02();
        r17.A00 |= 2;
        if (r7 != null) {
            AnonymousClass2GB r18 = (AnonymousClass2GB) C28581Wr.A00(A0U);
            r18.A02 = r7;
            r18.A00 |= 8;
        }
        this.A00 = (AnonymousClass2GB) A0U.A02();
    }

    public AnonymousClass2G7 A00() {
        AnonymousClass2GB r2 = this.A00;
        if ((r2.A00 & 8) != 8) {
            return null;
        }
        AnonymousClass2G7 r0 = r2.A02;
        return r0 == null ? AnonymousClass2G7.A0f : r0;
    }

    public String A01() {
        AnonymousClass2GB r2 = this.A00;
        if ((r2.A00 & 8) != 8) {
            return null;
        }
        AnonymousClass2G7 r0 = r2.A02;
        AnonymousClass2G7 r22 = r0;
        if (r0 == null) {
            r0 = AnonymousClass2G7.A0f;
        }
        if ((r0.A01 & 4) != 4) {
            return null;
        }
        if (r22 == null) {
            r22 = AnonymousClass2G7.A0f;
        }
        return r22.A06;
    }

    public void A03(OutputStream outputStream) {
        this.A00.A01(outputStream);
    }

    public boolean A04(String str) {
        return C40691uX.A0F(this.A00, str);
    }
}
