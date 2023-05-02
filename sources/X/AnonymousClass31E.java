package X;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.AssemMods.translator.Language;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;
import com.obwhatsapp.payments.model.BipProcessActionViewModel;
import java.util.Set;

/* renamed from: X.31E  reason: invalid class name */
public final class AnonymousClass31E extends AnonymousClass30G implements AnonymousClass5QU, AnonymousClass2SE {
    public C18890xQ A00;
    public AnonymousClass1ME A01;
    public C16260sj A02;
    public AnonymousClass1HE A03;
    public C209212c A04;
    public AnonymousClass175 A05;
    public C228019i A06;
    public AnonymousClass174 A07;
    public C18090w8 A08;
    public C209712h A09;
    public AnonymousClass1MB A0A;
    public C218315p A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G = C004601z.A0E(this, R.id.payment_unsupported_icon);
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M = C004601z.A0E(this, R.id.text_and_date);
    public final FrameLayout A0N = C13700nu.A08(this, R.id.payment_amount_container);
    public final FrameLayout A0O;
    public final FrameLayout A0P;
    public final FrameLayout A0Q;
    public final ImageView A0R;
    public final LinearLayout A0S = ((LinearLayout) C004601z.A0E(this, R.id.main_layout));
    public final TextEmojiLabel A0T;
    public final TextEmojiLabel A0U = C13680ns.A0Q(this, R.id.payment_note);
    public final TextEmojiLabel A0V = C13680ns.A0Q(this, R.id.transaction_status);
    public final WaTextView A0W = C13680ns.A0S(this, R.id.payment_symbol);
    public final ConversationPaymentRowTransactionLayout A0X = ((ConversationPaymentRowTransactionLayout) C004601z.A0E(this, R.id.transaction_status_container));
    public final C61783Ah A0Y;
    public final BipProcessActionViewModel A0Z;

    public AnonymousClass31E(Context context, AnonymousClass1YG r16, BipProcessActionViewModel bipProcessActionViewModel, C16740tZ r18) {
        super(context, r16, r18);
        this.A0Z = bipProcessActionViewModel;
        TextEmojiLabel A0Q2 = C13680ns.A0Q(this, R.id.message_text);
        this.A0T = A0Q2;
        C30531cW.A02(A0Q2);
        C13690nt.A1C(A0Q2);
        FrameLayout A082 = C13700nu.A08(this, R.id.payment_container);
        this.A0O = A082;
        FrameLayout A083 = C13700nu.A08(this, R.id.requested_message_holder);
        this.A0Q = A083;
        this.A0E = C004601z.A0E(this, R.id.payment_shimmer);
        this.A0F = C004601z.A0E(this, R.id.payment_loading_error);
        this.A0P = C13700nu.A08(this, R.id.payment_security_strip);
        this.A0R = C13680ns.A0J(this, R.id.security_strip_image);
        this.A0C = findViewById(R.id.accept_payment_container);
        this.A0K = findViewById(R.id.send_payment_again_container);
        this.A0I = findViewById(R.id.retry_withdrawal_container);
        this.A0H = findViewById(R.id.request_actions_container);
        this.A0J = findViewById(R.id.review_and_cancel_container);
        A082.setForeground(getInnerFrameForegroundDrawable());
        A083.setForeground(getInnerFrameForegroundDrawable());
        this.A0L = C004601z.A0E(this, R.id.media_container);
        C14710pd r8 = this.A0M;
        AnonymousClass10X r4 = this.A0M;
        C16760tb r5 = this.A0R;
        AnonymousClass013 r7 = this.A0K;
        C25791Ld r13 = this.A1d;
        this.A0Y = new C61783Ah(this, r4, r5, this.A02, r7, r8, this.A03, this.A04, this.A1W, this.A1X, r13);
        this.A0D = findViewById(R.id.bip_actions_container);
        A1M();
    }

