package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.SerializablePoint;

/* renamed from: X.3A1  reason: invalid class name */
public class AnonymousClass3A1 {
    public static InteractiveAnnotation A00(ImageView imageView, C16730tY r8, float f2, float f3) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix A0H = AnonymousClass000.A0H();
        imageView.getImageMatrix().invert(A0H);
        float[] fArr = {f2 - ((float) imageView.getLeft()), f3 - ((float) imageView.getTop())};
        float[] fArr2 = {(float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight()};
        A0H.mapPoints(fArr);
        return A01(r8, fArr, fArr2);
    }

    public static InteractiveAnnotation A01(C16730tY r19, float[] fArr, float[] fArr2) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        C16750ta r0 = r19.A02;
        C16750ta r192 = r0;
        if (r0 == null || (interactiveAnnotationArr = r0.A0V) == null || interactiveAnnotationArr.length <= 0) {
            return null;
        }
        int i2 = 0;
        PointF pointF = new PointF(fArr2[0], fArr2[1]);
        SerializablePoint serializablePoint = new SerializablePoint((double) ((int) fArr[0]), (double) ((int) fArr[1]));
        SerializablePoint serializablePoint2 = new SerializablePoint(serializablePoint.f147x / ((double) pointF.x), serializablePoint.f148y / ((double) pointF.y));
        while (true) {
            InteractiveAnnotation[] interactiveAnnotationArr2 = r192.A0V;
            if (i2 >= interactiveAnnotationArr2.length) {
                return null;
            }
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr2[i2];
            SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
            if (!(serializablePointArr == null || interactiveAnnotation.serializableLocation == null)) {
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    int length = serializablePointArr.length;
                    if (i3 >= length) {
                        break;
                    }
                    SerializablePoint serializablePoint3 = serializablePointArr[i3];
                    i3++;
                    SerializablePoint serializablePoint4 = serializablePointArr[i3 % length];
                    double d2 = serializablePoint3.f147x;
                    double d3 = serializablePoint2.f147x;
                    if ((d2 <= d3 && d3 < serializablePoint4.f147x) || (serializablePoint4.f147x <= d3 && d3 < d2)) {
                        double d4 = serializablePoint4.f148y;
                        double d5 = serializablePoint3.f148y;
                        if (serializablePoint2.f148y < (((d4 - d5) * (d3 - d2)) / (serializablePoint4.f147x - d2)) + d5) {
                            z2 = !z2;
                        }
                    }
                }
                if (z2) {
                    return interactiveAnnotation;
                }
            }
            i2++;
        }
    }
}
