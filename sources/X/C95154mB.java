package X;

import android.os.Bundle;
import com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog;
import com.obwhatsapp.group.GroupSettingsActivity;

/* renamed from: X.4mB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95154mB implements AnonymousClass023 {
    public final /* synthetic */ GroupSettingsActivity A00;

    public /* synthetic */ C95154mB(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    public final void AOH(Object obj) {
        GroupSettingsActivity groupSettingsActivity = this.A00;
        C83774Hz r7 = (C83774Hz) obj;
        int i2 = r7.A01;
        int i3 = r7.A00;
        GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog = new GroupRequireMembershipApprovalTooManyParticipantsDialog();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("remaining_capacity", i2);
        A0D.putInt("pending_request_count", i3);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0T(A0D);
        groupSettingsActivity.Afb(groupRequireMembershipApprovalTooManyParticipantsDialog, "group_join_request_group_too_full");
    }
}
