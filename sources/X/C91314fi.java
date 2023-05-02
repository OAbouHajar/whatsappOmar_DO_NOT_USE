package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.obwhatsapp.CallConfirmationFragment;

/* renamed from: X.4fi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91314fi implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CallConfirmationFragment A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C91314fi(Activity activity, CallConfirmationFragment callConfirmationFragment, C16010sH r3, boolean z2) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CallConfirmationFragment callConfirmationFragment = this.A01;
        Activity activity = this.A00;
        C16010sH r4 = this.A02;
        boolean z2 = this.A03;
        int i3 = C13680ns.A0B(callConfirmationFragment.A03).getInt("call_confirmation_dialog_count", 0);
        C13680ns.A0w(callConfirmationFragment.A03.A0K(), "call_confirmation_dialog_count", i3 + 1);
        callConfirmationFragment.A1N(activity, r4, z2);
    }
}
