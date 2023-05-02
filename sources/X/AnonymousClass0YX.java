package X;

import android.view.MenuItem;

/* renamed from: X.0YX  reason: invalid class name */
public class AnonymousClass0YX implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ C02550Cv A01;

    public AnonymousClass0YX(MenuItem.OnMenuItemClickListener onMenuItemClickListener, C02550Cv r2) {
        this.A01 = r2;
        this.A00 = onMenuItemClickListener;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
