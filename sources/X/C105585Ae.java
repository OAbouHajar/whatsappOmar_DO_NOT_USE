package X;

/* renamed from: X.5Ae  reason: invalid class name and case insensitive filesystem */
public final class C105585Ae extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105585Ae(String str) {
        super(str);
        C18450wi.A0H(str, 1);
    }

    public static C105585Ae A00(Object obj, String str) {
        return new C105585Ae(C18450wi.A06(str, obj));
    }
}
