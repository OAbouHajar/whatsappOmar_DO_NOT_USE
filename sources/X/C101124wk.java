package X;

/* renamed from: X.4wk  reason: invalid class name and case insensitive filesystem */
public class C101124wk implements AnonymousClass5P6, Cloneable {
    public AnonymousClass3HT A00;
    public final C616739v A01;
    public final C16010sH A02;

    public C101124wk(C616739v r1, C16010sH r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public int ACu() {
        return 2;
    }

    public Object clone() {
        C101124wk r1 = (C101124wk) super.clone();
        AnonymousClass3HT r0 = r1.A00;
        if (r0 != null) {
            r1.A00 = (AnonymousClass3HT) r0.clone();
        }
        return r1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C101124wk)) {
            return false;
        }
        C101124wk r4 = (C101124wk) obj;
        return this.A01.equals(r4.A01) && C34901l3.A00(this.A00, r4.A00);
    }

    public int hashCode() {
        int A0E = AnonymousClass000.A0E(this.A01, 6789);
        AnonymousClass3HT r0 = this.A00;
        return A0E + (r0 != null ? r0.hashCode() : 0);
    }
}
