package X;

import java.util.HashSet;

/* renamed from: X.3Iy  reason: invalid class name and case insensitive filesystem */
public class C63533Iy extends AnonymousClass3BN {
    public static final HashSet A01;
    public static final HashSet A02;
    public static final HashSet A03 = C13680ns.A0o();
    public String A00;

    static {
        String[] strArr = new String[28];
        strArr[0] = "BEGIN";
        strArr[1] = "LOGO";
        strArr[2] = "PHOTO";
        strArr[3] = "LABEL";
        strArr[4] = "FN";
        strArr[5] = "TITLE";
        strArr[6] = "SOUND";
        strArr[7] = "VERSION";
        strArr[8] = "TEL";
        strArr[9] = "EMAIL";
        strArr[10] = "TZ";
        strArr[11] = "GEO";
        strArr[12] = "NOTE";
        strArr[13] = "URL";
        strArr[14] = "BDAY";
        strArr[15] = "ROLE";
        strArr[16] = "REV";
        strArr[17] = "UID";
        strArr[18] = "KEY";
        strArr[19] = "MAILER";
        strArr[20] = "NAME";
        strArr[21] = "PROFILE";
        strArr[22] = "SOURCE";
        strArr[23] = "NICKNAME";
        strArr[24] = "CLASS";
        strArr[25] = "SORT-STRING";
        strArr[26] = "CATEGORIES";
        A02 = C13680ns.A0p("PRODID", strArr, 27);
        String[] strArr2 = new String[4];
        strArr2[0] = "7BIT";
        strArr2[1] = "8BIT";
        strArr2[2] = "BASE64";
        A01 = C13680ns.A0p("B", strArr2, 3);
    }

    public void A04(String str) {
        try {
            super.A04(str);
        } catch (AnonymousClass25G unused) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                AnonymousClass25L r0 = this.A0G;
                if (r0 != null) {
                    r0.A01 = str2;
                    r0.A00(str3);
                    return;
                }
                return;
            }
            throw new AnonymousClass25G(C13680ns.A0h("Unknown params value: ", str));
        }
    }
}
