package X;

import android.graphics.Bitmap;

/* renamed from: X.3hl  reason: invalid class name and case insensitive filesystem */
public final class C70803hl extends C70823hn {
    public final int A00;
    public final Bitmap A01;
    public final String A02;
    public final boolean A03;

    public C70803hl(Bitmap bitmap, String str, int i2, boolean z2) {
        this.A01 = bitmap;
        this.A02 = str;
        this.A03 = z2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70803hl) {
                C70803hl r5 = (C70803hl) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02) || this.A03 != r5.A03 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0H = (AnonymousClass3K3.A0H(this.A01) + AnonymousClass000.A0G(this.A02)) * 31;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K2.A06(Integer.valueOf(this.A00), (A0H + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Data(bitmap=");
        A0r.append(this.A01);
        A0r.append(", emojis=");
        A0r.append(this.A02);
        A0r.append(", isSelected=");
        A0r.append(this.A03);
        A0r.append(", ringColor=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
