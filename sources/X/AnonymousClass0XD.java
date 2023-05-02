package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;

/* renamed from: X.0XD  reason: invalid class name */
public final class AnonymousClass0XD {
    public static float A00 = -1.0f;
    public static final float A01 = ((float) (Math.sqrt(2.0d) / 2.0d));
    public static final ThreadLocal A02 = new C11170iJ();
    public static final ThreadLocal A03 = new C11200iM();
    public static final ThreadLocal A04 = new C11180iK();
    public static final ThreadLocal A05 = new C11190iL();

    public static float A00() {
        float f2 = A00;
        if (f2 != -1.0f) {
            return f2;
        }
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        A00 = f3;
        return f3;
    }

    public static float A01(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return i2 >= 17 ? Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) : Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float A02(Matrix matrix) {
        float[] fArr = (float[]) A03.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = A01;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    public static void A03(Canvas canvas, Paint paint, RectF rectF, int i2) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i2);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        AnonymousClass0NI.A01();
    }

    public static void A04(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = (PathMeasure) A02.get();
        Path path2 = (Path) A04.get();
        Path path3 = (Path) A05.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f2 == 1.0f && f3 == 0.0f) && length >= 1.0f && ((double) Math.abs((f3 - f2) - 1.0f)) >= 0.01d) {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = (float) C06560Ws.A00(min, length);
                max = (float) C06560Ws.A00(max, length);
            }
            if (min < 0.0f) {
                min = (float) C06560Ws.A00(min, length);
            }
            if (max < 0.0f) {
                max = (float) C06560Ws.A00(max, length);
            }
            if (min == max) {
                path.reset();
            } else {
                if (min >= max) {
                    min -= length;
                }
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                } else {
                    if (min < 0.0f) {
                        path3.reset();
                        pathMeasure.getSegment(min + length, length, path3, true);
                    }
                    path.set(path2);
                }
                path2.addPath(path3);
                path.set(path2);
            }
        }
        AnonymousClass0NI.A01();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
