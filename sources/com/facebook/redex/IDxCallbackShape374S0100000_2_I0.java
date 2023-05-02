package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2DC;
import X.AnonymousClass3K4;
import X.AnonymousClass5P9;
import X.C13680ns;
import X.C34901l3;
import X.C38571r0;
import X.C56052ks;
import com.obwhatsapp.group.GroupCallButtonController;
import com.obwhatsapp.quickcontact.QuickContactActivity;

public class IDxCallbackShape374S0100000_2_I0 implements AnonymousClass5P9 {
    public Object A00;
    public final int A01;

    public IDxCallbackShape374S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ASU(C38571r0 r4) {
        switch (this.A01) {
            case 0:
                C56052ks r2 = (C56052ks) this.A00;
                StringBuilder A0r = AnonymousClass000.A0r("groupconversationmenu/fetchJoinableCallLogCallback groupJid: ");
                A0r.append(r2.A0Y);
                C13680ns.A1V(A0r);
                if (!C34901l3.A00(r4, r2.A03)) {
                    r2.A03 = r4;
                    if (r4 != null) {
                        r2.A08(r4.A00);
                    }
                    r2.A01.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                StringBuilder A0r2 = AnonymousClass000.A0r("GroupCallButtonController/fetchJoinableCallLogCallback groupJid: ");
                A0r2.append(groupCallButtonController.A05);
                C13680ns.A1V(A0r2);
                if (!C34901l3.A00(r4, groupCallButtonController.A07)) {
                    groupCallButtonController.A07 = r4;
                    if (r4 != null) {
                        groupCallButtonController.A05(r4.A00);
                    }
                }
                AnonymousClass2DC r0 = groupCallButtonController.A04;
                if (r0 != null) {
                    r0.A00.A02();
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                if (r4 != null) {
                    quickContactActivity.A0n = r4;
                    quickContactActivity.A35();
                    AnonymousClass3K4.A0t(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
