package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: X.4c5  reason: invalid class name and case insensitive filesystem */
public abstract class C89394c5 {
    public static Hashtable A00(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public String A01(AnonymousClass5IQ r8) {
        StringBuffer stringBuffer;
        if (this instanceof AnonymousClass5J6) {
            AnonymousClass5J6 r5 = (AnonymousClass5J6) this;
            stringBuffer = new StringBuffer();
            AnonymousClass5IJ[] A03 = r8.A03();
            boolean z2 = true;
            for (int length = A03.length - 1; length >= 0; length--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                C90744ej.A05(stringBuffer, r5.A01, A03[length]);
            }
        } else {
            AnonymousClass5J5 r52 = (AnonymousClass5J5) this;
            stringBuffer = new StringBuffer();
            AnonymousClass5IJ[] A032 = r8.A03();
            boolean z3 = true;
            for (AnonymousClass5IJ A05 : A032) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(',');
                }
                C90744ej.A05(stringBuffer, r52.A01, A05);
            }
        }
        return stringBuffer.toString();
    }

    public C32071fb A02(String str, C32041fY r8) {
        C32041fY r0;
        int length = str.length();
        if (length != 0) {
            if (str.charAt(0) == '#') {
                try {
                    int i2 = (length - 1) >> 1;
                    byte[] bArr = new byte[i2];
                    for (int i3 = 0; i3 != i2; i3++) {
                        int i4 = (i3 << 1) + 1;
                        char charAt = str.charAt(i4);
                        char charAt2 = str.charAt(i4 + 1);
                        AnonymousClass3K4.A0i(C90744ej.A00(charAt2), bArr, C90744ej.A00(charAt) << 4, i3);
                    }
                    return C32051fZ.A02(bArr);
                } catch (IOException unused) {
                    throw new AnonymousClass44B(AnonymousClass000.A0h(r8.A01, AnonymousClass000.A0r("can't recode value for oid ")));
                }
            } else if (str.charAt(0) == '\\') {
                str = str.substring(1);
            }
        }
        if (this instanceof AnonymousClass5J6) {
            if (!r8.A04(AnonymousClass5J6.A07)) {
                if (!r8.A04(AnonymousClass5J6.A05) && !r8.A04(AnonymousClass5J6.A0Y) && !r8.A04(AnonymousClass5J6.A0B)) {
                    r0 = AnonymousClass5J6.A0c;
                }
                return new C107485Ij(str);
            }
            return new C33021ho(str);
        }
        if (!r8.A04(AnonymousClass5J5.A0F) && !r8.A04(AnonymousClass5J5.A0A)) {
            if (r8.A04(AnonymousClass5J5.A09)) {
                return new C107395Ia(str);
            }
            if (!r8.A04(AnonymousClass5J5.A05) && !r8.A04(AnonymousClass5J5.A0W) && !r8.A04(AnonymousClass5J5.A0D)) {
                r0 = AnonymousClass5J5.A0b;
            }
            return new C107485Ij(str);
        }
        return new C33021ho(str);
        if (!r8.A04(r0)) {
            return new C107495Ik(str);
        }
        return new C107485Ij(str);
    }

    public C32041fY A03(String str) {
        return C90744ej.A03(str, this instanceof AnonymousClass5J6 ? ((AnonymousClass5J6) this).A00 : ((AnonymousClass5J5) this).A00);
    }
}
