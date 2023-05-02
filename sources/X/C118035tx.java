package X;

/* renamed from: X.5tx  reason: invalid class name and case insensitive filesystem */
public class C118035tx {
    public final long A00;
    public final long A01;

    public C118035tx(long j2, long j3) {
        if (j3 == 0) {
            this.A00 = 1;
            return;
        }
        this.A01 = j2;
        this.A00 = j3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        A0o.append("/");
        A0o.append(this.A00);
        return A0o.toString();
    }
}
