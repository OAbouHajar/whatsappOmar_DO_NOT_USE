package X;

import android.content.Context;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.60o  reason: invalid class name and case insensitive filesystem */
public class C1201660o implements C109385Rx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass1Vt A02;
    public final /* synthetic */ C112015ho A03;
    public final /* synthetic */ String A04;

    public C1201660o(Context context, AnonymousClass1Vt r2, C112015ho r3, String str, int i2) {
        this.A03 = r3;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i2;
        this.A04 = str;
    }

    public void AQs() {
        this.A03.A0A.A00(this.A01, this.A02);
    }

    public void onSuccess() {
        Context context = this.A01;
        context.startActivity(IndiaUpiMandatePaymentActivity.A02(context, this.A02, this.A04, this.A00));
    }
}
