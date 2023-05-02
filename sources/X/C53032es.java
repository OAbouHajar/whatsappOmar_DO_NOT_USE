package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.HomePagerSlidingTabStrip;

/* renamed from: X.2es  reason: invalid class name and case insensitive filesystem */
public class C53032es implements LayoutTransition.TransitionListener {
    public final /* synthetic */ HomePagerSlidingTabStrip A00;

    public C53032es(HomePagerSlidingTabStrip homePagerSlidingTabStrip) {
        this.A00 = homePagerSlidingTabStrip;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
        this.A00.invalidate();
    }

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
    }
}
