package X;

import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.scroller.RecyclerFastScroller;

/* renamed from: X.4tC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98924tC implements AnonymousClass1VF {
    public final /* synthetic */ RecyclerFastScroller A00;

    public /* synthetic */ C98924tC(RecyclerFastScroller recyclerFastScroller) {
        this.A00 = recyclerFastScroller;
    }

    public final void AU9(AppBarLayout appBarLayout, int i2) {
        RecyclerFastScroller recyclerFastScroller = this.A00;
        int i3 = -i2;
        if (recyclerFastScroller.A00 != i3) {
            recyclerFastScroller.A02();
            recyclerFastScroller.A00 = i3;
        }
    }
}
