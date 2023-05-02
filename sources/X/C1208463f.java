package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.63f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1208463f implements Runnable {
    public final /* synthetic */ AnonymousClass604 A00;

    public /* synthetic */ C1208463f(AnonymousClass604 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass604 r4 = this.A00;
        if (r4.A03.A0C(0)) {
            AnonymousClass160 A0H = C110115dX.A0H(r4.A04);
            C16800tf A02 = A0H.A00.A02();
            try {
                int A01 = A02.A02.A01("tmp_transactions", "tmp_ts<?", new String[]{Long.toString((A0H.A03.A00() - TimeUnit.DAYS.toMillis(1)) / 1000)});
                if (A01 > 0) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("PAY: PaymentStore removeOldPaymentTmpTransactionInfo deleted num rows: ");
                    Log.i(AnonymousClass000.A0l(A0o, A01));
                }
                A02.close();
                AnonymousClass1MB r6 = r4.A08;
                C18290wS r0 = r6.A05;
                r0.A06();
                Integer[] numArr = new Integer[1];
                AnonymousClass000.A1M(numArr, 1000, 0);
                List<AnonymousClass1Vt> A0c = r0.A08.A0c(new Integer[]{0}, numArr, -1);
                ArrayList A0u = AnonymousClass000.A0u();
                ArrayList A0u2 = AnonymousClass000.A0u();
                for (AnonymousClass1Vt r7 : A0c) {
                    C16040sK r1 = r6.A04;
                    if (r1.A0I(r7.A0D) || r1.A0I(r7.A0E)) {
                        A0u.add(r7);
                    } else {
                        C28381Vw r12 = new C28381Vw(r7.A0C, r7.A0L, r7.A0Q);
                        if (!(r12.A00 == null || r12.A01 == null)) {
                            C13680ns.A1W(r7, r12, A0u2);
                        }
                    }
                }
                r6.A03.A0K(new RunnableRunnableShape1S0300000_I0_1(r6, A0u, A0u2, 38));
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }
}
