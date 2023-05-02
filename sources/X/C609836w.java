package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperImagePreview;

/* renamed from: X.36w  reason: invalid class name and case insensitive filesystem */
public class C609836w extends C16690tT {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final WallpaperImagePreview A04;
    public final WallpaperImagePreview A05;

    public C609836w(Context context, Resources resources, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, int i2, int i3) {
        this.A02 = context;
        this.A05 = wallpaperImagePreview;
        this.A04 = wallpaperImagePreview2;
        this.A03 = resources;
        this.A00 = i2;
        this.A01 = i3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            android.content.res.Resources r2 = r4.A03
            r3 = 0
            if (r2 == 0) goto L_0x0030
            android.content.Context r0 = r4.A02
            android.graphics.Point r1 = X.C16210se.A00(r0)
            int r0 = r4.A01     // Catch:{ IOException | OutOfMemoryError -> 0x002a }
            java.io.InputStream r2 = r2.openRawResource(r0)     // Catch:{ IOException | OutOfMemoryError -> 0x002a }
            r0 = 1
            X.25c r1 = X.C16210se.A01(r1, r0)     // Catch:{ all -> 0x0023 }
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r3, r1, r2, r0)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0022
            r2.close()     // Catch:{ IOException | OutOfMemoryError -> 0x002a }
        L_0x0022:
            return r0
        L_0x0023:
            r0 = move-exception
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x002a }
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "LoadWallpaperImageTask/error when loading wallpaper resource"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609836w.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C16690tT.A02(this)) {
            this.A04.setImageBitmap(bitmap);
            this.A05.animate().setDuration(500).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 11));
            return;
        }
        bitmap.recycle();
    }
}
