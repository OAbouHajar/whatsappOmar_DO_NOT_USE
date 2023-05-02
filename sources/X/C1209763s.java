package X;

import com.obwhatsapp.payments.ui.IncentiveValuePropsActivity;

/* renamed from: X.63s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1209763s implements Runnable {
    public final /* synthetic */ IncentiveValuePropsActivity A00;

    public /* synthetic */ C1209763s(IncentiveValuePropsActivity incentiveValuePropsActivity) {
        this.A00 = incentiveValuePropsActivity;
    }

    public final void run() {
        C110625eY r2 = this.A00.A06;
        AnonymousClass2St A0N = C110105dW.A0N();
        A0N.A02("is_payment_account_setup", r2.A01.A0C());
        AnonymousClass5xP.A01(A0N, r2.A02.A03().ACC(), 9, "incentive_value_prop", (String) null, 1);
    }
}
