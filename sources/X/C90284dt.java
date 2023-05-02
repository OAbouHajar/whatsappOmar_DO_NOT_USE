package X;

import java.util.Map;

/* renamed from: X.4dt  reason: invalid class name and case insensitive filesystem */
public class C90284dt {
    public static Map A00(Object obj) {
        if (!(obj instanceof C23861Dq) || (obj instanceof AnonymousClass28m)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e2) {
                C18450wi.A0P(C90284dt.class.getName(), e2);
                throw e2;
            }
        } else {
            A02(obj, "kotlin.collections.MutableMap");
            throw AnonymousClass000.A0Z();
        }
    }

    public static void A01(Object obj, int i2) {
        int i3;
        if (obj != null) {
            if (obj instanceof AnonymousClass1DT) {
                if (obj instanceof AnonymousClass1DS) {
                    i3 = ((AnonymousClass1DS) obj).A9z();
                } else if (obj instanceof AnonymousClass1DU) {
                    i3 = 0;
                } else if (obj instanceof AnonymousClass22J) {
                    i3 = 1;
                } else if (obj instanceof AnonymousClass1UJ) {
                    i3 = 2;
                } else if (obj instanceof AnonymousClass5D8) {
                    i3 = 3;
                } else {
                    i3 = -1;
                    if (obj instanceof C11350id) {
                        i3 = 4;
                    }
                }
                if (i3 == i2) {
                    return;
                }
            }
            A02(obj, C13680ns.A0c(i2, "kotlin.jvm.functions.Function"));
            throw AnonymousClass000.A0Z();
        }
    }

    public static void A02(Object obj, String str) {
        StringBuilder A0q = AnonymousClass000.A0q(obj == null ? "null" : AnonymousClass000.A0d(obj));
        A0q.append(" cannot be cast to ");
        ClassCastException classCastException = new ClassCastException(AnonymousClass000.A0h(str, A0q));
        C18450wi.A0P(C90284dt.class.getName(), classCastException);
        throw classCastException;
    }
}
