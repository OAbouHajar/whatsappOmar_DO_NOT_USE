package com.facebook.redex;

import android.widget.AbsListView;
import com.obwhatsapp.contact.picker.BidiContactListView;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import com.obwhatsapp.group.GroupParticipantsSearchFragment;

public class IDxSListenerShape15S0101000_2_I1 implements AbsListView.OnScrollListener {
    public int A00;
    public Object A01;
    public final int A02 = 0;

    public IDxSListenerShape15S0101000_2_I1(BidiContactListView bidiContactListView) {
        this.A01 = bidiContactListView;
        this.A00 = 0;
    }

    public IDxSListenerShape15S0101000_2_I1(PhoneContactsSelector phoneContactsSelector) {
        this.A01 = phoneContactsSelector;
        this.A00 = 0;
    }

    public IDxSListenerShape15S0101000_2_I1(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        this.A01 = groupParticipantsSearchFragment;
        this.A00 = 0;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r3, int r4) {
        /*
            r2 = this;
            int r1 = r2.A02
            int r0 = r2.A00
            switch(r1) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0022;
                default: goto L_0x0007;
            }
        L_0x0007:
            if (r0 != 0) goto L_0x0014
            if (r4 == r0) goto L_0x0014
            java.lang.Object r0 = r2.A01
            com.obwhatsapp.group.GroupParticipantsSearchFragment r0 = (com.obwhatsapp.group.GroupParticipantsSearchFragment) r0
            X.1Ai r0 = r0.A08
        L_0x0011:
            r0.A01(r3)
        L_0x0014:
            r2.A00 = r4
            return
        L_0x0017:
            if (r0 != 0) goto L_0x0014
            if (r4 == r0) goto L_0x0014
            java.lang.Object r0 = r2.A01
            com.obwhatsapp.contact.picker.BidiContactListView r0 = (com.obwhatsapp.contact.picker.BidiContactListView) r0
            X.1Ai r0 = r0.A01
            goto L_0x0011
        L_0x0022:
            if (r0 != 0) goto L_0x0014
            if (r4 == r0) goto L_0x0014
            java.lang.Object r0 = r2.A01
            X.0pL r0 = (X.C14530pL) r0
            X.1Ai r0 = r0.A0B
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSListenerShape15S0101000_2_I1.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
