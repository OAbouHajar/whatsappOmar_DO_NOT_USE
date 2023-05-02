package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.56W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56W implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1KR A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ AnonymousClass56W(AnonymousClass1KR r1, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i2, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A07 = str;
        this.A00 = i2;
        this.A02 = num;
        this.A08 = z2;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = num4;
        this.A09 = z3;
        this.A06 = num5;
    }

    public final void run() {
        AnonymousClass1KR r8 = this.A01;
        String str = this.A07;
        int i2 = this.A00;
        Integer num = this.A02;
        boolean z2 = this.A08;
        Integer num2 = this.A03;
        Integer num3 = this.A04;
        Integer num4 = this.A05;
        boolean z3 = this.A09;
        Integer num5 = this.A06;
        Jid nullable = Jid.getNullable(str);
        C75863sq r2 = new C75863sq();
        C17170ue r12 = r8.A00;
        r2.A09 = Long.valueOf((long) r12.A09.getAndIncrement());
        r2.A06 = Integer.valueOf(i2);
        r2.A0B = r12.A00;
        r2.A0A = r8.A04.A00(nullable);
        r2.A07 = num;
        r2.A01 = Boolean.valueOf(z2);
        r2.A02 = num2;
        r2.A03 = num3;
        r2.A04 = num4;
        r2.A00 = Boolean.valueOf(z3);
        r2.A05 = num5;
        r8.A03.A06(r2);
    }
}
