package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.0bv  reason: invalid class name and case insensitive filesystem */
public class C07490bv implements C001500q, C001600r, C001900u {
    public C009604p A00 = null;
    public AnonymousClass04o A01;
    public AnonymousClass05O A02 = null;
    public final AnonymousClass01A A03;
    public final C010505a A04;

    public C07490bv(AnonymousClass01A r2, C010505a r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public void A00() {
        if (this.A00 == null) {
            this.A00 = new C009604p(this);
            this.A02 = new AnonymousClass05O(this);
        }
    }

    public AnonymousClass04o ABj() {
        AnonymousClass01A r3 = this.A03;
        AnonymousClass04o ABj = r3.ABj();
        if (ABj.equals(r3.A0M)) {
            ABj = this.A01;
            if (ABj == null) {
                Application application = null;
                Context context = r3.A02().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                ABj = new C010705c(application, r3.A05, this);
            }
            return ABj;
        }
        this.A01 = ABj;
        return ABj;
    }

    public AnonymousClass05X AFh() {
        A00();
        return this.A02.A01;
    }

    public C010505a AGy() {
        A00();
        return this.A04;
    }

    public C009704q getLifecycle() {
        A00();
        return this.A00;
    }
}
