package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.MotionEventCompat;
import android.widget.ImageView;

/* renamed from: X.3C3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BitmapDrawable A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ AnonymousClass3AJ A02;

    public /* synthetic */ AnonymousClass3C3(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, AnonymousClass3AJ r3) {
        this.A02 = r3;
        this.A00 = bitmapDrawable;
        this.A01 = bitmapDrawable2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass3AJ r4 = this.A02;
        BitmapDrawable bitmapDrawable = this.A00;
        BitmapDrawable bitmapDrawable2 = this.A01;
        float A04 = AnonymousClass000.A04(valueAnimator.getAnimatedValue());
        ImageView imageView = r4.A03;
        int i2 = (int) (A04 * 255.0f);
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 255) {
            i2 = MotionEventCompat.ACTION_MASK;
        }
        float max = Math.max(A04, 0.5f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), (int) (((float) bitmapDrawable.getIntrinsicWidth()) * max), (int) (((float) bitmapDrawable.getIntrinsicHeight()) * max), false);
        int max2 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicWidth())) * 2.0f);
        int max3 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicHeight(), bitmapDrawable2.getIntrinsicHeight())) * 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(max2, max3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (i2 > 0) {
            Paint paint = r4.A01;
            paint.setAlpha(i2);
            canvas.drawBitmap(createScaledBitmap, (float) ((max2 >> 1) - (createScaledBitmap.getWidth() >> 1)), (float) ((max3 >> 1) - (createScaledBitmap.getHeight() >> 1)), paint);
        }
        float f2 = 1.0f - A04;
        if (f2 >= 0.5f) {
            float max4 = Math.max(f2, 0.5f);
            int i3 = (int) (f2 * 255.0f);
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 > 255) {
                i3 = MotionEventCompat.ACTION_MASK;
            }
            Paint paint2 = r4.A01;
            paint2.setAlpha(i3);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDrawable2.getBitmap(), (int) (((float) bitmapDrawable2.getIntrinsicHeight()) * max4), (int) (((float) bitmapDrawable2.getIntrinsicWidth()) * max4), false);
            canvas.drawBitmap(createScaledBitmap2, (float) ((max2 >> 1) - (createScaledBitmap2.getWidth() >> 1)), (float) ((max3 >> 1) - (createScaledBitmap2.getHeight() >> 1)), paint2);
        }
        imageView.setImageBitmap(createBitmap);
    }
}
