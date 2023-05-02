package X;

/* renamed from: X.1c3  reason: invalid class name and case insensitive filesystem */
public final class C30271c3 extends C30281c4 {
    public C30271c3(C30281c4 r1) {
        super(r1);
    }

    public C30271c3(Object obj) {
        super(obj, -1, -1, -1, -1);
    }

    public C30271c3(Object obj, int i2, int i3, long j2) {
        super(obj, i2, i3, -1, j2);
    }

    public C30271c3(Object obj, long j2, int i2) {
        super(obj, -1, -1, i2, j2);
    }

    public C30271c3 A01(Object obj) {
        C30281c4 r1;
        Object obj2 = obj;
        if (this.A04.equals(obj)) {
            r1 = this;
        } else {
            r1 = new C30281c4(obj2, this.A00, this.A01, this.A02, this.A03);
        }
        return new C30271c3(r1);
    }
}
