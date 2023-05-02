package X;

import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.65Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65Y implements Runnable {
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass65Y(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, String str) {
        this.A00 = indiaUpiCheckOrderDetailsActivity;
        this.A01 = str;
    }

    public final void run() {
        C16880tn r0;
        C35251lc r02;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A00;
        String str = this.A01;
        C16460t6 r2 = indiaUpiCheckOrderDetailsActivity.A09;
        C16830ti r1 = (C16830ti) r2.A0K.A03(indiaUpiCheckOrderDetailsActivity.A05.A08);
        if (r1 != null && (r0 = r1.A00) != null && (r02 = r0.A01) != null) {
            r02.A03 = str;
            indiaUpiCheckOrderDetailsActivity.A09.A0a(r1);
        }
    }
}
