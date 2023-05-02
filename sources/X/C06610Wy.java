package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0Wy  reason: invalid class name and case insensitive filesystem */
public class C06610Wy {
    public static int A00(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WW.A00(obj);
        }
        try {
            return AnonymousClass000.A0D(AnonymousClass000.A0X(obj.getClass(), obj, "getResId"));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        }
    }

    public static int A01(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WW.A01(obj);
        }
        try {
            return AnonymousClass000.A0D(AnonymousClass000.A0X(obj.getClass(), obj, "getType"));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e("IconCompat", AnonymousClass000.A0f(obj, AnonymousClass000.A0q("Unable to get icon type ")), e2);
            return -1;
        }
    }

    public static Drawable A02(Context context, Icon icon) {
        return icon.loadDrawable(context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon A03(android.content.Context r4, androidx.core.graphics.drawable.IconCompat r5) {
        /*
            int r0 = r5.A02
            r3 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x000f;
                case 0: goto L_0x0008;
                case 1: goto L_0x0014;
                case 2: goto L_0x001d;
                case 3: goto L_0x0028;
                case 4: goto L_0x0035;
                case 5: goto L_0x003e;
                case 6: goto L_0x0045;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x000f:
            java.lang.Object r0 = r5.A06
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            return r0
        L_0x0014:
            java.lang.Object r0 = r5.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithBitmap(r0)
            goto L_0x0053
        L_0x001d:
            java.lang.String r1 = r5.A0D()
            int r0 = r5.A00
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r1, r0)
            goto L_0x0053
        L_0x0028:
            java.lang.Object r2 = r5.A06
            byte[] r2 = (byte[]) r2
            int r1 = r5.A00
            int r0 = r5.A01
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithData(r2, r1, r0)
            goto L_0x0053
        L_0x0035:
            java.lang.Object r0 = r5.A06
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x0053
        L_0x003e:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r5.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L_0x0070
        L_0x0045:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0064
            android.net.Uri r0 = r5.A0A()
            android.graphics.drawable.Icon r2 = X.AnonymousClass0LZ.A00(r0)
        L_0x0053:
            android.content.res.ColorStateList r0 = r5.A03
            if (r0 == 0) goto L_0x005a
            r2.setTintList(r0)
        L_0x005a:
            android.graphics.PorterDuff$Mode r1 = r5.A04
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.A0A
            if (r1 == r0) goto L_0x0063
            r2.setTintMode(r1)
        L_0x0063:
            return r2
        L_0x0064:
            if (r4 == 0) goto L_0x0093
            java.io.InputStream r0 = r5.A0C(r4)
            if (r0 == 0) goto L_0x0080
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
        L_0x0070:
            if (r1 < r2) goto L_0x0077
            android.graphics.drawable.Icon r2 = X.AnonymousClass0LY.A00(r0)
            goto L_0x0053
        L_0x0077:
            android.graphics.Bitmap r0 = androidx.core.graphics.drawable.IconCompat.A01(r0, r3)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithBitmap(r0)
            goto L_0x0053
        L_0x0080:
            java.lang.String r0 = "Cannot load adaptive icon from uri: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            android.net.Uri r0 = r5.A0A()
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0093:
            java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            android.net.Uri r0 = r5.A0A()
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06610Wy.A03(android.content.Context, androidx.core.graphics.drawable.IconCompat):android.graphics.drawable.Icon");
    }

    public static Uri A04(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WW.A02(obj);
        }
        try {
            return (Uri) AnonymousClass000.A0X(obj.getClass(), obj, "getUri");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        }
    }

    public static String A05(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WW.A03(obj);
        }
        try {
            return (String) AnonymousClass000.A0X(obj.getClass(), obj, "getResPackage");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        }
    }
}
