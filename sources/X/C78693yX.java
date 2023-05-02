package X;

import android.graphics.Bitmap;

/* renamed from: X.3yX  reason: invalid class name and case insensitive filesystem */
public class C78693yX extends C16690tT {
    public Bitmap[] A00;

    public C78693yX(Bitmap[] bitmapArr) {
        this.A00 = bitmapArr;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2 = 0;
        while (true) {
            Bitmap[] bitmapArr = this.A00;
            if (i2 >= bitmapArr.length) {
                return null;
            }
            if (bitmapArr[i2] != null) {
                bitmapArr[i2].recycle();
                bitmapArr[i2] = null;
            }
            i2++;
        }
    }
}
