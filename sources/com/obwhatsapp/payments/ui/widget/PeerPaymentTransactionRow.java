package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass1MB;
import X.AnonymousClass1Vt;
import X.AnonymousClass1yN;
import X.AnonymousClass2Ao;
import X.AnonymousClass2SE;
import X.AnonymousClass2SR;
import X.AnonymousClass69G;
import X.C004601z;
import X.C110115dX;
import X.C110485eE;
import X.C13680ns;
import X.C14710pd;
import X.C16000sG;
import X.C16080sP;
import X.C16460t6;
import X.C16740tZ;
import X.C17160ud;
import X.C17200uh;
import X.C18090w8;
import X.C18290wS;
import X.C19990zK;
import X.C218315p;
import X.C228019i;
import X.C30581cc;
import X.C38641rB;
import X.C45902Bo;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;

public class PeerPaymentTransactionRow extends C110485eE implements AnonymousClass69G {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextEmojiLabel A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public TextEmojiLabel A0E;
    public WaImageView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public Button A0I;
    public C17160ud A0J;
    public C16000sG A0K;
    public C16080sP A0L;
    public AnonymousClass2Ao A0M;
    public C17200uh A0N;
    public AnonymousClass013 A0O;
    public C16460t6 A0P;
    public AnonymousClass1Vt A0Q;
    public C14710pd A0R;
    public C19990zK A0S;
    public AnonymousClass2SE A0T;
    public C228019i A0U;
    public C18090w8 A0V;
    public C18290wS A0W;
    public AnonymousClass1MB A0X;
    public C218315p A0Y;
    public String A0Z;

    public PeerPaymentTransactionRow(Context context) {
        super(context);
        A01();
    }

    public PeerPaymentTransactionRow(Context context, AnonymousClass2SE r3, int i2) {
        this(context);
        this.A0T = r3;
        this.A0Z = i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "mandate_payment_screen" : "payment_transaction_history" : "payment_home";
        this.A00 = i2;
    }

