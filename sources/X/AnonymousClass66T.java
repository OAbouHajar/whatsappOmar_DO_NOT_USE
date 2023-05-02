package X;

import com.facebook.redex.IDxCallbackShape45S0300000_3_I1;

/* renamed from: X.66T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66T implements Runnable {
    public final /* synthetic */ C114105n8 A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ AnonymousClass66T(C114105n8 r1, Integer num, Integer num2) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = num2;
    }

    public final void run() {
        C114105n8 r3 = this.A00;
        Integer num = this.A01;
        Integer num2 = this.A02;
        C18300wT r2 = r3.A09;
        r2.A0E(r3.A05.A00());
        r2.A0B(1);
        r3.A07.A01(new IDxCallbackShape45S0300000_3_I1(num2, num, r3, 1), num, num2, (String) null, (String) null);
    }
}
