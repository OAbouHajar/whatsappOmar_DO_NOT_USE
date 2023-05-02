package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.media.FaceDetector;
import android.util.Pair;
import java.io.File;

/* renamed from: X.1x8  reason: invalid class name and case insensitive filesystem */
public class C42041x8 {
    public static Pair A00(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        C446925d A06 = C37741pe.A06(new C446825c(options, (Long) null, 400, 400, true), file);
        Bitmap bitmap = A06.A02;
        Pair pair = null;
        if (bitmap == null) {
            return null;
        }
        if ((bitmap.getWidth() & 1) == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            bitmap = createBitmap;
        }
        FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
        if (new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 1).findFaces(bitmap, faceArr) > 0 && faceArr[0].confidence() > 0.3f) {
            PointF pointF = new PointF();
            faceArr[0].getMidPoint(pointF);
            pair = new Pair(Integer.valueOf((int) ((pointF.x * ((float) A06.A01)) / ((float) bitmap.getWidth()))), Integer.valueOf((int) ((pointF.y * ((float) A06.A00)) / ((float) bitmap.getHeight()))));
        }
        bitmap.recycle();
        return pair;
    }
}
