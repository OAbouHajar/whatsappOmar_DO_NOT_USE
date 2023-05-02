package X;

import java.util.ArrayList;

/* renamed from: X.4cS  reason: invalid class name and case insensitive filesystem */
public class C89564cS {
    public static double A00(long j2, long j3, boolean z2) {
        if (z2) {
            j2++;
        }
        double exp = Math.exp((((((double) j2) * 1.0d) / ((double) j3)) - 0.5d) * 4.0d * 3.141592653589793d);
        return -((Math.asin((exp - 1.0d) / (exp + 1.0d)) * 180.0d) / 3.141592653589793d);
    }

    public static ArrayList A01(double d2, double d3, int i2) {
        if (i2 <= 0 || d2 < -85.05112878d || d2 > 85.05112878d || d3 < -180.0d || d3 > 180.0d) {
            return null;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        long j2 = (long) (2 << (i2 - 1));
        double d4 = (double) j2;
        C13700nu.A0d(A0u, (long) Math.min(Math.max(((d3 + 180.0d) / 360.0d) * d4, 0.0d), (double) (j2 - 1)));
        double sin = Math.sin((Math.min(Math.max(d2, -85.05112878d), 85.05112878d) * 3.141592653589793d) / 180.0d);
        C13700nu.A0d(A0u, (long) Math.min(Math.max((0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d)) * d4, 0.0d), d4 - 1.0d));
        return A0u;
    }

    public static ArrayList A02(int i2, long j2, long j3) {
        long j4 = (long) (2 << (i2 - 1));
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(Double.valueOf((A00(j3, j4, true) + A00(j3, j4, false)) / 2.0d));
        A0u.add(Double.valueOf(((360.0d / ((double) j4)) * (((double) j2) + 0.5d)) - 180.0d));
        return A0u;
    }
}
