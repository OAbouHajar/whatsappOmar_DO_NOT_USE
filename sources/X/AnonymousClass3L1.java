package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.3L1  reason: invalid class name */
public class AnonymousClass3L1 extends BitmapDrawable {
    public final C16730tY A00;

    public AnonymousClass3L1(Resources resources, Bitmap bitmap, C16730tY r3) {
        super(resources, bitmap);
        this.A00 = r3;
    }

    public int getIntrinsicHeight() {
        C16750ta r0 = this.A00.A02;
        AnonymousClass00B.A06(r0);
        int i2 = r0.A06;
        return i2 <= 0 ? super.getIntrinsicHeight() : i2;
    }

    public int getIntrinsicWidth() {
        C16750ta r0 = this.A00.A02;
        AnonymousClass00B.A06(r0);
        int i2 = r0.A08;
        return i2 <= 0 ? super.getIntrinsicWidth() : i2;
    }
}
