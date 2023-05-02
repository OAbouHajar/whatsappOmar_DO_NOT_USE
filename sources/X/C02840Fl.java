package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSScrollerShape28S0100000_I1;

/* renamed from: X.0Fl  reason: invalid class name and case insensitive filesystem */
public abstract class C02840Fl extends AnonymousClass0M3 {
    public Scroller A00;
    public RecyclerView A01;
    public final AnonymousClass071 A02 = new AnonymousClass0Fn(this);

    @Deprecated
    public AnonymousClass0Fo A00(AnonymousClass02W r4) {
        if (!(r4 instanceof AnonymousClass02X)) {
            return null;
        }
        return new IDxSScrollerShape28S0100000_I1(this.A01.getContext(), this, 1);
    }

    public void A01() {
        AnonymousClass02W layoutManager;
        View A04;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (A04 = A04(layoutManager)) != null) {
            int[] A05 = A05(A04, layoutManager);
            int i2 = A05[0];
            if (i2 != 0 || A05[1] != 0) {
                this.A01.A0e(i2, A05[1]);
            }
        }
    }

    public void A02(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0p(this.A02);
                this.A01.A0T = null;
            }
            this.A01 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0T == null) {
                recyclerView.A0o(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0T = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A01();
                return;
            }
            throw AnonymousClass000.A0V("An instance of OnFlingListener already set.");
        }
    }

    public abstract int A03(AnonymousClass02W r1, int i2, int i3);

    public abstract View A04(AnonymousClass02W r1);

    public abstract int[] A05(View view, AnonymousClass02W r2);
}
