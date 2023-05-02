package com.whatsapp.util;

import X.AnonymousClass1yL;
import X.AnonymousClass2DL;
import X.C15860rz;
import X.C16010sH;
import X.C204310c;
import X.C222417e;
import X.C30341cC;
import X.C34331k5;
import android.content.SharedPreferences;
import android.view.View;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.calling.views.PermissionDialogFragment;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.jid.GroupJid;

public class ViewOnClickCListenerShape0S0110000_I0 extends C34331k5 {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape0S0110000_I0(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public void A06(View view) {
        switch (this.A02) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                C204310c r4 = callLogActivity.A09;
                C16010sH r3 = callLogActivity.A0L;
                if (r4.A03(callLogActivity, GroupJid.of(callLogActivity.A0P), C30341cC.A0C(callLogActivity.A01, callLogActivity.A0C, callLogActivity.A0K, r3), 4, this.A01) == 0) {
                    callLogActivity.finish();
                    return;
                }
                return;
            case 1:
                boolean z2 = this.A01;
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                if (z2) {
                    permissionDialogFragment.A0A = true;
                    AnonymousClass1yL.A05(permissionDialogFragment.A0D());
                    return;
                }
                permissionDialogFragment.A01.dismiss();
                RequestPermissionActivity.A0P(permissionDialogFragment, permissionDialogFragment.A08, permissionDialogFragment.A0D);
                return;
            case 2:
                AnonymousClass2DL r5 = (AnonymousClass2DL) this.A00;
                r5.A38();
                if (this.A01) {
                    C222417e.A00(r5, r5.findViewById(R.id.content), r5.A01, r5.A36(), 2);
                    return;
                }
                r5.Afb(MuteDialogFragment.A01(r5.A36(), 2), (String) null);
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                C15860rz r1 = quickContactActivity.A09;
                C16010sH r42 = quickContactActivity.A0R;
                boolean z3 = this.A01;
                if (((SharedPreferences) r1.A01.get()).getInt("call_confirmation_dialog_count", 0) < 5 || r42.A0J()) {
                    C30341cC.A0G(quickContactActivity, r42, 7, z3);
                    return;
                }
                C204310c r43 = quickContactActivity.A0C;
                C16010sH r32 = quickContactActivity.A0R;
                if (r43.A03(quickContactActivity, quickContactActivity.A0X, C30341cC.A0C(quickContactActivity.A01, quickContactActivity.A0F, quickContactActivity.A0P, r32), 7, z3) == 0) {
                    quickContactActivity.A37(false);
                    return;
                }
                return;
        }
    }
}
