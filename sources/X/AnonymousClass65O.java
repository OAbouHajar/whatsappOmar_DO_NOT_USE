package X;

import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.65O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65O implements Runnable {
    public final /* synthetic */ BrazilOrderDetailsActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass65O(BrazilOrderDetailsActivity brazilOrderDetailsActivity, String str) {
        this.A00 = brazilOrderDetailsActivity;
        this.A01 = str;
    }

    public final void run() {
        C16880tn r0;
        C35251lc r02;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A00;
        String str = this.A01;
        C16460t6 r03 = brazilOrderDetailsActivity.A09;
        C16830ti r1 = (C16830ti) r03.A0K.A03(brazilOrderDetailsActivity.A0D);
        if (r1 != null && (r0 = r1.A00) != null && (r02 = r0.A01) != null) {
            r02.A03 = str;
            brazilOrderDetailsActivity.A09.A0a(r1);
        }
    }
}
