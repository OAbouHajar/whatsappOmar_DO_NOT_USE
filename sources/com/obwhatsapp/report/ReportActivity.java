package com.obwhatsapp.report;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass027;
import X.AnonymousClass124;
import X.AnonymousClass13S;
import X.AnonymousClass1ZT;
import X.AnonymousClass1ZW;
import X.AnonymousClass2DR;
import X.AnonymousClass2DS;
import X.AnonymousClass2SR;
import X.AnonymousClass361;
import X.AnonymousClass3GZ;
import X.AnonymousClass3MF;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C14710pd;
import X.C15860rz;
import X.C16040sK;
import X.C16440t3;
import X.C16620tM;
import X.C17090uW;
import X.C17190ug;
import X.C17220uj;
import X.C18940xV;
import X.C19150xq;
import X.C19380yL;
import X.C211312x;
import X.C28371Vv;
import X.C28891Zc;
import X.C34791ks;
import X.C35081lL;
import X.C434920f;
import X.C447725m;
import X.C57102q8;
import X.C59142uk;
import X.C608636k;
import X.C608736l;
import X.C63253Gs;
import X.C83844Ig;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Date;

public class ReportActivity extends AnonymousClass2DR implements AnonymousClass2DS {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public ImageView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public C17090uW A0E;
    public TextEmojiLabel A0F;
    public TextEmojiLabel A0G;
    public C19380yL A0H;
    public AnonymousClass013 A0I;
    public C19150xq A0J;
    public AnonymousClass124 A0K;
    public BusinessActivityReportViewModel A0L;
    public C211312x A0M;
    public C83844Ig A0N;
    public C608636k A0O;
    public AnonymousClass361 A0P;
    public C608736l A0Q;
    public C17220uj A0R;
    public final C18940xV A0S = new IDxMObserverShape74S0100000_2_I0(this, 11);

    public final String A35(long j2) {
        boolean equals = "sl".equals(this.A0I.A06());
        AnonymousClass013 r1 = this.A0I;
        return equals ? C28891Zc.A08(r1, 1).format(new Date(j2)) : C28891Zc.A04(r1, j2);
    }

