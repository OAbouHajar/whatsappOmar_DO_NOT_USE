package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.09Q  reason: invalid class name */
public class AnonymousClass09Q extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass09Q(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void onChanged() {
        this.A00.A06();
    }

    public void onInvalidated() {
        this.A00.A06();
    }
}
