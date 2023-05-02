package X;

import android.view.MenuItem;

/* renamed from: X.0YW  reason: invalid class name */
public class AnonymousClass0YW implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ C02550Cv A01;

    public AnonymousClass0YW(MenuItem.OnActionExpandListener onActionExpandListener, C02550Cv r2) {
        this.A01 = r2;
        this.A00 = onActionExpandListener;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
