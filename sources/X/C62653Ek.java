package X;

import android.app.Activity;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
public final class C62653Ek implements AnonymousClass2Su {
    public final Activity A00;
    public final C14600pS A01;
    public final C14870pt A02;
    public final AnonymousClass5SW A03;
    public final C809146b A04;
    public final AnonymousClass01V A05;
    public final C16210se A06;

    public C62653Ek(Activity activity, C14600pS r2, C14870pt r3, AnonymousClass5SW r4, C809146b r5, AnonymousClass01V r6, C16210se r7) {
        this.A00 = activity;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.net.Uri r9, X.C15830rv r10, int r11, int r12, int r13, boolean r14) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x007b
            r0 = -1
            X.0se r2 = r8.A06
            android.app.Activity r1 = r8.A00
            if (r11 != r0) goto L_0x001d
            r3 = 0
        L_0x000a:
            X.4Ul r7 = r2.A05(r1, r3, r10, r14)
        L_0x000e:
            android.graphics.drawable.Drawable r2 = r2.A03(r7)
            X.5SW r0 = r8.A03
            r0.Af0(r2)
            if (r14 == 0) goto L_0x001c
            X.C17970vw.A0K(r1, r9)
        L_0x001c:
            return
        L_0x001d:
            boolean r0 = r2 instanceof X.AnonymousClass1AB
            if (r0 == 0) goto L_0x0040
            r4 = r2
            X.1AB r4 = (X.AnonymousClass1AB) r4
            X.0pt r0 = r4.A01
            android.graphics.drawable.Drawable r0 = X.C62063Bm.A02(r1, r0, r11, r12, r13)
            if (r0 != 0) goto L_0x0031
            X.4Ul r7 = r4.A06(r1, r10)
            goto L_0x000e
        L_0x0031:
            r3 = 0
            if (r10 != 0) goto L_0x0035
            r3 = 1
        L_0x0035:
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            X.1uv r0 = r4.A0D(r1, r0, r10)
            X.4Ul r7 = r4.A0C(r1, r0, r3)
            goto L_0x000e
        L_0x0040:
            r4 = r2
            X.1AA r4 = (X.AnonymousClass1AA) r4
            java.lang.String r0 = "wallpaper/set with resId with size (width x height): "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r12)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pt r0 = r4.A04
            android.graphics.drawable.Drawable r0 = X.C62063Bm.A02(r1, r0, r11, r12, r13)
            r4.A00 = r0
            if (r0 == 0) goto L_0x006b
            r4.A0C(r1, r0)
        L_0x006b:
            android.graphics.drawable.Drawable r5 = r4.A00
            java.lang.String r4 = "DOWNLOADED"
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.4Ul r7 = new X.4Ul
            r7.<init>(r5, r3, r4, r0)
            goto L_0x000e
        L_0x007b:
            X.0se r2 = r8.A06
            android.app.Activity r1 = r8.A00
            r3 = r9
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62653Ek.A00(android.net.Uri, X.0rv, int, int, int, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x02ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x013a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0199 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01f6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AM4(android.content.Intent r23, int r24, int r25) {
        /*
            r22 = this;
            r1 = 18
            r6 = 18
            r2 = -1
            r0 = 1
            r13 = r22
            r7 = r23
            r4 = r24
            r3 = r25
            if (r4 != r1) goto L_0x0042
            if (r3 != r2) goto L_0x002e
            if (r23 == 0) goto L_0x002d
            android.net.Uri r1 = r7.getData()
            if (r1 == 0) goto L_0x002d
            X.0rv r15 = X.C62063Bm.A03(r7)
            android.net.Uri r14 = r7.getData()
            r17 = 0
            r19 = 1
            r16 = -1
        L_0x0028:
            r18 = 0
            r13.A00(r14, r15, r16, r17, r18, r19)
        L_0x002d:
            return r0
        L_0x002e:
            if (r25 != 0) goto L_0x002d
            if (r23 == 0) goto L_0x002d
            java.lang.String r1 = "error_message_id"
            int r3 = r7.getIntExtra(r1, r2)
            if (r3 <= 0) goto L_0x002d
            X.0pt r2 = r13.A02
            X.0pS r1 = r13.A01
            r2.A0F(r1, r3)
            return r0
        L_0x0042:
            r1 = 17
            r5 = 0
            if (r4 != r1) goto L_0x025b
            if (r3 != r2) goto L_0x00d3
            if (r23 == 0) goto L_0x00d3
            X.0rv r15 = X.C62063Bm.A03(r7)
            java.lang.String r4 = "is_using_global_wallpaper"
            boolean r3 = r7.getBooleanExtra(r4, r5)
            android.app.Activity r2 = r13.A00
            android.graphics.Point r11 = X.C16210se.A00(r2)
            android.net.Uri r1 = r7.getData()
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = "conversation/wallpaper/setup/src:"
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0r(r1)
            android.net.Uri r1 = r7.getData()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r8)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.01V r1 = r13.A05
            android.content.ContentResolver r10 = r1.A0C()
            java.lang.String r1 = "FROM_INTERNAL_DOWNLOADS_KEY"
            boolean r1 = r7.getBooleanExtra(r1, r5)
            if (r1 == 0) goto L_0x0226
            android.net.Uri r14 = r7.getData()
            r16 = -1
            r17 = 0
            r19 = 0
            goto L_0x0028
        L_0x008f:
            X.5SW r4 = r13.A03
            r4.A6G()
            java.lang.String r1 = "selected_res_id"
            int r3 = r7.getIntExtra(r1, r5)
            if (r3 == 0) goto L_0x00d9
            java.lang.String r1 = "conversation/wallpaper from pgk:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            r2.append(r3)
            java.lang.String r1 = " ["
            r2.append(r1)
            int r1 = r11.x
            r2.append(r1)
            java.lang.String r1 = ","
            r2.append(r1)
            int r1 = r11.y
            r2.append(r1)
            java.lang.String r1 = "]"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r14 = 0
            int r2 = r11.x
            int r1 = r11.y
            r19 = 1
            r17 = r2
            r18 = r1
            r16 = r3
            r13.A00(r14, r15, r16, r17, r18, r19)
        L_0x00d3:
            X.5SW r1 = r13.A03
            r1.Ai5()
            return r0
        L_0x00d9:
            java.lang.String r3 = "wallpaper_color_file"
            boolean r1 = r7.hasExtra(r3)
            if (r1 == 0) goto L_0x014c
            int r10 = r7.getIntExtra(r3, r5)
            java.lang.String r1 = "wallpaper_doodle_overlay"
            boolean r3 = r7.getBooleanExtra(r1, r5)
            X.0se r7 = r13.A06
            boolean r1 = r7 instanceof X.AnonymousClass1AB
            if (r1 == 0) goto L_0x0119
            r9 = r7
            X.1AB r9 = (X.AnonymousClass1AB) r9
            if (r3 == 0) goto L_0x0116
            java.lang.String r8 = "COLOR_WITH_WA_OVERLAY"
        L_0x00fa:
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            X.1uv r1 = new X.1uv
            r1.<init>(r3, r8, r6)
            r9.A0G(r2, r15, r1)
        L_0x010a:
            X.4Ul r1 = r7.A06(r2, r15)
            android.graphics.drawable.Drawable r1 = r7.A03(r1)
            r4.Af0(r1)
            goto L_0x00d3
        L_0x0116:
            java.lang.String r8 = "COLOR_ONLY"
            goto L_0x00fa
        L_0x0119:
            r6 = r7
            X.1AA r6 = (X.AnonymousClass1AA) r6
            r1 = 0
            r6.A00 = r1
            java.lang.String r1 = "wallpaper.jpg"
            java.io.FileOutputStream r3 = r2.openFileOutput(r1, r5)     // Catch:{ IOException -> 0x013b }
            r1 = 4
            r3.write(r1)     // Catch:{ all -> 0x0134 }
            r3.write(r10)     // Catch:{ all -> 0x0134 }
            r3.flush()     // Catch:{ all -> 0x0134 }
            r3.close()     // Catch:{ IOException -> 0x013b }
            goto L_0x013f
        L_0x0134:
            r1 = move-exception
            if (r3 == 0) goto L_0x013a
            r3.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r1     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x013f:
            X.3xc r1 = r6.A0B(r2, r5)
            android.graphics.drawable.Drawable r1 = r6.A03(r1)
            r6.A00 = r1
            r6.A00 = r0
            goto L_0x010a
        L_0x014c:
            java.lang.String r1 = "is_reset"
            boolean r1 = r7.getBooleanExtra(r1, r5)
            if (r1 == 0) goto L_0x01a4
            X.0se r6 = r13.A06
            boolean r1 = r6 instanceof X.AnonymousClass1AB
            if (r1 == 0) goto L_0x0176
            X.1AB r6 = (X.AnonymousClass1AB) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "NONE"
            r3 = 0
            X.1uv r1 = new X.1uv
            r1.<init>(r7, r5, r3)
            r6.A0G(r2, r15, r1)
        L_0x016b:
            r1 = 0
            r4.Af0(r1)
            java.lang.String r1 = "conversation/wallpaper/reset"
        L_0x0171:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x00d3
        L_0x0176:
            X.1AA r6 = (X.AnonymousClass1AA) r6
            java.lang.String r1 = "wallpaper/reset"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 0
            r6.A00 = r1
            java.lang.String r1 = "wallpaper.jpg"
            java.io.FileOutputStream r2 = r2.openFileOutput(r1, r5)     // Catch:{ IOException -> 0x019a }
            r1 = 3
            r2.write(r1)     // Catch:{ all -> 0x0193 }
            r2.flush()     // Catch:{ all -> 0x0193 }
            r2.close()     // Catch:{ IOException -> 0x019a }
            goto L_0x019e
        L_0x0193:
            r1 = move-exception
            if (r2 == 0) goto L_0x0199
            r2.close()     // Catch:{ all -> 0x0199 }
        L_0x0199:
            throw r1     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x019e:
            X.12Y r1 = r6.A07
            r1.A5J()
            goto L_0x016b
        L_0x01a4:
            java.lang.String r1 = "is_default"
            boolean r1 = r7.getBooleanExtra(r1, r5)
            if (r1 == 0) goto L_0x020b
            X.0se r6 = r13.A06
            boolean r1 = r6 instanceof X.AnonymousClass1AB
            if (r1 == 0) goto L_0x01d2
            r8 = r6
            X.1AB r8 = (X.AnonymousClass1AB) r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "DEFAULT"
            r3 = 0
            X.1uv r1 = new X.1uv
            r1.<init>(r7, r5, r3)
            r8.A0G(r2, r15, r1)
        L_0x01c4:
            X.4Ul r1 = r6.A06(r2, r15)
            android.graphics.drawable.Drawable r1 = r6.A03(r1)
            r4.Af0(r1)
            java.lang.String r1 = "conversation/wallpaper/default"
            goto L_0x0171
        L_0x01d2:
            r7 = r6
            X.1AA r7 = (X.AnonymousClass1AA) r7
            java.lang.String r1 = "wallpaper/default"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 0
            r7.A00 = r1
            java.lang.String r1 = "wallpaper.jpg"
            java.io.FileOutputStream r3 = r2.openFileOutput(r1, r5)     // Catch:{ IOException -> 0x01f7 }
            r1 = 2
            r3.write(r1)     // Catch:{ all -> 0x01f0 }
            r3.flush()     // Catch:{ all -> 0x01f0 }
            r3.close()     // Catch:{ IOException -> 0x01f7 }
            goto L_0x01fb
        L_0x01f0:
            r1 = move-exception
            if (r3 == 0) goto L_0x01f6
            r3.close()     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            throw r1     // Catch:{ IOException -> 0x01f7 }
        L_0x01f7:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x01fb:
            X.3xc r1 = r7.A0B(r2, r5)
            android.graphics.drawable.Drawable r1 = r7.A03(r1)
            r7.A00 = r1
            X.12Y r1 = r7.A07
            r1.A5J()
            goto L_0x01c4
        L_0x020b:
            X.0pt r2 = r13.A02
            r1 = 2131888236(0x7f12086c, float:1.9411102E38)
            r2.A09(r1, r5)
            java.lang.String r1 = "conversation/wallpaper/invalid_file:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = r7.toString()
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x00d3
        L_0x0226:
            if (r10 != 0) goto L_0x025c
            java.lang.String r0 = "conversation/wallpaper/setup cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x022d:
            android.net.Uri r9 = r7.getData()
            X.0se r0 = r13.A06
            android.net.Uri r8 = r0.A04()
            android.content.Intent r7 = X.C13680ns.A09()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.GalleryWallpaperPreview"
            android.content.Intent r1 = r7.setClassName(r1, r0)
            r1.setData(r9)
            java.lang.String r0 = "output"
            r1.putExtra(r0, r8)
            X.C16030sJ.A0B(r1, r15)
            r1.putExtra(r4, r3)
            r2.startActivityForResult(r1, r6)
            X.5SW r0 = r13.A03
            r0.Ai5()
        L_0x025b:
            return r5
        L_0x025c:
            android.net.Uri r17 = r7.getData()
            r9 = 0
            r20 = r9
            r21 = r9
            r18 = r9
            r19 = r9
            r16 = r10
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x022d
            boolean r12 = r1.moveToFirst()     // Catch:{ all -> 0x02dd }
            java.lang.String r8 = "bucket_display_name"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x02dd }
            if (r12 == 0) goto L_0x02d4
            if (r8 < 0) goto L_0x02d4
            java.lang.String r12 = "WallPaper"
            java.lang.String r8 = r1.getString(r8)     // Catch:{ all -> 0x02dd }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x02dd }
            if (r8 == 0) goto L_0x02d4
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x02dd }
            r12.<init>()     // Catch:{ all -> 0x02dd }
            r12.inJustDecodeBounds = r0     // Catch:{ all -> 0x02dd }
            android.net.Uri r8 = r7.getData()     // Catch:{ FileNotFoundException -> 0x02d0, IOException -> 0x02cb }
            java.io.InputStream r8 = r10.openInputStream(r8)     // Catch:{ FileNotFoundException -> 0x02d0, IOException -> 0x02cb }
            android.graphics.BitmapFactory.decodeStream(r8, r9, r12)     // Catch:{ all -> 0x02c4 }
            int r10 = r12.outWidth     // Catch:{ all -> 0x02c4 }
            int r9 = r11.x     // Catch:{ all -> 0x02c4 }
            if (r10 != r9) goto L_0x02be
            int r10 = r12.outHeight     // Catch:{ all -> 0x02c4 }
            int r9 = r11.y     // Catch:{ all -> 0x02c4 }
            if (r10 != r9) goto L_0x02be
            android.net.Uri r14 = r7.getData()     // Catch:{ all -> 0x02c4 }
            r16 = -1
            r17 = 0
            r18 = 0
            r19 = 1
            r13.A00(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x02c4 }
            if (r8 == 0) goto L_0x02d9
            r8.close()     // Catch:{ FileNotFoundException -> 0x02d0, IOException -> 0x02cb }
            goto L_0x02d9
        L_0x02be:
            if (r8 == 0) goto L_0x02d4
            r8.close()     // Catch:{ FileNotFoundException -> 0x02d0, IOException -> 0x02cb }
            goto L_0x02d4
        L_0x02c4:
            r0 = move-exception
            if (r8 == 0) goto L_0x02ca
            r8.close()     // Catch:{ all -> 0x02ca }
        L_0x02ca:
            throw r0     // Catch:{ FileNotFoundException -> 0x02d0, IOException -> 0x02cb }
        L_0x02cb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02dd }
            goto L_0x02d4
        L_0x02d0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02dd }
        L_0x02d4:
            r1.close()
            goto L_0x022d
        L_0x02d9:
            r1.close()
            return r0
        L_0x02dd:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x02e1 }
        L_0x02e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62653Ek.AM4(android.content.Intent, int, int):boolean");
    }
}
