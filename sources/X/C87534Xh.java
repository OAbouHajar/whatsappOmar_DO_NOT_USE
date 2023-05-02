package X;

import java.util.Map;

/* renamed from: X.4Xh  reason: invalid class name and case insensitive filesystem */
public final class C87534Xh {
    public static boolean equalsImpl(AnonymousClass5T4 r1, Object obj) {
        if (obj == r1) {
            return true;
        }
        if (obj instanceof AnonymousClass5T4) {
            return r1.asMap().equals(((AnonymousClass5T4) obj).asMap());
        }
        return false;
    }

    public static AnonymousClass5Ue newListMultimap(Map map, AnonymousClass5OI r2) {
        return new C67603c4(map, r2);
    }
}
