package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.obwhatsapp.R;

/* renamed from: X.0Vd  reason: invalid class name and case insensitive filesystem */
public class C06290Vd {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r3 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r4, X.AnonymousClass0JF r5, X.C14990q7 r6) {
        /*
            android.content.Context r4 = A01(r4, r6)
            r0 = 1
            r3 = 0
            int[] r2 = new int[r0]     // Catch:{ NotFoundException -> 0x0018 }
            int r0 = r5.attr     // Catch:{ NotFoundException -> 0x0018 }
            r1 = 0
            r2[r1] = r0     // Catch:{ NotFoundException -> 0x0018 }
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r2)     // Catch:{ NotFoundException -> 0x0018 }
            int r0 = r5.lightModeFallBackColorInt     // Catch:{ NotFoundException -> 0x0018 }
            int r0 = r3.getColor(r1, r0)     // Catch:{ NotFoundException -> 0x0018 }
            goto L_0x0023
        L_0x0018:
            r1 = move-exception
            boolean r0 = com.facebook.common.build.BuildConstants.isDebugBuild()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0027
            int r0 = r5.lightModeFallBackColorInt     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0026
        L_0x0023:
            r3.recycle()
        L_0x0026:
            return r0
        L_0x0027:
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            if (r3 == 0) goto L_0x002e
            r3.recycle()
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06290Vd.A00(android.content.Context, X.0JF, X.0q7):int");
    }

    public static Context A01(Context context, C14990q7 r3) {
        boolean A02 = A02(context, r3);
        int i2 = R.style.style00f2;
        if (A02) {
            i2 = R.style.style00f1;
        }
        return new ContextThemeWrapper(context, i2);
    }

    public static boolean A02(Context context, C14990q7 r1) {
        return r1 != null ? r1.A04() : C04310Ma.A00(context);
    }
}
