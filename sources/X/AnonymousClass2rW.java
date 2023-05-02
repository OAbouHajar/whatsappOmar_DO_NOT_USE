package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2rW  reason: invalid class name */
public class AnonymousClass2rW extends AnonymousClass071 {
    public int A00 = -1;
    public boolean A01;
    public final C02840Fl A02;
    public final C14990q7 A03;
    public final C31201dg A04;

    public AnonymousClass2rW(C02840Fl r2, C14990q7 r3, C31201dg r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public static void A00(C14990q7 r5, C31201dg r6, int i2, boolean z2) {
        C14940q2 r1;
        C14930q1 A0H = r6.A0H(97);
        if (A0H != null) {
            r1 = new C14940q2();
            r1.A02(Integer.valueOf(i2), 0);
            r1.A02(Boolean.valueOf(z2), 1);
            r1.A02(r5, 2);
        } else {
            A0H = r6.A0H(51);
            if (A0H != null) {
                r1 = new C14940q2();
                r1.A02(Integer.valueOf(i2), 0);
                r1.A02(r5, 1);
            } else {
                return;
            }
        }
        C14940q2.A00(r5, r6, r1, A0H);
    }

    public void A01(RecyclerView recyclerView, int i2) {
        AnonymousClass02W layoutManager;
        View A042;
        boolean z2 = true;
        if (i2 != 1) {
            if (i2 == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (A042 = this.A02.A04(layoutManager)) != null) {
                int A002 = RecyclerView.A00(A042);
                if (A002 != this.A00 || this.A01) {
                    A00(this.A03, this.A04, A002, this.A01);
                    this.A00 = A002;
                    z2 = false;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass2rW r5 = (AnonymousClass2rW) obj;
            return this.A02 == r5.A02 && this.A04.A00 == r5.A04.A00;
        }
        return false;
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + this.A04.A00;
    }
}
