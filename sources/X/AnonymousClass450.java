package X;

import java.util.Arrays;

/* renamed from: X.450  reason: invalid class name */
public final class AnonymousClass450 {
    public static AnonymousClass4G8 A00(C90504eH r12) {
        r12.A0T(1);
        int A0D = r12.A0D();
        long j2 = ((long) r12.A01) + ((long) A0D);
        int i2 = A0D / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long A0H = r12.A0H();
            if (A0H == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = A0H;
            jArr2[i3] = r12.A0H();
            r12.A0T(2);
            i3++;
        }
        r12.A0T((int) (j2 - ((long) r12.A01)));
        return new AnonymousClass4G8(jArr, jArr2);
    }
}
