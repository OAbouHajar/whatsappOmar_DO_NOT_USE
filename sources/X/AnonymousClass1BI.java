package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;

/* renamed from: X.1BI  reason: invalid class name */
public class AnonymousClass1BI {
    public final C16000sG A00;
    public final AnonymousClass01V A01;
    public final C16260sj A02;
    public final C16490t9 A03;
    public final C16320sq A04;

    public AnonymousClass1BI(C16000sG r1, AnonymousClass01V r2, C16260sj r3, C16490t9 r4, C16320sq r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(Integer num) {
        AnonymousClass2XL r3 = new AnonymousClass2XL();
        r3.A03 = 1;
        r3.A04 = num;
        this.A04.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 49, r3));
    }

    public void A01(Integer num, String str, int i2) {
        AnonymousClass2XL r3 = new AnonymousClass2XL();
        r3.A03 = Integer.valueOf(i2);
        r3.A04 = num;
        r3.A07 = str;
        this.A04.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 49, r3));
    }
}
