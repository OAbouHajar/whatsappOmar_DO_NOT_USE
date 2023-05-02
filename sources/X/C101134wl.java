package X;

/* renamed from: X.4wl  reason: invalid class name and case insensitive filesystem */
public class C101134wl implements AnonymousClass5P6, Cloneable {
    public C1042754r A00;
    public final C616739v A01;
    public final C16010sH A02;

    public C101134wl(C616739v r1, C16010sH r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public int ACu() {
        return 3;
    }

    public Object clone() {
        C101134wl r1 = (C101134wl) super.clone();
        C1042754r r0 = r1.A00;
        if (r0 != null) {
            r1.A00 = (C1042754r) r0.clone();
        }
        return r1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C101134wl)) {
            return false;
        }
        C101134wl r4 = (C101134wl) obj;
        return C34901l3.A00(this.A01, r4.A01) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A00, r4.A00);
    }

    public int hashCode() {
        return ((AnonymousClass000.A0E(this.A01, 6820) + AnonymousClass000.A0C(this.A02)) * 31) + AnonymousClass000.A0C(this.A00);
    }
}
