package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxPDisplayerShape298S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

/* renamed from: X.2zL  reason: invalid class name and case insensitive filesystem */
public class C59912zL extends AnonymousClass4QA {
    public final View.OnTouchListener A00 = new C94254kc(0.15f, 0.15f, 0.15f, 0.15f);
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final C15900s5 A09;
    public final C30521cU A0A;
    public final CallsHistoryFragment A0B;
    public final C204310c A0C;
    public final SelectionCheckView A0D;
    public final C16000sG A0E;
    public final C16080sP A0F;
    public final AnonymousClass2OY A0G = new IDxPDisplayerShape298S0100000_2_I1(this, 0);
    public final AnonymousClass2Ao A0H;
    public final AnonymousClass2Ao A0I;
    public final AnonymousClass01V A0J;
    public final C16440t3 A0K;
    public final AnonymousClass013 A0L;
    public final C14710pd A0M;
    public final C17240ul A0N;
    public final C216014s A0O;
    public final MultiContactThumbnail A0P;
    public final C34331k5 A0Q = new ViewOnClickCListenerShape4S0100000_I1(this, 31);

    public C59912zL(View view, C15900s5 r10, CallsHistoryFragment callsHistoryFragment, C204310c r12, C16000sG r13, C16080sP r14, AnonymousClass2Ao r15, AnonymousClass2Ao r16, AnonymousClass01V r17, C16440t3 r18, AnonymousClass013 r19, C14710pd r20, C17240ul r21, C25781Lc r22, C216014s r23) {
        this.A0K = r18;
        this.A0M = r20;
        this.A09 = r10;
        this.A0O = r23;
        this.A0C = r12;
        this.A0E = r13;
        this.A0J = r17;
        this.A0F = r14;
        AnonymousClass013 r5 = r19;
        this.A0L = r5;
        this.A0N = r21;
        this.A0I = r15;
        this.A0H = r16;
        this.A0B = callsHistoryFragment;
        this.A03 = C13680ns.A0J(view, R.id.contact_photo);
        C30521cU r2 = new C30521cU(view, r14, r5, r22, (int) R.id.contact_name);
        others.hContactName(r2.A02);
        this.A0A = r2;
        TextView A0L2 = C13680ns.A0L(view, R.id.date_time);
        yo.ChangeSize(A0L2, 2);
        this.A07 = A0L2;
        this.A02 = C13680ns.A0J(view, R.id.call_type_icon);
        TextView A0L3 = C13680ns.A0L(view, R.id.count);
        yo.ChangeSize(A0L3, 2);
        this.A06 = A0L3;
        this.A05 = C13680ns.A0J(view, R.id.voice_call);
        this.A04 = C13680ns.A0J(view, R.id.video_call);
        this.A0D = (SelectionCheckView) C004601z.A0E(view, R.id.selection_check);
        this.A01 = C004601z.A0E(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) C004601z.A0E(view, R.id.multi_contact_photo);
        this.A0P = multiContactThumbnail;
        this.A08 = C13680ns.A0M(view, R.id.do_not_disturb_label);
        C004601z.A0d(multiContactThumbnail, 2);
        r2.A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0166, code lost:
        if (r8 == 5) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005e, code lost:
        if (r5 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b9, code lost:
        if (((X.C37831po) r17.get(0)).A0C() == false) goto L_0x01bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r21) {
        /*
            r20 = this;
            r2 = r20
            X.5Rk r0 = r2.A00
            X.4wc r0 = (X.C101044wc) r0
            X.39v r0 = r0.A00
            r19 = r0
            X.0sH r10 = r19.A03()
            X.AnonymousClass00B.A06(r10)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            java.lang.Class<com.obwhatsapp.calling.callhistory.CallsHistoryFragment> r0 = com.obwhatsapp.calling.callhistory.CallsHistoryFragment.class
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            X.0rv r0 = r10.A0E
            java.lang.String r0 = X.C16030sJ.A03(r0)
            X.C13700nu.A0a(r3, r0)
            long r0 = r19.A02()
            java.lang.String r16 = X.C13680ns.A0j(r3, r0)
            android.widget.ImageView r0 = r2.A03
            r18 = r0
            r1 = r0
            r0 = r16
            X.C004601z.A0n(r1, r0)
            r0 = r19
            java.util.ArrayList r0 = r0.A04
            r17 = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r17)
            r7 = 0
            java.lang.Object r0 = r0.get(r7)
            X.1po r0 = (X.C37831po) r0
            com.whatsapp.jid.GroupJid r1 = r0.A04
            X.0sG r12 = r2.A0E
            X.14s r0 = r2.A0O
            X.0ul r6 = r2.A0N
            X.0sH r5 = X.C30341cC.A02(r12, r6, r1, r0)
            boolean r0 = r19.A06()
            r4 = 1
            if (r0 == 0) goto L_0x0060
            r9 = 1
            if (r5 == 0) goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            com.obwhatsapp.ui.voip.MultiContactThumbnail r8 = r2.A0P
            r3 = 8
            int r0 = X.C13690nt.A07(r9)
            r8.setVisibility(r0)
            r1 = 0
            if (r9 == 0) goto L_0x0071
            r1 = 8
        L_0x0071:
            r0 = r18
            r0.setVisibility(r1)
            X.1cU r11 = r2.A0A
            r0 = r9 ^ 1
            com.obwhatsapp.TextEmojiLabel r1 = r11.A02
            r1.setSingleLine(r0)
            if (r9 == 0) goto L_0x00a6
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.util.List r0 = java.util.Collections.unmodifiableList(r17)
            r15 = 0
            java.lang.Object r13 = r0.get(r7)
            X.1po r13 = (X.C37831po) r13
            X.0sP r14 = r2.A0F
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r9 = r2.A0B
            java.util.ArrayList r0 = r9.A0f
            java.util.List r13 = com.obwhatsapp.calling.callhistory.CallsHistoryFragment.A01(r12, r14, r13, r0)
        L_0x009a:
            int r0 = r13.size()
            if (r15 >= r0) goto L_0x00b8
            X.C16000sG.A01(r12, r10, r13, r15)
            int r15 = r15 + 1
            goto L_0x009a
        L_0x00a6:
            if (r5 == 0) goto L_0x00a9
            r10 = r5
        L_0x00a9:
            X.2Ao r1 = r2.A0I
            r0 = r18
            r1.A06(r0, r10)
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r9 = r2.A0B
            java.util.ArrayList r0 = r9.A0f
            r11.A0D(r10, r0)
            goto L_0x00d4
        L_0x00b8:
            r0 = 2
            r1.setMaxLines(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 3
            X.2Wj r0 = X.C52142dD.A02(r12, r14, r13, r0, r7)
            if (r0 != 0) goto L_0x0205
            r1 = 0
        L_0x00c8:
            java.util.ArrayList r0 = r9.A0f
            r11.A0F(r0, r1)
            X.2Ao r1 = r2.A0H
            X.2OY r0 = r2.A0G
            r8.A00(r0, r1, r10)
        L_0x00d4:
            android.widget.TextView r11 = r2.A07
            X.013 r10 = r2.A0L
            long r0 = r19.A02()
            java.lang.CharSequence r0 = X.C28961Zl.A01(r10, r0)
            r11.setText(r0)
            int r0 = r17.size()
            if (r0 <= r4) goto L_0x01fe
            android.widget.TextView r11 = r2.A06
            java.util.Locale r10 = X.C13690nt.A0m(r10)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1M(r1, r0, r7)
            java.lang.String r0 = "(%d)"
            java.lang.String r0 = java.lang.String.format(r10, r0, r1)
            r11.setText(r0)
            r11.setVisibility(r7)
        L_0x0100:
            java.util.HashSet r1 = r9.A0r
            java.lang.String r0 = r19.A05()
            boolean r11 = r1.contains(r0)
            java.util.Set r1 = r9.A0s
            java.lang.String r0 = r19.A05()
            boolean r10 = r1.remove(r0)
            android.view.View r1 = r2.A01
            r0 = 0
            if (r11 == 0) goto L_0x011c
            r0 = 2131100872(0x7f0604c8, float:1.7814138E38)
        L_0x011c:
            r1.setBackgroundResource(r0)
            r1.setSelected(r11)
            com.obwhatsapp.components.SelectionCheckView r1 = r2.A0D
            r1.A04(r11, r10)
            int r0 = X.C13680ns.A02(r11)
            r1.setVisibility(r0)
            r1 = r18
            r0 = r16
            X.C004601z.A0n(r1, r0)
            X.5Rk r0 = r2.A00
            r10 = 4
            com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1 r11 = new com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1
            r11.<init>(r9, r0, r2, r10)
            com.facebook.redex.IDxCListenerShape53S0200000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape53S0200000_2_I1
            r0 = r19
            r1.<init>(r2, r4, r0)
            r0 = r18
            r0.setOnClickListener(r11)
            r0.setOnLongClickListener(r1)
            r0 = 38
            X.C13680ns.A18(r8, r2, r0)
            r8.setOnLongClickListener(r1)
            int r8 = r19.A00()
            r1 = 2131232581(0x7f080745, float:1.8081275E38)
            if (r8 == 0) goto L_0x016b
            if (r8 == r4) goto L_0x01f9
            r0 = 2
            if (r8 == r0) goto L_0x01f9
            if (r8 == r10) goto L_0x0168
            r0 = 5
            r1 = 0
            if (r8 != r0) goto L_0x016b
        L_0x0168:
            r1 = 2131232580(0x7f080744, float:1.8081273E38)
        L_0x016b:
            android.widget.ImageView r8 = r2.A02
            r8.setImageResource(r1)
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x018b
            java.util.List r0 = java.util.Collections.unmodifiableList(r17)
            java.lang.Object r0 = r0.get(r7)
            X.1po r0 = (X.C37831po) r0
            int r1 = X.C62043Bk.A00(r0)
            android.content.Context r0 = r9.A02()
            X.AnonymousClass2SR.A07(r0, r8, r1)
        L_0x018b:
            android.content.Context r1 = r9.A0u()
            int r0 = r19.A01()
            X.C13680ns.A0t(r1, r8, r0)
            android.widget.TextView r9 = r2.A08
            if (r9 == 0) goto L_0x01c0
            X.0pd r8 = r2.A0M
            r1 = 2536(0x9e8, float:3.554E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r8.A0E(r0, r1)
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x01bb
            r0 = r17
            java.lang.Object r0 = r0.get(r7)
            X.1po r0 = (X.C37831po) r0
            boolean r1 = r0.A0C()
            r0 = 0
            if (r1 != 0) goto L_0x01bd
        L_0x01bb:
            r0 = 8
        L_0x01bd:
            r9.setVisibility(r0)
        L_0x01c0:
            if (r5 == 0) goto L_0x01c9
            boolean r0 = r6.A0e(r5)
            if (r0 == 0) goto L_0x01c9
            r4 = 0
        L_0x01c9:
            android.widget.ImageView r6 = r2.A05
            X.C62043Bk.A05(r6, r4)
            android.widget.ImageView r5 = r2.A04
            X.C62043Bk.A05(r5, r4)
            r6.setTag(r2)
            X.1k5 r1 = r2.A0Q
            r6.setOnClickListener(r1)
            android.view.View$OnTouchListener r0 = r2.A00
            r6.setOnTouchListener(r0)
            r5.setTag(r2)
            r5.setOnClickListener(r1)
            r5.setOnTouchListener(r0)
            r6.setVisibility(r3)
            r5.setVisibility(r3)
            boolean r0 = r19.A08()
            if (r0 == 0) goto L_0x020b
            r5.setVisibility(r7)
            return
        L_0x01f9:
            r1 = 2131232578(0x7f080742, float:1.808127E38)
            goto L_0x016b
        L_0x01fe:
            android.widget.TextView r0 = r2.A06
            r0.setVisibility(r3)
            goto L_0x0100
        L_0x0205:
            java.lang.String r1 = r0.A00(r1)
            goto L_0x00c8
        L_0x020b:
            r6.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59912zL.A00(int):void");
    }
}
