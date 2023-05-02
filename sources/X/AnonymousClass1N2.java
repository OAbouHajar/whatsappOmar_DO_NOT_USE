package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1N2  reason: invalid class name */
public class AnonymousClass1N2 {
    public final AnonymousClass174 A00;
    public final C18090w8 A01;
    public final C18290wS A02;

    public AnonymousClass1N2(AnonymousClass174 r1, C18090w8 r2, C18290wS r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public Intent A00(Context context, C35251lc r5, C28381Vw r6, String str, String str2) {
        C18090w8 r1 = this.A01;
        C228919r A03 = (!r1.A07() || !r1.A0D(str)) ? this.A02.A03() : this.A02.A04("P2M_LITE");
        if (A03 != null) {
            Class AEv = A03.AEv();
            if (AEv == null) {
                Log.e("PAY: PaymentIntents/getTransactionDetailsIntent -> transactionDetailClass is null");
            } else {
                Intent intent = new Intent(context, AEv);
                if (str2 != null) {
                    intent.putExtra("extra_transaction_id", str2);
                }
                if (r6 != null) {
                    AnonymousClass1yL.A00(intent, r6);
                }
                if (r5 != null && !TextUtils.isEmpty(r5.A01)) {
                    intent.putExtra("extra_payment_receipt_type", "non_native");
                }
                intent.setFlags(603979776);
                return intent;
            }
        }
        return null;
    }
}
