package X;

import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import java.util.ArrayList;

/* renamed from: X.0dp  reason: invalid class name and case insensitive filesystem */
public class C08550dp implements C12670km {
    public int A00;

    public C08550dp(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object AaC(C09090et r21, float f2) {
        int i2;
        double d2;
        ArrayList A0u = AnonymousClass000.A0u();
        int i3 = 0;
        boolean z2 = false;
        if (r21.A0A() == AnonymousClass0KF.BEGIN_ARRAY) {
            z2 = true;
            r21.A0E();
        }
        while (r21.A0M()) {
            A0u.add(Float.valueOf(C09090et.A05(r21)));
        }
        if (z2) {
            r21.A0G();
        }
        int i4 = this.A00;
        if (i4 == -1) {
            i4 = A0u.size() >> 2;
            this.A00 = i4;
        }
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i2 = this.A00 << 2;
            if (i3 >= i2) {
                break;
            }
            int i7 = i3 >> 2;
            double A04 = (double) AnonymousClass000.A04(A0u.get(i3));
            int i8 = i3 % 4;
            if (i8 == 0) {
                if (i7 > 0) {
                    float f3 = (float) A04;
                    if (fArr[i7 - 1] >= f3) {
                        fArr[i7] = f3 + 0.01f;
                    }
                }
                fArr[i7] = (float) A04;
            } else if (i8 == 1) {
                i5 = (int) (A04 * 255.0d);
            } else if (i8 == 2) {
                i6 = (int) (A04 * 255.0d);
            } else if (i8 == 3) {
                iArr[i7] = Color.argb(MotionEventCompat.ACTION_MASK, i5, i6, (int) (A04 * 255.0d));
            }
            i3++;
        }
        AnonymousClass0O8 r10 = new AnonymousClass0O8(fArr, iArr);
        if (A0u.size() > i2) {
            int size = (A0u.size() - i2) >> 1;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i9 = 0;
            int i10 = 0;
            while (i2 < A0u.size()) {
                int i11 = i2 % 2;
                double A042 = (double) AnonymousClass000.A04(A0u.get(i2));
                if (i11 == 0) {
                    dArr[i10] = A042;
                } else {
                    dArr2[i10] = A042;
                    i10++;
                }
                i2++;
            }
            while (true) {
                int[] iArr2 = r10.A01;
                if (i9 >= iArr2.length) {
                    break;
                }
                int i12 = iArr2[i9];
                double d3 = (double) r10.A00[i9];
                int i13 = 1;
                while (true) {
                    if (i13 >= size) {
                        d2 = dArr2[size - 1];
                        break;
                    }
                    int i14 = i13 - 1;
                    double d4 = dArr[i14];
                    double d5 = dArr[i13];
                    if (d5 >= d3) {
                        double max = Math.max(0.0d, Math.min(1.0d, (d3 - d4) / (d5 - d4)));
                        double d6 = dArr2[i14];
                        d2 = d6 + (max * (dArr2[i13] - d6));
                        break;
                    }
                    i13++;
                }
                iArr2[i9] = Color.argb((int) (d2 * 255.0d), Color.red(i12), Color.green(i12), Color.blue(i12));
                i9++;
            }
        }
        return r10;
    }
}
