package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3RP  reason: invalid class name */
public class AnonymousClass3RP extends AnonymousClass071 {
    public final C14990q7 A00;
    public final C31201dg A01;
    public final C14930q1 A02;

    public AnonymousClass3RP(C14990q7 r1, C31201dg r2, C14930q1 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        C31201dg r3 = this.A01;
        C14930q1 r2 = this.A02;
        C29701b3.A01(this.A00, r3, AnonymousClass3K3.A0Z(r3), r2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3RP)) {
            return false;
        }
        AnonymousClass3RP r4 = (AnonymousClass3RP) obj;
        return r4.A02 == this.A02 && r4.A01 == this.A01;
    }
}
