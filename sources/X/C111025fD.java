package X;

import android.view.View;

/* renamed from: X.5fD  reason: invalid class name and case insensitive filesystem */
public abstract class C111025fD extends C005602k {
    public C111025fD(View view) {
        super(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C116235r3 r27) {
        /*
            r26 = this;
            r5 = r27
            r15 = r26
            boolean r0 = r15 instanceof X.C113195le
            if (r0 == 0) goto L_0x003f
            X.5le r15 = (X.C113195le) r15
            X.5lU r5 = (X.C113095lU) r5
            com.obwhatsapp.WaImageView r1 = r15.A00
            int r0 = r5.A01
            float r0 = (float) r0
            r1.setRotation(r0)
            android.view.View r6 = r15.A0H
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r1 = r5.A02
            r3 = 0
            if (r1 != 0) goto L_0x0036
            r2 = 0
        L_0x0022:
            int r1 = r5.A00
            if (r1 == 0) goto L_0x002e
            android.content.res.Resources r0 = X.C13680ns.A0D(r6)
            int r3 = r0.getDimensionPixelSize(r1)
        L_0x002e:
            int r1 = r4.leftMargin
            int r0 = r4.rightMargin
            r4.setMargins(r1, r2, r0, r3)
        L_0x0035:
            return
        L_0x0036:
            android.content.res.Resources r0 = X.C13680ns.A0D(r6)
            int r2 = r0.getDimensionPixelSize(r1)
            goto L_0x0022
        L_0x003f:
            boolean r0 = r15 instanceof X.C113265ll
            if (r0 == 0) goto L_0x00df
            X.5ll r15 = (X.C113265ll) r15
            r4 = r5
            X.5lT r4 = (X.C113085lT) r4
            int r1 = r5.A00
            r0 = 12
            android.view.View r7 = r15.A0H
            android.content.Context r5 = r7.getContext()
            if (r1 == r0) goto L_0x00ba
            int r6 = r4.A00
            X.5sT r3 = X.C113265ll.A00(r5, r6)
        L_0x005a:
            android.graphics.drawable.Drawable r1 = r3.A01
            android.content.res.Resources r0 = r7.getResources()
            int r5 = r3.A00
            int r0 = r0.getColor(r5)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A06(r1, r0)
            java.lang.String r1 = r3.A02
            com.obwhatsapp.WaTextView r8 = r15.A01
            android.text.TextPaint r0 = r8.getPaint()
            java.lang.CharSequence r1 = X.C56522nn.A00(r0, r2, r1)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r1)
            android.content.res.Resources r0 = r7.getResources()
            int r0 = r0.getColor(r5)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r1 = r1.length()
            r0 = 33
            r5 = 0
            r3.setSpan(r2, r5, r1, r0)
            r8.setText(r3)
            r3 = 0
            android.content.res.Resources r2 = r7.getResources()
            r1 = 3
            r0 = 2131232254(0x7f0805fe, float:1.8080612E38)
            if (r6 != r1) goto L_0x00a3
            r0 = 2131232255(0x7f0805ff, float:1.8080614E38)
        L_0x00a3:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00X.A04(r3, r2, r0)
            r8.setBackground(r0)
            java.lang.String r1 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            com.obwhatsapp.WaTextView r2 = r15.A00
            if (r0 == 0) goto L_0x0367
            r0 = 8
        L_0x00b6:
            r2.setVisibility(r0)
            return
        L_0x00ba:
            X.1Vz r2 = r4.A01
            int r6 = r4.A00
            X.5sT r3 = X.C113265ll.A00(r5, r6)
            r0 = 1
            if (r6 != r0) goto L_0x005a
            r1 = 2131101381(0x7f0606c5, float:1.781517E38)
            r0 = 2131166640(0x7f0705b0, float:1.7947531E38)
            android.graphics.drawable.Drawable r2 = X.C218315p.A02(r5, r2, r1, r0)
            r0 = 2131889860(0x7f120ec4, float:1.9414395E38)
            java.lang.String r1 = r5.getString(r0)
            int r0 = r3.A00
            X.5sT r3 = new X.5sT
            r3.<init>(r2, r1, r0)
            goto L_0x005a
        L_0x00df:
            boolean r0 = r15 instanceof X.C113175lc
            if (r0 != 0) goto L_0x0035
            boolean r0 = r15 instanceof X.C113225lh
            if (r0 == 0) goto L_0x0130
            X.5lh r15 = (X.C113225lh) r15
            X.5lR r5 = (X.C113065lR) r5
            boolean r0 = r5.A01
            r6 = 8
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0112
            com.obwhatsapp.TextEmojiLabel r4 = r15.A01
            X.0tz r0 = r15.A03
            android.content.Context r3 = r0.A00
            r2 = 2131889822(0x7f120e9e, float:1.9414318E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.C13680ns.A0d(r3, r0, r1, r7, r2)
            r4.setText(r0)
            android.view.View r0 = r15.A00
            r0.setVisibility(r7)
            com.obwhatsapp.WaTextView r0 = r15.A02
        L_0x010e:
            r0.setVisibility(r6)
            return
        L_0x0112:
            com.obwhatsapp.WaTextView r4 = r15.A02
            X.0tz r3 = r15.A03
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r5.A00
            r2[r7] = r0
            r1 = 2131889851(0x7f120ebb, float:1.9414377E38)
            android.content.res.Resources r0 = X.C16980tz.A00(r3)
            java.lang.String r0 = r0.getString(r1, r2)
            r4.setText(r0)
            r4.setVisibility(r7)
            android.view.View r0 = r15.A00
            goto L_0x010e
        L_0x0130:
            boolean r0 = r15 instanceof X.C113165lb
            if (r0 != 0) goto L_0x0035
            boolean r0 = r15 instanceof X.C113205lf
            if (r0 == 0) goto L_0x0173
            X.5lf r15 = (X.C113205lf) r15
            X.5lX r5 = (X.C113125lX) r5
            java.util.List r0 = r5.A05
            java.util.Iterator r6 = r0.iterator()
        L_0x0142:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x036e
            java.lang.Object r4 = r6.next()
            X.5ya r4 = (X.C119505ya) r4
            java.lang.String r1 = r4.A07
            java.lang.String r0 = r5.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0142
            com.obwhatsapp.WaTextView r3 = r15.A01
            X.16G r0 = r15.A02
            java.lang.String r2 = r4.A06
            java.lang.String r1 = r4.A05
            X.234 r0 = r0.A00()
            if (r0 == 0) goto L_0x016f
            java.util.Map r0 = r0.A02
            java.lang.String r0 = X.C13690nt.A0e(r2, r0)
            if (r0 == 0) goto L_0x016f
            r1 = r0
        L_0x016f:
            r3.setText(r1)
            goto L_0x0142
        L_0x0173:
            boolean r0 = r15 instanceof X.C113235li
            if (r0 == 0) goto L_0x0236
            X.5li r15 = (X.C113235li) r15
            X.5lY r5 = (X.C113135lY) r5
            X.0tj r3 = r5.A04
            X.0tn r0 = r3.AAt()
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0232
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0232
            X.0w8 r1 = r15.A06
            java.lang.String r0 = r0.A08
            boolean r14 = r1.A0D(r0)
            r2 = 1
        L_0x0192:
            boolean r0 = r5.A08
            r4 = 8
            if (r0 == 0) goto L_0x022c
            com.obwhatsapp.WaTextView r9 = r15.A04
            r9.setVisibility(r4)
            com.obwhatsapp.WaImageView r1 = r15.A02
            android.graphics.drawable.Drawable r0 = r5.A01
            r1.setImageDrawable(r0)
            r0 = 4
            if (r2 == 0) goto L_0x01a8
            r0 = 0
        L_0x01a8:
            r1.setVisibility(r0)
            if (r14 == 0) goto L_0x01e7
            X.0tZ r3 = (X.C16740tZ) r3
            X.1Vt r11 = r3.A0L
            if (r11 == 0) goto L_0x01e7
            long r0 = r11.A06
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x01e7
            boolean r0 = r11.A0A()
            if (r0 == 0) goto L_0x01e7
            r9.setVisibility(r6)
            android.view.View r0 = r15.A0H
            android.content.res.Resources r10 = r0.getResources()
            boolean r0 = r11.A0F()
            r8 = 2131889841(0x7f120eb1, float:1.9414357E38)
            if (r0 == 0) goto L_0x01d6
            r8 = 2131889842(0x7f120eb2, float:1.9414359E38)
        L_0x01d6:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.013 r2 = r15.A05
            long r0 = r11.A06
            java.lang.String r0 = X.C28891Zc.A03(r2, r0)
            java.lang.String r0 = X.C13700nu.A0F(r10, r0, r3, r6, r8)
            r9.setText(r0)
        L_0x01e7:
            android.widget.LinearLayout r1 = r15.A01
            r1.setVisibility(r6)
            r0 = 115(0x73, float:1.61E-43)
            X.C110105dW.A0r(r1, r5, r0)
        L_0x01f1:
            if (r14 != 0) goto L_0x021e
            java.lang.String r3 = r5.A05
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x021e
            android.view.View r0 = r15.A0H
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131889825(0x7f120ea1, float:1.9414325E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = X.C13700nu.A0F(r2, r3, r0, r6, r1)
        L_0x020a:
            com.obwhatsapp.WaTextView r0 = r15.A03
            r0.setText(r1)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x037a
            android.widget.LinearLayout r1 = r15.A00
            r1.setVisibility(r6)
            r0 = 114(0x72, float:1.6E-43)
            X.C110105dW.A0r(r1, r5, r0)
            return
        L_0x021e:
            android.view.View r0 = r15.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131889826(0x7f120ea2, float:1.9414327E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x020a
        L_0x022c:
            android.widget.LinearLayout r0 = r15.A01
            r0.setVisibility(r4)
            goto L_0x01f1
        L_0x0232:
            r14 = 0
            r2 = 0
            goto L_0x0192
        L_0x0236:
            boolean r0 = r15 instanceof X.C113215lg
            if (r0 == 0) goto L_0x028e
            X.5lg r15 = (X.C113215lg) r15
            X.5lW r5 = (X.C113115lW) r5
            com.obwhatsapp.WaImageView r6 = r15.A00
            r4 = 0
            r6.setVisibility(r4)
            X.0uh r3 = r15.A03
            android.view.View r2 = r15.A0H
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "payment-checkout-order-details-view"
            X.2Ao r1 = r3.A04(r1, r0)
            X.0sH r0 = r5.A00
            X.AnonymousClass00B.A06(r0)
            r1.A06(r6, r0)
            java.lang.String r3 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0274
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131889849(0x7f120eb9, float:1.9414373E38)
            java.lang.Object[] r0 = X.C13680ns.A1b()
            java.lang.String r0 = X.C13700nu.A0F(r2, r3, r0, r4, r1)
            r6.setContentDescription(r0)
        L_0x0274:
            boolean r0 = r5.A03
            com.obwhatsapp.WaTextView r1 = r15.A01
            if (r0 == 0) goto L_0x0288
            r1.setVisibility(r4)
            r1.setText(r3)
        L_0x0280:
            com.obwhatsapp.WaTextView r1 = r15.A02
            java.lang.String r0 = r5.A02
            r1.setText(r0)
            return
        L_0x0288:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0280
        L_0x028e:
            boolean r0 = r15 instanceof X.C113155la
            if (r0 != 0) goto L_0x0035
            boolean r0 = r15 instanceof X.C113185ld
            if (r0 == 0) goto L_0x02ad
            X.5ld r15 = (X.C113185ld) r15
            X.5lQ r5 = (X.C113055lQ) r5
            java.lang.String r1 = r5.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r15.A00
            if (r0 != 0) goto L_0x02aa
            r2.setText(r1)
            r0 = 0
            goto L_0x00b6
        L_0x02aa:
            r0 = 4
            goto L_0x00b6
        L_0x02ad:
            boolean r0 = r15 instanceof X.C113255lk
            if (r0 == 0) goto L_0x0035
            X.5lk r15 = (X.C113255lk) r15
            X.5lV r5 = (X.C113105lV) r5
            X.013 r4 = r5.A00
            X.1lc r2 = r5.A01
            X.1lZ r9 = r2.A05
            X.1lY r6 = r9.A06
            java.lang.String r22 = r2.A04(r4, r6)
            java.lang.String r7 = r5.A02
            X.1lY r1 = r9.A04
            java.lang.String r24 = r2.A04(r4, r1)
            X.1lY r0 = r9.A05
            java.lang.String r20 = r2.A04(r4, r0)
            java.lang.String r3 = r2.A03(r4)
            r2 = 0
            if (r6 != 0) goto L_0x0363
            r8 = r2
        L_0x02d7:
            X.1lY r0 = r9.A03
            if (r0 != 0) goto L_0x035f
            r6 = r2
        L_0x02dc:
            if (r1 == 0) goto L_0x02e0
            java.lang.String r2 = r1.A02
        L_0x02e0:
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            r9 = 8
            r1 = 0
            if (r0 == 0) goto L_0x0311
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0311
            boolean r0 = android.text.TextUtils.isEmpty(r24)
            if (r0 == 0) goto L_0x0311
            r15.A08(r9)
        L_0x02f8:
            com.obwhatsapp.WaTextView r2 = r15.A0A
            r2.setText(r3)
            boolean r1 = r5.A03
            com.obwhatsapp.WaTextView r0 = r15.A0B
            int r1 = X.C13680ns.A02(r1)
            r0.setVisibility(r1)
            r2.setVisibility(r1)
            android.view.View r0 = r15.A00
            r0.setVisibility(r1)
            return
        L_0x0311:
            r15.A08(r1)
            com.obwhatsapp.WaTextView r1 = r15.A06
            com.obwhatsapp.WaTextView r0 = r15.A07
            r21 = 2131889868(0x7f120ecc, float:1.9414412E38)
            r19 = 0
            r17 = r0
            r18 = r4
            r16 = r1
            r15.A09(r16, r17, r18, r19, r20, r21)
            com.obwhatsapp.WaTextView r1 = r15.A08
            com.obwhatsapp.WaTextView r0 = r15.A09
            r23 = 2131889869(0x7f120ecd, float:1.9414414E38)
            r17 = r15
            r18 = r1
            r19 = r0
            r20 = r4
            r21 = r8
            r17.A09(r18, r19, r20, r21, r22, r23)
            com.obwhatsapp.WaTextView r1 = r15.A02
            com.obwhatsapp.WaTextView r0 = r15.A03
            r14 = 2131889821(0x7f120e9d, float:1.9414316E38)
            r8 = r15
            r9 = r1
            r10 = r0
            r11 = r4
            r12 = r6
            r13 = r7
            r8.A09(r9, r10, r11, r12, r13, r14)
            com.obwhatsapp.WaTextView r1 = r15.A04
            com.obwhatsapp.WaTextView r0 = r15.A05
            r25 = 2131889852(0x7f120ebc, float:1.941438E38)
            r19 = r15
            r20 = r1
            r21 = r0
            r22 = r4
            r23 = r2
            r19.A09(r20, r21, r22, r23, r24, r25)
            goto L_0x02f8
        L_0x035f:
            java.lang.String r6 = r0.A02
            goto L_0x02dc
        L_0x0363:
            java.lang.String r8 = r6.A02
            goto L_0x02d7
        L_0x0367:
            r2.setText(r1)
            r2.setVisibility(r5)
            return
        L_0x036e:
            android.view.View r2 = r15.A00
            r1 = 0
            com.whatsapp.util.IDxCListenerShape24S0200000_3_I1 r0 = new com.whatsapp.util.IDxCListenerShape24S0200000_3_I1
            r0.<init>(r5, r1, r15)
            r2.setOnClickListener(r0)
            return
        L_0x037a:
            android.widget.LinearLayout r0 = r15.A00
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111025fD.A07(X.5r3):void");
    }
}
