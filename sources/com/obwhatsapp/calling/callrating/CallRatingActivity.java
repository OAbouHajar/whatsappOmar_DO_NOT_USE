package com.obwhatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass1OK;
import X.AnonymousClass1OL;
import X.AnonymousClass5P5;
import X.C13680ns;
import X.C14570pP;
import X.C14710pd;
import X.C16150sX;
import X.C17020u3;
import X.C17250um;
import X.C18010w0;
import X.C25671Kr;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxFListenerShape370S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.StarRatingBar;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;

public class CallRatingActivity extends C14570pP {
    public static final int[] A0K = {R.string.str133d, R.string.str133e, R.string.str133f, R.string.str1340, R.string.str1341};
    public View A00;
    public EditText A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public StarRatingBar A05;
    public C25671Kr A06;
    public AnonymousClass1OL A07;
    public C18010w0 A08;
    public AnonymousClass1OK A09;
    public AnonymousClass01V A0A;
    public C17250um A0B;
    public C14710pd A0C;
    public WamCall A0D;
    public C17020u3 A0E;
    public Integer A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final AnonymousClass5P5 A0J;

    public CallRatingActivity() {
        this(0);
        this.A0J = new IDxFListenerShape370S0100000_2_I1(this, 1);
    }

    public CallRatingActivity(int i2) {
        this.A0H = false;
        C13680ns.A1G(this, 33);
    }

    public void A1q() {
        if (!this.A0H) {
            this.A0H = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A0C = C16150sX.A0k(r1);
            this.A0B = C16150sX.A0i(r1);
            this.A0A = C16150sX.A0T(r1);
            this.A08 = C16150sX.A0I(r1);
            this.A09 = (AnonymousClass1OK) r1.AQ6.get();
            this.A06 = (C25671Kr) r1.A3D.get();
            this.A07 = (AnonymousClass1OL) r1.AQ4.get();
            this.A0E = C16150sX.A14(r1);
        }
    }

