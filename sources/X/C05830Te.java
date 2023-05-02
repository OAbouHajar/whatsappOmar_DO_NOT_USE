package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.0Te  reason: invalid class name and case insensitive filesystem */
public class C05830Te {
    public static final boolean A00;
    public static final boolean A01;
    public static final boolean A02;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        boolean z3 = false;
        if (i2 >= 19) {
            z3 = true;
        }
        A00 = z3;
        boolean z4 = false;
        if (i2 >= 18) {
            z4 = true;
        }
        A01 = z4;
        if (i2 < 28) {
            z2 = false;
        }
        A02 = z2;
    }

    public static View A00(View view, View view2, ViewGroup viewGroup) {
        boolean z2;
        boolean z3;
        ViewGroup viewGroup2;
        int i2;
        Matrix A0H = AnonymousClass000.A0H();
        A0H.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        AnonymousClass0SD r0 = C06430Vt.A02;
        View view3 = view;
        r0.A02(A0H, view);
        ViewGroup viewGroup3 = viewGroup;
        r0.A03(A0H, viewGroup3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        A0H.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view3.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (A00) {
            z2 = !view3.isAttachedToWindow();
            z3 = viewGroup3.isAttachedToWindow();
        } else {
            z2 = false;
            z3 = false;
        }
        boolean z4 = A01;
        Bitmap bitmap = null;
        if (!z4 || !z2) {
            viewGroup2 = null;
            i2 = 0;
        } else {
            if (z3) {
                viewGroup2 = (ViewGroup) view3.getParent();
                i2 = viewGroup2.indexOfChild(view3);
                viewGroup3.getOverlay().add(view3);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int round7 = Math.round(((float) round5) * min);
            int round8 = Math.round(((float) round6) * min);
            A0H.postTranslate(-rectF.left, -rectF.top);
            A0H.postScale(min, min);
            if (A02) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round7, round8);
                beginRecording.concat(A0H);
                view3.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(A0H);
                view3.draw(canvas);
            }
        }
        if (z4 && z2) {
            viewGroup3.getOverlay().remove(view3);
            viewGroup2.addView(view3, i2);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
