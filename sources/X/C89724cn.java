package X;

import android.view.View;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.4cn  reason: invalid class name and case insensitive filesystem */
public class C89724cn {
    public static final LayoutOutput A00;
    public static final AnonymousClass5TP A01;

    static {
        LayoutOutput layoutOutput = new LayoutOutput(0);
        A00 = layoutOutput;
        A01 = new C95814nK(layoutOutput, (AnonymousClass3BJ) null, 0, 0);
    }

    public static float[] A00(float f2, float f3, float f4, float f5, float f6) {
        float[] fArr;
        float f7 = 0.0f;
        if (!Float.isNaN(f2)) {
            if (!Float.isNaN(f5)) {
                f7 = f5;
            }
            float f8 = f6;
            if (Float.isNaN(f6)) {
                f8 = Float.POSITIVE_INFINITY;
            }
            if (f2 >= f7 && f2 <= f8) {
                return new float[]{f2, f2};
            }
            fArr = new float[2];
            fArr[0] = f5;
        } else if (!Float.isNaN(f3)) {
            if (Float.isNaN(f5)) {
                f5 = 0.0f;
            }
            fArr = new float[2];
            fArr[0] = Math.max(f3, f5);
        } else {
            if (!Float.isNaN(f4)) {
                return new float[]{f5, f4};
            }
            fArr = new float[2];
            fArr[0] = f5;
        }
        fArr[1] = f6;
        return fArr;
    }

    public static float[] A01(int i2) {
        float[] fArr;
        float size = (float) View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            fArr = new float[2];
            fArr[0] = size;
        } else {
            fArr = new float[]{Float.NaN, Float.NaN};
            if (mode == Integer.MIN_VALUE) {
                fArr[0] = 0.0f;
            } else {
                return fArr;
            }
        }
        fArr[1] = size;
        return fArr;
    }
}
