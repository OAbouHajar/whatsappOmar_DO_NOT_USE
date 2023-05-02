package X;

/* renamed from: X.4eJ  reason: invalid class name and case insensitive filesystem */
public final class C90524eJ {
    public static void A00(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw AnonymousClass3K4.A0V();
        }
    }

    public static void A02(Object obj, boolean z2) {
        if (!z2) {
            throw AnonymousClass000.A0V(String.valueOf(obj));
        }
    }

    public static void A03(boolean z2) {
        if (!z2) {
            throw AnonymousClass3K3.A0f();
        }
    }

    public static void A04(boolean z2) {
        if (!z2) {
            throw AnonymousClass3K4.A0V();
        }
    }
}
