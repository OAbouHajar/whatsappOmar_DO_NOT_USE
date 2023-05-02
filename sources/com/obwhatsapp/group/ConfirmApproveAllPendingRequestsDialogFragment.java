package com.obwhatsapp.group;

import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;

public class ConfirmApproveAllPendingRequestsDialogFragment extends Hilt_ConfirmApproveAllPendingRequestsDialogFragment {
    public static /* synthetic */ void A01(Bundle bundle, ConfirmApproveAllPendingRequestsDialogFragment confirmApproveAllPendingRequestsDialogFragment) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        confirmApproveAllPendingRequestsDialogFragment.A0G().A0i("group_join_request_approve_all_pending_requests", bundle);
    }

    public static /* synthetic */ void A02(Bundle bundle, ConfirmApproveAllPendingRequestsDialogFragment confirmApproveAllPendingRequestsDialogFragment) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        confirmApproveAllPendingRequestsDialogFragment.A0G().A0i("group_join_request_approve_all_pending_requests", bundle);
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A02(R.string.str0abe);
        A0c.A01(R.string.str0abd);
        Bundle A0D = C13690nt.A0D();
        AnonymousClass3K4.A0n(A0c, A0D, this, 18, R.string.str0e87);
        A0c.setNegativeButton(R.string.str0394, new IDxCListenerShape29S0200000_2_I1(A0D, 17, this));
        return A0c.create();
    }
}
