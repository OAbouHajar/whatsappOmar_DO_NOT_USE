package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.0S5  reason: invalid class name */
public final class AnonymousClass0S5 {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public AnonymousClass0S5(int i2, int i3) {
        this.A07 = Color.red(i2);
        this.A05 = Color.green(i2);
        this.A04 = Color.blue(i2);
        this.A08 = i2;
        this.A06 = i3;
    }

    public final void A00() {
        int A062;
        if (!this.A02) {
            int i2 = this.A08;
            int A042 = AnonymousClass090.A04(4.5f, -1, i2);
            int A043 = AnonymousClass090.A04(3.0f, -1, i2);
            if (A042 == -1 || A043 == -1) {
                int A044 = AnonymousClass090.A04(4.5f, -16777216, i2);
                int A045 = AnonymousClass090.A04(3.0f, -16777216, i2);
                if (A044 == -1 || A045 == -1) {
                    this.A00 = A042 != -1 ? AnonymousClass090.A06(-1, A042) : AnonymousClass090.A06(-16777216, A044);
                    A062 = A043 != -1 ? AnonymousClass090.A06(-1, A043) : AnonymousClass090.A06(-16777216, A045);
                } else {
                    this.A00 = AnonymousClass090.A06(-16777216, A044);
                    A062 = AnonymousClass090.A06(-16777216, A045);
                }
            } else {
                this.A00 = AnonymousClass090.A06(-1, A042);
                A062 = AnonymousClass090.A06(-1, A043);
            }
            this.A01 = A062;
            this.A02 = true;
        }
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        AnonymousClass090.A07(this.A07, this.A05, fArr, this.A04);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0S5.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0S5 r5 = (AnonymousClass0S5) obj;
            if (!(this.A06 == r5.A06 && this.A08 == r5.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A08 * 31) + this.A06;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Swatch");
        A0r.append(" [RGB: #");
        AnonymousClass000.A1J(A0r, this.A08);
        A0r.append(']');
        A0r.append(" [HSL: ");
        A0r.append(Arrays.toString(A01()));
        A0r.append(']');
        A0r.append(" [Population: ");
        A0r.append(this.A06);
        A0r.append(']');
        A0r.append(" [Title Text: #");
        A00();
        AnonymousClass000.A1J(A0r, this.A01);
        A0r.append(']');
        A0r.append(" [Body Text: #");
        A00();
        return AnonymousClass000.A0i(Integer.toHexString(this.A00), A0r, ']');
    }
}
