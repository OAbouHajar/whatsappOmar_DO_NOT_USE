package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.2Xi  reason: invalid class name and case insensitive filesystem */
public class C50022Xi extends AnonymousClass07D {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final boolean A03;
    public final boolean A04;

    public C50022Xi(int i2, int i3, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A04 = z2;
        this.A03 = z3;
        this.A00 = i3;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r12, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        boolean z2 = this.A03;
        int A003 = r12.A00();
        int i2 = A003;
        if (!z2) {
            A003 = C89574cT.A01(A003, this.A02);
        }
        int i3 = A002 % A003;
        int A022 = z2 ? 1 : C89574cT.A02(i2, this.A02);
        int i4 = (A002 * A022) / i2;
        int i5 = 0;
        int i6 = i3 == 0 ? (this.A00 & 4) == 4 ? this.A01 : 0 : this.A01 >> 1;
        int i7 = i3 == A003 - 1 ? (this.A00 & 8) == 8 ? this.A01 : 0 : this.A01 >> 1;
        int i8 = i4 == 0 ? (this.A00 & 1) == 1 ? this.A01 : 0 : this.A01 >> 1;
        if (i4 != A022 - 1) {
            i5 = this.A01 >> 1;
        } else if ((this.A00 & 2) == 2) {
            i5 = this.A01;
        }
        int i9 = i7;
        if (this.A04) {
            i9 = i6;
            i6 = i7;
        }
        rect.set(i9, i8, i6, i5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C50022Xi)) {
            return false;
        }
        C50022Xi r4 = (C50022Xi) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && this.A02 == r4.A02 && this.A03 == r4.A03;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Boolean.valueOf(this.A02), Integer.valueOf(this.A00), Boolean.valueOf(this.A03)});
    }
}
