package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.4uU  reason: invalid class name and case insensitive filesystem */
public class C99724uU implements C109755Tl {
    public final AnonymousClass4XH A00 = C89774ct.A02.A01;

    public Collection AFG(Object obj) {
        if (!(obj instanceof List)) {
            return ((Map) obj).keySet();
        }
        throw C13680ns.A0m();
    }

    public int AK7(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return AFG(obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        throw new AnonymousClass5Ar(AnonymousClass000.A0h(obj != null ? AnonymousClass000.A0d(obj) : "null", AnonymousClass000.A0r("length operation cannot be applied to ")));
    }

    public void AdY(Object obj, int i2, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i2 == list.size()) {
                list.add(obj2);
            } else {
                list.set(i2, obj2);
            }
        } else {
            throw C13680ns.A0m();
        }
    }

    public void AeR(Object obj, Object obj2, Object obj3) {
        if (obj instanceof Map) {
            ((Map) obj).put(obj2.toString(), obj3);
            return;
        }
        throw new AnonymousClass5Ar(AnonymousClass000.A0g("setProperty operation cannot be used with ", obj) != null ? AnonymousClass000.A0d(obj) : "null");
    }

    public Iterable Ago(Object obj) {
        if (obj instanceof List) {
            return (Iterable) obj;
        }
        throw new AnonymousClass5Ar(AnonymousClass000.A0g("Cannot iterate over ", obj) != null ? AnonymousClass000.A0d(obj) : "null");
    }
}