    public final void A2B() {
        int i2 = this.A05.A00;
        String trim = C13680ns.A0f(this.A01).trim();
        View view = this.A00;
        boolean z2 = false;
        if (i2 > 0 || trim.codePointCount(0, trim.length()) >= 3) {
            z2 = true;
        }
        view.setEnabled(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f1, code lost:
        if (r0.longValue() < 1) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f4, code lost:
        if (r1 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f6, code lost:
        r0 = r1.videoEnabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f8, code lost:
        if (r0 == null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fe, code lost:
        if (r0.booleanValue() == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0100, code lost:
        r1 = X.C13690nt.A0T();
        r0 = com.obwhatsapp.R.string.str0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0107, code lost:
        if (r5 == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0109, code lost:
        r0 = com.obwhatsapp.R.string.str0a47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        X.C14570pP.A1V(r1, r3, r0);
        X.C14570pP.A1V(X.C13690nt.A0U(), r3, com.obwhatsapp.R.string.str037b);
        r1 = X.C13680ns.A0a();
        r0 = com.obwhatsapp.R.string.str0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0120, code lost:
        if (r5 == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0122, code lost:
        r0 = com.obwhatsapp.R.string.str0a3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0125, code lost:
        X.C14570pP.A1V(r1, r3, r0);
        java.util.Collections.shuffle(r3);
        r7 = new int[]{com.obwhatsapp.R.id.call_problem_0_checkbox, com.obwhatsapp.R.id.call_problem_1_checkbox, com.obwhatsapp.R.id.call_problem_2_checkbox};
        r6 = new int[]{com.obwhatsapp.R.id.call_problem_0_textview, com.obwhatsapp.R.id.call_problem_1_textview, com.obwhatsapp.R.id.call_problem_2_textview};
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0150, code lost:
        r1 = X.C13680ns.A0N(r14, r6[r5]);
        r1.setText(X.AnonymousClass000.A0D(((android.util.Pair) r3.get(r5)).second));
        r1.setTag(java.lang.Integer.valueOf(r7[r5]));
        X.C13680ns.A18(r1, r14, 42);
        r1 = findViewById(r7[r5]);
        r1.setTag(((android.util.Pair) r3.get(r5)).first);
        X.C13680ns.A18(r1, r14, 43);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x018b, code lost:
        if (r5 < 3) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018d, code lost:
        X.C34331k5.A01(r14.A00, r14, 37);
        r14.A01.setFilters(new android.text.InputFilter[]{new X.C93744jh(1024)});
        r8 = r14.A01;
        r8.addTextChangedListener(new X.C78503yB(r8, r9, r14.A0A, r14.A01, r14.A0B, r14.A0E));
        r14.A06.A00.add(r14.A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c0, code lost:
        r0 = com.obwhatsapp.R.string.str036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c7, code lost:
        if (r5 == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c9, code lost:
        r0 = com.obwhatsapp.R.string.str0a45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01cc, code lost:
        X.C14570pP.A1V(0, r3, r0);
        X.C14570pP.A1V(1, r3, com.obwhatsapp.R.string.str0370);
        r1 = X.C13680ns.A0Z();
        r0 = com.obwhatsapp.R.string.str0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01e0, code lost:
        if (r5 == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e2, code lost:
        r0 = com.obwhatsapp.R.string.str0a46;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r9 = r14
            super.onCreate(r15)
            X.C14570pP.A1U(r14)
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r3 = "event"
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            r4 = 0
            if (r0 == 0) goto L_0x0070
            com.whatsapp.fieldstats.events.WamCall r0 = r14.A0D
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = r0.callRandomId
        L_0x001a:
            X.1OL r0 = r14.A07
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "call_rating_last_call"
            java.lang.String r0 = X.C13700nu.A0E(r1, r0)
            if (r2 == 0) goto L_0x0039
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "callratingactivity/ignore duplicate ratings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14.finish()
            return
        L_0x0037:
            r2 = 0
            goto L_0x001a
        L_0x0039:
            X.0pd r2 = r14.A0C
            r1 = 1939(0x793, float:2.717E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x01e7
            com.whatsapp.fieldstats.extension.WamCallExtended r1 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r1.<init>()
        L_0x004a:
            r14.A0D = r1
            android.content.Intent r0 = r14.getIntent()
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            X.C18010w0.A01(r0, r1)
            com.whatsapp.fieldstats.events.WamCall r2 = r14.A0D
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.newEndCallSurveyVersion = r0
            r2.userRating = r0
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "uploadFieldStat"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r14.A0I = r0
        L_0x0070:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "timeSeriesDir"
            java.lang.String r0 = r1.getStringExtra(r0)
            r14.A0G = r0
            r0 = 2131558612(0x7f0d00d4, float:1.8742545E38)
            r14.setContentView((int) r0)
            r0 = 2131363677(0x7f0a075d, float:1.834717E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r14.A01 = r0
            r0 = 2131365633(0x7f0a0f01, float:1.8351137E38)
            android.view.View r0 = r14.findViewById(r0)
            com.obwhatsapp.StarRatingBar r0 = (com.obwhatsapp.StarRatingBar) r0
            r14.A05 = r0
            r0 = 2131365634(0x7f0a0f02, float:1.8351139E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r14, r0)
            r14.A04 = r0
            r0 = 2131366502(0x7f0a1266, float:1.83529E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A00 = r0
            r0 = 2131365637(0x7f0a0f05, float:1.8351145E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.A03 = r0
            r0 = 2131365636(0x7f0a0f04, float:1.8351143E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.A02 = r0
            android.view.View r0 = r14.A00
            r0.setEnabled(r4)
            com.obwhatsapp.StarRatingBar r1 = r14.A05
            com.facebook.redex.IDxCListenerShape422S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape422S0100000_2_I1
            r0.<init>(r14, r4)
            r1.A01 = r0
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 36
            X.C34331k5.A01(r1, r14, r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            com.whatsapp.fieldstats.events.WamCall r1 = r14.A0D
            r2 = 1
            if (r1 == 0) goto L_0x00f3
            java.lang.Long r0 = r1.groupCallSegmentIdx
            if (r0 == 0) goto L_0x00f3
            long r7 = r0.longValue()
            r5 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 1
            if (r0 >= 0) goto L_0x00f6
        L_0x00f3:
            r5 = 0
            if (r1 == 0) goto L_0x01c0
        L_0x00f6:
            java.lang.Boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c0
            java.lang.Integer r1 = X.C13690nt.A0T()
            r0 = 2131886969(0x7f120379, float:1.9408532E38)
            if (r5 == 0) goto L_0x010c
            r0 = 2131888711(0x7f120a47, float:1.9412065E38)
        L_0x010c:
            X.C14570pP.A1V(r1, r3, r0)
            java.lang.Integer r1 = X.C13690nt.A0U()
            r0 = 2131886971(0x7f12037b, float:1.9408536E38)
            X.C14570pP.A1V(r1, r3, r0)
            java.lang.Integer r1 = X.C13680ns.A0a()
            r0 = 2131886903(0x7f120337, float:1.9408398E38)
            if (r5 == 0) goto L_0x0125
            r0 = 2131888702(0x7f120a3e, float:1.9412047E38)
        L_0x0125:
            X.C14570pP.A1V(r1, r3, r0)
            java.util.Collections.shuffle(r3)
            r8 = 3
            int[] r7 = new int[r8]
            r0 = 2131362519(0x7f0a02d7, float:1.834482E38)
            r7[r4] = r0
            r0 = 2131362521(0x7f0a02d9, float:1.8344825E38)
            r7[r2] = r0
            r0 = 2131362523(0x7f0a02db, float:1.834483E38)
            r1 = 2
            r7[r1] = r0
            int[] r6 = new int[r8]
            r0 = 2131362520(0x7f0a02d8, float:1.8344823E38)
            r6[r4] = r0
            r0 = 2131362522(0x7f0a02da, float:1.8344827E38)
            r6[r2] = r0
            r0 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            r6[r1] = r0
            r5 = 0
        L_0x0150:
            r0 = r6[r5]
            android.widget.TextView r1 = X.C13680ns.A0N(r14, r0)
            java.lang.Object r0 = r3.get(r5)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass000.A0D(r0)
            r1.setText(r0)
            r0 = r7[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setTag(r0)
            r0 = 42
            X.C13680ns.A18(r1, r14, r0)
            r0 = r7[r5]
            android.view.View r1 = r14.findViewById(r0)
            java.lang.Object r0 = r3.get(r5)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            r1.setTag(r0)
            r0 = 43
            X.C13680ns.A18(r1, r14, r0)
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x0150
            android.view.View r1 = r14.A00
            r0 = 37
            X.C34331k5.A01(r1, r14, r0)
            android.widget.EditText r3 = r14.A01
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            r1 = 1024(0x400, float:1.435E-42)
            X.4jh r0 = new X.4jh
            r0.<init>(r1)
            r2[r4] = r0
            r3.setFilters(r2)
            android.widget.EditText r8 = r14.A01
            X.0um r12 = r14.A0B
            X.01V r10 = r14.A0A
            X.013 r11 = r14.A01
            X.0u3 r13 = r14.A0E
            X.3yB r7 = new X.3yB
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r8.addTextChangedListener(r7)
            X.1Kr r0 = r14.A06
            X.5P5 r1 = r14.A0J
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            return
        L_0x01c0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 2131886959(0x7f12036f, float:1.9408512E38)
            if (r5 == 0) goto L_0x01cc
            r0 = 2131888709(0x7f120a45, float:1.941206E38)
        L_0x01cc:
            X.C14570pP.A1V(r1, r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 2131886960(0x7f120370, float:1.9408514E38)
            X.C14570pP.A1V(r1, r3, r0)
            java.lang.Integer r1 = X.C13680ns.A0Z()
            r0 = 2131886961(0x7f120371, float:1.9408516E38)
            if (r5 == 0) goto L_0x0125
            r0 = 2131888710(0x7f120a46, float:1.9412063E38)
            goto L_0x0125
        L_0x01e7:
            com.whatsapp.fieldstats.events.WamCall r1 = new com.whatsapp.fieldstats.events.WamCall
            r1.<init>()
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callrating.CallRatingActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C25671Kr r0 = this.A06;
        r0.A00.remove(this.A0J);
    }

    public void onStop() {
        super.onStop();
        WamCall wamCall = this.A0D;
        if (wamCall != null) {
            StringBuilder A0r = AnonymousClass000.A0r("callratingactivity/postCallEvent with rating ");
            A0r.append(wamCall.userRating);
            C13680ns.A1V(A0r);
            AnonymousClass1OL r1 = this.A07;
            WamCall wamCall2 = this.A0D;
            C13680ns.A0y(r1.A01().edit(), "call_rating_last_call", wamCall2 != null ? wamCall2.callRandomId : null);
            this.A08.A02(this.A0D, this.A0I);
            if (this.A0G != null) {
                StringBuilder A0r2 = AnonymousClass000.A0r("callratingactivity/uploadTimeSeries with rating ");
                A0r2.append(this.A0D.userRating);
                A0r2.append("time series dir ");
                Log.i(AnonymousClass000.A0h(this.A0G, A0r2));
                this.A09.A02(this.A0D, this.A0G);
            }
            this.A0D = null;
        }
        finish();
    }
}
