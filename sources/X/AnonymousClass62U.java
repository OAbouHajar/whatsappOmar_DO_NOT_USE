package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.62U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass62U implements AnonymousClass5QC {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public /* synthetic */ AnonymousClass62U(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public final void AWQ(String str, int i2) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.Ac1();
        if (!indiaUpiQrTabActivity.AIm()) {
            int i3 = R.string.str0848;
            if (i2 != 0) {
                i3 = R.string.str0584;
                if (i2 != 1) {
                    if (i2 == 2) {
                        String str2 = str;
                        if (!C119105vx.A00(indiaUpiQrTabActivity.A0C, indiaUpiQrTabActivity.A04.A08()) || !C119105vx.A01(indiaUpiQrTabActivity.A0C, str)) {
                            indiaUpiQrTabActivity.Afb(indiaUpiQrTabActivity.A03.AFI(str, "payments_camera_gallery", 9), "GALLERY_QR_CODE");
                            return;
                        } else if (indiaUpiQrTabActivity.A05.A0C()) {
                            indiaUpiQrTabActivity.A03.A00(indiaUpiQrTabActivity, (C1222168s) null, str2, "GALLERY_QR_CODE", "payments_camera_gallery");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            String string = indiaUpiQrTabActivity.getString(i3);
            C32241fu A002 = C32241fu.A00(indiaUpiQrTabActivity);
            C13690nt.A1F(A002);
            A002.A06(string);
            C13690nt.A1G(A002);
        }
    }
}
