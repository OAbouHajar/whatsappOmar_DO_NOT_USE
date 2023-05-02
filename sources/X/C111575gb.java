package X;

import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.5gb  reason: invalid class name and case insensitive filesystem */
public class C111575gb extends C70783hi {
    public byte[] A00;
    public final C14550pN A01;
    public final FingerprintBottomSheet A02;
    public final C16440t3 A03;
    public final C118385ub A04;
    public final AnonymousClass697 A05;
    public final C118915vc A06;

    public C111575gb(C14550pN r1, FingerprintBottomSheet fingerprintBottomSheet, C16440t3 r3, C118385ub r4, AnonymousClass697 r5, C118915vc r6) {
        this.A03 = r3;
        this.A06 = r6;
        this.A01 = r1;
        this.A02 = fingerprintBottomSheet;
        this.A04 = r4;
        this.A05 = r5;
    }

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A1H(true);
        this.A05.AYE(this.A00);
        fingerprintBottomSheet.A1D();
    }

    public void A01() {
        this.A05.AXD();
    }

    public void A03(AnonymousClass024 r9, AnonymousClass2J2 r10) {
        byte[] A002;
        long A003 = this.A06.A00() * 1000;
        if (A003 > this.A03.A00()) {
            this.A02.A1M(A003);
            return;
        }
        C118385ub r6 = this.A04;
        C119795zd r3 = new C119795zd(r10, this);
        long A032 = C110105dW.A03(r6.A01);
        if (r6 instanceof C112655iq) {
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = ((C112655iq) r6).A01;
            A1Z[1] = Long.valueOf(A032);
            A002 = AnonymousClass5wV.A00(A1Z);
        } else if (r6 instanceof C112645ip) {
            C112645ip r7 = (C112645ip) r6;
            A002 = AnonymousClass5wV.A00(r7.A00, Long.valueOf(A032), r7.A01);
        } else {
            Object[] A1b = C13680ns.A1b();
            A1b[0] = Long.valueOf(A032);
            A002 = AnonymousClass5wV.A00(A1b);
        }
        AnonymousClass5xG r5 = r6.A04;
        C119775zb r4 = new C119775zb(r6, r3, A032);
        AnonymousClass04m A004 = AnonymousClass5xG.A00();
        if (A004 != null) {
            r5.A00.A04(new C110525eL(r4, r5, A002), A004, r9);
            return;
        }
        r5.A02.A06("sign: cryptoObject is null");
        r5.A03();
        C111575gb r1 = r3.A01;
        r1.A02.A1C();
        C32241fu A005 = C32241fu.A00(r1.A01);
        A005.A02(R.string.str0ff5);
        A005.A01(R.string.str0ff4);
        C110105dW.A0w(A005, r3, 2, R.string.str0e87);
        A005.A07(false);
        A005.A00();
    }

    public void A04(byte[] bArr) {
        this.A00 = bArr;
    }
}
