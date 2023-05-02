package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3zE  reason: invalid class name and case insensitive filesystem */
public class C79123zE extends AnonymousClass1GV {
    public static final Set A00;
    public static final Set A01;

    static {
        HashSet A0o = C13680ns.A0o();
        Set<Object> set = AnonymousClass4ZH.A1P;
        HashSet A0o2 = C13680ns.A0o();
        for (Object obj : set) {
            Collection collection = (Collection) AnonymousClass4ZH.A0z.get(obj);
            if (collection == null) {
                collection = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1041854g[]{AnonymousClass4ZH.A01})));
            }
            A0o2.addAll(collection);
        }
        for (C1041854g r0 : Collections.unmodifiableSet(A0o2)) {
            String str = r0.sha1Hash;
            A0o.add(Pair.create("com.obwhatsapp", str));
            A0o.add(Pair.create("com.obwhatsapp.w4b", str));
        }
        A00 = Collections.unmodifiableSet(A0o);
        HashSet A0o3 = C13680ns.A0o();
        C1041854g r1 = AnonymousClass4ZH.A0y;
        A0o3.add(Pair.create("com.obwhatsapp", r1.sha1Hash));
        A0o3.add(Pair.create("com.obwhatsapp.w4b", r1.sha1Hash));
        A01 = Collections.unmodifiableSet(A0o3);
    }

    public C79123zE() {
        super(A00, A01);
    }
}
