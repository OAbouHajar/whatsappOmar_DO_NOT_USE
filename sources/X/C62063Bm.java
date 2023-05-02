package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Bm  reason: invalid class name and case insensitive filesystem */
public class C62063Bm {
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r3, android.content.res.Resources r4) {
        /*
            android.graphics.Point r1 = X.C16210se.A00(r3)
            r3 = 0
            r0 = 2131231131(0x7f08019b, float:1.8078334E38)
            java.io.InputStream r2 = r4.openRawResource(r0)     // Catch:{ IOException -> 0x0025 }
            r0 = 1
            X.25c r1 = X.C16210se.A01(r1, r0)     // Catch:{ all -> 0x001e }
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r3, r1, r2, r0)     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap r1 = r0.A02     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x002d
        L_0x001e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/exception"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0039
            r0 = 0
            r1.setDensity(r0)
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r4, r1)
            return r3
        L_0x0039:
            java.lang.String r0 = "wallpaper/cannot decode default wallpaper"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62063Bm.A00(android.content.Context, android.content.res.Resources):android.graphics.drawable.Drawable");
    }

    public static Drawable A01(Context context, Resources resources, File file) {
        if (file.exists()) {
            try {
                Bitmap bitmap = C37741pe.A06(C16210se.A01(C16210se.A00(context), true), file).A02;
                if (bitmap != null) {
                    return new BitmapDrawable(resources, bitmap);
                }
            } catch (OutOfMemoryError e2) {
                Log.e((Throwable) e2);
            }
        }
        return null;
    }

    public static Drawable A02(Context context, C14870pt r9, int i2, int i3, int i4) {
        Bitmap bitmap;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getPackageManager().getResourcesForApplication("com.obwhatsapp.wallpaper").getDrawable(i2);
            try {
                Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
                if (bitmap2 == null) {
                    bitmap2 = null;
                } else {
                    float f2 = (float) i3;
                    float height = ((float) bitmap2.getHeight()) / ((float) i4);
                    if (((float) bitmap2.getWidth()) / f2 > height) {
                        int width = (int) (((float) bitmap2.getWidth()) / height);
                        if (width > 0 && i4 > 0 && i3 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, width, i4, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i3) >> 1, 0, i3, i4);
                        }
                    } else {
                        int height2 = (int) ((((float) bitmap2.getHeight()) * f2) / ((float) bitmap2.getWidth()));
                        if (height2 > 0 && i4 > 0 && i3 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, i3, height2, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - i4) >> 1, i3, i4);
                        }
                    }
                    if (bitmap2 != bitmap) {
                        bitmap.recycle();
                    }
                }
                if (bitmap2 != null) {
                    return new BitmapDrawable((Resources) null, bitmap2);
                }
                r9.A07(R.string.str084a, 0);
                return drawable2;
            } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e2) {
                e = e2;
                drawable = drawable2;
                Log.e("wallpaper/set-global-wallpaper", e);
                r9.A07(R.string.str084a, 0);
                return drawable;
            }
        } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e3) {
            e = e3;
            Log.e("wallpaper/set-global-wallpaper", e);
            r9.A07(R.string.str084a, 0);
            return drawable;
        }
    }

    public static C15830rv A03(Intent intent) {
        return C15830rv.A02(intent.getStringExtra("chat_jid"));
    }

    public static void A04(Context context, Drawable drawable, int i2) {
        drawable.setColorFilter(new PorterDuffColorFilter(AnonymousClass090.A06(AnonymousClass00T.A00(context, R.color.color0092), (int) ((((float) i2) / 100.0f) * 255.0f)), PorterDuff.Mode.DARKEN));
    }
}
