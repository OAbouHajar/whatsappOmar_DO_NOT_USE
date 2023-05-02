package X;

/* renamed from: X.4mr  reason: invalid class name and case insensitive filesystem */
public class C95574mr implements C13180lb {
    public final int A00;
    public final C13180lb A01;

    public C95574mr(C13180lb r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C95574mr)) {
                return false;
            }
            C95574mr r4 = (C95574mr) obj;
            if (this.A00 != r4.A00 || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public String toString() {
        AnonymousClass0QP r2 = new AnonymousClass0QP(AnonymousClass000.A0c(this));
        r2.A00(this.A01, "imageCacheKey");
        r2.A00(String.valueOf(this.A00), "frameIndex");
        return r2.toString();
    }
}
