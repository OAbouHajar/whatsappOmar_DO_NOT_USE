package X;

import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.630  reason: invalid class name */
public final /* synthetic */ class AnonymousClass630 implements AnonymousClass1WE {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ C30671cl A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ C111845hV A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ C30581cc A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass630(C28401Vy r1, C30671cl r2, AnonymousClass1XP r3, C111845hV r4, BrazilPaymentActivity brazilPaymentActivity, C30581cc r6, String str, String str2) {
        this.A04 = brazilPaymentActivity;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        C111845hV r6 = this.A03;
        C28401Vy r3 = this.A00;
        C30671cl r4 = this.A01;
        String str = this.A06;
        String str2 = this.A07;
        AnonymousClass1XP r5 = this.A02;
        C30581cc r8 = this.A05;
        r6.A01 = (Boolean) obj;
        C28411Vz A012 = brazilPaymentActivity.A05.A01("BRL");
        C13680ns.A1U(new C114555nx(A012, r3, r4, r5, r6, brazilPaymentActivity, r8, str, str2), brazilPaymentActivity.A05);
    }
}
