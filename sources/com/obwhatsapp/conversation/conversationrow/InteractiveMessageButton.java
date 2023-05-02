package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass1ME;
import X.C004601z;
import X.C13680ns;
import X.C14710pd;
import X.C15900s5;
import X.C16150sX;
import X.C18180wH;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C52912ee;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class InteractiveMessageButton extends FrameLayout implements AnonymousClass006 {
    public C15900s5 A00;
    public AnonymousClass1ME A01;
    public C52912ee A02;
    public C18180wH A03;
    public AnonymousClass013 A04;
    public C14710pd A05;
    public C52662eE A06;
    public boolean A07;
    public final TextEmojiLabel A08;
    public final InteractiveButtonsRowContentLayout A09;

    public InteractiveMessageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout035c, this, true);
        this.A08 = C13680ns.A0Q(this, R.id.button_content);
        this.A09 = (InteractiveButtonsRowContentLayout) C004601z.A0E(this, R.id.buttons_row);
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A05 = C16150sX.A0k(r1);
            this.A00 = (C15900s5) r1.ALm.get();
            this.A01 = (AnonymousClass1ME) r1.AGk.get();
            this.A04 = C16150sX.A0Z(r1);
            this.A02 = r2.A03();
            this.A03 = C16150sX.A0S(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ac, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b0, code lost:
        if (r2 != null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b5, code lost:
        if (r1 == 2) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b8, code lost:
        if (r1 == 4) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bb, code lost:
        if (r1 == 6) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bd, code lost:
        r13.setMessageText(r5, r4, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c0, code lost:
        if (r2 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c5, code lost:
        if (r1 == 2) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        if (r1 == 4) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        if (r1 == 6) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ce, code lost:
        if (r1 != 3) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d0, code lost:
        r4.A0A();
        setMinimumHeight(X.C13680ns.A0D(r12).getDimensionPixelSize(com.obwhatsapp.R.dimen.dimen0532));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e1, code lost:
        setContentDescription(X.C13680ns.A0d(getContext(), r4.getText(), new java.lang.Object[1], 0, com.obwhatsapp.R.string.str0026));
        setOnClickListener(new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1(r12, 9, r15));
        setLongClickable(true);
        X.C004601z.A0j(r12, new com.facebook.redex.IDxDCompatShape23S0100000_2_I1(r12, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020d, code lost:
        r4.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0211, code lost:
        r4.A0D(X.C447725m.A00(getContext(), r12.A04, com.obwhatsapp.R.drawable.ic_format_list_bulleted));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0222, code lost:
        r4.setText(com.obwhatsapp.R.string.str161c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0229, code lost:
        r13.setMessageText(getContext().getString(com.obwhatsapp.R.string.str130e), r4, r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C30011bb r13, X.AnonymousClass1YG r14, X.C16740tZ r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C16840tj
            if (r0 == 0) goto L_0x0078
            com.obwhatsapp.TextEmojiLabel r4 = r12.A08
            r5 = 8
            r4.setVisibility(r5)
            com.obwhatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r8 = r12.A09
            r8.setVisibility(r5)
            r0 = r15
            X.0tj r0 = (X.C16840tj) r0
            X.0tn r2 = r0.AAt()
            if (r2 == 0) goto L_0x0195
            X.1lc r0 = r2.A01
            if (r0 == 0) goto L_0x0108
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0108
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = "review_order"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            X.0pd r3 = r12.A05
            r1 = 2688(0xa80, float:3.767E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x0079
            r5 = 0
            r8.setVisibility(r5)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            android.content.Context r1 = r12.getContext()
            r0 = 2131887194(0x7f12045a, float:1.9408988E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 3
            com.facebook.redex.IDxBCallbackShape84S0200000_2_I1 r1 = new com.facebook.redex.IDxBCallbackShape84S0200000_2_I1
            r1.<init>(r12, r15, r0)
            r3 = -1
            X.4M9 r0 = new X.4M9
            r0.<init>(r1, r2, r3, r5)
            r4.add(r0)
            android.content.Context r1 = r12.getContext()
            r0 = 2131887195(0x7f12045b, float:1.940899E38)
            java.lang.String r7 = r1.getString(r0)
            com.facebook.redex.IDxBCallbackShape84S0200000_2_I1 r1 = new com.facebook.redex.IDxBCallbackShape84S0200000_2_I1
            r1.<init>(r12, r15, r5)
        L_0x006d:
            X.4M9 r0 = new X.4M9
            r0.<init>(r1, r7, r3, r5)
            r4.add(r0)
        L_0x0075:
            r8.A00(r13, r4)
        L_0x0078:
            return
        L_0x0079:
            X.1lc r9 = r2.A01
            r5 = 0
            r8.setVisibility(r5)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            X.1ME r0 = r12.A01
            r0.A00()
            r2 = 1
            X.1lZ r6 = r9.A05
            java.lang.String r0 = r6.A01
            int r0 = X.C35251lc.A00(r0)
            android.content.Context r1 = r12.getContext()
            if (r0 == r2) goto L_0x00ba
            r0 = 2131887194(0x7f12045a, float:1.9408988E38)
        L_0x009a:
            java.lang.String r7 = r1.getString(r0)
            r0 = 2
            com.facebook.redex.IDxBCallbackShape84S0200000_2_I1 r1 = new com.facebook.redex.IDxBCallbackShape84S0200000_2_I1
            r1.<init>(r12, r15, r0)
            r3 = -1
            X.4M9 r0 = new X.4M9
            r0.<init>(r1, r7, r3, r5)
            r4.add(r0)
            X.0pd r7 = r12.A05
            r1 = 1600(0x640, float:2.242E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r0 = r7.A06(r0, r1)
            if (r0 == 0) goto L_0x00db
            goto L_0x00be
        L_0x00ba:
            r0 = 2131887189(0x7f120455, float:1.9408978E38)
            goto L_0x009a
        L_0x00be:
            org.json.JSONObject r1 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r0 = "allowed_product_type"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x00c9 }
            goto L_0x00dd
        L_0x00c9:
            r7 = move-exception
            java.lang.String r0 = "OrderDetailsQuickPayConfig/init failed to parse config json: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r7.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00db:
            java.lang.String r7 = "none"
        L_0x00dd:
            java.lang.String r1 = r9.A0B
            java.lang.String r0 = "any"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x0075
        L_0x00ed:
            android.content.Context r1 = r12.getContext()
            r0 = 2131887192(0x7f120458, float:1.9408984E38)
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = r6.A01
            int r0 = X.C35251lc.A00(r0)
            if (r0 == r2) goto L_0x0101
            r5 = 1
        L_0x0101:
            com.facebook.redex.IDxBCallbackShape84S0200000_2_I1 r1 = new com.facebook.redex.IDxBCallbackShape84S0200000_2_I1
            r1.<init>(r12, r15, r2)
            goto L_0x006d
        L_0x0108:
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x0195
            X.1lW r10 = r2.A03
            if (r10 == 0) goto L_0x0078
            java.util.List r0 = r10.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0117:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r4.next()
            X.1lV r0 = (X.C35181lV) r0
            X.0wH r9 = r12.A03
            X.1lK r3 = r0.A01
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r3.A01
            X.1Qr r1 = r9.A01(r1, r0)
            if (r1 == 0) goto L_0x0117
            android.content.Context r0 = r12.getContext()
            java.lang.String r0 = r1.A01(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0117
            r7 = 0
            r8.setVisibility(r7)
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
        L_0x0147:
            java.util.List r1 = r10.A00
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x018d
            java.lang.Object r11 = r1.get(r7)
            X.1lV r11 = (X.C35181lV) r11
            X.1lK r3 = r11.A01
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r3.A01
            X.1Qr r1 = r9.A01(r1, r0)
            if (r1 == 0) goto L_0x0188
            if (r7 != 0) goto L_0x0166
            r0 = 1
            r8.A02 = r0
        L_0x0166:
            android.content.Context r0 = r12.getContext()
            java.lang.String r5 = r1.A01(r0, r3)
            if (r5 != 0) goto L_0x0172
            java.lang.String r5 = ""
        L_0x0172:
            boolean r0 = r1 instanceof X.C27141Qp
            if (r0 == 0) goto L_0x018b
            r4 = 2131232610(0x7f080762, float:1.8081334E38)
        L_0x0179:
            boolean r3 = r11.A00
            X.4xJ r1 = new X.4xJ
            r1.<init>(r12, r15, r11, r2)
            X.4M9 r0 = new X.4M9
            r0.<init>(r1, r5, r4, r3)
            r6.add(r0)
        L_0x0188:
            int r7 = r7 + 1
            goto L_0x0147
        L_0x018b:
            r4 = -1
            goto L_0x0179
        L_0x018d:
            r8.A00(r13, r6)
            r0 = 0
            r12.setOnClickListener(r0)
            return
        L_0x0195:
            r3 = 0
            r4.setVisibility(r3)
            if (r14 == 0) goto L_0x0238
            boolean r0 = r14.Afe()
            if (r0 == 0) goto L_0x0238
            r12.setVisibility(r3)
            if (r2 == 0) goto L_0x01ae
            java.lang.String r5 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x01b2
        L_0x01ae:
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x01bd
        L_0x01b2:
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0229
            r0 = 4
            if (r1 == r0) goto L_0x0222
            r0 = 6
            if (r1 == r0) goto L_0x0229
        L_0x01bd:
            r13.setMessageText(r5, r4, r15)
            if (r2 == 0) goto L_0x0211
        L_0x01c2:
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x020d
            r0 = 4
            if (r1 == r0) goto L_0x020d
            r0 = 6
            if (r1 == r0) goto L_0x020d
            r0 = 3
            if (r1 != r0) goto L_0x0211
            r4.A0A()
            android.content.res.Resources r1 = X.C13680ns.A0D(r12)
            r0 = 2131166514(0x7f070532, float:1.7947276E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r12.setMinimumHeight(r0)
        L_0x01e1:
            android.content.Context r6 = r12.getContext()
            r5 = 2131886118(0x7f120026, float:1.9406806E38)
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.CharSequence r0 = r4.getText()
            java.lang.String r0 = X.C13680ns.A0d(r6, r0, r1, r3, r5)
            r12.setContentDescription(r0)
            r1 = 9
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r0.<init>(r12, r1, r15)
            r12.setOnClickListener(r0)
            r12.setLongClickable(r2)
            r1 = 3
            com.facebook.redex.IDxDCompatShape23S0100000_2_I1 r0 = new com.facebook.redex.IDxDCompatShape23S0100000_2_I1
            r0.<init>(r12, r1)
            X.C004601z.A0j(r12, r0)
            return
        L_0x020d:
            r4.A0A()
            goto L_0x01e1
        L_0x0211:
            X.013 r2 = r12.A04
            android.content.Context r1 = r12.getContext()
            r0 = 2131231654(0x7f0803a6, float:1.8079395E38)
            X.25m r0 = X.C447725m.A00(r1, r2, r0)
            r4.A0D(r0)
            goto L_0x01e1
        L_0x0222:
            r0 = 2131891740(0x7f12161c, float:1.9418209E38)
            r4.setText(r0)
            goto L_0x01c2
        L_0x0229:
            android.content.Context r1 = r12.getContext()
            r0 = 2131890958(0x7f12130e, float:1.9416622E38)
            java.lang.String r0 = r1.getString(r0)
            r13.setMessageText(r0, r4, r15)
            goto L_0x01c2
        L_0x0238:
            r12.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.InteractiveMessageButton.A00(X.1bb, X.1YG, X.0tZ):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }
}
