package com.obwhatsapp.calling;

import X.AnonymousClass00T;
import X.AnonymousClass15A;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C17220uj;
import X.C19270y9;
import X.C49132Rg;
import X.C79213zO;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class VoipNotAllowedActivity extends C14530pL {
    public C16000sG A00;
    public C16080sP A01;
    public C17220uj A02;
    public AnonymousClass15A A03;
    public boolean A04;
    public final C19270y9 A05;

    public VoipNotAllowedActivity() {
        this(0);
        this.A05 = new C79213zO(this);
    }

    public VoipNotAllowedActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 28);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = (AnonymousClass15A) r1.A3J.get();
            this.A00 = C16150sX.A0M(r1);
            this.A01 = C16150sX.A0Q(r1);
            this.A02 = C16150sX.A18(r1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = (LinearLayout) AnonymousClass00T.A05(this, R.id.content);
        int i2 = 1;
        if (configuration.orientation != 1) {
            i2 = 0;
        }
        linearLayout.setOrientation(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007c, code lost:
        r0 = r10.A0J(new java.lang.Object[]{r2}, r8, (long) r6.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        r9.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        r5 = X.C13700nu.A09(r11, com.obwhatsapp.R.id.ok);
        r2 = X.AnonymousClass00T.A05(r11, com.obwhatsapp.R.id.more);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009a, code lost:
        if (r7 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009c, code lost:
        r2.setVisibility(8);
        r0 = com.obwhatsapp.R.string.str0e87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a4, code lost:
        r5.setText(r0);
        X.C13680ns.A18(r5, r11, 37);
        r1 = (android.widget.LinearLayout) X.AnonymousClass00T.A05(r11, com.obwhatsapp.R.id.content);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bb, code lost:
        if (X.C13700nu.A03(r11).orientation != 1) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bd, code lost:
        r1.setOrientation(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c0, code lost:
        r11.A03.A02(r11.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        r1.setOrientation(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cc, code lost:
        r2.setVisibility(0);
        r2.setOnClickListener(new com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1(2, r7, r11));
        r0 = com.obwhatsapp.R.string.str0e88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0144, code lost:
        r7 = r11.A02.A04("28030008").toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0157, code lost:
        r0 = X.C13680ns.A0d(r11, r2, new java.lang.Object[1], 0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r0 = 2131559929(0x7f0d05f9, float:1.8745216E38)
            r11.setContentView((int) r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.widget.TextView r8 = X.C13700nu.A09(r11, r0)
            X.AnonymousClass1UP.A06(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            android.content.Intent r0 = r11.getIntent()
            java.util.List r6 = X.C16030sJ.A07(r0, r1)
            boolean r0 = r6.isEmpty()
            r4 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Missing jids"
            X.AnonymousClass00B.A0B(r0, r1)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "reason"
            r3 = 0
            int r5 = r1.getIntExtra(r0, r3)
            java.util.ArrayList r7 = X.AnonymousClass000.A0w(r6)
            if (r5 == 0) goto L_0x015f
            r0 = 12
            if (r5 == r0) goto L_0x015f
            r0 = 14
            if (r5 == r0) goto L_0x015f
            int r0 = r6.size()
            boolean r1 = X.AnonymousClass000.A1R(r0, r4)
            java.lang.String r0 = "Incorrect number of arguments"
            X.AnonymousClass00B.A0B(r0, r1)
            X.0sG r1 = r11.A00
            java.lang.Object r0 = r6.get(r3)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r1 = r1.A0A(r0)
            X.0sP r0 = r11.A01
            java.lang.String r2 = r0.A0C(r1)
        L_0x006a:
            r0 = 2131364694(0x7f0a0b56, float:1.8349232E38)
            android.widget.TextView r9 = X.C13700nu.A09(r11, r0)
            java.lang.String r10 = "28030008"
            r7 = 0
            switch(r5) {
                case 1: goto L_0x0154;
                case 2: goto L_0x0150;
                case 3: goto L_0x013e;
                case 4: goto L_0x0131;
                case 5: goto L_0x011f;
                case 6: goto L_0x0115;
                case 7: goto L_0x010d;
                case 8: goto L_0x0109;
                case 9: goto L_0x0105;
                case 10: goto L_0x0101;
                case 11: goto L_0x0101;
                case 12: goto L_0x00fa;
                case 13: goto L_0x00f6;
                case 14: goto L_0x00e4;
                case 15: goto L_0x00e0;
                case 16: goto L_0x00dc;
                default: goto L_0x0077;
            }
        L_0x0077:
            X.013 r10 = r11.A01
            r8 = 2131755411(0x7f100193, float:1.91417E38)
        L_0x007c:
            int r0 = r6.size()
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            java.lang.String r0 = r10.A0J(r5, r8, r0)
        L_0x0089:
            r9.setText(r0)
        L_0x008c:
            r0 = 2131364897(0x7f0a0c21, float:1.8349644E38)
            android.widget.TextView r5 = X.C13700nu.A09(r11, r0)
            r0 = 2131364734(0x7f0a0b7e, float:1.8349313E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r11, r0)
            if (r7 != 0) goto L_0x00cc
            r0 = 8
            r2.setVisibility(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
        L_0x00a4:
            r5.setText(r0)
            r0 = 37
            X.C13680ns.A18(r5, r11, r0)
            r0 = 2131362933(0x7f0a0475, float:1.834566E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r11, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.content.res.Configuration r0 = X.C13700nu.A03(r11)
            int r0 = r0.orientation
            if (r0 != r4) goto L_0x00c8
            r1.setOrientation(r4)
        L_0x00c0:
            X.15A r1 = r11.A03
            X.0y9 r0 = r11.A05
            r1.A02(r0)
            return
        L_0x00c8:
            r1.setOrientation(r3)
            goto L_0x00c0
        L_0x00cc:
            r2.setVisibility(r3)
            r1 = 2
            com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1
            r0.<init>(r1, r7, r11)
            r2.setOnClickListener(r0)
            r0 = 2131889800(0x7f120e88, float:1.9414274E38)
            goto L_0x00a4
        L_0x00dc:
            r1 = 2131892996(0x7f121b04, float:1.9420756E38)
            goto L_0x0157
        L_0x00e0:
            r1 = 2131892319(0x7f12185f, float:1.9419383E38)
            goto L_0x0157
        L_0x00e4:
            r8 = 64
            X.013 r6 = r11.A01
            r5 = 2131755406(0x7f10018e, float:1.914169E38)
            long r1 = (long) r8
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.AnonymousClass000.A1M(r0, r8, r3)
            java.lang.String r0 = r6.A0J(r0, r5, r1)
            goto L_0x0089
        L_0x00f6:
            r1 = 2131892890(0x7f121a9a, float:1.9420541E38)
            goto L_0x0157
        L_0x00fa:
            X.013 r10 = r11.A01
            r8 = 2131755405(0x7f10018d, float:1.9141688E38)
            goto L_0x007c
        L_0x0101:
            r1 = 2131893015(0x7f121b17, float:1.9420795E38)
            goto L_0x0157
        L_0x0105:
            r1 = 2131893014(0x7f121b16, float:1.9420793E38)
            goto L_0x0157
        L_0x0109:
            r1 = 2131893016(0x7f121b18, float:1.9420797E38)
            goto L_0x0157
        L_0x010d:
            r0 = 2131893017(0x7f121b19, float:1.9420799E38)
            r9.setText(r0)
            goto L_0x008c
        L_0x0115:
            r0 = 2131892982(0x7f121af6, float:1.9420728E38)
            r8.setText(r0)
            r1 = 2131892981(0x7f121af5, float:1.9420726E38)
            goto L_0x0157
        L_0x011f:
            r0 = 2131892982(0x7f121af6, float:1.9420728E38)
            r8.setText(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.getStringExtra(r0)
            goto L_0x0089
        L_0x0131:
            r1 = 2131892974(0x7f121aee, float:1.9420711E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C13680ns.A0d(r11, r2, r0, r3, r1)
            r9.setText(r0)
            goto L_0x0144
        L_0x013e:
            r0 = 2131892975(0x7f121aef, float:1.9420713E38)
            r9.setText(r0)
        L_0x0144:
            X.0uj r0 = r11.A02
            android.net.Uri r0 = r0.A04(r10)
            java.lang.String r7 = r0.toString()
            goto L_0x008c
        L_0x0150:
            r1 = 2131892977(0x7f121af1, float:1.9420718E38)
            goto L_0x0157
        L_0x0154:
            r1 = 2131892976(0x7f121af0, float:1.9420715E38)
        L_0x0157:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C13680ns.A0d(r11, r2, r0, r3, r1)
            goto L_0x0089
        L_0x015f:
            java.util.Iterator r2 = r6.iterator()
        L_0x0163:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017d
            X.0rv r1 = X.C13700nu.A0B(r2)
            X.0sG r0 = r11.A00
            X.0sH r1 = r0.A0A(r1)
            X.0sP r0 = r11.A01
            java.lang.String r0 = r0.A0C(r1)
            r7.add(r0)
            goto L_0x0163
        L_0x017d:
            X.0sP r0 = r11.A01
            X.013 r0 = r0.A07
            java.lang.String r2 = X.C40631uR.A00(r0, r7, r4)
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.VoipNotAllowedActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A03(this.A05);
    }
}
