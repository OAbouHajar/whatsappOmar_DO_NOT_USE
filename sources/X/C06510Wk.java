package X;

import android.graphics.Insets;

/* renamed from: X.0Wk  reason: invalid class name and case insensitive filesystem */
public final class C06510Wk {
    public static final C06510Wk A04 = new C06510Wk(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C06510Wk(int i2, int i3, int i4, int i5) {
        this.A01 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A00 = i5;
    }

    public static C06510Wk A00(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? A04 : new C06510Wk(i2, i3, i4, i5);
    }

    public static C06510Wk A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets A02() {
        return AnonymousClass0LV.A00(this.A01, this.A03, this.A02, this.A00);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C06510Wk.class == obj.getClass()) {
                C06510Wk r5 = (C06510Wk) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Insets{left=");
        A0r.append(this.A01);
        A0r.append(", top=");
        A0r.append(this.A03);
        A0r.append(", right=");
        A0r.append(this.A02);
        A0r.append(", bottom=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
