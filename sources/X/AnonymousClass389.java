package X;

/* renamed from: X.389  reason: invalid class name */
public class AnonymousClass389 {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2.size() >= 3) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C30011bb r14, X.AnonymousClass1YG r15, com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout r16, com.obwhatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout r17, X.AnonymousClass013 r18, X.C39261sB r19) {
        /*
            r4 = 0
            r0 = r19
            if (r19 == 0) goto L_0x003f
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.List r3 = r0.A02
            java.util.Iterator r2 = r3.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            X.1t7 r1 = (X.C39821t7) r1
            X.1lK r0 = r1.A02
            if (r0 != 0) goto L_0x000f
            r4.add(r1)
            goto L_0x000f
        L_0x0023:
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.1t7 r1 = (X.C39821t7) r1
            X.1lK r0 = r1.A02
            if (r0 == 0) goto L_0x002b
            r2.add(r1)
            goto L_0x002b
        L_0x003f:
            r2 = r4
        L_0x0040:
            r9 = 0
            r11 = 8
            r1 = r16
            if (r15 == 0) goto L_0x0175
            boolean r0 = r15.AfN()
            if (r0 == 0) goto L_0x0175
            if (r4 == 0) goto L_0x0175
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0175
            X.38Z r0 = r14.A1o
            r1.A04(r0, r4)
            r1.setVisibility(r9)
        L_0x005d:
            r10 = r17
            if (r2 == 0) goto L_0x017e
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x017e
            int r0 = r2.size()
            r8 = 0
            if (r0 <= 0) goto L_0x0076
            int r3 = r2.size()
            r1 = 3
            r0 = 1
            if (r3 < r1) goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            X.AnonymousClass00B.A0F(r0)
            com.obwhatsapp.TextEmojiLabel[] r7 = r10.A08
            r0 = r7[r9]
            r0.setVisibility(r11)
            android.view.View[] r6 = r10.A07
            r0 = r6[r9]
            r0.setVisibility(r11)
            r1 = 1
            r0 = r7[r1]
            r0.setVisibility(r11)
            r0 = r6[r1]
            r0.setVisibility(r11)
            android.view.View r12 = r10.A03
            r12.setVisibility(r11)
            android.view.View r4 = r10.A04
            r4.setVisibility(r11)
            java.util.List r5 = r10.A06
            r5.clear()
            r5.addAll(r2)
            r3 = 0
            java.lang.Object r0 = r5.get(r9)
            X.1t7 r0 = (X.C39821t7) r0
            X.1lK r0 = r0.A02
            if (r0 == 0) goto L_0x00b9
            X.0wH r2 = r10.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            r2.A01(r1, r0)
        L_0x00b9:
            r13 = -2
            r2 = 1
            android.widget.LinearLayout r0 = r10.A05
            r0.setOrientation(r2)
            r0 = -1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r13)
            r0 = r6[r9]
            r0.setLayoutParams(r1)
            r0 = r6[r2]
            r0.setLayoutParams(r1)
            int r0 = r5.size()
            if (r0 > r2) goto L_0x00d8
            r3 = 8
        L_0x00d8:
            r12.setVisibility(r3)
            r4.setVisibility(r11)
        L_0x00de:
            int r0 = r5.size()
            if (r8 >= r0) goto L_0x017a
            java.lang.Object r1 = r5.get(r8)
            X.1t7 r1 = (X.C39821t7) r1
            X.AnonymousClass00B.A06(r1)
            X.1lK r11 = r1.A02
            if (r11 == 0) goto L_0x0173
            X.0wH r3 = r10.A00
            java.lang.String r2 = r11.A00
            java.lang.String r0 = r11.A01
            X.1Qr r12 = r3.A01(r2, r0)
        L_0x00fb:
            r3 = r7[r8]
            r4 = r6[r8]
            r3.setVisibility(r9)
            float r0 = r14.getTextFontSize()
            r3.setTextSize(r0)
            r4.setVisibility(r9)
            X.AnonymousClass00B.A06(r11)
            X.0wH r13 = r10.A00
            java.lang.String r2 = r11.A00
            java.lang.String r0 = r11.A01
            X.1Qr r2 = r13.A01(r2, r0)
            if (r2 != 0) goto L_0x016a
            r11 = 0
        L_0x011c:
            r3.setText(r11)
            boolean r0 = r1.A00
            r3.setSelected(r0)
            if (r12 == 0) goto L_0x013a
            boolean r0 = r12 instanceof X.C27141Qp
            if (r0 == 0) goto L_0x013a
            r2 = 2131232610(0x7f080762, float:1.8081334E38)
            android.content.Context r0 = r10.getContext()
            r12 = r18
            X.25m r0 = X.C447725m.A00(r0, r12, r2)
            r3.A0D(r0)
        L_0x013a:
            boolean r0 = r1.A00
            r3 = 1
            if (r0 == 0) goto L_0x0161
            r4.setClickable(r9)
        L_0x0142:
            android.content.Context r2 = r10.getContext()
            r1 = 2131886118(0x7f120026, float:1.9406806E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C13680ns.A0d(r2, r11, r0, r9, r1)
            r4.setContentDescription(r0)
            r4.setLongClickable(r3)
            X.3P7 r0 = new X.3P7
            r0.<init>(r10, r11)
            X.C004601z.A0j(r4, r0)
            int r8 = r8 + 1
            goto L_0x00de
        L_0x0161:
            r4.setClickable(r3)
            r0 = 12
            X.C13680ns.A1C(r4, r1, r14, r0)
            goto L_0x0142
        L_0x016a:
            android.content.Context r0 = r10.getContext()
            java.lang.String r11 = r2.A01(r0, r11)
            goto L_0x011c
        L_0x0173:
            r12 = 0
            goto L_0x00fb
        L_0x0175:
            r1.setVisibility(r11)
            goto L_0x005d
        L_0x017a:
            r10.setVisibility(r9)
            return
        L_0x017e:
            r10.setVisibility(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass389.A00(X.1bb, X.1YG, com.obwhatsapp.conversation.conversationrow.DynamicButtonsLayout, com.obwhatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout, X.013, X.1sB):void");
    }
}
