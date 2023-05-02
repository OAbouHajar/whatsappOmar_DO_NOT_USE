package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Yz  reason: invalid class name and case insensitive filesystem */
public class C07060Yz implements Interpolator {
    public float[] A00;
    public float[] A01;

    public C07060Yz(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray A012 = C014907d.A01(context.getTheme(), context.getResources(), attributeSet, C014807c.A05);
        if (C014907d.A02("pathData", xmlPullParser)) {
            String string = !C014907d.A02("pathData", xmlPullParser) ? null : A012.getString(4);
            Path A002 = C015107g.A00(string);
            if (A002 != null) {
                A00(A002);
            } else {
                throw new InflateException(AnonymousClass000.A0h(string, AnonymousClass000.A0r("The path is null, which is created from ")));
            }
        } else if (!C014907d.A02("controlX1", xmlPullParser)) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C014907d.A02("controlY1", xmlPullParser)) {
            float f2 = !C014907d.A02("controlX1", xmlPullParser) ? 0.0f : A012.getFloat(0, 0.0f);
            float f3 = !C014907d.A02("controlY1", xmlPullParser) ? 0.0f : A012.getFloat(1, 0.0f);
            boolean A02 = C014907d.A02("controlX2", xmlPullParser);
            if (A02 != C014907d.A02("controlY2", xmlPullParser)) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!A02) {
                Path A0I = AnonymousClass000.A0I();
                A0I.moveTo(0.0f, 0.0f);
                A0I.quadTo(f2, f3, 1.0f, 1.0f);
                A00(A0I);
            } else {
                float f4 = !C014907d.A02("controlX2", xmlPullParser) ? 0.0f : A012.getFloat(2, 0.0f);
                float f5 = !C014907d.A02("controlY2", xmlPullParser) ? 0.0f : A012.getFloat(3, 0.0f);
                Path A0I2 = AnonymousClass000.A0I();
                A0I2.moveTo(0.0f, 0.0f);
                A0I2.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
                A00(A0I2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        A012.recycle();
    }

    public final void A00(Path path) {
        String str;
        StringBuilder sb;
        int i2;
        float[] fArr;
        float[] fArr2;
        int i3 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.A00 = new float[min];
            this.A01 = new float[min];
            float[] fArr3 = new float[2];
            int i4 = 0;
            do {
                i2 = min - 1;
                pathMeasure.getPosTan((((float) i4) * length) / ((float) i2), fArr3, (float[]) null);
                fArr = this.A00;
                fArr[i4] = fArr3[0];
                fArr2 = this.A01;
                fArr2[i4] = fArr3[1];
                i4++;
            } while (i4 < min);
            float f2 = fArr[0];
            if (((double) Math.abs(f2)) > 1.0E-5d || ((double) Math.abs(fArr2[0])) > 1.0E-5d || ((double) Math.abs(fArr[i2] - 1.0f)) > 1.0E-5d || ((double) Math.abs(fArr2[i2] - 1.0f)) > 1.0E-5d) {
                StringBuilder A0r = AnonymousClass000.A0r("The Path must start at (0,0) and end at (1,1) start: ");
                A0r.append(f2);
                A0r.append(",");
                A0r.append(this.A01[0]);
                A0r.append(" end:");
                int i5 = min - 1;
                A0r.append(this.A00[i5]);
                A0r.append(",");
                A0r.append(this.A01[i5]);
                str = A0r.toString();
                throw AnonymousClass000.A0T(str);
            }
            float f3 = 0.0f;
            int i6 = 0;
            do {
                int i7 = i6 + 1;
                float f4 = fArr[i6];
                if (f4 >= f3) {
                    fArr[i3] = f4;
                    i3++;
                    f3 = f4;
                    i6 = i7;
                } else {
                    sb = AnonymousClass000.A0r("The Path cannot loop back on itself, x :");
                    sb.append(f4);
                }
            } while (i3 < min);
            if (pathMeasure.nextContour()) {
                str = "The Path should be continuous, can't have 2+ contours";
                throw AnonymousClass000.A0T(str);
            }
            return;
        }
        sb = AnonymousClass000.A0r("The Path has a invalid length ");
        sb.append(length);
        str = sb.toString();
        throw AnonymousClass000.A0T(str);
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) >> 1;
            if (f2 < fArr[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float f3 = fArr[length];
        float f4 = fArr[i2];
        float f5 = f3 - f4;
        if (f5 == 0.0f) {
            return this.A01[i2];
        }
        float[] fArr2 = this.A01;
        float f6 = fArr2[i2];
        return AnonymousClass000.A01(fArr2[length], f6, (f2 - f4) / f5);
    }
}
