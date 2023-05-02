package X;

/* renamed from: X.4dA  reason: invalid class name and case insensitive filesystem */
public class C89924dA {
    public long A00;
    public long A01;
    public Object A02;
    public boolean A03;

    public C89924dA(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = obj;
        this.A01 = -1;
        this.A00 = currentTimeMillis;
        this.A03 = false;
    }

    public C89924dA(Object obj, long j2, long j3) {
        this.A02 = obj;
        this.A01 = j2;
        this.A00 = j3;
        this.A03 = false;
    }

    public C89924dA(Object obj, long j2, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = obj;
        this.A01 = j2;
        this.A00 = currentTimeMillis;
        this.A03 = z2;
    }
}
