package X;

import java.util.List;

/* renamed from: X.5wB  reason: invalid class name */
public class AnonymousClass5wB {
    public static List A01;
    public String A00 = "";

    public AnonymousClass5wB(String str) {
        try {
            new C1219267o(str);
            A01 = C1219267o.A02;
        } catch (C115065p3 e2) {
            throw e2;
        } catch (Exception unused) {
            throw new C115065p3(C114785ob.UNKNOWN_ERROR);
        }
    }

    public static String A00(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder(100);
        A01(sb, str2);
        A01(sb, str);
        A01(sb, str6);
        A01(sb, str7);
        A01(sb, str3);
        A01(sb, str5);
        if (str4 != null && !str4.isEmpty()) {
            sb.append(str4);
        }
        int lastIndexOf = sb.lastIndexOf("|");
        if (lastIndexOf != -1 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        return sb.toString();
    }

    public static void A01(StringBuilder sb, String str) {
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
    }
}
