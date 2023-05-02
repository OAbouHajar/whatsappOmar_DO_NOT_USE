package X;

/* renamed from: X.3y1  reason: invalid class name and case insensitive filesystem */
public final class C78423y1 extends AnonymousClass4SV {
    public final int A00;
    public final String A01;
    public final String A02;

    public C78423y1(int i2, String str, String str2) {
        C18450wi.A0H(str2, 3);
        this.A00 = i2;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78423y1) {
                C78423y1 r5 = (C78423y1) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A02, AnonymousClass3K2.A09(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarStickerHeaderTextItem(index=");
        A0r.append(this.A00);
        A0r.append(", pageId=");
        A0r.append(this.A01);
        A0r.append(", title=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
