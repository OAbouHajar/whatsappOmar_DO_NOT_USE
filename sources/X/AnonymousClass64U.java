package X;

import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.math.BigDecimal;

/* renamed from: X.64U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64U implements Runnable {
    public final /* synthetic */ C114305nY A00;

    public /* synthetic */ AnonymousClass64U(C114305nY r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass62Q r4;
        AnonymousClass5vS r3;
        String str;
        BigDecimal bigDecimal;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00.A00;
        indiaUpiSendPaymentActivity.A00 = 5;
        indiaUpiSendPaymentActivity.A3q();
        String A1d = C111345g2.A1d(indiaUpiSendPaymentActivity);
        if (AnonymousClass1ZW.A0E(A1d) || !indiaUpiSendPaymentActivity.A0C.A0C(1955)) {
            if (indiaUpiSendPaymentActivity.A0p || (bigDecimal = indiaUpiSendPaymentActivity.A06) == null) {
                r4 = indiaUpiSendPaymentActivity.A04;
                r3 = indiaUpiSendPaymentActivity.A0Y;
                str = indiaUpiSendPaymentActivity.A0j;
            } else {
                r4 = indiaUpiSendPaymentActivity.A04;
                r3 = indiaUpiSendPaymentActivity.A0Y;
                str = String.valueOf(bigDecimal);
            }
            r4.A00 = r3.A00(str, indiaUpiSendPaymentActivity.A0k, indiaUpiSendPaymentActivity.A0i);
        } else {
            indiaUpiSendPaymentActivity.A04.A00 = indiaUpiSendPaymentActivity.A0Y.A00(A1d, indiaUpiSendPaymentActivity.A0k, indiaUpiSendPaymentActivity.A0i);
        }
        indiaUpiSendPaymentActivity.A4B();
    }
}
