package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.2z6  reason: invalid class name and case insensitive filesystem */
public class C59832z6 extends C72823ml {
    public final TextEmojiLabel A00;
    public final C25641Ko A01;
    public final C25651Kp A02;

    public C59832z6(View view, C25641Ko r3, C25651Kp r4) {
        super(view);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = C13680ns.A0Q(view, R.id.privacy_description);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3 == r2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A08(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            X.3lP r1 = (X.C72003lP) r1
            r4 = r17
            X.1Ko r0 = r4.A01
            X.26B r0 = r0.A00()
            if (r0 == 0) goto L_0x0017
            X.41o r3 = r1.A01
            X.41o r2 = X.C798541o.SECURITY_FOOTER
            r0 = 2131886535(0x7f1201c7, float:1.9407652E38)
            if (r3 != r2) goto L_0x001a
        L_0x0017:
            r0 = 2131886534(0x7f1201c6, float:1.940765E38)
        L_0x001a:
            com.obwhatsapp.TextEmojiLabel r13 = r4.A00
            X.1Kp r11 = r4.A02
            android.view.View r2 = r4.A0H
            java.lang.String r3 = X.C13700nu.A0H(r2, r0)
            android.content.Context r12 = r13.getContext()
            java.lang.String r0 = "# "
            java.lang.String r14 = X.C13680ns.A0h(r0, r3)
            java.lang.String r15 = "security-and-privacy"
            java.lang.String r16 = "how-to-select-a-location-when-looking-for-businesses-nearby"
            r11.A00(r12, r13, r14, r15, r16)
            java.lang.CharSequence r6 = r13.getText()
            r5 = 2131231846(0x7f080466, float:1.8079785E38)
            r4 = 2131101381(0x7f0606c5, float:1.781517E38)
            android.content.Context r3 = r13.getContext()
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            r7.append(r0)
            android.graphics.drawable.Drawable r0 = X.C13690nt.A0C(r3, r5)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass2SR.A04(r3, r0, r4)
            android.text.TextPaint r5 = r13.getPaint()
            r8 = -1
            r9 = 0
            r10 = 1
            X.C56522nn.A02(r5, r6, r7, r8, r9, r10)
            r13.setText(r7)
            android.content.Context r12 = r2.getContext()
            java.lang.CharSequence r0 = r13.getText()
            android.view.View$OnClickListener r11 = r1.A00
            java.lang.String r10 = "clear-search-location"
            android.text.SpannableStringBuilder r9 = X.C13690nt.A0F(r0)
            int r1 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r8 = 0
            java.lang.Object[] r7 = r9.getSpans(r8, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x00bd
            int r6 = r7.length
        L_0x0086:
            if (r8 >= r6) goto L_0x00ba
            r5 = r7[r8]
            java.lang.String r0 = r5.getURL()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00b7
            int r4 = r9.getSpanStart(r5)
            int r3 = r9.getSpanEnd(r5)
            int r2 = r9.getSpanFlags(r5)
            r1 = 1
            com.obwhatsapp.IDxTSpanShape54S0100000_2_I1 r0 = new com.obwhatsapp.IDxTSpanShape54S0100000_2_I1
            r0.<init>((android.content.Context) r12, (java.lang.Object) r11, (int) r1)
            r9.setSpan(r0, r4, r3, r2)
            r1 = 2131951879(0x7f130107, float:1.9540185E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r12, r1)
            r9.setSpan(r0, r4, r3, r2)
            r9.removeSpan(r5)
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x0086
        L_0x00ba:
            r13.setText(r9)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59832z6.A08(java.lang.Object):void");
    }
}
