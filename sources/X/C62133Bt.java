package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Bt  reason: invalid class name and case insensitive filesystem */
public class C62133Bt {
    public Set A00 = C13680ns.A0o();
    public Set A01 = C13680ns.A0o();
    public Set A02 = C13680ns.A0o();
    public Set A03 = C13680ns.A0o();
    public Set A04 = C13680ns.A0o();
    public Set A05 = C13680ns.A0o();
    public Set A06;
    public Set A07;
    public Set A08;
    public Set A09;
    public Set A0A;
    public Set A0B;

    public static final int A00(Collection collection) {
        int i2 = 0;
        if (collection != null) {
            for (Object next : collection) {
                i2 += next instanceof byte[] ? C33111hx.A00((byte[]) next) : next.hashCode();
            }
        }
        return i2;
    }

    public static final String A01(Set set) {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        for (Object A002 : set) {
            if (A0r.length() > 1) {
                A0r.append(",");
            }
            C107355Hw A003 = C107355Hw.A00(A002);
            A0r.append(A003.A01.A01);
            A0r.append(":");
            try {
                A0r.append(C90584eP.A00(A003.A00.Agm().A01()));
            } catch (IOException e2) {
                AnonymousClass000.A1I(e2, A0r);
            }
        }
        return AnonymousClass000.A0h("]", A0r);
    }

    public static final void A02(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(C32941ha.A00);
    }

