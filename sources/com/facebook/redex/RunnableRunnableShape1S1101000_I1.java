package com.facebook.redex;

import X.AnonymousClass341;
import X.AnonymousClass3Bv;
import X.AnonymousClass51F;
import X.C108805Pk;
import X.C13680ns;
import X.C57262qa;
import X.C71813l5;
import X.C86344Sg;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.obwhatsapp.qrcode.contactqr.ContactQrMyCodeFragment;

public class RunnableRunnableShape1S1101000_I1 implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape1S1101000_I1(Object obj, String str, int i2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A00 = i2;
        this.A02 = str;
    }

    public final void run() {
        int i2;
        switch (this.A03) {
            case 0:
                C57262qa r4 = (C57262qa) this.A01;
                int i3 = this.A00;
                String str = this.A02;
                if (i3 == -1) {
                    r4.A04.A09(AnonymousClass3Bv.newArrayList((Object[]) new C86344Sg[]{new C71813l5(r4, str, 2)}));
                    return;
                } else if (i3 == 1 || i3 == 2 || i3 == 3) {
                    r4.A04.A09(AnonymousClass3Bv.newArrayList((Object[]) new C86344Sg[]{new C71813l5(r4, str, 3)}));
                    r4.A07.A00(0, -1, -1);
                    return;
                } else if (i3 == 4) {
                    C13680ns.A1P(r4.A0C, 1);
                    return;
                } else {
                    return;
                }
            case 1:
                ((C108805Pk) this.A01).AQS(this.A00, this.A02);
                return;
            case 2:
                AnonymousClass341 r3 = (AnonymousClass341) this.A01;
                String str2 = this.A02;
                int i4 = this.A00;
                r3.A0Z = false;
                r3.Ac1();
                if (str2 != null) {
                    r3.A0W = str2;
                    ContactQrMyCodeFragment contactQrMyCodeFragment = r3.A0S;
                    if (contactQrMyCodeFragment != null) {
                        contactQrMyCodeFragment.A02 = str2;
                        ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                        if (contactQrContactCardView != null) {
                            contactQrContactCardView.setQrCode(C13680ns.A0h("https://wa.me/qr/", str2));
                        }
                    }
                    if (r3.A01) {
                        i2 = R.string.str057f;
                    } else {
                        return;
                    }
                } else if (i4 != 0) {
                    boolean z2 = r3.A01;
                    i2 = R.string.str057c;
                    if (!z2) {
                        r3.A2d(new IDxCListenerShape238S0100000_2_I1(r3, 7), new IDxCListenerShape238S0100000_2_I1(r3, 5), R.string.str058b, R.string.str0575, R.string.str058b, R.string.str0574);
                        return;
                    }
                } else if (r3.A0W == null) {
                    r3.A05.A09(R.string.str0df7, 1);
                    return;
                } else {
                    return;
                }
                r3.Afg(i2);
                return;
            default:
                String str3 = this.A02;
                int i5 = this.A00;
                AnonymousClass341 r2 = (AnonymousClass341) ((AnonymousClass51F) this.A01).A02.A02.get();
                if (r2 != null) {
                    if (!(str3 == null && i5 == 0)) {
                        C13680ns.A0y(r2.A09.A0K(), "contact_qr_code", str3);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - r2.A00;
                    r2.A05.A0L(new RunnableRunnableShape1S1101000_I1(r2, str3, i5, 2), elapsedRealtime < 500 ? 500 - elapsedRealtime : 0);
                    return;
                }
                return;
        }
    }
}
