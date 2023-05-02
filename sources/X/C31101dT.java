package X;

/* renamed from: X.1dT  reason: invalid class name and case insensitive filesystem */
public class C31101dT implements Comparable {
    public final long A00;
    public final String A01;
    public final String A02;

    public C31101dT(String str, String str2, long j2) {
        this.A00 = j2;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C31101dT r6 = (C31101dT) obj;
        long j2 = this.A00;
        long j3 = r6.A00;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        return this.A02.compareTo(r6.A02);
    }
}
