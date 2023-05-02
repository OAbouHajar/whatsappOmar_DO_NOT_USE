package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCallbackShape428S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

/* renamed from: X.2QC  reason: invalid class name */
public class AnonymousClass2QC extends AnonymousClass2QD implements AnonymousClass2QE {
    public AnonymousClass15Z A00;
    public C78783yg A01;
    public AnonymousClass1L3 A02;
    public SharePhoneNumberRowViewModel A03;
    public AnonymousClass11R A04;
    public AnonymousClass1D0 A05;
    public AnonymousClass195 A06;
    public AnonymousClass1FI A07;
    public AnonymousClass15X A08;
    public C16490t9 A09;
    public AnonymousClass15W A0A;
    public AnonymousClass15Y A0B;
    public AnonymousClass1BL A0C;
    public AnonymousClass2TZ A0D;
    public AnonymousClass01D A0E;
    public final View.OnClickListener A0F = new ViewOnClickCListenerShape9S0100000_I0_2(this, 34);
    public final TextView A0G;
    public final AnonymousClass5P7 A0H = new IDxCallbackShape428S0100000_2_I0(this, 0);

    public AnonymousClass2QC(Context context, AnonymousClass1YG r5, AnonymousClass1WU r6) {
        super(context, r5, r6);
        setClickable(false);
        this.A0G = (TextView) findViewById(R.id.info);
        A1M();
    }

    public static /* synthetic */ void A0c(C000900k r3, AnonymousClass2QC r4, AnonymousClass46Y r5) {
        DialogFragment A002;
        String str;
        if (r3 instanceof C14550pN) {
            if (r5 instanceof C73873pC) {
                r4.getPhoneNumberSharedBridge();
                C73873pC r52 = (C73873pC) r5;
                A002 = AnonymousClass46K.A00(r52.A00, r52.A01);
                str = "PhoneNumberSharedBottomSheet";
            } else {
                r4.getSharePhoneNumberBridge();
                C15830rv r2 = ((C73863pB) r5).A00;
                C18450wi.A0H(r2, 0);
                A002 = AnonymousClass46L.A00(r2, 6);
                str = "SharePhoneNumberBottomSheet";
            }
            ((C14550pN) r3).Afb(A002, str);
        }
    }

