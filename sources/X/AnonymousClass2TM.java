package X;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import com.facebook.redex.IDxIListenerShape108S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2TM  reason: invalid class name */
public class AnonymousClass2TM extends C30011bb {
    public AnonymousClass2TN A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final TextEmojiLabel A07;
    public final WaTextView A08;
    public final AnonymousClass2Ao A09;
    public final C33741j5 A0A;
    public final List A0B = new ArrayList();
    public final boolean A0C;

    public AnonymousClass2TM(Context context, AnonymousClass2Ao r10, AnonymousClass1YG r11, C39171s2 r12) {
        super(context, r11, r12);
        A0g();
        this.A09 = r10;
        LinearLayout linearLayout = (LinearLayout) C004601z.A0E(this, R.id.polls_main_layout);
        this.A05 = linearLayout;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(this, R.id.poll_name);
        this.A07 = textEmojiLabel;
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        this.A06 = (LinearLayout) C004601z.A0E(this, R.id.poll_options);
        C33741j5 r1 = new C33741j5(C004601z.A0E(this, R.id.invalid_poll_text));
        this.A0A = r1;
        r1.A05(new IDxIListenerShape108S0200000_2_I0(this, 1, r12));
        WaTextView waTextView = (WaTextView) C004601z.A0E(this, R.id.view_details);
        this.A08 = waTextView;
        waTextView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 26, context));
        C14710pd r13 = this.A0M;
        C16620tM r2 = C16620tM.A02;
        waTextView.setVisibility(r13.A0E(r2, 1948) ? 0 : 8);
        textEmojiLabel.setOnLongClickListener(this.A1n);
        boolean A0E = this.A0M.A0E(r2, 2390);
        this.A0C = A0E;
        AnonymousClass2JP.A02(waTextView);
        if (Build.VERSION.SDK_INT >= 20) {
            if (!A0E) {
                setEnabledForAccessibility(false);
                this.A03 = false;
            } else if (((AccessibilityManager) linearLayout.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                this.A03 = true;
                AnonymousClass2JP.A03(linearLayout, R.string.str003a);
                setEnabledForAccessibility(false);
                linearLayout.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 35));
            }
        }
        A0d(false);
    }

    public static /* synthetic */ void A0c(AnonymousClass2TM r2) {
        if (((AccessibilityManager) r2.A05.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            boolean z2 = true;
            if (r2.A02) {
                z2 = false;
            }
            r2.A02 = z2;
            r2.setEnabledForAccessibility(z2);
        }
    }

    private void A0d(boolean z2) {
        C39171s2 r3 = (C39171s2) getFMessage();
        String str = r3.A03;
        if (str != null) {
            setMessageText(str, this.A07, r3);
        }
        RunnableRunnableShape0S0210000_I0 runnableRunnableShape0S0210000_I0 = new RunnableRunnableShape0S0210000_I0(this, r3, 5, z2);
        this.A06.setTag(r3.A11);
        if (!AnonymousClass1RU.A00(r3, (byte) 67)) {
            runnableRunnableShape0S0210000_I0.run();
        } else {
            this.A1S.A02(r3, runnableRunnableShape0S0210000_I0, (byte) 67);
        }
    }

    private void setEnabledForAccessibility(boolean z2) {
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView;
        int i2;
        LinearLayout linearLayout = this.A06;
        if (z2) {
            i2 = 1;
            linearLayout.setImportantForAccessibility(1);
            conversationRowParticipantHeaderMainView = this.A0l;
            if (conversationRowParticipantHeaderMainView == null) {
                return;
            }
        } else {
            linearLayout.setImportantForAccessibility(4);
            conversationRowParticipantHeaderMainView = this.A0l;
            if (conversationRowParticipantHeaderMainView != null) {
                i2 = 2;
            } else {
                return;
            }
        }
        conversationRowParticipantHeaderMainView.setImportantForAccessibility(i2);
    }

    public void A0g() {
        if (!this.A04) {
            this.A04 = true;
            C52652eD r1 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r2 = r1.A07;
            this.A0M = (C14710pd) r2.A05.get();
            this.A0P = (AnonymousClass1PD) r2.AEP.get();
            this.A0F = (C16300so) r2.A5p.get();
            this.A0N = (AnonymousClass1P7) r2.ADc.get();
            this.A0J = (AnonymousClass01V) r2.AOi.get();
            this.A0K = (AnonymousClass013) r2.AR8.get();
            this.A0Q = C16150sX.A19(r2);
            this.A0L = (C26101Mi) r2.AQU.get();
            this.A0G = (AnonymousClass1L8) r2.A5W.get();
            this.A0r = (C16440t3) r2.AP2.get();
            this.A0J = (C14870pt) r2.AB3.get();
            this.A1D = (C19990zK) r2.AEZ.get();
            this.A1c = (C17110uY) r2.ADT.get();
            this.A1e = (C16320sq) r2.ARB.get();
            this.A0L = (C16040sK) r2.ADr.get();
            this.A0p = (C25801Le) r2.AFa.get();
            this.A0M = (AnonymousClass10X) r2.ALc.get();
            this.A0O = (C17130ua) r2.AN9.get();
            this.A0u = (C15810rt) r2.A43.get();
            this.A19 = (C17250um) r2.A7e.get();
            this.A0N = (C15900s5) r2.ALm.get();
            this.A1a = (C216014s) r2.AMr.get();
            this.A14 = (AnonymousClass11G) r2.ANN.get();
            this.A0R = (C16760tb) r2.APV.get();
            this.A0W = (C204310c) r2.A3O.get();
            C49132Rg r3 = r1.A05;
            this.A1A = r3.A0I();
            this.A0K = (C17090uW) r2.ADM.get();
            this.A1R = (C211613a) r2.A1E.get();
            this.A1C = (C18210wK) r2.AE4.get();
            this.A0I = (C19980zJ) r2.A0P.get();
            this.A0e = (C17200uh) r2.A52.get();
            this.A11 = (C18550ws) r2.ADB.get();
            this.A1F = (C17190ug) r2.AEu.get();
            this.A0a = (C16000sG) r2.A4x.get();
            this.A0U = (C25821Lg) r2.AMI.get();
            this.A0d = (C16080sP) r2.AQ9.get();
            this.A1Z = (C17220uj) r2.A9x.get();
            this.A1T = (C26721Ow) r2.A7o.get();
            this.A12 = (C26081Mg) r2.AIY.get();
            this.A0f = (C23181Au) r2.A53.get();
            this.A0g = (C25831Lh) r2.A5Q.get();
            this.A0w = (C16460t6) r2.A5k.get();
            this.A0V = (AnonymousClass01Y) r2.A1w.get();
            this.A1B = (C17240ul) r2.ABK.get();
            this.A1E = (C222717h) r2.AC3.get();
            this.A1V = new C25781Lc();
            this.A1P = (C27121Qn) r2.A1H.get();
            this.A10 = (AnonymousClass10B) r2.AD5.get();
            this.A1U = r2.A1d();
            this.A1d = (C25791Ld) r2.AFY.get();
            this.A1I = (C26701Ou) r2.AGb.get();
            this.A1S = (AnonymousClass1RU) r2.AEd.get();
            this.A15 = (AnonymousClass119) r2.APO.get();
            this.A0S = (C18640x1) r2.A3X.get();
            this.A16 = (AnonymousClass15G) r2.AEe.get();
            this.A17 = (C16500tA) r2.AMF.get();
            this.A1b = (AnonymousClass135) r2.AP7.get();
            this.A0c = (C17030uP) r2.APp.get();
            this.A0t = (C15860rz) r2.AQh.get();
            this.A0Y = (C17230uk) r2.A4I.get();
            this.A0x = (C27531Sc) r2.A7X.get();
            this.A1H = r2.A1Y();
            this.A1O = (C26141Mm) r2.A10.get();
            this.A0T = (C17170ue) r2.A3W.get();
            this.A1W = (AnonymousClass1MF) r2.ANa.get();
            this.A1J = (C227919h) r2.AH8.get();
            this.A0b = C16150sX.A0O(r2);
            this.A0z = (C16070sO) r2.ABY.get();
            this.A0h = (AnonymousClass2a9) r3.A0F.get();
            this.A13 = (AnonymousClass186) r2.AJI.get();
            this.A1N = (C17020u3) r2.AMG.get();
            this.A1X = (C50772aQ) r3.A02.get();
            this.A0Z = (C18260wP) r2.A4p.get();
            this.A1Q = r3.A0c();
            this.A0v = (C216114t) r2.A5O.get();
            this.A0y = (AnonymousClass188) r2.A8P.get();
            this.A0j = (AnonymousClass1LA) r2.AIg.get();
            this.A1Y = (C27651Sp) r2.ANj.get();
            this.A1G = (AnonymousClass1L9) r2.AFI.get();
            this.A0X = (AnonymousClass1SN) r2.AD0.get();
            this.A0i = (AnonymousClass1MY) r2.AIf.get();
            this.A0s = (C17120uZ) r2.AQT.get();
            this.A0q = C16150sX.A0S(r2);
            this.A1L = (AnonymousClass1DY) r2.A3w.get();
            this.A0n = r1.A02();
            this.A1K = (C18290wS) r2.AIB.get();
            this.A18 = (C18030w2) r2.A6W.get();
            this.A00 = (AnonymousClass2TN) r1.A03.get();
        }
    }

    public void A0t() {
        A1J(false);
        A0d(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r2 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(X.C16740tZ r6, boolean r7) {
        /*
            r5 = this;
            X.0tZ r0 = r5.getFMessage()
            r4 = 1
            r3 = 0
            r2 = 0
            if (r6 == r0) goto L_0x001c
            r2 = 1
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x001c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 20
            if (r1 < r0) goto L_0x001c
            r5.A02 = r3
            android.widget.LinearLayout r1 = r5.A06
            r0 = 4
            r1.setImportantForAccessibility(r0)
        L_0x001c:
            super.A1G(r6, r7)
            if (r7 != 0) goto L_0x0028
            if (r2 == 0) goto L_0x0027
        L_0x0023:
            r4 = 0
        L_0x0024:
            r5.A0d(r4)
        L_0x0027:
            return
        L_0x0028:
            if (r2 != 0) goto L_0x0023
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TM.A1G(X.0tZ, boolean):void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01bd;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01bd;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01be;
    }

    public List getPollVoteSelectedOptionIds() {
        return this.A01;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C39171s2);
        this.A0O = r2;
    }
}
