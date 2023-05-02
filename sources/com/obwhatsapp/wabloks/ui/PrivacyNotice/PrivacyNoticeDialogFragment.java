package com.obwhatsapp.wabloks.ui.PrivacyNotice;

import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass1MQ;
import X.AnonymousClass22A;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.AnonymousClass4DE;
import X.C000900k;
import X.C011405n;
import X.C1206362k;
import X.C20180zd;
import X.C52372dh;
import X.C52382di;
import android.content.Context;
import com.facebook.redex.IDxCEventShape179S0100000_2_I0;
import java.util.Map;

public class PrivacyNoticeDialogFragment extends Hilt_PrivacyNoticeDialogFragment implements AnonymousClass2KR {
    public AnonymousClass2ZU A00;
    public AnonymousClass1MQ A01;
    public C52372dh A02;
    public AnonymousClass01D A03;
    public AnonymousClass01D A04;
    public Map A05;

    public static /* synthetic */ void A01(C011405n r1, PrivacyNoticeDialogFragment privacyNoticeDialogFragment) {
        if (r1.equals(C011405n.ON_DESTROY)) {
            privacyNoticeDialogFragment.A1D();
        }
    }

    public static /* synthetic */ void A03(PrivacyNoticeDialogFragment privacyNoticeDialogFragment, int i2) {
        privacyNoticeDialogFragment.A02.A01(new C52382di(i2));
        privacyNoticeDialogFragment.A02.A01(new C1206362k());
    }

    public void A16(Context context) {
        super.A16(context);
        C52372dh A012 = ((C20180zd) this.A04.get()).A01(context);
        C52372dh r0 = this.A02;
        if (!(r0 == null || r0 == A012)) {
            r0.A03(this);
        }
        this.A02 = A012;
        A012.A00(new IDxCEventShape179S0100000_2_I0(this, 1), C1206362k.class, this);
    }

    public void A1D() {
        this.A02.A01(new C52382di(3));
        super.A1D();
    }

    public AnonymousClass01A A1N() {
        PrivacyNoticeFragment privacyNoticeFragment = new PrivacyNoticeFragment();
        privacyNoticeFragment.A0K.A00(new PrivacyNoticeDialogFragment$$ExternalSyntheticLambda0(this));
        return privacyNoticeFragment;
    }

    public String A1O() {
        return "TOSFragment";
    }

    public AnonymousClass1MQ AA9() {
        return this.A01;
    }

    public AnonymousClass22A AH1() {
        return this.A00.A00((C000900k) A0D(), A0G(), new AnonymousClass4DE(this.A05));
    }
}
