package X;

import com.facebook.redex.IDxDListenerShape159S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.ErrorDialogFragment;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63203Gn implements AnonymousClass5QC {
    public final /* synthetic */ AnonymousClass342 A00;

    public /* synthetic */ C63203Gn(AnonymousClass342 r1) {
        this.A00 = r1;
    }

    public final void AWQ(String str, int i2) {
        AnonymousClass342 r4 = this.A00;
        if (!r4.AIm()) {
            r4.A0Z = false;
            r4.Ac1();
            if (i2 != 0) {
                if (i2 == 1) {
                    C54692i1.A02((C28331Vq) null, (AnonymousClass284) null, r4.A0L, (AnonymousClass2RN) null, (Boolean) null, 1, 3, C54692i1.A03(str));
                } else if (i2 != 2 || r4.A38(str, false, 3)) {
                    return;
                }
                C51202bB r0 = r4.A0Q;
                r0.A07.Afb(ErrorDialogFragment.A01(6), "qr_code_scanning_dialog_fragment_tag");
            } else {
                C32241fu A002 = C32241fu.A00(r4);
                C13690nt.A1F(A002);
                A002.A01(R.string.str0848);
                A002.A0C(new IDxDListenerShape159S0100000_2_I1(r4, 6));
                C13690nt.A1G(A002);
            }
            r4.A0Q.A0a = true;
        }
    }
}
