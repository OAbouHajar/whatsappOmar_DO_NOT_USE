package X;

import java.util.List;

/* renamed from: X.4WG  reason: invalid class name */
public final class AnonymousClass4WG {
    public final long A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public AnonymousClass4WG(String str, String str2, List list, long j2) {
        C18450wi.A0H(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j2;
        this.A03 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WG) {
                AnonymousClass4WG r8 = (AnonymousClass4WG) obj;
                if (!C18450wi.A0R(this.A02, r8.A02) || !C18450wi.A0R(this.A01, r8.A01) || this.A00 != r8.A00 || !C18450wi.A0R(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A03, (((AnonymousClass3K4.A07(this.A02) + AnonymousClass000.A0G(this.A01)) * 31) + AnonymousClass3K2.A04(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Post(id=");
        A0r.append(this.A02);
        A0r.append(", caption=");
        A0r.append(this.A01);
        A0r.append(", creationTime=");
        A0r.append(this.A00);
        A0r.append(", images=");
        return AnonymousClass3K2.A0k(this.A03, A0r);
    }
}
