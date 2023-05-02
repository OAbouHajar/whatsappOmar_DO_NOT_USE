package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.07h  reason: invalid class name and case insensitive filesystem */
public class C015207h {
    public char A00;
    public float[] A01;

    public C015207h(C015207h r5) {
        this.A00 = r5.A00;
        float[] fArr = r5.A01;
        int length = fArr.length;
        int min = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        this.A01 = fArr2;
    }

    public C015207h(float[] fArr, char c2) {
        this.A00 = c2;
        this.A01 = fArr;
    }

    public static void A00(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        double d3;
        float f9 = f8;
        double radians = Math.toRadians((double) f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        float f10 = f2;
        double d4 = (double) f10;
        double d5 = d4;
        float f11 = f3;
        double d6 = (double) f11;
        double d7 = (double) f6;
        double d8 = d7;
        double d9 = ((d4 * cos) + (d6 * sin)) / d7;
        double d10 = (double) f7;
        double d11 = ((((double) (-f10)) * sin) + (d6 * cos)) / d10;
        float f12 = f4;
        float f13 = f5;
        double d12 = (double) f13;
        double d13 = ((((double) f12) * cos) + (d12 * sin)) / d8;
        double d14 = ((((double) (-f12)) * sin) + (d12 * cos)) / d10;
        double d15 = d9 - d13;
        double d16 = d11 - d14;
        double d17 = (d9 + d13) / 2.0d;
        double d18 = (d11 + d14) / 2.0d;
        double d19 = (d15 * d15) + (d16 * d16);
        if (d19 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        boolean z4 = z2;
        boolean z5 = z3;
        if (d20 < 0.0d) {
            StringBuilder sb = new StringBuilder("Points are too far apart ");
            sb.append(d19);
            Log.w("PathParser", sb.toString());
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            A00(path, f10, f11, f12, f13, f6 * sqrt, f7 * sqrt, f9, z4, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z4 == z5) {
            d2 = d17 - d22;
            d3 = d18 + d21;
        } else {
            d2 = d17 + d22;
            d3 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d3, d9 - d2);
        double atan22 = Math.atan2(d14 - d3, d13 - d2) - atan2;
        boolean z6 = false;
        if (atan22 >= 0.0d) {
            z6 = true;
        }
        if (z5 != z6) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d2 * d8;
        double d24 = d3 * d10;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d23 * sin) + (d24 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(atan2);
        double sin2 = Math.sin(atan2);
        double d27 = -d8;
        double d28 = d27 * cos;
        double d29 = d10 * sin;
        double d30 = (d28 * sin2) - (d29 * cos2);
        double d31 = d27 * sin;
        double d32 = d10 * cos;
        double d33 = (sin2 * d31) + (cos2 * d32);
        double d34 = atan22 / ((double) ceil);
        int i2 = 0;
        while (i2 < ceil) {
            double d35 = atan2 + d34;
            double sin3 = Math.sin(d35);
            double cos3 = Math.cos(d35);
            double d36 = (d25 + ((d8 * cos) * cos3)) - (d29 * sin3);
            double d37 = d26 + (d8 * sin * cos3) + (d32 * sin3);
            double d38 = (d28 * sin3) - (d29 * cos3);
            double d39 = (sin3 * d31) + (cos3 * d32);
            double d40 = d35 - atan2;
            double tan = Math.tan(d40 / 2.0d);
            double sin4 = (Math.sin(d40) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d5 + (d30 * sin4)), (float) (d6 + (d33 * sin4)), (float) (d36 - (sin4 * d38)), (float) (d37 - (sin4 * d39)), (float) d36, (float) d37);
            i2++;
            d5 = d36;
            atan2 = d35;
            d33 = d39;
            d30 = d38;
            d6 = d37;
        }
    }

    public static void A01(Path path, C015207h[] r34) {
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        int i4;
        float f7;
        int i5;
        int i6;
        float f8;
        float f9;
        float f10;
        int i7;
        int i8;
        float f11;
        float f12;
        float f13;
        float f14;
        float[] fArr = new float[6];
        char c2 = 'm';
        for (int i9 = 0; i9 < r34.length; i9++) {
            C015207h r0 = r34[i9];
            char c3 = r0.A00;
            float[] fArr2 = r0.A01;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            Path path2 = path;
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case AnonymousClass2EA.A02 /*72*/:
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    f15 = f19;
                    float f21 = f20;
                    path2.moveTo(f15, f21);
                    f17 = f15;
                    f16 = f21;
                    f18 = f21;
                    break;
            }
            i2 = 2;
            int i10 = 0;
            while (i10 < fArr2.length) {
                if (c3 == 'A') {
                    int i11 = i10 + 5;
                    float f22 = fArr2[i11];
                    int i12 = i10 + 6;
                    float f23 = fArr2[i12];
                    float f24 = fArr2[i10];
                    float f25 = fArr2[i10 + 1];
                    float f26 = fArr2[i10 + 2];
                    boolean z2 = false;
                    if (fArr2[i10 + 3] != 0.0f) {
                        z2 = true;
                    }
                    boolean z3 = false;
                    if (fArr2[i10 + 4] != 0.0f) {
                        z3 = true;
                    }
                    A00(path2, f5, f4, f22, f23, f24, f25, f26, z2, z3);
                    f6 = fArr2[i11];
                    f4 = fArr2[i12];
                    f3 = f4;
                    f2 = f5;
                } else if (c3 == 'C') {
                    int i13 = i10 + 2;
                    int i14 = i10 + 3;
                    int i15 = i10 + 4;
                    int i16 = i10 + 5;
                    path2.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                    f5 = fArr2[i15];
                    f4 = fArr2[i16];
                    f2 = fArr2[i13];
                    f3 = fArr2[i14];
                } else if (c3 != 'H') {
                    if (c3 == 'Q') {
                        int i17 = i10 + 1;
                        i4 = i10 + 2;
                        i3 = i10 + 3;
                        path2.quadTo(fArr2[i10], fArr2[i17], fArr2[i4], fArr2[i3]);
                        f7 = fArr2[i10];
                        f3 = fArr2[i17];
                    } else if (c3 == 'V') {
                        path2.lineTo(f5, fArr2[i10]);
                        f4 = fArr2[i10];
                    } else if (c3 != 'a') {
                        if (c3 == 'c') {
                            int i18 = i10 + 2;
                            i7 = i10 + 3;
                            i6 = i10 + 4;
                            i5 = i10 + 5;
                            path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i18], fArr2[i7], fArr2[i6], fArr2[i5]);
                            f10 = fArr2[i18];
                            f2 = f10 + f5;
                            f8 = fArr2[i7];
                            f3 = f8 + f4;
                            f5 += fArr2[i6];
                            f9 = fArr2[i5];
                        } else if (c3 == 'h') {
                            path2.rLineTo(fArr2[i10], 0.0f);
                            f5 += fArr2[i10];
                        } else if (c3 == 'q') {
                            int i19 = i10 + 1;
                            i6 = i10 + 2;
                            i5 = i10 + 3;
                            path2.rQuadTo(fArr2[i10], fArr2[i19], fArr2[i6], fArr2[i5]);
                            f2 = fArr2[i10] + f5;
                            f8 = fArr2[i19];
                            f3 = f8 + f4;
                            f5 += fArr2[i6];
                            f9 = fArr2[i5];
                        } else if (c3 == 'v') {
                            path2.rLineTo(0.0f, fArr2[i10]);
                            f9 = fArr2[i10];
                        } else if (c3 != 'L') {
                            if (c3 == 'M') {
                                f5 = fArr2[i10];
                                f4 = fArr2[i10 + 1];
                                if (i10 > 0) {
                                    path2.lineTo(f5, f4);
                                } else {
                                    path2.moveTo(f5, f4);
                                }
                            } else if (c3 == 'S') {
                                if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                    f5 = (f5 * 2.0f) - f2;
                                    f4 = (f4 * 2.0f) - f3;
                                }
                                int i20 = i10 + 1;
                                i4 = i10 + 2;
                                i3 = i10 + 3;
                                path2.cubicTo(f5, f4, fArr2[i10], fArr2[i20], fArr2[i4], fArr2[i3]);
                                f7 = fArr2[i10];
                                f3 = fArr2[i20];
                            } else if (c3 != 'T') {
                                if (c3 == 'l') {
                                    i8 = i10 + 1;
                                    path2.rLineTo(fArr2[i10], fArr2[i8]);
                                } else if (c3 == 'm') {
                                    float f27 = fArr2[i10];
                                    f5 += f27;
                                    float f28 = fArr2[i10 + 1];
                                    f4 += f28;
                                    if (i10 > 0) {
                                        path2.rLineTo(f27, f28);
                                    } else {
                                        path2.rMoveTo(f27, f28);
                                    }
                                } else if (c3 == 's') {
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f5 - f2;
                                        f12 = f4 - f3;
                                    } else {
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    i7 = i10 + 1;
                                    i6 = i10 + 2;
                                    i5 = i10 + 3;
                                    path2.rCubicTo(f11, f12, fArr2[i10], fArr2[i7], fArr2[i6], fArr2[i5]);
                                    f10 = fArr2[i10];
                                    f2 = f10 + f5;
                                    f8 = fArr2[i7];
                                    f3 = f8 + f4;
                                    f5 += fArr2[i6];
                                    f9 = fArr2[i5];
                                } else if (c3 == 't') {
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f13 = f5 - f2;
                                        f14 = f4 - f3;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    i8 = i10 + 1;
                                    path2.rQuadTo(f13, f14, fArr2[i10], fArr2[i8]);
                                    f2 = f13 + f5;
                                    f3 = f14 + f4;
                                }
                                f5 += fArr2[i10];
                                f9 = fArr2[i8];
                            } else {
                                if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                    f5 = (f5 * 2.0f) - f2;
                                    f4 = (f4 * 2.0f) - f3;
                                }
                                int i21 = i10 + 1;
                                path2.quadTo(f5, f4, fArr2[i10], fArr2[i21]);
                                float f29 = fArr2[i10];
                                float f30 = fArr2[i21];
                                f3 = f4;
                                f2 = f5;
                                f5 = f29;
                                f4 = f30;
                            }
                            f20 = f4;
                            f19 = f5;
                        } else {
                            i3 = i10 + 1;
                            path2.lineTo(fArr2[i10], fArr2[i3]);
                            f5 = fArr2[i10];
                            f4 = fArr2[i3];
                        }
                        f4 += f9;
                    } else {
                        int i22 = i10 + 5;
                        float f31 = fArr2[i22] + f5;
                        int i23 = i10 + 6;
                        float f32 = fArr2[i23] + f4;
                        float f33 = fArr2[i10];
                        float f34 = fArr2[i10 + 1];
                        float f35 = fArr2[i10 + 2];
                        boolean z4 = false;
                        if (fArr2[i10 + 3] != 0.0f) {
                            z4 = true;
                        }
                        boolean z5 = false;
                        if (fArr2[i10 + 4] != 0.0f) {
                            z5 = true;
                        }
                        A00(path2, f5, f4, f31, f32, f33, f34, f35, z4, z5);
                        f6 = f5 + fArr2[i22];
                        f4 += fArr2[i23];
                        f3 = f4;
                        f2 = f5;
                    }
                    f5 = fArr2[i4];
                    f4 = fArr2[i3];
                } else {
                    path2.lineTo(fArr2[i10], f4);
                    f5 = fArr2[i10];
                }
                i10 += i2;
                c2 = c3;
            }
            fArr[0] = f5;
            fArr[1] = f4;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f19;
            fArr[5] = f20;
            c2 = r34[i9].A00;
        }
    }
}
