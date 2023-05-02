package com.obwhatsapp.companiondevice;

import X.AnonymousClass01V;
import X.AnonymousClass1RS;
import X.AnonymousClass1WE;
import X.AnonymousClass1WN;
import X.AnonymousClass4ML;
import X.C13680ns;
import X.C14870pt;
import X.C16440t3;
import X.C17220uj;
import X.C19410yO;
import X.C19980zJ;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class LinkedDevicesDetailDialogFragment extends Hilt_LinkedDevicesDetailDialogFragment implements AnonymousClass1WE {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public C19980zJ A02;
    public C14870pt A03;
    public LinkedDevicesSharedViewModel A04;
    public AnonymousClass01V A05;
    public C16440t3 A06;
    public AnonymousClass1WN A07;
    public C19410yO A08;
    public AnonymousClass1RS A09;
    public AnonymousClass4ML A0A;
    public C17220uj A0B;
    public Boolean A0C;

    public Dialog A1B(Bundle bundle) {
        this.A01 = C13680ns.A0H(LayoutInflater.from(A0u()), (ViewGroup) null, R.layout.layout0385);
        this.A0C = null;
        this.A09.A05(this, this.A03.A06);
        A1M();
        C32241fu A002 = C32241fu.A00(A0C());
        A002.setView(this.A01);
        return A002.create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r12 <= 3600000) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010b, code lost:
        if (r1 == false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r25 = this;
            r3 = r25
            X.1WN r1 = r3.A07
            if (r1 == 0) goto L_0x01a4
            X.0yO r0 = r3.A08
            com.whatsapp.jid.DeviceJid r1 = r1.A06
            java.util.Set r0 = r0.A0P
            boolean r21 = r0.contains(r1)
            X.1WN r1 = r3.A07
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x018f
            r0 = 2131889203(0x7f120c33, float:1.9413063E38)
            java.lang.String r11 = r3.A0J(r0)
        L_0x001f:
            X.1WN r1 = r3.A07
            X.00l r0 = r3.A0C()
            java.lang.String r10 = X.AnonymousClass1WN.A00(r0, r1)
            X.1WN r1 = r3.A07
            int r9 = X.AnonymousClass46P.A00(r1)
            java.lang.String r4 = r1.A02
            r0 = 11
            com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2 r2 = new com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2
            r2.<init>(r3, r0)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0186
            r5 = 0
        L_0x003f:
            X.1WN r6 = r3.A07
            X.0t3 r0 = r3.A06
            long r12 = r0.A00()
            long r0 = r6.A01
            long r12 = r12 - r0
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0059
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            r20 = 1
            if (r0 > 0) goto L_0x005b
        L_0x0059:
            r20 = 0
        L_0x005b:
            android.view.View r1 = r3.A01
            X.AnonymousClass00B.A04(r1)
            r0 = 2131363178(0x7f0a056a, float:1.8346157E38)
            android.widget.ImageView r8 = X.C13680ns.A0J(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131363179(0x7f0a056b, float:1.834616E38)
            android.widget.TextView r6 = X.C13680ns.A0L(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131366346(0x7f0a11ca, float:1.8352583E38)
            android.view.View r15 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131366356(0x7f0a11d4, float:1.8352603E38)
            android.view.View r19 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131366383(0x7f0a11ef, float:1.8352658E38)
            android.widget.TextView r18 = X.C13680ns.A0L(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131364398(0x7f0a0a2e, float:1.8348632E38)
            android.view.View r14 = X.C004601z.A0E(r1, r0)
            android.view.View r1 = r3.A01
            r0 = 2131364401(0x7f0a0a31, float:1.8348638E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.view.View r7 = r3.A01
            r0 = 2131364411(0x7f0a0a3b, float:1.8348658E38)
            android.widget.TextView r13 = X.C13680ns.A0L(r7, r0)
            android.view.View r7 = r3.A01
            r0 = 2131366540(0x7f0a128c, float:1.8352976E38)
            android.view.View r12 = X.C004601z.A0E(r7, r0)
            android.view.View r7 = r3.A01
            r0 = 2131364423(0x7f0a0a47, float:1.8348683E38)
            android.widget.TextView r17 = X.C13680ns.A0L(r7, r0)
            android.view.View r7 = r3.A01
            r0 = 2131362769(0x7f0a03d1, float:1.8345328E38)
            android.view.View r16 = X.C004601z.A0E(r7, r0)
            android.view.View r7 = r3.A01
            r0 = 2131364416(0x7f0a0a40, float:1.8348668E38)
            com.obwhatsapp.TextEmojiLabel r7 = X.C13680ns.A0Q(r7, r0)
            r6.setText(r10)
            r8.setImageResource(r9)
            java.lang.Boolean r0 = r3.A0C
            r8 = 8
            r6 = 0
            if (r0 == 0) goto L_0x016f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016f
            r15.setVisibility(r8)
        L_0x00e0:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x016b
            r14.setVisibility(r6)
            r9 = 2131889202(0x7f120c32, float:1.941306E38)
            java.lang.Object[] r0 = X.C13680ns.A1b()
            java.lang.String r0 = X.C13690nt.A0c(r3, r4, r0, r6, r9)
            r13.setText(r0)
            r0 = 2131232108(0x7f08056c, float:1.8080316E38)
            if (r21 == 0) goto L_0x00ff
            r0 = 2131232107(0x7f08056b, float:1.8080314E38)
        L_0x00ff:
            r1.setBackgroundResource(r0)
        L_0x0102:
            java.lang.Boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x010d
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 != 0) goto L_0x010f
        L_0x010d:
            r0 = 8
        L_0x010f:
            r12.setVisibility(r0)
            int r0 = X.C13690nt.A07(r20)
            r7.setVisibility(r0)
            if (r20 == 0) goto L_0x0152
            X.1WN r0 = r3.A07
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0152
            android.content.Context r11 = r3.A02()
            X.0pt r10 = r3.A03
            X.0zJ r9 = r3.A02
            X.01V r4 = r3.A05
            r12 = 2131889204(0x7f120c34, float:1.9413065E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.String r0 = "learn-more"
            java.lang.String r24 = X.C13680ns.A0d(r11, r0, r1, r6, r12)
            X.0uj r1 = r3.A0B
            java.lang.String r0 = "seeing-logout-is-pending"
            android.net.Uri r19 = r1.A04(r0)
            r23 = r4
            r18 = r11
            r20 = r9
            r21 = r10
            r22 = r7
            X.C45922Bq.A08(r18, r19, r20, r21, r22, r23, r24)
        L_0x0152:
            r0 = r17
            if (r5 == 0) goto L_0x0167
            r0.setVisibility(r6)
            r0.setText(r5)
            r0.setOnClickListener(r2)
        L_0x015f:
            r1 = 10
            r0 = r16
            X.C13680ns.A17(r0, r3, r1)
        L_0x0166:
            return
        L_0x0167:
            r0.setVisibility(r8)
            goto L_0x015f
        L_0x016b:
            r14.setVisibility(r8)
            goto L_0x0102
        L_0x016f:
            r15.setVisibility(r6)
            r0 = r18
            r0.setText(r11)
            r9 = 2131232108(0x7f08056c, float:1.8080316E38)
            if (r21 == 0) goto L_0x017f
            r9 = 2131232107(0x7f08056b, float:1.8080314E38)
        L_0x017f:
            r0 = r19
            r0.setBackgroundResource(r9)
            goto L_0x00e0
        L_0x0186:
            r0 = 2131889304(0x7f120c98, float:1.9413268E38)
            java.lang.String r5 = r3.A0J(r0)
            goto L_0x003f
        L_0x018f:
            X.013 r2 = r3.A02
            long r0 = r1.A00
            if (r21 == 0) goto L_0x019e
            r0 = 2131889193(0x7f120c29, float:1.9413043E38)
            java.lang.String r11 = r2.A09(r0)
            goto L_0x001f
        L_0x019e:
            java.lang.CharSequence r11 = X.C28961Zl.A00(r2, r0)
            goto L_0x001f
        L_0x01a4:
            X.4ML r0 = r3.A0A
            if (r0 == 0) goto L_0x0166
            android.content.Context r0 = r3.A0u()
            X.AnonymousClass00B.A06(r0)
            X.4ML r0 = r3.A0A
            int r0 = r0.A01
            java.lang.String r10 = r3.A0J(r0)
            X.4ML r0 = r3.A0A
            int r9 = r0.A00
            X.013 r8 = r3.A02
            long r6 = r0.A02
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01e4
            r0 = 2131889193(0x7f120c29, float:1.9413043E38)
            java.lang.String r11 = r8.A09(r0)
        L_0x01d1:
            r21 = 1
            r4 = 0
            r0 = 9
            com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2 r2 = new com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2
            r2.<init>(r3, r0)
            r0 = 2131892367(0x7f12188f, float:1.941948E38)
            java.lang.String r5 = r3.A0J(r0)
            goto L_0x0059
        L_0x01e4:
            java.lang.CharSequence r11 = X.C28961Zl.A00(r8, r6)
            goto L_0x01d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment.A1M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Map r3 = (java.util.Map) r3
            X.1WN r1 = r2.A07
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0027
            com.whatsapp.jid.DeviceJid r0 = r1.A06
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C = r0
            r2.A1M()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment.accept(java.lang.Object):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A09.A00.A02(this);
    }
}
