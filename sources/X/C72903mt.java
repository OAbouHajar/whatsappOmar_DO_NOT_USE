package X;

/* renamed from: X.3mt  reason: invalid class name and case insensitive filesystem */
public final class C72903mt extends AnonymousClass469 {
    public final AnonymousClass5B7 A00;
    public final boolean A01;

    public C72903mt() {
        this((AnonymousClass5B7) null, 7, false);
    }

    public /* synthetic */ C72903mt(AnonymousClass5B7 r2, int i2, boolean z2) {
        r2 = (i2 & 1) != 0 ? null : r2;
        z2 = (i2 & 2) != 0 ? false : z2;
        this.A00 = r2;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72903mt) {
                C72903mt r5 = (C72903mt) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0C = AnonymousClass000.A0C(this.A00) * 31;
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        return (A0C + (z2 ? 1 : 0)) * 31;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Disabled(error=");
        A0r.append(this.A00);
        A0r.append(", shouldClearLoadingState=");
        A0r.append(this.A01);
        A0r.append(", shouldDisableAREffect=");
        A0r.append(false);
        return AnonymousClass000.A0j(A0r);
    }
}
