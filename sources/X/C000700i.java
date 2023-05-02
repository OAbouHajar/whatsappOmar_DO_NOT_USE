package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.00i  reason: invalid class name and case insensitive filesystem */
public abstract class C000700i {
    public Matrix A00;

    public static View A00(Context context, Parcelable parcelable) {
        ImageView imageView = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap != null) {
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                }
            }
        } else if (parcelable instanceof Bitmap) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
        return imageView;
    }

    public Parcelable A01(View view, Matrix matrix, RectF rectF) {
        Bitmap createBitmap;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                    if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                        int i2 = (int) (((float) intrinsicWidth) * min);
                        int i3 = (int) (((float) intrinsicHeight) * min);
                        createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Rect bounds = drawable.getBounds();
                        int i4 = bounds.left;
                        int i5 = bounds.top;
                        int i6 = bounds.right;
                        int i7 = bounds.bottom;
                        drawable.setBounds(0, 0, i2, i3);
                        drawable.draw(canvas);
                        drawable.setBounds(i4, i5, i6, i7);
                    } else {
                        createBitmap = ((BitmapDrawable) drawable).getBitmap();
                    }
                    if (createBitmap != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", createBitmap);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i8 = (int) (((float) round) * min2);
        int i9 = (int) (((float) round2) * min2);
        Matrix matrix2 = this.A00;
        if (matrix2 == null) {
            matrix2 = new Matrix();
            this.A00 = matrix2;
        }
        matrix2.set(matrix);
        this.A00.postTranslate(-rectF.left, -rectF.top);
        this.A00.postScale(min2, min2);
        Bitmap createBitmap2 = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.concat(this.A00);
        view.draw(canvas2);
        return createBitmap2;
    }

    public void A02(List list, List list2, List list3) {
    }

    public abstract void A03(List list, Map map);
}
