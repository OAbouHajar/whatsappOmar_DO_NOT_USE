package com.whatsapp.util;

import X.AnonymousClass01A;
import X.AnonymousClass1yL;
import X.AnonymousClass3AW;
import X.C001000l;
import X.C34331k5;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.permissions.RequestPermissionsBottomSheet;

public class ViewOnClickCListenerShape0S1100000_I0 extends C34331k5 {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape0S1100000_I0(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public ViewOnClickCListenerShape0S1100000_I0(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A02 = 0;
        this.A00 = acceptInviteLinkActivity;
        this.A01 = "invite-via-link-unavailable";
    }

    public void A06(View view) {
        switch (this.A02) {
            case 0:
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                acceptInviteLinkActivity.A06.A00(acceptInviteLinkActivity, "invite-via-link-unavailable");
                return;
            case 1:
                AnonymousClass01A r0 = (AnonymousClass01A) this.A00;
                r0.A02();
                r0.A02();
                AnonymousClass1yL.A03(r0.A04(), "");
                throw new UnsupportedOperationException();
            case 2:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                AnonymousClass3AW r1 = new AnonymousClass3AW(view, callLogActivity.A0P, (Integer) 6);
                r1.A04 = this.A01;
                r1.A02(callLogActivity);
                return;
            default:
                String str = this.A01;
                if (str != null) {
                    ((RequestPermissionsBottomSheet) this.A00).A06.A04(str, "not_now");
                }
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                dialogFragment.A1C();
                C001000l A0C = dialogFragment.A0C();
                if (A0C != null) {
                    A0C.finish();
                    return;
                }
                return;
        }
    }
}
