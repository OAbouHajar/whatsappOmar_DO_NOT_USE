package X;

/* renamed from: X.1fW  reason: invalid class name and case insensitive filesystem */
public class C32021fW {
    public static String A00(int i2) {
        if (i2 == 0) {
            return "kCallLinkStateNone";
        }
        if (i2 == 1) {
            return "kCallLinkStateQuerySent";
        }
        if (i2 == 2) {
            return "kCallLinkStateJoinAcked";
        }
        if (i2 == 3) {
            return "kCallLinkStateJoinSent";
        }
        if (i2 == 4) {
            return "kCallLinkStateQueryAcked";
        }
        AnonymousClass00B.A08("UNKNOWN CallLinkState");
        return "UNKNOWN CallLinkState";
    }
}
