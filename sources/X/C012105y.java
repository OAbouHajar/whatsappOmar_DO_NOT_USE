package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.05y  reason: invalid class name and case insensitive filesystem */
public class C012105y {
    public C011005f A00;
    public AnonymousClass05T A01;

    public C012105y(C011005f r5, C003501o r6) {
        AnonymousClass05T reflectiveGenericLifecycleObserver;
        boolean z2 = r6 instanceof C012205z;
        if (r6 instanceof AnonymousClass05T) {
            reflectiveGenericLifecycleObserver = z2 ? new FullLifecycleObserverAdapter((C012205z) r6, (AnonymousClass05T) r6) : (AnonymousClass05T) r6;
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((C012205z) r6, (AnonymousClass05T) null);
        } else {
            Class<?> cls = r6.getClass();
            if (C06390Vp.A00(cls) == 2) {
                List list = (List) C06390Vp.A01.get(cls);
                if (list.size() == 1) {
                    C06390Vp.A01(r6, (Constructor) list.get(0));
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    C11910jX[] r1 = new C11910jX[list.size()];
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        r1[i2] = C06390Vp.A01(r6, (Constructor) list.get(i2));
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(r1);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(r6);
            }
        }
        this.A01 = reflectiveGenericLifecycleObserver;
        this.A00 = r5;
    }

    public void A00(C011405n r4, C001300o r5) {
        C011005f A012 = r4.A01();
        C011005f r1 = this.A00;
        if (A012.compareTo(r1) < 0) {
            r1 = A012;
        }
        this.A00 = r1;
        this.A01.AXa(r4, r5);
        this.A00 = A012;
    }
}
