package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4mX  reason: invalid class name and case insensitive filesystem */
public class C95374mX implements C13290lm {
    public int A00 = -1;
    public final RecyclerView A01;
    public final C57542rL A02;

    public C95374mX(RecyclerView recyclerView, C57542rL r3) {
        this.A02 = r3;
        this.A01 = recyclerView;
    }

    public void AOI(Object obj, int i2, int i3) {
        this.A02.A01.A04(obj, i2, i3);
    }

    public void ASG(int i2, int i3) {
        int i4 = this.A00;
        if (i4 == -1 || i4 > i2) {
            this.A00 = i2;
            this.A01.A0Z(0);
        }
        this.A02.A01.A02(i2, i3);
    }

    public void ATo(int i2, int i3) {
        this.A02.A01.A01(i2, i3);
    }

    public void AW0(int i2, int i3) {
        this.A02.A01.A03(i2, i3);
    }
}
