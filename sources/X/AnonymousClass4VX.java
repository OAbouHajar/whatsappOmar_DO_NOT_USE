package X;

/* renamed from: X.4VX  reason: invalid class name */
public final class AnonymousClass4VX {
    public final AnonymousClass4VS A00;
    public final AnonymousClass4VS A01;

    public AnonymousClass4VX(AnonymousClass4VS r1, AnonymousClass4VS r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VX) {
                AnonymousClass4VX r5 = (AnonymousClass4VX) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(this.A00) * 31;
        AnonymousClass4VS r0 = this.A01;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LinkedAccountMediaResponse(fbLinkedAccountMedia=");
        A0r.append(this.A00);
        A0r.append(", igLinkedAccountMedia=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
