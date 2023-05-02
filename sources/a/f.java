package a;

/* compiled from: XFMFile */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final long f171a;

    /* renamed from: b  reason: collision with root package name */
    public final long f172b;

    public f(double d2) {
        this((long) (d2 * 10000.0d), 10000);
    }

    public f(long j2, long j3) {
        if (j3 == 0) {
            this.f171a = 0;
            this.f172b = 1;
            return;
        }
        this.f171a = j2;
        this.f172b = j3;
    }

    public final String toString() {
        return this.f171a + "/" + this.f172b;
    }
}
