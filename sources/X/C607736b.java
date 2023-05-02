package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.36b  reason: invalid class name and case insensitive filesystem */
public class C607736b extends C16690tT {
    public int A00;
    public AnonymousClass1Vt A01;
    public UserJid A02;
    public Runnable A03;
    public final C16440t3 A04;
    public final C16460t6 A05;
    public final AnonymousClass17E A06;
    public final C18310wU A07;
    public final C18290wS A08;
    public final C222617g A09;

    public C607736b(C16440t3 r1, C16460t6 r2, AnonymousClass17E r3, AnonymousClass1Vt r4, UserJid userJid, C18310wU r6, C18290wS r7, C222617g r8, Runnable runnable, int i2) {
        this.A04 = r1;
        this.A06 = r3;
        this.A09 = r8;
        this.A08 = r7;
        this.A05 = r2;
        this.A07 = r6;
        this.A01 = r4;
        this.A02 = userJid;
        this.A00 = i2;
        this.A03 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass1Vt r8;
        C16440t3 r7;
        int i2 = this.A00;
        if (i2 == 15) {
            C222617g r2 = this.A09;
            r8 = this.A01;
            C15830rv r5 = r8.A0C;
            r7 = this.A04;
            long A002 = r7.A00();
            String str = r8.A0L;
            C38861rX r22 = new C38861rX(r2.A05.A02(r5, true), A002);
            r22.A00 = str;
            r22.A0b(this.A02);
            this.A07.A0E(r22);
        } else if (i2 == 18) {
            C222617g r0 = this.A09;
            r8 = this.A01;
            C15830rv r52 = r8.A0C;
            r7 = this.A04;
            long A003 = r7.A00();
            String str2 = r8.A0L;
            C38881rZ r1 = new C38881rZ(r0.A05.A02(r52, true), A003);
            r1.A00 = str2;
            r1.A0b(this.A02);
            this.A07.A0E(r1);
        } else {
            throw AnonymousClass000.A0V(AnonymousClass1Vo.A01("PaymentsMessageHandler", C13680ns.A0c(i2, "Transaction status is not cancelled or rejected, status: ")));
        }
        int i3 = r8.A02;
        r8.A02 = i2;
        r8.A06 = r7.A00();
        C18290wS r02 = this.A08;
        r02.A06();
        return Boolean.valueOf(r02.A08.A0m(r8, new C28381Vw(r8.A0C, r8.A0L, r8.A0Q), i3, 0, -1));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C16740tZ A0H = this.A05.A0H(this.A01);
        if (A0H != null) {
            AnonymousClass1Vt r2 = A0H.A0L;
            r2.A02 = this.A00;
            r2.A06 = this.A04.A00();
            this.A06.A01(A0H, 16);
        }
        this.A03.run();
    }
}
