package com.obwhatsapp;

import X.AnonymousClass1MY;
import X.C13690nt;
import X.C14870pt;
import X.C16000sG;
import X.C16040sK;
import X.C17090uW;
import X.C19230xz;
import X.C19980zJ;
import X.C204310c;
import X.C25691Kt;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class PhoneHyperLinkDialogFragment extends Hilt_PhoneHyperLinkDialogFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public C17090uW A02;
    public C16040sK A03;
    public C204310c A04;
    public C16000sG A05;
    public C19230xz A06;
    public AnonymousClass1MY A07;
    public UserJid A08;
    public C25691Kt A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public static PhoneHyperLinkDialogFragment A01(UserJid userJid, String str, String str2, boolean z2, boolean z3, boolean z4) {
        PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = new PhoneHyperLinkDialogFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putBoolean("isSyncFailure", z2);
        A0D2.putBoolean("isWAAccount", z3);
        A0D2.putBoolean("isPhoneNumberOwner", z4);
        A0D2.putString("phoneNumber", str);
        A0D2.putParcelable("jid", userJid);
        A0D2.putString("url", str2);
        phoneHyperLinkDialogFragment.A0T(A0D2);
        return phoneHyperLinkDialogFragment;
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 == 1000) {
            this.A06.A07();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r8) {
        /*
            r7 = this;
            android.os.Bundle r2 = r7.A04()
            java.lang.String r0 = "isSyncFailure"
            boolean r0 = r2.getBoolean(r0)
            r7.A0D = r0
            java.lang.String r0 = "isWAAccount"
            boolean r0 = r2.getBoolean(r0)
            r7.A0E = r0
            java.lang.String r0 = "isPhoneNumberOwner"
            boolean r0 = r2.getBoolean(r0)
            r7.A0C = r0
            X.013 r1 = r7.A02
            java.lang.String r0 = "phoneNumber"
            java.lang.String r0 = r2.getString(r0)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r1.A0H(r0)
            r7.A0A = r0
            java.lang.String r0 = "jid"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r7.A08 = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.getString(r0)
            X.AnonymousClass00B.A06(r0)
            r7.A0B = r0
            X.1fu r5 = X.AnonymousClass3K2.A0R(r7)
            android.view.LayoutInflater r2 = r7.A05()
            r1 = 2131559569(0x7f0d0491, float:1.8744486E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x0069
            boolean r1 = r7.A0E
            r0 = 2131890815(0x7f12127f, float:1.9416332E38)
            if (r1 == 0) goto L_0x0062
            r0 = 2131890816(0x7f121280, float:1.9416334E38)
        L_0x0062:
            r2.setText(r0)
            X.0PG r0 = r5.A01
            r0.A0B = r2
        L_0x0069:
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            boolean r0 = r7.A0E
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00d3
            r2 = 2131887174(0x7f120446, float:1.9408948E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r1 = X.C13690nt.A0c(r7, r0, r1, r3, r2)
            X.4Qg r0 = new X.4Qg
            r0.<init>(r1, r6)
            r4.add(r0)
            X.0sK r1 = r7.A03
            com.whatsapp.jid.UserJid r0 = r7.A08
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x00a0
            r0 = 2131886955(0x7f12036b, float:1.9408503E38)
            java.lang.String r2 = r7.A0J(r0)
            r1 = 4
        L_0x0098:
            X.4Qg r0 = new X.4Qg
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00a0:
            X.0sK r0 = r7.A03
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ba
            r0 = 2131886278(0x7f1200c6, float:1.940713E38)
            java.lang.String r2 = r7.A0J(r0)
            r1 = 3
            X.4Qg r0 = new X.4Qg
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00ba:
            android.content.Context r2 = r7.A02()
            r0 = 2131559568(0x7f0d0490, float:1.8744484E38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r2, r0, r4)
            com.facebook.redex.IDxCListenerShape29S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape29S0200000_2_I1
            r0.<init>(r4, r3, r7)
            r5.A04(r0, r1)
            X.02l r0 = r5.create()
            return r0
        L_0x00d3:
            r2 = 2131887847(0x7f1206e7, float:1.9410313E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0A
            java.lang.String r2 = X.C13690nt.A0c(r7, r0, r1, r3, r2)
            r1 = 2
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.PhoneHyperLinkDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A07.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E), 8);
    }
}
