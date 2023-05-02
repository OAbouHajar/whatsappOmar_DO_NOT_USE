package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.61p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1204261p implements AnonymousClass5Q9 {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public /* synthetic */ C1204261p(C28401Vy r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }

    public final void ARR(Map map) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C28401Vy r4 = this.A00;
        if (map != null) {
            String A0e = C13690nt.A0e("credential_id", map);
            Object obj = map.get("action");
            if (A0e != null) {
                indiaUpiCheckOrderDetailsActivity.A05.Aco(new AnonymousClass66P(r4, indiaUpiCheckOrderDetailsActivity, A0e));
            } else if ("create_new_account".equals(obj)) {
                indiaUpiCheckOrderDetailsActivity.A3r();
            } else if ("check_balance".equals(obj)) {
                C30671cl r2 = indiaUpiCheckOrderDetailsActivity.A0B;
                Intent A04 = C110105dW.A04(indiaUpiCheckOrderDetailsActivity, IndiaUpiCheckBalanceActivity.class);
                C110115dX.A0o(A04, r2);
                indiaUpiCheckOrderDetailsActivity.startActivityForResult(A04, 1015);
            }
        } else if (indiaUpiCheckOrderDetailsActivity.AJV()) {
            indiaUpiCheckOrderDetailsActivity.finish();
        }
    }
}
