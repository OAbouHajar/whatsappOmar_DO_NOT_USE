package X;

import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.2rp  reason: invalid class name and case insensitive filesystem */
public class C57802rp extends C015907p {
    public final /* synthetic */ AnonymousClass342 A00;

    public C57802rp(AnonymousClass342 r1) {
        this.A00 = r1;
    }

    public void AUO(int i2, float f2, int i3) {
        AnonymousClass342 r2 = this.A00;
        boolean z2 = true;
        if (i2 != C13680ns.A1Z(r2.A0I) && f2 == 0.0f) {
            z2 = false;
        }
        if (r2.A0Y != z2) {
            r2.A0Y = z2;
            if (z2) {
                AnonymousClass342.A02(r2);
                return;
            }
            QrScanCodeFragment qrScanCodeFragment = r2.A0T;
            qrScanCodeFragment.A02.A0L(qrScanCodeFragment.A0E, 200);
            qrScanCodeFragment.A02.A0J(qrScanCodeFragment.A0D);
        }
    }

    public void AUP(int i2) {
        AnonymousClass342 r3 = this.A00;
        r3.A0a();
        C57162qN r4 = r3.A0R;
        int i3 = 0;
        do {
            r4.A00[i3].A00.setSelected(AnonymousClass000.A1R(i3, i2));
            i3++;
        } while (i3 < 2);
        boolean A1Z = C13680ns.A1Z(r3.A0I);
        if (i2 == 0) {
            A1Z = !A1Z;
        } else if (i2 != 1) {
            return;
        }
        if (!A1Z) {
            C434920f.A05(r3, R.color.color04f0, 1);
        } else if (A1Z) {
            C434920f.A05(r3, R.color.color0092, 2);
            if (!r3.A0Y) {
                r3.A0Y = true;
                AnonymousClass342.A02(r3);
            }
            if (!r3.A07.A0A()) {
                r3.A05.A09(R.string.str0df7, 1);
            }
        }
    }
}
