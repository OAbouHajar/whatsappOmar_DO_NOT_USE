package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.4VG  reason: invalid class name */
public class AnonymousClass4VG {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Bitmap A08;
    public final Paint A09;
    public final WebPImage A0A;
    public final String A0B;

    public AnonymousClass4VG(Bitmap bitmap, WebPImage webPImage, String str, int i2, int i3) {
        this.A0B = str;
        this.A0A = webPImage;
        this.A08 = bitmap;
        Paint paint = new Paint();
        this.A09 = paint;
        C13690nt.A0n(0, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A07 = webPImage.getFrameCount();
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = ((float) i2) / ((float) webPImage.getWidth());
    }

    public final void A00(Canvas canvas, C85074Na r11) {
        int i2 = r11.A02;
        float f2 = this.A04;
        int i3 = r11.A03;
        canvas.drawRect(((float) i2) * f2, ((float) i3) * f2, ((float) (i2 + r11.A01)) * f2, ((float) (i3 + r11.A00)) * f2, this.A09);
    }

    public synchronized void finalize() {
        this.A0A.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
        super.finalize();
    }
}
