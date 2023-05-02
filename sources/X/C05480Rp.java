package X;

import android.graphics.Rect;

/* renamed from: X.0Rp  reason: invalid class name and case insensitive filesystem */
public final class C05480Rp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C05480Rp(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A04 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A02 = i6;
        this.A03 = i7;
    }

    public final Rect A00(boolean z2) {
        int i2;
        int i3;
        int i4;
        if (z2) {
            i2 = this.A01;
            if (i2 == 0) {
                i2 = this.A02;
            }
            i3 = this.A05;
            i4 = this.A04;
        } else {
            int i5 = this.A04;
            if (i5 == 0) {
                i5 = this.A02;
            }
            i3 = this.A05;
            i4 = this.A01;
        }
        if (i4 == 0) {
            i4 = this.A03;
        }
        return new Rect(i2, i3, i4, this.A00);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05480Rp) {
                C05480Rp r5 = (C05480Rp) obj;
                if (!(this.A04 == r5.A04 && this.A05 == r5.A05 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.A04 * 31) + this.A05) * 31) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31) + this.A03;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Insets(start=");
        A0r.append(this.A04);
        A0r.append(", top=");
        A0r.append(this.A05);
        A0r.append(", end=");
        A0r.append(this.A01);
        A0r.append(", bottom=");
        A0r.append(this.A00);
        A0r.append(", left=");
        A0r.append(this.A02);
        A0r.append(", right=");
        A0r.append(this.A03);
        return AnonymousClass000.A0j(A0r);
    }
}
