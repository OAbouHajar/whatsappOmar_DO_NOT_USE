package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass31O;
import X.AnonymousClass31P;
import X.AnonymousClass31Q;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16150sX;
import X.C16320sq;
import X.C16980tz;
import X.C17930vs;
import X.C218315p;
import X.C221116r;
import X.C25791Ld;
import X.C30531cW;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C52912ee;
import X.C73713ou;
import X.C83614Hj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.Map;

public class InteractiveMessageView extends LinearLayout implements AnonymousClass006 {
    public C52912ee A00;
    public AnonymousClass013 A01;
    public C52662eE A02;
    public Map A03;
    public boolean A04;
    public final FrameLayout A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final C83614Hj A08;

    public InteractiveMessageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout035e, this, true);
        FrameLayout A082 = C13700nu.A08(this, R.id.interactive_message_header_holder);
        this.A05 = A082;
        this.A08 = new C83614Hj(A082, this.A03);
        this.A06 = C13680ns.A0Q(this, R.id.description);
        TextEmojiLabel A0Q = C13680ns.A0Q(this, R.id.bottom_message);
        this.A07 = A0Q;
        TextEmojiLabel textEmojiLabel = this.A06;
        C30531cW.A02(textEmojiLabel);
        C13690nt.A1C(textEmojiLabel);
        C30531cW.A02(A0Q);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteractiveMessageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            C52652eD r0 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r3 = r0.A07;
            AnonymousClass01J r6 = r3.AQB;
            AnonymousClass01J r5 = r3.AR8;
            AnonymousClass01J r4 = r3.AFY;
            AnonymousClass31P r2 = new AnonymousClass31P((C16980tz) r6.get(), (AnonymousClass013) r5.get(), (C25791Ld) r4.get());
            Integer A0Z = C13680ns.A0Z();
            C73713ou r20 = new C73713ou();
            Integer A0a = C13680ns.A0a();
            C16320sq A1B = C16150sX.A1B(r3);
            this.A03 = C17930vs.of(1, r2, A0Z, r20, A0a, new AnonymousClass31Q(C16150sX.A02(r3), C16150sX.A0M(r3), C16150sX.A0Q(r3), (C16980tz) r6.get(), (AnonymousClass013) r5.get(), (C221116r) r3.AHt.get(), (C218315p) r3.AIL.get(), (C25791Ld) r4.get(), A1B), C13690nt.A0T(), new AnonymousClass31O((C16980tz) r6.get(), (C25791Ld) r4.get()));
            this.A00 = r0.A03();
            this.A01 = (AnonymousClass013) r5.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        r3 = r5.A00;
        r3.setVisibility(0);
        r0 = (X.AnonymousClass4PV) X.AnonymousClass000.A0Y(r5.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        if (r0 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        r0.A00(r3, r8, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C30011bb r8, X.C16740tZ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C16840tj
            if (r0 == 0) goto L_0x00c1
            r0 = r9
            X.0tj r0 = (X.C16840tj) r0
            X.0tn r2 = r0.AAt()
            X.1xE r6 = X.C42091xD.A01(r0)
            X.4Hj r5 = r7.A08
            X.0tn r4 = r0.AAt()
            if (r4 == 0) goto L_0x001c
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00d3;
                default: goto L_0x001c;
            }
        L_0x001c:
            android.widget.FrameLayout r3 = r5.A00
            r0 = 8
            r3.setVisibility(r0)
        L_0x0023:
            r5 = 0
            r4 = 8
            if (r6 == 0) goto L_0x00c8
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r6.A04(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c8
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r6.A04(r0)
            com.obwhatsapp.TextEmojiLabel r6 = r7.A06
            r8.setMessageText(r0, r6, r9)
            r6.setVisibility(r5)
        L_0x0046:
            if (r2 == 0) goto L_0x00c2
            java.lang.String r1 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c2
            com.obwhatsapp.TextEmojiLabel r2 = r7.A07
            r2.setVisibility(r5)
            r8.setMessageText(r1, r2, r9)
        L_0x0058:
            android.widget.FrameLayout r1 = r7.A05
            r0 = 11
            X.C13680ns.A1C(r1, r7, r9, r0)
            r1 = 10
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r0.<init>(r7, r1, r9)
            r7.setOnClickListener(r0)
            X.013 r5 = r7.A01
            boolean r0 = X.C13680ns.A1Z(r5)
            r4 = 3
            r1 = 5
            if (r0 == 0) goto L_0x0074
            r1 = 3
        L_0x0074:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r1
            r2.setLayoutParams(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r1
            r6.setLayoutParams(r0)
            X.1Vw r0 = r9.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00ab
            android.view.ViewGroup r2 = r8.getDateWrapper()
            X.AnonymousClass00B.A04(r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            boolean r0 = X.C13680ns.A1Z(r5)
            if (r0 == 0) goto L_0x00a4
            r4 = 5
        L_0x00a4:
            r0 = r4 | 80
            r1.gravity = r0
            r2.setLayoutParams(r1)
        L_0x00ab:
            r1 = 2131363779(0x7f0a07c3, float:1.8347376E38)
            android.view.View r0 = r3.findViewById(r1)
            if (r0 == 0) goto L_0x00c1
            android.view.View r1 = r3.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.graphics.drawable.Drawable r0 = r8.getInnerFrameForegroundDrawable()
            r1.setForeground(r0)
        L_0x00c1:
            return
        L_0x00c2:
            com.obwhatsapp.TextEmojiLabel r2 = r7.A07
            r2.setVisibility(r4)
            goto L_0x0058
        L_0x00c8:
            com.obwhatsapp.TextEmojiLabel r6 = r7.A06
            r6.setVisibility(r4)
            goto L_0x0046
        L_0x00cf:
            r1 = 4
            goto L_0x00d6
        L_0x00d1:
            r1 = 3
            goto L_0x00d6
        L_0x00d3:
            r1 = 1
            goto L_0x00d6
        L_0x00d5:
            r1 = 2
        L_0x00d6:
            android.widget.FrameLayout r3 = r5.A00
            r0 = 0
            r3.setVisibility(r0)
            java.util.Map r0 = r5.A01
            java.lang.Object r0 = X.AnonymousClass000.A0Y(r0, r1)
            X.4PV r0 = (X.AnonymousClass4PV) r0
            if (r0 == 0) goto L_0x00eb
            r0.A00(r3, r8, r9, r4)
            goto L_0x0023
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.InteractiveMessageView.A00(X.1bb, X.0tZ):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public FrameLayout getInnerFrameLayout() {
        return (FrameLayout) this.A08.A00.findViewById(R.id.frame_header);
    }

    public void setLayoutView(int i2) {
        TextEmojiLabel textEmojiLabel;
        Context context;
        int i3;
        if (i2 == 0) {
            textEmojiLabel = this.A07;
            context = getContext();
            i3 = R.color.color01a3;
        } else if (i2 == 1) {
            textEmojiLabel = this.A07;
            context = getContext();
            i3 = R.color.color01a2;
        } else {
            return;
        }
        C13680ns.A0v(context, textEmojiLabel, i3);
    }
}
