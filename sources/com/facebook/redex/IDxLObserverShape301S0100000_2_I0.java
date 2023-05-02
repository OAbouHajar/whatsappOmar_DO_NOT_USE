package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2DC;
import X.AnonymousClass3K4;
import X.C109505Sk;
import X.C13680ns;
import X.C15830rv;
import X.C16050sL;
import X.C34901l3;
import X.C37831po;
import X.C56052ks;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.group.GroupCallButtonController;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

public class IDxLObserverShape301S0100000_2_I0 implements C109505Sk {
    public Object A00;
    public final int A01;

    public IDxLObserverShape301S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ANt() {
        if (this.A01 == 0) {
            Log.i("voip/CallsFragment/onCallLogDeleted");
            ((CallsHistoryFragment) this.A00).A1E();
        }
    }

    public void ANu(C37831po r4) {
        switch (this.A01) {
            case 0:
                Log.i("CallsFragment/onCallLogUpdated");
                ((CallsHistoryFragment) this.A00).A1E();
                return;
            case 1:
                C56052ks r2 = (C56052ks) this.A00;
                C15830rv r1 = r2.A0Y;
                if (r1.equals(r4.A04)) {
                    Log.i(AnonymousClass000.A0g("groupconversationmenu/onCallLogUpdated groupJid: ", r1));
                    if (!C34901l3.A00(r4.A06, r2.A03)) {
                        r2.A03 = r4.A06;
                        r2.A01.invalidateOptionsMenu();
                    }
                    if (r2.A03 == null) {
                        r4 = null;
                    }
                    r2.A02 = r4;
                    return;
                }
                return;
            case 2:
                StringBuilder A0r = AnonymousClass000.A0r("GroupCallButtonController/onCallLogUpdated groupJid: ");
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                A0r.append(groupCallButtonController.A05);
                C13680ns.A1V(A0r);
                if (groupCallButtonController.A05.equals(r4.A04)) {
                    if (!C34901l3.A00(r4.A06, groupCallButtonController.A07)) {
                        groupCallButtonController.A07 = r4.A06;
                        AnonymousClass2DC r0 = groupCallButtonController.A04;
                        if (r0 != null) {
                            r0.A00.A02();
                        }
                    }
                    if (groupCallButtonController.A07 == null) {
                        r4 = null;
                    }
                    groupCallButtonController.A06 = r4;
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                C16050sL r12 = quickContactActivity.A0X;
                if (r12 != null && r12.equals(r4.A04)) {
                    quickContactActivity.A0k = r4;
                    if (!C34901l3.A00(r4.A06, quickContactActivity.A0n)) {
                        quickContactActivity.A0n = r4.A06;
                        AnonymousClass3K4.A0t(quickContactActivity);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void ANv(Collection collection) {
        if (this.A01 == 0) {
            Log.i("voip/CallsFragment/onCallLogDeleted");
            ((CallsHistoryFragment) this.A00).A1E();
        }
    }
}
