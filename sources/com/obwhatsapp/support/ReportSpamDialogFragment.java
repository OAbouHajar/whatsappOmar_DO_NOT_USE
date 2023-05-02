package com.obwhatsapp.support;

import X.AnonymousClass01A;
import X.AnonymousClass10R;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16070sO;
import X.C16080sP;
import X.C16300so;
import X.C16320sq;
import X.C16490t9;
import X.C16740tZ;
import X.C16980tz;
import X.C17230uk;
import X.C25931Lr;
import X.C34681kh;
import X.C41701wR;
import X.C74483qc;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class ReportSpamDialogFragment extends Hilt_ReportSpamDialogFragment {
    public C16300so A00;
    public C14870pt A01;
    public C15900s5 A02;
    public C17230uk A03;
    public C16000sG A04;
    public C16080sP A05;
    public C25931Lr A06;
    public C16980tz A07;
    public AnonymousClass10R A08;
    public C15810rt A09;
    public C16070sO A0A;
    public C16490t9 A0B;
    public C16740tZ A0C;
    public C41701wR A0D;
    public C16320sq A0E;
    public boolean A0F = false;

    public static ReportSpamDialogFragment A01(C15830rv r3, UserJid userJid, C41701wR r5, String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r3.getRawString());
        if (userJid != null) {
            bundle.putString("userJid", userJid.getRawString());
        }
        if (str != null) {
            bundle.putString("flow", str);
        }
        bundle.putBoolean("hasLoggedInPairedDevices", z2);
        bundle.putInt("upsellAction", i2);
        bundle.putBoolean("upsellCheckboxActionDefault", z3);
        bundle.putBoolean("shouldDeleteChatOnBlock", z4);
        bundle.putBoolean("shouldOpenHomeScreenAction", z5);
        bundle.putBoolean("shouldDisplayUpsellCheckbox", z6);
        bundle.putBoolean("notifyObservableDialogHost", z7);
        reportSpamDialogFragment.A0D = r5;
        reportSpamDialogFragment.A0T(bundle);
        return reportSpamDialogFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r26) {
        /*
            r25 = this;
            r13 = r25
            X.00l r5 = r13.A0C()
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
            X.0rv r6 = X.C15830rv.A02(r0)
            X.AnonymousClass00B.A06(r6)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "userJid"
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.getNullable(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "flow"
            java.lang.String r14 = r1.getString(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "hasLoggedInPairedDevices"
            boolean r8 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "upsellCheckboxActionDefault"
            boolean r2 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "shouldDeleteChatOnBlock"
            boolean r16 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "shouldOpenHomeScreenAction"
            boolean r17 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "upsellAction"
            int r15 = r1.getInt(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "shouldDisplayUpsellCheckbox"
            boolean r7 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.A04()
            java.lang.String r0 = "notifyObservableDialogHost"
            boolean r0 = r1.getBoolean(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0089
            X.01A r1 = r13.A0D
            boolean r0 = r1 instanceof X.C34681kh
            if (r0 == 0) goto L_0x0089
            X.1kh r1 = (X.C34681kh) r1
            r1.APj(r13, r3)
        L_0x0089:
            X.0sG r0 = r13.A04
            X.0sH r11 = r0.A0A(r6)
            r3 = 0
            if (r4 == 0) goto L_0x022f
            X.0sG r0 = r13.A04
            X.0sH r12 = r0.A0A(r4)
        L_0x0098:
            android.content.Context r0 = r13.A0u()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131558957(0x7f0d022d, float:1.8743244E38)
            android.view.View r0 = r1.inflate(r0, r3)
            r1 = 2131362260(0x7f0a01d4, float:1.8344296E38)
            android.view.View r10 = r0.findViewById(r1)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r10.setChecked(r2)
            X.0rv r1 = r11.A0E
            boolean r1 = r1 instanceof X.C16050sL
            if (r1 == 0) goto L_0x00d1
            X.0sq r2 = r13.A0E
            r24 = 2
            com.facebook.redex.RunnableRunnableShape0S1400000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1400000_I0
            r18 = r1
            r19 = r13
            r20 = r11
            r21 = r0
            r22 = r10
            r23 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2.Acl(r1)
        L_0x00d1:
            r4 = 0
            if (r7 != 0) goto L_0x00e3
            r1 = 2131362267(0x7f0a01db, float:1.834431E38)
            android.view.View r2 = X.C004601z.A0E(r0, r1)
            r1 = 8
            r2.setVisibility(r1)
            r10.setChecked(r4)
        L_0x00e3:
            X.3CA r9 = new X.3CA
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 2131362261(0x7f0a01d5, float:1.8344298E38)
            android.view.View r3 = r0.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = 2131365753(0x7f0a0f79, float:1.835138E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.AnonymousClass00B.A06(r5)
            X.1fu r1 = new X.1fu
            r1.<init>(r5)
            r1.setView(r0)
            X.0tZ r0 = r13.A0C
            if (r0 == 0) goto L_0x0213
            if (r12 == 0) goto L_0x0213
            r5 = 2131891252(0x7f121434, float:1.9417219E38)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            X.0sP r0 = r13.A05
            java.lang.String r0 = r0.A0C(r12)
        L_0x0117:
            r6[r4] = r0
            java.lang.String r0 = r13.A0K(r5, r6)
            r1.setTitle(r0)
        L_0x0120:
            java.lang.String r0 = "status_post_report"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x017b
            boolean r0 = r12.A0H()
            r4 = 2131891248(0x7f121430, float:1.941721E38)
            if (r0 == 0) goto L_0x0135
            r4 = 2131891249(0x7f121431, float:1.9417213E38)
        L_0x0135:
            r2.setText(r4)
            boolean r0 = r11.A0J()
            if (r0 == 0) goto L_0x0176
            if (r15 != 0) goto L_0x0172
            if (r12 == 0) goto L_0x0172
            boolean r0 = r12.A0H()
        L_0x0146:
            if (r0 == 0) goto L_0x0169
            r0 = 2131891214(0x7f12140e, float:1.9417142E38)
            if (r16 == 0) goto L_0x0150
            r0 = 2131891213(0x7f12140d, float:1.941714E38)
        L_0x0150:
            r3.setText(r0)
            r0 = 2131891232(0x7f121420, float:1.9417178E38)
            r1.setPositiveButton(r0, r9)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r0 = 0
            r1.setNegativeButton(r2, r0)
            X.02l r1 = r1.create()
            r0 = 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L_0x0169:
            r0 = 2131891212(0x7f12140c, float:1.9417138E38)
            if (r16 == 0) goto L_0x0150
            r0 = 2131893623(0x7f121d77, float:1.9422028E38)
            goto L_0x0150
        L_0x0172:
            r0 = 2131891224(0x7f121418, float:1.9417162E38)
            goto L_0x0150
        L_0x0176:
            boolean r0 = r11.A0H()
            goto L_0x0146
        L_0x017b:
            X.0tZ r0 = r13.A0C
            if (r0 == 0) goto L_0x01bc
            if (r12 == 0) goto L_0x01bc
            boolean r5 = r12.A0H()
            X.1Lr r0 = r13.A06
            X.0tZ r4 = r13.A0C
            X.0zl r0 = r0.A07
            boolean r0 = X.C38621r6.A0c(r0, r4)
            if (r0 == 0) goto L_0x01b2
            byte r0 = r4.A10
            boolean r0 = X.C30921dB.A00(r0)
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "media_viewer"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x01a9
            X.1rl r4 = (X.C39001rl) r4
            int r0 = r4.AGz()
            if (r0 != 0) goto L_0x01b2
        L_0x01a9:
            r4 = 2131891246(0x7f12142e, float:1.9417207E38)
            if (r5 == 0) goto L_0x0135
            r4 = 2131891247(0x7f12142f, float:1.9417209E38)
            goto L_0x0135
        L_0x01b2:
            r4 = 2131891251(0x7f121433, float:1.9417217E38)
            if (r5 == 0) goto L_0x0135
            r4 = 2131891250(0x7f121432, float:1.9417215E38)
            goto L_0x0135
        L_0x01bc:
            boolean r0 = r11.A0J()
            if (r0 == 0) goto L_0x01db
            if (r8 == 0) goto L_0x01d6
            X.0s5 r4 = r13.A02
            X.0s8 r0 = X.C15910s6.A0X
            boolean r0 = r4.A05(r0)
            r4 = 2131891243(0x7f12142b, float:1.94172E38)
            if (r0 == 0) goto L_0x0135
            r4 = 2131891244(0x7f12142c, float:1.9417203E38)
            goto L_0x0135
        L_0x01d6:
            r4 = 2131891245(0x7f12142d, float:1.9417205E38)
            goto L_0x0135
        L_0x01db:
            boolean r0 = r11.A0H()
            if (r0 == 0) goto L_0x01fa
            if (r8 == 0) goto L_0x01f5
            X.0s5 r4 = r13.A02
            X.0s8 r0 = X.C15910s6.A0X
            boolean r0 = r4.A05(r0)
            r4 = 2131891238(0x7f121426, float:1.941719E38)
            if (r0 == 0) goto L_0x0135
            r4 = 2131891239(0x7f121427, float:1.9417192E38)
            goto L_0x0135
        L_0x01f5:
            r4 = 2131891240(0x7f121428, float:1.9417194E38)
            goto L_0x0135
        L_0x01fa:
            if (r8 == 0) goto L_0x020e
            X.0s5 r4 = r13.A02
            X.0s8 r0 = X.C15910s6.A0X
            boolean r0 = r4.A05(r0)
            r4 = 2131891235(0x7f121423, float:1.9417184E38)
            if (r0 == 0) goto L_0x0135
            r4 = 2131891236(0x7f121424, float:1.9417186E38)
            goto L_0x0135
        L_0x020e:
            r4 = 2131891237(0x7f121425, float:1.9417188E38)
            goto L_0x0135
        L_0x0213:
            boolean r0 = r11.A0J()
            if (r0 == 0) goto L_0x0221
            r0 = 2131891226(0x7f12141a, float:1.9417166E38)
            r1.A02(r0)
            goto L_0x0120
        L_0x0221:
            r5 = 2131891252(0x7f121434, float:1.9417219E38)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            X.0sP r0 = r13.A05
            java.lang.String r0 = r0.A0C(r11)
            goto L_0x0117
        L_0x022f:
            r12 = r3
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.support.ReportSpamDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        String string = A04().getString("flow");
        if (A04().getBoolean("notifyObservableDialogHost")) {
            AnonymousClass01A r1 = this.A0D;
            if (r1 instanceof C34681kh) {
                ((C34681kh) r1).APj(this, false);
            }
        }
        if (string.equals("status_post_report") && !this.A0F) {
            C74483qc r12 = new C74483qc();
            r12.A00 = 2;
            this.A0B.A06(r12);
        }
    }
}
