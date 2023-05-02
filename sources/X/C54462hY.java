package X;

import android.content.Context;

/* renamed from: X.2hY  reason: invalid class name and case insensitive filesystem */
public final class C54462hY {
    public static boolean A00(Context context) {
        AnonymousClass01I.A00(context, AnonymousClass01F.class);
        C17380uz of = C17380uz.of();
        boolean z2 = false;
        if (of.size() <= 1) {
            z2 = true;
        }
        C52772eQ.A00("Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0], z2);
        if (of.isEmpty()) {
            return true;
        }
        return ((Boolean) of.iterator().next()).booleanValue();
    }
}