    public final void A36(TextEmojiLabel textEmojiLabel) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        textEmojiLabel2.A07 = new AnonymousClass3MF();
        textEmojiLabel2.setAccessibilityHelper(new C57102q8(textEmojiLabel2, this.A08));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass1ZW.A00(this, new Object[]{this.A0R.A04("26000110").toString()}, R.string.str0946));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                spannableStringBuilder.setSpan(new C59142uk(this, this.A0E, this.A05, this.A08, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(this, R.style.style0258), spanStart, spanEnd, spanFlags);
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                spannableStringBuilder.removeSpan(removeSpan);
            }
        }
        textEmojiLabel2.setText(spannableStringBuilder);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void Aba() {
        /*
            r11 = this;
            X.12x r0 = r11.A0M
            int r2 = r0.A01()
            r9 = 3
            r4 = 8
            r8 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0284
            r1 = 0
            r6 = 2
            if (r2 == r8) goto L_0x01c3
            r0 = 4
            if (r2 == r6) goto L_0x019e
            if (r2 == r9) goto L_0x010a
            if (r2 != r0) goto L_0x0313
            r10 = 1
        L_0x0019:
            X.12x r0 = r11.A0M
            X.1rA r2 = r0.A03()
            if (r2 == 0) goto L_0x00c0
            X.0ta r0 = r2.A02
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.A0Z
            if (r0 == 0) goto L_0x00c0
            if (r10 != 0) goto L_0x00c0
            android.view.View r0 = r11.A03
            r0.setEnabled(r5)
            android.view.View r0 = r11.A03
            r0.setOnClickListener(r1)
            android.widget.ImageView r1 = r11.A07
            r0 = 2131231425(0x7f0802c1, float:1.807893E38)
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r11.A07
            r3 = 2131100768(0x7f060460, float:1.7813927E38)
            int r0 = X.AnonymousClass00T.A00(r11, r3)
            X.AnonymousClass2SR.A08(r1, r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131888449(0x7f120941, float:1.9411534E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.A0D
            int r0 = X.AnonymousClass00T.A00(r11, r3)
            r1.setTextColor(r0)
            android.widget.TextView r1 = r11.A0C
            int r0 = X.AnonymousClass00T.A00(r11, r3)
            r1.setTextColor(r0)
        L_0x0064:
            android.widget.TextView r0 = r11.A0C
            r0.setVisibility(r5)
            if (r2 == 0) goto L_0x00ae
            android.widget.TextView r7 = r11.A0C
            r9 = 2131888455(0x7f120947, float:1.9411546E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.013 r3 = r11.A0I
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            java.lang.String r0 = X.C28891Zc.A04(r3, r0)
            r6[r5] = r0
            X.013 r3 = r11.A0I
            long r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r3, r0)
            r6[r8] = r0
            java.lang.String r0 = r11.getString(r9, r6)
            r7.setText(r0)
        L_0x0091:
            if (r10 != 0) goto L_0x0185
            android.view.View r0 = r11.A04
            r0.setVisibility(r4)
            android.view.View r0 = r11.A05
            r0.setVisibility(r4)
        L_0x009d:
            android.widget.TextView r0 = r11.A0B
            r0.setVisibility(r5)
            android.widget.TextView r7 = r11.A0B
            r9 = 2131888453(0x7f120945, float:1.9411542E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            X.12x r6 = r11.A0M
            monitor-enter(r6)
            goto L_0x01a1
        L_0x00ae:
            android.widget.TextView r3 = r11.A0C
            X.013 r2 = r11.A0I
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            java.lang.String r0 = X.C28891Zc.A04(r2, r0)
            r3.setText(r0)
            goto L_0x0091
        L_0x00c0:
            android.view.View r0 = r11.A03
            r0.setEnabled(r8)
            android.view.View r3 = r11.A03
            r1 = 34
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r11, r1)
            r3.setOnClickListener(r0)
            android.widget.ImageView r1 = r11.A07
            r0 = 2131231407(0x7f0802af, float:1.8078894E38)
            r1.setImageResource(r0)
            android.widget.ImageView r3 = r11.A07
            r1 = 2130969681(0x7f040451, float:1.754805E38)
            r0 = 2131101455(0x7f06070f, float:1.781532E38)
            int r0 = X.C434920f.A00(r11, r1, r0)
            X.AnonymousClass2SR.A08(r3, r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131888448(0x7f120940, float:1.9411532E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            android.widget.TextView r1 = r11.A0C
            r0 = 2131101456(0x7f060710, float:1.7815322E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            goto L_0x0064
        L_0x010a:
            android.view.View r0 = r11.A03
            r0.setEnabled(r8)
            android.view.View r2 = r11.A03
            r1 = 35
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            android.widget.ImageView r1 = r11.A07
            r0 = 2131231430(0x7f0802c6, float:1.807894E38)
            r1.setImageResource(r0)
            android.widget.ImageView r2 = r11.A07
            r1 = 2130969681(0x7f040451, float:1.754805E38)
            r0 = 2131101455(0x7f06070f, float:1.781532E38)
            int r0 = X.C434920f.A00(r11, r1, r0)
            X.AnonymousClass2SR.A08(r2, r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131888459(0x7f12094b, float:1.9411554E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            android.widget.TextView r0 = r11.A0C
            r0.setVisibility(r5)
            android.widget.TextView r1 = r11.A0C
            r0 = 2131101456(0x7f060710, float:1.7815322E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            X.12x r0 = r11.A0M
            X.1rA r9 = r0.A03()
            android.widget.TextView r3 = r11.A0C
            if (r9 == 0) goto L_0x0191
            r7 = 2131888455(0x7f120947, float:1.9411546E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.013 r2 = r11.A0I
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            java.lang.String r0 = X.C28891Zc.A04(r2, r0)
            r6[r5] = r0
            X.013 r2 = r11.A0I
            long r0 = r9.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r2, r0)
            r6[r8] = r0
            java.lang.String r0 = r11.getString(r7, r6)
        L_0x0182:
            r3.setText(r0)
        L_0x0185:
            android.view.View r0 = r11.A04
            r0.setVisibility(r5)
            android.view.View r0 = r11.A05
            r0.setVisibility(r5)
            goto L_0x009d
        L_0x0191:
            X.013 r2 = r11.A0I
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            java.lang.String r0 = X.C28891Zc.A04(r2, r0)
            goto L_0x0182
        L_0x019e:
            r10 = 0
            goto L_0x0019
        L_0x01a1:
            X.0rz r0 = r6.A0D     // Catch:{ all -> 0x01c0 }
            X.01D r0 = r0.A01     // Catch:{ all -> 0x01c0 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x01c0 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x01c0 }
            java.lang.String r2 = "gdpr_report_expiration_timestamp"
            r0 = 0
            long r0 = r3.getLong(r2, r0)     // Catch:{ all -> 0x01c0 }
            monitor-exit(r6)
            java.lang.String r0 = r11.A35(r0)
            r8[r5] = r0
            java.lang.String r0 = r11.getString(r9, r8)
            goto L_0x0276
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x01c3:
            android.view.View r0 = r11.A03
            r0.setEnabled(r5)
            android.view.View r0 = r11.A03
            r0.setOnClickListener(r1)
            android.widget.ImageView r1 = r11.A07
            r0 = 2131231425(0x7f0802c1, float:1.807893E38)
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r11.A07
            r0 = 2131100768(0x7f060460, float:1.7813927E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            X.AnonymousClass2SR.A08(r1, r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131888458(0x7f12094a, float:1.9411552E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            android.widget.TextView r0 = r11.A0C
            r0.setVisibility(r5)
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            X.013 r2 = r11.A0I
            java.lang.String r3 = r2.A06()
            java.lang.String r2 = "sl"
            boolean r3 = r2.equals(r3)
            X.013 r2 = r11.A0I
            if (r3 == 0) goto L_0x027f
            java.text.DateFormat r3 = X.C28891Zc.A08(r2, r6)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r3 = r3.format(r2)
        L_0x021e:
            android.widget.TextView r2 = r11.A0C
            r1 = 2131888460(0x7f12094c, float:1.9411556E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r3
            java.lang.String r0 = r11.getString(r1, r0)
            r2.setText(r0)
            android.widget.TextView r1 = r11.A0C
            r0 = 2131101456(0x7f060710, float:1.7815322E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            android.view.View r0 = r11.A04
            r0.setVisibility(r4)
            android.view.View r0 = r11.A05
            r0.setVisibility(r4)
            android.widget.TextView r0 = r11.A0B
            r0.setVisibility(r5)
            r2 = 1
            X.12x r0 = r11.A0M
            long r0 = r0.A02()
            X.0t3 r6 = r11.A05
            long r6 = r6.A00()
            long r0 = r0 - r6
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r6
            long r0 = java.lang.Math.max(r2, r0)
            int r6 = (int) r0
            android.widget.TextView r7 = r11.A0B
            android.content.res.Resources r3 = r11.getResources()
            r2 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r6, r1)
        L_0x0276:
            r7.setText(r0)
            com.obwhatsapp.TextEmojiLabel r0 = r11.A0G
            r0.setVisibility(r4)
            return
        L_0x027f:
            java.lang.String r3 = X.C28891Zc.A04(r2, r0)
            goto L_0x021e
        L_0x0284:
            android.view.View r0 = r11.A03
            r0.setEnabled(r8)
            android.view.View r2 = r11.A03
            r1 = 33
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            android.widget.ImageView r3 = r11.A07
            X.013 r2 = r11.A0I
            r0 = 2131231892(0x7f080494, float:1.8079878E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r11, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            android.widget.ImageView r2 = r11.A07
            r1 = 2130969681(0x7f040451, float:1.754805E38)
            r0 = 2131101455(0x7f06070f, float:1.781532E38)
            int r0 = X.C434920f.A00(r11, r1, r0)
            X.AnonymousClass2SR.A08(r2, r0)
            X.0pd r0 = r11.A0C
            r7 = 455(0x1c7, float:6.38E-43)
            X.0tM r6 = X.C16620tM.A02
            boolean r2 = r0.A0E(r6, r7)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131888456(0x7f120948, float:1.9411548E38)
            if (r2 == 0) goto L_0x02cb
            r0 = 2131888457(0x7f120949, float:1.941155E38)
        L_0x02cb:
            r1.setText(r0)
            android.widget.TextView r1 = r11.A0D
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r1.setTextColor(r0)
            android.widget.TextView r0 = r11.A0C
            r0.setVisibility(r4)
            android.view.View r0 = r11.A04
            r0.setVisibility(r4)
            android.view.View r0 = r11.A05
            r0.setVisibility(r4)
            android.widget.TextView r0 = r11.A0B
            r0.setVisibility(r4)
            android.widget.TextView r4 = r11.A0B
            android.content.res.Resources r3 = r11.getResources()
            r2 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r9, r1)
            r4.setText(r0)
            X.0pd r0 = r11.A0C
            boolean r0 = r0.A0E(r6, r7)
            if (r0 == 0) goto L_0x0313
            com.obwhatsapp.TextEmojiLabel r0 = r11.A0G
            r0.setVisibility(r5)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.report.ReportActivity.Aba():void");
    }

    public final void initGdprViews(View view) {
        this.A0D = (TextView) C004601z.A0E(view, R.id.report_button_title);
        this.A0C = (TextView) C004601z.A0E(view, R.id.report_button_subtitle);
        this.A07 = (ImageView) C004601z.A0E(view, R.id.report_button_icon);
        this.A03 = C004601z.A0E(view, R.id.report_button);
        this.A04 = C004601z.A0E(view, R.id.report_delete);
        this.A0G = (TextEmojiLabel) C004601z.A0E(view, R.id.report_item_header);
        this.A0B = (TextView) C004601z.A0E(view, R.id.report_item_footer);
        AnonymousClass2SR.A08(this.A07, C434920f.A00(this, R.attr.attr0451, R.color.color070f));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 8));
        A36(this.A0G);
    }

    public final void initP2BViews(View view) {
        if (!this.A0C.A0E(C16620tM.A02, 455)) {
            findViewById(R.id.request_p2b_report_container).setVisibility(8);
            findViewById(R.id.reports_divider).setVisibility(8);
            return;
        }
        this.A0A = (TextView) C004601z.A0E(view, R.id.report_button_title);
        this.A09 = (TextView) C004601z.A0E(view, R.id.report_button_subtitle);
        this.A06 = (ImageView) C004601z.A0E(view, R.id.report_button_icon);
        this.A00 = C004601z.A0E(view, R.id.report_button);
        this.A01 = C004601z.A0E(view, R.id.report_delete);
        this.A0F = (TextEmojiLabel) C004601z.A0E(view, R.id.report_item_header);
        this.A08 = (TextView) C004601z.A0E(view, R.id.report_item_footer);
        TextView textView = (TextView) C004601z.A0E(view, R.id.report_item_header);
        ((TextView) C004601z.A0E(view, R.id.report_button_title)).setText(getString(R.string.str0eed));
        textView.setVisibility(0);
        textView.setText(getString(R.string.str0ee8));
        this.A02 = C004601z.A0E(view, R.id.report_delete_divider);
        C004601z.A0E(view, R.id.report_delete_divider).setVisibility(8);
        DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment = new DeleteReportConfirmationDialogFragment();
        deleteReportConfirmationDialogFragment.A00 = new C63253Gs(this);
        this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I0_1(this, 0, deleteReportConfirmationDialogFragment));
    }

    public void onCreate(Bundle bundle) {
        boolean z2;
        super.onCreate(bundle);
        setTitle(R.string.str17a8);
        setContentView((int) R.layout.layout0053);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        C14710pd r0 = this.A0C;
        C16620tM r3 = C16620tM.A02;
        if (r0.A0E(r3, 455)) {
            findViewById(R.id.report_header).setVisibility(8);
            findViewById(R.id.report_header_divider).setVisibility(8);
        } else {
            ((ImageView) findViewById(R.id.gdpr_report_logo)).setImageDrawable(new C447725m(AnonymousClass00T.A04(this, R.drawable.settings_account_info), this.A0I));
            A36((TextEmojiLabel) findViewById(R.id.gdpr_report_header));
        }
        this.A05 = findViewById(R.id.report_delete_divider);
        initGdprViews(findViewById(R.id.request_gdpr_report_container));
        initP2BViews(findViewById(R.id.request_p2b_report_container));
        this.A0J.A02(this.A0S);
        C211312x r2 = this.A0M;
        synchronized (r2) {
            int A012 = r2.A01();
            if (A012 < 0 || A012 > 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdpr/validate-state/wrong-state ");
                sb.append(A012);
                Log.e(sb.toString());
                r2.A0D.A0a();
            } else if (A012 != 3) {
                if (A012 == 2) {
                    if (r2.A03() == null) {
                        Log.e("gdpr/validate-state/report-message-missing");
                        r2.A0D.A0a();
                    }
                } else if (A012 != 2) {
                    if (A012 == 4) {
                    }
                }
                C16440t3 r13 = r2.A0A;
                long A002 = r13.A00();
                C15860rz r9 = r2.A0D;
                AnonymousClass01D r10 = r9.A01;
                if (A002 > ((SharedPreferences) r10.get()).getLong("gdpr_report_expiration_timestamp", 0)) {
                    long A003 = r13.A00();
                    long j2 = ((SharedPreferences) r10.get()).getLong("gdpr_report_expiration_timestamp", 0);
                    if (A003 > j2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("gdpr/validate-state/report-too-old current:");
                        sb2.append(A003);
                        sb2.append(" expired:");
                        sb2.append(j2);
                        Log.i(sb2.toString());
                        r9.A0a();
                    }
                }
            } else if (!new File(r2.A02.A03.A00.getFilesDir(), "gdpr.zip").exists()) {
                Log.e("gdpr/validate-state/report-media-file-missing");
                r2.A0D.A0h(2);
            }
        }
        if (this.A0M.A01() < 3) {
            AnonymousClass361 r22 = new AnonymousClass361(this, this);
            this.A0P = r22;
            this.A05.Ack(r22, new Void[0]);
        }
        Aba();
        if (this.A0C.A0E(r3, 455)) {
            BusinessActivityReportViewModel businessActivityReportViewModel = (BusinessActivityReportViewModel) new C006602z(this).A01(BusinessActivityReportViewModel.class);
            this.A0L = businessActivityReportViewModel;
            businessActivityReportViewModel.A02.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 56));
            this.A0L.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 227));
            this.A0L.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 226));
            BusinessActivityReportViewModel businessActivityReportViewModel2 = this.A0L;
            AnonymousClass13S r23 = businessActivityReportViewModel2.A05;
            synchronized (r23) {
                int A004 = r23.A00();
                if (A004 < 0 || A004 > 4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("BusinessActivityReportManager/validate-state/wrong-state ");
                    sb3.append(A004);
                    Log.e(sb3.toString());
                    r23.A03.A0Z();
                } else {
                    if (A004 == 4) {
                        if (!r23.A01.A06().exists()) {
                            Log.e("BusinessActivityReportManager/validate-state/report-media-file-missing");
                            r23.A03.A0f(2);
                        }
                    } else if (A004 != 2 ? A004 == 3 && r23.A01() == null : r23.A01() == null) {
                        Log.e("BusinessActivityReportManager/validate-state/report-message-missing");
                        r23.A03.A0Z();
                    }
                    long j3 = ((SharedPreferences) r23.A03.A01.get()).getLong("business_activity_report_expiration_timestamp", 0);
                    if (A004 == 2) {
                        C16440t3 r1 = r23.A02;
                        if (r1.A00() > j3) {
                            long A005 = r1.A00();
                            if (A005 > j3) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("BusinessActivityReportManager/validate-state/report-too-old current:");
                                sb4.append(A005);
                                sb4.append(" expired:");
                                sb4.append(j3);
                                Log.i(sb4.toString());
                                r23.A02();
                            }
                        }
                    }
                }
            }
            businessActivityReportViewModel2.A02.A0B(Integer.valueOf(r23.A00()));
            BusinessActivityReportViewModel businessActivityReportViewModel3 = this.A0L;
            AnonymousClass027 r12 = businessActivityReportViewModel3.A02;
            if (r12.A01() != null && ((Number) r12.A01()).intValue() != 4) {
                AnonymousClass3GZ r92 = businessActivityReportViewModel3.A0C;
                if (r92.A04.A0A()) {
                    C17190ug r8 = r92.A06;
                    String A022 = r8.A02();
                    C28371Vv r4 = new C28371Vv("p2b", new C35081lL[]{new C35081lL("action", "status")});
                    C16040sK r02 = r92.A03;
                    r02.A0B();
                    AnonymousClass1ZT r03 = r02.A05;
                    AnonymousClass00B.A06(r03);
                    r8.A0B(r92, new C28371Vv(r4, "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("from", r03.getRawString()), new C35081lL("xmlns", "w:biz:p2b_report"), new C35081lL("type", "get"), new C35081lL("smax_id", "34"), new C35081lL("id", A022)}), A022, 265, 32000);
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sb5 = new StringBuilder("app/sendGetReport success:");
                sb5.append(z2);
                Log.i(sb5.toString());
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass361 r0 = this.A0P;
        if (r0 != null) {
            r0.A06(true);
        }
        C608736l r02 = this.A0Q;
        if (r02 != null) {
            r02.A06(true);
        }
        C608636k r03 = this.A0O;
        if (r03 != null) {
            r03.A06(true);
        }
        this.A0J.A03(this.A0S);
    }

    public void onStart() {
        super.onStart();
        this.A0H.A03(16, (String) null);
        this.A0H.A03(32, (String) null);
    }
}
