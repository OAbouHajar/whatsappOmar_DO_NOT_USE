package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass0Fe;
import X.AnonymousClass12W;
import X.AnonymousClass1M1;
import X.AnonymousClass29T;
import X.AnonymousClass2KO;
import X.C14730pf;
import X.C14870pt;
import X.C15800rs;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16320sq;
import X.C16760tb;
import X.C25721Kw;
import X.C42891yr;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsChatHistoryFragment extends Hilt_SettingsChatHistoryFragment {
    public C14870pt A00;
    public C16040sK A01;
    public C15900s5 A02;
    public C16760tb A03;
    public C16000sG A04;
    public C15800rs A05;
    public AnonymousClass1M1 A06;
    public AnonymousClass12W A07;
    public C14730pf A08;
    public C15830rv A09;
    public C25721Kw A0A;
    public C16320sq A0B;

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 == 10 && i3 == -1) {
            C15830rv A022 = C15830rv.A02(intent.getStringExtra("contact"));
            AnonymousClass00B.A07(A022, intent.getStringExtra("contact"));
            this.A09 = A022;
            AnonymousClass2KO r6 = this.A00;
            if (r6 != null) {
                AnonymousClass1M1 r5 = this.A06;
                C16010sH A082 = this.A04.A08(A022);
                if (r5.A04.A0B((C42891yr) null, A022, 1, 2).size() > 0) {
                    AnonymousClass29T.A01(r6, 10);
                } else {
                    r5.A01(r6, r6, A082, false);
                }
            }
        }
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        AnonymousClass0Fe r2 = this.A06;
        r2.A00 = colorDrawable.getIntrinsicHeight();
        r2.A01 = colorDrawable;
        PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
        preferenceFragmentCompat.A03.A0N();
        r2.A00 = 0;
        preferenceFragmentCompat.A03.A0N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        if (r1 == 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A19(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            X.2KO r0 = r5.A00
            if (r0 == 0) goto L_0x0083
            X.00l r1 = r5.A0D()
            r0 = 2131891510(0x7f121536, float:1.9417742E38)
            java.lang.String r1 = r1.getString(r0)
            X.2KO r0 = r5.A00
            if (r0 == 0) goto L_0x0016
            r0.setTitle(r1)
        L_0x0016:
            r0 = 2132082695(0x7f150007, float:1.9805511E38)
            r5.A1C(r0)
            X.0s5 r1 = r5.A02
            X.0s8 r0 = X.C15910s6.A0K
            boolean r0 = r1.A05(r0)
            java.lang.String r2 = "email_chat_history"
            if (r0 == 0) goto L_0x0084
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0084
            androidx.preference.Preference r2 = r5.A92(r2)
            r1 = 2
            com.facebook.redex.IDxCListenerShape348S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape348S0100000_2_I0
            r0.<init>(r5, r1)
            r2.A0B = r0
        L_0x003c:
            java.lang.String r0 = "msgstore_delete_all_chats"
            androidx.preference.Preference r2 = r5.A92(r0)
            r1 = 1
            com.facebook.redex.IDxCListenerShape348S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape348S0100000_2_I0
            r0.<init>(r5, r1)
            r2.A0B = r0
            java.lang.String r0 = "msgstore_clear_all_chats"
            androidx.preference.Preference r2 = r5.A92(r0)
            r1 = 0
            com.facebook.redex.IDxCListenerShape348S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape348S0100000_2_I0
            r0.<init>(r5, r1)
            r2.A0B = r0
            java.lang.String r4 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r5.A92(r4)
            X.0rs r0 = r5.A05
            int r2 = r0.A02()
            X.0rs r0 = r5.A05
            int r1 = r0.A01()
            if (r2 > 0) goto L_0x0071
            r0 = 2131892328(0x7f121868, float:1.9419401E38)
            if (r1 != 0) goto L_0x0074
        L_0x0071:
            r0 = 2131893212(0x7f121bdc, float:1.9421194E38)
        L_0x0074:
            r3.A0A(r0)
            androidx.preference.Preference r2 = r5.A92(r4)
            r1 = 3
            com.facebook.redex.IDxCListenerShape348S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape348S0100000_2_I0
            r0.<init>(r5, r1)
            r2.A0B = r0
        L_0x0083:
            return
        L_0x0084:
            X.04e r0 = r5.A02
            androidx.preference.PreferenceScreen r1 = r0.A07
            if (r1 == 0) goto L_0x003c
            androidx.preference.Preference r0 = r5.A92(r2)
            if (r0 == 0) goto L_0x003c
            r1.A0V(r0)
            r1.A05()
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsChatHistoryFragment.A19(java.lang.String, android.os.Bundle):void");
    }
}
