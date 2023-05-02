package X;

import android.view.View;

/* renamed from: X.0Ro  reason: invalid class name and case insensitive filesystem */
public class C05470Ro {
    public int A00;
    public int A01;
    public AnonymousClass0VA A02;
    public boolean A03;
    public boolean A04;

    public C05470Ro() {
        A00();
    }

    public void A00() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A03 = false;
        this.A04 = false;
    }

    public void A01(View view, int i2) {
        int A0B;
        boolean z2 = this.A03;
        AnonymousClass0VA r0 = this.A02;
        if (z2) {
            int A08 = r0.A08(view);
            AnonymousClass0VA r2 = this.A02;
            A0B = A08 + (Integer.MIN_VALUE == r2.A00 ? 0 : r2.A07() - r2.A00);
        } else {
            A0B = r0.A0B(view);
        }
        this.A00 = A0B;
        this.A01 = i2;
    }

    public void A02(View view, int i2) {
        int A07;
        int min;
        AnonymousClass0VA r2 = this.A02;
        if (Integer.MIN_VALUE == r2.A00 || (A07 = r2.A07() - r2.A00) >= 0) {
            A01(view, i2);
            return;
        }
        this.A01 = i2;
        boolean z2 = this.A03;
        AnonymousClass0VA r0 = this.A02;
        if (z2) {
            int A022 = (r0.A02() - A07) - this.A02.A08(view);
            this.A00 = this.A02.A02() - A022;
            if (A022 > 0) {
                int A09 = this.A00 - this.A02.A09(view);
                int A06 = this.A02.A06();
                int min2 = A09 - (A06 + Math.min(this.A02.A0B(view) - A06, 0));
                if (min2 < 0) {
                    min = this.A00 + Math.min(A022, -min2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int A0B = r0.A0B(view);
            int A062 = A0B - this.A02.A06();
            this.A00 = A0B;
            if (A062 > 0) {
                int A023 = (this.A02.A02() - Math.min(0, (this.A02.A02() - A07) - this.A02.A08(view))) - (A0B + this.A02.A09(view));
                if (A023 < 0) {
                    min = this.A00 - Math.min(A062, -A023);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A00 = min;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AnchorInfo{mPosition=");
        A0r.append(this.A01);
        A0r.append(", mCoordinate=");
        A0r.append(this.A00);
        A0r.append(", mLayoutFromEnd=");
        A0r.append(this.A03);
        A0r.append(", mValid=");
        A0r.append(this.A04);
        return AnonymousClass000.A0k(A0r);
    }
}
