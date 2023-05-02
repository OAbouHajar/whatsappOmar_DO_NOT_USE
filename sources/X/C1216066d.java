package X;

import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;

/* renamed from: X.66d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1216066d implements Runnable {
    public final /* synthetic */ C117515t7 A00;
    public final /* synthetic */ AnonymousClass5xN A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C1216066d(C117515t7 r1, AnonymousClass5xN r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass5xC r0;
        C35301lh r02;
        AnonymousClass5xN r03 = this.A01;
        String str = this.A02;
        C117515t7 r4 = this.A00;
        C221116r r5 = r03.A04;
        Integer[] numArr = new Integer[2];
        boolean A1W = C13690nt.A1W(numArr, 417);
        numArr[1] = 418;
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1M(numArr2, 40, A1W ? 1 : 0);
        for (AnonymousClass1Vt r2 : r5.A0c(numArr, numArr2, A1W)) {
            AnonymousClass1W2 r1 = r2.A0A;
            if (r1 instanceof C111855hW) {
                C111855hW r12 = (C111855hW) r1;
                String str2 = r2.A0K;
                if (!(str2 == null || (r0 = r12.A0B) == null || (r02 = r0.A08) == null || !str.equals(r02.A00))) {
                    Context context = r4.A00;
                    Intent A04 = C110105dW.A04(context, IndiaUpiPaymentTransactionDetailsActivity.class);
                    AnonymousClass5xQ.A02(A04, r4.A01, r4.A04);
                    A04.setFlags(268435456);
                    A04.putExtra("extra_update_mandate_transaction_id", str2);
                    context.startActivity(A04);
                    r4.A02.ARM();
                    return;
                }
            }
        }
        AnonymousClass5xN r8 = r4.A03;
        Context context2 = r4.A00;
        C1221068h r6 = r4.A02;
        String str3 = r4.A04;
        boolean z2 = r4.A05;
        r8.A05.AKS(C13680ns.A0X(), (Integer) null, "qr_code_scan_error", str3);
        r8.A00.Acq(new C1215966c(context2, r6, z2));
    }
}
