package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.5fJ  reason: invalid class name and case insensitive filesystem */
public class C111085fJ extends C015907p {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public C111085fJ(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public void AUO(int i2, float f2, int i3) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        boolean z2 = false;
        if (i2 == (!(!indiaUpiQrTabActivity.A01.A0T())) || f2 != 0.0f) {
            z2 = true;
        }
        if (indiaUpiQrTabActivity.A0E != z2) {
            indiaUpiQrTabActivity.A0E = z2;
            if (z2) {
                View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
                if (currentFocus != null) {
                    indiaUpiQrTabActivity.A0B.A01(currentFocus);
                }
                indiaUpiQrTabActivity.A35();
            }
        }
    }

    public void AUP(int i2) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.A0a();
        C110545eP r3 = indiaUpiQrTabActivity.A08;
        int i3 = 0;
        while (true) {
            C83824Ie[] r1 = r3.A00;
            if (i3 >= r1.length) {
                break;
            }
            C83824Ie r0 = r1[i3];
            r0.A00.setSelected(AnonymousClass000.A1R(i3, i2));
            i3++;
        }
        if (i2 == 0) {
            View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
            if (currentFocus != null) {
                indiaUpiQrTabActivity.A0B.A01(currentFocus);
            }
            if (!indiaUpiQrTabActivity.A0E) {
                indiaUpiQrTabActivity.A0E = true;
                indiaUpiQrTabActivity.A35();
            }
            if (!indiaUpiQrTabActivity.A07.A0A()) {
                indiaUpiQrTabActivity.A05.A09(R.string.str0df7, 1);
            }
        }
    }
}
