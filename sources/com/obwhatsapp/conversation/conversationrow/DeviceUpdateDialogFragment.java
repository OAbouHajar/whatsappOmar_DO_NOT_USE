package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass00B;
import X.AnonymousClass124;
import X.AnonymousClass1L0;
import X.AnonymousClass1WU;
import X.C13690nt;
import X.C15830rv;
import X.C16320sq;
import X.C39331sJ;
import X.C40251to;
import android.os.Bundle;

public class DeviceUpdateDialogFragment extends Hilt_DeviceUpdateDialogFragment {
    public AnonymousClass1L0 A00;
    public AnonymousClass124 A01;
    public C16320sq A02;

    public static SecurityNotificationDialogFragment A01(AnonymousClass1WU r5) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = new DeviceUpdateDialogFragment();
        Bundle A0D = C13690nt.A0D();
        C15830rv r4 = r5.A11.A00;
        AnonymousClass00B.A06(r4);
        A0D.putString("chat_jid", r4.getRawString());
        AnonymousClass00B.A06(r4);
        C15830rv A0B = r5.A0B();
        if (A0B != null) {
            r4 = A0B;
        }
        A0D.putString("participant_jid", r4.getRawString());
        if (r5 instanceof C39331sJ) {
            C39331sJ r52 = (C39331sJ) r5;
            A0D.putInt("device_added_count", r52.A00);
            A0D.putInt("device_removed_count", r52.A01);
        } else {
            AnonymousClass00B.A0F(r5 instanceof C40251to);
            A0D.putBoolean("device_update_failure", true);
        }
        deviceUpdateDialogFragment.A0T(A0D);
        return deviceUpdateDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (r5 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        if (r9 != 0) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r12) {
        /*
            r11 = this;
            android.os.Bundle r2 = r11.A04()
            java.lang.String r0 = "chat_jid"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "participant_jid"
            java.lang.String r6 = r2.getString(r0)
            java.lang.String r0 = "device_added_count"
            int r9 = r2.getInt(r0)
            java.lang.String r0 = "device_removed_count"
            int r10 = r2.getInt(r0)
            java.lang.String r0 = "device_update_failure"
            boolean r5 = r2.getBoolean(r0)
            if (r9 > 0) goto L_0x0029
            if (r10 > 0) goto L_0x0029
            r0 = 0
            if (r5 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            X.AnonymousClass00B.A0F(r0)
            X.0rv r4 = X.C15830rv.A02(r1)
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid chat jid="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.AnonymousClass00B.A07(r4, r0)
            X.0rv r3 = X.C15830rv.A02(r6)
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid remote resource jid="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r0)
            X.AnonymousClass00B.A07(r3, r0)
            X.0sG r0 = r11.A02
            X.0sH r2 = r0.A0A(r4)
            X.0sG r0 = r11.A02
            X.0sH r8 = r0.A0A(r3)
            X.0sK r1 = r11.A01
            X.0rv r0 = r8.A07()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0155
            boolean r0 = r2.A0J()
            if (r0 != 0) goto L_0x0083
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = r2.A08(r0)
        L_0x007b:
            if (r7 == 0) goto L_0x0083
            X.0sq r1 = r11.A02
            r0 = 6
            X.AnonymousClass3K4.A0u(r1, r11, r7, r0)
        L_0x0083:
            android.content.Context r0 = r11.A0u()
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r0)
            if (r5 == 0) goto L_0x00d6
            r0 = 2131892394(0x7f1218aa, float:1.9419535E38)
        L_0x0091:
            java.lang.CharSequence r0 = r11.A1N(r8, r0)
        L_0x0095:
            android.app.AlertDialog$Builder r7 = r7.setMessage(r0)
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
            r0 = 0
            android.app.AlertDialog$Builder r8 = r7.setNegativeButton(r1, r0)
            r7 = 2131893494(0x7f121cf6, float:1.9421766E38)
            r1 = 3
            com.facebook.redex.IDxCListenerShape1S0110000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape1S0110000_2_I1
            r0.<init>(r11, r1, r5)
            android.app.AlertDialog$Builder r5 = r8.setNeutralButton(r7, r0)
            X.0sK r0 = r11.A01
            boolean r0 = r0.A0I(r3)
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r2.A0J()
            if (r0 != 0) goto L_0x00c4
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x00c9
        L_0x00c4:
            android.app.AlertDialog r0 = r5.create()
            return r0
        L_0x00c9:
            r1 = 2131892616(0x7f121988, float:1.9419985E38)
            X.4fl r0 = new X.4fl
            r0.<init>(r11, r3, r4, r6)
            android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r1, r0)
            goto L_0x00c4
        L_0x00d6:
            X.0sK r1 = r11.A01
            X.0rv r0 = r8.A07()
            boolean r1 = r1.A0I(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0140
            if (r9 != r0) goto L_0x0104
            if (r10 != 0) goto L_0x0104
            boolean r0 = r2.A0J()
            if (r0 == 0) goto L_0x00f5
            r0 = 2131891420(0x7f1214dc, float:1.941756E38)
        L_0x00f0:
            java.lang.String r0 = r11.A0J(r0)
            goto L_0x0095
        L_0x00f5:
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            r1 = 2131891419(0x7f1214db, float:1.9417558E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131891421(0x7f1214dd, float:1.9417562E38)
            goto L_0x00f0
        L_0x0104:
            if (r10 != r0) goto L_0x0121
            if (r9 != 0) goto L_0x0121
            boolean r0 = r2.A0J()
            if (r0 == 0) goto L_0x0112
            r0 = 2131891423(0x7f1214df, float:1.9417566E38)
            goto L_0x00f0
        L_0x0112:
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            r1 = 2131891422(0x7f1214de, float:1.9417564E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131891424(0x7f1214e0, float:1.9417568E38)
            goto L_0x00f0
        L_0x0121:
            boolean r0 = r2.A0J()
            if (r0 == 0) goto L_0x012b
            r0 = 2131891426(0x7f1214e2, float:1.9417572E38)
            goto L_0x00f0
        L_0x012b:
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            r1 = 2131891425(0x7f1214e1, float:1.941757E38)
            if (r0 == 0) goto L_0x013a
            r0 = 2131891427(0x7f1214e3, float:1.9417574E38)
            goto L_0x00f0
        L_0x013a:
            java.lang.CharSequence r0 = r11.A1N(r2, r1)
            goto L_0x0095
        L_0x0140:
            if (r9 != r0) goto L_0x0149
            if (r10 != 0) goto L_0x0149
            r0 = 2131889886(0x7f120ede, float:1.9414448E38)
            goto L_0x0091
        L_0x0149:
            if (r10 != r0) goto L_0x0150
            r0 = 2131889887(0x7f120edf, float:1.941445E38)
            if (r9 == 0) goto L_0x0091
        L_0x0150:
            r0 = 2131889888(0x7f120ee0, float:1.9414452E38)
            goto L_0x0091
        L_0x0155:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = r8.A08(r0)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }
}
