package X;

import com.facebook.redex.IDxICallbackShape7S1200000_3_I1;

/* renamed from: X.665  reason: invalid class name */
public final /* synthetic */ class AnonymousClass665 implements Runnable {
    public final /* synthetic */ C114005my A00;
    public final /* synthetic */ C110755em A01;

    public /* synthetic */ AnonymousClass665(C114005my r1, C110755em r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C110755em r6 = this.A01;
        C114005my r5 = this.A00;
        String A08 = r6.A08();
        AnonymousClass2H6 AES = r6.A05().AES();
        if (AES != null && r5.A02 != 0) {
            r5.A01 = 4;
            r5.A02 = 0;
            AnonymousClass027 r1 = r6.A02;
            r1.A0B(r1.A01());
            AES.Ahi(C110105dW.A0J(C110105dW.A0L(), String.class, A08, "paymentHandle"), new IDxICallbackShape7S1200000_3_I1(r5, A08, r6, 1));
        }
    }
}
