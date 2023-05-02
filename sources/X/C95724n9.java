package X;

import android.graphics.Bitmap;

/* renamed from: X.4n9  reason: invalid class name and case insensitive filesystem */
public class C95724n9 implements AnonymousClass5UM {
    public /* bridge */ /* synthetic */ void Abg(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i2) / 2.0d), Bitmap.Config.RGB_565);
    }
}
