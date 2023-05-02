package X;

import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;

/* renamed from: X.39s  reason: invalid class name and case insensitive filesystem */
public abstract class C616439s {
    public final AnonymousClass4PG A00 = new AnonymousClass4PG();

    public C616439s A00(TypedArray typedArray) {
        String str;
        float f2;
        String str2;
        if (typedArray.hasValue(3)) {
            AnonymousClass4PG r1 = this.A00;
            r1.A0H = typedArray.getBoolean(3, r1.A0H);
        }
        if (typedArray.hasValue(0)) {
            AnonymousClass4PG r12 = this.A00;
            r12.A0G = typedArray.getBoolean(0, r12.A0G);
        }
        if (typedArray.hasValue(1)) {
            A02(typedArray.getFloat(1, 0.3f));
        }
        if (typedArray.hasValue(11)) {
            A03(typedArray.getFloat(11, 1.0f));
        }
        if (typedArray.hasValue(7)) {
            AnonymousClass4PG r5 = this.A00;
            long j2 = (long) typedArray.getInt(7, (int) r5.A0D);
            if (j2 >= 0) {
                r5.A0D = j2;
            } else {
                str = C13680ns.A0j(AnonymousClass000.A0r("Given a negative duration: "), j2);
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(14)) {
            AnonymousClass4PG r13 = this.A00;
            r13.A0A = typedArray.getInt(14, r13.A0A);
        }
        if (typedArray.hasValue(15)) {
            AnonymousClass4PG r52 = this.A00;
            long j3 = (long) typedArray.getInt(15, (int) r52.A0E);
            if (j3 >= 0) {
                r52.A0E = j3;
            } else {
                str = C13680ns.A0j(AnonymousClass000.A0r("Given a negative repeat delay: "), j3);
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(16)) {
            AnonymousClass4PG r14 = this.A00;
            r14.A0B = typedArray.getInt(16, r14.A0B);
        }
        if (typedArray.hasValue(5)) {
            AnonymousClass4PG r2 = this.A00;
            int i2 = typedArray.getInt(5, r2.A06);
            if (i2 != 1) {
                int i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 0;
                    }
                }
                r2.A06 = i3;
            } else {
                r2.A06 = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            AnonymousClass4PG r15 = this.A00;
            if (typedArray.getInt(17, r15.A0C) != 1) {
                r15.A0C = 0;
            } else {
                r15.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            AnonymousClass4PG r22 = this.A00;
            f2 = typedArray.getFloat(6, r22.A00);
            if (f2 >= 0.0f) {
                r22.A00 = f2;
            } else {
                str2 = "Given invalid dropoff value: ";
                StringBuilder A0r = AnonymousClass000.A0r(str2);
                A0r.append(f2);
                str = A0r.toString();
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(9)) {
            AnonymousClass4PG r23 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, r23.A08);
            if (dimensionPixelSize >= 0) {
                r23.A08 = dimensionPixelSize;
            } else {
                str = C13680ns.A0c(dimensionPixelSize, "Given invalid width: ");
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(8)) {
            AnonymousClass4PG r24 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, r24.A07);
            if (dimensionPixelSize2 >= 0) {
                r24.A07 = dimensionPixelSize2;
            } else {
                str = C13680ns.A0c(dimensionPixelSize2, "Given invalid height: ");
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(13)) {
            AnonymousClass4PG r25 = this.A00;
            f2 = typedArray.getFloat(13, r25.A02);
            if (f2 >= 0.0f) {
                r25.A02 = f2;
            } else {
                str2 = "Given invalid intensity value: ";
                StringBuilder A0r2 = AnonymousClass000.A0r(str2);
                A0r2.append(f2);
                str = A0r2.toString();
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(19)) {
            AnonymousClass4PG r26 = this.A00;
            f2 = typedArray.getFloat(19, r26.A04);
            if (f2 >= 0.0f) {
                r26.A04 = f2;
            } else {
                str2 = "Given invalid width ratio: ";
                StringBuilder A0r22 = AnonymousClass000.A0r(str2);
                A0r22.append(f2);
                str = A0r22.toString();
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(10)) {
            AnonymousClass4PG r27 = this.A00;
            f2 = typedArray.getFloat(10, r27.A01);
            if (f2 >= 0.0f) {
                r27.A01 = f2;
            } else {
                str2 = "Given invalid height ratio: ";
                StringBuilder A0r222 = AnonymousClass000.A0r(str2);
                A0r222.append(f2);
                str = A0r222.toString();
                throw AnonymousClass000.A0T(str);
            }
        }
        if (typedArray.hasValue(18)) {
            AnonymousClass4PG r16 = this.A00;
            r16.A03 = typedArray.getFloat(18, r16.A03);
        }
        return this;
    }

    public AnonymousClass4PG A01() {
        AnonymousClass4PG r3 = this.A00;
        int i2 = r3.A0C;
        int[] iArr = r3.A0K;
        if (i2 != 1) {
            int i3 = r3.A05;
            iArr[0] = i3;
            int i4 = r3.A09;
            iArr[1] = i4;
            iArr[2] = i4;
            iArr[3] = i3;
        } else {
            int i5 = r3.A09;
            iArr[0] = i5;
            iArr[1] = i5;
            int i6 = r3.A05;
            iArr[2] = i6;
            iArr[3] = i6;
        }
        float[] fArr = r3.A0J;
        if (i2 != 1) {
            float f2 = r3.A02;
            float f3 = 1.0f - f2;
            float f4 = r3.A00;
            fArr[0] = Math.max((f3 - f4) / 2.0f, 0.0f);
            fArr[1] = Math.max((f3 - 0.001f) / 2.0f, 0.0f);
            float f5 = f2 + 1.0f;
            fArr[2] = Math.min((f5 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f5 + f4) / 2.0f, 1.0f);
            return r3;
        }
        fArr[0] = 0.0f;
        float f6 = r3.A02;
        fArr[1] = Math.min(f6, 1.0f);
        fArr[2] = Math.min(f6 + r3.A00, 1.0f);
        fArr[3] = 1.0f;
        return r3;
    }

    public void A02(float f2) {
        AnonymousClass4PG r3 = this.A00;
        r3.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, f2)) * 255.0f)) << 24) | (r3.A05 & ViewCompat.MEASURED_SIZE_MASK);
    }

    public void A03(float f2) {
        AnonymousClass4PG r3 = this.A00;
        r3.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, f2)) * 255.0f)) << 24) | (r3.A09 & ViewCompat.MEASURED_SIZE_MASK);
    }
}
