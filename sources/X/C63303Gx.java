package X;

import android.view.View;

/* renamed from: X.3Gx  reason: invalid class name and case insensitive filesystem */
public class C63303Gx implements AnonymousClass5QM {
    public View A00;
    public final C30991dI A01;

    public C63303Gx(C30991dI r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0305, code lost:
        if (r12 != false) goto L_0x0307;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View AGx(android.content.Context r30, android.view.View r31, android.view.ViewGroup r32, X.AnonymousClass2Ao r33, java.util.List r34, java.util.List r35, java.util.List r36, java.util.List r37, boolean r38) {
        /*
            r29 = this;
            r10 = r31
            if (r31 != 0) goto L_0x03ee
            r3 = r30
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131559804(0x7f0d057c, float:1.8744962E38)
            r2 = r32
            android.view.View r10 = X.C13680ns.A0H(r1, r2, r0)
            X.01F r1 = X.C13700nu.A0A(r3)
            X.2rc r0 = new X.2rc
            r2 = r33
            r0.<init>(r3, r10, r1, r2)
            r10.setTag(r0)
        L_0x0021:
            r1 = r29
            r1.A00 = r10
            X.1dI r1 = r1.A01
            r26 = r1
            com.whatsapp.jid.UserJid r1 = r1.A0B
            r0.A02 = r1
            int r1 = r26.A01()
            r0.A01 = r1
            X.01F r1 = r0.A0A
            r17 = r1
            r9 = r17
            X.0sX r9 = (X.C16150sX) r9
            X.01J r1 = r9.AND
            java.lang.Object r2 = r1.get()
            X.128 r2 = (X.AnonymousClass128) r2
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.0tZ r12 = r2.A00(r1)
            boolean r1 = r26.A0B()
            r11 = 1
            r8 = 8
            r7 = 0
            r28 = r34
            if (r1 == 0) goto L_0x03be
            X.1cU r6 = r0.A0B
            r6.A04()
            android.widget.FrameLayout r2 = r0.A05
            if (r12 == 0) goto L_0x03b9
            android.content.Context r4 = r0.A03
            r1 = 2131889581(0x7f120dad, float:1.941383E38)
            X.C13680ns.A0t(r4, r2, r1)
            r1 = 28
            X.C13680ns.A19(r2, r0, r1)
            r2.setVisibility(r7)
            android.widget.ImageView r3 = r0.A06
            r1 = 2131231757(0x7f08040d, float:1.8079604E38)
            r3.setImageResource(r1)
            boolean r2 = r28.isEmpty()
            r1 = 2131101508(0x7f060744, float:1.7815428E38)
            if (r2 == 0) goto L_0x0082
            r1 = 2131101513(0x7f060749, float:1.7815438E38)
        L_0x0082:
            int r2 = X.AnonymousClass00T.A00(r4, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r2, r1)
        L_0x008b:
            com.whatsapp.jid.UserJid r1 = r0.A02
            boolean r1 = X.C16030sJ.A0P(r1)
            if (r1 != 0) goto L_0x03a7
            android.widget.TextView r5 = r0.A09
            r5.setVisibility(r7)
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            android.content.Context r4 = r0.A03
            r1 = 2131100935(0x7f060507, float:1.7814265E38)
            X.C30521cU.A00(r4, r6, r1)
            com.obwhatsapp.TextEmojiLabel r1 = r6.A02
            r1.A0A()
        L_0x00a8:
            java.lang.String r11 = ""
            r27 = r35
            if (r12 == 0) goto L_0x0331
            com.whatsapp.jid.UserJid r1 = r0.A02
            boolean r1 = X.C16030sJ.A0P(r1)
            if (r1 == 0) goto L_0x0263
            android.widget.ImageView r3 = r0.A08
            r3.setTag(r11)
            X.0ud r2 = X.C16150sX.A0L(r9)
            X.0sG r1 = X.C16150sX.A0M(r9)
            X.1kv r1 = r1.A04
            X.1ku r1 = r1.A00
            r2.A06(r3, r1)
        L_0x00ca:
            int r12 = r28.size()
            int r13 = r27.size()
            int r11 = r36.size()
            int r2 = r12 + r13
            int r2 = r2 + r11
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x0203
            if (r2 == 0) goto L_0x0203
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r16 = 1
            if (r12 <= 0) goto L_0x00fd
            android.content.res.Resources r1 = r0.A04
            r15 = r1
            r14 = 2131755159(0x7f100097, float:1.914119E38)
            r1 = r16
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r1, r12, r7)
            java.lang.String r1 = r15.getQuantityString(r14, r12, r1)
            r2.add(r1)
        L_0x00fd:
            if (r13 <= 0) goto L_0x0113
            android.content.res.Resources r1 = r0.A04
            r15 = r1
            r14 = 2131755315(0x7f100133, float:1.9141506E38)
            r1 = r16
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r1, r13, r7)
            java.lang.String r1 = r15.getQuantityString(r14, r13, r1)
            r2.add(r1)
        L_0x0113:
            if (r11 <= 0) goto L_0x0128
            android.content.res.Resources r14 = r0.A04
            r13 = 2131755061(0x7f100035, float:1.914099E38)
            r1 = r16
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r1, r11, r7)
            java.lang.String r1 = r14.getQuantityString(r13, r11, r1)
            r2.add(r1)
        L_0x0128:
            int r13 = r2.size()
            r11 = 3
            r14 = 2
            if (r13 != r11) goto L_0x01ec
            r13 = 2131892132(0x7f1217a4, float:1.9419004E38)
            java.lang.Object[] r11 = X.C13690nt.A1a(r2, r11)
            java.lang.Object r1 = r2.get(r14)
            r11[r14] = r1
        L_0x013d:
            java.lang.String r1 = r4.getString(r13, r11)
        L_0x0141:
            r5.setText(r1)
            if (r12 == 0) goto L_0x0147
            r7 = 1
        L_0x0147:
            r1 = 2131232196(0x7f0805c4, float:1.8080494E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A00(r4, r1)
            if (r7 == 0) goto L_0x0157
            r1 = 2131232178(0x7f0805b2, float:1.8080458E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00T.A04(r4, r1)
        L_0x0157:
            X.013 r1 = r17.Ai9()
            X.25m r11 = new X.25m
            r11.<init>(r2, r1)
            X.013 r1 = r17.Ai9()
            boolean r1 = r1.A0T()
            r7 = 0
            r2 = r11
            if (r1 == 0) goto L_0x016d
            r2 = r7
        L_0x016d:
            X.013 r1 = r17.Ai9()
            boolean r1 = r1.A0T()
            if (r1 != 0) goto L_0x0178
            r11 = r7
        L_0x0178:
            r5.setCompoundDrawablesWithIntrinsicBounds(r2, r7, r11, r7)
        L_0x017b:
            boolean r1 = r3 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r1 == 0) goto L_0x01e6
            r2 = r3
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r1 = 0
            r2.setProfileBadge(r1)
        L_0x0186:
            X.01J r1 = r9.A3y
            java.lang.Object r2 = r1.get()
            X.0sf r2 = (X.C16220sf) r2
            com.whatsapp.jid.UserJid r1 = r0.A02
            boolean r7 = r2.A0R(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x019a
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x019a:
            com.obwhatsapp.TextEmojiLabel r1 = r6.A02
            r1.setAlpha(r2)
            r5.setAlpha(r2)
            r3.setAlpha(r2)
            boolean r1 = r3 instanceof com.obwhatsapp.status.ContactStatusThumbnail
            if (r1 == 0) goto L_0x0413
            r5 = 0
            if (r7 == 0) goto L_0x01dd
            r2 = 0
        L_0x01ad:
            r1 = r3
            com.obwhatsapp.status.ContactStatusThumbnail r1 = (com.obwhatsapp.status.ContactStatusThumbnail) r1
            java.util.Map r6 = r1.A06
            r6.clear()
            r1.A05(r5, r2)
            if (r7 != 0) goto L_0x04a8
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x04a8
            java.util.Iterator r5 = r28.iterator()
        L_0x01c4:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x03f6
            java.lang.Object r2 = r5.next()
            r1 = 2131101508(0x7f060744, float:1.7815428E38)
            int r1 = X.AnonymousClass00T.A00(r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.put(r2, r1)
            goto L_0x01c4
        L_0x01dd:
            int r2 = r26.A01()
            int r5 = r26.A02()
            goto L_0x01ad
        L_0x01e6:
            android.widget.ImageView r1 = r0.A07
            r1.setVisibility(r8)
            goto L_0x0186
        L_0x01ec:
            int r1 = r2.size()
            if (r1 != r14) goto L_0x01fb
            r13 = 2131892317(0x7f12185d, float:1.9419379E38)
            java.lang.Object[] r11 = X.C13690nt.A1a(r2, r14)
            goto L_0x013d
        L_0x01fb:
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0141
        L_0x0203:
            r17.Agj()
            X.013 r12 = r17.Ai9()
            X.0t3 r11 = r17.Agj()
            long r1 = r26.A04()
            long r1 = r11.A02(r1)
            java.lang.CharSequence r12 = X.C28961Zl.A01(r12, r1)
            r5.setText(r12)
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            int r15 = r26.A02()
            int r14 = r26.A01()
            r11 = 1
            android.content.res.Resources r13 = r0.A04
            if (r15 <= 0) goto L_0x0256
            r2 = 2131755368(0x7f100168, float:1.9141613E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.AnonymousClass000.A1M(r1, r15, r7)
            java.lang.String r7 = r13.getQuantityString(r2, r15, r1)
        L_0x0239:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r2.append(r12)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r7, r2)
            r5.setContentDescription(r1)
            r5.setImportantForAccessibility(r11)
            r1 = 2131892115(0x7f121793, float:1.941897E38)
            r0.A00 = r1
            goto L_0x017b
        L_0x0256:
            r2 = 2131755369(0x7f100169, float:1.9141615E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.AnonymousClass000.A1M(r1, r14, r7)
            java.lang.String r7 = r13.getQuantityString(r2, r14, r1)
            goto L_0x0239
        L_0x0263:
            boolean r1 = r12 instanceof X.C38701rH
            if (r1 == 0) goto L_0x027f
            boolean r1 = r0.A0F
            if (r1 == 0) goto L_0x027f
            X.1rH r12 = (X.C38701rH) r12
            int r1 = X.AnonymousClass47Y.A00(r4, r12)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass47Z.A00(r4, r1)
            android.widget.ImageView r3 = r0.A08
            r3.setTag(r11)
        L_0x027a:
            r3.setImageDrawable(r1)
            goto L_0x00ca
        L_0x027f:
            boolean r1 = r12 instanceof X.C16730tY
            if (r1 == 0) goto L_0x02ae
            r13 = r12
            X.0tY r13 = (X.C16730tY) r13
            X.0ta r2 = X.C16730tY.A00(r13)
            if (r38 == 0) goto L_0x0297
            X.01J r1 = r9.ANO
            java.lang.Object r1 = r1.get()
            X.1Af r1 = (X.C23031Af) r1
            r1.A00(r12)
        L_0x0297:
            boolean r11 = r2.A03()
            X.01J r1 = r9.AFY
            java.lang.Object r2 = r1.get()
            X.1Ld r2 = (X.C25791Ld) r2
            android.widget.ImageView r3 = r0.A08
            X.52d r1 = r0.A0D
            if (r11 != 0) goto L_0x032c
            r2.A08(r3, r13, r1)
            goto L_0x00ca
        L_0x02ae:
            byte r2 = r12.A10
            if (r2 == 0) goto L_0x02c4
            r1 = 27
            if (r2 == r1) goto L_0x02c4
            android.widget.ImageView r3 = r0.A08
            r3.setTag(r11)
            int r1 = X.C1036352d.A00(r12)
            r3.setImageResource(r1)
            goto L_0x00ca
        L_0x02c4:
            android.widget.ImageView r3 = r0.A08
            r3.setTag(r11)
            java.lang.String r11 = X.C47622Js.A05(r12)
            X.1cc r12 = (X.C30581cc) r12
            com.obwhatsapp.TextData r2 = r12.A02
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            X.0um r23 = X.C16150sX.A0i(r9)
            X.01V r22 = X.C16150sX.A0T(r9)
            X.0u3 r24 = X.C16150sX.A14(r9)
            int r13 = r11.length()
            r12 = 700(0x2bc, float:9.81E-43)
            if (r13 <= r12) goto L_0x02ed
            java.lang.String r11 = r11.substring(r7, r12)
        L_0x02ed:
            if (r2 != 0) goto L_0x0325
            android.graphics.Typeface r20 = android.graphics.Typeface.SANS_SERIF
        L_0x02f1:
            boolean r12 = r1 instanceof X.C56342nU
            if (r12 == 0) goto L_0x0317
            X.2nU r1 = (X.C56342nU) r1
            java.lang.CharSequence r12 = r1.A07
            boolean r12 = X.C34901l3.A00(r12, r11)
            if (r12 == 0) goto L_0x0317
            com.obwhatsapp.TextData r12 = r1.A06
            boolean r12 = X.C34901l3.A00(r12, r2)
            if (r12 == 0) goto L_0x0317
        L_0x0307:
            boolean r2 = r3 instanceof com.obwhatsapp.status.ContactStatusThumbnail
            if (r2 == 0) goto L_0x027a
            r2 = r3
            com.obwhatsapp.components.button.ThumbnailButton r2 = (com.obwhatsapp.components.button.ThumbnailButton) r2
            float r11 = r2.A01
            r2 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r2
            r1.A00 = r11
            goto L_0x027a
        L_0x0317:
            X.2nU r1 = new X.2nU
            r18 = r1
            r19 = r4
            r21 = r2
            r25 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0307
        L_0x0325:
            int r12 = r2.fontStyle
            android.graphics.Typeface r20 = X.C47622Js.A03(r4, r12)
            goto L_0x02f1
        L_0x032c:
            r2.A07(r3, r13, r1)
            goto L_0x00ca
        L_0x0331:
            android.widget.ImageView r3 = r0.A08
            r3.setTag(r11)
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x038f
            X.01J r8 = r9.ADr
            java.lang.Object r1 = r8.get()
            X.0sK r1 = (X.C16040sK) r1
            r1.A0B()
            X.1Zb r2 = r1.A01
            if (r2 == 0) goto L_0x0350
            X.2Ao r1 = r0.A0C
            r1.A06(r3, r2)
        L_0x0350:
            java.lang.Object r1 = r8.get()
            X.0sK r1 = (X.C16040sK) r1
            boolean r1 = r1.A0G()
            if (r1 == 0) goto L_0x0367
            r1 = 2131889680(0x7f120e10, float:1.941403E38)
            r5.setText(r1)
        L_0x0362:
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            goto L_0x0186
        L_0x0367:
            android.widget.ImageView r2 = r0.A07
            r1 = 2131232206(0x7f0805ce, float:1.8080515E38)
            r2.setBackgroundResource(r1)
            boolean r1 = r3 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r1 == 0) goto L_0x038b
            r2 = r3
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            X.2IH r1 = r0.A0E
            r2.setProfileBadge(r1)
        L_0x037b:
            r1 = 2131886279(0x7f1200c7, float:1.9407132E38)
            r5.setText(r1)
            r1 = 2
            r5.setImportantForAccessibility(r1)
            r1 = 2131892114(0x7f121792, float:1.9418967E38)
            r0.A00 = r1
            goto L_0x0362
        L_0x038b:
            r2.setVisibility(r7)
            goto L_0x037b
        L_0x038f:
            r2 = 0
            r3.setImageDrawable(r2)
            r5.setText(r11)
            boolean r1 = r3 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r1 == 0) goto L_0x03a1
            r1 = r3
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            r1.setProfileBadge(r2)
            goto L_0x0362
        L_0x03a1:
            android.widget.ImageView r1 = r0.A07
            r1.setVisibility(r8)
            goto L_0x0362
        L_0x03a7:
            android.content.Context r4 = r0.A03
            r1 = 2131100936(0x7f060508, float:1.7814268E38)
            X.C30521cU.A00(r4, r6, r1)
            android.widget.TextView r5 = r0.A09
            r5.setVisibility(r8)
            r6.A07(r11)
            goto L_0x00a8
        L_0x03b9:
            r2.setVisibility(r8)
            goto L_0x008b
        L_0x03be:
            X.0sG r2 = X.C16150sX.A0M(r9)
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.0sH r2 = r2.A0A(r1)
            X.0sP r1 = X.C16150sX.A0Q(r9)
            java.lang.String r4 = r1.A0D(r2)
            X.1cU r6 = r0.A0B
            r1 = r37
            r6.A0F(r1, r4)
            android.widget.FrameLayout r1 = r0.A05
            r1.setVisibility(r8)
            android.content.Context r3 = r0.A03
            r2 = 2131892118(0x7f121796, float:1.9418975E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = X.C13680ns.A0d(r3, r4, r1, r7, r2)
            com.obwhatsapp.TextEmojiLabel r1 = r6.A02
            r1.setContentDescription(r2)
            goto L_0x008b
        L_0x03ee:
            java.lang.Object r0 = r10.getTag()
            X.2rc r0 = (X.C57702rc) r0
            goto L_0x0021
        L_0x03f6:
            java.util.Iterator r5 = r27.iterator()
        L_0x03fa:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x04a8
            java.lang.Object r2 = r5.next()
            r1 = 2131101512(0x7f060748, float:1.7815436E38)
            int r1 = X.AnonymousClass00T.A00(r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.put(r2, r1)
            goto L_0x03fa
        L_0x0413:
            boolean r1 = r3 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r1 == 0) goto L_0x04a8
            r6 = 0
            if (r7 == 0) goto L_0x045c
            r5 = 0
            r8 = 0
        L_0x041c:
            java.util.HashSet r7 = new java.util.HashSet
            r1 = r28
            r7.<init>(r1)
            java.util.HashSet r11 = new java.util.HashSet
            r1 = r27
            r11.<init>(r1)
            r4 = r3
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r4 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r4
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r12 = 0
        L_0x0432:
            if (r12 >= r5) goto L_0x049a
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x0448
            boolean r1 = X.C13700nu.A0h(r7, r12)
            if (r1 == 0) goto L_0x0448
            X.42X r1 = X.AnonymousClass42X.A01
        L_0x0442:
            r2.add(r1)
            int r12 = r12 + 1
            goto L_0x0432
        L_0x0448:
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x0457
            boolean r1 = X.C13700nu.A0h(r11, r12)
            if (r1 == 0) goto L_0x0457
        L_0x0454:
            X.42X r1 = X.AnonymousClass42X.A03
            goto L_0x0442
        L_0x0457:
            if (r12 < r8) goto L_0x0454
            X.42X r1 = X.AnonymousClass42X.A02
            goto L_0x0442
        L_0x045c:
            int r5 = r26.A01()
            r1 = 32
            if (r5 <= r1) goto L_0x0495
            int r1 = r26.A02()
            if (r1 > 0) goto L_0x0492
            int r1 = r27.size()
            if (r1 > 0) goto L_0x0492
            int r1 = r28.size()
            if (r1 <= 0) goto L_0x048f
            X.42X r4 = X.AnonymousClass42X.A01
        L_0x0478:
            r2 = r3
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            int r1 = r26.A01()
            boolean r1 = X.AnonymousClass000.A1Q(r1)
            r2.setStatusIndicatorEnabled(r1)
            X.3zx r1 = new X.3zx
            r1.<init>(r4)
            r2.setProfileStatus(r1)
            goto L_0x04a8
        L_0x048f:
            X.42X r4 = X.AnonymousClass42X.A02
            goto L_0x0478
        L_0x0492:
            X.42X r4 = X.AnonymousClass42X.A03
            goto L_0x0478
        L_0x0495:
            int r8 = r26.A02()
            goto L_0x041c
        L_0x049a:
            X.3zy r1 = new X.3zy
            r1.<init>(r2)
            r4.setProfileStatus(r1)
            if (r5 <= 0) goto L_0x04a5
            r6 = 1
        L_0x04a5:
            r4.setStatusIndicatorEnabled(r6)
        L_0x04a8:
            X.01J r1 = r9.ART
            r1.get()
            android.view.View r4 = r3.getRootView()
            android.view.View r3 = r3.getRootView()
            r2 = 3
            com.facebook.redex.IDxDCompatShape4S0200000_2_I1 r1 = new com.facebook.redex.IDxDCompatShape4S0200000_2_I1
            r1.<init>(r4, r2, r0)
            X.C004601z.A0j(r3, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63303Gx.AGx(android.content.Context, android.view.View, android.view.ViewGroup, X.2Ao, java.util.List, java.util.List, java.util.List, java.util.List, boolean):android.view.View");
    }
}
