package com.whatsapp.filter;

import X.AnonymousClass3B5;
import X.C26051Md;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;

public class FilterUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r7 >= X.AnonymousClass3B5.A00.size()) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.Bitmap r5, X.C26051Md r6, int r7, boolean r8) {
        /*
            r4 = 0
            if (r5 != 0) goto L_0x0009
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
        L_0x0005:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            return r4
        L_0x0009:
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L_0x0014
            java.lang.String r0 = "Invalid bitmap config."
            goto L_0x0005
        L_0x0014:
            if (r7 < 0) goto L_0x001f
            java.util.List r0 = X.AnonymousClass3B5.A00
            int r1 = r0.size()
            r0 = 1
            if (r7 < r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            goto L_0x0005
        L_0x0025:
            android.graphics.Bitmap r2 = A01(r6, r7)     // Catch:{ OutOfMemoryError -> 0x0033 }
            if (r8 == 0) goto L_0x003b
            r0 = 1
            android.graphics.Bitmap r5 = r5.copy(r3, r0)     // Catch:{ OutOfMemoryError -> 0x0031 }
            goto L_0x003b
        L_0x0031:
            r1 = move-exception
            goto L_0x0035
        L_0x0033:
            r1 = move-exception
            r2 = r4
        L_0x0035:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = r4
        L_0x003b:
            if (r5 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            boolean r0 = applyFilter(r2, r5)
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.recycle()
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            return r5
        L_0x004b:
            r0 = 0
            goto L_0x0043
        L_0x004d:
            if (r8 == 0) goto L_0x0008
            if (r5 == 0) goto L_0x0008
            r5.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A00(android.graphics.Bitmap, X.1Md, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.C26051Md r6, int r7) {
        /*
            X.4Kt r0 = X.AnonymousClass3B5.A00(r7)
            java.lang.String r5 = r0.A02
            monitor-enter(r6)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0082 }
            r2.inPreferredConfig = r0     // Catch:{ all -> 0x0082 }
            boolean r0 = r6.A0F()     // Catch:{ all -> 0x0082 }
            r3 = 0
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "FilterManager/Downloadable files are not ready and createLut is called, ui should have prevented calling this"
            X.AnonymousClass20U.A02(r0)     // Catch:{ all -> 0x0082 }
            r0 = 0
            r6.A0E(r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007e
        L_0x0021:
            java.util.HashMap r0 = r6.A0D()     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x0082 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0082 }
            if (r4 == 0) goto L_0x0060
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0060
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0046 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r3, r2)     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ IOException -> 0x0046 }
            monitor-exit(r6)
            return r0
        L_0x0041:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "FilterManager/createLut/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0082 }
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0082 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0082 }
            goto L_0x007e
        L_0x0060:
            java.util.HashMap r0 = r6.A00     // Catch:{ all -> 0x0080 }
            r0.clear()     // Catch:{ all -> 0x0080 }
            r1 = 0
            r0 = -1
            r6.A08(r1, r0)     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "FilterManager/createLut/Error getting downloaded file to compute bitmap for filterFileName="
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            r1.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0082 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0082 }
        L_0x007e:
            monitor-exit(r6)
            return r3
        L_0x0080:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A01(X.1Md, int):android.graphics.Bitmap");
    }

    public static boolean A02(Bitmap bitmap, Bitmap bitmap2, C26051Md r5, int i2) {
        String str;
        if (bitmap == null) {
            str = "FilterUtils/applyFilterIntoBuffer/sourceImage is null";
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            str = "Invalid sourceImage config.";
        } else if (i2 < 0 || i2 >= AnonymousClass3B5.A00.size()) {
            str = "FilterUtils/applyFilterIntoBuffer/filterId is invalid";
        } else {
            Log.a(bitmap2.isMutable());
            try {
                Bitmap A01 = A01(r5, i2);
                if (A01 != null) {
                    boolean applyFilterIntoBuffer = applyFilterIntoBuffer(A01, bitmap, bitmap2);
                    A01.recycle();
                    return applyFilterIntoBuffer;
                }
                return false;
            } catch (OutOfMemoryError e2) {
                Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e2);
                return false;
            }
        }
        Log.e(str);
        return false;
    }

    public static native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native boolean blurNative(Bitmap bitmap, int i2, int i3);
}
