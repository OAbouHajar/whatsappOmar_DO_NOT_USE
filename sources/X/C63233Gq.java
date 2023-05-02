package X;

import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public class C63233Gq implements C109465Sf {
    public final /* synthetic */ QrScanCodeFragment A00;

    public C63233Gq(QrScanCodeFragment qrScanCodeFragment) {
        this.A00 = qrScanCodeFragment;
    }

    public void ANz(int i2) {
        QrScanCodeFragment qrScanCodeFragment = this.A00;
        if (qrScanCodeFragment.A03.A02()) {
            qrScanCodeFragment.A02.A09(R.string.str083d, 1);
        }
        C001000l A0C = qrScanCodeFragment.A0C();
        if (A0C instanceof AnonymousClass342) {
            AnonymousClass342 r1 = (AnonymousClass342) A0C;
            r1.A02.A0F(C13680ns.A1Z(r1.A0I) ^ true ? 1 : 0, true);
        }
    }

    public void AVG() {
        this.A00.A1D();
    }

    public void AVV(C86844Uj r6) {
        QrScanCodeFragment qrScanCodeFragment = this.A00;
        if (!qrScanCodeFragment.A09) {
            String str = r6.A02;
            if (str != null && !str.equals(qrScanCodeFragment.A08)) {
                qrScanCodeFragment.A08 = str;
                if (((AnonymousClass342) qrScanCodeFragment.A0D()).A38(str, true, 2)) {
                    qrScanCodeFragment.A0B = true;
                    qrScanCodeFragment.A02.A0J(qrScanCodeFragment.A0D);
                    return;
                }
                qrScanCodeFragment.A02.A09(R.string.str0584, 1);
            }
            qrScanCodeFragment.A07.AcJ();
        }
    }
}
