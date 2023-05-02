package X;

import java.util.List;

/* renamed from: X.3lS  reason: invalid class name and case insensitive filesystem */
public class C72033lS extends C31301dt {
    public final C29101a2 A00;
    public final List A01;

    public C72033lS(C29101a2 r2, List list) {
        super(AnonymousClass428.A0B);
        this.A01 = list;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C72033lS) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
