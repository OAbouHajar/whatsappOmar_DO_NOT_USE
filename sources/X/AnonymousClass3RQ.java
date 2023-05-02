package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RQ  reason: invalid class name */
public class AnonymousClass3RQ extends AnonymousClass071 {
    public final C14990q7 A00;
    public final C31201dg A01;
    public final C14930q1 A02;

    public AnonymousClass3RQ(C14990q7 r1, C31201dg r2, C14930q1 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        C31201dg r3 = this.A01;
        int A0A = r3.A0A(53, 0);
        if (A0A != 0) {
            String str = recyclerView.canScrollVertically(A0A) ? "can_scroll" : "cannot_scroll";
            C14940q2 r1 = new C14940q2();
            r1.A03(str, 0);
            C14990q7 r2 = this.A00;
            r1.A03(r2, 1);
            C29701b3.A01(r2, r3, r1.A01(), this.A02);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3RQ)) {
            return false;
        }
        AnonymousClass3RQ r6 = (AnonymousClass3RQ) obj;
        return r6.A02 == this.A02 && r6.A01.A0A(53, 0) == this.A01.A0A(53, 0);
    }
}
