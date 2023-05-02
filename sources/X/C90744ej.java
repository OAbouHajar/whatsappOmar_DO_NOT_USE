package X;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4ej  reason: invalid class name and case insensitive filesystem */
public class C90744ej {
    public static int A00(char c2) {
        int i2;
        if ('0' <= c2) {
            if (c2 <= '9') {
                return c2 - '0';
            }
            if ('a' <= c2 && c2 <= 'f') {
                i2 = c2 - 'a';
                return i2 + 10;
            }
        }
        i2 = c2 - 'A';
        return i2 + 10;
    }

    public static String A01(C32071fb r7) {
        String A02 = A02(r7);
        int length = A02.length();
        int i2 = 0;
        if (length > 0 && A02.charAt(0) == '#') {
            try {
                C32051fZ A022 = C32051fZ.A02(C90584eP.A02(A02, length - 1));
                if (A022 instanceof C33031hp) {
                    A02 = ((C33031hp) A022).AGJ();
                }
            } catch (IOException e2) {
                throw AnonymousClass000.A0V(AnonymousClass000.A0g("unknown encoding in name: ", e2));
            }
        }
        String A00 = C32941ha.A00(A02);
        int length2 = A00.length();
        if (length2 < 2) {
            return A00;
        }
        int i3 = length2 - 1;
        while (i2 < i3 && A00.charAt(i2) == '\\' && A00.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i4 = i2 + 1;
        int i5 = i3;
        while (i5 > i4 && A00.charAt(i5 - 1) == '\\' && A00.charAt(i5) == ' ') {
            i5 -= 2;
        }
        if (i2 > 0 || i5 < i3) {
            A00 = A00.substring(i2, i5 + 1);
        }
        if (A00.indexOf("  ") < 0) {
            return A00;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = A00.charAt(0);
        stringBuffer.append(charAt);
        for (int i6 = 1; i6 < A00.length(); i6++) {
            char charAt2 = A00.charAt(i6);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String A02(C32071fb r8) {
        int i2;
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        if (!(r8 instanceof C33031hp) || (r8 instanceof C107505Il)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(C90584eP.A00(AnonymousClass3K4.A1E(r8)));
            } catch (IOException unused) {
                throw AnonymousClass000.A0T("Other value has no encoded form");
            }
        } else {
            String AGJ = ((C33031hp) r8).AGJ();
            if (AGJ.length() > 0 && AGJ.charAt(0) == '#') {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            stringBuffer.append(AGJ);
        }
        int length = stringBuffer.length();
        int i4 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i4 = 0;
        }
        while (i2 != length) {
            char charAt = stringBuffer.charAt(i2);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            stringBuffer.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i3 && stringBuffer.charAt(i3) == ' ') {
                stringBuffer.insert(i3, "\\");
                i3 += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, IOUtils.DIR_SEPARATOR_WINDOWS);
            length2--;
        }
        return stringBuffer.toString();
    }

    public static C32041fY A03(String str, Hashtable hashtable) {
        if (C32941ha.A01(str).startsWith("OID.")) {
            str = str.substring(4);
        } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            C32041fY r0 = (C32041fY) hashtable.get(C32941ha.A00(str));
            if (r0 != null) {
                return r0;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Unknown object id - ");
            A0r.append(str);
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" - passed to distinguished name", A0r));
        }
        return AnonymousClass3K3.A0w(str);
    }

    public static void A04(StringBuffer stringBuffer, Hashtable hashtable, AnonymousClass5I9 r4) {
        C32041fY r1 = r4.A01;
        String str = (String) hashtable.get(r1);
        if (str == null) {
            str = r1.A01;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(A02(r4.A00));
    }

    public static void A05(StringBuffer stringBuffer, Hashtable hashtable, AnonymousClass5IJ r6) {
        if (r6.A00.A01.length > 1) {
            AnonymousClass5I9[] A04 = r6.A04();
            boolean z2 = true;
            for (int i2 = 0; i2 != A04.length; i2++) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append('+');
                }
                A04(stringBuffer, hashtable, A04[i2]);
            }
        } else if (r6.A03() != null) {
            A04(stringBuffer, hashtable, r6.A03());
        }
    }

    public static boolean A06(AnonymousClass5IJ r9, AnonymousClass5IJ r10) {
        if (r9.A00.A01.length == r10.A00.A01.length) {
            AnonymousClass5I9[] A04 = r9.A04();
            AnonymousClass5I9[] A042 = r10.A04();
            int length = A04.length;
            if (length == A042.length) {
                int i2 = 0;
                while (i2 != length) {
                    AnonymousClass5I9 r3 = A04[i2];
                    AnonymousClass5I9 r2 = A042[i2];
                    if (r3 == r2 || (r3 != null && r2 != null && r3.A01.A04(r2.A01) && A01(r3.A00).equals(A01(r2.A00)))) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
