package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

/* renamed from: X.3Th  reason: invalid class name and case insensitive filesystem */
public class C65193Th extends C89204bl {
    public C65193Th(AnonymousClass0EH r1, AnonymousClass5UM r2, int i2) {
        super(r1, r2, i2);
    }

    public int A00(BitmapFactory.Options options, int i2, int i3) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? i2 * i3 * C89624cY.A00(options.inPreferredConfig) : (i2 * i3) << 3;
    }
}
