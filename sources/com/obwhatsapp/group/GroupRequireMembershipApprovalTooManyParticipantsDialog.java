package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaDialogFragment;

public final class GroupRequireMembershipApprovalTooManyParticipantsDialog extends WaDialogFragment {
    public static final void A01(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0G().A0i("group_join_request_group_too_full", bundle);
    }

    public static final void A02(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0G().A0i("group_join_request_group_too_full", bundle);
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A02(R.string.str0abf);
        Bundle bundle2 = this.A05;
        int i2 = bundle2 == null ? 0 : bundle2.getInt("remaining_capacity");
        Bundle bundle3 = this.A05;
        int i3 = bundle3 == null ? 0 : bundle3.getInt("pending_request_count");
        Resources A03 = A03();
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1M(A1Z, i2, 0);
        AnonymousClass000.A1M(A1Z, i3, 1);
        A0c.A06(A03.getQuantityString(R.plurals.plurals00ae, i3, A1Z));
        Bundle A0D = C13690nt.A0D();
        AnonymousClass3K4.A0n(A0c, this, A0D, 20, R.string.str02ac);
        A0c.setNegativeButton(R.string.str0394, new IDxCListenerShape29S0200000_2_I1(this, 19, A0D));
        return A0c.create();
    }
}
