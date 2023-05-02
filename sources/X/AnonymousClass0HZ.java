package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.0HZ  reason: invalid class name */
public class AnonymousClass0HZ extends C08360dV {
    public AnonymousClass0SI A00;
    public final Paint A01 = new AnonymousClass0AR(3);
    public final Rect A02 = AnonymousClass000.A0J();
    public final Rect A03 = AnonymousClass000.A0J();

    public AnonymousClass0HZ(AnonymousClass0Ak r3, C05320Qf r4) {
        super(r3, r4);
    }

    public void A08(Canvas canvas, Matrix matrix, int i2) {
        Bitmap A0C = A0C();
        if (A0C != null && !A0C.isRecycled()) {
            float A002 = AnonymousClass0XD.A00();
            Paint paint = this.A01;
            paint.setAlpha(i2);
            AnonymousClass000.A13(paint, this.A00);
            canvas.save();
            canvas.concat(matrix);
            Rect rect = this.A03;
            rect.set(0, 0, A0C.getWidth(), A0C.getHeight());
            Rect rect2 = this.A02;
            rect2.set(0, 0, (int) (((float) A0C.getWidth()) * A002), (int) (((float) A0C.getHeight()) * A002));
            canvas.drawBitmap(A0C, rect, rect2, paint);
            canvas.restore();
        }
    }

    public final Bitmap A0C() {
        Bitmap bitmap;
        String str = this.A0M.A0H;
        AnonymousClass0Ak r5 = this.A0K;
        AnonymousClass0U9 r4 = null;
        if (r5.getCallback() != null) {
            AnonymousClass0U9 r2 = r5.A07;
            if (r2 != null) {
                Drawable.Callback callback = r5.getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!(context == null && r2.A01 == null) && !r2.A01.equals(context)) {
                    r5.A07 = null;
                }
            }
            r4 = r5.A07;
            if (r4 == null) {
                r4 = new AnonymousClass0U9(r5.getCallback(), r5.A09, r5.A04.A0A);
                r5.A07 = r4;
            }
        }
        if (r4 == null) {
            return null;
        }
        Map map = r4.A03;
        C05000Ov r9 = (C05000Ov) map.get(str);
        if (r9 == null) {
            return null;
        }
        Bitmap bitmap2 = r9.A00;
        if (bitmap2 != null) {
            return bitmap2;
        }
        String str2 = r9.A03;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                String str3 = r4.A02;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        bitmap = BitmapFactory.decodeStream(r4.A01.getAssets().open(AnonymousClass000.A0h(str2, AnonymousClass000.A0q(str3))), (Rect) null, options);
                        int i2 = r9.A02;
                        int i3 = r9.A01;
                        if (!(bitmap.getWidth() == i2 && bitmap.getHeight() == i3)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                    } catch (IllegalArgumentException e2) {
                        C05770Sy.A01("Unable to decode image.", e2);
                        return null;
                    }
                } else {
                    throw AnonymousClass000.A0V("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e3) {
                C05770Sy.A01("Unable to open asset.", e3);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e4) {
                C05770Sy.A01("data URL did not have correct base64 format.", e4);
                return null;
            }
        }
        synchronized (AnonymousClass0U9.A04) {
            ((C05000Ov) map.get(str)).A00 = bitmap;
        }
        return bitmap;
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        super.A4l(r3, obj);
        if (obj == C13480m6.A00) {
            this.A00 = r3 == null ? null : new AnonymousClass0HF(r3, (Object) null);
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        super.AAB(matrix, rectF, z2);
        Bitmap A0C = A0C();
        if (A0C != null) {
            rectF.set(0.0f, 0.0f, ((float) A0C.getWidth()) * AnonymousClass0XD.A00(), ((float) A0C.getHeight()) * AnonymousClass0XD.A00());
            this.A08.mapRect(rectF);
        }
    }
}
