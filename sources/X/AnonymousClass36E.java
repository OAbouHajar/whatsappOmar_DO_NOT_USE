package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.view.MotionEventCompat;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.36E  reason: invalid class name */
public final class AnonymousClass36E extends C16690tT {
    public final Matrix A00;
    public final Rect A01;
    public final Rect A02;
    public final WeakReference A03;

    public AnonymousClass36E(Matrix matrix, Rect rect, Rect rect2, C49672Uz r5) {
        this.A02 = rect;
        this.A01 = rect2;
        this.A00 = matrix;
        this.A03 = C13690nt.A0h(r5);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        AnonymousClass00B.A06(bitmapArr);
        boolean z2 = true;
        if (bitmapArr.length != 1) {
            z2 = false;
        }
        AnonymousClass00B.A0F(z2);
        Bitmap bitmap = bitmapArr[0];
        try {
            Rect rect = this.A02;
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            canvas.setMatrix(this.A00);
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), this.A01, (Paint) null);
            FilterUtils.blurNative(createBitmap, 75, 2);
            return createBitmap;
        } catch (OutOfMemoryError e2) {
            Log.e("BlurBitmapAsyncTask/doInBackground creating output bitmap", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C49672Uz r3 = (C49672Uz) this.A03.get();
        if (r3 != null && bitmap != null) {
            ShapePickerView shapePickerView = (ShapePickerView) r3;
            shapePickerView.A01 = bitmap;
            ValueAnimator valueAnimator = shapePickerView.A00;
            if (valueAnimator == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, MotionEventCompat.ACTION_MASK});
                shapePickerView.A00 = ofInt;
                ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                shapePickerView.A00.setDuration(300);
                C13690nt.A0p(shapePickerView.A00, shapePickerView, 7);
            } else {
                valueAnimator.cancel();
            }
            shapePickerView.A00.start();
        }
    }
}
