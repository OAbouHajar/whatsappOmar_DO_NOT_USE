package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.0cF  reason: invalid class name and case insensitive filesystem */
public class C07650cF implements C12490kU {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public void A00(RecyclerView recyclerView, boolean z2) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AnonymousClass02W r3 = recyclerView.A0S;
        AnonymousClass01X r1 = recyclerView.A0N;
        if (r1 != null && r3 != null) {
            if (z2) {
                if (recyclerView.A0J.A04.size() <= 0) {
                    r3.A0L(this, r1.A0C());
                }
            } else if (recyclerView.A0g && !recyclerView.A0e && recyclerView.A0J.A04.size() <= 0) {
                r3.A0s(this, recyclerView.A0y, this.A01, this.A02);
            }
            int i2 = this.A00;
            if (i2 > r3.A02) {
                r3.A02 = i2;
                r3.A0C = z2;
                recyclerView.A0w.A03();
            }
        }
    }

    public void A4h(int i2, int i3) {
        if (i3 >= 0) {
            int i4 = this.A00 << 1;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[(i4 << 1)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.A00++;
            return;
        }
        throw AnonymousClass000.A0T("Pixel distance must be non-negative");
    }
}
