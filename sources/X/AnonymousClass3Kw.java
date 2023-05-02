package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.3Kw  reason: invalid class name */
public class AnonymousClass3Kw extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public AnonymousClass3Kw(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onChanged() {
        this.A00.A05();
    }

    public void onInvalidated() {
        this.A00.A05();
    }
}
