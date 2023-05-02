package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.64v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1212664v implements Runnable {
    public final /* synthetic */ IndiaUpiPaymentTransactionConfirmationViewModel A00;

    public /* synthetic */ C1212664v(IndiaUpiPaymentTransactionConfirmationViewModel indiaUpiPaymentTransactionConfirmationViewModel) {
        this.A00 = indiaUpiPaymentTransactionConfirmationViewModel;
    }

    public final void run() {
        String obj;
        IndiaUpiPaymentTransactionConfirmationViewModel indiaUpiPaymentTransactionConfirmationViewModel = this.A00;
        C16040sK r1 = indiaUpiPaymentTransactionConfirmationViewModel.A01;
        r1.A0B();
        C28881Zb r12 = r1.A01;
        AnonymousClass00B.A06(r12);
        C28411Vz r4 = indiaUpiPaymentTransactionConfirmationViewModel.A0D;
        String str = ((C35491m1) r4).A04;
        AnonymousClass1Vt A01 = AnonymousClass1W1.A01(r4, indiaUpiPaymentTransactionConfirmationViewModel.A04, (UserJid) r12.A0E, (UserJid) null, str, (String) null, "IN", 1, 401, AnonymousClass1W0.A00("IN"), 1, 0, -1);
        if (!TextUtils.isEmpty(indiaUpiPaymentTransactionConfirmationViewModel.A0A)) {
            indiaUpiPaymentTransactionConfirmationViewModel.A07.A0U(indiaUpiPaymentTransactionConfirmationViewModel.A0A);
        }
        A01.A05 = indiaUpiPaymentTransactionConfirmationViewModel.A02.A00();
        A01.A0F = "UNSET";
        C111855hW r2 = indiaUpiPaymentTransactionConfirmationViewModel.A07;
        A01.A0A = r2;
        A01.A0P = true;
        r2.A0J = (String) indiaUpiPaymentTransactionConfirmationViewModel.A06.A00;
        r2.A0a((String) indiaUpiPaymentTransactionConfirmationViewModel.A05.A00);
        String str2 = r2.A0F;
        AnonymousClass00B.A05(str2);
        C221116r r42 = indiaUpiPaymentTransactionConfirmationViewModel.A0C;
        AnonymousClass1Vt A0M = r42.A0M(str2, (String) null);
        AnonymousClass1Vo r22 = indiaUpiPaymentTransactionConfirmationViewModel.A08;
        if (A0M == null) {
            obj = "IN- HANDLE_SEND_AGAIN Old txn is null";
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("IN- HANDLE_SEND_AGAIN Old txn is not null, interop is ");
            A0r.append(A0M.A0P);
            obj = A0r.toString();
        }
        r22.A06(obj);
        r42.A0l(A01, A0M, str2);
        r22.A06(AnonymousClass000.A0h(A01.A0K, AnonymousClass000.A0r("getPayNonWaVpaCallback added new transaction with trans id: ")));
    }
}
