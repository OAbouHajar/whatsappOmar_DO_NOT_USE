package X;

/* renamed from: X.4e7  reason: invalid class name and case insensitive filesystem */
public class C90424e7 {
    public static final AnonymousClass59B A00 = new AnonymousClass59B();
    public static final AnonymousClass59C A01 = new AnonymousClass59C();
    public static final AnonymousClass598 A02 = new AnonymousClass598();
    public static final AnonymousClass599 A03 = new AnonymousClass599();
    public static final AnonymousClass59A A04 = new AnonymousClass59A();

    public static boolean A00(char c2) {
        return c2 == '{' || c2 == '[' || c2 == ',' || c2 == '}' || c2 == ']' || c2 == ':' || c2 == '\'' || c2 == '\"';
    }

    public static boolean A01(char c2) {
        if (c2 < 0) {
            return false;
        }
        if (c2 <= 31) {
            return true;
        }
        if (c2 < 127) {
            return false;
        }
        if (c2 > 159) {
            return c2 >= 8192 && c2 <= 8447;
        }
        return true;
    }

    public static boolean A02(String str) {
        String str2;
        if (str.length() >= 3) {
            char charAt = str.charAt(0);
            if (charAt == 'n') {
                str2 = "null";
            } else if (charAt == 't') {
                str2 = "true";
            } else if (charAt == 'f') {
                str2 = "false";
            } else if (charAt == 'N') {
                str2 = "NaN";
            }
            return str.equals(str2);
        }
        return false;
    }
}
