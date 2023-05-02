package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0XW  reason: invalid class name */
public class AnonymousClass0XW implements TypeEvaluator {
    public C015207h[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        C015207h[] r11 = (C015207h[]) obj;
        C015207h[] r12 = (C015207h[]) obj2;
        if (C015107g.A01(r11, r12)) {
            C015207h[] r4 = this.A00;
            if (!C015107g.A01(r4, r11)) {
                if (r11 == null) {
                    r4 = null;
                } else {
                    int length = r11.length;
                    r4 = new C015207h[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        r4[i2] = new C015207h(r11[i2]);
                    }
                }
                this.A00 = r4;
            }
            for (int i3 = 0; i3 < r11.length; i3++) {
                C015207h r7 = r4[i3];
                C015207h r6 = r11[i3];
                C015207h r5 = r12[i3];
                r7.A00 = r6.A00;
                int i4 = 0;
                while (true) {
                    float[] fArr = r6.A01;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    r7.A01[i4] = (fArr[i4] * (1.0f - f2)) + (r5.A01[i4] * f2);
                    i4++;
                }
            }
            return r4;
        }
        throw AnonymousClass000.A0T("Can't interpolate between two incompatible pathData");
    }
}
