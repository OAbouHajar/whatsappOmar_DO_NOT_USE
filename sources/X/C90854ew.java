package X;

import java.lang.reflect.Method;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4ew  reason: invalid class name and case insensitive filesystem */
public final class C90854ew {
    public static final C90854ew A04 = new C90854ew("VZCBSIFJD", 1, 1, 2);
    public static final C90854ew A05 = new C90854ew("VZCBSIFJD", 3, 3, 4);
    public static final C90854ew A06 = new C90854ew("VZCBSIFJD", 2, 2, 3);
    public static final C90854ew A07 = new C90854ew("VZCBSIFJD", 8, 8, 9);
    public static final C90854ew A08 = new C90854ew("VZCBSIFJD", 6, 6, 7);
    public static final C90854ew A09 = new C90854ew("VZCBSIFJD", 5, 5, 6);
    public static final C90854ew A0A = new C90854ew("VZCBSIFJD", 7, 7, 8);
    public static final C90854ew A0B = new C90854ew("VZCBSIFJD", 4, 4, 5);
    public static final C90854ew A0C = new C90854ew("VZCBSIFJD", 0, 0, 1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public C90854ew(String str, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A03 = str;
        this.A01 = i3;
        this.A02 = i4;
    }

    public static int A00(String str) {
        int i2 = 1;
        char charAt = str.charAt(1);
        int i3 = 1;
        int i4 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i3++;
                i4 += 2;
            } else {
                while (str.charAt(i3) == '[') {
                    i3++;
                }
                int i5 = i3 + 1;
                if (str.charAt(i3) == 'L') {
                    i5 = Math.max(i5, str.indexOf(59, i5) + 1);
                }
                i4++;
                i3 = i5;
            }
            charAt = str.charAt(i3);
        }
        char charAt2 = str.charAt(i3 + 1);
        if (charAt2 == 'V') {
            return i4 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i2 = 2;
        }
        return (i4 << 2) | i2;
    }

    public static String A01(Method method) {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        for (Class A042 : method.getParameterTypes()) {
            A04(A042, A0r);
        }
        A0r.append(')');
        A04(method.getReturnType(), A0r);
        return A0r.toString();
    }

    public static C90854ew A02(Class cls) {
        if (!cls.isPrimitive()) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A04(cls, A0o);
            String obj = A0o.toString();
            return A03(obj, 0, obj.length());
        } else if (cls == Integer.TYPE) {
            return A09;
        } else {
            if (cls == Void.TYPE) {
                return A0C;
            }
            if (cls == Boolean.TYPE) {
                return A04;
            }
            if (cls == Byte.TYPE) {
                return A05;
            }
            if (cls == Character.TYPE) {
                return A06;
            }
            if (cls == Short.TYPE) {
                return A0B;
            }
            if (cls == Double.TYPE) {
                return A07;
            }
            if (cls == Float.TYPE) {
                return A08;
            }
            if (cls == Long.TYPE) {
                return A0A;
            }
            throw new AssertionError();
        }
    }

    public static C90854ew A03(String str, int i2, int i3) {
        char charAt = str.charAt(i2);
        int i4 = 11;
        if (charAt != '(') {
            if (charAt == 'F') {
                return A08;
            }
            if (charAt == 'L') {
                i4 = 10;
                i2++;
                i3--;
            } else if (charAt == 'S') {
                return A0B;
            } else {
                if (charAt == 'V') {
                    return A0C;
                }
                if (charAt == 'I') {
                    return A09;
                }
                if (charAt == 'J') {
                    return A0A;
                }
                if (charAt == 'Z') {
                    return A04;
                }
                if (charAt != '[') {
                    switch (charAt) {
                        case 'B':
                            return A05;
                        case 'C':
                            return A06;
                        case 'D':
                            return A07;
                        default:
                            throw AnonymousClass3K3.A0f();
                    }
                } else {
                    i4 = 9;
                }
            }
        }
        return new C90854ew(str, i4, i2, i3);
    }

    public static void A04(Class<?> cls, StringBuilder sb) {
        char c2;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(cls.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX));
            c2 = ';';
        } else if (cls == Integer.TYPE) {
            c2 = 'I';
        } else if (cls == Void.TYPE) {
            c2 = 'V';
        } else if (cls == Boolean.TYPE) {
            c2 = 'Z';
        } else if (cls == Byte.TYPE) {
            c2 = 'B';
        } else if (cls == Character.TYPE) {
            c2 = 'C';
        } else if (cls == Short.TYPE) {
            c2 = 'S';
        } else if (cls == Double.TYPE) {
            c2 = 'D';
        } else if (cls == Float.TYPE) {
            c2 = 'F';
        } else if (cls == Long.TYPE) {
            c2 = 'J';
        } else {
            throw new AssertionError();
        }
        sb.append(c2);
    }

    public static C90854ew[] A05(String str) {
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (str.charAt(i3) != ')') {
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i5 = i3 + 1;
            i3 = str.charAt(i3) == 'L' ? Math.max(i5, str.indexOf(59, i5) + 1) : i5;
            i4++;
        }
        C90854ew[] r4 = new C90854ew[i4];
        int i6 = 1;
        while (str.charAt(i6) != ')') {
            int i7 = i6;
            while (str.charAt(i7) == '[') {
                i7++;
            }
            int i8 = i7 + 1;
            if (str.charAt(i7) == 'L') {
                i8 = Math.max(i8, str.indexOf(59, i8) + 1);
            }
            r4[i2] = A03(str, i6, i8);
            i2++;
            i6 = i8;
        }
        return r4;
    }

    public String A06() {
        String str;
        int i2;
        int i3;
        int i4 = this.A00;
        if (i4 == 10) {
            str = this.A03;
            i2 = this.A01 - 1;
            i3 = this.A02 + 1;
        } else if (i4 == 12) {
            StringBuilder A0r = AnonymousClass000.A0r("L");
            AnonymousClass3K3.A1M(this.A03, A0r, this.A01, this.A02);
            return AnonymousClass3K3.A0p(A0r, ';');
        } else {
            str = this.A03;
            i2 = this.A01;
            i3 = this.A02;
        }
        return str.substring(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90854ew) {
                C90854ew r8 = (C90854ew) obj;
                int i2 = this.A00;
                int i3 = 10;
                if (i2 == 12) {
                    i2 = 10;
                }
                int i4 = r8.A00;
                if (i4 != 12) {
                    i3 = i4;
                }
                if (i2 == i3) {
                    int i5 = this.A01;
                    int i6 = this.A02;
                    int i7 = r8.A01;
                    if (i6 - i5 == r8.A02 - i7) {
                        while (i5 < i6) {
                            if (this.A03.charAt(i5) == r8.A03.charAt(i7)) {
                                i5++;
                                i7++;
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
        int i2 = this.A00;
        int i3 = i2;
        if (i2 == 12) {
            i3 = 10;
        }
        int i4 = i3 * 13;
        if (i2 >= 9) {
            int i5 = this.A02;
            for (int i6 = this.A01; i6 < i5; i6++) {
                i4 = (i4 + this.A03.charAt(i6)) * 17;
            }
        }
        return i4;
    }

    public String toString() {
        return A06();
    }
}
