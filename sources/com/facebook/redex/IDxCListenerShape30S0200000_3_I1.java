package com.facebook.redex;

import X.AnonymousClass1Vt;
import X.AnonymousClass1Z7;
import X.AnonymousClass2St;
import X.AnonymousClass5xP;
import X.AnonymousClass61H;
import X.C110105dW;
import X.C110115dX;
import X.C116145qt;
import X.C117225se;
import X.C1222969a;
import X.C14870pt;
import X.C16050sL;
import X.C16440t3;
import X.C18310wU;
import X.C28371Vv;
import X.C32461gQ;
import X.C35081lL;
import X.C51812cK;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public class IDxCListenerShape30S0200000_3_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape30S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        AnonymousClass1Z7 r2;
        Dialog dialog;
        String str2;
        switch (this.A02) {
            case 0:
                r2 = (AnonymousClass1Z7) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_neutral";
                break;
            case 2:
                r2 = (AnonymousClass1Z7) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_negative";
                break;
            case 5:
                Context context = (Context) this.A00;
                ((DialogFragment) this.A01).A1D();
                context.startActivity(C110105dW.A04(context, BrazilPaymentSettingsActivity.class));
                return;
            case 6:
                ((DialogFragment) this.A01).A1D();
                BrazilPaymentActivity brazilPaymentActivity = ((AnonymousClass61H) this.A00).A00.A04;
                brazilPaymentActivity.startActivity(C110105dW.A04(brazilPaymentActivity, BrazilPaymentDPOActivity.class));
                C1222969a r3 = brazilPaymentActivity.A0L;
                AnonymousClass2St A0N = C110105dW.A0N();
                A0N.A01("product_flow", "p2m");
                AnonymousClass5xP.A01(A0N, r3, 120, "payment_disabled_alert", (String) null, 1);
                return;
            case 7:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) this.A00;
                AnonymousClass1Vt r6 = (AnonymousClass1Vt) this.A01;
                brazilPaymentTransactionDetailActivity.A2U(R.string.str039a, SearchActionVerificationClientService.NOTIFICATION_ID);
                C117225se r5 = brazilPaymentTransactionDetailActivity.A00;
                C116145qt r4 = new C116145qt(brazilPaymentTransactionDetailActivity);
                C16440t3 r1 = brazilPaymentTransactionDetailActivity.A05;
                C18310wU r32 = r5.A03;
                String A022 = r32.A08.A02();
                String A0f = C110105dW.A0f(r5.A01, r1);
                C16050sL A03 = C16050sL.A03(r6.A0C);
                UserJid userJid = r6.A0D;
                if (userJid != null && (str = r6.A0K) != null) {
                    String str3 = r6.A0L;
                    C51812cK r8 = new C51812cK(A022);
                    C32461gQ A0X = C110105dW.A0X();
                    C32461gQ A0Y = C110105dW.A0Y(A0X);
                    C32461gQ.A00(A0Y, "action", "br-cancel-unilateral");
                    A0Y.A02(new C35081lL((Jid) userJid, "receiver"));
                    if (C110105dW.A1W(str, 1, false)) {
                        C32461gQ.A00(A0Y, "transaction_id", str);
                    }
                    if (C110115dX.A1D(str3, false)) {
                        C32461gQ.A00(A0Y, "message_id", str3);
                    }
                    if (C110105dW.A1W(A0f, 1, false)) {
                        C32461gQ.A00(A0Y, "nonce", A0f);
                    }
                    if (A03 != null) {
                        A0Y.A02(new C35081lL((Jid) A03, "group"));
                    }
                    C28371Vv A0T = C110105dW.A0T(A0Y, A0X, r8);
                    C14870pt r16 = r5.A00;
                    r32.A0G(new IDxRCallbackShape20S0200000_3_I1(brazilPaymentTransactionDetailActivity, r5.A02, r16, r4, r5, 3), A0T, A022, 0);
                    return;
                }
                return;
            case 8:
                dialogInterface.dismiss();
                new Handler(((Context) this.A00).getMainLooper()).post((Runnable) this.A01);
                return;
            default:
                r2 = (AnonymousClass1Z7) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_positive";
                break;
        }
        r2.A00(str2);
        dialog.dismiss();
    }
}
