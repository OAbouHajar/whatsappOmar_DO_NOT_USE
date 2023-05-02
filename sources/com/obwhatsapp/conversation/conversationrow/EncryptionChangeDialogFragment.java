package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass15W;
import X.C13690nt;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16490t9;
import X.C17030uP;
import X.C17220uj;
import X.C17250um;
import X.C19980zJ;
import X.C20260zl;
import X.C32441gM;
import X.C75073rZ;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class EncryptionChangeDialogFragment extends Hilt_EncryptionChangeDialogFragment {
    public C19980zJ A00;
    public C16040sK A01;
    public C15900s5 A02;
    public C16000sG A03;
    public C17030uP A04;
    public C16080sP A05;
    public C16070sO A06;
    public C17250um A07;
    public C20260zl A08;
    public C16490t9 A09;
    public C75073rZ A0A;
    public AnonymousClass15W A0B;
    public C17220uj A0C;

    public static EncryptionChangeDialogFragment A01(C17030uP r5, UserJid userJid) {
        C32441gM r4 = new C32441gM(r5, userJid);
        EncryptionChangeDialogFragment encryptionChangeDialogFragment = new EncryptionChangeDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", userJid.getRawString());
        A0D.putInt("business_state_id", r4.A01());
        encryptionChangeDialogFragment.A0T(A0D);
        return encryptionChangeDialogFragment;
    }

    public static EncryptionChangeDialogFragment A02(C15830rv r5) {
        EncryptionChangeDialogFragment encryptionChangeDialogFragment = new EncryptionChangeDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r5.getRawString());
        A0D.putInt("provider_category", 0);
        encryptionChangeDialogFragment.A0T(A0D);
        return encryptionChangeDialogFragment;
    }

    public static EncryptionChangeDialogFragment A03(C15830rv r4, int i2) {
        EncryptionChangeDialogFragment encryptionChangeDialogFragment = new EncryptionChangeDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r4.getRawString());
        A0D.putInt("business_state_id", i2);
        encryptionChangeDialogFragment.A0T(A0D);
        return encryptionChangeDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016c, code lost:
        if (r10.A04.A0C(1967) == false) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r11) {
        /*
            r10 = this;
            android.os.Bundle r3 = r10.A04()
            java.lang.String r0 = "jid"
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r0 = "provider_category"
            r8 = 0
            int r9 = r3.getInt(r0, r8)
            java.lang.String r1 = "business_state_id"
            r0 = -1
            int r5 = r3.getInt(r1, r0)
            X.0rv r6 = X.C15830rv.A02(r2)
            java.lang.String r0 = "Invalid jid="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            X.AnonymousClass00B.A07(r6, r0)
            r7 = -1
            boolean r0 = X.AnonymousClass000.A1R(r5, r7)
            r4 = 1
            if (r0 == 0) goto L_0x0154
            X.0sG r0 = r10.A03
            X.0sH r2 = r0.A0A(r6)
            if (r9 == 0) goto L_0x00af
            X.0zl r5 = r10.A08
            android.content.Context r3 = r10.A02()
            X.0sG r0 = r10.A03
            X.0sP r1 = r10.A05
            X.0sH r0 = r0.A0A(r6)
            java.lang.String r2 = r1.A0G(r0, r7, r4)
            switch(r9) {
                case 1: goto L_0x0098;
                case 2: goto L_0x009c;
                case 3: goto L_0x009c;
                case 4: goto L_0x0098;
                case 5: goto L_0x009c;
                case 6: goto L_0x009c;
                default: goto L_0x004e;
            }
        L_0x004e:
            r0 = 2131888107(0x7f1207eb, float:1.941084E38)
            java.lang.String r3 = r3.getString(r0)
        L_0x0055:
            X.0uj r2 = r10.A0C
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A05(r1, r0)
        L_0x005f:
            X.01Q r2 = new X.01Q
            r2.<init>(r3, r0)
        L_0x0064:
            java.lang.Object r6 = r2.A00
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r2.A01
            X.1fu r3 = X.AnonymousClass3K2.A0R(r10)
            android.content.Context r1 = r10.A02()
            X.0um r0 = r10.A07
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A05(r1, r0, r6)
            r3.A06(r0)
            r3.A07(r4)
            r2 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r1 = 13
            com.facebook.redex.IDxCListenerShape29S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape29S0200000_2_I1
            r0.<init>(r5, r1, r10)
            r3.A0B(r0, r2)
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
            r0 = 45
            X.C13690nt.A1H(r3, r10, r0, r1)
            X.02l r0 = r3.create()
            return r0
        L_0x0098:
            r1 = 2131886659(0x7f120243, float:1.9407903E38)
            goto L_0x00a8
        L_0x009c:
            boolean r0 = X.C32431gL.A00(r5, r6)
            r1 = 2131886661(0x7f120245, float:1.9407907E38)
            if (r0 == 0) goto L_0x00a8
            r1 = 2131887451(0x7f12055b, float:1.940951E38)
        L_0x00a8:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = X.C13680ns.A0d(r3, r2, r0, r8, r1)
            goto L_0x0055
        L_0x00af:
            X.15W r0 = r10.A0B
            boolean r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x00c7
            r0 = 2131887453(0x7f12055d, float:1.9409514E38)
            java.lang.String r3 = r10.A0J(r0)
            X.0uj r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
        L_0x00c2:
            android.net.Uri r0 = r1.A04(r0)
            goto L_0x005f
        L_0x00c7:
            X.0pd r0 = r10.A04
            boolean r0 = X.C40571uL.A00(r0, r6)
            if (r0 == 0) goto L_0x00e3
            android.content.Context r3 = r10.A02()
            r2 = 2131890948(0x7f121304, float:1.9416602E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "OBWhatsApp Surveys"
            java.lang.String r3 = X.C13680ns.A0d(r3, r0, r1, r8, r2)
            X.0uj r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
            goto L_0x00c2
        L_0x00e3:
            X.0zl r0 = r10.A08
            boolean r0 = X.C40561uK.A01(r0, r6)
            if (r0 == 0) goto L_0x00fb
            android.content.Context r1 = r10.A02()
            r0 = 2131893048(0x7f121b38, float:1.9420862E38)
            java.lang.String r3 = X.C34811ku.A05(r1, r0)
            X.0uj r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x00c2
        L_0x00fb:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r6)
            if (r1 == 0) goto L_0x0152
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x0152
            X.0uP r0 = r10.A04
            boolean r2 = r0.A02(r1)
        L_0x010d:
            X.0zl r0 = r10.A08
            boolean r1 = X.C32431gL.A00(r0, r6)
            r0 = 2131888107(0x7f1207eb, float:1.941084E38)
            if (r1 == 0) goto L_0x011b
            r0 = 2131893024(0x7f121b20, float:1.9420813E38)
        L_0x011b:
            java.lang.String r3 = r10.A0J(r0)
            if (r2 == 0) goto L_0x0133
            X.0uj r1 = r10.A0C
            java.lang.String r0 = "26000103"
            android.net.Uri r0 = r1.A04(r0)
            java.lang.String r0 = r0.toString()
        L_0x012d:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x005f
        L_0x0133:
            java.lang.String r0 = "https://www.whatsapp.com/security?lg="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.013 r0 = r10.A02
            java.lang.String r0 = r0.A06()
            r1.append(r0)
            java.lang.String r0 = "&lc="
            r1.append(r0)
            X.013 r0 = r10.A02
            java.lang.String r0 = r0.A05()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x012d
        L_0x0152:
            r2 = 0
            goto L_0x010d
        L_0x0154:
            X.3rZ r0 = new X.3rZ
            r0.<init>()
            r10.A0A = r0
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0I(r6)
            if (r0 == 0) goto L_0x016e
            X.0pd r1 = r10.A04
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r1.A0C(r0)
            r2 = 1
            if (r0 != 0) goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.net.Uri r7 = android.net.Uri.parse(r0)
            X.15W r0 = r10.A0B
            boolean r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x01d9
            r0 = 2131890947(0x7f121303, float:1.94166E38)
            java.lang.String r3 = r10.A0J(r0)
            X.0uj r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r7 = r1.A04(r0)
        L_0x018c:
            X.01Q r2 = new X.01Q
            r2.<init>(r3, r7)
            X.3rZ r3 = r10.A0A
            boolean r0 = r6 instanceof X.C16060sN
            if (r0 == 0) goto L_0x01c8
            boolean r0 = X.C16030sJ.A0L(r6)
            if (r0 == 0) goto L_0x01c8
            X.0sO r0 = r10.A06
            X.0sN r6 = (X.C16060sN) r6
            int r0 = r0.A01(r6)
            int r0 = X.C40511uF.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            r1 = 2
        L_0x01b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A00 = r0
        L_0x01b6:
            X.3rZ r1 = r10.A0A
            switch(r5) {
                case 5: goto L_0x01c6;
                case 6: goto L_0x01c6;
                case 7: goto L_0x01c4;
                case 8: goto L_0x01c4;
                case 9: goto L_0x01c6;
                case 10: goto L_0x01c6;
                case 11: goto L_0x01c6;
                case 12: goto L_0x01c6;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01c6;
                default: goto L_0x01bb;
            }
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            goto L_0x0064
        L_0x01c4:
            r0 = 1
            goto L_0x01bc
        L_0x01c6:
            r0 = 2
            goto L_0x01bc
        L_0x01c8:
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01b6
            X.0sG r0 = r10.A03
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            boolean r0 = r0.A0Z(r6)
            r1 = 1
            if (r0 == 0) goto L_0x01b0
            r1 = 0
            goto L_0x01b0
        L_0x01d9:
            X.0pd r0 = r10.A04
            boolean r0 = X.C40571uL.A00(r0, r6)
            if (r0 == 0) goto L_0x01f7
            android.content.Context r3 = r10.A02()
            r2 = 2131890948(0x7f121304, float:1.9416602E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "OBWhatsApp Surveys"
            java.lang.String r3 = X.C13680ns.A0d(r3, r0, r1, r8, r2)
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x01f2:
            android.net.Uri r7 = android.net.Uri.parse(r0)
            goto L_0x018c
        L_0x01f7:
            X.0zl r0 = r10.A08
            boolean r0 = X.C40561uK.A01(r0, r6)
            android.content.Context r1 = r10.A02()
            if (r0 == 0) goto L_0x020d
            r0 = 2131893048(0x7f121b38, float:1.9420862E38)
            java.lang.String r3 = X.C34811ku.A05(r1, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x01f2
        L_0x020d:
            switch(r5) {
                case 0: goto L_0x021b;
                case 1: goto L_0x021b;
                case 2: goto L_0x021b;
                case 3: goto L_0x021b;
                case 4: goto L_0x021b;
                case 5: goto L_0x0217;
                case 6: goto L_0x0217;
                case 7: goto L_0x0213;
                case 8: goto L_0x0213;
                case 9: goto L_0x0217;
                case 10: goto L_0x0217;
                case 11: goto L_0x0217;
                case 12: goto L_0x0217;
                case 13: goto L_0x0217;
                case 14: goto L_0x0217;
                default: goto L_0x0210;
            }
        L_0x0210:
            r3 = 0
            goto L_0x018c
        L_0x0213:
            r0 = 2131890944(0x7f121300, float:1.9416594E38)
            goto L_0x0223
        L_0x0217:
            r0 = 2131890946(0x7f121302, float:1.9416598E38)
            goto L_0x0223
        L_0x021b:
            r0 = 2131890945(0x7f121301, float:1.9416596E38)
            if (r2 == 0) goto L_0x0223
            r0 = 2131889504(0x7f120d60, float:1.9413673E38)
        L_0x0223:
            java.lang.String r3 = r1.getString(r0)
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C75073rZ r1 = this.A0A;
        if (r1 != null) {
            r1.A01 = 0;
            this.A09.A06(r1);
        }
        super.onCancel(dialogInterface);
    }
}
