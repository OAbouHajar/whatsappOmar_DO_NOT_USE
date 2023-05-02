package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.36c  reason: invalid class name and case insensitive filesystem */
public class C607836c extends C16690tT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.CompressFormat A03;
    public final Bitmap A04;
    public final Rect A05;
    public final Uri A06;
    public final AnonymousClass01V A07;
    public final C14730pf A08;
    public final WeakReference A09;
    public final boolean A0A;

    public C607836c(Activity activity, Bitmap.CompressFormat compressFormat, Bitmap bitmap, Rect rect, Uri uri, AnonymousClass01V r7, C14730pf r8, int i2, int i3, int i4, boolean z2) {
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = C13690nt.A0h(activity);
        this.A06 = uri;
        this.A03 = compressFormat;
        this.A01 = i2;
        this.A04 = bitmap;
        this.A05 = rect;
        this.A0A = z2;
        this.A00 = i3;
        this.A02 = i4;
    }

    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v24, types: [android.util.Pair] */
    /* JADX WARNING: type inference failed for: r0v28, types: [android.util.Pair] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019 A[Catch:{ IOException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f A[Catch:{ IOException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[SYNTHETIC, Splitter:B:9:0x0027] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.String r7 = "no-space"
            android.net.Uri r3 = r12.A06
            java.lang.String r0 = r3.getPath()
            java.io.File r11 = X.C13700nu.A0D(r0)
            r8 = 75
        L_0x000e:
            r10 = 0
            r9 = 0
            r6 = 1
            X.01V r0 = r12.A07     // Catch:{ IOException -> 0x0032 }
            android.content.ContentResolver r0 = r0.A0C()     // Catch:{ IOException -> 0x0032 }
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "cropimage/save-output cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0032 }
            goto L_0x0024
        L_0x001f:
            java.io.OutputStream r4 = r0.openOutputStream(r3)     // Catch:{ IOException -> 0x0032 }
            goto L_0x0025
        L_0x0024:
            r4 = r10
        L_0x0025:
            if (r4 == 0) goto L_0x0075
            android.graphics.Bitmap r1 = r12.A04     // Catch:{ IOException -> 0x002f, all -> 0x0106 }
            android.graphics.Bitmap$CompressFormat r0 = r12.A03     // Catch:{ IOException -> 0x002f, all -> 0x0106 }
            r1.compress(r0, r8, r4)     // Catch:{ IOException -> 0x002f, all -> 0x0106 }
            goto L_0x0075
        L_0x002f:
            r2 = move-exception
            r10 = r4
            goto L_0x0033
        L_0x0032:
            r2 = move-exception
        L_0x0033:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "cropimage/cannot save: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r1)     // Catch:{ all -> 0x0104 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x005d
            boolean r0 = X.C13690nt.A1T(r2)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0104 }
            android.content.Intent r0 = X.C13680ns.A09()     // Catch:{ all -> 0x0104 }
            android.content.Intent r0 = r0.putExtra(r7, r6)     // Catch:{ all -> 0x0104 }
            android.util.Pair r0 = X.C13690nt.A0I(r1, r0)     // Catch:{ all -> 0x0104 }
            goto L_0x006f
        L_0x005d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0104 }
            android.content.Intent r1 = X.C13680ns.A09()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "io-error"
            android.content.Intent r0 = r1.putExtra(r0, r6)     // Catch:{ all -> 0x0104 }
            android.util.Pair r0 = X.C13690nt.A0I(r2, r0)     // Catch:{ all -> 0x0104 }
        L_0x006f:
            X.C30311c8.A04(r10)
            r10 = r0
            r8 = 1
            goto L_0x0090
        L_0x0075:
            int r8 = r8 + -10
            X.C30311c8.A04(r4)
            int r1 = r12.A01
            if (r1 == 0) goto L_0x008f
            if (r8 <= 0) goto L_0x008f
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x008f
            long r4 = r11.length()
            long r1 = (long) r1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x000e
        L_0x008f:
            r8 = 0
        L_0x0090:
            long r1 = r11.length()
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00ba
            X.0pf r0 = r12.A08
            long r1 = r0.A01()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "cropimage/nospace"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.content.Intent r0 = X.C13680ns.A09()
            android.content.Intent r0 = r0.putExtra(r7, r6)
            android.util.Pair r10 = X.C13690nt.A0I(r1, r0)
            r8 = 1
        L_0x00ba:
            if (r8 != 0) goto L_0x0103
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x00e4
            int r2 = r12.A00
            if (r2 == r6) goto L_0x00e4
            if (r2 == 0) goto L_0x00e4
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ IOException -> 0x00da }
            X.03o r1 = new X.03o     // Catch:{ IOException -> 0x00da }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00da }
            java.lang.String r0 = java.lang.Integer.toString(r2)     // Catch:{ IOException -> 0x00da }
            r1.A0O(r0)     // Catch:{ IOException -> 0x00da }
            r1.A0A()     // Catch:{ IOException -> 0x00da }
            goto L_0x00e4
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "cropimage/exif/cannot save: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e4:
            android.content.Intent r2 = X.C13680ns.A09()
            r2.setData(r3)
            android.graphics.Rect r1 = r12.A05
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r1)
            int r1 = r12.A02
            java.lang.String r0 = "rotate"
            r2.putExtra(r0, r1)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r10 = X.C13690nt.A0I(r0, r2)
        L_0x0103:
            return r10
        L_0x0104:
            r0 = move-exception
            goto L_0x0108
        L_0x0106:
            r0 = move-exception
            r10 = r4
        L_0x0108:
            X.C30311c8.A04(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C607836c.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        this.A04.recycle();
        if (pair != null) {
            ((Activity) this.A09.get()).setResult(AnonymousClass000.A0D(pair.first), (Intent) pair.second);
        }
        ((Activity) this.A09.get()).finish();
    }
}