    public static final boolean A03(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] A052 = C32941ha.A05(str2);
        String[] A053 = C32941ha.A05(str);
        int length = A053.length;
        int length2 = A052.length;
        if (length > length2) {
            int i2 = length - length2;
            int i3 = -1;
            while (!A053[i2 - 1].equals("")) {
                while (true) {
                    i3++;
                    if (i3 >= length2) {
                        return true;
                    }
                    if (i3 != -1) {
                        if (!A052[i3].equalsIgnoreCase(A053[i3 + i2])) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean A04(C32411gJ r8, C32411gJ r9) {
        if (r9.A0A() >= 1 && r9.A0A() <= r8.A0A()) {
            AnonymousClass5IJ A002 = AnonymousClass5IJ.A00(r9.A0C(0));
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < r8.A0A()) {
                    if (C90744ej.A06(A002, AnonymousClass5IJ.A00(r8.A0C(i2)))) {
                        break;
                    }
                    i3 = i2;
                    i2++;
                } else {
                    i2 = i3;
                    break;
                }
            }
            if (r9.A0A() <= r8.A0A() - i2) {
                int i4 = 0;
                while (i4 < r9.A0A()) {
                    AnonymousClass5IJ A003 = AnonymousClass5IJ.A00(r9.A0C(i4));
                    AnonymousClass5IJ A004 = AnonymousClass5IJ.A00(r8.A0C(i2 + i4));
                    if (A003.A00.A01.length == A004.A00.A01.length && A003.A03().A01.A04(A004.A03().A01)) {
                        if ((A003.A00.A01.length != 1 || !A003.A03().A01.A04(AnonymousClass5J6.A0Y)) ? C90744ej.A06(A003, A004) : A004.A03().A00.toString().startsWith(A003.A03().A00.toString())) {
                            i4++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A05(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != (bArr2.length >> 1)) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr4[i2] = (byte) (bArr2[i2] & bArr3[i2]);
            bArr5[i2] = (byte) (bArr[i2] & bArr3[i2]);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public final String A06(Set set) {
        int length;
        int i2;
        StringBuilder A0r = AnonymousClass000.A0r("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (A0r.length() > 1) {
                A0r.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder A0o = AnonymousClass000.A0o();
            int i3 = 0;
            while (true) {
                length = bArr.length;
                i2 = length >> 1;
                if (i3 >= i2) {
                    break;
                }
                if (A0o.length() > 0) {
                    A0o.append(".");
                }
                A0o.append(Integer.toString(bArr[i3] & 255));
                i3++;
            }
            A0o.append("/");
            boolean z2 = true;
            while (i2 < length) {
                if (z2) {
                    z2 = false;
                } else {
                    A0o.append(".");
                }
                A0o.append(Integer.toString(bArr[i2] & 255));
                i2++;
            }
            AnonymousClass000.A1I(A0o, A0r);
        }
        return AnonymousClass000.A0h("]", A0r);
    }

    public void A07(AnonymousClass5IQ r4) {
        Set<C32411gJ> set = this.A00;
        C32411gJ A002 = C32411gJ.A00(r4);
        if (!set.isEmpty()) {
            for (C32411gJ A042 : set) {
                if (A04(A002, A042)) {
                    throw new AnonymousClass43V("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    public void A08(AnonymousClass5IQ r4) {
        Set<C32411gJ> set = this.A06;
        C32411gJ A002 = C32411gJ.A00(r4.A01);
        if (set == null) {
            return;
        }
        if (!set.isEmpty() || A002.A0A() != 0) {
            for (C32411gJ A042 : set) {
                if (A04(A002, A042)) {
                    return;
                }
            }
            throw new AnonymousClass43V("Subject distinguished name is not from a permitted subtree");
        }
    }

    public final boolean A09(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (A03(substring, str2)) {
            return true;
        }
        return false;
    }

    public final boolean A0A(String str, String str2) {
        String substring = str.substring(str.indexOf(58) + 1);
        int indexOf = substring.indexOf("//");
        if (indexOf != -1) {
            substring = substring.substring(indexOf + 2);
        }
        int lastIndexOf = substring.lastIndexOf(58);
        if (lastIndexOf != -1) {
            substring = substring.substring(0, lastIndexOf);
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        int indexOf2 = substring3.indexOf(47);
        if (indexOf2 != -1) {
            substring3 = substring3.substring(0, indexOf2);
        }
        return !str2.startsWith(".") ? substring3.equalsIgnoreCase(str2) : A03(substring3, str2);
    }

    public final boolean A0B(Collection collection, Collection collection2) {
        if (collection != collection2) {
            if (!(collection == null || collection2 == null || collection.size() != collection2.size())) {
                for (Object next : collection) {
                    for (Object next2 : collection2) {
                        if (next != next2) {
                            if (!(next == null || next2 == null)) {
                                if ((!(next instanceof byte[]) || !(next2 instanceof byte[])) ? next.equals(next2) : Arrays.equals((byte[]) next, (byte[]) next2)) {
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

    public boolean equals(Object obj) {
        if (!(obj instanceof C62133Bt)) {
            return false;
        }
        C62133Bt r4 = (C62133Bt) obj;
        return A0B(r4.A00, this.A00) && A0B(r4.A01, this.A01) && A0B(r4.A02, this.A02) && A0B(r4.A03, this.A03) && A0B(r4.A05, this.A05) && A0B(r4.A04, this.A04) && A0B(r4.A06, this.A06) && A0B(r4.A07, this.A07) && A0B(r4.A08, this.A08) && A0B(r4.A09, this.A09) && A0B(r4.A0B, this.A0B) && A0B(r4.A0A, this.A0A);
    }

    public int hashCode() {
        return A00(this.A00) + A00(this.A01) + A00(this.A02) + A00(this.A03) + A00(this.A05) + A00(this.A04) + A00(this.A06) + A00(this.A07) + A00(this.A08) + A00(this.A09) + A00(this.A0B) + A00(this.A0A);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A02(A0o, "permitted:");
        Set set = this.A06;
        if (set != null) {
            A02(A0o, "DN:");
            A02(A0o, set.toString());
        }
        Set set2 = this.A07;
        if (set2 != null) {
            A02(A0o, "DNS:");
            A02(A0o, set2.toString());
        }
        Set set3 = this.A08;
        if (set3 != null) {
            A02(A0o, "Email:");
            A02(A0o, set3.toString());
        }
        Set set4 = this.A0B;
        if (set4 != null) {
            A02(A0o, "URI:");
            A02(A0o, set4.toString());
        }
        Set set5 = this.A09;
        if (set5 != null) {
            A02(A0o, "IP:");
            A02(A0o, A06(set5));
        }
        Set set6 = this.A0A;
        if (set6 != null) {
            A02(A0o, "OtherName:");
            A02(A0o, A01(set6));
        }
        A02(A0o, "excluded:");
        if (!this.A00.isEmpty()) {
            A02(A0o, "DN:");
            A02(A0o, this.A00.toString());
        }
        if (!this.A01.isEmpty()) {
            A02(A0o, "DNS:");
            A02(A0o, this.A01.toString());
        }
        if (!this.A02.isEmpty()) {
            A02(A0o, "Email:");
            A02(A0o, this.A02.toString());
        }
        if (!this.A05.isEmpty()) {
            A02(A0o, "URI:");
            A02(A0o, this.A05.toString());
        }
        if (!this.A03.isEmpty()) {
            A02(A0o, "IP:");
            A02(A0o, A06(this.A03));
        }
        if (!this.A04.isEmpty()) {
            A02(A0o, "OtherName:");
            A02(A0o, A01(this.A04));
        }
        return A0o.toString();
    }
}
