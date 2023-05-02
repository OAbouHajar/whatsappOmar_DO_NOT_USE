package X;

import java.util.Collection;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4eK  reason: invalid class name and case insensitive filesystem */
public final class C90534eK {
    public static boolean containsAllImpl(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static Collection filter(Collection collection, AnonymousClass5OH r2) {
        return collection instanceof C105835Bj ? ((C105835Bj) collection).createCombined(r2) : new C105835Bj(collection, r2);
    }

    public static StringBuilder newStringBuilderForCollection(int i2) {
        C29011Zs.checkNonnegative(i2, "size");
        return C13690nt.A0g((int) Math.min(((long) i2) * 8, FileUtils.ONE_GB));
    }

    public static boolean safeContains(Collection collection, Object obj) {
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Collection transform(Collection collection, C49762Vq r2) {
        return new C105815Bh(collection, r2);
    }
}
