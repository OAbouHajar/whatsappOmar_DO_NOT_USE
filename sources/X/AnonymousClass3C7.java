package X;

import android.content.DialogInterface;
import com.facebook.redex.IDxUnblockerShape35S0300000_2_I1;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.obwhatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.3C7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1ZX A00;
    public final /* synthetic */ AnonymousClass2X0 A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ AnonymousClass3C7(AnonymousClass1ZX r1, AnonymousClass2X0 r2, Integer num) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = num;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass2X0 r6 = this.A01;
        AnonymousClass1ZX r4 = this.A00;
        Integer num = this.A02;
        RequestPhoneNumberViewModel requestPhoneNumberViewModel = r6.A05;
        if (requestPhoneNumberViewModel == null) {
            return;
        }
        if (r6.A02.A0V(r4)) {
            IDxUnblockerShape35S0300000_2_I1 iDxUnblockerShape35S0300000_2_I1 = new IDxUnblockerShape35S0300000_2_I1(new C100664w0(r4, r6, num), r4, r6, 2);
            C16010sH A0A = r6.A03.A0A(r4);
            C14530pL r42 = r6.A01;
            r42.Afc(UnblockDialogFragment.A01(iDxUnblockerShape35S0300000_2_I1, C13680ns.A0d(r42, r6.A04.A08(A0A), C13680ns.A1b(), 0, R.string.str12c7), 0, false));
            return;
        }
        int intValue = num.intValue();
        C18450wi.A0H(r4, 0);
        if (AnonymousClass000.A1X(requestPhoneNumberViewModel.A08.getValue())) {
            requestPhoneNumberViewModel.A07.Acl(new RunnableRunnableShape1S0201000_I1(r4, intValue, requestPhoneNumberViewModel, 8));
        }
        dialogInterface.dismiss();
    }
}
