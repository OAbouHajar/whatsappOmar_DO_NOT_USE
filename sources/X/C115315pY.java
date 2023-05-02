package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.5pY  reason: invalid class name and case insensitive filesystem */
public class C115315pY {
    public static void A00(Context context, AnonymousClass1Vt r5, C228919r r6, String str, int i2) {
        if (r6 != null) {
            C15830rv r1 = r5.A0C;
            Intent A04 = C110105dW.A04(context, r6.AEv());
            C110115dX.A0q(A04, r5, r1);
            A04.putExtra("extra_transaction_detail_data", new AnonymousClass2H9(r5));
            C110115dX.A0r(A04, str);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A04.putExtra("extra_origin_screen", (String) null);
            }
            A04.putExtra("extra_payment_flow_entry_point", i2);
            context.startActivity(A04);
        }
    }
}
