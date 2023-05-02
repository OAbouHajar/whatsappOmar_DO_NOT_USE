package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.1AA  reason: invalid class name */
public class AnonymousClass1AA extends C16210se {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public final C16180sb A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C210112l A06;
    public final AnonymousClass12Y A07;
    public final AnonymousClass1A9 A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1AA(X.C16180sb r13, X.C14870pt r14, X.C16040sK r15, X.C16200sd r16, X.C16190sc r17, X.AnonymousClass12W r18, X.C16980tz r19, X.C18790xG r20, X.AnonymousClass12X r21, X.C210112l r22, X.AnonymousClass12Y r23, X.C16230sg r24, X.C16990u0 r25, X.AnonymousClass12V r26, X.AnonymousClass1A9 r27) {
        /*
            r12 = this;
            r11 = r26
            r1 = r12
            r10 = r25
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A04 = r14
            r12.A05 = r15
            r12.A03 = r13
            r0 = r27
            r12.A08 = r0
            r0 = r22
            r12.A06 = r0
            r0 = r23
            r12.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AA.<init>(X.0sb, X.0pt, X.0sK, X.0sd, X.0sc, X.12W, X.0tz, X.0xG, X.12X, X.12l, X.12Y, X.0sg, X.0u0, X.12V, X.1A9):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00b5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C78253xc A0B(android.content.Context r11, boolean r12) {
        /*
            r10 = this;
            boolean r1 = X.C434920f.A09(r11)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x000c
            boolean r0 = r10.A02
            if (r1 != r0) goto L_0x000e
        L_0x000c:
            if (r12 == 0) goto L_0x0011
        L_0x000e:
            r0 = 0
            r10.A00 = r0
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r10.A00
            r7 = 5
            r6 = 4
            r5 = 2
            r8 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00f4
            r10.A01 = r8
            android.content.res.Resources r2 = r11.getResources()
            java.io.File r3 = r11.getFilesDir()
            java.lang.String r1 = "wallpaper.jpg"
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            android.graphics.drawable.Drawable r0 = X.C62063Bm.A01(r11, r2, r0)
            r10.A00 = r0
            r3 = 2
            if (r0 == 0) goto L_0x0099
            r3 = 5
        L_0x0036:
            android.graphics.drawable.Drawable r2 = r10.A00
            if (r2 == 0) goto L_0x0095
            java.lang.String r0 = "wallpaper/get "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.getIntrinsicWidth()
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            android.graphics.drawable.Drawable r0 = r10.A00
            int r0 = r0.getIntrinsicHeight()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            android.graphics.drawable.Drawable r0 = r10.A00
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            int r0 = r0.getByteCount()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0070:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0073:
            java.lang.String r9 = "DEFAULT"
            if (r3 == r4) goto L_0x0083
            if (r3 == r5) goto L_0x0083
            if (r3 == r6) goto L_0x0092
            if (r3 == r7) goto L_0x008f
            android.graphics.drawable.Drawable r0 = r10.A00
            if (r0 != 0) goto L_0x0083
            java.lang.String r9 = "NONE"
        L_0x0083:
            android.graphics.drawable.Drawable r2 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.3xc r0 = new X.3xc
            r0.<init>(r2, r1, r9)
            return r0
        L_0x008f:
            java.lang.String r9 = "DOWNLOADED"
            goto L_0x0083
        L_0x0092:
            java.lang.String r9 = "COLOR_ONLY"
            goto L_0x0083
        L_0x0095:
            java.lang.String r0 = "wallpaper/get null"
            goto L_0x0070
        L_0x0099:
            java.io.FileInputStream r1 = r11.openFileInput(r1)     // Catch:{ IOException -> 0x00b6, OutOfMemoryError -> 0x00b8 }
            int r3 = r1.read()     // Catch:{ all -> 0x00af }
            if (r3 != r6) goto L_0x00a8
            int r9 = r1.read()     // Catch:{ all -> 0x00af }
            goto L_0x00a9
        L_0x00a8:
            r9 = 0
        L_0x00a9:
            r1.close()     // Catch:{ IOException -> 0x00bd, OutOfMemoryError -> 0x00ad }
            goto L_0x00bd
        L_0x00ad:
            r0 = move-exception
            goto L_0x00ba
        L_0x00af:
            r0 = move-exception
            if (r1 == 0) goto L_0x00b5
            r1.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ IOException -> 0x00b6, OutOfMemoryError -> 0x00b8 }
        L_0x00b6:
            r9 = 0
            goto L_0x00bd
        L_0x00b8:
            r0 = move-exception
            r9 = 0
        L_0x00ba:
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x00bd:
            if (r3 == r5) goto L_0x00ef
            if (r3 == r4) goto L_0x00ef
            if (r3 != r6) goto L_0x00ec
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2130903067(0x7f03001b, float:1.7412942E38)
            int[] r2 = r1.getIntArray(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r4, r0)
            r0 = r2[r9]
            r1.setPixel(r8, r8, r0)
            android.content.res.Resources r0 = r11.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r1)
        L_0x00e2:
            r10.A00 = r2
            boolean r0 = X.C434920f.A09(r11)
            r10.A02 = r0
            r10.A01 = r4
        L_0x00ec:
            r8 = r9
            goto L_0x0036
        L_0x00ef:
            android.graphics.drawable.Drawable r2 = X.C62063Bm.A00(r11, r2)
            goto L_0x00e2
        L_0x00f4:
            r3 = 2
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AA.A0B(android.content.Context, boolean):X.3xc");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.content.Context r5, android.graphics.drawable.Drawable r6) {
        /*
            r4 = this;
            java.lang.String r1 = "wallpaper.jpg"
            java.lang.String r1 = com.obwhatsapp.yo.Conversation.wallpnm(r1)     // Catch:{ IOException -> 0x0026 }
            r0 = 0
            java.io.FileOutputStream r3 = r5.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0026 }
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch:{ all -> 0x001f }
            android.graphics.Bitmap r2 = r6.getBitmap()     // Catch:{ all -> 0x001f }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x001f }
            r0 = 90
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x002a
            r3.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x001f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0025
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x002a:
            X.12Y r0 = r4.A07
            r0.A5J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AA.A0C(android.content.Context, android.graphics.drawable.Drawable):void");
    }
}
