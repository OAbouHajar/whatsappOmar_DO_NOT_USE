package X;

import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.2X0  reason: invalid class name */
public class AnonymousClass2X0 {
    public AnonymousClass2X1 A00;
    public final C14530pL A01;
    public final AnonymousClass01Y A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final RequestPhoneNumberViewModel A05;
    public final AnonymousClass01D A06;

    public AnonymousClass2X0(C14530pL r1, AnonymousClass01Y r2, C16000sG r3, C16080sP r4, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass01D r6) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = requestPhoneNumberViewModel;
    }

    public void A00(AnonymousClass1ZX r5, Integer num) {
        C14530pL r3 = this.A01;
        if (r3 != null) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str1443);
            A012.A05 = R.string.str1444;
            A012.A0B = new Object[0];
            IDxCListenerShape22S0000000_2_I0 iDxCListenerShape22S0000000_2_I0 = new IDxCListenerShape22S0000000_2_I0(5);
            A012.A04 = R.string.str1441;
            A012.A07 = iDxCListenerShape22S0000000_2_I0;
            A012.A01(new AnonymousClass3C7(r5, this, num), R.string.str1442);
            A012.A00().A1G(r3.AGM(), (String) null);
            RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A05;
            if (requestPhoneNumberViewModel != null) {
                int intValue = num.intValue();
                C18450wi.A0H(r5, 0);
                requestPhoneNumberViewModel.A06.A00(r5, 2, intValue, true);
            }
        }
    }

    public void A01(Integer num) {
        AnonymousClass2X1 r2 = (AnonymousClass2X1) this.A05.A01.A01();
        if (r2 == null) {
            return;
        }
        if (!r2.A02) {
            ((C19110xm) this.A06.get()).A00(AnonymousClass1C6.class);
            AnonymousClass1ZX r22 = r2.A01;
            int intValue = num.intValue();
            C18450wi.A0H(r22, 0);
            this.A01.Afb(AnonymousClass46L.A00(r22, intValue), "SharePhoneNumberBottomSheet");
        } else if (r2.A04) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str03a0);
            A012.A05 = R.string.str03a1;
            A012.A0B = new Object[0];
            A012.A00().A1G(this.A01.AGM(), (String) null);
        } else {
            A00(r2.A01, num);
        }
    }
}
