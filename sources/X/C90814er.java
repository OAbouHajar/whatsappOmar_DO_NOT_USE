package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4er  reason: invalid class name and case insensitive filesystem */
public final class C90814er {
    public static int capacity(int i2) {
        if (i2 < 3) {
            C29011Zs.checkNonnegative(i2, "expectedSize");
            return i2 + 1;
        } else if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry immutableEntry(Object obj, Object obj2) {
        return new C67713cG(obj, obj2);
    }

    public static boolean safeContainsKey(Map map, Object obj) {
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object safeGet(Map map, Object obj) {
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object safeRemove(Map map, Object obj) {
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = C90534eK.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Iterator A0y = AnonymousClass000.A0y(map);
        boolean z2 = true;
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            if (!z2) {
                newStringBuilderForCollection.append(", ");
            }
            z2 = false;
            newStringBuilderForCollection.append(A0z.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(A0z.getValue());
        }
        return AnonymousClass000.A0k(newStringBuilderForCollection);
    }

    public static Iterator valueIterator(Iterator it) {
        return new C68133cw(it);
    }
}
