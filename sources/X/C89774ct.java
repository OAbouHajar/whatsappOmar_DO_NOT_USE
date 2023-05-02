package X;

import java.util.Iterator;

/* renamed from: X.4ct  reason: invalid class name and case insensitive filesystem */
public class C89774ct {
    public static C89984dJ A00 = C89984dJ.A06;
    public static final C90044dP A01 = new C90044dP();
    public static final AnonymousClass4RL A02 = new AnonymousClass4RL();

    public static void A00(Appendable appendable, Object obj, C89984dJ r7) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C90044dP r3 = A01;
        AnonymousClass5R0 r2 = (AnonymousClass5R0) r3.A01.get(cls);
        if (r2 == null) {
            if (!cls.isArray()) {
                Iterator it = r3.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r2 = C90044dP.A0A;
                        break;
                    }
                    AnonymousClass4JD r1 = (AnonymousClass4JD) it.next();
                    if (r1.A00.isAssignableFrom(cls)) {
                        r2 = r1.A01;
                        break;
                    }
                }
            } else {
                r2 = C90044dP.A09;
            }
            r3.A01(r2, cls);
        }
        r2.AiI(appendable, obj, r7);
    }
}
