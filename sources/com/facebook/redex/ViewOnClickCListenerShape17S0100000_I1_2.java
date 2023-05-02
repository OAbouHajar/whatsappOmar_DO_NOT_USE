package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape17S0100000_I1_2 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape17S0100000_I1_2(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x033b, code lost:
        r1.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x033e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0477, code lost:
        r3.startActivity(new android.content.Intent(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x047f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04d5, code lost:
        X.C42821yj.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05a6, code lost:
        r5 = r0.A00;
        r10 = r5.A05;
        r11 = r5.A06.A08.A01();
        r2 = r5.A07.A00.iterator();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05bf, code lost:
        if (r2.hasNext() == false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05c1, code lost:
        r1 = (X.AnonymousClass1WN) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05cb, code lost:
        if (r1.A01() != false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05d3, code lost:
        if (X.C16030sJ.A0M(r1.A06) != false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05d5, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05d8, code lost:
        r2 = r5.A07.A05.A00.A02(X.C15910s6.A1M);
        com.whatsapp.util.Log.i(X.C13680ns.A0c(r4, "LinkedDevicesSharedViewModel/onLinkNewDeviceClicked devicePairFlowType: "));
        r1 = r10.A0K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05f5, code lost:
        if (r1.A1d() == false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05f7, code lost:
        if (r3 < r2) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05f9, code lost:
        X.C13680ns.A1O(r10.A0O, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05ff, code lost:
        r10.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0605, code lost:
        if (r1.A1d() == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x060e, code lost:
        if (r10.A0B.A04(true) == 1) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0610, code lost:
        r2 = X.C13680ns.A0B(r10.A0C).getLong("md_initial_sync_estimate_bytes", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0624, code lost:
        if (r2 < 0) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0633, code lost:
        if ((r2 / 1000) < ((long) r10.A07.A02(X.C15910s6.A21))) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0635, code lost:
        r10.A0P.A0B((java.lang.Object) null);
        r4 = r10.A09;
        r2 = java.lang.Math.min(r2, r2 / 1000);
        r1 = new X.C74423qW();
        r1.A00 = java.lang.Long.valueOf(r2);
        r4.A06.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0653, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0654, code lost:
        r10.A05(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0657, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0805, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x080a, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x080b, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0l(X.AnonymousClass000.A0q("cropimage/oom: "), r1), r12);
        r0 = r8.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0820, code lost:
        r8.A0B.recycle();
        r8.A0B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x082f, code lost:
        r9.recycle();
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0833, code lost:
        X.C13680ns.A10(r6);
        r1 = r1 << 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x083a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x083b, code lost:
        com.whatsapp.util.Log.e("cropimage/cannot_resample: ", r0);
        r8.setResult(0, com.obwhatsapp.crop.CropImage.A02());
        r8.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0848, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0299, code lost:
        X.AnonymousClass29T.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:34:0x00fb, B:266:0x07c2, B:268:0x07d0, B:286:0x0809] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:286:0x0809 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0118 */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x083a A[ExcHandler: IOException (r0v215 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:34:0x00fb] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0118=Splitter:B:43:0x0118, B:286:0x0809=Splitter:B:286:0x0809} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0254;
                case 1: goto L_0x06ac;
                case 2: goto L_0x067c;
                case 3: goto L_0x0672;
                case 4: goto L_0x0668;
                case 5: goto L_0x0660;
                case 6: goto L_0x0658;
                case 7: goto L_0x05a1;
                case 8: goto L_0x059b;
                case 9: goto L_0x0582;
                case 10: goto L_0x0658;
                case 11: goto L_0x054b;
                case 12: goto L_0x0532;
                case 13: goto L_0x0526;
                case 14: goto L_0x0516;
                case 15: goto L_0x050e;
                case 16: goto L_0x0505;
                case 17: goto L_0x0228;
                case 18: goto L_0x020b;
                case 19: goto L_0x01e1;
                case 20: goto L_0x04ea;
                case 21: goto L_0x04d9;
                case 22: goto L_0x01c5;
                case 23: goto L_0x016e;
                case 24: goto L_0x04cc;
                case 25: goto L_0x04c2;
                case 26: goto L_0x04ba;
                case 27: goto L_0x04b2;
                case 28: goto L_0x04aa;
                case 29: goto L_0x0658;
                case 30: goto L_0x013c;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x04a2;
                case 34: goto L_0x0480;
                case 35: goto L_0x046b;
                case 36: goto L_0x045e;
                case 37: goto L_0x0024;
                case 38: goto L_0x0452;
                case 39: goto L_0x0399;
                case 40: goto L_0x033f;
                case 41: goto L_0x0332;
                case 42: goto L_0x0328;
                case 43: goto L_0x02f5;
                case 44: goto L_0x02ed;
                case 45: goto L_0x0011;
                case 46: goto L_0x0658;
                case 47: goto L_0x02a6;
                case 48: goto L_0x0273;
                case 49: goto L_0x026a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.components.WaSwitchView r0 = (com.obwhatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            X.3SI r0 = (X.AnonymousClass3SI) r0
            X.4Kd r2 = r0.A00
            r1 = 1
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0010
            r2.A00 = r1
            X.027 r0 = r2.A01
            r0.A09(r2)
            return
        L_0x0024:
            java.lang.Object r8 = r1.A00
            com.obwhatsapp.crop.CropImage r8 = (com.obwhatsapp.crop.CropImage) r8
            X.2QO r0 = r8.A0M
            if (r0 == 0) goto L_0x0010
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x0010
            r11 = 1
            r8.A0X = r11
            com.obwhatsapp.crop.CropImageView r0 = r8.A0L
            r3 = 0
            r0.setEnabled(r3)
            com.obwhatsapp.crop.CropImageView r1 = r8.A0L
            java.util.ArrayList r0 = r1.A06
            r0.clear()
            r10 = 0
            r2 = 1
            X.2TL r0 = new X.2TL
            r0.<init>(r10)
            r1.A04(r0, r11)
            com.obwhatsapp.crop.CropImageView r0 = r8.A0L
            r0.A05 = r11
            android.graphics.Paint r7 = X.C13700nu.A05()
            r7.setAntiAlias(r11)
            r7.setFilterBitmap(r11)
            r7.setDither(r11)
            X.2QO r0 = r8.A0M
            android.graphics.Rect r6 = r0.A01()
            int r4 = r8.A06
            java.lang.String r5 = "cropimage/cannot_resample: "
            java.lang.String r16 = "cropimage/oom: "
            java.lang.String r1 = "filter"
            java.lang.String r13 = "doodle"
            r9 = 0
            if (r4 == 0) goto L_0x0763
            int r12 = r8.A07
            if (r12 == 0) goto L_0x0763
            int r9 = r8.A09
            if (r9 <= r11) goto L_0x008a
            int r0 = r6.left
            int r0 = r0 * r9
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 * r9
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 * r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 * r9
            r6.bottom = r0
        L_0x008a:
            boolean r0 = r8.A0Z
            if (r0 != 0) goto L_0x009e
            int r9 = r6.width()
            int r0 = r8.A06
            if (r9 >= r0) goto L_0x009e
            int r4 = r6.width()
            int r12 = r6.height()
        L_0x009e:
            int r15 = r6.width()
            int r14 = r6.height()
            int r9 = r8.A06
            int r0 = r8.A07
            int r9 = X.C37741pe.A00(r15, r14, r9, r0, r11)
            int r0 = r6.left
            int r0 = r0 / r9
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 / r9
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 / r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 / r9
            r6.bottom = r0
            int r0 = r8.A09
            if (r0 > r11) goto L_0x00dc
            if (r9 > r11) goto L_0x00dc
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r13)
            if (r0 != 0) goto L_0x00dc
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r3)
            if (r0 == 0) goto L_0x06c8
        L_0x00dc:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r3
            r1.inScaled = r3
            r1.inDither = r11
            r1.inPreferQualityOverSpeed = r11
            r11 = r9
        L_0x00f1:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r9)
            if (r11 > r0) goto L_0x06c8
            r1.inSampleSize = r11
            X.1A9 r13 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
            java.io.InputStream r13 = r13.A0b(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r13, r10, r1)     // Catch:{ all -> 0x0114 }
            r8.A0B = r0     // Catch:{ all -> 0x0114 }
            r13.close()     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
            goto L_0x06c8
        L_0x0114:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0118 }
        L_0x0118:
            throw r0     // Catch:{ OutOfMemoryError -> 0x0119, IOException -> 0x083a }
        L_0x0119:
            r13 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r16)
            java.lang.String r0 = X.AnonymousClass000.A0l(r0, r11)
            com.whatsapp.util.Log.e(r0, r13)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0136
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0136
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
        L_0x0136:
            X.C13680ns.A10(r6)
            int r11 = r11 << 1
            goto L_0x00f1
        L_0x013c:
            java.lang.Object r3 = r1.A00
            X.3pL r3 = (X.AnonymousClass3pL) r3
            X.2rD r2 = r3.A03
            int r0 = r2.A00
            r2.A02(r0)
            int r0 = r3.A00()
            r2.A00 = r0
            android.widget.RadioButton r1 = r3.A00
            r0 = 1
            r1.setChecked(r0)
            X.4E9 r0 = r2.A01
            if (r0 == 0) goto L_0x0010
            r3.A00()
            android.view.View r2 = r0.A00
            r0 = 2131366031(0x7f0a108f, float:1.8351944E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131366555(0x7f0a129b, float:1.8353007E38)
            X.C13690nt.A11(r2, r0)
            return
        L_0x016e:
            java.lang.Object r5 = r1.A00
            X.312 r5 = (X.AnonymousClass312) r5
            com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r4 = r5.A03
            java.lang.Runnable r2 = r5.A03
            r4.removeCallbacks(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            r0 = 3
            if (r1 != r0) goto L_0x0010
            android.graphics.drawable.Drawable r3 = r5.getPopupDrawable()
            X.1YG r2 = r5.A0b
            if (r2 == 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            android.widget.ImageView r0 = r5.A01
            if (r0 != 0) goto L_0x01bf
            android.content.Context r1 = r5.getContext()
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r1)
            r5.A01 = r0
            r0 = -2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r5.A01
            r0.setLayoutParams(r1)
            android.widget.ImageView r1 = r5.A01
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setImageDrawable(r3)
            android.widget.ImageView r0 = r5.A01
            r4.addView(r0)
        L_0x01bf:
            android.widget.ImageView r0 = r5.A01
            r2.A4o(r3, r0)
            return
        L_0x01c5:
            java.lang.Object r3 = r1.A00
            X.39Z r3 = (X.AnonymousClass39Z) r3
            X.31J r0 = r3.A0C
            X.1YG r2 = r0.A0b
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.AHi()
            if (r0 == 0) goto L_0x0010
            android.view.View r1 = r3.A02
            X.0tY r0 = r3.A06
            boolean r0 = r2.Agy(r0)
            r1.setSelected(r0)
            return
        L_0x01e1:
            java.lang.Object r1 = r1.A00
            X.1bb r1 = (X.C30011bb) r1
            X.0pN r2 = X.AnonymousClass22N.A02(r1)
            if (r2 == 0) goto L_0x0010
            X.0tZ r0 = r1.A0O
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r0)
            X.AnonymousClass00B.A06(r7)
            X.0zl r6 = r1.A1A
            X.01Y r3 = r1.A0V
            X.0uP r4 = r1.A0c
            X.2a9 r5 = r1.A0h
            X.0rt r0 = r1.A0u
            int r8 = r0.A01(r7)
            r9 = 2
            X.AnonymousClass2BX.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x020b:
            java.lang.Object r3 = r1.A00
            X.30T r3 = (X.AnonymousClass30T) r3
            X.0pd r2 = r3.A0M
            r1 = 2005(0x7d5, float:2.81E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0010
            X.02C r2 = r3.A02
            X.0tZ r0 = r3.A0O
            X.1Vw r0 = r0.A11
            X.0rv r1 = r0.A00
            r0 = 3
            com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A01(r2, r1, r0)
            return
        L_0x0228:
            java.lang.Object r6 = r1.A00
            X.309 r6 = (X.AnonymousClass309) r6
            X.0sL r5 = r6.A02
            if (r5 == 0) goto L_0x0010
            X.0zJ r4 = r6.A05
            X.1yP r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r5.getRawString()
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            r4.A06(r3, r2)
            r0 = 0
            r6.A02(r0)
            return
        L_0x0254:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2 r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2) r1
            r0 = 1
            r1.A1E(r0)
            X.00l r1 = r1.A0D()
            boolean r0 = r1 instanceof X.C447325i
            if (r0 == 0) goto L_0x0010
            X.25i r1 = (X.C447325i) r1
            r1.AOD()
            return
        L_0x026a:
            java.lang.Object r0 = r1.A00
            X.2uz r0 = (X.C59182uz) r0
            android.app.Activity r1 = r0.A01
            int r0 = r0.A07
            goto L_0x0299
        L_0x0273:
            java.lang.Object r4 = r1.A00
            X.2uz r4 = (X.C59182uz) r4
            com.obwhatsapp.WaEditText r0 = r4.A01
            java.lang.String r0 = X.C13680ns.A0f(r0)
            java.lang.String r0 = X.C40651uT.A05(r0)
            r3 = 0
            java.lang.String r2 = r0.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L_0x029d
            int r1 = r4.A08
            if (r1 == 0) goto L_0x029d
            X.0pt r0 = r4.A0F
            r0.A09(r1, r3)
        L_0x0295:
            android.app.Activity r1 = r4.A01
            int r0 = r4.A07
        L_0x0299:
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x029d:
            X.5PZ r0 = r4.A0I
            r0.AbX(r2)
            r4.dismiss()
            goto L_0x0295
        L_0x02a6:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r6 = (com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r6
            com.obwhatsapp.WaEditText r0 = r6.A0A
            java.lang.String r0 = X.C13680ns.A0f(r0)
            java.lang.String r5 = X.C40651uT.A05(r0)
            java.lang.String[] r4 = r6.A0Q
            r3 = 0
            if (r4 == 0) goto L_0x02ce
            int r2 = r4.length
            r1 = 0
        L_0x02bb:
            if (r1 >= r2) goto L_0x02ce
            r0 = r4[r1]
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x02cb
            X.2AD r0 = r6.A0E
            r0.ANi(r5)
            return
        L_0x02cb:
            int r1 = r1 + 1
            goto L_0x02bb
        L_0x02ce:
            java.lang.String r2 = r5.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L_0x02e2
            int r1 = r6.A01
            if (r1 == 0) goto L_0x02e2
            X.0pt r0 = r6.A08
            r0.A09(r1, r3)
            return
        L_0x02e2:
            X.2AD r1 = r6.A0E
            int r0 = r6.A00
            r1.AQG(r0, r2)
            r6.A1C()
            return
        L_0x02ed:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x02f5:
            java.lang.Object r4 = r1.A00
            X.2sk r4 = (X.C58102sk) r4
            X.027 r0 = r4.A02
            java.lang.Object r2 = r0.A01()
            X.AnonymousClass00B.A06(r2)
            X.4Kd r2 = (X.C84334Kd) r2
            X.1MU r3 = r4.A07
            X.0rv r0 = r4.A0B
            java.lang.String r1 = r0.getRawString()
            X.4TW r2 = r2.A02
            java.lang.String r0 = r2.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r3.A01(r1, r0)
            X.4EE r0 = r4.A08
            X.3hS r1 = r4.A01
            X.39b r0 = r0.A00
            X.38a r0 = r0.A08
            r0.A00(r1, r2)
            r4.dismiss()
            return
        L_0x0328:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.1ya r0 = r1.A00
            r0.AZW()
            goto L_0x033b
        L_0x0332:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.1ya r0 = r1.A00
            r0.AMj()
        L_0x033b:
            r1.A1C()
            return
        L_0x033f:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.ctwa.trustsignal.TopBannerView r2 = (com.obwhatsapp.ctwa.trustsignal.TopBannerView) r2
            r1 = 8
            r2.setVisibility(r1)
            r0 = 2131366774(0x7f0a1376, float:1.8353451E38)
            X.C13690nt.A13(r2, r0, r1)
            com.obwhatsapp.ctwa.trustsignal.viewmodel.TopBannerViewModel r3 = r2.A00
            X.0zS r4 = r3.A06
            X.4Vi r0 = r3.A00
            if (r0 != 0) goto L_0x0396
            r0 = 0
        L_0x0357:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            java.lang.String r1 = r3.A02
            r0 = 1
            X.C18450wi.A0H(r1, r0)
            r0 = 19
            r4.A01(r2, r1, r0)
            X.4Vi r0 = r3.A00
            if (r0 == 0) goto L_0x0392
            X.0rv r0 = r0.A00
            java.lang.String r1 = r0.getRawString()
            if (r1 == 0) goto L_0x0392
            X.0qW r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r2 = r0.edit()
            int r0 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "banner_payload_"
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            r2.remove(r0)
            r2.commit()
        L_0x0392:
            r3.A05()
            return
        L_0x0396:
            X.0rv r0 = r0.A00
            goto L_0x0357
        L_0x0399:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.crop.CropImage r0 = (com.obwhatsapp.crop.CropImage) r0
            int r1 = r0.A08
            int r1 = r1 + 270
            int r1 = r1 % 360
            r0.A08 = r1
            r15 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r15, r15, r6, r6)
            com.obwhatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r1 = r1.getImageViewMatrix()
            r1.mapRect(r5)
            android.graphics.Matrix r2 = r0.A0C
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2.postRotate(r1)
            com.obwhatsapp.crop.CropImageView r4 = r0.A0L
            android.graphics.Bitmap r1 = r0.A0B
            X.2TL r3 = new X.2TL
            r3.<init>(r1)
            android.graphics.Matrix r2 = X.AnonymousClass000.A0H()
            android.graphics.Matrix r1 = r0.A0D
            r2.set(r1)
            android.graphics.Matrix r1 = r0.A0C
            r2.postConcat(r1)
            r3.A01 = r2
            r1 = 0
            r4.A04(r3, r1)
            X.2QO r3 = r0.A0M
            com.obwhatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r2 = r1.getImageMatrix()
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>(r2)
            r3.A03 = r1
            android.graphics.Rect r1 = r3.A02()
            r3.A04 = r1
            android.view.View r1 = r3.A07
            r1.invalidate()
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r15, r15, r6, r6)
            com.obwhatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r1 = r1.getImageViewMatrix()
            r1.mapRect(r4)
            float r3 = r5.width()
            float r1 = r4.width()
            float r3 = r3 / r1
            float r2 = r5.height()
            float r1 = r4.height()
            float r2 = r2 / r1
            float r5 = java.lang.Math.min(r3, r2)
            com.obwhatsapp.crop.CropImageView r2 = r0.A0L
            X.2QO r1 = r0.A0M
            r2.A05(r1)
            r9 = 1
            android.view.animation.AnimationSet r1 = new android.view.animation.AnimationSet
            r1.<init>(r9)
            r14 = 1119092736(0x42b40000, float:90.0)
            r10 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 1
            r19 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r13 = new android.view.animation.RotateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.addAnimation(r13)
            r1.addAnimation(r4)
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
            com.obwhatsapp.crop.CropImageView r0 = r0.A0L
            r0.startAnimation(r1)
            return
        L_0x0452:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x045e:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "http://updateomar.com/obwh"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            goto L_0x0477
        L_0x046b:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "package:com.obwhatsapp"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DELETE"
        L_0x0477:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
        L_0x0480:
            java.lang.Object r4 = r1.A00
            X.01A r4 = (X.AnonymousClass01A) r4
            X.00l r0 = r4.A0D()
            java.lang.String r3 = "archived_chats"
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.SettingsChat"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "scroll_to_setting"
            r1.putExtra(r0, r3)
            r4.A0r(r1)
            return
        L_0x04a2:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.onBackPressed()
            return
        L_0x04aa:
            java.lang.Object r0 = r1.A00
            X.2jc r0 = (X.C55442jc) r0
            r0.A02()
            return
        L_0x04b2:
            java.lang.Object r0 = r1.A00
            X.2jc r0 = (X.C55442jc) r0
            r0.A03()
            return
        L_0x04ba:
            java.lang.Object r0 = r1.A00
            X.31d r0 = (X.C603631d) r0
            r0.AHp()
            return
        L_0x04c2:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCallbackShape333S0100000_1_I0 r0 = (com.facebook.redex.IDxCallbackShape333S0100000_1_I0) r0
            java.lang.Object r1 = r0.A00
            X.1yj r1 = (X.C42821yj) r1
            r0 = 0
            goto L_0x04d5
        L_0x04cc:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCallbackShape333S0100000_1_I0 r0 = (com.facebook.redex.IDxCallbackShape333S0100000_1_I0) r0
            java.lang.Object r1 = r0.A00
            X.1yj r1 = (X.C42821yj) r1
            r0 = 1
        L_0x04d5:
            X.C42821yj.A02(r1, r0)
            return
        L_0x04d9:
            java.lang.Object r3 = r1.A00
            X.30w r3 = (X.C603030w) r3
            X.0tZ r2 = r3.A0O
            X.0tY r2 = (X.C16730tY) r2
            X.1ra r2 = (X.C38891ra) r2
            com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r3.A0G
            r0 = 0
            r3.A16(r1, r2, r0)
            return
        L_0x04ea:
            java.lang.Object r0 = r1.A00
            android.content.Context r0 = (android.content.Context) r0
            X.1fu r1 = X.C32241fu.A00(r0)
            r0 = 2131889275(0x7f120c7b, float:1.9413209E38)
            r1.A01(r0)
            r0 = 2131889276(0x7f120c7c, float:1.941321E38)
            r1.A02(r0)
            X.C13690nt.A1F(r1)
            r1.A00()
            return
        L_0x0505:
            java.lang.Object r1 = r1.A00
            X.2Vb r1 = (X.C49692Vb) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x050e:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.onBackPressed()
            return
        L_0x0516:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.contact.picker.PhoneContactsSelector r2 = (com.obwhatsapp.contact.picker.PhoneContactsSelector) r2
            X.1BJ r1 = r2.A09
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
            return
        L_0x0526:
            java.lang.Object r0 = r1.A00
            X.38N r0 = (X.AnonymousClass38N) r0
            X.2OJ r1 = r0.A0B
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0B(r0)
            return
        L_0x0532:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.2qe r1 = r0.A05
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0547
            X.1cy r1 = r1.A06
            X.46Q r0 = new X.46Q
            r0.<init>()
            r1.A0B(r0)
            return
        L_0x0547:
            r1.A05()
            return
        L_0x054b:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment r4 = (com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r4
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r3 = r4.A04
            X.1WN r0 = r4.A07
            com.whatsapp.jid.DeviceJid r0 = r0.A06
            java.lang.String r2 = r0.getRawString()
            X.0wP r0 = r3.A0B
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x056d
            X.1cy r1 = r3.A0M
            r0 = 2131887418(0x7f12053a, float:1.9409443E38)
            X.C13680ns.A1O(r1, r0)
        L_0x0569:
            r4.A1C()
            return
        L_0x056d:
            r0 = 1
            r3.A03 = r0
            X.027 r1 = r3.A05
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            X.0sq r1 = r3.A0V
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r3, r2)
            r1.Acl(r0)
            goto L_0x0569
        L_0x0582:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment r3 = (com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r3
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = r3.A04
            X.4ML r0 = r3.A0A
            java.lang.String r1 = r0.A03
            X.113 r0 = r2.A0J
            r0.A00(r1)
            X.1cy r1 = r2.A0T
            r0 = 0
            r1.A0B(r0)
            r3.A1C()
            return
        L_0x059b:
            java.lang.Object r0 = r1.A00
            X.38Y r0 = (X.AnonymousClass38Y) r0
            r4 = 1
            goto L_0x05a6
        L_0x05a1:
            java.lang.Object r0 = r1.A00
            X.38Y r0 = (X.AnonymousClass38Y) r0
            r4 = 0
        L_0x05a6:
            com.obwhatsapp.companiondevice.LinkedDevicesActivity r5 = r0.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r10 = r5.A05
            X.2Vf r0 = r5.A06
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A08
            boolean r11 = r0.A01()
            com.obwhatsapp.companiondevice.LinkedDevicesViewModel r0 = r5.A07
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x05bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r1 = r2.next()
            X.1WN r1 = (X.AnonymousClass1WN) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x05bb
            com.whatsapp.jid.DeviceJid r0 = r1.A06
            boolean r0 = X.C16030sJ.A0M(r0)
            if (r0 != 0) goto L_0x05bb
            int r3 = r3 + 1
            goto L_0x05bb
        L_0x05d8:
            com.obwhatsapp.companiondevice.LinkedDevicesViewModel r0 = r5.A07
            X.16S r0 = r0.A05
            X.0s5 r1 = r0.A00
            X.0tC r0 = X.C15910s6.A1M
            int r2 = r1.A02(r0)
            java.lang.String r0 = "LinkedDevicesSharedViewModel/onLinkNewDeviceClicked devicePairFlowType: "
            java.lang.String r0 = X.C13680ns.A0c(r4, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16S r0 = r10.A0K
            X.0rz r1 = r0.A01
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x05ff
            if (r3 < r2) goto L_0x05ff
            X.1cy r0 = r10.A0O
            X.C13680ns.A1O(r0, r2)
            return
        L_0x05ff:
            r10.A00 = r4
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x0654
            X.0wP r0 = r10.A0B
            r1 = 1
            int r0 = r0.A04(r1)
            if (r0 == r1) goto L_0x0654
            X.0rz r0 = r10.A0C
            android.content.SharedPreferences r3 = X.C13680ns.A0B(r0)
            java.lang.String r2 = "md_initial_sync_estimate_bytes"
            r0 = -1
            long r2 = r3.getLong(r2, r0)
            r4 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0635
            long r6 = r2 / r8
            X.0s5 r1 = r10.A07
            X.0tC r0 = X.C15910s6.A21
            int r0 = r1.A02(r0)
            long r4 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0654
        L_0x0635:
            X.1cy r1 = r10.A0P
            r0 = 0
            r1.A0B(r0)
            X.19E r4 = r10.A09
            long r0 = r2 / r8
            long r2 = java.lang.Math.min(r2, r0)
            X.3qW r1 = new X.3qW
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0t9 r0 = r4.A06
            r0.A06(r1)
            return
        L_0x0654:
            r10.A05(r11)
            return
        L_0x0658:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x0660:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = (com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r0
            r0.A35()
            return
        L_0x0668:
            java.lang.Object r0 = r1.A00
            X.3o4 r0 = (X.C73433o4) r0
            java.lang.Runnable r0 = r0.A00
            r0.run()
            return
        L_0x0672:
            java.lang.Object r0 = r1.A00
            X.3Sk r0 = (X.C64983Sk) r0
            android.view.ViewGroup r0 = r0.A00
            r0.showContextMenu()
            return
        L_0x067c:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2 r3 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2) r3
            r3.A1B()
            X.0qW r0 = r3.A0M
            java.lang.Object r2 = r0.getValue()
            com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r2 = (com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r2
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.028 r0 = r0.A00
            java.lang.Object r1 = r0.A01()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x069d
            java.lang.String r1 = ""
        L_0x069d:
            com.whatsapp.jid.UserJid r0 = r3.A0H
            if (r0 != 0) goto L_0x06a8
            java.lang.String r0 = "bizJid"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x06a8:
            r2.A08(r0, r1)
            return
        L_0x06ac:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2 r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2) r1
            X.0qW r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.028 r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x06c4
            java.lang.String r0 = ""
        L_0x06c4:
            r1.A1C(r0)
            return
        L_0x06c8:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0911
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != 0) goto L_0x06d4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x06d4:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r4, r12, r0)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            float r4 = (float) r4
            float r1 = (float) r12
            r0 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r0, r0, r4, r1)
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x071d
            int r0 = r6.width()
            float r1 = (float) r0
            float r0 = r5.width()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r11 = r0 >> 1
            int r0 = r6.height()
            float r1 = (float) r0
            float r0 = r5.height()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r4 = r0 >> 1
            int r1 = java.lang.Math.max(r3, r11)
            int r0 = java.lang.Math.max(r3, r4)
            r6.inset(r1, r0)
            int r0 = -r11
            int r0 = java.lang.Math.max(r3, r0)
            float r1 = (float) r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r3, r0)
            float r0 = (float) r0
            r5.inset(r1, r0)
        L_0x071d:
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x075c
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x075c
            android.graphics.Matrix r11 = X.AnonymousClass000.A0H()
            float r1 = r5.left
            float r0 = r5.right
            float r1 = r1 + r0
            float r4 = -r1
            r12 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r12
            float r1 = r5.top
            float r0 = r5.bottom
            float r1 = r1 + r0
            float r0 = -r1
            float r0 = r0 / r12
            r11.preTranslate(r4, r0)
            android.graphics.Matrix r0 = r8.A0D
            r11.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r11.postRotate(r0)
            float r4 = r5.left
            float r0 = r5.right
            float r4 = r4 + r0
            float r4 = r4 / r12
            float r1 = r5.top
            float r0 = r5.bottom
            float r1 = r1 + r0
            float r1 = r1 / r12
            r11.postTranslate(r4, r1)
            r11.mapRect(r5)
            r10.setMatrix(r11)
        L_0x075c:
            android.graphics.Bitmap r0 = r8.A0B
            r10.drawBitmap(r0, r6, r5, r7)
            goto L_0x08cf
        L_0x0763:
            int r0 = r8.A09
            if (r0 <= r11) goto L_0x076a
            r8.A2B(r6)
        L_0x076a:
            int r0 = r8.A03
            r4 = 1
            if (r0 == 0) goto L_0x0789
        L_0x076f:
            int r0 = r6.width()
            int r12 = r0 >> 1
            int r0 = r8.A03
            if (r12 > r0) goto L_0x0783
            int r0 = r6.height()
            int r12 = r0 >> 1
            int r0 = r8.A03
            if (r12 <= r0) goto L_0x0789
        L_0x0783:
            int r4 = r4 << 1
            X.C13680ns.A10(r6)
            goto L_0x076f
        L_0x0789:
            int r0 = r8.A09
            if (r0 > r11) goto L_0x07a3
            if (r4 > r11) goto L_0x07a3
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r13)
            if (r0 != 0) goto L_0x07a3
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r3)
            if (r0 == 0) goto L_0x0849
        L_0x07a3:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
            r1 = r4
        L_0x07ab:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r4)
            if (r1 > r0) goto L_0x0849
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options
            r13.<init>()
            r13.inSampleSize = r1
            r13.inJustDecodeBounds = r3
            r13.inScaled = r3
            r13.inDither = r11
            r13.inPreferQualityOverSpeed = r11
            X.1A9 r12 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
            java.io.InputStream r14 = r12.A0b(r0, r11)     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r14, r10, r13)     // Catch:{ all -> 0x0805 }
            r8.A0B = r0     // Catch:{ all -> 0x0805 }
            int r15 = r6.width()     // Catch:{ all -> 0x0805 }
            int r13 = r6.height()     // Catch:{ all -> 0x0805 }
            int r0 = r8.A03     // Catch:{ all -> 0x0805 }
            if (r0 == 0) goto L_0x07ef
            if (r15 > r0) goto L_0x07e6
            if (r13 <= r0) goto L_0x07ef
        L_0x07e6:
            if (r15 <= r13) goto L_0x07ec
            int r13 = r13 * r0
            int r13 = r13 / r15
            r15 = r0
            goto L_0x07ef
        L_0x07ec:
            int r15 = r15 * r0
            int r15 = r15 / r13
            r13 = r0
        L_0x07ef:
            android.graphics.Bitmap r0 = r8.A0B     // Catch:{ all -> 0x0805 }
            android.graphics.Bitmap$Config r12 = r0.getConfig()     // Catch:{ all -> 0x0805 }
            boolean r0 = r8.A0S     // Catch:{ all -> 0x0805 }
            if (r0 != 0) goto L_0x07fb
            if (r12 != 0) goto L_0x07fd
        L_0x07fb:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0805 }
        L_0x07fd:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r13, r12)     // Catch:{ all -> 0x0805 }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
            goto L_0x0849
        L_0x0805:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0809 }
        L_0x0809:
            throw r0     // Catch:{ OutOfMemoryError -> 0x080a, IOException -> 0x083a }
        L_0x080a:
            r12 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r16)
            java.lang.String r0 = X.AnonymousClass000.A0l(r0, r1)
            com.whatsapp.util.Log.e(r0, r12)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0827
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0827
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
        L_0x0827:
            if (r9 == 0) goto L_0x0833
            boolean r0 = r9.isRecycled()
            if (r0 != 0) goto L_0x0833
            r9.recycle()
            r9 = r10
        L_0x0833:
            X.C13680ns.A10(r6)
            int r1 = r1 << 1
            goto L_0x07ab
        L_0x083a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            android.content.Intent r0 = com.obwhatsapp.crop.CropImage.A02()
            r8.setResult(r3, r0)
            r8.finish()
            return
        L_0x0849:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0911
            int r11 = r6.width()
            int r4 = r6.height()
            int r0 = r8.A03
            if (r0 == 0) goto L_0x0862
            if (r11 > r0) goto L_0x085d
            if (r4 <= r0) goto L_0x0862
        L_0x085d:
            if (r11 <= r4) goto L_0x090c
            int r4 = r4 * r0
            int r4 = r4 / r11
            r11 = r0
        L_0x0862:
            if (r9 != 0) goto L_0x0876
            android.graphics.Bitmap r0 = r8.A0B
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x0870
            if (r1 != 0) goto L_0x0872
        L_0x0870:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0872:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r11, r4, r1)
        L_0x0876:
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r3, r3, r11, r4)
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x08ca
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x08ca
            android.graphics.Matrix r11 = X.AnonymousClass000.A0H()
            int r1 = r5.left
            int r0 = r5.right
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 >> 1
            float r4 = (float) r0
            int r1 = r5.top
            int r0 = r5.bottom
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 >> 1
            float r0 = (float) r0
            r11.preTranslate(r4, r0)
            android.graphics.Matrix r0 = r8.A0D
            r11.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r11.postRotate(r0)
            int r1 = r5.left
            int r0 = r5.right
            int r1 = r1 + r0
            int r0 = r1 >> 1
            float r4 = (float) r0
            int r1 = r5.top
            int r0 = r5.bottom
            int r1 = r1 + r0
            int r0 = r1 >> 1
            float r0 = (float) r0
            r11.postTranslate(r4, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r11.mapRect(r0)
            r10.setMatrix(r11)
        L_0x08ca:
            android.graphics.Bitmap r0 = r8.A0B
            r10.drawBitmap(r0, r6, r5, r7)
        L_0x08cf:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x08d6
            r0.recycle()
        L_0x08d6:
            if (r9 != 0) goto L_0x08df
            android.content.Intent r0 = com.obwhatsapp.crop.CropImage.A02()
            r8.setResult(r3, r0)
        L_0x08df:
            X.2QO r0 = r8.A0M
            android.graphics.Rect r11 = r0.A01()
            int r0 = r8.A09
            if (r0 <= r2) goto L_0x08ec
            r8.A2B(r11)
        L_0x08ec:
            android.net.Uri r10 = r8.A0F
            if (r10 != 0) goto L_0x092d
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r11)
            int r1 = r8.A08
            java.lang.String r0 = "rotate"
            r2.putExtra(r0, r1)
            r0 = -1
            r8.setResult(r0, r2)
            r9.recycle()
        L_0x0908:
            r8.finish()
            return
        L_0x090c:
            int r11 = r11 * r0
            int r11 = r11 / r4
            r4 = r0
            goto L_0x0862
        L_0x0911:
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "error-oom"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            r1 = 2131888213(0x7f120855, float:1.9411055E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r8.setResult(r3, r0)
            goto L_0x0908
        L_0x092d:
            X.0sq r7 = r8.A05
            X.0pf r6 = r8.A0K
            X.01V r5 = r8.A0I
            android.graphics.Bitmap$CompressFormat r4 = r8.A0A
            int r3 = r8.A04
            boolean r2 = r8.A0U
            int r1 = r8.A02
            int r0 = r8.A08
            X.36c r12 = new X.36c
            r13 = r8
            r14 = r4
            r15 = r9
            r16 = r11
            r17 = r10
            r18 = r5
            r19 = r6
            r20 = r3
            r21 = r1
            r22 = r0
            r23 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.C13700nu.A0W(r12, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2.onClick(android.view.View):void");
    }
}
