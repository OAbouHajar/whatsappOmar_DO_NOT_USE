package X;

/* renamed from: X.0Tw  reason: invalid class name and case insensitive filesystem */
public class C06010Tw {
    public int A00;
    public long A01;

    public C06010Tw(long j2, int i2) {
        this.A01 = j2;
        this.A00 = i2;
    }

    public static C06010Tw A00(String str, int i2, int i3) {
        if (i2 < i3) {
            long j2 = 0;
            int i4 = i2;
            while (true) {
                if (i4 < i3) {
                    char charAt = str.charAt(i4);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    j2 = (j2 * 10) + ((long) (charAt - '0'));
                    if (j2 > 2147483647L) {
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (i4 != i2) {
                return new C06010Tw(j2, i4);
            }
        }
        return null;
    }
}
