package X;

import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.51R  reason: invalid class name */
public class AnonymousClass51R implements C109465Sf {
    public final /* synthetic */ AnonymousClass2WW A00;

    public AnonymousClass51R(AnonymousClass2WW r1) {
        this.A00 = r1;
    }

    public void ANz(int i2) {
        C14870pt r1;
        int i3;
        AnonymousClass2WW r3 = this.A00;
        if (r3.A03.A02()) {
            r1 = r3.A05;
            i3 = R.string.str083d;
        } else {
            if (i2 != 2) {
                r1 = r3.A05;
                i3 = R.string.str03aa;
            }
            r3.finish();
        }
        r1.A09(i3, 1);
        r3.finish();
    }

    public void AVG() {
        Log.i("qractivity/previewready");
        this.A00.A08 = true;
    }

    public void AVV(C86844Uj r3) {
        Log.i("QrScannerActivity/onQrCodeDetected");
        AnonymousClass2WW r1 = this.A00;
        if (!r1.A07) {
            r1.A37(r3);
        }
    }
}
