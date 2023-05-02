package X;

/* renamed from: X.4A5  reason: invalid class name */
public final class AnonymousClass4A5 {
    public static final AnonymousClass22P A00;

    static {
        String A06 = C18450wi.A06("[eE][+-]?", "(\\p{Digit}+)");
        StringBuilder A0r = AnonymousClass000.A0r("(0[xX]");
        A0r.append("(\\p{XDigit}+)");
        A0r.append("(\\.)?)|(0[xX]");
        A0r.append("(\\p{XDigit}+)");
        A0r.append("?(\\.)");
        A0r.append("(\\p{XDigit}+)");
        String A0p = AnonymousClass3K3.A0p(A0r, ')');
        StringBuilder A0r2 = AnonymousClass000.A0r("(");
        A0r2.append("(\\p{Digit}+)");
        A0r2.append("(\\.)?(");
        A0r2.append("(\\p{Digit}+)");
        A0r2.append("?)(");
        A0r2.append(A06);
        A0r2.append(")?)|(\\.(");
        A0r2.append("(\\p{Digit}+)");
        A0r2.append(")(");
        A0r2.append(A06);
        A0r2.append(")?)|((");
        A0r2.append(A0p);
        A0r2.append(")[pP][+-]?");
        A0r2.append("(\\p{Digit}+)");
        String A0p2 = AnonymousClass3K3.A0p(A0r2, ')');
        StringBuilder A0r3 = AnonymousClass000.A0r("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        A0r3.append(A0p2);
        A00 = new AnonymousClass22P(AnonymousClass000.A0h(")[fFdD]?))[\\x00-\\x20]*", A0r3));
    }
}
