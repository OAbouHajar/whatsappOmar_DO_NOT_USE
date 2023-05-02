package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C004601z;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class InteractiveButtonsRowContentLayout extends LinearLayout implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;
    public final LinearLayout.LayoutParams A04;
    public final LinearLayout.LayoutParams A05;
    public final LinearLayout A06;

    public InteractiveButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A04 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A05 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout.inflate(context, R.layout.layout035d, this);
        this.A06 = (LinearLayout) C004601z.A0E(this, R.id.buttons_container);
    }

    public InteractiveButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r17.size() > 4) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C30011bb r19, java.util.List r20) {
        /*
            r18 = this;
            r17 = r20
            int r0 = r17.size()
            r5 = 0
            r4 = 1
            if (r0 <= 0) goto L_0x0012
            int r2 = r17.size()
            r1 = 4
            r0 = 1
            if (r2 <= r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            X.AnonymousClass00B.A0F(r0)
            int r7 = r17.size()
            r0 = 1098907648(0x41800000, float:16.0)
            r3 = r18
            int r9 = X.C13680ns.A05(r3, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131952080(0x7f1301d0, float:1.9540593E38)
            X.06V r6 = new X.06V
            r6.<init>((android.content.Context) r1, (int) r0)
            if (r7 <= r4) goto L_0x013d
            java.util.Iterator r8 = r17.iterator()
        L_0x0034:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r1 = r8.next()
            X.4M9 r1 = (X.AnonymousClass4M9) r1
            r0 = 0
            com.obwhatsapp.TextEmojiLabel r2 = new com.obwhatsapp.TextEmojiLabel
            r2.<init>(r6, r0)
            float r0 = r19.getTextFontSize()
            r2.setTextSize(r0)
            java.lang.String r0 = r1.A02
            r2.setText(r0)
            r2.setDrawingCacheEnabled(r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r2.measure(r0, r0)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            r2.layout(r5, r5, r1, r0)
            int r2 = r2.getMeasuredWidth()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165800(0x7f070268, float:1.7945827E38)
            float r0 = r1.getDimension(r0)
            int r1 = (int) r0
            int r1 = r1 / r7
            int r0 = r9 * r7
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0034
        L_0x007d:
            android.widget.LinearLayout r8 = r3.A06
            r8.setOrientation(r4)
            r8.removeAllViews()
        L_0x0085:
            int r0 = r17.size()
            if (r5 >= r0) goto L_0x014d
            r0 = r17
            java.lang.Object r12 = r0.get(r5)
            X.4M9 r12 = (X.AnonymousClass4M9) r12
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r3)
            r0 = 2131559264(0x7f0d0360, float:1.8743867E38)
            r9 = 0
            android.view.View r7 = r1.inflate(r0, r3, r9)
            r0 = 2131362460(0x7f0a029c, float:1.8344701E38)
            android.view.View r10 = X.C004601z.A0E(r7, r0)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 2131362443(0x7f0a028b, float:1.8344667E38)
            android.view.View r11 = X.C004601z.A0E(r7, r0)
            r0 = 2131362444(0x7f0a028c, float:1.8344669E38)
            com.obwhatsapp.TextEmojiLabel r2 = X.C13680ns.A0Q(r7, r0)
            r0 = 2131362449(0x7f0a0291, float:1.8344679E38)
            android.view.View r16 = X.C004601z.A0E(r7, r0)
            r0 = 2131362450(0x7f0a0292, float:1.834468E38)
            android.view.View r6 = X.C004601z.A0E(r7, r0)
            float r0 = r19.getTextFontSize()
            r2.setTextSize(r0)
            java.lang.String r14 = r12.A02
            r2.setText(r14)
            boolean r13 = r12.A03
            r2.setSelected(r13)
            int r15 = r12.A00
            r0 = -1
            if (r15 == r0) goto L_0x00e7
            X.013 r1 = r3.A00
            android.content.Context r0 = r3.getContext()
            X.25m r0 = X.C447725m.A00(r0, r1, r15)
            r2.A0D(r0)
        L_0x00e7:
            r2.measure(r9, r9)
            r2 = 1
            if (r13 == 0) goto L_0x0131
            r11.setClickable(r9)
        L_0x00f0:
            android.content.Context r13 = r3.getContext()
            r1 = 2131886118(0x7f120026, float:1.9406806E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.C13680ns.A0d(r13, r14, r0, r9, r1)
            r11.setContentDescription(r0)
            r11.setLongClickable(r2)
            com.facebook.redex.IDxDCompatShape4S0200000_2_I1 r0 = new com.facebook.redex.IDxDCompatShape4S0200000_2_I1
            r0.<init>(r12, r2, r3)
            X.C004601z.A0j(r11, r0)
            if (r4 == 0) goto L_0x0123
            r10.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r0 = r3.A05
            r10.setLayoutParams(r0)
            if (r5 <= 0) goto L_0x011c
            r0 = r16
            r0.setVisibility(r9)
        L_0x011c:
            r8.addView(r7)
            int r5 = r5 + 1
            goto L_0x0085
        L_0x0123:
            r10.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r0 = r3.A04
            r10.setLayoutParams(r0)
            if (r5 <= 0) goto L_0x011c
            r6.setVisibility(r9)
            goto L_0x011c
        L_0x0131:
            r11.setClickable(r2)
            com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1
            r0.<init>(r12, r5, r2)
            r11.setOnClickListener(r0)
            goto L_0x00f0
        L_0x013d:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x014a
            int r1 = r17.size()
            r0 = 2
            if (r1 < r0) goto L_0x014a
            goto L_0x007d
        L_0x014a:
            r4 = 0
            goto L_0x007d
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A00(X.1bb, java.util.List):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDisplayButtonsInVertical(boolean z2) {
        this.A02 = z2;
    }
}
