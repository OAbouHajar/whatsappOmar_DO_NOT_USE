package X;

import java.nio.FloatBuffer;

/* renamed from: X.0UZ  reason: invalid class name */
public class AnonymousClass0UZ {
    public static final FloatBuffer A04;
    public static final FloatBuffer A05;
    public static final FloatBuffer A06;
    public static final FloatBuffer A07;
    public static final FloatBuffer A08;
    public static final FloatBuffer A09;
    public static final float[] A0A;
    public static final float[] A0B;
    public static final float[] A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public int A00 = (A0A.length / 2);
    public AnonymousClass0JO A01;
    public FloatBuffer A02 = A05;
    public FloatBuffer A03 = A04;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0E = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0F = fArr2;
        A08 = AnonymousClass0X0.A02(fArr);
        A09 = AnonymousClass0X0.A02(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0C = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        A0D = fArr4;
        A06 = AnonymousClass0X0.A02(fArr3);
        A07 = AnonymousClass0X0.A02(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0A = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0B = fArr6;
        A04 = AnonymousClass0X0.A02(fArr5);
        A05 = AnonymousClass0X0.A02(fArr6);
    }

    public AnonymousClass0UZ(AnonymousClass0JO r3) {
        this.A01 = r3;
    }

    public String toString() {
        AnonymousClass0JO r2 = this.A01;
        StringBuilder A0r = AnonymousClass000.A0r("[Drawable2d: ");
        A0r.append(r2);
        return AnonymousClass000.A0h("]", A0r);
    }
}
