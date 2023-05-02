package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass1A9;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16210se;
import X.C222617g;
import X.C49132Rg;
import android.view.MenuItem;
import com.obwhatsapp.R;

public class YoGalleryWallpaperPreview extends GalleryWallpaperPreview {
    public YoGalleryWallpaperPreview() {
    }

    public YoGalleryWallpaperPreview(int i2) {
        this.A06 = false;
        C13680ns.A1G(this, 124);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
            this.A05 = (AnonymousClass1A9) r1.AE7.get();
            this.A03 = (C222617g) r1.A8a.get();
            this.A04 = (C16210se) r1.AQr.get();
        }
    }

    public int A35() {
        return R.layout.layout02b5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ FileNotFoundException -> 0x00ba, all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x003f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031 A[Catch:{ FileNotFoundException -> 0x00ba, all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037 A[Catch:{ FileNotFoundException -> 0x00ba, all -> 0x00e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A37(X.C15830rv r13) {
        /*
            r12 = this;
            java.lang.String r6 = "io-error"
            android.net.Uri r0 = r12.A01
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "gallerywallpaperpreview/no uri found to save to. generating our own"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0se r0 = r12.A04
            android.net.Uri r0 = r0.A04()
            r12.A01 = r0
        L_0x0013:
            java.lang.String r0 = r0.getPath()
            java.io.File r11 = X.C13700nu.A0D(r0)
            com.obwhatsapp.mediaview.PhotoView r0 = r12.A02
            android.graphics.Bitmap r10 = r0.getFullViewCroppedBitmap()
            X.AnonymousClass00B.A06(r10)
            r9 = 90
            r4 = 0
        L_0x0027:
            r5 = 1
            r3 = 0
            X.01V r0 = r12.A08     // Catch:{ FileNotFoundException -> 0x00ba }
            android.content.ContentResolver r1 = r0.A0C()     // Catch:{ FileNotFoundException -> 0x00ba }
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "gallerywallpaperpreview/save cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x00ba }
            goto L_0x003d
        L_0x0037:
            android.net.Uri r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x00ba }
            java.io.OutputStream r4 = r1.openOutputStream(r0)     // Catch:{ FileNotFoundException -> 0x00ba }
        L_0x003d:
            if (r4 != 0) goto L_0x0040
            goto L_0x0088
        L_0x0040:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00ba }
            r10.compress(r0, r9, r4)     // Catch:{ FileNotFoundException -> 0x00ba }
            int r9 = r9 + -10
            X.C30311c8.A04(r4)
            int r0 = r12.A00
            if (r0 <= 0) goto L_0x0061
            if (r9 <= 0) goto L_0x0061
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x0061
            long r7 = r11.length()
            int r0 = r12.A00
            long r0 = (long) r0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0027
        L_0x0061:
            long r1 = r11.length()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            X.0pf r0 = r12.A06
            long r1 = r0.A01()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "gallerywallpaperpreview/no space to save compressed image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "no-space"
            android.content.Intent r0 = r1.putExtra(r0, r5)
            r12.setResult(r3, r0)
            return
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ FileNotFoundException -> 0x00ba }
            java.lang.String r0 = "gallerywallpaperpreview/outputstream/failed to open output stream for "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x00ba }
            android.net.Uri r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x00ba }
            java.lang.String r0 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x00ba }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ FileNotFoundException -> 0x00ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x00ba }
            android.content.Intent r0 = X.C13680ns.A09()     // Catch:{ FileNotFoundException -> 0x00ba }
            android.content.Intent r0 = r0.putExtra(r6, r5)     // Catch:{ FileNotFoundException -> 0x00ba }
            r12.setResult(r3, r0)     // Catch:{ FileNotFoundException -> 0x00ba }
            goto L_0x00dc
        L_0x00aa:
            android.content.Intent r1 = X.C13680ns.A09()
            android.net.Uri r0 = r12.A01
            r1.setData(r0)
            X.C16030sJ.A0B(r1, r13)
            X.C13680ns.A0r(r12, r1)
            return
        L_0x00ba:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "gallerywallpaperpreview/file not found at "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            android.net.Uri r0 = r12.A01     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00e0 }
            android.content.Intent r0 = X.C13680ns.A09()     // Catch:{ all -> 0x00e0 }
            android.content.Intent r0 = r0.putExtra(r6, r5)     // Catch:{ all -> 0x00e0 }
            r12.setResult(r3, r0)     // Catch:{ all -> 0x00e0 }
        L_0x00dc:
            X.C30311c8.A04(r4)
            return
        L_0x00e0:
            r0 = move-exception
            X.C30311c8.A04(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.chat.wallpaper.YoGalleryWallpaperPreview.A37(X.0rv):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017e, code lost:
        if (r5 != null) goto L_0x0180;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x01e0 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x01e0=Splitter:B:49:0x01e0, B:41:0x01c5=Splitter:B:41:0x01c5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            super.onCreate(r0)
            r0 = 2131367066(0x7f0a149a, float:1.8354043E38)
            android.view.View r0 = r1.findViewById(r0)
            com.obwhatsapp.mediaview.PhotoView r0 = (com.obwhatsapp.mediaview.PhotoView) r0
            r1.A02 = r0
            r0 = 2131362571(0x7f0a030b, float:1.8344926E38)
            android.view.View r2 = r1.findViewById(r0)
            r0 = 24
            X.C13680ns.A19(r2, r1, r0)
            r0 = 2131365456(0x7f0a0e50, float:1.8350778E38)
            android.view.View r7 = r1.findViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.widget.FrameLayout$LayoutParams r9 = X.C13690nt.A0M()
            X.17g r5 = r1.A03
            X.0t3 r3 = r1.A05
            X.0sK r0 = r1.A01
            r2 = 0
            r6 = 0
            java.lang.String r0 = X.C224718b.A00(r0, r3, r6)
            X.1Vw r4 = new X.1Vw
            r4.<init>(r2, r0, r6)
            X.0t3 r0 = r1.A05
            long r2 = r0.A00()
            X.0tZ r8 = r5.A01(r4, r6, r2)
            X.1cc r8 = (X.C30581cc) r8
            r0 = 2131893055(0x7f121b3f, float:1.9420876E38)
            java.lang.String r0 = r1.getString(r0)
            r8.A0k(r0)
            X.17g r10 = r1.A03
            X.0t3 r3 = r1.A05
            X.0sK r0 = r1.A01
            r0.A0B()
            X.1ZT r2 = r0.A05
            r5 = 1
            java.lang.String r0 = X.C224718b.A00(r0, r3, r6)
            X.1Vw r4 = new X.1Vw
            r4.<init>(r2, r0, r5)
            X.0t3 r0 = r1.A05
            long r2 = r0.A00()
            X.0tZ r4 = r10.A01(r4, r6, r2)
            X.1cc r4 = (X.C30581cc) r4
            java.lang.String r0 = r1.A36()
            r4.A0k(r0)
            r0 = 5
            r4.A0W(r0)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r3.setBackgroundResource(r6)
            r3.setLayoutParams(r9)
            r3.setOrientation(r5)
            r7.addView(r3)
            android.os.Bundle r2 = X.C13690nt.A0E(r1)
            if (r2 == 0) goto L_0x00a7
            java.lang.String r0 = "output"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r1.A01 = r0
            java.lang.String r0 = "maxFileSize"
            int r0 = r2.getInt(r0, r6)
            r1.A00 = r0
        L_0x00a7:
            android.content.Intent r0 = r1.getIntent()
            android.net.Uri r6 = r0.getData()
            java.lang.String r3 = "io-error"
            r11 = 0
            r2 = 1
            if (r6 != 0) goto L_0x00c9
            java.lang.String r0 = "gallerywallpaperpreview/no uri found in intent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.C13680ns.A09()
        L_0x00be:
            android.content.Intent r0 = r0.putExtra(r3, r2)
        L_0x00c2:
            r1.setResult(r11, r0)
            r1.finish()
            return
        L_0x00c9:
            android.graphics.Point r7 = new android.graphics.Point     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r7.<init>()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            X.C13680ns.A0s(r1, r7)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            X.1A9 r0 = r1.A05     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            java.io.InputStream r4 = r0.A0b(r6, r5)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01dc }
            r13.<init>()     // Catch:{ all -> 0x01dc }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01dc }
            r13.inPreferredConfig = r0     // Catch:{ all -> 0x01dc }
            r13.inDither = r5     // Catch:{ all -> 0x01dc }
            int r15 = r7.x     // Catch:{ all -> 0x01dc }
            int r0 = r7.y     // Catch:{ all -> 0x01dc }
            r14 = 0
            r17 = 0
            X.25c r12 = new X.25c     // Catch:{ all -> 0x01dc }
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01dc }
            X.25d r0 = X.C37741pe.A04(r14, r12, r4, r11)     // Catch:{ all -> 0x01dc }
            android.graphics.Bitmap r10 = r0.A02     // Catch:{ all -> 0x01dc }
            r4.close()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            java.lang.String r4 = "not-a-image"
            java.lang.String r9 = "gallerywallpaperpreview/failed to load bitmap"
            if (r10 == 0) goto L_0x01c5
            int r0 = r10.getWidth()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r0 == 0) goto L_0x01c5
            int r0 = r10.getHeight()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r0 == 0) goto L_0x01c5
            X.01V r0 = r1.A08     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            android.content.ContentResolver r0 = r0.A0C()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            android.graphics.Matrix r15 = X.C17970vw.A09(r0, r6)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r15 != 0) goto L_0x011b
            android.graphics.Matrix r15 = X.AnonymousClass000.A0H()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
        L_0x011b:
            int r13 = r10.getWidth()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r14 = r10.getHeight()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r12 = 0
            r16 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r10 == r6) goto L_0x012f
            r10.recycle()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
        L_0x012f:
            r5 = r6
            android.graphics.Point r7 = new android.graphics.Point     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r7.<init>()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            X.C13680ns.A0s(r1, r7)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r0 = r7.x     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r8 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r8 = r8 / r0
            int r0 = r7.y     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r7 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r7 = r7 / r0
            float r7 = java.lang.Math.max(r8, r7)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0179
            java.lang.String r0 = "gallerywallpaperpreview/scaling image by "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r5.append(r7)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            java.lang.String r0 = "x to fit screen"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = r0 * r7
            int r5 = (int) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            float r0 = r0 * r7
            int r0 = (int) r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r6, r5, r0, r2)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
        L_0x0179:
            if (r5 == r6) goto L_0x0180
            r6.recycle()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r5 == 0) goto L_0x01b8
        L_0x0180:
            int r0 = r5.getWidth()
            if (r0 == 0) goto L_0x01b8
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "gallerywallpaperpreview/wallpaper loaded/w="
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            int r0 = r5.getWidth()
            r3.append(r0)
            java.lang.String r0 = "; h="
            r3.append(r0)
            int r0 = r5.getHeight()
            r3.append(r0)
            X.C13680ns.A1V(r3)
            com.obwhatsapp.mediaview.PhotoView r3 = r1.A02
            r3.A0Y = r2
            r0 = 3
            r3.A09 = r0
            r3.setAllowFullViewCrop(r2)
            com.obwhatsapp.mediaview.PhotoView r0 = r1.A02
            r0.A06(r5)
            return
        L_0x01b8:
            com.whatsapp.util.Log.e((java.lang.String) r9)
            android.content.Intent r0 = X.C13680ns.A09()
            android.content.Intent r0 = r0.putExtra(r4, r2)
            goto L_0x00c2
        L_0x01c5:
            com.whatsapp.util.Log.e((java.lang.String) r9)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            if (r10 == 0) goto L_0x01cd
            r10.recycle()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
        L_0x01cd:
            android.content.Intent r0 = X.C13680ns.A09()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            android.content.Intent r0 = r0.putExtra(r4, r5)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r1.setResult(r11, r0)     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            r1.finish()     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
            goto L_0x01fb
        L_0x01dc:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            throw r0     // Catch:{ IOException -> 0x01ef, OutOfMemoryError -> 0x01e1 }
        L_0x01e1:
            r3 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/out of memory trying to load wallpaper"
            com.whatsapp.util.Log.e(r0, r3)
            android.content.Intent r0 = X.C13680ns.A09()
            java.lang.String r3 = "error-oom"
            goto L_0x00be
        L_0x01ef:
            r4 = move-exception
            java.lang.String r0 = "gallerywallpaperpreview/io error loading wallpaper"
            com.whatsapp.util.Log.e(r0, r4)
            android.content.Intent r0 = X.C13680ns.A09()
            goto L_0x00be
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.chat.wallpaper.YoGalleryWallpaperPreview.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }
}
