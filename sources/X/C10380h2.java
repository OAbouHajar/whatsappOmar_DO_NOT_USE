package X;

import android.view.MenuItem;

/* renamed from: X.0h2  reason: invalid class name and case insensitive filesystem */
public class C10380h2 implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ AnonymousClass0ZY A01;
    public final /* synthetic */ AnonymousClass0OK A02;
    public final /* synthetic */ C016607w A03;

    public C10380h2(MenuItem menuItem, AnonymousClass0ZY r2, AnonymousClass0OK r3, C016607w r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = menuItem;
        this.A03 = r4;
    }

    public void run() {
        AnonymousClass0OK r1 = this.A02;
        if (r1 != null) {
            C02570Cy r2 = this.A01.A00;
            r2.A0D = true;
            r1.A01.A0G(false);
            r2.A0D = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0L(menuItem, (C13350lt) null, 4);
        }
    }
}
