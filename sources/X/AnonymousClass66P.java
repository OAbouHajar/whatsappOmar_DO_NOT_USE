package X;

import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.66P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66P implements Runnable {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass66P(C28401Vy r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, String str) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        String str = this.A02;
        C28401Vy r2 = this.A00;
        C30671cl A002 = AnonymousClass160.A00(str, C110105dW.A0i(indiaUpiCheckOrderDetailsActivity.A0P));
        indiaUpiCheckOrderDetailsActivity.A0B = A002;
        if (A002 != null) {
            indiaUpiCheckOrderDetailsActivity.A05.A0K(new AnonymousClass65X(r2, indiaUpiCheckOrderDetailsActivity));
        }
    }
}
