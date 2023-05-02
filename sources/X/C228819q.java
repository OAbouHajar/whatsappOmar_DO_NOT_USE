package X;

import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.obwhatsapp.payments.ui.P2mLitePaymentSettingsActivity;
import com.obwhatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.19q  reason: invalid class name and case insensitive filesystem */
public final class C228819q extends AnonymousClass61Y {
    public final C18490wm A00;
    public final C228719p A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C228819q(X.C16000sG r8, X.C16080sP r9, X.C16980tz r10, X.C18490wm r11, X.C18290wS r12, X.C228719p r13, X.C218315p r14) {
        /*
            r7 = this;
            r0 = 1
            r3 = r10
            X.C18450wi.A0H(r10, r0)
            r0 = 2
            r5 = r14
            X.C18450wi.A0H(r14, r0)
            r0 = 3
            r2 = r9
            X.C18450wi.A0H(r9, r0)
            r0 = 4
            r1 = r8
            X.C18450wi.A0H(r8, r0)
            r0 = 5
            r4 = r12
            X.C18450wi.A0H(r12, r0)
            r0 = 6
            X.C18450wi.A0H(r13, r0)
            java.lang.String r6 = "P2M_LITE"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A01 = r13
            r7.A00 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228819q.<init>(X.0sG, X.0sP, X.0tz, X.0wm, X.0wS, X.19p, X.15p):void");
    }

    public Intent ABs(Context context, String str, String str2) {
        C18450wi.A0H(str, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.payments.ui.P2mLiteDyiReportActivity");
        intent.putExtra("extra_paymentProvider", str2);
        intent.putExtra("extra_paymentAccountType", str);
        return intent;
    }

    public C1222969a ACC() {
        return this.A01;
    }

    public Class AER() {
        return P2mLiteOrderDetailsActivity.class;
    }

    public String AET() {
        return null;
    }

    public int AEW() {
        return R.string.str1cf7;
    }

    public Class AEo() {
        return P2mLiteOrderDetailsActivity.class;
    }

    public Class AEt() {
        return P2mLitePaymentSettingsActivity.class;
    }

    public Class AEv() {
        return P2mLitePaymentTransactionDetailActivity.class;
    }

    public int AG1() {
        return 4;
    }

    public C42491xt AGq(C35511m3 r2, UserJid userJid, String str) {
        return null;
    }

    public AnonymousClass1W2 AI7() {
        return new C74103pk();
    }
}
