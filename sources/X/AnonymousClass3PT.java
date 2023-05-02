package X;

import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.obwhatsapp.group.GroupPendingInvitesFragment;

/* renamed from: X.3PT  reason: invalid class name */
public class AnonymousClass3PT extends AnonymousClass011 {
    public final int A00;
    public final Context A01;
    public final String A02;

    public AnonymousClass3PT(Context context, AnonymousClass02C r3, String str, boolean z2) {
        super(r3, 0);
        this.A01 = context;
        this.A02 = str;
        this.A00 = C13690nt.A00(z2 ? 1 : 0);
    }

    public int A01() {
        return this.A00;
    }

    public CharSequence A04(int i2) {
        Context context;
        int i3;
        if (i2 == 0) {
            context = this.A01;
            i3 = R.string.str0aef;
        } else if (i2 == 1) {
            context = this.A01;
            i3 = R.string.str0aee;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("The item ");
            A0r.append(i2);
            A0r.append(" should be less than: ");
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(A0r, this.A00));
        }
        String string = context.getString(i3);
        C18450wi.A0B(string);
        return string;
    }

    public AnonymousClass01A A0G(int i2) {
        if (i2 == 0) {
            String str = this.A02;
            Bundle A0D = C13690nt.A0D();
            A0D.putString("gid", str);
            GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = new GroupMembershipApprovalRequestsFragment();
            groupMembershipApprovalRequestsFragment.A0T(A0D);
            return groupMembershipApprovalRequestsFragment;
        } else if (i2 == 1) {
            String str2 = this.A02;
            Bundle A0D2 = C13690nt.A0D();
            A0D2.putString("gid", str2);
            GroupPendingInvitesFragment groupPendingInvitesFragment = new GroupPendingInvitesFragment();
            groupPendingInvitesFragment.A0T(A0D2);
            return groupPendingInvitesFragment;
        } else {
            throw AnonymousClass000.A0T(C18450wi.A06("The item position should be less than: ", Integer.valueOf(this.A00)));
        }
    }
}
