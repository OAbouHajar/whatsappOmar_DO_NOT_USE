package X;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.0V4  reason: invalid class name */
public abstract class AnonymousClass0V4 {
    public Object A00;
    public final Context A01;
    public final AnonymousClass04d A02;
    public final Object A03 = new Object();
    public final LinkedHashSet A04 = new LinkedHashSet();

    public AnonymousClass0V4(Context context, AnonymousClass04d r3) {
        this.A02 = r3;
        Context applicationContext = context.getApplicationContext();
        C18450wi.A0B(applicationContext);
        this.A01 = applicationContext;
    }

    public static final void A01(AnonymousClass0V4 r4, List list) {
        C18450wi.A0H(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = r4.A00;
            C08110d4 r2 = (C08110d4) ((C12060jm) it.next());
            r2.A01 = obj;
            r2.A00(r2.A00, obj);
        }
    }

    public abstract Object A02();

    public abstract void A03();

    public abstract void A04();

    public final void A05(C12060jm r4) {
        synchronized (this.A03) {
            LinkedHashSet linkedHashSet = this.A04;
            if (linkedHashSet.remove(r4) && linkedHashSet.isEmpty()) {
                A04();
            }
        }
    }

    public final void A06(Object obj) {
        synchronized (this.A03) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((C08190dE) this.A02).A02.execute(new C10000gQ(this, C003101j.A0A(this.A04)));
            }
        }
    }
}
