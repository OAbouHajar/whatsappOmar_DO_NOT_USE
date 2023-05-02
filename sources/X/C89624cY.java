package X;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: X.4cY  reason: invalid class name and case insensitive filesystem */
public final class C89624cY {
    public static final AnonymousClass0EH A00 = new AnonymousClass0EH(12);

    public static int A00(Bitmap.Config config) {
        int i2 = C814248d.A00[config.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3 || i2 == 4) {
            return 2;
        }
        if (i2 == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    public static int A01(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getByteCount();
    }
}
