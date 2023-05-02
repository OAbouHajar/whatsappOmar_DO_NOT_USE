package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4cy  reason: invalid class name and case insensitive filesystem */
public class C89814cy {
    public static C91174fU A00;
    public static final Object A01 = C13690nt.A0Y();
    public static final Map A02 = new HashMap(4);
    public static final Map A03 = new HashMap(4);
    public static final WeakHashMap A04 = new WeakHashMap();

    public static AnonymousClass4G1 A00(Context context, C108195Na r6) {
        AnonymousClass4G1 r1 = null;
        synchronized (A01) {
            Map map = A03;
            Map map2 = (Map) map.get(context);
            if (map2 == null) {
                Context context2 = context;
                while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (!A04.containsKey(context2)) {
                    if (A00 == null) {
                        A00 = new C91174fU();
                        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(A00);
                    }
                    map2 = AnonymousClass000.A0x();
                    map.put(context, map2);
                }
            }
            Class<?> cls = r6.getClass();
            r1 = (AnonymousClass4G1) map2.get(cls);
            if (r1 == null) {
                r1 = new AnonymousClass4G1(cls);
                map2.put(cls, r1);
            }
        }
        return r1;
    }

    public static void A01(Context context, Map map) {
        map.remove(context);
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Context context2 = (Context) AnonymousClass000.A0z(A0y).getKey();
            Context context3 = context;
            while (context3 instanceof ContextWrapper) {
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (context2 == context3) {
                A0y.remove();
            }
        }
    }
}
