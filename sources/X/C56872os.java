package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextData;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2os  reason: invalid class name and case insensitive filesystem */
public class C56872os extends FrameLayout implements AnonymousClass006 {
    public CardView A00;
    public TextEmojiLabel A01;
    public AnonymousClass01V A02;
    public C26081Mg A03;
    public C17250um A04;
    public C17020u3 A05;
    public C30581cc A06;
    public AnonymousClass5QO A07;
    public AnonymousClass4WP A08;
    public C52662eE A09;
    public boolean A0A;
    public final List A0B;

    public C56872os(Context context) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A04 = C16150sX.A0i(A002);
            this.A02 = C16150sX.A0T(A002);
            this.A05 = C16150sX.A14(A002);
        }
        this.A0B = AnonymousClass000.A0u();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout0576, this, true);
        this.A01 = C13680ns.A0R(inflate, R.id.message_text);
        this.A00 = (CardView) inflate.findViewById(R.id.web_page_preview_container);
    }

    public static C56872os A00(Context context, C26081Mg r7, C30581cc r8) {
        C56872os r5 = new C56872os(context);
        TextData textData = r8.A02;
        if (textData != null) {
            r5.setTextContentProperties(textData);
        }
        r5.A06 = r8;
        r5.A03 = r7;
        r5.A07 = null;
        String A13 = r8.A13();
        String A132 = r8.A13();
        r5.setTextContent((A13 != null ? C47622Js.A04(A132, 0, r8.A13().length(), 10, 700) : C47622Js.A06(A132)).toString());
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r4.length <= 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setTextContent(java.lang.String r23) {
        /*
            r22 = this;
            r5 = r23
            android.text.SpannableStringBuilder r9 = X.C13690nt.A0F(r5)
            r7 = r22
            X.01V r1 = r7.A02
            X.0u3 r0 = r7.A05
            X.C45922Bq.A03(r1, r0, r9)
            X.C30931dC.A06(r9)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r6 = 0
            java.lang.Object[] r4 = r9.getSpans(r6, r1, r0)
            android.text.style.URLSpan[] r4 = (android.text.style.URLSpan[]) r4
            int r3 = X.C47622Js.A01(r5)
            com.obwhatsapp.TextEmojiLabel r15 = r7.A01
            X.C47622Js.A08(r15, r3)
            android.util.DisplayMetrics r1 = X.C13690nt.A0H(r7)
            int r0 = r1.heightPixels
            float r8 = (float) r0
            float r0 = r1.density
            float r8 = r8 / r0
            X.1Mg r10 = r7.A03
            if (r10 == 0) goto L_0x00f8
            X.1cc r2 = r7.A06
            if (r2 == 0) goto L_0x00f8
            int r0 = r4.length
            if (r0 <= 0) goto L_0x00f8
            r0 = r4[r6]
            java.lang.String r1 = r0.getURL()
            X.1cc r0 = r7.A06
            X.0rv r0 = r0.A0B()
            java.util.Set r2 = r10.A00(r0, r2, r1)
        L_0x004d:
            r0 = 350(0x15e, float:4.9E-43)
            r1 = 0
            if (r3 > r0) goto L_0x0053
            r1 = 1
        L_0x0053:
            X.1cc r0 = r7.A06
            if (r0 == 0) goto L_0x0065
            byte[] r0 = r0.A17()
            if (r0 == 0) goto L_0x0065
            if (r1 == 0) goto L_0x0065
            if (r2 != 0) goto L_0x0065
            int r0 = r4.length
            r1 = 1
            if (r0 > 0) goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            int r0 = (int) r8
            int r0 = X.C47622Js.A00(r3, r0, r1)
            r1 = 2
            float r0 = (float) r0
            r15.setTextSize(r1, r0)
            android.content.Context r2 = r7.getContext()
            android.text.TextPaint r1 = r15.getPaint()
            X.0um r0 = r7.A04
            X.AnonymousClass2Sy.A03(r2, r1, r0, r9)
            int r3 = r4.length
            r8 = 0
            r13 = 0
        L_0x0080:
            if (r8 >= r3) goto L_0x00fb
            r10 = r4[r8]
            java.lang.String r17 = r10.getURL()
            int r2 = r9.getSpanStart(r10)
            int r1 = r9.getSpanEnd(r10)
            int r0 = r1 - r2
            int r13 = r13 + r0
            r9.removeSpan(r10)
            java.lang.String r11 = X.C812247i.A00(r17)
            r9.replace(r2, r1, r11)
            int r0 = r11.length()
            int r1 = r2 + r0
            android.content.res.Resources r10 = r7.getResources()
            r0 = 2131167125(0x7f070795, float:1.7948515E38)
            float r0 = r10.getDimension(r0)
            int r12 = (int) r0
            float r10 = (float) r12
            r0 = 0
            r15.setShadowLayer(r10, r0, r0, r6)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r10 >= r0) goto L_0x00bf
            r10 = 0
            r0 = 1
            r15.setLayerType(r0, r10)
        L_0x00bf:
            r15.setPadding(r12, r12, r12, r12)
            float r0 = r15.getTextSize()
            int r10 = (int) r0
            java.lang.String r0 = "…"
            boolean r21 = r11.contains(r0)
            X.5QO r0 = r7.A07
            X.3Ej r14 = new X.3Ej
            r19 = r1
            r20 = r10
            r18 = r2
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r9.setSpan(r14, r2, r1, r6)
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r6 = r9.getSpans(r2, r1, r0)
            android.text.style.ImageSpan[] r6 = (android.text.style.ImageSpan[]) r6
            int r2 = r6.length
            r1 = 0
        L_0x00ea:
            if (r1 >= r2) goto L_0x00f4
            r0 = r6[r1]
            r9.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x00f4:
            int r8 = r8 + 1
            r6 = 0
            goto L_0x0080
        L_0x00f8:
            r2 = 0
            goto L_0x004d
        L_0x00fb:
            r15.setText(r9)
            r15.requestLayout()
            int r8 = X.C31011dK.A00(r5)
            int r2 = r5.length()
        L_0x0109:
            if (r6 >= r2) goto L_0x011f
            if (r8 <= 0) goto L_0x011f
            int r1 = r5.codePointAt(r6)
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 == 0) goto L_0x0119
            int r8 = r8 + -1
        L_0x0119:
            int r0 = java.lang.Character.charCount(r1)
            int r6 = r6 + r0
            goto L_0x0109
        L_0x011f:
            r5 = 2000(0x7d0, double:9.88E-321)
            int r8 = r8 - r13
            int r8 = r8 + r3
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = java.lang.Math.min(r8, r0)
            int r0 = r0 * 60
            long r1 = (long) r0
            long r1 = r1 + r5
            X.4WP r0 = new X.4WP
            r0.<init>(r1)
            r7.A08 = r0
            java.util.List r2 = r7.A0B
            r2.clear()
            r1 = 0
        L_0x013a:
            if (r1 >= r3) goto L_0x0148
            r0 = r4[r1]
            java.lang.String r0 = r0.getURL()
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x013a
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56872os.setTextContent(java.lang.String):void");
    }

    private void setTextContentProperties(TextData textData) {
        int i2 = textData.textColor;
        if (i2 != 0) {
            this.A01.setTextColor(i2);
        }
        int i3 = textData.backgroundColor;
        if (i3 != 0) {
            setBackgroundColor(i3);
        }
        this.A01.setTypeface(C47622Js.A03(getContext(), textData.fontStyle));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public List getDisplayedUrls() {
        return this.A0B;
    }

    public AnonymousClass4WP getStaticContentPlayer() {
        return this.A08;
    }

    public CardView getWebPagePreviewContainer() {
        return this.A00;
    }

    public void setLinkCallback(AnonymousClass5QO r1) {
        this.A07 = r1;
    }

    public void setMessage(C30581cc r1) {
        this.A06 = r1;
    }

    public void setPhishingManager(C26081Mg r1) {
        this.A03 = r1;
    }
}
