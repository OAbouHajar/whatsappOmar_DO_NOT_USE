package X;

import java.util.HashSet;

/* renamed from: X.4bp  reason: invalid class name and case insensitive filesystem */
public final class C89244bp {
    public String A00 = null;
    public boolean A01 = false;
    public boolean A02 = false;
    public final HashSet A03;

    public C89244bp() {
        HashSet A0o = C13680ns.A0o();
        this.A03 = A0o;
    }

    public /* synthetic */ C89244bp(String str, HashSet hashSet, C54392hN r6, int i2, boolean z2, boolean z3) {
        HashSet A0o = C13680ns.A0o();
        this.A03 = A0o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89244bp) {
                C89244bp r5 = (C89244bp) obj;
                if (this.A01 != r5.A01 || this.A02 != r5.A02 || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A01;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (z2 ? 1 : 0) * true;
        if (!this.A02) {
            i2 = 0;
        }
        return AnonymousClass3K2.A06(this.A03, (((i3 + i2) * 31) + AnonymousClass000.A0G(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CtwaUserJourneyLogger(hasAdContext=");
        A0r.append(this.A01);
        A0r.append(", icebreakersShown=");
        A0r.append(this.A02);
        A0r.append(", adId=");
        A0r.append(this.A00);
        A0r.append(", performedAction=");
        return AnonymousClass3K2.A0k(this.A03, A0r);
    }
}
