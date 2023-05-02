package X;

import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.4dr  reason: invalid class name and case insensitive filesystem */
public final class C90264dr {
    public static String A00(Iterable iterable, String str, String str2) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        while (true) {
            A0o.append(str2);
            A0o.append(it.next());
            A0o.append(str2);
            if (!it.hasNext()) {
                return A0o.toString();
            }
            A0o.append(str);
        }
    }

    public static String A01(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringWriter stringWriter = new StringWriter(length);
        StringBuilder A0g = C13690nt.A0g(4);
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (z3) {
                A0g.append(charAt);
                if (A0g.length() == 4) {
                    try {
                        stringWriter.write((char) Integer.parseInt(A0g.toString(), 16));
                        A0g.setLength(0);
                        z2 = false;
                        z3 = false;
                    } catch (NumberFormatException e2) {
                        throw new AnonymousClass5Ar(AnonymousClass000.A0g("Unable to parse unicode value: ", A0g), e2);
                    }
                }
            } else if (z2) {
                int i3 = 34;
                if (charAt != '\"') {
                    i3 = 39;
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            i3 = 8;
                            if (charAt != 'b') {
                                i3 = 12;
                                if (charAt != 'f') {
                                    i3 = 10;
                                    if (charAt != 'n') {
                                        i3 = 13;
                                        if (charAt != 'r') {
                                            i3 = 9;
                                            if (charAt != 't') {
                                                if (charAt != 'u') {
                                                    stringWriter.write(charAt);
                                                } else {
                                                    z2 = false;
                                                    z3 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            stringWriter.write(92);
                        }
                        z2 = false;
                    }
                }
                stringWriter.write(i3);
                z2 = false;
            } else if (charAt == '\\') {
                z2 = true;
            } else {
                stringWriter.write(charAt);
            }
        }
        if (z2) {
            stringWriter.write(92);
        }
        return stringWriter.toString();
    }

    public static String A02(CharSequence... charSequenceArr) {
        CharSequence charSequence;
        int length = charSequenceArr.length;
        if (length != 0) {
            int i2 = 0;
            if (length == 1) {
                charSequence = charSequenceArr[0];
            } else {
                int i3 = 0;
                int i4 = 0;
                int i5 = -1;
                do {
                    int length2 = charSequenceArr[i3].length();
                    i4 += length2;
                    if (i5 != -2 && length2 > 0) {
                        int i6 = i5;
                        i5 = -2;
                        if (i6 == -1) {
                            i5 = i3;
                        }
                    }
                    i3++;
                } while (i3 < length);
                if (i4 != 0) {
                    if (i5 > 0) {
                        charSequence = charSequenceArr[i5];
                    } else {
                        StringBuilder A0g = C13690nt.A0g(i4);
                        do {
                            A0g.append(charSequenceArr[i2]);
                            i2++;
                        } while (i2 < length);
                        return A0g.toString();
                    }
                }
            }
            return charSequence.toString();
        }
        return "";
    }

    public static void A03(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass000.A0T(str);
        }
    }
}
