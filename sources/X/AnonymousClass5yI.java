package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;

/* renamed from: X.5yI  reason: invalid class name */
public class AnonymousClass5yI implements Camera.FaceDetectionListener {
    public final /* synthetic */ AnonymousClass5zC A00;

    public AnonymousClass5yI(AnonymousClass5zC r1) {
        this.A00 = r1;
    }

    public static void A00(Matrix matrix, Point point, float[] fArr) {
        if (point != null) {
            fArr[0] = (float) point.x;
            fArr[1] = (float) point.y;
            matrix.mapPoints(fArr);
            point.set((int) fArr[0], (int) fArr[1]);
        }
    }

    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        C117165sY[] r5;
        if (faceArr != null) {
            int length = faceArr.length;
            r5 = new C117165sY[length];
            for (int i2 = 0; i2 < length; i2++) {
                Camera.Face face = faceArr[i2];
                r5[i2] = new C117165sY(face.leftEye, face.rightEye, face.mouth, face.rect);
                C117165sY r7 = r5[i2];
                Matrix matrix = this.A00.A03;
                RectF rectF = new RectF();
                float[] fArr = new float[2];
                Rect rect = r7.A03;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                A00(matrix, r7.A00, fArr);
                A00(matrix, r7.A02, fArr);
                A00(matrix, r7.A01, fArr);
            }
        } else {
            r5 = null;
        }
        AnonymousClass5xT.A00(new AnonymousClass655(this, r5));
    }
}
