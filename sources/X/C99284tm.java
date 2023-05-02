package X;

import java.util.Map;

/* renamed from: X.4tm  reason: invalid class name and case insensitive filesystem */
public class C99284tm implements C17360ux {
    public final AnonymousClass4TM A00;

    public C99284tm(AnonymousClass4TM r1) {
        this.A00 = r1;
    }

    public AnonymousClass22B Aew(C14990q7 r8, C14910pz r9, AnonymousClass228 r10, AnonymousClass229 r11, C14970q5 r12) {
        AnonymousClass22B r1;
        Map map = r11.A02;
        String A0e = C13690nt.A0e("key", map);
        if (A0e != null) {
            Object A002 = C807245f.A00(r12, map);
            Object obj = map.get("mode");
            String str = r11.A00;
            boolean equals = "p".equals(obj);
            AnonymousClass4TM r2 = this.A00;
            synchronized (r2) {
                if (equals) {
                    r2.A01(A0e, A002);
                    r1 = r2.A00(r9, A002, A0e, str);
                } else {
                    Map map2 = r2.A01;
                    Object obj2 = map2.get(A0e);
                    if (obj2 == null) {
                        map2.put(A0e, A002);
                    } else {
                        A002 = obj2;
                    }
                    r1 = r2.A00(r9, A002, A0e, str);
                }
            }
            map.get("debug_metadata");
            return r1;
        }
        throw AnonymousClass000.A0V("Key not defined in data manifest");
    }
}
