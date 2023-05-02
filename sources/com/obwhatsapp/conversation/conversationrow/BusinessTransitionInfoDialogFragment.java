package com.obwhatsapp.conversation.conversationrow;

import X.C13690nt;
import X.C15830rv;
import X.C16000sG;
import X.C16070sO;
import X.C16490t9;
import X.C17220uj;
import X.C17250um;
import X.C19980zJ;
import X.C75073rZ;
import android.content.DialogInterface;
import android.os.Bundle;

public class BusinessTransitionInfoDialogFragment extends Hilt_BusinessTransitionInfoDialogFragment {
    public C19980zJ A00;
    public C16000sG A01;
    public C16070sO A02;
    public C17250um A03;
    public C16490t9 A04;
    public C75073rZ A05;
    public C17220uj A06;

    public static BusinessTransitionInfoDialogFragment A01(C15830rv r4, String str, int i2, int i3) {
        BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = new BusinessTransitionInfoDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("message", str);
        A0D.putInt("transitionId", i2);
        A0D.putInt("systemAction", i3);
        if (r4 != null) {
            A0D.putString("jid", r4.getRawString());
        }
        businessTransitionInfoDialogFragment.A0T(A0D);
        return businessTransitionInfoDialogFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r2 = r6.A04()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getString(r0)
            X.0rv r3 = X.C15830rv.A02(r0)
            java.lang.String r0 = "message"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r0 = "transitionId"
            int r4 = r2.getInt(r0)
            java.lang.String r1 = "systemAction"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            r0 = 69
            if (r1 != r0) goto L_0x0061
            if (r3 == 0) goto L_0x0061
            X.3rZ r2 = new X.3rZ
            r2.<init>()
            r6.A05 = r2
            boolean r0 = r3 instanceof X.C16060sN
            if (r0 == 0) goto L_0x008f
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 == 0) goto L_0x008f
            X.0sO r0 = r6.A02
            X.0sN r3 = (X.C16060sN) r3
            int r0 = r0.A01(r3)
            int r0 = X.C40511uF.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            r1 = 2
        L_0x004b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
        L_0x0051:
            X.3rZ r2 = r6.A05
            r1 = 2
            if (r4 == r1) goto L_0x005b
            r0 = 3
            r1 = 1
            if (r4 == r0) goto L_0x005b
            r1 = 0
        L_0x005b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A03 = r0
        L_0x0061:
            X.1fu r3 = X.AnonymousClass3K3.A0c(r6)
            android.content.Context r1 = r6.A0u()
            X.0um r0 = r6.A03
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A05(r1, r0, r5)
            r3.A06(r0)
            r0 = 1
            r3.A07(r0)
            r2 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r1 = 1
            com.facebook.redex.IDxCListenerShape7S0101000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape7S0101000_2_I1
            r0.<init>(r6, r4, r1)
            r3.A0B(r0, r2)
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
            r0 = 44
            X.C13690nt.A1H(r3, r6, r0, r1)
            X.02l r0 = r3.create()
            return r0
        L_0x008f:
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0051
            X.0sG r0 = r6.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r0 = r0.A0Z(r3)
            r1 = 1
            if (r0 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C75073rZ r1 = this.A05;
        if (r1 != null) {
            r1.A01 = 0;
            this.A04.A06(r1);
        }
        super.onCancel(dialogInterface);
    }
}
