package X;

import android.app.Activity;
import android.view.View;
import com.obwhatsapp.CallConfirmationFragment;

/* renamed from: X.4kA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94004kA implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CallConfirmationFragment A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C94004kA(Activity activity, CallConfirmationFragment callConfirmationFragment, C16010sH r3, boolean z2) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        CallConfirmationFragment callConfirmationFragment = this.A01;
        callConfirmationFragment.A1N(this.A00, this.A02, this.A03);
        callConfirmationFragment.A1D();
    }
}
