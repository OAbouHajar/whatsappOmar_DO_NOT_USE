package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.31K  reason: invalid class name */
public class AnonymousClass31K extends AnonymousClass30J {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public AnonymousClass1PH A08;
    public C615139f A09;
    public C26681Os A0A;
    public C809846j A0B;
    public AnonymousClass11A A0C;
    public C17780vd A0D;
    public C24551Gj A0E;
    public AnonymousClass124 A0F;
    public AnonymousClass1ZQ A0G;

    public AnonymousClass31K(Context context, AnonymousClass1YG r5, C30581cc r6) {
        super(context, r5, r6);
        AnonymousClass1ZQ A002 = C47612Jr.A00(context);
        TextEmojiLabel A0Q = C13680ns.A0Q(this, R.id.message_text);
        this.A04 = A0Q;
        C30531cW.A02(A0Q);
        this.A04.setAutoLinkMask(0);
        this.A04.setLinksClickable(false);
        this.A04.setFocusable(false);
        this.A04.setClickable(false);
        this.A04.setLongClickable(false);
        this.A0G = A002;
        A1M();
    }

    public static void A0d(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setDuration(500);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    private TextView getActionButtonView() {
        View view = this.A01;
        if (view == null) {
            return null;
        }
        return C13680ns.A0M(view, R.id.action_btn);
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A11(int i2) {
        int paddingLeft;
        int dimensionPixelOffset;
        super.A11(i2);
        View A0E2 = C004601z.A0E(this, R.id.conversation_text_row);
        if (this.A0O.A0D() == null && !A1N()) {
            if (C30011bb.A0a(this.A1A, this.A0O, i2, this.A0S)) {
                A0E2 = this.A04;
                paddingLeft = A0E2.getPaddingLeft();
                dimensionPixelOffset = 0;
            } else {
                paddingLeft = A0E2.getPaddingLeft();
                dimensionPixelOffset = C13680ns.A0D(this).getDimensionPixelOffset(R.dimen.dimen076b);
            }
            A0E2.setPadding(paddingLeft, dimensionPixelOffset, A0E2.getPaddingRight(), A0E2.getPaddingBottom());
        }
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean A1a = C13680ns.A1a(r3, this.A0O);
        super.A1G(r3, z2);
        if (z2 || A1a) {
            A1M();
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel.getAnimation() == null) {
            String A0I = this.A0O.A0I();
            AnonymousClass00B.A06(A0I);
            if (C87674Yb.A00(A0I) != null) {
                A0d(textEmojiLabel);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
        if (r6.A04 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        if (r10.A0E(X.C16620tM.A02, 1961) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0133, code lost:
        if (r8 != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r4.A0A.A00(r3) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0231, code lost:
        if (r21 != false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r24 = this;
            r5 = 0
            r4 = r24
            r4.A00 = r5
            X.0tZ r3 = r4.A0O
            X.1cc r3 = (X.C30581cc) r3
            java.lang.String r2 = r3.A0I()
            X.AnonymousClass00B.A06(r2)
            boolean r1 = r4.A1N()
            r0 = 2131367111(0x7f0a14c7, float:1.8354135E38)
            if (r1 == 0) goto L_0x0235
            android.view.ViewGroup r8 = X.C13700nu.A07(r4, r0)
            r8.setVisibility(r5)
            X.1uH r0 = r3.A0N
            if (r0 == 0) goto L_0x002e
            X.1Os r0 = r4.A0A
            boolean r0 = r0.A00(r3)
            r21 = 0
            if (r0 == 0) goto L_0x0030
        L_0x002e:
            r21 = 1
        L_0x0030:
            X.1Os r0 = r4.A0A
            boolean r22 = r0.A01(r3)
            X.39f r0 = r4.A09
            if (r0 != 0) goto L_0x0084
            android.content.Context r12 = r4.getContext()
            X.0uW r13 = r4.A0K
            X.1Mg r10 = r4.A12
            X.1Ld r7 = r4.A1d
            X.0uk r14 = r4.A0Y
            X.0pt r9 = r4.A0J
            X.0sq r6 = r4.A1e
            X.0ua r1 = r4.A0O
            X.188 r0 = r4.A0y
            X.4NE r15 = new X.4NE
            r15.<init>(r9, r1, r0, r6)
            X.46j r6 = r4.A0B
            X.0pd r1 = r4.A0M
            X.1Gj r0 = r4.A0E
            X.39f r11 = new X.39f
            r20 = r7
            r17 = r10
            r18 = r1
            r19 = r0
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.A09 = r11
            int r1 = r8.getPaddingLeft()
            int r0 = r8.getPaddingRight()
            r11.A00 = r1
            r11.A01 = r0
            X.39f r0 = r4.A09
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            X.C13700nu.A0Q(r0, r8)
            X.39f r0 = r4.A09
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            X.C30011bb.A0K(r0, r4)
        L_0x0084:
            X.0pd r0 = r4.A0M
            X.1xL r6 = X.C42171xL.A00(r0, r3)
            X.1ZQ r8 = r4.A0G
            boolean r0 = r8 instanceof X.AnonymousClass1ZP
            if (r0 == 0) goto L_0x0096
            boolean r0 = r6.A04
            r20 = 1
            if (r0 != 0) goto L_0x0098
        L_0x0096:
            r20 = 0
        L_0x0098:
            r1 = 72
            if (r20 == 0) goto L_0x009e
            r4.A00 = r1
        L_0x009e:
            r9 = 1
            if (r20 == 0) goto L_0x00bb
            java.lang.String r0 = r3.A0I()
            X.0pd r10 = r4.A0M
            int r7 = X.C31011dK.A00(r0)
            r0 = 90
            if (r7 >= r0) goto L_0x00bb
            r7 = 1961(0x7a9, float:2.748E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r10.A0E(r0, r7)
            r23 = 1
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r23 = 0
        L_0x00bd:
            X.1Ld r0 = r4.A1d
            boolean r0 = X.C61863As.A01(r3, r0, r9)
            if (r0 == 0) goto L_0x00e5
            X.1cv r9 = r3.A0U
            if (r9 == 0) goto L_0x0229
            android.content.Context r0 = r4.getContext()
            int r0 = X.C31171dd.A00(r0)
            if (r23 == 0) goto L_0x0222
            X.3p9 r7 = new X.3p9
            r7.<init>(r0)
        L_0x00d8:
            int r1 = r9.A01
            int r0 = r9.A00
            r7.A09(r1, r0)
            int r1 = r7.A04()
        L_0x00e3:
            r4.A00 = r1
        L_0x00e5:
            X.39f r15 = r4.A09
            r16 = r4
            r17 = r3
            r18 = r8
            r19 = r6
            r15.A02(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r11 = r6.A03
            boolean r12 = X.C61863As.A02(r11)
            X.0w2 r1 = r4.A18
            java.lang.String r0 = r6.A02
            boolean r10 = r1.A0D(r0)
            X.0w2 r7 = r4.A18
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r9 = 0
            if (r0 != 0) goto L_0x0116
            android.net.Uri r0 = android.net.Uri.parse(r11)
            r1 = 13
            int r0 = r7.A08(r0)
            if (r1 != r0) goto L_0x0116
            r9 = 1
        L_0x0116:
            X.0w2 r7 = r4.A18
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r8 = 0
            if (r0 != 0) goto L_0x012c
            android.net.Uri r0 = android.net.Uri.parse(r11)
            r1 = 33
            int r0 = r7.A08(r0)
            if (r1 != r0) goto L_0x012c
            r8 = 1
        L_0x012c:
            if (r12 != 0) goto L_0x0135
            if (r10 != 0) goto L_0x0135
            if (r9 != 0) goto L_0x0135
            r0 = 0
            if (r8 == 0) goto L_0x0136
        L_0x0135:
            r0 = 1
        L_0x0136:
            r7 = 0
            if (r0 == 0) goto L_0x020e
            android.view.View r1 = r4.A01
            if (r1 != 0) goto L_0x014a
            android.view.LayoutInflater r1 = X.C13680ns.A0G(r4)
            r0 = 2131558436(0x7f0d0024, float:1.8742188E38)
            android.view.View r1 = r1.inflate(r0, r7, r5)
            r4.A01 = r1
        L_0x014a:
            r0 = 2131361891(0x7f0a0063, float:1.8343547E38)
            android.widget.TextView r7 = X.C13680ns.A0M(r1, r0)
            if (r12 == 0) goto L_0x01ec
            X.0ul r1 = r4.A1B
            int r0 = r3.A00
            boolean r1 = r1.A0d(r0)
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01e2
            r0 = 2131892700(0x7f1219dc, float:1.9420156E38)
            if (r1 == 0) goto L_0x0169
            r0 = 2131892758(0x7f121a16, float:1.9420273E38)
        L_0x0169:
            r7.setText(r0)
        L_0x016c:
            X.AnonymousClass1UP.A06(r7)
            r0 = 2131364436(0x7f0a0a54, float:1.834871E38)
            android.view.ViewGroup r1 = X.C13690nt.A0K(r4, r0)
            android.view.View r0 = r4.A01
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0183
            android.view.View r0 = r4.A01
            r1.removeView(r0)
        L_0x0183:
            android.view.View r0 = r4.A01
            X.C13700nu.A0Q(r0, r1)
            android.view.View r1 = r4.A01
            r0 = 10
            X.C34331k5.A05(r1, r4, r6, r3, r0)
        L_0x018f:
            com.obwhatsapp.TextEmojiLabel r7 = r4.A04
            r4.setMessageText(r2, r7, r3)
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r3.A10(r0)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            android.view.View r0 = r4.A02
            if (r1 == 0) goto L_0x01dd
            r6 = 0
            if (r0 != 0) goto L_0x01be
            android.view.LayoutInflater r3 = X.C13680ns.A0G(r4)
            r1 = 2131558987(0x7f0d024b, float:1.8743305E38)
            r0 = 0
            android.view.View r3 = r3.inflate(r1, r0, r5)
            r4.A02 = r3
            android.view.ViewGroup r1 = r4.A04
            android.widget.TextView r0 = r4.A0E
            int r0 = r1.indexOfChild(r0)
            r1.addView(r3, r0)
        L_0x01be:
            android.view.View r0 = r4.A02
        L_0x01c0:
            r0.setVisibility(r6)
        L_0x01c3:
            r7.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5)
            r7.clearAnimation()
            java.lang.Integer r0 = X.C87674Yb.A00(r2)
            if (r0 == 0) goto L_0x01dc
            int r0 = r0.intValue()
            r7.setCompoundDrawablesWithIntrinsicBounds(r0, r5, r5, r5)
            X.C13700nu.A0T(r7)
            A0d(r7)
        L_0x01dc:
            return
        L_0x01dd:
            if (r0 == 0) goto L_0x01c3
            r6 = 8
            goto L_0x01c0
        L_0x01e2:
            r0 = 2131889110(0x7f120bd6, float:1.9412874E38)
            if (r1 == 0) goto L_0x0169
            r0 = 2131889114(0x7f120bda, float:1.9412882E38)
            goto L_0x0169
        L_0x01ec:
            if (r10 == 0) goto L_0x01fa
            android.content.Context r1 = r4.getContext()
            r0 = 2131892689(0x7f1219d1, float:1.9420133E38)
        L_0x01f5:
            X.C13690nt.A0s(r1, r7, r0)
            goto L_0x016c
        L_0x01fa:
            if (r9 == 0) goto L_0x0204
            android.content.Context r1 = r4.getContext()
            r0 = 2131892761(0x7f121a19, float:1.942028E38)
            goto L_0x01f5
        L_0x0204:
            if (r8 == 0) goto L_0x016c
            android.content.Context r1 = r4.getContext()
            r0 = 2131886921(0x7f120349, float:1.9408434E38)
            goto L_0x01f5
        L_0x020e:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x018f
            r0 = 2131364436(0x7f0a0a54, float:1.834871E38)
            android.view.ViewGroup r1 = X.C13690nt.A0K(r4, r0)
            android.view.View r0 = r4.A01
            r1.removeView(r0)
            r4.A01 = r7
            goto L_0x018f
        L_0x0222:
            X.3pA r7 = new X.3pA
            r7.<init>(r0)
            goto L_0x00d8
        L_0x0229:
            X.1uH r0 = r3.A0N
            if (r0 == 0) goto L_0x00e5
            byte[] r0 = r0.A0D
            if (r0 == 0) goto L_0x00e5
            if (r21 == 0) goto L_0x00e5
            goto L_0x00e3
        L_0x0235:
            android.view.ViewGroup r7 = X.C13690nt.A0K(r4, r0)
            X.39f r0 = r4.A09
            r6 = 0
            if (r0 == 0) goto L_0x0245
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            r7.removeView(r0)
            r4.A09 = r6
        L_0x0245:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x0257
            r0 = 2131364436(0x7f0a0a54, float:1.834871E38)
            android.view.ViewGroup r1 = X.C13690nt.A0K(r4, r0)
            android.view.View r0 = r4.A01
            r1.removeView(r0)
            r4.A01 = r6
        L_0x0257:
            r0 = 8
            r7.setVisibility(r0)
            X.0pd r6 = r4.A0M
            r1 = 2446(0x98e, float:3.428E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x018f
            r0 = 2131365626(0x7f0a0efa, float:1.8351123E38)
            com.obwhatsapp.TextEmojiLabel r0 = X.C13680ns.A0R(r4, r0)
            r4.A07 = r0
            r0 = 2131365612(0x7f0a0eec, float:1.8351094E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r4, r0)
            r4.A03 = r0
            r0 = 2131365623(0x7f0a0ef7, float:1.8351117E38)
            com.obwhatsapp.TextEmojiLabel r0 = X.C13680ns.A0R(r4, r0)
            r4.A06 = r0
            r0 = 2131365624(0x7f0a0ef8, float:1.8351119E38)
            com.obwhatsapp.TextEmojiLabel r0 = X.C13680ns.A0R(r4, r0)
            r4.A05 = r0
            X.0tZ r6 = r3.A0D()
            if (r6 == 0) goto L_0x018f
            boolean r0 = r6 instanceof X.C38651rC
            if (r0 == 0) goto L_0x018f
            X.1rC r6 = (X.C38651rC) r6
            X.1Vw r0 = r6.A11
            X.0rv r1 = r0.A00
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x018f
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = r6.A01
            X.0sL r0 = X.C16050sL.A05(r0)
            if (r0 == 0) goto L_0x018f
            X.0tZ r0 = r3.A0D()
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            X.0sL r6 = X.C16050sL.A03(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r4.A07
            if (r1 == 0) goto L_0x02ee
            android.widget.TextView r0 = r4.A03
            if (r0 == 0) goto L_0x02ee
            com.obwhatsapp.TextEmojiLabel r0 = r4.A06
            if (r0 == 0) goto L_0x02ee
            com.obwhatsapp.TextEmojiLabel r0 = r4.A05
            if (r0 == 0) goto L_0x02ee
            X.0rt r0 = r4.A0u
            java.lang.String r0 = r0.A09(r6)
            r1.setText(r0)
            android.widget.TextView r0 = r4.A03
            r1 = 8
            r0.setVisibility(r1)
            com.obwhatsapp.TextEmojiLabel r0 = r4.A06
            r0.setVisibility(r1)
            com.obwhatsapp.TextEmojiLabel r0 = r4.A05
            r0.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r1 = r4.A05
            r0 = 2131886351(0x7f12010f, float:1.9407278E38)
            r1.setText(r0)
        L_0x02ee:
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x030c
            r0 = 2131364436(0x7f0a0a54, float:1.834871E38)
            android.view.ViewGroup r8 = X.C13690nt.A0K(r4, r0)
            if (r8 == 0) goto L_0x030c
            android.view.LayoutInflater r7 = X.C13680ns.A0G(r4)
            r1 = 2131558436(0x7f0d0024, float:1.8742188E38)
            r0 = 0
            android.view.View r0 = r7.inflate(r1, r0, r5)
            r4.A01 = r0
            X.C13700nu.A0Q(r0, r8)
        L_0x030c:
            android.widget.TextView r1 = r4.getActionButtonView()
            if (r1 == 0) goto L_0x018f
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x018f
            r0.setVisibility(r5)
            r0 = 2131886349(0x7f12010d, float:1.9407274E38)
            r1.setText(r0)
            r0 = 9
            X.C34331k5.A05(r1, r4, r3, r6, r0)
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31K.A1M():void");
    }

    public final boolean A1N() {
        C16740tZ r6 = this.A0O;
        C16040sK r1 = this.A0L;
        C216014s r7 = this.A1a;
        return (!TextUtils.isEmpty(C42171xL.A00((C14710pd) null, r6).A03) && C47612Jr.A06(r1, this.A0a, this.A0v, this.A0M, this.A1B, r6, r7)) || this.A0O.A0N != null;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01d7;
    }

    public C30581cc getFMessage() {
        return (C30581cc) this.A0O;
    }

    public int getIncomingLayoutId() {
        return Conversation.leftlayID(R.layout.layout01d8);
    }

    public int getMainChildMaxWidth() {
        if (this.A00 != 0) {
            return C31171dd.A01(getContext(), this.A00);
        }
        return 0;
    }

    public int getOutgoingLayoutId() {
        return Conversation.rightlayID(R.layout.layout01d9);
    }

    public float getTextFontSize() {
        float textFontSize = super.getTextFontSize();
        float A002 = AnonymousClass1PH.A00(this, this.A0O, textFontSize);
        return A002 != -1.0f ? A002 : textFontSize;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C30581cc);
        this.A0O = r2;
    }
}
