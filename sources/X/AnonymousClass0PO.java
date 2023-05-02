package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.0PO  reason: invalid class name */
public abstract class AnonymousClass0PO {
    public AnonymousClass00O A00;
    public final Context A01;

    public AnonymousClass0PO(Context context) {
        this.A01 = context;
    }

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof AnonymousClass09J)) {
            return menuItem;
        }
        AnonymousClass09J r1 = (AnonymousClass09J) menuItem;
        AnonymousClass00O r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass00O();
            this.A00 = r0;
        }
        MenuItem menuItem2 = (MenuItem) r0.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C02550Cv r3 = new C02550Cv(this.A01, r1);
        this.A00.put(r1, r3);
        return r3;
    }
}
