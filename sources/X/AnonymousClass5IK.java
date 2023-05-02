package X;

import com.mod2.fblibs.FacebookFacade;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.io.IOUtils;

/* renamed from: X.5IK  reason: invalid class name */
public class AnonymousClass5IK extends C32061fa {
    public static final Boolean A06 = new Boolean(false);
    public static final Boolean A07 = new Boolean(true);
    public static final Hashtable A08;
    public static final Hashtable A09;
    public static final Hashtable A0A;
    public static final Hashtable A0B;
    public static final Hashtable A0C;
    public static final Hashtable A0D;
    public static final C32041fY A0E;
    public static final C32041fY A0F;
    public static final C32041fY A0G;
    public static final C32041fY A0H;
    public static final C32041fY A0I;
    public static final C32041fY A0J;
    public static final C32041fY A0K;
    public static final C32041fY A0L = AnonymousClass3K3.A0w("2.5.4.54");
    public static final C32041fY A0M;
    public static final C32041fY A0N;
    public static final C32041fY A0O;
    public static final C32041fY A0P;
    public static final C32041fY A0Q;
    public static final C32041fY A0R;
    public static final C32041fY A0S;
    public static final C32041fY A0T;
    public static final C32041fY A0U;
    public static final C32041fY A0V;
    public static final C32041fY A0W;
    public static final C32041fY A0X;
    public static final C32041fY A0Y;
    public static final C32041fY A0Z;
    public static final C32041fY A0a;
    public static final C32041fY A0b;
    public static final C32041fY A0c;
    public static final C32041fY A0d;
    public static final C32041fY A0e;
    public static final C32041fY A0f;
    public static final C32041fY A0g;
    public static final C32041fY A0h;
    public static final C32041fY A0i;
    public static final C32041fY A0j;
    public static final C32041fY A0k;
    public static final C32041fY A0l;
    public static final C32041fY A0m;
    public int A00;
    public Vector A01 = new Vector();
    public Vector A02 = new Vector();
    public Vector A03 = new Vector();
    public C32411gJ A04;
    public boolean A05;