    public static /* synthetic */ void A0d(AnonymousClass2QC r4, C37831po r5) {
        if (r5 == null || r5.A06 == null) {
            r4.getVoipErrorFragmentBridge();
            ((C14550pN) C19980zJ.A00(r4.getContext())).Afb(VoipErrorDialogFragment.A02(new C52302dW(), 12), (String) null);
        } else {
            r4.A0W.A06(r4.getContext(), r5, 8);
        }
        r4.A01 = null;
        r4.A0t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0e(X.AnonymousClass1WU r2) {
        /*
            boolean r0 = X.C38621r6.A0k(r2)
            if (r0 != 0) goto L_0x0017
            boolean r0 = X.C38621r6.A0f(r2)
            if (r0 == 0) goto L_0x0019
            boolean r0 = r2 instanceof X.C39341sK
            if (r0 == 0) goto L_0x0019
            r0 = r2
            X.1sK r0 = (X.C39341sK) r0
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            r2 = 1
        L_0x0018:
            return r2
        L_0x0019:
            boolean r0 = X.C38621r6.A0h(r2)
            if (r0 != 0) goto L_0x0017
            boolean r0 = X.C38621r6.A0i(r2)
            if (r0 != 0) goto L_0x0017
            int r1 = r2.A00
            r0 = 62
            if (r1 == r0) goto L_0x0017
            r0 = 63
            r2 = 0
            if (r1 != r0) goto L_0x0018
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2QC.A0e(X.1WU):boolean");
    }

    private AnonymousClass1C7 getPhoneNumberSharedBridge() {
        return (AnonymousClass1C7) ((C19110xm) this.A0E.get()).A00(AnonymousClass1C7.class);
    }

    private AnonymousClass1C6 getSharePhoneNumberBridge() {
        return (AnonymousClass1C6) ((C19110xm) this.A0E.get()).A00(AnonymousClass1C6.class);
    }

    private AnonymousClass11C getVoipErrorFragmentBridge() {
        return (AnonymousClass11C) ((C19110xm) this.A0E.get()).A00(AnonymousClass11C.class);
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean z3 = false;
        if (r3 != this.A0O) {
            z3 = true;
        }
        super.A1G(r3, z2);
        if (z2 || z3) {
            A1M();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017c, code lost:
        if (r9 == 59) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x018e, code lost:
        if (r2.A0A(r0) == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0192, code lost:
        if ((r13 instanceof X.C39451sV) == false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0196, code lost:
        if (r9 == 77) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019a, code lost:
        if (r9 != 78) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        if (r9 == 93) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a3, code lost:
        if (r9 == 94) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a5, code lost:
        if (r9 == 97) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a7, code lost:
        if (r9 == 99) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ab, code lost:
        if (r9 == 79) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01af, code lost:
        if (r9 == 101) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b3, code lost:
        if (r9 == 102) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b7, code lost:
        if (r9 == 103) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01bb, code lost:
        if (r9 == 104) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01bf, code lost:
        if (r9 == 107) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01c3, code lost:
        if (r9 == 108) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c7, code lost:
        if (r9 == 109) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01cb, code lost:
        if (r9 == 112) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01cf, code lost:
        if (r9 == 115) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d3, code lost:
        if (r9 == 114) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01d7, code lost:
        if (r9 == 113) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d9, code lost:
        r11.setOnClickListener((android.view.View.OnClickListener) null);
        r11.setClickable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0231, code lost:
        if (r1 == 3) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if ((r13 instanceof X.C39411sR) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x023a, code lost:
        if (r1 != 3) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016b, code lost:
        if (r1 != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0170, code lost:
        if (r0 != false) goto L_0x0172;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r15 = this;
            X.0tZ r13 = r15.A0O
            X.1WU r13 = (X.AnonymousClass1WU) r13
            r12 = 0
            r15.setClickable(r12)
            android.widget.TextView r11 = r15.A0G
            float r0 = r15.getDividerFontSize()
            r11.setTextSize(r0)
            int r0 = r13.A0C
            r1 = -1
            if (r0 != r1) goto L_0x0021
            byte r0 = r13.A10
            if (r0 != r1) goto L_0x0021
        L_0x001a:
            r0 = 2131888332(0x7f1208cc, float:1.9411296E38)
            r11.setText(r0)
            return
        L_0x0021:
            int r0 = r15.getBackgroundResource()
            if (r0 == 0) goto L_0x002a
            r11.setBackgroundResource(r0)
        L_0x002a:
            android.content.Context r1 = r15.getContext()
            int r0 = r15.getTextColor()
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            X.15Z r0 = r15.A00
            r14 = 1
            java.lang.String r4 = r0.A0C(r13, r14)
            android.content.Context r3 = r15.getContext()
            android.text.TextPaint r2 = r11.getPaint()
            r1 = 1067869798(0x3fa66666, float:1.3)
            X.0um r0 = r15.A19
            java.lang.CharSequence r10 = X.AnonymousClass2Sy.A04(r3, r2, r0, r4, r1)
            int r9 = r13.A00
            r8 = 99
            r7 = 97
            r6 = 70
            r5 = 68
            r4 = 56
            r3 = 67
            r2 = 96
            if (r9 == r14) goto L_0x02ff
            r0 = 11
            if (r9 == r0) goto L_0x02ff
            if (r9 == r3) goto L_0x006e
            r0 = 69
            if (r9 != r0) goto L_0x0269
            boolean r0 = r13 instanceof X.C39411sR
            if (r0 == 0) goto L_0x00cb
        L_0x006e:
            X.1Vw r0 = r13.A11
            X.0rv r1 = r0.A00
            X.15W r0 = r15.A0A
            boolean r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0261
            X.0pd r0 = r15.A0M
            boolean r0 = X.C40571uL.A00(r0, r1)
            if (r0 != 0) goto L_0x0261
            X.0zl r0 = r15.A1A
            boolean r0 = X.C40561uK.A01(r0, r1)
            if (r0 != 0) goto L_0x0261
            if (r9 != r3) goto L_0x021d
            boolean r0 = r13 instanceof X.C39341sK
            if (r0 == 0) goto L_0x021d
            r0 = r13
            X.1sK r0 = (X.C39341sK) r0
            int r1 = r0.A00
            X.0pd r0 = r15.A0M
            boolean r0 = X.C40571uL.A01(r0, r13)
            switch(r1) {
                case 5: goto L_0x00a3;
                case 6: goto L_0x00a3;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00a3;
                case 10: goto L_0x00a3;
                case 11: goto L_0x00a3;
                case 12: goto L_0x00a3;
                case 13: goto L_0x00a3;
                case 14: goto L_0x00a3;
                default: goto L_0x009e;
            }
        L_0x009e:
            r14 = 2131231846(0x7f080466, float:1.8079785E38)
            if (r0 == 0) goto L_0x00a6
        L_0x00a3:
            r14 = 2131231816(0x7f080448, float:1.8079724E38)
        L_0x00a6:
            switch(r1) {
                case 5: goto L_0x023e;
                case 6: goto L_0x023e;
                case 7: goto L_0x023e;
                case 8: goto L_0x023e;
                case 9: goto L_0x023e;
                case 10: goto L_0x023e;
                case 11: goto L_0x023e;
                case 12: goto L_0x023e;
                case 13: goto L_0x023e;
                case 14: goto L_0x023e;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r0 = 2131100074(0x7f0601aa, float:1.781252E38)
        L_0x00ac:
            android.content.Context r1 = r15.getContext()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass08E.A01(r1, r14)
            X.AnonymousClass00B.A06(r1)
            android.content.Context r14 = r15.getContext()
        L_0x00bb:
            int r0 = X.AnonymousClass00T.A00(r14, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r1, r0)
        L_0x00c3:
            android.text.TextPaint r0 = r11.getPaint()
            java.lang.CharSequence r10 = X.C56522nn.A00(r0, r1, r10)
        L_0x00cb:
            r11.setText(r10)
            r0 = 18
            if (r9 == r0) goto L_0x0172
            if (r9 == r2) goto L_0x0172
            r0 = 57
            if (r9 == r0) goto L_0x0172
            r0 = 71
            if (r9 == r0) goto L_0x0172
            r0 = 28
            if (r9 != r0) goto L_0x020f
            X.0sK r0 = r15.A0L
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0172
            boolean r0 = r13 instanceof X.AnonymousClass1WT
            if (r0 == 0) goto L_0x0172
            r0 = r13
            X.1WT r0 = (X.AnonymousClass1WT) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            X.1Vw r0 = r13.A11
            X.0rv r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0172
        L_0x00fb:
            boolean r0 = X.C38621r6.A0q(r13)
            if (r0 != 0) goto L_0x0172
            r0 = 61
            if (r9 == r0) goto L_0x0172
            r0 = 69
            if (r9 == r0) goto L_0x0172
            r0 = 62
            if (r9 == r0) goto L_0x0172
            r0 = 37
            if (r9 == r0) goto L_0x0172
            r0 = 39
            if (r9 == r0) goto L_0x0172
            r0 = 40
            if (r9 == r0) goto L_0x0172
            r0 = 41
            if (r9 == r0) goto L_0x0172
            r0 = 44
            if (r9 == r0) goto L_0x0172
            if (r9 == r6) goto L_0x0172
            if (r9 == r5) goto L_0x0172
            r0 = 58
            if (r9 != r0) goto L_0x01e1
            boolean r0 = r13 instanceof X.C39391sP
            if (r0 == 0) goto L_0x0134
            r0 = r13
            X.1sP r0 = (X.C39391sP) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0172
        L_0x0134:
            boolean r0 = r13.A12()
            if (r0 == 0) goto L_0x015c
            X.0rv r1 = r13.A0B()
            if (r1 == 0) goto L_0x015c
            X.0sK r0 = r15.A0L
            boolean r0 = r0.A0I(r1)
            if (r0 != 0) goto L_0x015c
            X.1Vw r0 = r13.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x015c
            r0 = 15
            if (r9 == r0) goto L_0x015c
            r0 = 16
            if (r9 == r0) goto L_0x015c
            if (r9 != r4) goto L_0x0172
        L_0x015c:
            X.0sK r1 = r15.A0L
            X.0sO r2 = r15.A0z
            X.0rv r0 = r13.A0B()
            if (r0 == 0) goto L_0x016d
            boolean r1 = r1.A0I(r0)
            r0 = 1
            if (r1 == 0) goto L_0x016e
        L_0x016d:
            r0 = 0
        L_0x016e:
            if (r9 != r4) goto L_0x0178
            if (r0 == 0) goto L_0x017f
        L_0x0172:
            android.view.View$OnClickListener r0 = r15.A0F
            r11.setOnClickListener(r0)
            return
        L_0x0178:
            if (r9 == r4) goto L_0x017f
            r0 = 59
            if (r9 != r0) goto L_0x0190
            goto L_0x0172
        L_0x017f:
            X.1Vw r0 = r13.A11
            X.0rv r0 = r0.A00
            X.0sL r0 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r2.A0A(r0)
            if (r0 != 0) goto L_0x0172
        L_0x0190:
            boolean r0 = r13 instanceof X.C39451sV
            if (r0 == 0) goto L_0x019d
            r0 = 77
            if (r9 == r0) goto L_0x0172
            r0 = 78
            if (r9 != r0) goto L_0x019d
            goto L_0x0172
        L_0x019d:
            r0 = 93
            if (r9 == r0) goto L_0x0172
            r0 = 94
            if (r9 == r0) goto L_0x0172
            if (r9 == r7) goto L_0x0172
            if (r9 == r8) goto L_0x0172
            r0 = 79
            if (r9 == r0) goto L_0x0172
            r0 = 101(0x65, float:1.42E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 102(0x66, float:1.43E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 103(0x67, float:1.44E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 104(0x68, float:1.46E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 107(0x6b, float:1.5E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 108(0x6c, float:1.51E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 109(0x6d, float:1.53E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 112(0x70, float:1.57E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 115(0x73, float:1.61E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 114(0x72, float:1.6E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 113(0x71, float:1.58E-43)
            if (r9 == r0) goto L_0x0172
            r0 = 0
            r11.setOnClickListener(r0)
            r11.setClickable(r12)
            return
        L_0x01e1:
            r0 = 27
            if (r9 == r0) goto L_0x0172
            r0 = 73
            if (r9 == r0) goto L_0x0172
            r0 = 74
            if (r9 == r0) goto L_0x0172
            r0 = 83
            if (r9 == r0) goto L_0x0172
            r0 = 84
            if (r9 == r0) goto L_0x0172
            r0 = 85
            if (r9 == r0) goto L_0x0172
            r0 = 75
            if (r9 == r0) goto L_0x0172
            r0 = 100
            if (r9 == r0) goto L_0x0172
            r0 = 95
            if (r9 == r0) goto L_0x0172
            r0 = 76
            if (r9 == r0) goto L_0x0172
            r0 = 86
            if (r9 == r0) goto L_0x0172
            goto L_0x0134
        L_0x020f:
            r0 = 10
            if (r9 == r0) goto L_0x0172
            if (r9 == r3) goto L_0x0172
            if (r9 == r2) goto L_0x0172
            r0 = 21
            if (r9 == r0) goto L_0x0172
            goto L_0x00fb
        L_0x021d:
            r0 = 69
            if (r9 != r0) goto L_0x0243
            boolean r0 = r13 instanceof X.C39411sR
            if (r0 == 0) goto L_0x0243
            r0 = r13
            X.1sR r0 = (X.C39411sR) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 == r0) goto L_0x0233
            r0 = 3
            r14 = 2131231846(0x7f080466, float:1.8079785E38)
            if (r1 != r0) goto L_0x0236
        L_0x0233:
            r14 = 2131231816(0x7f080448, float:1.8079724E38)
        L_0x0236:
            r0 = 2
            if (r1 == r0) goto L_0x023e
            r0 = 3
            if (r1 == r0) goto L_0x023e
            goto L_0x00a9
        L_0x023e:
            r0 = 2131101012(0x7f060554, float:1.7814422E38)
            goto L_0x00ac
        L_0x0243:
            boolean r0 = X.C38621r6.A0f(r13)
            if (r0 == 0) goto L_0x025c
            boolean r0 = r13 instanceof X.C39341sK
            if (r0 == 0) goto L_0x025c
            r0 = r13
            X.1sK r0 = (X.C39341sK) r0
            int r0 = r0.A00
            if (r0 == 0) goto L_0x025c
            r14 = 2131231816(0x7f080448, float:1.8079724E38)
            r0 = 2131100073(0x7f0601a9, float:1.7812517E38)
            goto L_0x00ac
        L_0x025c:
            r14 = 2131231846(0x7f080466, float:1.8079785E38)
            goto L_0x00a9
        L_0x0261:
            r14 = 2131232607(0x7f08075f, float:1.8081328E38)
            r0 = 2131100070(0x7f0601a6, float:1.7812511E38)
            goto L_0x00ac
        L_0x0269:
            r0 = 32
            if (r9 == r0) goto L_0x02e8
            r0 = 31
            if (r9 == r0) goto L_0x02e8
            if (r9 == r4) goto L_0x02d1
            r0 = 59
            if (r9 == r0) goto L_0x02d1
            if (r9 == r5) goto L_0x02d1
            if (r9 != r6) goto L_0x02a4
            boolean r0 = r13 instanceof X.C39421sS
            if (r0 == 0) goto L_0x001a
            X.3yg r0 = r15.A01
            if (r0 != 0) goto L_0x0284
            r14 = 0
        L_0x0284:
            android.content.Context r1 = r15.getContext()
            if (r14 == 0) goto L_0x0296
            r14 = 2131231703(0x7f0803d7, float:1.8079495E38)
        L_0x028d:
            r0 = 2131100048(0x7f060190, float:1.7812466E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A02(r1, r14, r0)
            goto L_0x00c3
        L_0x0296:
            r0 = r13
            X.1sS r0 = (X.C39421sS) r0
            boolean r0 = r0.A01
            r14 = 2131231683(0x7f0803c3, float:1.8079454E38)
            if (r0 == 0) goto L_0x028d
            r14 = 2131231682(0x7f0803c2, float:1.8079452E38)
            goto L_0x028d
        L_0x02a4:
            if (r9 != r2) goto L_0x02c1
            boolean r0 = r13 instanceof X.C40271tq
        L_0x02a8:
            if (r0 == 0) goto L_0x00cb
            android.content.Context r1 = r15.getContext()
            r0 = 2131231811(0x7f080443, float:1.8079714E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r1, r0)
            X.AnonymousClass00B.A06(r1)
            android.content.Context r14 = r15.getContext()
            r0 = 2131100048(0x7f060190, float:1.7812466E38)
            goto L_0x00bb
        L_0x02c1:
            if (r9 != r7) goto L_0x02cc
            r15.getContext()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x02cc:
            if (r9 != r8) goto L_0x00cb
            boolean r0 = r13 instanceof X.C40231tm
            goto L_0x02a8
        L_0x02d1:
            android.content.Context r1 = r15.getContext()
            r0 = 2131231633(0x7f080391, float:1.8079353E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r1, r0)
            X.AnonymousClass00B.A06(r1)
            android.content.Context r14 = r15.getContext()
            r0 = 2131100039(0x7f060187, float:1.7812448E38)
            goto L_0x00bb
        L_0x02e8:
            android.content.Context r1 = r15.getContext()
            r0 = 2131231752(0x7f080408, float:1.8079594E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r1, r0)
            X.AnonymousClass00B.A06(r1)
            android.content.Context r14 = r15.getContext()
            r0 = 2131100071(0x7f0601a7, float:1.7812513E38)
            goto L_0x00bb
        L_0x02ff:
            java.lang.CharSequence r10 = r15.A0r(r10)
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2QC.A1M():void");
    }

    public int getBackgroundResource() {
        AnonymousClass1WU r2 = (AnonymousClass1WU) this.A0O;
        C15830rv r1 = r2.A11.A00;
        if (this.A0A.A01(r1)) {
            return (r2.A00 != 67 || !(r2 instanceof C39341sK)) ? r2 instanceof C39291sE ? R.drawable.date_balloon : R.drawable.business_balloon : R.drawable.message_balloon_mint;
        }
        if (C40571uL.A00(this.A0M, r1) || C40561uK.A01(this.A1A, r1)) {
            return R.drawable.message_balloon_mint;
        }
        int i2 = r2.A00;
        if (i2 == 69 && (r2 instanceof C39411sR)) {
            int i3 = ((C39411sR) r2).A00;
            return (i3 == 2 || i3 == 3) ? R.drawable.message_balloon_mint : R.drawable.security_balloon;
        } else if (i2 != 67 || !(r2 instanceof C39341sK)) {
            return !A0e(r2) ? (C38621r6.A0q(r2) || C38621r6.A0e(r2)) ? R.drawable.business_balloon : (!C38621r6.A0f(r2) || !(r2 instanceof C39341sK) || ((C39341sK) r2).A00 == 0) ? R.drawable.date_balloon : R.drawable.business_balloon : R.drawable.security_balloon;
        } else {
            int i4 = ((C39341sK) r2).A00;
            boolean A012 = C40571uL.A01(this.A0M, r2);
            switch (i4) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    return R.drawable.message_balloon_mint;
                default:
                    return A012 ? R.drawable.message_balloon_mint : R.drawable.security_balloon;
            }
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public AnonymousClass1WU getFMessage() {
        return (AnonymousClass1WU) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public int getTextColor() {
        AnonymousClass1WU r2 = (AnonymousClass1WU) this.A0O;
        C15830rv r1 = r2.A11.A00;
        if (this.A0A.A01(r1)) {
            return (r2.A00 != 67 || !(r2 instanceof C39341sK)) ? r2 instanceof C39291sE ? R.color.color0190 : R.color.color00c4 : R.color.color0554;
        }
        if (C40571uL.A00(this.A0M, r1) || C40561uK.A01(this.A1A, r1)) {
            return R.color.color0554;
        }
        int i2 = r2.A00;
        if (i2 == 67 && (r2 instanceof C39341sK)) {
            int i3 = ((C39341sK) r2).A00;
            boolean A012 = C40571uL.A01(this.A0M, r2);
            switch (i3) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    return R.color.color0554;
                default:
                    return A012 ? R.color.color0554 : R.color.color00c5;
            }
        } else if (i2 != 69 || !(r2 instanceof C39411sR)) {
            return !A0e(r2) ? (C38621r6.A0q(r2) || C38621r6.A0e(r2)) ? R.color.color00c4 : (!C38621r6.A0f(r2) || !(r2 instanceof C39341sK) || ((C39341sK) r2).A00 == 0) ? R.color.color0190 : R.color.color00c4 : R.color.color00c5;
        } else {
            int i4 = ((C39411sR) r2).A00;
            return (i4 == 2 || i4 == 3) ? R.color.color0554 : R.color.color00c5;
        }
    }

    public void onDetachedFromWindow() {
        C78783yg r1 = this.A01;
        if (r1 != null) {
            r1.A06(true);
            this.A01 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof AnonymousClass1WU);
        this.A0O = r2;
    }
}
