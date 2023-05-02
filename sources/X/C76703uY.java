package X;

/* renamed from: X.3uY  reason: invalid class name and case insensitive filesystem */
public final class C76703uY extends C811146x {
    public final int A00;
    public final int A01;
    public final String A02;

    public C76703uY(int i2, String str, int i3) {
        C18450wi.A0H(str, 1);
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76703uY) {
                C76703uY r5 = (C76703uY) obj;
                if (!(C18450wi.A0R(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3K4.A07(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("InlineVideoInfo(videoUrl=");
        A0r.append(this.A02);
        A0r.append(", videoWidth=");
        A0r.append(this.A01);
        A0r.append(", videoHeight=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