    public void A0t() {
        A1J(false);
        A1M();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0236  */
    public void A1M() {
        /*
            r29 = this;
            r8 = r29
            X.0tZ r7 = r8.getFMessage()
            com.obwhatsapp.TextEmojiLabel r12 = r8.A0T
            r6 = 0
            r5 = 0
            com.obwhatsapp.TextEmojiLabel r9 = r8.A0U
            X.C30531cW.A02(r9)
            android.view.ViewGroup r3 = r8.A04
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131165766(0x7f070246, float:1.7945758E38)
            int r4 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r8.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165764(0x7f070244, float:1.7945754E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setPadding(r4, r5, r2, r0)
            android.view.View r10 = r8.A0M
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0O(r10)
            r0.topMargin = r5
            android.view.View r1 = r8.A0L
            r4 = 8
            r1.setVisibility(r4)
            byte r2 = r7.A10
            r14 = 1
            r13 = 2
            r0 = 12
            if (r2 != r0) goto L_0x05de
            android.content.Context r2 = r8.getContext()
            X.0xQ r0 = r8.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131888417(0x7f120921, float:1.9411469E38)
            java.lang.String r0 = X.C25951Lt.A00(r2, r1, r0)
        L_0x005a:
            X.C30011bb.A0W(r9, r8, r0, r5)
            android.graphics.Typeface r0 = r9.getTypeface()
        L_0x0061:
            r9.setVisibility(r5)
        L_0x0064:
            com.obwhatsapp.WaTextView r1 = r8.A0W
            r1.setVisibility(r5)
            android.view.View r2 = r8.A0G
            r2.setVisibility(r4)
            com.obwhatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout r10 = r8.A0X
            int r11 = r9.getVisibility()
            r0 = r6
            if (r11 != r4) goto L_0x0078
            r0 = r3
        L_0x0078:
            r10.A00 = r0
            android.view.View r0 = r8.A0E
            r28 = r0
            r0.setVisibility(r4)
            android.view.View r3 = r8.A0F
            r3.setVisibility(r4)
            X.1Vt r15 = r7.A0L
            if (r15 == 0) goto L_0x00f0
            int r11 = r15.A03
            r0 = 5
            if (r11 != r0) goto L_0x00f0
            r8.A1N()
            r1.setVisibility(r4)
            r2.setVisibility(r5)
            android.content.Context r2 = r8.getContext()
            X.0xQ r0 = r8.A00
            android.net.Uri r1 = r0.A00()
            r0 = 2131890010(0x7f120f5a, float:1.94147E38)
            java.lang.String r0 = X.C25951Lt.A00(r2, r1, r0)
            X.C30011bb.A0W(r12, r8, r0, r5)
            android.graphics.Typeface r0 = r12.getTypeface()
            r12.setVisibility(r5)
        L_0x00b3:
            android.widget.LinearLayout r0 = r8.A0S
            X.C30011bb.A0K(r0, r8)
            boolean r0 = r8.A1O()
            android.widget.FrameLayout r6 = r8.A0P
            if (r0 == 0) goto L_0x0696
            r6.setVisibility(r5)
            X.1Vw r0 = r7.A11
            boolean r3 = r0.A02
            android.widget.ImageView r2 = r8.A0R
            android.content.Context r1 = r8.getContext()
            r0 = 2131101203(0x7f060613, float:1.781481E38)
            if (r3 == 0) goto L_0x00d5
            r0 = 2131101204(0x7f060614, float:1.7814811E38)
        L_0x00d5:
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setColorFilter(r0)
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r0 = 1500(0x5dc, float:2.102E-42)
            r1.setEnterFadeDuration(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setExitFadeDuration(r0)
            r1.start()
            return
        L_0x00f0:
            boolean r0 = X.AnonymousClass1W1.A08(r15)
            if (r0 == 0) goto L_0x0107
            r8.A1N()
            r12.setVisibility(r5)
            r0 = 2131890289(0x7f121071, float:1.9415266E38)
            r12.setText(r0)
            android.graphics.Typeface r0 = r12.getTypeface()
            goto L_0x00b3
        L_0x0107:
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x03c3
            X.0wS r2 = r8.A1K
            X.1Vt r0 = r7.A0L
            java.lang.String r0 = r0.A0G
            X.1Vx r2 = r2.A02(r0)
            if (r2 == 0) goto L_0x03c3
            X.1Vt r0 = r7.A0L
            java.lang.String r0 = r0.A0I
            X.19r r2 = r2.AEp(r0)
            if (r2 == 0) goto L_0x03c4
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x03c4
            X.19b r11 = r2.AB6()
            X.1GQ r16 = r2.ADT()
        L_0x0135:
            r8.setPaymentContext(r7, r12)
            X.1Vt r15 = r7.A0L
            int r0 = r15.A03
            if (r0 == r14) goto L_0x0152
            if (r0 == r13) goto L_0x0152
            r13 = 100
            if (r0 == r13) goto L_0x0152
            r13 = 200(0xc8, float:2.8E-43)
            if (r0 == r13) goto L_0x0152
            r13 = 20
            if (r0 == r13) goto L_0x0152
            r13 = 10
            r18 = 0
            if (r0 != r13) goto L_0x0154
        L_0x0152:
            r18 = 1
        L_0x0154:
            if (r2 == 0) goto L_0x03b5
            java.lang.String r20 = r2.AGh(r15)
            java.lang.String r21 = r2.AEh(r11, r7)
        L_0x015e:
            X.15p r13 = r8.A0B
            X.1Vt r0 = r7.A0L
            boolean r0 = X.AnonymousClass1W1.A08(r0)
            if (r0 == 0) goto L_0x03b1
            X.0tz r0 = r13.A05
            android.content.Context r13 = r0.A00
            r0 = 2131890289(0x7f121071, float:1.9415266E38)
            java.lang.String r22 = r13.getString(r0)
        L_0x0173:
            X.1Vt r0 = r7.A0L
            if (r2 == 0) goto L_0x03ab
            int r17 = r2.AGf(r0)
        L_0x017b:
            if (r18 == 0) goto L_0x03a4
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x03a4
            com.obwhatsapp.TextEmojiLabel r0 = r8.A0V
            r19 = r8
            r23 = r17
            r24 = r0
            r19.setPaymentStatusText(r20, r21, r22, r23, r24)
            r0.setVisibility(r5)
        L_0x0191:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x039f
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L_0x039f
            r10.setVisibility(r4)
        L_0x01a0:
            android.widget.FrameLayout r0 = r8.A0N
            r0.setVisibility(r5)
            if (r2 == 0) goto L_0x038d
            X.4Pc r13 = r2.AEP()
            X.0pd r12 = r8.A0M
            X.013 r10 = r8.A0K
            X.12h r0 = r8.A09
            X.5Si r10 = r2.AEQ(r10, r12, r0, r13)
        L_0x01b5:
            r0 = 2131365046(0x7f0a0cb6, float:1.8349946E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0381
            X.C811947f.A00(r0, r10)
        L_0x01c3:
            X.1Vt r0 = r7.A0L
            r10.A5O(r0)
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x037e
            if (r2 == 0) goto L_0x037e
            X.19a r13 = r2.AB3()
        L_0x01d6:
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0375
            X.1Vt r14 = r7.A0L
            int r12 = r14.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r12 != r0) goto L_0x0375
            android.view.View r12 = r8.A0C
            if (r12 == 0) goto L_0x0375
            if (r13 == 0) goto L_0x036b
            X.1W2 r0 = r14.A0A
            boolean r0 = r13.Af9(r0)
            if (r0 == 0) goto L_0x0375
        L_0x01f4:
            r0 = 2131361824(0x7f0a0020, float:1.8343411E38)
            android.view.View r13 = r8.findViewById(r0)
            int r0 = r9.getVisibility()
            r13.setVisibility(r0)
            r0 = 2131361821(0x7f0a001d, float:1.8343405E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r12, r0)
            X.AnonymousClass1UP.A06(r0)
            r12.setVisibility(r5)
            r0 = 11
            X.C13690nt.A1B(r12, r8, r2, r7, r0)
        L_0x0214:
            android.view.View r13 = r8.A0I
            if (r13 == 0) goto L_0x0232
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0366
            if (r2 == 0) goto L_0x0366
            X.1Vt r0 = r7.A0L
            int r12 = r0.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r12 != r0) goto L_0x0366
            r13.setVisibility(r5)
            r0 = 12
            X.C13690nt.A1B(r13, r8, r2, r7, r0)
        L_0x0232:
            android.view.View r12 = r8.A0K
            if (r12 == 0) goto L_0x026e
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0361
            X.15p r14 = r8.A0B
            X.1Vt r13 = r7.A0L
            r0 = r16
            boolean r0 = r14.A0c(r13, r11, r0, r5)
            if (r0 == 0) goto L_0x0361
            r0 = 2131366101(0x7f0a10d5, float:1.8352086E38)
            android.view.View r11 = r8.findViewById(r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r11 = 2131366099(0x7f0a10d3, float:1.8352082E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r12, r11)
            X.AnonymousClass1UP.A06(r0)
            r12.setVisibility(r5)
            android.view.View r11 = r8.findViewById(r11)
            r0 = 49
            X.C13680ns.A1B(r11, r8, r7, r0)
        L_0x026e:
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0358
            X.15p r11 = r8.A0B
            X.1Vt r0 = r7.A0L
            boolean r0 = r11.A0b(r0)
            if (r0 == 0) goto L_0x0358
            android.view.View r12 = r8.A0J
            if (r12 == 0) goto L_0x0358
            X.0w8 r0 = r8.A08
            X.0pd r13 = r0.A03
            r11 = 1905(0x771, float:2.67E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r13.A0E(r0, r11)
            if (r0 == 0) goto L_0x0358
            X.1cm r11 = X.C30681cm.A0D
            X.174 r0 = r8.A07
            X.1cm r0 = r0.A01()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0358
            r0 = 2131365841(0x7f0a0fd1, float:1.8351559E38)
            android.view.View r11 = r8.findViewById(r0)
            int r0 = r9.getVisibility()
            r11.setVisibility(r0)
            r11 = 2131365839(0x7f0a0fcf, float:1.8351555E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r12, r11)
            X.AnonymousClass1UP.A06(r0)
            r12.setVisibility(r5)
            android.view.View r11 = r8.findViewById(r11)
            r0 = 13
            X.C13690nt.A1B(r11, r8, r2, r7, r0)
        L_0x02c4:
            android.view.View r11 = r8.A0H
            if (r11 == 0) goto L_0x0330
            X.1Vt r0 = r7.A0L
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0354
            X.0sK r12 = r8.A0L
            X.1Vt r0 = r7.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r12.A0I(r0)
            if (r0 == 0) goto L_0x0354
            int r0 = r9.getVisibility()
            boolean r14 = X.AnonymousClass000.A1P(r0)
            r0 = 2131365758(0x7f0a0f7e, float:1.835139E38)
            android.view.View r12 = r8.findViewById(r0)
            int r0 = X.C13690nt.A07(r14)
            r12.setVisibility(r0)
            r0 = 2131362469(0x7f0a02a5, float:1.834472E38)
            android.view.View r12 = r8.findViewById(r0)
            android.content.res.Resources r13 = r8.getResources()
            if (r14 == 0) goto L_0x0349
            r0 = 2131100123(0x7f0601db, float:1.7812619E38)
            int r0 = r13.getColor(r0)
            r12.setBackgroundColor(r0)
        L_0x0309:
            X.1Vw r13 = r7.A11
            X.0rv r12 = r13.A00
            if (r12 == 0) goto L_0x0313
            X.1Vt r0 = r7.A0L
            r0.A0C = r12
        L_0x0313:
            X.1Vt r12 = r7.A0L
            java.lang.String r0 = r13.A01
            r12.A0L = r0
            X.19i r0 = r8.A06
            java.lang.String r26 = "chat"
            r23 = r6
            r27 = 0
            r19 = r0
            r20 = r11
            r21 = r6
            r22 = r12
            r24 = r8
            r25 = r7
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0330:
            android.view.View r12 = r8.A0D
            if (r12 == 0) goto L_0x0438
            com.obwhatsapp.payments.model.BipProcessActionViewModel r11 = r8.A0Z
            if (r11 == 0) goto L_0x0438
            X.1Vt r0 = r7.A0L
            if (r0 == 0) goto L_0x05d9
            X.0w8 r0 = r8.A08
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x05d9
            X.1Vt r14 = r7.A0L
            monitor-enter(r14)
            goto L_0x03c9
        L_0x0349:
            r0 = 2131232285(0x7f08061d, float:1.8080675E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            r12.setBackground(r0)
            goto L_0x0309
        L_0x0354:
            r11.setVisibility(r4)
            goto L_0x0330
        L_0x0358:
            android.view.View r0 = r8.A0J
            if (r0 == 0) goto L_0x02c4
            r0.setVisibility(r4)
            goto L_0x02c4
        L_0x0361:
            r12.setVisibility(r4)
            goto L_0x026e
        L_0x0366:
            r13.setVisibility(r4)
            goto L_0x0232
        L_0x036b:
            X.175 r0 = r8.A05
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0375
            goto L_0x01f4
        L_0x0375:
            android.view.View r0 = r8.A0C
            if (r0 == 0) goto L_0x0214
            r0.setVisibility(r4)
            goto L_0x0214
        L_0x037e:
            r13 = r6
            goto L_0x01d6
        L_0x0381:
            r0 = 2131365045(0x7f0a0cb5, float:1.8349944E38)
            android.view.View r0 = r8.findViewById(r0)
            r10.AZf(r0)
            goto L_0x01c3
        L_0x038d:
            X.4Pc r14 = new X.4Pc
            r14.<init>()
            X.0pd r13 = r8.A0M
            X.013 r12 = r8.A0K
            X.12h r0 = r8.A09
            X.3H8 r10 = new X.3H8
            r10.<init>(r12, r13, r0, r14)
            goto L_0x01b5
        L_0x039f:
            r10.setVisibility(r5)
            goto L_0x01a0
        L_0x03a4:
            com.obwhatsapp.TextEmojiLabel r0 = r8.A0V
            r0.setVisibility(r4)
            goto L_0x0191
        L_0x03ab:
            int r17 = X.C218315p.A01(r0)
            goto L_0x017b
        L_0x03b1:
            java.lang.String r22 = ""
            goto L_0x0173
        L_0x03b5:
            X.15p r0 = r8.A0B
            java.lang.String r20 = r0.A0K(r15)
            X.15p r0 = r8.A0B
            java.lang.String r21 = r0.A0U(r11, r7)
            goto L_0x015e
        L_0x03c3:
            r2 = r6
        L_0x03c4:
            r11 = r6
            r16 = r6
            goto L_0x0135
        L_0x03c9:
            boolean r0 = r14.A0E()     // Catch:{ all -> 0x069a }
            r13 = 1
            if (r0 != 0) goto L_0x03d5
            int r0 = r14.A00     // Catch:{ all -> 0x069a }
            if (r0 != r13) goto L_0x03d5
            goto L_0x03d6
        L_0x03d5:
            r13 = 0
        L_0x03d6:
            monitor-exit(r14)
            if (r13 == 0) goto L_0x05d9
            X.0sK r13 = r8.A0L
            X.1Vt r0 = r7.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r13.A0I(r0)
            if (r0 != 0) goto L_0x05d9
            X.1Vt r0 = r7.A0L
            int r13 = r0.A02
            r0 = 113(0x71, float:1.58E-43)
            if (r13 != r0) goto L_0x05d9
            r0 = 2131362204(0x7f0a019c, float:1.8344182E38)
            android.view.View r14 = X.C004601z.A0E(r12, r0)
            r0 = 2131362200(0x7f0a0198, float:1.8344174E38)
            android.view.View r13 = X.C004601z.A0E(r12, r0)
            int r0 = r9.getVisibility()
            boolean r16 = X.AnonymousClass000.A1P(r0)
            r0 = 2131362202(0x7f0a019a, float:1.8344178E38)
            android.view.View r9 = r8.findViewById(r0)
            int r0 = X.C13690nt.A07(r16)
            r9.setVisibility(r0)
            r0 = 2131362203(0x7f0a019b, float:1.834418E38)
            android.view.View r9 = r8.findViewById(r0)
            android.content.res.Resources r15 = r8.getResources()
            if (r16 == 0) goto L_0x05cd
            r0 = 2131100123(0x7f0601db, float:1.7812619E38)
            int r0 = r15.getColor(r0)
            r9.setBackgroundColor(r0)
        L_0x0428:
            r0 = 1
            X.C13680ns.A1C(r13, r8, r7, r0)
            X.C13680ns.A1C(r14, r8, r7, r5)
            X.1Vt r13 = r7.A0L
            X.0sq r9 = r11.A05
            r0 = 37
            X.C13700nu.A0X(r9, r11, r13, r12, r0)
        L_0x0438:
            if (r18 == 0) goto L_0x05ad
            android.widget.LinearLayout r12 = r8.A0S
            r0 = 14
            X.C13690nt.A1B(r12, r8, r7, r2, r0)
        L_0x0441:
            android.content.Context r9 = r8.getContext()
            X.1Vt r0 = r7.A0L
            java.lang.CharSequence r11 = X.C218315p.A06(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0527
            r1.setVisibility(r4)
        L_0x0454:
            X.1Vt r0 = r7.A0L
            java.lang.String r0 = r0.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0521
            X.0wS r0 = r8.A1K
            r0.A06()
            X.16r r1 = r0.A08
            X.1Vt r0 = r7.A0L
            java.lang.String r0 = r0.A0M
            X.1Vt r11 = r1.A0M(r0, r6)
            if (r11 == 0) goto L_0x0521
            int r1 = r11.A02
            r0 = 18
            if (r1 == r0) goto L_0x0521
            r0 = 2131365787(0x7f0a0f9b, float:1.835145E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r8, r0)
            r8.setRequestPaymentText(r11, r0)
            r0 = 2131365791(0x7f0a0f9f, float:1.8351457E38)
            android.view.View r16 = X.C004601z.A0E(r8, r0)
            r0 = 2131365790(0x7f0a0f9e, float:1.8351455E38)
            android.widget.TextView r14 = X.C13680ns.A0L(r8, r0)
            android.content.Context r9 = r8.getContext()
            X.013 r0 = r8.A0K
            r13 = r0
            X.1Vt r1 = r7.A0L
            X.1Vy r0 = r1.A08
            r17 = r0
            X.1Vz r1 = r1.A00()
            r0 = 1
            r15 = r9
            r9 = r17
            android.text.SpannableStringBuilder r13 = X.C218315p.A04(r15, r13, r1, r9, r0)
            boolean r0 = r8.A1O()
            if (r0 == 0) goto L_0x0515
            X.1lo r9 = r11.A01()
            if (r9 == 0) goto L_0x0515
            r0 = 2131365793(0x7f0a0fa1, float:1.8351461E38)
            android.widget.TextView r1 = X.C13680ns.A0L(r8, r0)
            r14.setVisibility(r4)
            r0 = r16
            r0.setVisibility(r5)
            r1.setText(r13)
            X.12h r13 = r8.A09
            r0 = 2131365792(0x7f0a0fa0, float:1.835146E38)
            android.widget.ImageView r0 = X.C13680ns.A0J(r8, r0)
            r13.A00(r0, r1, r9)
        L_0x04d0:
            android.widget.FrameLayout r1 = r8.A0Q
            r1.setVisibility(r5)
            r0 = 47
            X.C13680ns.A1B(r1, r8, r11, r0)
        L_0x04da:
            X.1Vt r11 = r7.A0L
            int r1 = r11.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x00b3
            X.1MB r9 = r8.A0A
            java.lang.String r1 = r11.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x050c
            java.util.HashSet r0 = r9.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x050c
            r0 = r28
            r0.setVisibility(r4)
            r3.setVisibility(r5)
        L_0x04fc:
            r10.A5O(r6)
            r0 = 2131362981(0x7f0a04a5, float:1.8345758E38)
            X.C13690nt.A13(r8, r0, r4)
            r0 = 15
            X.C13690nt.A1B(r12, r8, r7, r2, r0)
            goto L_0x00b3
        L_0x050c:
            r0 = r28
            r0.setVisibility(r5)
            r3.setVisibility(r4)
            goto L_0x04fc
        L_0x0515:
            r14.setVisibility(r5)
            r14.setText(r13)
            r0 = r16
            r0.setVisibility(r4)
            goto L_0x04d0
        L_0x0521:
            android.widget.FrameLayout r0 = r8.A0Q
            r0.setVisibility(r4)
            goto L_0x04da
        L_0x0527:
            android.content.res.Resources r9 = r8.getResources()
            r0 = r17
            X.C13690nt.A0w(r9, r1, r0)
            r1.setText(r11)
            android.view.ViewParent r14 = r1.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            X.0Wj r13 = new X.0Wj
            r13.<init>()
            r13.A06(r14)
            int r0 = r1.getId()
            java.util.HashMap r11 = r13.A00
            if (r18 == 0) goto L_0x0591
            java.lang.Integer r0 = X.C13680ns.A0b(r11, r0)
            java.lang.Object r0 = r11.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            r9 = -1
            X.0Uh r0 = r0.A02
            r0.A0m = r5
            r0.A0l = r9
            r0.A08 = r9
            int r0 = r1.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r11, r0)
            java.lang.Object r0 = r11.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0A = r5
            r0.A0B = r9
            r0.A08 = r9
        L_0x0572:
            int r0 = r1.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r11, r0)
            java.lang.Object r0 = r11.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            r1 = -1
            X.0Uh r0 = r0.A02
            r0.A0j = r5
            r0.A0i = r1
            r13.A05(r14)
            r14.A0B = r6
            r14.requestLayout()
            goto L_0x0454
        L_0x0591:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r11.containsKey(r9)
            if (r0 == 0) goto L_0x0572
            java.lang.Object r0 = r11.get(r9)
            X.053 r0 = (X.AnonymousClass053) r0
            r9 = -1
            X.0Uh r0 = r0.A02
            r0.A0B = r9
            r0.A0A = r9
            r0.A09 = r9
            r0.A0J = r9
            goto L_0x0572
        L_0x05ad:
            boolean r0 = r8.A1O()
            if (r0 == 0) goto L_0x05c6
            X.1Vt r0 = r7.A0L
            if (r0 == 0) goto L_0x05c6
            X.1lo r0 = r0.A01()
            if (r0 == 0) goto L_0x05c6
            android.widget.LinearLayout r12 = r8.A0S
            r0 = 48
            X.C13680ns.A1B(r12, r8, r7, r0)
            goto L_0x0441
        L_0x05c6:
            android.widget.LinearLayout r12 = r8.A0S
            r12.setOnClickListener(r6)
            goto L_0x0441
        L_0x05cd:
            r0 = 2131232285(0x7f08061d, float:1.8080675E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00X.A04(r6, r15, r0)
            r9.setBackground(r0)
            goto L_0x0428
        L_0x05d9:
            r12.setVisibility(r4)
            goto L_0x0438
        L_0x05de:
            boolean r0 = X.C41061vA.A0I(r7)
            if (r0 == 0) goto L_0x0606
            r0 = 11
            X.0uj r1 = r8.A1Z
            if (r2 != r0) goto L_0x0603
            java.lang.String r0 = "26000015"
        L_0x05ec:
            android.net.Uri r0 = r1.A04(r0)
            java.lang.String r10 = r0.toString()
            android.content.Context r2 = r8.getContext()
            r1 = 2131890064(0x7f120f90, float:1.941481E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r0 = X.C13680ns.A0d(r2, r10, r0, r5, r1)
            goto L_0x005a
        L_0x0603:
            java.lang.String r0 = "26000255"
            goto L_0x05ec
        L_0x0606:
            X.0pd r2 = r8.A0M
            r0 = 812(0x32c, float:1.138E-42)
            X.0tM r11 = X.C16620tM.A02
            boolean r0 = r2.A0E(r11, r0)
            if (r0 != 0) goto L_0x061c
            X.0pd r2 = r8.A0M
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r2.A0E(r11, r0)
            if (r0 == 0) goto L_0x0646
        L_0x061c:
            boolean r0 = r7 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0646
            r2 = r7
            X.1rB r2 = (X.C38641rB) r2
            r1.setVisibility(r5)
            X.3Ah r1 = r8.A0Y
            r1.A03(r2, r5)
            boolean r0 = X.C38621r6.A10(r2)
            if (r0 == 0) goto L_0x0636
            r1.A01()
            goto L_0x0064
        L_0x0636:
            boolean r0 = X.C38621r6.A11(r2)
            if (r0 == 0) goto L_0x0641
            r1.A02()
            goto L_0x0064
        L_0x0641:
            r1.A00()
            goto L_0x0064
        L_0x0646:
            java.lang.String r0 = r7.A0I()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 != 0) goto L_0x0659
            java.lang.String r0 = r7.A0I()
            r8.setMessageText(r0, r9, r7)
            goto L_0x0061
        L_0x0659:
            r9.setVisibility(r4)
            X.1Vt r0 = r7.A0L
            boolean r0 = X.AnonymousClass1W1.A08(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.Resources r0 = r8.getResources()
            r2 = 2131166680(0x7f0705d8, float:1.7947612E38)
            int r1 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            r3.setPadding(r1, r5, r0, r5)
            X.C13680ns.A12(r3)
            android.view.ViewGroup$MarginLayoutParams r10 = X.AnonymousClass000.A0O(r10)
            int r0 = r3.getMeasuredHeight()
            int r2 = -r0
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166679(0x7f0705d7, float:1.794761E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            r10.topMargin = r2
            goto L_0x0064
        L_0x0696:
            r6.setVisibility(r4)
            return
        L_0x069a:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31E.A1M():void");
    }

    public final void A1N() {
        this.A0N.setVisibility(8);
        View view = this.A0C;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A0I;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A0K;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.A0S.setOnClickListener((View.OnClickListener) null);
        this.A0V.setVisibility(8);
        this.A0Q.setVisibility(8);
        View view4 = this.A0H;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public final boolean A1O() {
        C14710pd r1 = this.A0M;
        C16620tM r2 = C16620tM.A02;
        return r1.A0E(r2, 605) || this.A0M.A0E(r2, 629);
    }

    public void AUd() {
        A0t();
    }

    public void Ag4() {
        C14710pd r1 = this.A0M;
        C16620tM r2 = C16620tM.A02;
        if (r1.A0E(r2, 812) || this.A0M.A0E(r2, 811)) {
            this.A0Y.A0F.A04();
        }
    }

    public int getBubbleAlpha() {
        return MotionEventCompat.ACTION_MASK;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01b8;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01b8;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A0O);
        innerFrameLayouts.add(this.A0Q);
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        return ((int) getResources().getDimension(R.dimen.dimen05d5)) + (((int) getResources().getDimension(R.dimen.dimen05d9)) << 1);
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01bb;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(AnonymousClass000.A1V(r2.A0L));
        this.A0O = r2;
    }

    public final void setPaymentContext(C16740tZ r9, TextEmojiLabel textEmojiLabel) {
        Pair pair;
        AnonymousClass1Vt r2;
        Context context;
        int i2;
        String A0d;
        Context context2;
        int i3;
        C218315p r1 = this.A0B;
        if (r9.A11.A00 == null || (r2 = r9.A0L) == null) {
            pair = new Pair("", "");
        } else {
            boolean A0E2 = r2.A0E();
            String str = "";
            C16040sK r7 = r1.A00;
            if (A0E2) {
                if (!r7.A0I(r2.A0E) || Language.ENGLISH.equals(r1.A06.A06())) {
                    str = r1.A0O(r2);
                    context = r1.A05.A00;
                    i2 = R.string.str10a7;
                    A0d = C13680ns.A0d(context, str, new Object[1], 0, i2);
                    pair = C13690nt.A0I(str, A0d);
                } else {
                    context2 = r1.A05.A00;
                    i3 = R.string.str10a8;
                }
            } else if (!r7.A0I(r2.A0D) || Language.ENGLISH.equals(r1.A06.A06())) {
                str = r1.A0N(r2);
                context = r1.A05.A00;
                i2 = R.string.str1119;
                A0d = C13680ns.A0d(context, str, new Object[1], 0, i2);
                pair = C13690nt.A0I(str, A0d);
            } else {
                context2 = r1.A05.A00;
                i3 = R.string.str111d;
            }
            A0d = context2.getString(i3);
            pair = C13690nt.A0I(str, A0d);
        }
        String str2 = (String) pair.second;
        if (!TextUtils.isEmpty(str2)) {
            String str3 = (String) pair.first;
            SpannableStringBuilder A0F2 = C13690nt.A0F(str2);
            if (!TextUtils.isEmpty(str3)) {
                AnonymousClass3MR r22 = new AnonymousClass3MR(getContext());
                int length = str2.length();
                A0F2.setSpan(r22, length - str3.length(), length, 0);
                textEmojiLabel.setText(A0F2, TextView.BufferType.SPANNABLE);
            } else {
                textEmojiLabel.setText(A0F2);
            }
            textEmojiLabel.setVisibility(0);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    public final void setPaymentStatusText(String str, String str2, String str3, int i2, TextEmojiLabel textEmojiLabel) {
        String str4;
        if (!TextUtils.isEmpty(str2)) {
            Context context = getContext();
            Object[] objArr = new Object[2];
            objArr[0] = str;
            str4 = C13680ns.A0d(context, str2, objArr, 1, R.string.str107d);
        } else {
            str4 = str;
        }
        if (!TextUtils.isEmpty(str3)) {
            Context context2 = getContext();
            Object[] objArr2 = new Object[2];
            objArr2[0] = str4;
            str4 = C13680ns.A0d(context2, str3, objArr2, 1, R.string.str107c);
        }
        int indexOf = str4.indexOf(str);
        int length = str.length() + indexOf;
        SpannableStringBuilder A0F2 = C13690nt.A0F(str4);
        A0F2.setSpan(new ForegroundColorSpan(getResources().getColor(i2)), indexOf, length, 0);
        A0F2.setSpan(new AnonymousClass3MR(getContext()), indexOf, length, 0);
        textEmojiLabel.setText(A0F2, TextView.BufferType.SPANNABLE);
    }

    public final void setRequestPaymentText(AnonymousClass1Vt r5, TextView textView) {
        Pair A0D2 = this.A0B.A0D(r5);
        String str = (String) A0D2.first;
        SpannableStringBuilder A0F2 = C13690nt.A0F((String) A0D2.second);
        if (!TextUtils.isEmpty(str)) {
            A0F2.setSpan(new AnonymousClass3MR(getContext()), 0, str.length(), 0);
            textView.setText(A0F2, TextView.BufferType.SPANNABLE);
            return;
        }
        textView.setText(A0F2);
    }
}
