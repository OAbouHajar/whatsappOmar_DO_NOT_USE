package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.20i  reason: invalid class name and case insensitive filesystem */
public class C435120i {
    public static Bitmap A00(Drawable... drawableArr) {
        int length = drawableArr.length;
        if (length == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawableArr[0].getIntrinsicWidth(), 0), Math.max(drawableArr[0].getIntrinsicHeight(), 0), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = 0;
        do {
            Drawable drawable = drawableArr[i2];
            drawable.setBounds(0, 0, Math.max(drawable.getIntrinsicWidth(), 0), Math.max(drawable.getIntrinsicHeight(), 0));
            drawable.draw(canvas);
            i2++;
        } while (i2 < length);
        return createBitmap;
    }
}