    static {
        C32041fY A0w = AnonymousClass3K3.A0w("2.5.4.6");
        A0F = A0w;
        C32041fY A0w2 = AnonymousClass3K3.A0w("2.5.4.10");
        A0W = A0w2;
        C32041fY A0w3 = AnonymousClass3K3.A0w("2.5.4.11");
        A0X = A0w3;
        C32041fY A0w4 = AnonymousClass3K3.A0w("2.5.4.12");
        A0h = A0w4;
        C32041fY A0w5 = AnonymousClass3K3.A0w("2.5.4.3");
        A0G = A0w5;
        C32041fY A0w6 = AnonymousClass3K3.A0w("2.5.4.5");
        A0d = A0w6;
        C32041fY A0w7 = AnonymousClass3K3.A0w("2.5.4.9");
        A0f = A0w7;
        A0c = A0w6;
        C32041fY A0w8 = AnonymousClass3K3.A0w("2.5.4.7");
        A0T = A0w8;
        C32041fY A0w9 = AnonymousClass3K3.A0w("2.5.4.8");
        A0e = A0w9;
        C32041fY A0w10 = AnonymousClass3K3.A0w("2.5.4.4");
        A0g = A0w10;
        C32041fY A0w11 = AnonymousClass3K3.A0w("2.5.4.42");
        A0R = A0w11;
        C32041fY A0w12 = AnonymousClass3K3.A0w("2.5.4.43");
        A0S = A0w12;
        C32041fY A0w13 = AnonymousClass3K3.A0w("2.5.4.44");
        A0Q = A0w13;
        C32041fY A0w14 = AnonymousClass3K3.A0w("2.5.4.45");
        A0k = A0w14;
        C32041fY A0w15 = AnonymousClass3K3.A0w("2.5.4.15");
        A0E = A0w15;
        C32041fY A0w16 = AnonymousClass3K3.A0w("2.5.4.17");
        A0a = A0w16;
        C32041fY A0w17 = AnonymousClass3K3.A0w("2.5.4.46");
        A0M = A0w17;
        C32041fY A0w18 = AnonymousClass3K3.A0w("2.5.4.65");
        A0b = A0w18;
        C32041fY A0w19 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.9.1");
        A0J = A0w19;
        C32041fY A0w20 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.9.2");
        A0Y = A0w20;
        C32041fY A0w21 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.9.3");
        A0P = A0w21;
        C32041fY A0w22 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.9.4");
        A0H = A0w22;
        C32041fY A0w23 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.9.5");
        A0I = A0w23;
        C32041fY A0w24 = AnonymousClass3K3.A0w("1.3.36.8.3.14");
        A0V = A0w24;
        C32041fY A0w25 = AnonymousClass3K3.A0w("2.5.4.16");
        A0Z = A0w25;
        C32041fY r29 = C109685Te.A09;
        A0i = r29;
        C32041fY r28 = C109685Te.A07;
        A0U = r28;
        C32041fY r4 = C32031fX.A1u;
        A0O = r4;
        C32041fY r27 = C32031fX.A24;
        A0m = r27;
        C32041fY r26 = C32031fX.A23;
        A0l = r26;
        A0N = r4;
        C32041fY A0w26 = AnonymousClass3K3.A0w("0.9.2342.19200300.100.1.25");
        A0K = A0w26;
        C32041fY A0w27 = AnonymousClass3K3.A0w("0.9.2342.19200300.100.1.1");
        A0j = A0w27;
        Hashtable hashtable = new Hashtable();
        A09 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        A0C = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        A0B = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        A08 = hashtable4;
        A0A = hashtable;
        A0D = hashtable4;
        hashtable.put(A0w, "C");
        hashtable.put(A0w2, "O");
        hashtable.put(A0w4, "T");
        hashtable.put(A0w3, "OU");
        hashtable.put(A0w5, "CN");
        hashtable.put(A0w8, "L");
        hashtable.put(A0w9, "ST");
        hashtable.put(A0w6, "SERIALNUMBER");
        hashtable.put(r4, "E");
        hashtable.put(A0w26, "DC");
        hashtable.put(A0w27, "UID");
        hashtable.put(A0w7, "STREET");
        hashtable.put(A0w10, "SURNAME");
        hashtable.put(A0w11, "GIVENNAME");
        hashtable.put(A0w12, "INITIALS");
        hashtable.put(A0w13, "GENERATION");
        hashtable.put(r26, "unstructuredAddress");
        hashtable.put(r27, "unstructuredName");
        hashtable.put(A0w14, "UniqueIdentifier");
        hashtable.put(A0w17, "DN");
        hashtable.put(A0w18, "Pseudonym");
        hashtable.put(A0w25, "PostalAddress");
        hashtable.put(A0w24, "NameAtBirth");
        hashtable.put(A0w22, "CountryOfCitizenship");
        hashtable.put(A0w23, "CountryOfResidence");
        hashtable.put(A0w21, "Gender");
        hashtable.put(A0w20, "PlaceOfBirth");
        hashtable.put(A0w19, "DateOfBirth");
        hashtable.put(A0w16, "PostalCode");
        hashtable.put(A0w15, "BusinessCategory");
        hashtable.put(r29, "TelephoneNumber");
        hashtable.put(r28, "Name");
        hashtable2.put(A0w, "C");
        hashtable2.put(A0w2, "O");
        hashtable2.put(A0w3, "OU");
        hashtable2.put(A0w5, "CN");
        hashtable2.put(A0w8, "L");
        hashtable2.put(A0w9, "ST");
        hashtable2.put(A0w7, "STREET");
        C32041fY r14 = A0w26;
        hashtable2.put(r14, "DC");
        hashtable2.put(A0w27, "UID");
        hashtable3.put(A0w, "C");
        hashtable3.put(A0w2, "O");
        hashtable3.put(A0w3, "OU");
        hashtable3.put(A0w5, "CN");
        hashtable3.put(A0w8, "L");
        hashtable3.put(A0w9, "ST");
        hashtable3.put(A0w7, "STREET");
        hashtable4.put("c", A0w);
        hashtable4.put("o", A0w2);
        hashtable4.put("t", A0w4);
        hashtable4.put("ou", A0w3);
        hashtable4.put("cn", A0w5);
        hashtable4.put("l", A0w8);
        hashtable4.put("st", A0w9);
        hashtable4.put("sn", A0w6);
        hashtable4.put("serialnumber", A0w6);
        hashtable4.put("street", A0w7);
        hashtable4.put("emailaddress", r4);
        hashtable4.put("dc", r14);
        hashtable4.put("e", r4);
        hashtable4.put("uid", A0w27);
        hashtable4.put("surname", A0w10);
        hashtable4.put("givenname", A0w11);
        hashtable4.put("initials", A0w12);
        hashtable4.put("generation", A0w13);
        hashtable4.put("unstructuredaddress", r26);
        hashtable4.put("unstructuredname", r27);
        hashtable4.put("uniqueidentifier", A0w14);
        hashtable4.put("dn", A0w17);
        hashtable4.put("pseudonym", A0w18);
        hashtable4.put("postaladdress", A0w25);
        hashtable4.put("nameofbirth", A0w24);
        hashtable4.put("countryofcitizenship", A0w22);
        hashtable4.put("countryofresidence", A0w23);
        hashtable4.put("gender", A0w21);
        hashtable4.put("placeofbirth", A0w20);
        hashtable4.put("dateofbirth", A0w19);
        hashtable4.put("postalcode", A0w16);
        hashtable4.put("businesscategory", A0w15);
        hashtable4.put("telephonenumber", r29);
        hashtable4.put(FacebookFacade.RequestParameter.NAME, r28);
    }

