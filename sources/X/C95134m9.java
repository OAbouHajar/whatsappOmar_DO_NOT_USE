package X;

import android.view.MenuItem;

/* renamed from: X.4m9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95134m9 implements AnonymousClass023 {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ MenuItem A01;
    public final /* synthetic */ MenuItem A02;
    public final /* synthetic */ C449726l A03;

    public /* synthetic */ C95134m9(MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, C449726l r4) {
        this.A03 = r4;
        this.A00 = menuItem;
        this.A01 = menuItem2;
        this.A02 = menuItem3;
    }

    public final void AOH(Object obj) {
        boolean z2;
        C449726l r6 = this.A03;
        MenuItem menuItem = this.A00;
        MenuItem menuItem2 = this.A01;
        MenuItem menuItem3 = this.A02;
        if (!AnonymousClass000.A1X(obj) || r6.A0m == null) {
            z2 = false;
            menuItem.setShowAsAction(1);
            menuItem2.setShowAsAction(1);
        } else {
            z2 = true;
            menuItem.setShowAsAction(0);
            menuItem2.setShowAsAction(0);
        }
        menuItem3.setVisible(z2);
        r6.A36();
    }
}
