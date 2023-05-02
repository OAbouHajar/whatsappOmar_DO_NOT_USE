package X;

/* renamed from: X.0cl  reason: invalid class name and case insensitive filesystem */
public final class C07950cl implements C13510mV {
    public final AnonymousClass0RQ A00;
    public final AnonymousClass0UP A01;
    public final AnonymousClass0UQ A02;

    public C07950cl(AnonymousClass0RQ r4, AnonymousClass0UP r5, AnonymousClass0UQ r6) {
        String str;
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r5, 3);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        int i2 = r4.A02;
        int i3 = r4.A01;
        if (i2 - i3 == 0 && r4.A00 - r4.A03 == 0) {
            str = "Bounds must be non zero";
        } else if (i3 != 0 && r4.A03 != 0) {
            str = "Bounding rectangle must start at the top or left window edge for folding features";
        } else {
            return;
        }
        throw AnonymousClass000.A0T(str);
    }

    public boolean AJg() {
        AnonymousClass0UQ r1 = this.A02;
        return C18450wi.A0R(r1, AnonymousClass0UQ.A02) || (C18450wi.A0R(r1, AnonymousClass0UQ.A01) && C18450wi.A0R(this.A01, AnonymousClass0UP.A02));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C07950cl.class.equals(obj == null ? null : obj.getClass())) {
                if (obj != null) {
                    C07950cl r5 = (C07950cl) obj;
                    if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                        return false;
                    }
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A02, this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append("HardwareFoldingFeature");
        A0o.append(" { ");
        A0o.append(this.A00);
        A0o.append(", type=");
        A0o.append(this.A02);
        A0o.append(", state=");
        A0o.append(this.A01);
        return AnonymousClass000.A0h(" }", A0o);
    }
}