    public AnonymousClass5IK() {
    }

    public AnonymousClass5IK(C32411gJ r12) {
        Vector vector;
        this.A04 = r12;
        Enumeration A0B2 = r12.A0B();
        while (A0B2.hasMoreElements()) {
            C107595Iu A002 = C107595Iu.A00(((C32071fb) A0B2.nextElement()).Agm());
            int i2 = 0;
            while (true) {
                C32071fb[] r1 = A002.A01;
                if (i2 < r1.length) {
                    C32411gJ A003 = C32411gJ.A00(r1[i2].Agm());
                    if (A003.A0A() == 2) {
                        this.A02.addElement(C32041fY.A00(A003.A0C(0)));
                        C32071fb A0h2 = AnonymousClass3K4.A0h(A003);
                        if (!(A0h2 instanceof C33031hp) || (A0h2 instanceof C107505Il)) {
                            try {
                                Vector vector2 = this.A03;
                                StringBuilder A0o = AnonymousClass000.A0o();
                                A0o.append("#");
                                byte[] A1E = AnonymousClass3K4.A1E(A0h2);
                                byte[] A032 = C90584eP.A03(A1E, 0, A1E.length);
                                int length = A032.length;
                                char[] cArr = new char[length];
                                for (int i3 = 0; i3 != length; i3++) {
                                    cArr[i3] = (char) (A032[i3] & 255);
                                }
                                vector2.addElement(AnonymousClass000.A0h(new String(cArr), A0o));
                            } catch (IOException unused) {
                                throw AnonymousClass000.A0T("cannot encode value");
                            }
                        } else {
                            String AGJ = ((C33031hp) A0h2).AGJ();
                            if (AGJ.length() <= 0 || AGJ.charAt(0) != '#') {
                                vector = this.A03;
                            } else {
                                vector = this.A03;
                                AGJ = AnonymousClass000.A0h(AGJ, AnonymousClass000.A0r("\\"));
                            }
                            vector.addElement(AGJ);
                        }
                        this.A01.addElement(i2 != 0 ? A07 : A06);
                        i2++;
                    } else {
                        throw AnonymousClass000.A0T("badly sized pair");
                    }
                }
            }
        }
    }

