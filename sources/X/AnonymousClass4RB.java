package X;

import java.util.Locale;

/* renamed from: X.4RB  reason: invalid class name */
public class AnonymousClass4RB {
    public final float A00;
    public final float A01;
    public final int A02;

    public AnonymousClass4RB(int i2, float f2, float f3) {
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = i2;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        float f2 = this.A01;
        objArr[0] = Float.valueOf(f2);
        float f3 = this.A00;
        objArr[1] = Float.valueOf(f3);
        objArr[2] = Float.valueOf(f3 != 0.0f ? f2 / f3 : -1.0f);
        AnonymousClass000.A1M(objArr, this.A02, 3);
        return String.format(locale, "aspectWidth=%f aspectHeight=%f aspectRatio=%f rowWidthType=%d", objArr);
    }
}
