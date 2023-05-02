package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.01X  reason: invalid class name */
public abstract class AnonymousClass01X {
    public boolean A00 = false;
    public final AnonymousClass079 A01 = new AnonymousClass079();

    public final C005602k A00(ViewGroup viewGroup, int i2) {
        try {
            C004201v.A01("RV CreateView");
            C005602k APF = APF(viewGroup, i2);
            if (APF.A0H.getParent() == null) {
                APF.A02 = i2;
                return APF;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            C004201v.A00();
        }
    }

    public final void A01() {
        this.A01.A00();
    }

    public final void A02(int i2) {
        this.A01.A04((Object) null, i2, 1);
    }

    public final void A03(int i2) {
        this.A01.A02(i2, 1);
    }

    public final void A04(int i2) {
        this.A01.A03(i2, 1);
    }

    public void A05(C005602k r1) {
    }

    public void A06(C005602k r1) {
    }

    public void A07(C005602k r1) {
    }

    public void A08(C005602k r1, List list, int i2) {
        ANf(r1, i2);
    }

    public void A09(RecyclerView recyclerView) {
    }

    public void A0A(RecyclerView recyclerView) {
    }

    public void A0B(boolean z2) {
        if (!this.A01.A05()) {
            this.A00 = z2;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public abstract int A0C();

    public long A0D(int i2) {
        return -1;
    }

    public abstract void ANf(C005602k r1, int i2);

    public abstract C005602k APF(ViewGroup viewGroup, int i2);

    public int getItemViewType(int i2) {
        return 0;
    }
}