    public static final String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i2 = 1;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i2++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static final void A01(String str, StringBuffer stringBuffer, Hashtable hashtable, C32041fY r9) {
        int i2;
        String str2 = (String) hashtable.get(r9);
        if (str2 == null) {
            str2 = r9.A01;
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i2 < length2 && stringBuffer.charAt(i2) == ' ') {
            stringBuffer.insert(i2, "\\");
            length = i2 + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i2 && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, IOUtils.DIR_SEPARATOR_WINDOWS);
            }
        }
        while (i2 <= length2) {
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
            length2++;
        }
    }

    public final String A03(String str) {
        String A002 = C32941ha.A00(str.trim());
        int length = A002.length();
        if (length <= 0 || A002.charAt(0) != '#') {
            return A002;
        }
        try {
            C32051fZ A022 = C32051fZ.A02(C90584eP.A02(A002, length - 1));
            return A022 instanceof C33031hp ? C32941ha.A00(((C33031hp) A022).AGJ().trim()) : A002;
        } catch (IOException e2) {
            throw AnonymousClass000.A0V(AnonymousClass000.A0g("unknown encoding in name: ", e2));
        }
    }

    public C32051fZ Agm() {
        C32411gJ r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C32391gH r4 = new C32391gH();
        C32391gH r1 = new C32391gH();
        Vector vector = this.A02;
        if (0 != vector.size()) {
            AnonymousClass3K3.A0v().A02((C32061fa) vector.elementAt(0));
            this.A03.elementAt(0);
            throw AnonymousClass000.A0W("getConvertedValue");
        }
        C32401gI A0x = AnonymousClass3K3.A0x(new C107585It(r1), r4);
        this.A04 = A0x;
        return A0x;
    }

    public boolean equals(Object obj) {
        AnonymousClass5IK r13;
        Object obj2 = obj;
        if (obj2 != this) {
            boolean z2 = obj2 instanceof AnonymousClass5IK;
            if (z2 || (obj2 instanceof C32411gJ)) {
                if (!Agm().A04(((C32071fb) obj2).Agm())) {
                    if (z2) {
                        try {
                            r13 = (AnonymousClass5IK) obj2;
                        } catch (IllegalArgumentException unused) {
                            return false;
                        }
                    } else {
                        if (obj2 instanceof AnonymousClass5IQ) {
                            obj2 = ((AnonymousClass5IQ) obj2).A01;
                        } else if (obj == null) {
                            r13 = null;
                        }
                        r13 = new AnonymousClass5IK(C32411gJ.A00(obj2));
                    }
                    Vector vector = this.A02;
                    int size = vector.size();
                    Vector vector2 = r13.A02;
                    if (size == vector2.size()) {
                        boolean[] zArr = new boolean[size];
                        int i2 = -1;
                        int i3 = size - 1;
                        int i4 = -1;
                        if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                            i2 = size;
                            i3 = 0;
                            i4 = 1;
                        }
                        while (i3 != i2) {
                            C32051fZ r4 = (C32051fZ) vector.elementAt(i3);
                            String str = (String) this.A03.elementAt(i3);
                            for (int i5 = 0; i5 < size; i5++) {
                                if (!zArr[i5] && r4.A04((C32051fZ) vector2.elementAt(i5))) {
                                    String A032 = A03(str);
                                    String A033 = A03((String) r13.A03.elementAt(i5));
                                    if (A032.equals(A033) || A00(A032).equals(A00(A033))) {
                                        zArr[i5] = true;
                                        i3 += i4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (!this.A05) {
            this.A05 = true;
            int i2 = 0;
            while (true) {
                Vector vector = this.A02;
                if (i2 == vector.size()) {
                    break;
                }
                String A002 = A00(A03((String) this.A03.elementAt(i2)));
                int hashCode = this.A00 ^ vector.elementAt(i2).hashCode();
                this.A00 = hashCode;
                this.A00 = A002.hashCode() ^ hashCode;
                i2++;
            }
        }
        return this.A00;
    }

    public String toString() {
        Hashtable hashtable = A09;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i2 = 0;
        while (true) {
            Vector vector2 = this.A02;
            if (i2 >= vector2.size()) {
                break;
            }
            if (AnonymousClass000.A1X(this.A01.elementAt(i2))) {
                stringBuffer2.append('+');
                A01((String) this.A03.elementAt(i2), stringBuffer2, hashtable, (C32041fY) vector2.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                A01((String) this.A03.elementAt(i2), stringBuffer2, hashtable, (C32041fY) vector2.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
            i2++;
        }
        boolean z2 = true;
        for (int i3 = 0; i3 < vector.size(); i3++) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i3).toString());
        }
        return stringBuffer.toString();
    }
}
