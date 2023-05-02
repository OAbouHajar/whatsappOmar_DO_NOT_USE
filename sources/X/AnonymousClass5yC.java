package X;

import android.content.DialogInterface;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.5yC  reason: invalid class name */
public class AnonymousClass5yC implements DialogInterface.OnDismissListener {
    public AnonymousClass68K A00;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass68K r1 = this.A00;
        if (r1 != null && (r1 instanceof BrazilOrderDetailsActivity)) {
            BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) r1;
            if (brazilOrderDetailsActivity.A0J) {
                brazilOrderDetailsActivity.finish();
            }
        }
    }
}
