package X;

/* renamed from: X.4bj  reason: invalid class name and case insensitive filesystem */
public final class C89184bj {
    public final AnonymousClass4W5 A00;
    public final C93684jb A01;
    public final boolean A02;

    public C89184bj() {
        this((AnonymousClass4W5) null, (C93684jb) null, false);
    }

    public C89184bj(AnonymousClass4W5 r1, C93684jb r2, boolean z2) {
        this.A02 = z2;
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89184bj) {
                C89184bj r5 = (C89184bj) obj;
                if (this.A02 != r5.A02 || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        int i2 = 0;
        int A0C = (((z2 ? 1 : 0) * true) + AnonymousClass000.A0C(this.A00)) * 31;
        C93684jb r0 = this.A01;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ViewState(isLoading=");
        A0r.append(this.A02);
        A0r.append(", errorMessage=");
        A0r.append(this.A00);
        A0r.append(", methodDetailsState=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
