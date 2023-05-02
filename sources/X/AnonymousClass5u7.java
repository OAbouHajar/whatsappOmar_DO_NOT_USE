package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.5u7  reason: invalid class name */
public class AnonymousClass5u7 {
    public final /* synthetic */ C1205061x A00;
    public final /* synthetic */ String A01;

    public AnonymousClass5u7(C1205061x r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void A00(AnonymousClass2HJ r8) {
        C005702l A002;
        C1205061x r5 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r5.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1N();
        } else {
            C14530pL r1 = r5.A00;
            if (r1 instanceof BrazilAccountRecoveryPinActivity) {
                r1.Ac1();
            }
        }
        int i2 = r8.A00;
        if (i2 != 1440) {
            if (i2 == 1448) {
                r5.A02.A0E.A03(r8, "FB", "PIN");
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1D();
            }
            C14530pL r2 = r5.A00;
            A002 = AnonymousClass5xE.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.str1363));
        } else {
            int i3 = r8.A01;
            if (i3 == 0) {
                AnonymousClass5xF r0 = r5.A02;
                C14530pL r4 = r5.A00;
                r0.A01(r4);
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1D();
                }
                boolean z2 = r5.A03;
                A002 = AnonymousClass5xE.A01(r4, new AnonymousClass5yD(r4, z2), r4.getString(R.string.str0073), r4.getString(R.string.str0072));
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1P(i3, R.plurals.plurals0103);
                return;
            } else {
                C14530pL r52 = r5.A00;
                if (r52 instanceof BrazilAccountRecoveryPinActivity) {
                    BrazilAccountRecoveryPinActivity brazilAccountRecoveryPinActivity = (BrazilAccountRecoveryPinActivity) r52;
                    brazilAccountRecoveryPinActivity.A01.setErrorState(true);
                    brazilAccountRecoveryPinActivity.A01.A05();
                    TextView textView = brazilAccountRecoveryPinActivity.A00;
                    Resources resources = brazilAccountRecoveryPinActivity.getResources();
                    Object[] objArr = new Object[1];
                    boolean A1W = C13690nt.A1W(objArr, i3);
                    textView.setText(resources.getQuantityString(R.plurals.plurals0103, i3, objArr));
                    TextView textView2 = brazilAccountRecoveryPinActivity.A00;
                    C13680ns.A0v(textView2.getContext(), textView2, R.color.color014f);
                    brazilAccountRecoveryPinActivity.A00.setVisibility(A1W ? 1 : 0);
                    return;
                }
                A002 = AnonymousClass5xE.A00(r52, (DialogInterface.OnDismissListener) null, r52.getString(R.string.str1363));
            }
        }
        A002.show();
    }
}
