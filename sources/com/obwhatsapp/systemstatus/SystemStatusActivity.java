package com.obwhatsapp.systemstatus;

import X.AnonymousClass15W;
import X.AnonymousClass1KO;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemStatusActivity extends C14530pL {
    public int A00;
    public AnonymousClass1KO A01;
    public AnonymousClass15W A02;
    public String A03;
    public String A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final List A0A;

    public SystemStatusActivity() {
        this(0);
        this.A0A = Arrays.asList(new String[]{"broadcast", "registration", "sync", "status"});
    }

    public SystemStatusActivity(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 137);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = (AnonymousClass1KO) r1.ALY.get();
            this.A02 = (AnonymousClass15W) r1.AOC.get();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0080, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f6, code lost:
        r5 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fa, code lost:
        if (r5 == null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fc, code lost:
        r6.append("  • ");
        r6.append(r5);
        r6.append(10);
        r9 = r9 + 1;
        r2 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r12 = r21
            r0 = r22
            super.onCreate(r0)
            r2 = 2131892094(0x7f12177e, float:1.9418927E38)
            r12.setTitle(r2)
            X.02i r0 = r12.x()
            r10 = 1
            r0.A0N(r10)
            X.02i r0 = r12.x()
            r0.A0O(r10)
            r0 = 2131559847(0x7f0d05a7, float:1.874505E38)
            r12.setContentView((int) r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.from"
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A03 = r0
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.type"
            r4 = 0
            int r0 = r1.getIntExtra(r0, r4)
            r12.A00 = r0
            X.02i r0 = r12.x()
            r0.A0B(r2)
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.email"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A07 = r0
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.version"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A09 = r0
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.statusonly"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r12.A06 = r0
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.serverfeaturesunavailable"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            r12.A05 = r0
            java.lang.String r5 = "registration"
            boolean r2 = r0.remove(r5)
            boolean r0 = r12.A09
            r1 = 0
            if (r0 != 0) goto L_0x010e
            r0 = 2131891106(0x7f1213a2, float:1.9416923E38)
            java.lang.String r2 = r12.getString(r0)
            boolean r0 = r12.A07
            r1 = 2131892095(0x7f12177f, float:1.9418929E38)
            if (r0 == 0) goto L_0x007a
            r1 = 2131892096(0x7f121780, float:1.941893E38)
        L_0x007a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = X.C13680ns.A0d(r12, r2, r0, r4, r1)
        L_0x0080:
            if (r1 != 0) goto L_0x008d
        L_0x0082:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00de
            r0 = 2131891605(0x7f121595, float:1.9417935E38)
            java.lang.String r1 = r12.getString(r0)
        L_0x008d:
            r0 = 2131366545(0x7f0a1291, float:1.8352987E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r12, r0)
            r0.setText(r1)
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x0365
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0365
            java.lang.String r0 = r12.A04
            if (r0 != 0) goto L_0x00c5
            java.lang.String r2 = "+"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r2)
            java.util.ArrayList r0 = r12.A05
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            r12.A04 = r1
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x00c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r1)
            java.lang.String r0 = "+version"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r12.A04 = r0
        L_0x00c5:
            r0 = 2131366547(0x7f0a1293, float:1.835299E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 41
            X.C13680ns.A19(r1, r12, r0)
            r0 = 2131366546(0x7f0a1292, float:1.8352989E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 42
            X.C13680ns.A19(r1, r12, r0)
            return
        L_0x00de:
            X.1KO r11 = r12.A01
            X.15W r0 = r12.A02
            boolean r20 = r0.A00()
            java.lang.String r4 = r12.A03
            java.lang.String r3 = r12.A04
            int r0 = r12.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r14 = 0
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r13 = r2.getBundleExtra(r0)
            r19 = r14
            r16 = r4
            r17 = r3
            r18 = r14
            android.content.Intent r0 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12.startActivity(r0)
            r12.finish()
            goto L_0x008d
        L_0x010e:
            int r0 = r12.A00
            java.lang.String r3 = " "
            if (r0 == r10) goto L_0x013c
            if (r2 == 0) goto L_0x0082
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0361
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()
            r0 = 2131892087(0x7f121777, float:1.9418912E38)
            X.C13690nt.A0t(r12, r3, r4, r0)
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r5)
        L_0x012a:
            r0 = 2131892061(0x7f12175d, float:1.941886E38)
            if (r1 == 0) goto L_0x0132
            r0 = 2131892063(0x7f12175f, float:1.9418864E38)
        L_0x0132:
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r4)
            goto L_0x0080
        L_0x013c:
            java.util.ArrayList r2 = r12.A05
            java.lang.String r0 = "chat"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0156
            boolean r1 = r12.A07
            r0 = 2131892059(0x7f12175b, float:1.9418856E38)
            if (r1 == 0) goto L_0x0150
            r0 = 2131892060(0x7f12175c, float:1.9418858E38)
        L_0x0150:
            java.lang.String r1 = r12.getString(r0)
            goto L_0x0080
        L_0x0156:
            java.util.ArrayList r2 = r12.A05
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0082
            r2.size()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()
            java.util.Iterator r11 = r2.iterator()
            r2 = r1
            r9 = 0
        L_0x016b:
            boolean r0 = r11.hasNext()
            r8 = 10
            if (r0 == 0) goto L_0x020c
            java.lang.String r7 = X.AnonymousClass000.A0m(r11)
            int r0 = r7.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x0189;
                case -1012222381: goto L_0x0195;
                case -892481550: goto L_0x01a1;
                case -309425751: goto L_0x01ae;
                case 3314326: goto L_0x01ba;
                case 3452698: goto L_0x01c6;
                case 3545755: goto L_0x01d2;
                case 98629247: goto L_0x01df;
                case 1262089803: goto L_0x01eb;
                default: goto L_0x017e;
            }
        L_0x017e:
            java.lang.String r0 = "sysstatus/create/m-down/string-not-found "
            java.lang.String r0 = X.C13680ns.A0h(r0, r7)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x016b
        L_0x0189:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892058(0x7f12175a, float:1.9418854E38)
            goto L_0x01f6
        L_0x0195:
            java.lang.String r0 = "online"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892080(0x7f121770, float:1.9418898E38)
            goto L_0x01f6
        L_0x01a1:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892090(0x7f12177a, float:1.9418918E38)
            goto L_0x01f6
        L_0x01ae:
            java.lang.String r0 = "profile"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892083(0x7f121773, float:1.9418904E38)
            goto L_0x01f6
        L_0x01ba:
            java.lang.String r0 = "last"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892070(0x7f121766, float:1.9418878E38)
            goto L_0x01f6
        L_0x01c6:
            java.lang.String r0 = "push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892086(0x7f121776, float:1.941891E38)
            goto L_0x01f6
        L_0x01d2:
            java.lang.String r0 = "sync"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892093(0x7f12177d, float:1.9418925E38)
            goto L_0x01f6
        L_0x01df:
            java.lang.String r0 = "group"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892067(0x7f121763, float:1.9418872E38)
            goto L_0x01f6
        L_0x01eb:
            java.lang.String r0 = "multimedia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017e
            r0 = 2131892073(0x7f121769, float:1.9418884E38)
        L_0x01f6:
            java.lang.String r5 = r12.getString(r0)
            if (r5 == 0) goto L_0x017e
            java.lang.String r0 = "  • "
            r6.append(r0)
            r6.append(r5)
            r6.append(r8)
            int r9 = r9 + 1
            r2 = r7
            goto L_0x016b
        L_0x020c:
            if (r9 <= r10) goto L_0x0237
            r6.append(r8)
            boolean r0 = r12.A07
            java.lang.String r1 = "\n\n"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x0229
            r0 = 2131892075(0x7f12176b, float:1.9418888E38)
            X.C13690nt.A0t(r12, r1, r4, r0)
            X.AnonymousClass000.A1I(r6, r4)
            r0 = 2131892077(0x7f12176d, float:1.9418892E38)
            goto L_0x0132
        L_0x0229:
            r0 = 2131892074(0x7f12176a, float:1.9418886E38)
            X.C13690nt.A0t(r12, r1, r4, r0)
            X.AnonymousClass000.A1I(r6, r4)
            r0 = 2131892076(0x7f12176c, float:1.941889E38)
            goto L_0x0132
        L_0x0237:
            if (r9 <= 0) goto L_0x0082
            boolean r5 = r12.A07
            int r0 = r2.hashCode()
            if (r5 == 0) goto L_0x02c5
            switch(r0) {
                case -1618876223: goto L_0x025c;
                case -1012222381: goto L_0x0269;
                case -892481550: goto L_0x0276;
                case -309425751: goto L_0x0284;
                case 3314326: goto L_0x0291;
                case 3452698: goto L_0x029e;
                case 3545755: goto L_0x02ab;
                case 98629247: goto L_0x02b9;
                case 1262089803: goto L_0x0338;
                default: goto L_0x0244;
            }
        L_0x0244:
            java.lang.String r0 = "sysstatus/create/down/string-not-found "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.util.ArrayList r0 = r12.A05
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0082
        L_0x025c:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892057(0x7f121759, float:1.9418852E38)
            goto L_0x0343
        L_0x0269:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892079(0x7f12176f, float:1.9418896E38)
            goto L_0x0343
        L_0x0276:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892089(0x7f121779, float:1.9418916E38)
            goto L_0x0343
        L_0x0284:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892082(0x7f121772, float:1.9418902E38)
            goto L_0x0343
        L_0x0291:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892069(0x7f121765, float:1.9418876E38)
            goto L_0x0343
        L_0x029e:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892085(0x7f121775, float:1.9418908E38)
            goto L_0x0343
        L_0x02ab:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892092(0x7f12177c, float:1.9418923E38)
            goto L_0x0343
        L_0x02b9:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892066(0x7f121762, float:1.941887E38)
            goto L_0x0343
        L_0x02c5:
            switch(r0) {
                case -1618876223: goto L_0x02ca;
                case -1012222381: goto L_0x02d6;
                case -892481550: goto L_0x02e2;
                case -309425751: goto L_0x02ef;
                case 3314326: goto L_0x02fb;
                case 3452698: goto L_0x0307;
                case 3545755: goto L_0x0313;
                case 98629247: goto L_0x0320;
                case 1262089803: goto L_0x032c;
                default: goto L_0x02c8;
            }
        L_0x02c8:
            goto L_0x0244
        L_0x02ca:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892056(0x7f121758, float:1.941885E38)
            goto L_0x0343
        L_0x02d6:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892078(0x7f12176e, float:1.9418894E38)
            goto L_0x0343
        L_0x02e2:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892088(0x7f121778, float:1.9418914E38)
            goto L_0x0343
        L_0x02ef:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892081(0x7f121771, float:1.94189E38)
            goto L_0x0343
        L_0x02fb:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892068(0x7f121764, float:1.9418874E38)
            goto L_0x0343
        L_0x0307:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892084(0x7f121774, float:1.9418906E38)
            goto L_0x0343
        L_0x0313:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892091(0x7f12177b, float:1.941892E38)
            goto L_0x0343
        L_0x0320:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892065(0x7f121761, float:1.9418868E38)
            goto L_0x0343
        L_0x032c:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892071(0x7f121767, float:1.941888E38)
            goto L_0x0343
        L_0x0338:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0244
            r0 = 2131892072(0x7f121768, float:1.9418882E38)
        L_0x0343:
            java.lang.String r0 = r12.getString(r0)
            if (r0 == 0) goto L_0x0244
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r0)
            r4.append(r3)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0359
            r0 = 2131892062(0x7f12175e, float:1.9418862E38)
            goto L_0x0132
        L_0x0359:
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r2)
            goto L_0x012a
        L_0x0361:
            r12.A04 = r5
            goto L_0x0082
        L_0x0365:
            r0 = 2131366544(0x7f0a1290, float:1.8352985E38)
            X.C13690nt.A1I(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.systemstatus.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }
}
