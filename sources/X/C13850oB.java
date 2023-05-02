package X;

/* renamed from: X.0oB  reason: invalid class name and case insensitive filesystem */
public class C13850oB implements C13840oA {
    public static final Object A02 = new Object();
    public volatile C13840oA A00;
    public volatile Object A01 = A02;

    public C13850oB(C13840oA r2) {
        this.A00 = r2;
    }

    public Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }
}
