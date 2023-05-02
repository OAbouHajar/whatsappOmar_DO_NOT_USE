package X;

/* renamed from: X.3uX  reason: invalid class name and case insensitive filesystem */
public final class C76693uX extends C811146x {
    public final int A00;
    public final String A01;

    public C76693uX(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76693uX) {
                C76693uX r5 = (C76693uX) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WatchMoreVideosInfo(icon=");
        A0r.append(this.A00);
        A0r.append(", url=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
