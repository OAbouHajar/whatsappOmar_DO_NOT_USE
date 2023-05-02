package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Ff  reason: invalid class name */
public final class AnonymousClass0Ff extends AnonymousClass07D {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public AnonymousClass0Ff(float f2, float f3, float f4, int i2) {
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A03 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r8, RecyclerView recyclerView) {
        C18450wi.A0H(rect, 0);
        C18450wi.A0H(view, 1);
        C18450wi.A0H(recyclerView, 2);
        int A002 = RecyclerView.A00(view);
        AnonymousClass01X r0 = recyclerView.A0N;
        int A0C = r0 != null ? r0.A0C() : 0;
        if (A002 == 0) {
            int i2 = this.A03;
            int i3 = (int) this.A01;
            if (i2 == 1) {
                rect.top = i3;
            } else {
                rect.left = i3;
            }
        }
        int i4 = A0C - 1;
        if (A002 < i4) {
            int i5 = this.A03;
            int i6 = (int) this.A02;
            if (i5 == 1) {
                rect.bottom = i6;
            } else {
                rect.right = i6;
            }
        }
        if (A002 == i4) {
            int i7 = this.A03;
            int i8 = (int) this.A00;
            if (i7 == 1) {
                rect.bottom = i8;
            } else {
                rect.right = i8;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Ff) {
                AnonymousClass0Ff r5 = (AnonymousClass0Ff) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(AnonymousClass000.A08(Float.floatToIntBits(this.A01) * 31, this.A02), this.A00) + this.A03;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ItemDecoration(spacingBefore=");
        A0r.append(this.A01);
        A0r.append(", spacingBetween=");
        A0r.append(this.A02);
        A0r.append(", spacingAfter=");
        A0r.append(this.A00);
        A0r.append(", orientation=");
        A0r.append(this.A03);
        return AnonymousClass000.A0j(A0r);
    }
}
