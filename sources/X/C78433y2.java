package X;

/* renamed from: X.3y2  reason: invalid class name and case insensitive filesystem */
public final class C78433y2 extends AnonymousClass4SV {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C78433y2(String str, String str2, int i2, int i3) {
        C18450wi.A0H(str2, 4);
        this.A01 = i2;
        this.A03 = str;
        this.A00 = i3;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78433y2) {
                C78433y2 r5 = (C78433y2) obj;
                if (this.A01 != r5.A01 || !C18450wi.A0R(this.A03, r5.A03) || this.A00 != r5.A00 || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A01 * 31;
        return AnonymousClass3K4.A08(this.A02, (AnonymousClass3K2.A09(this.A03, i2) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarStickerHeaderIconItem(index=");
        A0r.append(this.A01);
        A0r.append(", pageId=");
        A0r.append(this.A03);
        A0r.append(", icon=");
        A0r.append(this.A00);
        A0r.append(", accessibilityLabel=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
