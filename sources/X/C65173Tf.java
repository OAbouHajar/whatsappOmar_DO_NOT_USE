package X;

import android.graphics.Bitmap;

/* renamed from: X.3Tf  reason: invalid class name and case insensitive filesystem */
public class C65173Tf extends C95614mv implements AnonymousClass5UM {
    public C65173Tf(C12190jz r1, C88144a1 r2, AnonymousClass5Kx r3) {
        super(r1, r2, r3);
    }

    public int A01(int i2) {
        return i2;
    }

    public /* bridge */ /* synthetic */ int A02(Object obj) {
        return ((Bitmap) obj).getAllocationByteCount();
    }

    public /* bridge */ /* synthetic */ Object A03(int i2) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i2) / 2.0d), Bitmap.Config.RGB_565);
    }

    public /* bridge */ /* synthetic */ Object A04(AnonymousClass4LL r3) {
        Bitmap bitmap = (Bitmap) super.A04(r3);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    public /* bridge */ /* synthetic */ void A07(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public /* bridge */ /* synthetic */ boolean A09(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