    public PeerPaymentTransactionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public PeerPaymentTransactionRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public void A01() {
        C13680ns.A0G(this).inflate(R.layout.layout047e, this, true);
        setOrientation(1);
        setBackground(AnonymousClass00T.A04(getContext(), R.drawable.selector_orange_gradient));
        this.A06 = C13680ns.A0K(this, R.id.transaction_icon);
        this.A0D = (TextEmojiLabel) findViewById(R.id.transaction_receiver);
        this.A02 = findViewById(R.id.payment_note_container);
        this.A05 = C13680ns.A0K(this, R.id.message_type_indicator);
        this.A0C = (TextEmojiLabel) findViewById(R.id.transaction_note);
        this.A0B = (TextEmojiLabel) findViewById(R.id.transaction_amount);
        this.A0A = C13680ns.A0M(this, R.id.transaction_status);
        this.A03 = findViewById(R.id.transaction_shimmer);
        this.A07 = C13680ns.A0K(this, R.id.type_icon);
        this.A0H = (WaTextView) findViewById(R.id.requested_from_note);
        this.A01 = findViewById(R.id.action_buttons_container);
        this.A08 = (LinearLayout) findViewById(R.id.transaction_row_details);
        this.A0F = (WaImageView) findViewById(R.id.transaction_loading_error);
        this.A04 = (FrameLayout) findViewById(R.id.custom_country_view_container);
        this.A09 = (LinearLayout) findViewById(R.id.transaction_row_not_supported);
        this.A0E = (TextEmojiLabel) findViewById(R.id.transaction_receiver_not_supported);
        this.A0G = (WaTextView) findViewById(R.id.transaction_not_supported_description);
        this.A0M = this.A0N.A03(getContext(), "peer-payment-transaction-row");
        C45902Bo.A04(this.A0C);
        AnonymousClass2SR.A07(getContext(), this.A0F, R.color.color05fc);
        setOnClickListener(C110115dX.A06(this, 143));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r1 != 200) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x025a  */
    /* renamed from: A02 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5U(X.AnonymousClass1Vt r12) {
        /*
            r11 = this;
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x03c5
            X.0wS r1 = r11.A0W
            java.lang.String r0 = "P2M_LITE"
            X.19r r10 = r1.A04(r0)
            if (r10 == 0) goto L_0x03c5
        L_0x000f:
            r11.A0Q = r12
            android.content.Context r0 = r11.getContext()
            X.2hp r3 = new X.2hp
            r3.<init>(r0)
            X.1Vt r2 = r11.A0Q
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x0390
            r0 = 2
            if (r1 == r0) goto L_0x035f
            r0 = 9
            if (r1 == r0) goto L_0x0327
            r0 = 10
            if (r1 == r0) goto L_0x035f
            r0 = 20
            if (r1 == r0) goto L_0x0390
            r0 = 100
            if (r1 == r0) goto L_0x0390
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x035f
        L_0x0038:
            X.0ud r2 = r11.A0J
            android.widget.ImageView r1 = r11.A06
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            r2.A05(r1, r0)
        L_0x0042:
            android.widget.ImageView r1 = r11.A06
            java.lang.String r0 = r11.getTransactionTitle()
            r1.setContentDescription(r0)
            android.widget.ImageView r1 = r11.A06
            r0 = 0
            r1.setOnClickListener(r0)
            boolean r1 = r12.A0G()
            r6 = 8
            r5 = 0
            android.view.View r0 = r11.A01
            if (r1 != 0) goto L_0x00a7
            r0.setVisibility(r6)
            android.widget.LinearLayout r0 = r11.A08
            r0.setVisibility(r6)
            android.widget.LinearLayout r0 = r11.A09
            r0.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0E
            java.lang.String r0 = r11.getTransactionTitle()
            r1.setText(r0)
            com.obwhatsapp.WaTextView r3 = r11.A0G
            android.content.Context r1 = r11.getContext()
            r0 = 2131890527(0x7f12115f, float:1.9415748E38)
            java.lang.String r2 = r1.getString(r0)
            X.63S r1 = new X.63S
            r1.<init>()
            java.lang.String r0 = "update-whatsapp"
            android.text.SpannableStringBuilder r0 = X.AnonymousClass2JN.A08(r1, r2, r0)
            r3.setText(r0)
            com.obwhatsapp.WaTextView r2 = r11.A0G
            android.content.Context r1 = r11.getContext()
            r0 = 2131100920(0x7f0604f8, float:1.7814235E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setLinkTextColor(r0)
            r0 = 142(0x8e, float:1.99E-43)
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r11, r0)
            r11.setOnClickListener(r0)
        L_0x00a6:
            return
        L_0x00a7:
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r11.A08
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r11.A09
            r0.setVisibility(r6)
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0D
            java.lang.String r0 = r11.getTransactionTitle()
            r1.setText(r0)
            X.0t6 r0 = r11.A0P
            X.0tZ r4 = r0.A0H(r12)
            X.1W2 r2 = r12.A0A
            if (r2 == 0) goto L_0x0172
            X.1lh r0 = r2.A0C()
            if (r0 == 0) goto L_0x0172
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 != 0) goto L_0x0172
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0C
            X.1lh r0 = r2.A0C()
            java.lang.Object r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.ImageView r0 = r11.A05
            if (r0 == 0) goto L_0x00ea
            r0.setVisibility(r6)
        L_0x00ea:
            com.obwhatsapp.TextEmojiLabel r0 = r11.A0C
            if (r0 == 0) goto L_0x00f1
            r0.setVisibility(r5)
        L_0x00f1:
            X.1yN r3 = r10.ABY()
            android.widget.FrameLayout r0 = r11.A04
            r0.removeAllViews()
            if (r3 == 0) goto L_0x0181
            android.content.Context r8 = r11.getContext()
            X.1W2 r9 = r12.A0A
            r1 = r3
            X.5ho r1 = (X.C112015ho) r1
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            boolean r0 = r9 instanceof X.C111855hW
            r2 = 0
            if (r0 == 0) goto L_0x014c
            X.5hW r9 = (X.C111855hW) r9
            java.lang.String r0 = r9.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0130
            X.0s5 r1 = r1.A01
            X.0s8 r0 = X.C15910s6.A0q
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0130
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131559552(0x7f0d0480, float:1.8744451E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x0130:
            X.5xC r0 = r9.A0B
            if (r0 == 0) goto L_0x014c
            X.5xB r0 = r0.A0C
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x014c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131559227(0x7f0d033b, float:1.8743792E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x014c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0181
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            X.AnonymousClass3K3.A14(r2)
            r0 = 1
            r2.setOrientation(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x0162:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x0162
        L_0x0172:
            r11.setupTransactionMessage(r4)
            goto L_0x00f1
        L_0x0177:
            android.widget.FrameLayout r0 = r11.A04
            r0.addView(r2)
            android.widget.FrameLayout r0 = r11.A04
            r0.setVisibility(r5)
        L_0x0181:
            if (r4 == 0) goto L_0x0321
            X.1Vw r0 = r4.A11
            if (r0 == 0) goto L_0x0321
            X.15p r8 = r11.A0Y
            X.0rv r0 = r0.A00
            if (r0 == 0) goto L_0x031d
            X.1Vt r2 = r4.A0L
            if (r2 == 0) goto L_0x031d
        L_0x0191:
            boolean r0 = r2.A0E()
            X.0sK r1 = r8.A00
            if (r0 == 0) goto L_0x02e2
            com.whatsapp.jid.UserJid r0 = r2.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x02d9
            int r1 = r2.A03
            r0 = 40
            if (r1 != r0) goto L_0x01b5
            int r1 = r2.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x02d0
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x02d0
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x02d0
        L_0x01b5:
            X.0tz r0 = r8.A05
            android.content.Context r8 = r0.A00
            r0 = 2131890344(0x7f1210a8, float:1.9415377E38)
        L_0x01bc:
            java.lang.String r1 = r8.getString(r0)
        L_0x01c0:
            android.widget.ImageView r0 = r11.A07
            r0.setVisibility(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02c8
            com.obwhatsapp.WaTextView r0 = r11.A0H
            r0.setText(r1)
            com.obwhatsapp.WaTextView r0 = r11.A0H
            r0.setVisibility(r5)
            X.0w8 r0 = r11.A0V
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x01e5
            X.0w8 r0 = r11.A0V
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x021c
        L_0x01e5:
            int r1 = r12.A03
            r0 = 100
            if (r1 == r0) goto L_0x02bc
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x02bc
            r7 = 2131231862(0x7f080476, float:1.8079817E38)
            android.content.res.Resources r1 = X.C13680ns.A0D(r11)
            r0 = 2131166730(0x7f07060a, float:1.7947714E38)
        L_0x01f9:
            float r0 = r1.getDimension(r0)
            int r2 = (int) r0
            android.widget.ImageView r0 = r11.A07
            r0.setVisibility(r5)
            android.widget.ImageView r1 = r11.A07
            android.content.Context r0 = r11.getContext()
            X.C13700nu.A0L(r0, r1, r7)
            android.widget.ImageView r0 = r11.A07
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r2
            android.widget.ImageView r0 = r11.A07
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
        L_0x021c:
            r11.setupRowButtons(r4, r3)
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0B
            java.lang.CharSequence r0 = r11.getAmountText()
            r1.setText(r0)
            X.4Pc r0 = r10.AEP()
            boolean r0 = r0.A00(r12)
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0B
            if (r0 == 0) goto L_0x0290
            X.AnonymousClass47D.A00(r1)
        L_0x0237:
            int r3 = r11.getStatusColor()
            java.lang.String r2 = r11.getStatusLabel()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            android.widget.TextView r0 = r11.A0A
            if (r1 != 0) goto L_0x028c
            r0.setText(r2)
            android.widget.TextView r0 = r11.A0A
            r0.setTextColor(r3)
            android.widget.TextView r0 = r11.A0A
            r0.setVisibility(r5)
        L_0x0254:
            int r1 = r12.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x00a6
            com.obwhatsapp.TextEmojiLabel r0 = r11.A0B
            r0.setVisibility(r6)
            X.1MB r2 = r11.A0X
            java.lang.String r1 = r12.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0285
            r1 = 0
        L_0x026a:
            android.view.View r0 = r11.A03
            if (r1 == 0) goto L_0x027c
            r0.setVisibility(r6)
            com.obwhatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r5)
        L_0x0276:
            android.widget.TextView r0 = r11.A0A
            r0.setVisibility(r6)
            return
        L_0x027c:
            r0.setVisibility(r5)
            com.obwhatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r6)
            goto L_0x0276
        L_0x0285:
            java.util.HashSet r0 = r2.A00
            boolean r1 = r0.contains(r1)
            goto L_0x026a
        L_0x028c:
            r0.setVisibility(r6)
            goto L_0x0254
        L_0x0290:
            int r0 = r1.getPaintFlags()
            r0 = r0 & -17
            r1.setPaintFlags(r0)
            boolean r0 = r12.A0C()
            if (r0 != 0) goto L_0x02b2
            boolean r0 = X.C218315p.A09(r12)
            if (r0 != 0) goto L_0x02b2
            com.obwhatsapp.TextEmojiLabel r2 = r11.A0B
            android.content.Context r1 = r11.getContext()
            r0 = 2131101206(0x7f060616, float:1.7814815E38)
        L_0x02ae:
            X.C13680ns.A0v(r1, r2, r0)
            goto L_0x0237
        L_0x02b2:
            com.obwhatsapp.TextEmojiLabel r2 = r11.A0B
            android.content.Context r1 = r11.getContext()
            r0 = 2131101457(0x7f060711, float:1.7815324E38)
            goto L_0x02ae
        L_0x02bc:
            r7 = 2131231062(0x7f080156, float:1.8078194E38)
            android.content.res.Resources r1 = X.C13680ns.A0D(r11)
            r0 = 2131166729(0x7f070609, float:1.7947712E38)
            goto L_0x01f9
        L_0x02c8:
            com.obwhatsapp.WaTextView r1 = r11.A0H
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x021c
        L_0x02d0:
            X.0tz r0 = r8.A05
            android.content.Context r8 = r0.A00
            r0 = 2131890082(0x7f120fa2, float:1.9414846E38)
            goto L_0x01bc
        L_0x02d9:
            X.0tz r0 = r8.A05
            android.content.Context r8 = r0.A00
            r0 = 2131890081(0x7f120fa1, float:1.9414844E38)
            goto L_0x01bc
        L_0x02e2:
            com.whatsapp.jid.UserJid r0 = r2.A0D
            boolean r7 = r1.A0I(r0)
            X.0w8 r1 = r8.A0B
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x0304
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x0304
            X.0tz r0 = r8.A05
            android.content.Context r8 = r0.A00
            r0 = 2131890083(0x7f120fa3, float:1.9414848E38)
            if (r7 == 0) goto L_0x01bc
            r0 = 2131890461(0x7f12111d, float:1.9415614E38)
            goto L_0x01bc
        L_0x0304:
            int r2 = r2.A03
            r1 = 100
            X.0tz r0 = r8.A05
            android.content.Context r8 = r0.A00
            if (r2 != r1) goto L_0x0313
            r0 = 2131890458(0x7f12111a, float:1.9415608E38)
            goto L_0x01bc
        L_0x0313:
            r0 = 2131890460(0x7f12111c, float:1.9415612E38)
            if (r7 == 0) goto L_0x01bc
            r0 = 2131890459(0x7f12111b, float:1.941561E38)
            goto L_0x01bc
        L_0x031d:
            java.lang.String r1 = ""
            goto L_0x01c0
        L_0x0321:
            X.15p r8 = r11.A0Y
            X.1Vt r2 = r11.A0Q
            goto L_0x0191
        L_0x0327:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x0358
            X.0wS r1 = r11.A0W
            java.lang.String r0 = "P2M_LITE"
            X.19r r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0358
        L_0x0336:
            X.1yJ r0 = r0.AEd()
            if (r0 == 0) goto L_0x0038
            X.0ud r4 = r11.A0J
            android.widget.ImageView r3 = r11.A06
            X.1Vt r0 = r11.A0Q
            int r2 = r0.A01
            r0 = 1
            r1 = 2131231707(0x7f0803db, float:1.8079503E38)
            if (r2 == r0) goto L_0x0353
            r0 = 2
            r1 = 2131231706(0x7f0803da, float:1.80795E38)
            if (r2 == r0) goto L_0x0353
            r1 = 2131230908(0x7f0800bc, float:1.8077882E38)
        L_0x0353:
            r4.A05(r3, r1)
            goto L_0x0042
        L_0x0358:
            X.0wS r0 = r11.A0W
            X.19r r0 = r0.A03()
            goto L_0x0336
        L_0x035f:
            com.whatsapp.jid.UserJid r1 = r2.A0E
            if (r1 == 0) goto L_0x0038
            X.0sG r0 = r11.A0K
            X.0sH r2 = r0.A0A(r1)
            X.2Ao r1 = r11.A0M
            android.widget.ImageView r0 = r11.A06
            r1.A06(r0, r2)
            android.widget.ImageView r2 = r11.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r0 = 2131893713(0x7f121dd1, float:1.942221E38)
            java.lang.String r0 = r3.A00(r0)
            r1.append(r0)
            X.1Vt r0 = r11.A0Q
            com.whatsapp.jid.UserJid r0 = r0.A0E
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            X.C004601z.A0n(r2, r0)
            android.widget.ImageView r1 = r11.A06
            r0 = 141(0x8d, float:1.98E-43)
            goto L_0x03c0
        L_0x0390:
            com.whatsapp.jid.UserJid r1 = r2.A0D
            if (r1 == 0) goto L_0x0038
            X.0sG r0 = r11.A0K
            X.0sH r2 = r0.A0A(r1)
            X.2Ao r1 = r11.A0M
            android.widget.ImageView r0 = r11.A06
            r1.A06(r0, r2)
            android.widget.ImageView r2 = r11.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r0 = 2131893713(0x7f121dd1, float:1.942221E38)
            java.lang.String r0 = r3.A00(r0)
            r1.append(r0)
            X.1Vt r0 = r11.A0Q
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            X.C004601z.A0n(r2, r0)
            android.widget.ImageView r1 = r11.A06
            r0 = 144(0x90, float:2.02E-43)
        L_0x03c0:
            X.C110105dW.A0r(r1, r11, r0)
            goto L_0x0042
        L_0x03c5:
            X.0wS r0 = r11.A0W
            X.19r r10 = r0.A03()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow.A5U(X.1Vt):void");
    }

    public void Abn() {
        AnonymousClass1Vt r1 = this.A0Q;
        if (r1 != null && this.A0T != null) {
            A5U(r1);
        }
    }

    public CharSequence getAmountText() {
        Context context;
        int i2;
        String A0J2 = this.A0Y.A0J(this.A0Q);
        if (!this.A0Q.A0E()) {
            int i3 = this.A0Q.A03;
            if (i3 == 1 || i3 == 100) {
                context = getContext();
                i2 = R.string.str1034;
            } else if (i3 == 2 || i3 == 200) {
                context = getContext();
                i2 = R.string.str1033;
            }
            A0J2 = C13680ns.A0d(context, A0J2, new Object[1], 0, i2);
        }
        return this.A0Q.A00().A9E(getContext(), A0J2);
    }

    public AnonymousClass2SE getCallback() {
        return this.A0T;
    }

    public int getLayoutResourceId() {
        return R.layout.layout047e;
    }

    public int getStatusColor() {
        return AnonymousClass00T.A00(getContext(), C218315p.A01(this.A0Q));
    }

    public String getStatusLabel() {
        return this.A0Y.A0K(this.A0Q);
    }

    public String getTransactionTitle() {
        return this.A0Y.A0T(this.A0Q, false);
    }

    public void setCallback(AnonymousClass2SE r1) {
        this.A0T = r1;
    }

    public void setLoggingScreenName(String str) {
        this.A0Z = str;
    }

    public void setupRowButtons(C16740tZ r13, AnonymousClass1yN r14) {
        Button button = (Button) C004601z.A0E(this, R.id.accept_payment_button);
        this.A0I = button;
        C228019i r3 = this.A0U;
        View view = this.A01;
        AnonymousClass2SE r8 = this.A0T;
        AnonymousClass1Vt r6 = this.A0Q;
        String str = this.A0Z;
        view.setVisibility(8);
        if (r6.A0B()) {
            r3.A04(view, (android.widget.Button) null, r6, r8, false);
        } else if (r6.A02 == 102) {
            r3.A02(view, button, r6);
        } else {
            r3.A03(view, (android.widget.Button) null, r6, r14, r8, r13, str, false);
        }
    }

    public void setupTransactionMessage(C16740tZ r5) {
        ImageView imageView;
        int i2;
        if ((r5 instanceof C30581cc) && !TextUtils.isEmpty(r5.A0I())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r5.A0I());
            this.A0S.A02(getContext(), spannableStringBuilder, r5.A0q);
            this.A0C.A0G(spannableStringBuilder);
            imageView = this.A05;
            i2 = 8;
        } else if ((this.A0R.A0C(812) || this.A0R.A0C(811)) && (r5 instanceof C38641rB)) {
            ImageView imageView2 = this.A05;
            if (imageView2 != null) {
                imageView2.setImageDrawable(AnonymousClass2SR.A02(getContext(), R.drawable.msg_status_sticker, R.color.color055a));
            }
            this.A0C.setText(R.string.str0fb9);
            imageView = this.A05;
            i2 = 0;
        } else {
            ImageView imageView3 = this.A05;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel = this.A0C;
            if (textEmojiLabel != null) {
                textEmojiLabel.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(i2);
        }
        TextEmojiLabel textEmojiLabel2 = this.A0C;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setVisibility(0);
        }
    }
}
