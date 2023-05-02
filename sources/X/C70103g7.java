package X;

/* renamed from: X.3g7  reason: invalid class name and case insensitive filesystem */
public class C70103g7 extends C89494cI {
    public final Class A00;

    public C70103g7(Class cls) {
        this.A00 = cls;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C70103g7)) {
                return false;
            }
            Class cls = this.A00;
            Class cls2 = ((C70103g7) obj).A00;
            if (cls == null) {
                return cls2 == null;
            }
            if (!cls.equals(cls2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.getName();
    }
}
