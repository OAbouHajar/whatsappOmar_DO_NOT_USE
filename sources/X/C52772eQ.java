package X;

/* renamed from: X.2eQ  reason: invalid class name and case insensitive filesystem */
public final class C52772eQ {
    public static void A00(String str, Object[] objArr, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void A01(boolean z2) {
        A00("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0], z2);
    }
}
