package com.obwhatsapp.registration.accountdefence.ui;

import X.C005702l;
import X.C16040sK;
import X.C16440t3;
import X.C17190ug;
import X.C28951Zk;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class DeviceConfirmationRegAlertDialogFragment extends Hilt_DeviceConfirmationRegAlertDialogFragment {
    public static C28951Zk A06;
    public View A00;
    public Button A01;
    public Button A02;
    public C16040sK A03;
    public C16440t3 A04;
    public C17190ug A05;

    public DeviceConfirmationRegAlertDialogFragment(C28951Zk r1) {
        A06 = r1;
    }

    public void A14() {
        Dialog dialog;
        Dialog dialog2;
        super.A14();
        if (this.A02 == null && (dialog2 = this.A03) != null) {
            this.A02 = ((C005702l) dialog2).A00.A0G;
        }
        if (this.A01 == null && (dialog = this.A03) != null) {
            this.A01 = ((C005702l) dialog).A00.A0E;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.A02()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558495(0x7f0d005f, float:1.8742307E38)
            r0 = 0
            r3 = 0
            android.view.View r1 = r2.inflate(r1, r0, r3)
            r6.A00 = r1
            r0 = 2131364751(0x7f0a0b8f, float:1.8349348E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            r0.setVisibility(r3)
            android.view.View r1 = r6.A00
            r0 = 2131364386(0x7f0a0a22, float:1.8348608E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r6.A00
            r0 = 2131364750(0x7f0a0b8e, float:1.8349346E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131886173(0x7f12005d, float:1.9406917E38)
            r1.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131364747(0x7f0a0b8b, float:1.834934E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0sK r0 = r6.A03
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x00f4
            java.lang.String r4 = r0.jabber_id
            if (r4 == 0) goto L_0x00f4
            X.013 r2 = r6.A02
            java.lang.String r1 = r0.cc
            int r0 = r1.length()
            java.lang.String r0 = r4.substring(r0)
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r1, r0)
            java.lang.String r2 = r2.A0H(r0)
            if (r2 == 0) goto L_0x00f4
            r1 = 2131886169(0x7f120059, float:1.940691E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r2
            java.lang.String r0 = r6.A0K(r1, r0)
        L_0x0075:
            r5.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131364748(0x7f0a0b8c, float:1.8349342E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.1Zk r0 = A06
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.0t3 r4 = r6.A04
            X.013 r2 = r6.A02
            long r0 = r0.getTime()
            long r0 = r4.A02(r0)
            java.lang.CharSequence r0 = X.C28961Zl.A01(r2, r0)
            r5.setText(r0)
            android.view.View r1 = r6.A00
            r0 = 2131364749(0x7f0a0b8d, float:1.8349344E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.1Zk r0 = A06
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x00e7
            r0 = 2131886172(0x7f12005c, float:1.9406915E38)
            java.lang.String r0 = r6.A0J(r0)
        L_0x00b7:
            r4.setText(r0)
            X.00l r0 = r6.A0D()
            X.1fu r3 = new X.1fu
            r3.<init>(r0)
            android.view.View r0 = r6.A00
            r3.setView(r0)
            r2 = 2131886168(0x7f120058, float:1.9406907E38)
            r1 = 127(0x7f, float:1.78E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886167(0x7f120057, float:1.9406905E38)
            r1 = 126(0x7e, float:1.77E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r6, r1)
            r3.setNegativeButton(r2, r0)
            X.02l r0 = r3.create()
            return r0
        L_0x00e7:
            r1 = 2131886171(0x7f12005b, float:1.9406913E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r2
            java.lang.String r0 = r6.A0K(r1, r0)
            goto L_0x00b7
        L_0x00f4:
            r0 = 2131886170(0x7f12005a, float:1.9406911E38)
            java.lang.String r0 = r6.A0J(r0)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }
}
