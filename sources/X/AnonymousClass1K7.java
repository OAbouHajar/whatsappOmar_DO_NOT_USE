package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1K7  reason: invalid class name */
public class AnonymousClass1K7 implements C25261Jc {
    public final C25261Jc A00;
    public final Set A01;

    public AnonymousClass1K7(C25261Jc r9, Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C25251Jb r4 = (C25251Jb) it.next();
            for (String str : r4.A00) {
                if (hashMap.containsKey(str)) {
                    String simpleName = getClass().getSimpleName();
                    StringBuilder sb = new StringBuilder("Duplicate support for action=");
                    sb.append(str);
                    sb.append(" by ");
                    sb.append(r4);
                    sb.append(" and ");
                    sb.append(hashMap.get(str));
                    Log.e(simpleName, sb.toString());
                }
                hashMap.put(str, r4);
            }
        }
        this.A01 = set;
        this.A00 = r9;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r5, C99354tt r6, C14970q5 r7) {
        for (C25251Jb r2 : this.A01) {
            if (r2.A00.contains(r6.A00)) {
                return r2.A8l(r5, r6, r7);
            }
        }
        C25261Jc r0 = this.A00;
        if (r0 != null) {
            return r0.A8l(r5, r6, r7);
        }
        return null;
    }
}
