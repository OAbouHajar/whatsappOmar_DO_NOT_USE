package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.36q  reason: invalid class name and case insensitive filesystem */
public class C609236q extends C16690tT {
    public final Context A00;
    public final Uri A01;
    public final C24461Ga A02;
    public final C612738g A03;

    public C609236q(Context context, Uri uri, C24461Ga r3, C612738g r4) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
        this.A03 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1 = X.AnonymousClass000.A0o();
        r1.append("DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from ");
        X.AnonymousClass000.A1I(r7, r1);
        r1.append(" to ");
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0h(r3.toString(), r1));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0115 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x014b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0176 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0192 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0176=Splitter:B:68:0x0176, B:63:0x016e=Splitter:B:63:0x016e} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x0192=Splitter:B:81:0x0192, B:75:0x0188=Splitter:B:75:0x0188} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r7 = r18
            android.net.Uri r0 = r7.A01
            java.lang.String r0 = r0.getPath()
            X.AnonymousClass00B.A06(r0)
            java.io.File r6 = X.C13700nu.A0D(r0)
            X.1Ga r5 = r7.A02
            android.content.Context r9 = r7.A00
            android.graphics.Bitmap r4 = X.C24461Ga.A00(r9, r6)
            r3 = 0
            if (r4 == 0) goto L_0x0028
            r0 = 1
            X.4Ik[] r2 = new X.C83884Ik[r0]
            r1 = 1
            X.4Ik r0 = new X.4Ik
            r0.<init>(r1, r4)
            r2[r3] = r0
            r7.A07(r2)
        L_0x0028:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r1.split(r0)
            r10 = r0[r3]
            X.1GY r8 = r5.A02
            java.io.File r0 = r8.A01(r10)
            if (r0 == 0) goto L_0x004a
            android.graphics.Bitmap r1 = X.C24461Ga.A00(r9, r0)
            X.AnonymousClass00B.A06(r1)
            r0 = 2
            X.4Ik r3 = new X.4Ik
            r3.<init>(r0, r1)
            return r3
        L_0x004a:
            X.0wP r0 = r5.A01
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x005e
            r1 = 3
            r0 = 1
            X.AnonymousClass00B.A0F(r0)
            r0 = 0
            X.4Ik r3 = new X.4Ik
            r3.<init>(r1, r0)
            return r3
        L_0x005e:
            X.1GZ r4 = r5.A03     // Catch:{ IOException -> 0x0193 }
            X.0tz r0 = r4.A00     // Catch:{ IOException -> 0x0193 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0193 }
            float r1 = X.C13680ns.A01(r0)     // Catch:{ IOException -> 0x0193 }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            java.lang.String r3 = "xxhdpi"
        L_0x0071:
            java.util.HashMap r2 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x0193 }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r2.put(r1, r0)     // Catch:{ IOException -> 0x0193 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r10)     // Catch:{ IOException -> 0x0193 }
            java.lang.String r0 = "_"
            r1.append(r0)     // Catch:{ IOException -> 0x0193 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ IOException -> 0x0193 }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ IOException -> 0x0193 }
            X.0pd r1 = r4.A01     // Catch:{ IOException -> 0x0193 }
            X.13o r0 = r4.A03     // Catch:{ IOException -> 0x0193 }
            java.lang.String r1 = X.AnonymousClass20U.A01(r1, r0, r2)     // Catch:{ IOException -> 0x0193 }
            X.0zG r0 = r4.A02     // Catch:{ IOException -> 0x0193 }
            X.1pl r2 = r4.A00(r0, r1)     // Catch:{ IOException -> 0x0193 }
            if (r2 != 0) goto L_0x00b0
            goto L_0x00a3
        L_0x00a0:
            java.lang.String r3 = "hdpi"
            goto L_0x0071
        L_0x00a3:
            r1 = 4
            r0 = 1
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x018c }
            r0 = 0
            X.4Ik r3 = new X.4Ik     // Catch:{ all -> 0x018c }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x018c }
            goto L_0x019e
        L_0x00b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r10)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = ".jpg"
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x018c }
            r12 = 0
            X.0ua r3 = r8.A00     // Catch:{ IOException -> 0x0177 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0177 }
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0177 }
            java.io.InputStream r0 = r2.A9k(r3, r1, r0)     // Catch:{ IOException -> 0x0177 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0177 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0177 }
            r0 = 1
            java.io.File r1 = r8.A02(r0)     // Catch:{ all -> 0x0172 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x00e8
            boolean r0 = X.AnonymousClass1XI.A0P(r1)     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            goto L_0x016e
        L_0x00e8:
            r16 = 0
            java.io.File r7 = X.C13700nu.A0C(r1, r11)     // Catch:{ all -> 0x0172 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x0172 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0168 }
            r3.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0168 }
        L_0x00f7:
            long r5 = (long) r0     // Catch:{ FileNotFoundException -> 0x0168 }
            long r5 = r5 + r16
            r14 = 2097152(0x200000, double:1.0361308E-317)
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0116
            int r1 = r4.read(r13)     // Catch:{ all -> 0x0111 }
            r0 = -1
            if (r1 == r0) goto L_0x0116
            r3.write(r13, r12, r1)     // Catch:{ all -> 0x0111 }
            long r0 = (long) r1     // Catch:{ all -> 0x0111 }
            long r16 = r16 + r0
            r0 = 8192(0x2000, float:1.14794E-41)
            goto L_0x00f7
        L_0x0111:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0115 }
        L_0x0115:
            throw r0     // Catch:{ FileNotFoundException -> 0x0168 }
        L_0x0116:
            r3.close()     // Catch:{ FileNotFoundException -> 0x0168 }
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0123
            java.lang.String r0 = "DownloadableWallpaperStorage: File being saved is too large."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            goto L_0x016e
        L_0x0123:
            java.io.File r0 = r8.A02(r12)     // Catch:{ all -> 0x0172 }
            java.io.File r3 = X.C13700nu.A0C(r0, r11)     // Catch:{ all -> 0x0172 }
            X.C13690nt.A1K(r3)     // Catch:{ all -> 0x0172 }
            X.0tB r0 = r8.A02     // Catch:{ IOException -> 0x014b }
            X.AnonymousClass1XI.A0C(r0, r7, r3)     // Catch:{ IOException -> 0x014b }
            r4.close()     // Catch:{ IOException -> 0x0177 }
            java.io.File r0 = r8.A01(r10)     // Catch:{ all -> 0x018c }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x018c }
            android.graphics.Bitmap r1 = X.C24461Ga.A00(r9, r0)     // Catch:{ all -> 0x018c }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x018c }
            r0 = 2
            X.4Ik r3 = new X.4Ik     // Catch:{ all -> 0x018c }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x018c }
            goto L_0x0188
        L_0x014b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x0172 }
            X.AnonymousClass000.A1I(r7, r1)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0172 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            goto L_0x016e
        L_0x0168:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0172 }
        L_0x016e:
            r4.close()     // Catch:{ IOException -> 0x0177 }
            goto L_0x017d
        L_0x0172:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0176 }
        L_0x0176:
            throw r0     // Catch:{ IOException -> 0x0177 }
        L_0x0177:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x018c }
        L_0x017d:
            r1 = 5
            r0 = 1
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x018c }
            r0 = 0
            X.4Ik r3 = new X.4Ik     // Catch:{ all -> 0x018c }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x018c }
        L_0x0188:
            r2.close()     // Catch:{ IOException -> 0x0193 }
            goto L_0x019e
        L_0x018c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0192
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x0192:
            throw r0     // Catch:{ IOException -> 0x0193 }
        L_0x0193:
            r1 = 4
            r0 = 1
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x01a2 }
            r0 = 0
            X.4Ik r3 = new X.4Ik     // Catch:{ all -> 0x01a2 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x01a2:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609236q.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83884Ik r2 = (C83884Ik) obj;
        if (!C16690tT.A02(this)) {
            this.A03.A00(r2);
            return;
        }
        Bitmap bitmap = r2.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
