package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4f6  reason: invalid class name and case insensitive filesystem */
public class C90934f6 {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = C89554cQ.A00(1.0d);
    public static final Object A0B = "true";
    public static final Object A0C = C89554cQ.A00(0.0d);
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass4CP A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Object A06 = AnonymousClass000.A0x();
    public final Random A07 = new Random();

    public static double A00(C88914bI r0, int i2) {
        return A01(r0.A01(i2));
    }

    public static double A01(Object obj) {
        Number number;
        if (A0G(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj) ? 1.0d : 0.0d;
        }
        if (obj instanceof Long) {
            return (double) C13700nu.A01(obj);
        }
        return Double.NaN;
    }

    public static final int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (A0G(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        return obj instanceof C31411e8 ? 8 : 5;
    }

    public static C83454Gs A03(Object obj) {
        C83454Gs r0 = ((C31411e8) obj).A00.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0V("The Lispy expression has not been parsed");
    }

    public static Number A04(Object obj) {
        Number number;
        if (A0G(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            Object obj2 = AnonymousClass000.A1X(obj) ? A0A : A0C;
            if (A0G(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return C89554cQ.A00((double) C13700nu.A01(obj));
        } else {
            return null;
        }
    }

    public static Number A05(Object obj) {
        int A012;
        double d2;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            A012 = number.intValue();
        } else if (obj instanceof Boolean) {
            d2 = AnonymousClass000.A1X(obj) ? 1.0d : 0.0d;
            return C89554cQ.A00(d2);
        } else if (!A0G(obj)) {
            return null;
        } else {
            A012 = (int) ((long) AnonymousClass3K3.A01(obj));
        }
        d2 = (double) A012;
        return C89554cQ.A00(d2);
    }

    public static Number A06(Object obj) {
        long A012;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            A012 = AnonymousClass000.A1X(obj) ? 1 : 0;
        } else if (!A0G(obj)) {
            return null;
        } else {
            A012 = (long) AnonymousClass3K3.A01(obj);
        }
        return Long.valueOf(A012);
    }

    public static Object A07(C88914bI r0, Object obj, int i2, boolean z2) {
        C807445h.A00(obj, z2);
        return r0.A01(i2);
    }

    public static Object A08(C90934f6 r2) {
        return r2.A05[r2.A01 - 1];
    }

    public static void A09(C83454Gs r5, StringBuilder sb, int i2) {
        AnonymousClass4RT r3 = r5.A00;
        C90064dR r2 = r3.A03;
        ByteBuffer byteBuffer = r2.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i3 = r3.A02;
        duplicate.position(i3);
        duplicate.limit(r3.A00 + i3);
        if ((duplicate.get(i2) & 255) == 4) {
            sb.append("  at extension function ");
            sb.append((String) r2.A01(duplicate.getShort(i2 + 1) & 65535));
            sb.append(10);
        }
        sb.append("  at offset ");
        sb.append(i2 - r2.A04[2].A02);
        sb.append("  (offset ");
        sb.append(i2 - i3);
        sb.append(" in function ");
        sb.append((String) r2.A01(r3.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(r2.A00);
        sb.append('\"');
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static void A0A(String str) {
        throw new C105655Al(AnonymousClass000.A0h(str, AnonymousClass000.A0r("RangeError: ")));
    }

    public static void A0B(String str) {
        throw new C105655Al(AnonymousClass000.A0h(str, AnonymousClass000.A0r("TypeError: ")));
    }

    public static final void A0C(String str) {
        throw new AnonymousClass5Aq(AnonymousClass000.A0h(str, AnonymousClass000.A0r("InvalidBytecode: ")));
    }

    public static void A0D(String str, Object obj) {
        StringBuilder A0r = AnonymousClass000.A0r("TypeError: ");
        A0r.append(str);
        A0r.append(". Got ");
        throw new C105655Al(AnonymousClass000.A0h(obj == null ? "null" : AnonymousClass000.A0d(obj), A0r));
    }

    public static final void A0E(String str, Object obj, Object obj2) {
        StringBuilder A0r = AnonymousClass000.A0r("TypeError: ");
        A0r.append(str);
        A0r.append(". Got ");
        A0r.append(obj == null ? "null" : AnonymousClass000.A0d(obj));
        A0r.append(" and ");
        throw new C105655Al(AnonymousClass000.A0h(obj2 == null ? "null" : AnonymousClass000.A0d(obj2), A0r));
    }

    public static void A0F(String str, Throwable th) {
        throw new C105655Al(AnonymousClass000.A0h(str, AnonymousClass000.A0r("TypeError: ")), th);
    }

    public static boolean A0G(Object obj) {
        return (obj instanceof Number) && !(obj instanceof Long);
    }

    public static boolean A0H(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj);
        }
        if (!AnonymousClass000.A1W(obj)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (A0G(obj)) {
                double A012 = AnonymousClass3K3.A01(obj);
                return A012 != 0.0d && !Double.isNaN(A012);
            } else if (!(obj instanceof Long) || C13700nu.A01(obj) != 0) {
                return true;
            }
        }
    }

    public static boolean A0I(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 'x' || charAt < 9) {
                return true;
            }
            if (charAt > 13 && (charAt < ' ' || charAt > '~')) {
                return true;
            }
        }
        return false;
    }

    public int A0J(Object obj, String str, int i2) {
        int i3;
        int i4;
        if (obj instanceof Long) {
            long A012 = C13700nu.A01(obj);
            i3 = (int) A012;
            i4 = (((long) i3) > A012 ? 1 : (((long) i3) == A012 ? 0 : -1));
        } else {
            if (A0G(obj)) {
                double A013 = AnonymousClass3K3.A01(obj);
                i3 = (int) A013;
                i4 = (((double) i3) > A013 ? 1 : (((double) i3) == A013 ? 0 : -1));
            }
            A0B(str);
            throw AnonymousClass000.A0Z();
        }
        if (i4 == 0 && i3 >= 0 && i3 <= i2) {
            return i3;
        }
        A0B(str);
        throw AnonymousClass000.A0Z();
    }

    public Object A0K(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj) ? "true" : "false";
        }
        if (obj instanceof Long) {
            return Long.toString(C13700nu.A01(obj));
        }
        if (A0G(obj)) {
            double A012 = AnonymousClass3K3.A01(obj);
            int i2 = (int) A012;
            if (((double) i2) == A012) {
                return Integer.toString(i2);
            }
            String d2 = Double.toString(A012);
            int indexOf = d2.indexOf(69);
            if (indexOf < 0) {
                return d2;
            }
            int length = d2.length();
            int i3 = length + 1;
            char[] cArr = new char[i3];
            d2.getChars(0, indexOf, cArr, 0);
            cArr[indexOf] = 'e';
            int i4 = indexOf + 1;
            if (d2.charAt(i4) == '-') {
                d2.getChars(i4, length, cArr, i4);
            } else {
                cArr[i4] = '+';
                d2.getChars(i4, length, cArr, indexOf + 2);
                length = i3;
            }
            return new String(cArr, 0, length);
        } else if (obj instanceof String) {
            return obj;
        } else {
            A0D("Value cannot be converted to string", obj);
            throw AnonymousClass000.A0Z();
        }
    }

    public final Map A0L(Object obj, int i2) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        A0D(AnonymousClass000.A0h(AnonymousClass49C.A00[i2], AnonymousClass000.A0r("Expected stack value of map type for opcode ")), obj);
        throw AnonymousClass000.A0Z();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v266, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v267, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v268, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v269, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v270, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v271, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v272, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v273, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v274, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v275, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v281, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v282, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r1v90, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v92, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v93, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v99, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v106, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v109, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r1v111, types: [java.lang.Long] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0340, code lost:
        A0Q(r4, A0K(A08(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b9, code lost:
        r1 = X.AnonymousClass000.A0o();
        r1.append("Type assertion failed. Expected ");
        r1.append(r3);
        r1.append(", got ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03ca, code lost:
        if (r2 != null) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03cc, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03cf, code lost:
        r0 = X.AnonymousClass000.A0d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d3, code lost:
        A0B(X.AnonymousClass000.A0h(r0, r1));
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        if (r0 != false) goto L_0x12c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d4, code lost:
        if (r0 == false) goto L_0x12c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00de, code lost:
        r18.position(r1 + r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x058a, code lost:
        if (r2 == r0) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        A0O(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05f1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        r18.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0722, code lost:
        if (r1 == null) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0724, code lost:
        r0 = r1 instanceof java.lang.String;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0726, code lost:
        if (r0 != false) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0728, code lost:
        r0 = r1 instanceof java.lang.Number;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x072a, code lost:
        if (r0 != false) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x072c, code lost:
        r0 = r1 instanceof java.lang.Boolean;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x072e, code lost:
        if (r0 != false) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0730, code lost:
        r0 = r1 instanceof X.C31411e8;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0732, code lost:
        if (r0 != false) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0734, code lost:
        A0D("argument of immutable_clone cannot be a host ref", r1);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x074d, code lost:
        A0Q(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x077c, code lost:
        A0Q(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09d0, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a3c, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0b02, code lost:
        A0A("ArrayCopy dst index out of range");
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b0d, code lost:
        A0A("ArrayCopy src index out of range");
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b2b, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0bea, code lost:
        r0 = "StringSearch offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0bec, code lost:
        A0A(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c08, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0caa, code lost:
        r0 = "SubstringCompare offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0cac, code lost:
        A0A(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0cc8, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0d35, code lost:
        r0 = "Substring offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0d37, code lost:
        A0A(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0179, code lost:
        if (r1 == r3) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0e22, code lost:
        A0B(r0);
        r0 = X.AnonymousClass000.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0183, code lost:
        if (r3 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x0f16, code lost:
        if (r1 != null) goto L_0x0f19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x0f57, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x0f93, code lost:
        r6.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x12c0, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x1350, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:889:0x1351, code lost:
        r5 = new java.io.StringWriter();
        r6 = r5.append(r4.getMessage()).append(10);
        r7 = X.AnonymousClass000.A0r("mins stack trace:\n");
        r2 = r9.A00;
        A09(A03(r9.A05[r2 - 4]), r7, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x137b, code lost:
        r1 = r9.A04;
        r3 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x137f, code lost:
        if (r3 == 0) goto L_0x1381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x1381, code lost:
        r6.append(r7.toString());
        r1 = r4.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x138c, code lost:
        if (r1 != null) goto L_0x138e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x138e, code lost:
        r5.append("\n\nNative Stack Trace:\n");
        r1.printStackTrace(new java.io.PrintWriter(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x13a4, code lost:
        throw new X.AnonymousClass5Aq(r5.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:897:0x13a5, code lost:
        A09(A03(r9.A05[r3 - 4]), r7, r1[r2 - 1]);
        r2 = r3;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0156 A[Catch:{ 5Al -> 0x1350 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r26 = this;
            r0 = 4
            r9 = r26
            int r1 = r9.A00
            int r1 = r1 - r0
            java.lang.Object[] r0 = r9.A05
            r0 = r0[r1]
            X.4Gs r0 = A03(r0)
            X.4RT r2 = r0.A00
            X.4dR r0 = r2.A03
            r25 = r0
            java.nio.ByteBuffer r0 = r0.A01
            java.nio.ByteBuffer r18 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r18
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r18
            r0.limit(r1)
            int r1 = r18.position()
            byte r0 = r0.get(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8 = 2
            r7 = 1
            r4 = 0
            if (r0 != r8) goto L_0x13b8
            r19 = 0
            r17 = 0
        L_0x0043:
            int r17 = r18.position()     // Catch:{ 5Al -> 0x1350 }
            byte r0 = r18.get()     // Catch:{ 5Al -> 0x1350 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = "vector index out of range"
            java.lang.String r6 = "key not in map"
            r5 = 22
            r21 = 0
            java.lang.String r1 = "invalid get_by_val vector index"
            java.lang.String r3 = "modifying immutable container"
            r10 = 3
            switch(r2) {
                case 0: goto L_0x111b;
                case 1: goto L_0x103f;
                case 2: goto L_0x124a;
                case 3: goto L_0x1013;
                case 4: goto L_0x0f9d;
                case 5: goto L_0x08eb;
                case 6: goto L_0x08ac;
                case 7: goto L_0x0888;
                case 8: goto L_0x085c;
                case 9: goto L_0x0818;
                case 10: goto L_0x0781;
                case 11: goto L_0x12fc;
                case 12: goto L_0x12c9;
                case 13: goto L_0x1244;
                case 14: goto L_0x0076;
                case 15: goto L_0x0769;
                case 16: goto L_0x073f;
                case 17: goto L_0x06ff;
                case 18: goto L_0x10d8;
                case 19: goto L_0x0670;
                case 20: goto L_0x0617;
                case 21: goto L_0x05bb;
                case 22: goto L_0x05bb;
                case 23: goto L_0x058d;
                case 24: goto L_0x0567;
                case 25: goto L_0x0567;
                case 26: goto L_0x053f;
                case 27: goto L_0x050f;
                case 28: goto L_0x04e7;
                case 29: goto L_0x04e7;
                case 30: goto L_0x04ae;
                case 31: goto L_0x0448;
                case 32: goto L_0x0448;
                case 33: goto L_0x043f;
                case 34: goto L_0x10f5;
                case 35: goto L_0x041a;
                case 36: goto L_0x03f2;
                case 37: goto L_0x03e0;
                case 38: goto L_0x03a1;
                case 39: goto L_0x08e5;
                case 40: goto L_0x123e;
                case 41: goto L_0x1237;
                case 42: goto L_0x0394;
                case 43: goto L_0x0387;
                case 44: goto L_0x0379;
                case 45: goto L_0x036b;
                case 46: goto L_0x1159;
                case 47: goto L_0x0358;
                case 48: goto L_0x0326;
                case 49: goto L_0x0340;
                case 50: goto L_0x0311;
                case 51: goto L_0x02fc;
                case 52: goto L_0x02e7;
                case 53: goto L_0x02be;
                case 54: goto L_0x02ad;
                case 55: goto L_0x0297;
                case 56: goto L_0x0282;
                case 57: goto L_0x0253;
                case 58: goto L_0x0230;
                case 59: goto L_0x1230;
                case 60: goto L_0x1229;
                case 61: goto L_0x1222;
                case 62: goto L_0x121b;
                case 63: goto L_0x1213;
                case 64: goto L_0x0200;
                case 65: goto L_0x01d9;
                case 66: goto L_0x120b;
                case 67: goto L_0x1203;
                case 68: goto L_0x11fa;
                case 69: goto L_0x11f1;
                case 70: goto L_0x11e8;
                case 71: goto L_0x11df;
                case 72: goto L_0x01b6;
                case 73: goto L_0x11d6;
                case 74: goto L_0x11cd;
                case 75: goto L_0x11c4;
                case 76: goto L_0x11bb;
                case 77: goto L_0x11b2;
                case 78: goto L_0x0191;
                case 79: goto L_0x11a9;
                case 80: goto L_0x11a0;
                case 81: goto L_0x1197;
                case 82: goto L_0x118e;
                case 83: goto L_0x1185;
                case 84: goto L_0x117e;
                case 85: goto L_0x00f3;
                case 86: goto L_0x00f3;
                case 87: goto L_0x1177;
                case 88: goto L_0x1170;
                case 89: goto L_0x1169;
                case 90: goto L_0x1162;
                case 91: goto L_0x00eb;
                case 92: goto L_0x00e7;
                case 93: goto L_0x00c2;
                case 94: goto L_0x00af;
                case 95: goto L_0x009a;
                case 96: goto L_0x0087;
                case 97: goto L_0x00d7;
                case 98: goto L_0x007f;
                default: goto L_0x005d;
            }
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = "Unsupported opcode "
            r1.append(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String[] r0 = X.AnonymousClass49C.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r2]     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            A0C(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
        L_0x0075:
            throw r0     // Catch:{ 5Al -> 0x1350 }
        L_0x0076:
            java.util.HashMap r0 = X.AnonymousClass000.A0x()     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x007f:
            int r1 = r18.getInt()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x00de
        L_0x0087:
            int r1 = r18.getInt()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x00ac
        L_0x009a:
            short r1 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
        L_0x00ac:
            if (r0 != 0) goto L_0x12c1
            goto L_0x00de
        L_0x00af:
            int r1 = r18.getInt()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x00d4
        L_0x00c2:
            short r1 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
        L_0x00d4:
            if (r0 == 0) goto L_0x12c1
            goto L_0x00de
        L_0x00d7:
            short r1 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
        L_0x00de:
            int r1 = r1 + r17
            r0 = r18
            r0.position(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x00e7:
            r18.getInt()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x00ee
        L_0x00eb:
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
        L_0x00ee:
            r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x00f3:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r3 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 - r7
            r1 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            if (r1 != 0) goto L_0x0102
            goto L_0x0182
        L_0x0102:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            r10 = 1
            if (r0 == 0) goto L_0x0116
            boolean r4 = X.AnonymousClass000.A1X(r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x013e
            boolean r0 = X.AnonymousClass000.A1X(r3)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != r0) goto L_0x0185
            goto L_0x017b
        L_0x0116:
            boolean r0 = A0G(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x012b
            double r5 = X.AnonymousClass3K3.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0G(r3)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x013e
            double r3 = X.AnonymousClass3K3.A01(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0152
        L_0x012b:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0157
            long r5 = X.C13700nu.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.lang.Long     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x013e
            long r3 = X.C13700nu.A01(r3)     // Catch:{ 5Al -> 0x1350 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            goto L_0x0154
        L_0x013e:
            java.lang.Number r1 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r1 == 0) goto L_0x0185
            java.lang.Number r0 = A04(r3)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0185
            double r5 = r1.doubleValue()     // Catch:{ 5Al -> 0x1350 }
            double r3 = r0.doubleValue()     // Catch:{ 5Al -> 0x1350 }
        L_0x0152:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
        L_0x0154:
            if (r0 != 0) goto L_0x0185
            goto L_0x017b
        L_0x0157:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0168
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0185
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1.equals(r3)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0185
            goto L_0x017b
        L_0x0168:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1 instanceof X.C31411e8     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0179
            boolean r10 = r1.equals(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x017b
        L_0x0179:
            if (r1 != r3) goto L_0x0185
        L_0x017b:
            r0 = 86
            boolean r0 = X.AnonymousClass000.A1R(r2, r0)
            goto L_0x0187
        L_0x0182:
            r10 = 1
            if (r3 == 0) goto L_0x017b
        L_0x0185:
            r10 = 0
            goto L_0x017b
        L_0x0187:
            r10 = r10 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r7, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x10f5
        L_0x0191:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A06(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x01ab
            long r2 = r0.longValue()     // Catch:{ 5Al -> 0x1350 }
            r0 = -1
            long r2 = r2 ^ r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x01ab:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x01b6:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A06(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x01ce
            long r2 = r0.longValue()     // Catch:{ 5Al -> 0x1350 }
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x01ce:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x01d9:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x01f5
            double r5 = r0.doubleValue()     // Catch:{ 5Al -> 0x1350 }
            long r1 = (long) r5     // Catch:{ 5Al -> 0x1350 }
            int r0 = (int) r1     // Catch:{ 5Al -> 0x1350 }
            r0 = r0 ^ -1
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x01f5:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0200:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r3 = r0 + -1
            int r1 = r3 - r7
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r2 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r1 = r0[r3]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0228
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0228
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5Al -> 0x1350 }
            r0.append(r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r7, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x10f5
        L_0x0228:
            r1 = 5
            java.lang.String r0 = "+"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0230:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0248
            double r2 = r0.doubleValue()     // Catch:{ 5Al -> 0x1350 }
            double r0 = -r2
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0248:
            java.lang.String r0 = "NEG operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0253:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0277
            double r1 = r0.doubleValue()     // Catch:{ 5Al -> 0x1350 }
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0272
            double r0 = java.lang.Math.floor(r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x0269:
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0272:
            double r0 = java.lang.Math.ceil(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0269
        L_0x0277:
            java.lang.String r0 = "TRUNC operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0282:
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0297:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x12c1
            boolean r0 = X.AnonymousClass000.A1X(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r2 = A0A     // Catch:{ 5Al -> 0x1350 }
            goto L_0x074d
        L_0x02a9:
            java.lang.Object r2 = A0C     // Catch:{ 5Al -> 0x1350 }
            goto L_0x074d
        L_0x02ad:
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x02be:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x02dc
            long r2 = r0.longValue()     // Catch:{ 5Al -> 0x1350 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            double r0 = (double) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x02dc:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x02e7:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r2 = A05(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x074d
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x02fc:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r2 = A06(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x074d
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0311:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r2 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x074d
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0326:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x034d
            int r1 = r0.intValue()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
        L_0x0340:
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r9.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x034d:
            java.lang.String r0 = "CHR16 operand must be numeric"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0358:
            short r1 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r25
            java.lang.Object r0 = r0.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x036b:
            int r0 = r18.getInt()     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0379:
            short r0 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0387:
            double r0 = r18.getDouble()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0394:
            long r0 = r18.getLong()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x03a1:
            int r3 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r2 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            int r1 = A02(r2)     // Catch:{ 5Al -> 0x1350 }
            r0 = 100
            if (r3 != r0) goto L_0x03b7
            r0 = 4
            if (r1 == r0) goto L_0x12c1
            if (r1 == r10) goto L_0x12c1
            goto L_0x03b9
        L_0x03b7:
            if (r1 == r3) goto L_0x12c1
        L_0x03b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = "Type assertion failed. Expected "
            r1.append(r0)     // Catch:{ 5Al -> 0x1350 }
            r1.append(r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = ", got "
            r1.append(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x03cf
            java.lang.String r0 = "null"
            goto L_0x03d3
        L_0x03cf:
            java.lang.String r0 = X.AnonymousClass000.A0d(r2)     // Catch:{ 5Al -> 0x1350 }
        L_0x03d3:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x03e0:
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            int r0 = A02(r0)     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x03f2:
            int r3 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            r0 = r19
            boolean r1 = X.AnonymousClass3K3.A1Q(r3, r0)
            java.lang.String r0 = "invalid local store index"
            if (r1 != 0) goto L_0x0409
            A0C(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0409:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r1 = r2[r0]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ 5Al -> 0x1350 }
            goto L_0x10f5
        L_0x041a:
            int r2 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            r0 = r19
            boolean r1 = X.AnonymousClass3K3.A1Q(r2, r0)
            java.lang.String r0 = "invalid local load index"
            if (r1 != 0) goto L_0x0431
            A0C(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0431:
            int r0 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r0 + r2
            int r1 = r0 + 1
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x043f:
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0448:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r4 = r0 + -1
            int r0 = r4 - r8
            java.lang.Object[] r1 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r5 = r1[r0]     // Catch:{ 5Al -> 0x1350 }
            r6 = r1[r4]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0463
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            A0D(r0, r5)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0463:
            java.util.List r5 = (java.util.List) r5     // Catch:{ UnsupportedOperationException -> 0x049b }
            int r4 = r4 - r7
            r4 = r1[r4]     // Catch:{ UnsupportedOperationException -> 0x049b }
            java.lang.String r1 = "invalid vector_resize_length"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r4 = r9.A0J(r4, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x049b }
            int r1 = r5.size()     // Catch:{ UnsupportedOperationException -> 0x049b }
            if (r4 <= r1) goto L_0x0488
            boolean r0 = r5 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x049b }
            if (r0 == 0) goto L_0x0480
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UnsupportedOperationException -> 0x049b }
            r0.ensureCapacity(r4)     // Catch:{ UnsupportedOperationException -> 0x049b }
        L_0x0480:
            r5.add(r6)     // Catch:{ UnsupportedOperationException -> 0x049b }
            int r1 = r1 + 1
            if (r4 > r1) goto L_0x0480
            goto L_0x04a9
        L_0x0488:
            if (r4 >= r1) goto L_0x04a9
        L_0x048a:
            int r1 = r1 + -1
            r5.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x049b }
            if (r4 < r1) goto L_0x048a
            boolean r0 = r5 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x049b }
            if (r0 == 0) goto L_0x04a9
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ UnsupportedOperationException -> 0x049b }
            r5.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x049b }
            goto L_0x04a9
        L_0x049b:
            r1 = move-exception
            r0 = 32
            if (r2 == r0) goto L_0x04a9
            A0F(r3, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x04a9:
            r9.A0O(r10)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x04ae:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x04c6
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            int r0 = r1.size()     // Catch:{ 5Al -> 0x1350 }
        L_0x04bc:
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x04c6:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x04d1
            java.util.List r1 = (java.util.List) r1     // Catch:{ 5Al -> 0x1350 }
            int r0 = r1.size()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x04bc
        L_0x04d1:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x04dc
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            int r0 = r1.length()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x04bc
        L_0x04dc:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x04e7:
            short r5 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r4 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 - r7
            r1 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r0 = 28
            java.util.Map r1 = r9.A0L(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r0 = r25
            java.lang.Object r0 = r0.A01(r5)     // Catch:{ UnsupportedOperationException -> 0x050b }
            r1.put(r0, r4)     // Catch:{ UnsupportedOperationException -> 0x050b }
            goto L_0x05a2
        L_0x050b:
            r1 = move-exception
            r0 = 29
            goto L_0x058a
        L_0x050f:
            short r2 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            r0 = 26
            java.util.Map r1 = r9.A0L(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r0 = r25
            java.lang.Object r0 = r0.A01(r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x074d
            boolean r0 = r1.containsKey(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0536
            r2 = 0
            goto L_0x074d
        L_0x0536:
            A0A(r6)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x053f:
            short r2 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            r0 = 26
            java.util.Map r1 = r9.A0L(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
            r0 = r25
            java.lang.Object r0 = r0.A01(r2)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0567:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r5 = r0 + -1
            int r1 = r5 - r7
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r4 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r1 = r0[r5]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0587 }
            if (r0 == 0) goto L_0x057d
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ UnsupportedOperationException -> 0x0587 }
            r4.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x0587 }
            goto L_0x05a2
        L_0x057d:
            java.lang.String r0 = "del_by_val 1st argument must be a map"
            A0D(r0, r4)     // Catch:{ UnsupportedOperationException -> 0x0587 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ UnsupportedOperationException -> 0x0587 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0587 }
        L_0x0587:
            r1 = move-exception
            r0 = 25
        L_0x058a:
            if (r2 == r0) goto L_0x05a2
            goto L_0x05b2
        L_0x058d:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r4 = r0 + -1
            int r1 = r4 - r7
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r2 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r1 = r0[r4]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x05b1 }
            if (r0 == 0) goto L_0x05a7
            java.util.List r2 = (java.util.List) r2     // Catch:{ UnsupportedOperationException -> 0x05b1 }
            r2.add(r1)     // Catch:{ UnsupportedOperationException -> 0x05b1 }
        L_0x05a2:
            r9.A0O(r8)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x05a7:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            A0D(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x05b1 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ UnsupportedOperationException -> 0x05b1 }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x05b1 }
        L_0x05b1:
            r1 = move-exception
        L_0x05b2:
            A0F(r3, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x05bb:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r6 = r0 + -1
            int r0 = r6 - r8
            java.lang.Object[] r1 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r4 = r1[r0]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r6 - r7
            r7 = r1[r0]     // Catch:{ 5Al -> 0x1350 }
            r6 = r1[r6]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0606 }
            if (r0 == 0) goto L_0x05d5
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ UnsupportedOperationException -> 0x0606 }
            r4.put(r7, r6)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            goto L_0x0612
        L_0x05d5:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x0606 }
            if (r0 == 0) goto L_0x05f2
            java.util.List r4 = (java.util.List) r4     // Catch:{ UnsupportedOperationException -> 0x0606 }
            java.lang.String r1 = "invalid put_by_val vector index"
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r9.A0J(r7, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            int r0 = r4.size()     // Catch:{ UnsupportedOperationException -> 0x0606 }
            if (r1 <= r0) goto L_0x05fc
            A0A(r11)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ UnsupportedOperationException -> 0x0606 }
        L_0x05f1:
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0606 }
        L_0x05f2:
            java.lang.String r0 = "put_by_val 1st argument must be a container"
            A0D(r0, r4)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ UnsupportedOperationException -> 0x0606 }
            goto L_0x05f1
        L_0x05fc:
            if (r1 != r0) goto L_0x0602
            r4.add(r6)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            goto L_0x0612
        L_0x0602:
            r4.set(r1, r6)     // Catch:{ UnsupportedOperationException -> 0x0606 }
            goto L_0x0612
        L_0x0606:
            r0 = move-exception
            if (r2 == r5) goto L_0x0612
            A0F(r3, r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0612:
            r9.A0O(r10)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c0
        L_0x0617:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r5 = r0 + -1
            int r0 = r5 - r8
            java.lang.Object[] r2 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r3 = r2[r0]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r5 - r7
            r4 = r2[r0]     // Catch:{ 5Al -> 0x1350 }
            r2 = r2[r5]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x063a
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0651
            boolean r0 = r3.containsKey(r4)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x065a
            goto L_0x0659
        L_0x063a:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x065c
            java.util.List r3 = (java.util.List) r3     // Catch:{ 5Al -> 0x1350 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r9.A0J(r4, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3.size()     // Catch:{ 5Al -> 0x1350 }
            if (r1 >= r0) goto L_0x065a
            java.lang.Object r0 = r3.get(r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x0651:
            r9.A0Q(r8, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0O(r8)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c0
        L_0x0659:
            r2 = 0
        L_0x065a:
            r0 = r2
            goto L_0x0651
        L_0x065c:
            java.lang.String r2 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ 5Al -> 0x1350 }
            r0 = 0
            r1[r0] = r4     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ 5Al -> 0x1350 }
            A0D(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0670:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r4 = r0 + -1
            int r2 = r4 - r7
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r3 = r0[r2]     // Catch:{ 5Al -> 0x1350 }
            r4 = r0[r4]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0699
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x06b0
            boolean r0 = r3.containsKey(r4)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0690
            r0 = 0
            goto L_0x06b0
        L_0x0690:
            A0A(r6)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0699:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x06b8
            java.util.List r3 = (java.util.List) r3     // Catch:{ 5Al -> 0x1350 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r9.A0J(r4, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3.size()     // Catch:{ 5Al -> 0x1350 }
            if (r1 >= r0) goto L_0x06d7
            java.lang.Object r0 = r3.get(r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x06b0:
            r9.A0Q(r7, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c0
        L_0x06b8:
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x06eb
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5Al -> 0x1350 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "invalid get_by_val string index"
            int r1 = r9.A0J(r4, r0, r1)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3.length()     // Catch:{ 5Al -> 0x1350 }
            if (r1 >= r0) goto L_0x06e0
            char r0 = r3.charAt(r1)     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x06b0
        L_0x06d7:
            A0A(r11)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x06e0:
            java.lang.String r0 = "string index out of range"
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x06eb:
            java.lang.String r2 = "get_by_val 1st argument must be a container for key %s"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ 5Al -> 0x1350 }
            r0 = 0
            r1[r0] = r4     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ 5Al -> 0x1350 }
            A0D(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x06ff:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0712
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r0 = X.C13680ns.A0n(r1)     // Catch:{ 5Al -> 0x1350 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x077c
        L_0x0712:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0722
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 5Al -> 0x1350 }
            r0.<init>(r1)     // Catch:{ 5Al -> 0x1350 }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x077c
        L_0x0722:
            if (r1 == 0) goto L_0x077c
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x077c
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x077c
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x077c
            boolean r0 = r1 instanceof X.C31411e8     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x077c
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x073f:
            java.lang.Object r1 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0752
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r2 = X.C13680ns.A0n(r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x074d:
            r9.A0Q(r4, r2)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0752:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x075e
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ 5Al -> 0x1350 }
            r2.<init>(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x074d
        L_0x075e:
            java.lang.String r0 = "argument of container_clone must be a container"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0769:
            java.lang.Object r2 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r1 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r9.A0J(r2, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()     // Catch:{ 5Al -> 0x1350 }
            r1.ensureCapacity(r0)     // Catch:{ 5Al -> 0x1350 }
        L_0x077c:
            r9.A0Q(r4, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0781:
            int r5 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            int r13 = r5 + 1
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            int r1 = r1 - r13
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r2 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r3 = 10
            boolean r0 = r2 instanceof X.C31411e8     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x1324
            A03(r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r10 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r10 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x07a8
            java.util.List r10 = (java.util.List) r10     // Catch:{ 5Al -> 0x1350 }
            int r11 = r10.size()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x07ac
        L_0x07a8:
            if (r10 != 0) goto L_0x080d
            r10 = 0
            r11 = 0
        L_0x07ac:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r5
            if (r0 >= r11) goto L_0x07bd
            java.lang.String r0 = "too many arguments to apply"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x07bd:
            int r4 = r5 + r11
            int r12 = r4 + 1
            r9.A0P(r12)     // Catch:{ 5Al -> 0x1350 }
            int r3 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r3 + -1
            int r1 = r1 - r5
            int r12 = r12 + r3
            r9.A01 = r12     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r6 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = 0
            java.util.Arrays.fill(r6, r3, r12, r0)     // Catch:{ 5Al -> 0x1350 }
            int r6 = r3 + 1
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0[r3] = r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r1, r0, r6, r5)     // Catch:{ 5Al -> 0x1350 }
            int r6 = r6 + r5
            if (r10 == 0) goto L_0x07ef
            r5 = 0
        L_0x07df:
            if (r5 >= r11) goto L_0x07ef
            int r3 = r6 + 1
            java.lang.Object r1 = r10.get(r5)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0[r6] = r1     // Catch:{ 5Al -> 0x1350 }
            int r5 = r5 + 1
            r6 = r3
            goto L_0x07df
        L_0x07ef:
            r0 = 4
            int r1 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 - r0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r1 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r0 = r17
            r9.A0V(r2, r4, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0M()     // Catch:{ 5Al -> 0x1350 }
            int r1 = r13 + 1
            java.lang.Object r0 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0O(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x080d:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            A0D(r0, r10)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0818:
            r0 = 4
            int r2 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r1 = r2 - r0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r0 = A03(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r1 = r0.A01     // Catch:{ 5Al -> 0x1350 }
            if (r1 == 0) goto L_0x084a
            int r3 = r1.length     // Catch:{ 5Al -> 0x1350 }
        L_0x082a:
            int r2 = r2 - r10
            int[] r0 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r2 = r0[r2]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3 + r2
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ 5Al -> 0x1350 }
            if (r1 == 0) goto L_0x0838
            java.lang.System.arraycopy(r1, r4, r5, r4, r3)     // Catch:{ 5Al -> 0x1350 }
        L_0x0838:
            int r1 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r2 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r1, r5, r3, r2)     // Catch:{ 5Al -> 0x1350 }
            int r3 = r5.length     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r2 = X.C13690nt.A0i(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x084c
        L_0x084a:
            r3 = 0
            goto L_0x082a
        L_0x084c:
            r1 = 0
        L_0x084d:
            if (r1 >= r3) goto L_0x0857
            r0 = r5[r1]     // Catch:{ 5Al -> 0x1350 }
            r2.add(r0)     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 + 1
            goto L_0x084d
        L_0x0857:
            r9.A0U(r2)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x085c:
            int r2 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            r0 = 4
            int r3 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r1 = r3 - r0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r0 = A03(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r0 = r0.A01     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0878
            int r1 = r0.length     // Catch:{ 5Al -> 0x1350 }
        L_0x0872:
            int r3 = r3 - r10
            int[] r0 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r3]     // Catch:{ 5Al -> 0x1350 }
            goto L_0x087a
        L_0x0878:
            r1 = 0
            goto L_0x0872
        L_0x087a:
            int r1 = r1 + r0
            boolean r0 = X.AnonymousClass000.A1R(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0888:
            r0 = 4
            int r2 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r1 = r2 - r0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r0 = A03(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r0 = r0.A01     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x08aa
            int r1 = r0.length     // Catch:{ 5Al -> 0x1350 }
        L_0x089a:
            int r2 = r2 - r10
            int[] r0 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r2]     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 + r0
            double r0 = (double) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x08aa:
            r1 = 0
            goto L_0x089a
        L_0x08ac:
            int r6 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            r0 = 4
            int r4 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r4 - r0
            java.lang.Object[] r3 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r3[r0]     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r0 = A03(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r5 = r0.A01     // Catch:{ 5Al -> 0x1350 }
            if (r5 == 0) goto L_0x08d1
            int r2 = r5.length     // Catch:{ 5Al -> 0x1350 }
        L_0x08c2:
            int r1 = r4 - r10
            int[] r0 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r1 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            if (r6 >= r2) goto L_0x08d3
            r0 = r5[r6]     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x08d1:
            r2 = 0
            goto L_0x08c2
        L_0x08d3:
            int r0 = r2 + r1
            if (r6 >= r0) goto L_0x08e5
            int r6 = r6 - r2
            int r1 = r1 - r6
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r4 = r4 - r0
            r0 = r3[r4]     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x08e5:
            r0 = 0
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x08eb:
            int r1 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            int r0 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            X.4bI r6 = new X.4bI     // Catch:{ 5Al -> 0x1350 }
            r6.<init>(r9, r0)     // Catch:{ 5Al -> 0x1350 }
            switch(r1) {
                case 0: goto L_0x0f1e;
                case 1: goto L_0x090a;
                case 2: goto L_0x0edd;
                case 3: goto L_0x0f59;
                case 4: goto L_0x0e9d;
                case 5: goto L_0x0e88;
                case 6: goto L_0x0e58;
                case 7: goto L_0x0e0b;
                case 8: goto L_0x0d76;
                case 9: goto L_0x0d40;
                case 10: goto L_0x0cb5;
                case 11: goto L_0x0bf5;
                case 12: goto L_0x0b18;
                case 13: goto L_0x0a29;
                case 14: goto L_0x0a13;
                case 15: goto L_0x09be;
                case 16: goto L_0x098f;
                case 17: goto L_0x095d;
                case 18: goto L_0x0923;
                default: goto L_0x08fb;
            }     // Catch:{ 5Al -> 0x1350 }
        L_0x08fb:
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x090a:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.C807445h.A00(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            X.4f6 r0 = r6.A02     // Catch:{ 5Al -> 0x1350 }
            java.util.Random r0 = r0.A07     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0.nextDouble()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0923:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r10)
            java.lang.String r0 = "StringReplaceAll requires 3 arguments"
            X.C807445h.A00(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            X.4f6 r1 = r6.A02     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r3 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r2 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r1 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r2.isEmpty()     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0958
            java.lang.String r3 = r3.replace(r2, r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x0958:
            r6.A02(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x095d:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x096e
            java.lang.String r0 = "MakeSmallMapKV requires an even number of arguments"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x096e:
            int r0 = r1 >> 1
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 5Al -> 0x1350 }
            r3.<init>(r0)     // Catch:{ 5Al -> 0x1350 }
            r2 = 0
        L_0x0976:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            if (r2 >= r0) goto L_0x098a
            java.lang.Object r1 = r6.A01(r2)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r2 + 1
            java.lang.Object r0 = r6.A01(r0)     // Catch:{ 5Al -> 0x1350 }
            r3.put(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            int r2 = r2 + 2
            goto L_0x0976
        L_0x098a:
            r6.A02(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x098f:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r8)
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x09aa
            java.lang.String r0 = "MapHasValue 1st arg must be a map"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x09aa:
            java.lang.Object r1 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1.containsValue(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x09be:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r8)
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x09d9
            java.lang.String r0 = "MapKeysValues 1st arg must be a map"
        L_0x09d0:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x09d9:
            java.lang.Object r1 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x09ea
            java.lang.String r0 = "MapKeysValues 2nd arg must be a boolean"
            goto L_0x09d0
        L_0x09ea:
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0a0a
            java.util.Set r0 = r1.keySet()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 5Al -> 0x1350 }
        L_0x09fc:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)     // Catch:{ 5Al -> 0x1350 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0a0a:
            java.util.Collection r0 = r1.values()     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x09fc
        L_0x0a13:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.C807445h.A00(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0a29:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = 5
            boolean r1 = X.AnonymousClass000.A1R(r1, r0)
            java.lang.String r0 = "ArrayCopy expects 5 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0a45
            java.lang.String r0 = "ArrayCopy 1st argument must be an array"
        L_0x0a3c:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0a45:
            java.lang.Object r12 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ 5Al -> 0x1350 }
            double r4 = A00(r6, r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.C88914bI.A00(r4)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0a58
            java.lang.String r0 = "ArrayCopy 2nd argument must be an integer"
            goto L_0x0a3c
        L_0x0a58:
            java.lang.Object r0 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0a63
            java.lang.String r0 = "ArrayCopy 3rd argument must be an array"
            goto L_0x0a3c
        L_0x0a63:
            java.lang.Object r11 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ 5Al -> 0x1350 }
            double r2 = A00(r6, r10)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.C88914bI.A00(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0a76
            java.lang.String r0 = "ArrayCopy 4th argument must be an integer"
            goto L_0x0a3c
        L_0x0a76:
            r0 = 4
            double r0 = A00(r6, r0)     // Catch:{ 5Al -> 0x1350 }
            boolean r10 = X.C88914bI.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r10 != 0) goto L_0x0a84
            java.lang.String r0 = "ArrayCopy 5th argument must be an integer"
            goto L_0x0a3c
        L_0x0a84:
            int r10 = r12.size()     // Catch:{ 5Al -> 0x1350 }
            int r20 = r11.size()     // Catch:{ 5Al -> 0x1350 }
            int r13 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r13 >= 0) goto L_0x0a92
            double r13 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            double r4 = r4 + r13
        L_0x0a92:
            int r13 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r13 < 0) goto L_0x0b0d
            double r15 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x0b0d
            int r10 = (int) r4     // Catch:{ 5Al -> 0x1350 }
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 >= 0) goto L_0x0aa4
            r4 = r20
            double r4 = (double) r4     // Catch:{ 5Al -> 0x1350 }
            double r2 = r2 + r4
        L_0x0aa4:
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 < 0) goto L_0x0b02
            r4 = r20
            double r13 = (double) r4     // Catch:{ 5Al -> 0x1350 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0b02
            int r4 = (int) r2     // Catch:{ 5Al -> 0x1350 }
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 < 0) goto L_0x0af7
            double r2 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            double r2 = r2 + r0
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r5 > 0) goto L_0x0af7
            double r2 = (double) r4     // Catch:{ 5Al -> 0x1350 }
            double r2 = r2 + r0
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x0af7
            int r2 = (int) r0     // Catch:{ 5Al -> 0x1350 }
            if (r12 != r11) goto L_0x0ad8
            if (r4 <= r10) goto L_0x0ad8
            int r10 = r10 + r2
            int r4 = r4 + r2
        L_0x0ac7:
            int r1 = r2 + -1
            if (r2 == 0) goto L_0x0f57
            int r4 = r4 + -1
            int r10 = r10 + -1
            java.lang.Object r0 = r12.get(r10)     // Catch:{ UnsupportedOperationException -> 0x0aeb }
            r11.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x0aeb }
            r2 = r1
            goto L_0x0ac7
        L_0x0ad8:
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0f57
            int r2 = r4 + 1
            int r1 = r10 + 1
            java.lang.Object r0 = r12.get(r10)     // Catch:{ UnsupportedOperationException -> 0x0aeb }
            r11.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x0aeb }
            r4 = r2
            r2 = r3
            r10 = r1
            goto L_0x0ad8
        L_0x0aeb:
            r1 = move-exception
            java.lang.String r0 = "ArrayCopy dst must be mutable"
            A0F(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0af7:
            java.lang.String r0 = "ArrayCopy length out of range"
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0b02:
            java.lang.String r0 = "ArrayCopy dst index out of range"
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0b0d:
            java.lang.String r0 = "ArrayCopy src index out of range"
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0b18:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = 5
            boolean r1 = X.AnonymousClass000.A1R(r1, r0)
            java.lang.String r0 = "StringSearch expects 5 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0b34
            java.lang.String r0 = "StringSearch 1st arg must be a string"
        L_0x0b2b:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0b34:
            java.lang.Object r12 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0b45
            java.lang.String r0 = "StringSearch 2nd arg must be a string"
            goto L_0x0b2b
        L_0x0b45:
            java.lang.Object r11 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0b64
            double r0 = A00(r6, r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = X.C88914bI.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0b66
            java.lang.String r0 = "StringSearch 3rd arg must be an integer or null"
            goto L_0x0b2b
        L_0x0b64:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0b66:
            java.lang.Object r4 = r6.A01(r10)     // Catch:{ 5Al -> 0x1350 }
            if (r4 == 0) goto L_0x0b79
            double r2 = A00(r6, r10)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = X.C88914bI.A00(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0b79
            java.lang.String r0 = "StringSearch 4th arg must be an integer or null"
            goto L_0x0b2b
        L_0x0b79:
            r5 = 4
            java.lang.Object r4 = r6.A01(r5)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = r4 instanceof java.lang.Boolean     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0b85
            java.lang.String r0 = "StringSearch 5th arg must be a boolean"
            goto L_0x0b2b
        L_0x0b85:
            java.lang.Object r4 = r6.A01(r5)     // Catch:{ 5Al -> 0x1350 }
            boolean r15 = X.AnonymousClass000.A1X(r4)     // Catch:{ 5Al -> 0x1350 }
            int r10 = r12.length()     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r4 == 0) goto L_0x0b98
            goto L_0x0ba3
        L_0x0b98:
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 >= 0) goto L_0x0b9e
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r4
        L_0x0b9e:
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 < 0) goto L_0x0bea
            goto L_0x0ba5
        L_0x0ba3:
            r0 = 0
        L_0x0ba5:
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0bea
            int r13 = (int) r0     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0bc0
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x0bbd
            double r0 = (double) r13     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r2
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0bbd
            int r1 = (int) r2     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0bc2
        L_0x0bbd:
            java.lang.String r0 = "StringSearch length out of range"
            goto L_0x0bec
        L_0x0bc0:
            int r1 = r10 - r13
        L_0x0bc2:
            int r0 = r11.length()     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0f57
            if (r0 > r1) goto L_0x0f57
            if (r13 != 0) goto L_0x0bd1
            if (r1 != r10) goto L_0x0bd1
        L_0x0bce:
            if (r15 == 0) goto L_0x0bdc
            goto L_0x0bd7
        L_0x0bd1:
            int r1 = r1 + r13
            java.lang.String r12 = r12.substring(r13, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0bce
        L_0x0bd7:
            int r0 = r12.lastIndexOf(r11)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0be0
        L_0x0bdc:
            int r0 = r12.indexOf(r11)     // Catch:{ 5Al -> 0x1350 }
        L_0x0be0:
            if (r0 < 0) goto L_0x0f57
            int r0 = r0 + r13
            double r0 = (double) r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0bea:
            java.lang.String r0 = "StringSearch offset out of range"
        L_0x0bec:
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0bf5:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = 4
            boolean r1 = X.AnonymousClass000.A1R(r1, r0)
            java.lang.String r0 = "SubstringCompare expects 4 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0c11
            java.lang.String r0 = "SubstringCompare 1st arg must be a string"
        L_0x0c08:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0c11:
            java.lang.Object r12 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0c22
            java.lang.String r0 = "SubstringCompare 2nd arg must be a string"
            goto L_0x0c08
        L_0x0c22:
            java.lang.Object r11 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0c41
            double r0 = A00(r6, r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = X.C88914bI.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0c43
            java.lang.String r0 = "SubstringCompare 3rd arg must be an integer or null"
            goto L_0x0c08
        L_0x0c41:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0c43:
            java.lang.Object r4 = r6.A01(r10)     // Catch:{ 5Al -> 0x1350 }
            if (r4 == 0) goto L_0x0c56
            double r2 = A00(r6, r10)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = X.C88914bI.A00(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0c56
            java.lang.String r0 = "SubstringCompare 4th arg must be an integer or null"
            goto L_0x0c08
        L_0x0c56:
            int r10 = r12.length()     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 5Al -> 0x1350 }
            r15 = 0
            if (r4 == 0) goto L_0x0c63
            goto L_0x0c6e
        L_0x0c63:
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 >= 0) goto L_0x0c69
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r4
        L_0x0c69:
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 < 0) goto L_0x0caa
            goto L_0x0c70
        L_0x0c6e:
            r0 = 0
        L_0x0c70:
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0caa
            int r13 = (int) r0     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0c8b
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x0c88
            double r0 = (double) r13     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r2
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0c88
            int r0 = (int) r2     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0c8d
        L_0x0c88:
            java.lang.String r0 = "SubstringCompare length out of range"
            goto L_0x0cac
        L_0x0c8b:
            int r0 = r10 - r13
        L_0x0c8d:
            if (r13 != 0) goto L_0x0c92
            if (r0 != r10) goto L_0x0c92
            goto L_0x0c97
        L_0x0c92:
            int r0 = r0 + r13
            java.lang.String r12 = r12.substring(r13, r0)     // Catch:{ 5Al -> 0x1350 }
        L_0x0c97:
            int r0 = r12.compareTo(r11)     // Catch:{ 5Al -> 0x1350 }
            if (r0 >= 0) goto L_0x0ca0
            r15 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0ca4
        L_0x0ca0:
            if (r0 == 0) goto L_0x0ca4
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0ca4:
            java.lang.Number r0 = X.C89554cQ.A00(r15)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0caa:
            java.lang.String r0 = "SubstringCompare offset out of range"
        L_0x0cac:
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0cb5:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r12 = 0
            boolean r1 = X.AnonymousClass000.A1R(r0, r10)
            java.lang.String r0 = "Substring expects 3 arguments"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0cd1
            java.lang.String r0 = "Substring 1st arg must be a string"
        L_0x0cc8:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0cd1:
            java.lang.Object r11 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 5Al -> 0x1350 }
            double r0 = A00(r6, r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r2 = X.C88914bI.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r2 != 0) goto L_0x0ce4
            java.lang.String r0 = "Substring 2nd arg must be an integer"
            goto L_0x0cc8
        L_0x0ce4:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Object r4 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            if (r4 == 0) goto L_0x0cf9
            double r2 = A00(r6, r8)     // Catch:{ 5Al -> 0x1350 }
            boolean r4 = X.C88914bI.A00(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r4 != 0) goto L_0x0cf9
            java.lang.String r0 = "Substring 3rd arg must be an integer or null"
            goto L_0x0cc8
        L_0x0cf9:
            int r10 = r11.length()     // Catch:{ 5Al -> 0x1350 }
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 >= 0) goto L_0x0d03
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r4
        L_0x0d03:
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 < 0) goto L_0x0d35
            double r4 = (double) r10     // Catch:{ 5Al -> 0x1350 }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0d35
            int r13 = (int) r0     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0d22
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x0d1f
            double r0 = (double) r13     // Catch:{ 5Al -> 0x1350 }
            double r0 = r0 + r2
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0d1f
            int r0 = (int) r2     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0d24
        L_0x0d1f:
            java.lang.String r0 = "Substring length out of range"
            goto L_0x0d37
        L_0x0d22:
            int r0 = r10 - r13
        L_0x0d24:
            if (r13 != 0) goto L_0x0d2e
            if (r0 != r10) goto L_0x0d2e
            java.lang.Object r0 = r6.A01(r12)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0d2e:
            int r0 = r0 + r13
            java.lang.String r0 = r11.substring(r13, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0d35:
            java.lang.String r0 = "Substring offset out of range"
        L_0x0d37:
            A0A(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0d40:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r1 = 1
            if (r0 == r7) goto L_0x0d46
            r1 = 0
        L_0x0d46:
            java.lang.String r0 = "IsFinite expects 1 argument"
            java.lang.Object r0 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r0 = A04(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0d5d
            java.lang.String r0 = "IsFinite argument must be numeric"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0d5d:
            double r0 = r0.doubleValue()     // Catch:{ 5Al -> 0x1350 }
            double r3 = java.lang.Math.abs(r0)     // Catch:{ 5Al -> 0x1350 }
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass3K4.A18(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0d76:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r8)
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            java.lang.Object r1 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r24 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0G(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0d9b
            double r2 = X.AnonymousClass3K3.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            long r0 = (long) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f16
        L_0x0d9b:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0f16
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0e05
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0I(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0f18
            java.lang.String r11 = r1.trim()     // Catch:{ 5Al -> 0x1350 }
            int r10 = r11.length()     // Catch:{ NumberFormatException -> 0x0f18 }
            if (r10 == 0) goto L_0x0f18
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            char r1 = r11.charAt(r4)     // Catch:{ NumberFormatException -> 0x0f18 }
            r0 = 45
            r16 = 1
            if (r1 != r0) goto L_0x0dc9
            r22 = -9223372036854775808
            r5 = 1
            goto L_0x0dd0
        L_0x0dc9:
            r0 = 43
            if (r1 != r0) goto L_0x0dce
            r5 = 1
        L_0x0dce:
            r16 = 0
        L_0x0dd0:
            if (r5 == r10) goto L_0x0f18
            r20 = 10
            long r14 = r22 / r20
            r2 = 0
        L_0x0dd8:
            if (r5 >= r10) goto L_0x0dfc
            char r0 = r11.charAt(r5)     // Catch:{ NumberFormatException -> 0x0f18 }
            int r1 = r0 + -48
            if (r1 < 0) goto L_0x0f18
            r0 = 9
            if (r1 > r0) goto L_0x0f18
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0df7
            long r2 = r2 * r20
            long r0 = (long) r1     // Catch:{ NumberFormatException -> 0x0f18 }
            long r12 = r22 + r0
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0df7
            long r2 = r2 - r0
        L_0x0df4:
            int r5 = r5 + 1
            goto L_0x0dd8
        L_0x0df7:
            if (r24 == 0) goto L_0x0f18
            r2 = r22
            goto L_0x0df4
        L_0x0dfc:
            if (r16 != 0) goto L_0x0dff
            long r2 = -r2
        L_0x0dff:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0f18 }
            goto L_0x0f16
        L_0x0e05:
            java.lang.Number r1 = A06(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f16
        L_0x0e0b:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r5 = 0
            boolean r1 = X.AnonymousClass000.A1R(r0, r8)
            java.lang.String r0 = "MakeMap expects 2 arguments"
            java.lang.Object r10 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r4 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r10 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0e2b
            java.lang.String r0 = "MakeMap arg 0 must be a list"
        L_0x0e22:
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0e2b:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0e32
            java.lang.String r0 = "MakeMap arg 1 must be a list"
            goto L_0x0e22
        L_0x0e32:
            java.util.List r10 = (java.util.List) r10     // Catch:{ 5Al -> 0x1350 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 5Al -> 0x1350 }
            int r3 = r10.size()     // Catch:{ 5Al -> 0x1350 }
            int r0 = r4.size()     // Catch:{ 5Al -> 0x1350 }
            if (r3 == r0) goto L_0x0e43
            java.lang.String r0 = "MakeMap different number keys/values"
            goto L_0x0e22
        L_0x0e43:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ 5Al -> 0x1350 }
            r1.<init>(r3)     // Catch:{ 5Al -> 0x1350 }
        L_0x0e48:
            if (r5 >= r3) goto L_0x0f19
            java.lang.Object r2 = r10.get(r5)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 5Al -> 0x1350 }
            r1.put(r2, r0)     // Catch:{ 5Al -> 0x1350 }
            int r5 = r5 + 1
            goto L_0x0e48
        L_0x0e58:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0e69
            java.lang.String r0 = "MakeSmallMap requires an even number of arguments"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0e69:
            int r4 = r1 >> 1
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 5Al -> 0x1350 }
            r3.<init>(r4)     // Catch:{ 5Al -> 0x1350 }
            r2 = 0
        L_0x0e71:
            if (r2 >= r4) goto L_0x0e83
            java.lang.Object r1 = r6.A01(r2)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r4 + r2
            java.lang.Object r0 = r6.A01(r0)     // Catch:{ 5Al -> 0x1350 }
            r3.put(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            int r2 = r2 + 1
            goto L_0x0e71
        L_0x0e83:
            r6.A02(r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0e88:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            java.util.ArrayList r1 = X.C13690nt.A0i(r0)     // Catch:{ 5Al -> 0x1350 }
            r2 = 0
        L_0x0e8f:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            if (r2 >= r0) goto L_0x0f19
            java.lang.Object r0 = r6.A01(r2)     // Catch:{ 5Al -> 0x1350 }
            r1.add(r0)     // Catch:{ 5Al -> 0x1350 }
            int r2 = r2 + 1
            goto L_0x0e8f
        L_0x0e9d:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r10)
            java.lang.String r0 = "MapPutAll requires 3 arguments"
            java.lang.Object r2 = A07(r6, r0, r8, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r1 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0ebc
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            A0D(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0ebc:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0ecb
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
            A0D(r0, r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0ecb:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 5Al -> 0x1350 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r2 == r1) goto L_0x0f57
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x0f54 }
            goto L_0x0f57
        L_0x0edd:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r1 = 1
            if (r0 == r7) goto L_0x0ee3
            r1 = 0
        L_0x0ee3:
            java.lang.String r0 = "ParseNumber requires one argument"
            java.lang.Object r1 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0G(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0f16
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0efd
            long r2 = X.C13700nu.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            double r0 = (double) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Number r1 = X.C89554cQ.A00(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f16
        L_0x0efd:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0f12
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0I(r1)     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0f18
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0f18 }
            java.lang.Number r1 = X.C89554cQ.A00(r0)     // Catch:{ NumberFormatException -> 0x0f18 }
            goto L_0x0f16
        L_0x0f12:
            java.lang.Number r1 = A04(r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x0f16:
            if (r1 != 0) goto L_0x0f19
        L_0x0f18:
            r1 = 0
        L_0x0f19:
            r6.A02(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0f1e:
            int r0 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            boolean r1 = X.AnonymousClass000.A1R(r0, r8)
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            java.lang.Object r4 = A07(r6, r0, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r3 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x0f3d
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
            A0D(r0, r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x0f3d:
            java.util.List r4 = (java.util.List) r4     // Catch:{ 5Al -> 0x1350 }
            X.4f6 r2 = r6.A02     // Catch:{ 5Al -> 0x1350 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r2.A0J(r3, r0, r1)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r4.size()     // Catch:{ 5Al -> 0x1350 }
            if (r1 >= r0) goto L_0x0f57
            r4.remove(r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f57
        L_0x0f54:
            r1 = move-exception
            if (r0 != 0) goto L_0x12e2
        L_0x0f57:
            r0 = 0
            goto L_0x0f93
        L_0x0f59:
            int r1 = r6.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = 4
            boolean r1 = X.AnonymousClass000.A1R(r1, r0)
            java.lang.String r0 = "StringReplace requires 4 arguments"
            X.C807445h.A00(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            X.4f6 r1 = r6.A02     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r4)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r3 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r7)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r2 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r8)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r1 = r1.A0K(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object r0 = r6.A01(r10)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = A0H(r0)     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x0f98
            java.lang.String r0 = r3.replaceAll(r2, r1)     // Catch:{ 5Al -> 0x1350 }
        L_0x0f93:
            r6.A02(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0f98:
            java.lang.String r0 = r3.replaceFirst(r2, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0f93
        L_0x0f9d:
            short r1 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r6 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            r0 = r25
            java.lang.Object r5 = r0.A01(r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ 5Al -> 0x1350 }
            int r3 = r6 + -1
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            int r1 = r1 - r3
            r10 = 0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)     // Catch:{ 5Al -> 0x1350 }
            int r4 = r9.A02     // Catch:{ 5Al -> 0x1350 }
            r0 = r17
            r9.A02 = r0     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ 5Al -> 0x1350 }
            X.4CP r0 = r9.A03     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            java.util.List r11 = java.util.Arrays.asList(r2)     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            X.0q5 r3 = r0.A00     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            X.1Jc r2 = r3.A02     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            X.4tt r1 = new X.4tt     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            r1.<init>(r5)     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            X.0q3 r0 = new X.0q3     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            r0.<init>(r11)     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            java.lang.Object r0 = r2.A8l(r0, r1, r3)     // Catch:{ 5Aq -> 0x1010, Exception -> 0x0fe8 }
            r9.A02 = r4     // Catch:{ 5Al -> 0x1350 }
            r9.A0O(r6)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r10, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x0fe8:
            r2 = move-exception
            java.lang.String r0 = "extension '"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            r1.append(r5)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = "' threw an exception: "
            r1.append(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = "UserError: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            X.5Al r1 = new X.5Al     // Catch:{ 5Al -> 0x1350 }
            r1.<init>(r0, r2)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12e2
        L_0x1010:
            r1 = move-exception
            goto L_0x12e2
        L_0x1013:
            int r4 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r0 = r0 + -1
            int r0 = r0 - r4
            java.lang.Object[] r3 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r2 = r3[r0]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r2 instanceof X.C31411e8     // Catch:{ 5Al -> 0x1350 }
            if (r0 != 0) goto L_0x102f
            java.lang.String r0 = "op_call target is not a closure"
            A0D(r0, r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x102f:
            r1 = 4
            int r0 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r0 - r1
            r1 = r3[r0]     // Catch:{ 5Al -> 0x1350 }
            r0 = r17
            r9.A0V(r2, r4, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0M()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x103f:
            int r2 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            int r4 = r2 + 1
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            int r1 = r1 - r4
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r3 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof X.C31411e8     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x133a
            X.4Gs r11 = A03(r3)     // Catch:{ 5Al -> 0x1350 }
            r10 = 0
            java.lang.Object r6 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x107c
            java.util.List r6 = (java.util.List) r6     // Catch:{ 5Al -> 0x1350 }
            r1 = 32768(0x8000, float:4.5918E-41)
            int r1 = r1 - r2
            int r0 = r6.size()     // Catch:{ 5Al -> 0x1350 }
            if (r1 >= r0) goto L_0x1076
            java.lang.String r0 = "too many arguments to bind"
            A0B(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x1076:
            int r1 = r6.size()     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 + r2
            goto L_0x1080
        L_0x107c:
            if (r6 != 0) goto L_0x10cd
            r6 = 0
            r1 = r2
        L_0x1080:
            if (r1 == 0) goto L_0x10f5
            java.lang.Object[] r0 = r11.A01     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x108e
            int r3 = r0.length     // Catch:{ 5Al -> 0x1350 }
            int r1 = r1 + r3
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r10, r5, r10, r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x1091
        L_0x108e:
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ 5Al -> 0x1350 }
            r3 = 0
        L_0x1091:
            if (r2 == 0) goto L_0x109e
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r1, r5, r3, r2)     // Catch:{ 5Al -> 0x1350 }
            int r3 = r3 + r2
        L_0x109e:
            if (r6 == 0) goto L_0x10b2
            int r2 = r6.size()     // Catch:{ 5Al -> 0x1350 }
        L_0x10a4:
            if (r10 >= r2) goto L_0x10b2
            int r1 = r3 + 1
            java.lang.Object r0 = r6.get(r10)     // Catch:{ 5Al -> 0x1350 }
            r5[r3] = r0     // Catch:{ 5Al -> 0x1350 }
            int r10 = r10 + 1
            r3 = r1
            goto L_0x10a4
        L_0x10b2:
            X.4RT r0 = r11.A00     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r3 = new X.4Gs     // Catch:{ 5Al -> 0x1350 }
            r3.<init>(r0, r5)     // Catch:{ 5Al -> 0x1350 }
            r2 = 0
            r0 = -1
            X.1e9 r1 = new X.1e9     // Catch:{ 5Al -> 0x1350 }
            r1.<init>(r2, r3, r0)     // Catch:{ 5Al -> 0x1350 }
            X.1e8 r0 = new X.1e8     // Catch:{ 5Al -> 0x1350 }
            r0.<init>(r1)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0O(r4)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x10cd:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            A0D(r0, r6)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x10d8:
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r4 = r0 + -1
            int r2 = r4 - r7
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r3 = r0[r2]     // Catch:{ 5Al -> 0x1350 }
            r2 = r0[r4]     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x10fa
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3.containsKey(r2)     // Catch:{ 5Al -> 0x1350 }
        L_0x10ee:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 5Al -> 0x1350 }
            r9.A0Q(r7, r0)     // Catch:{ 5Al -> 0x1350 }
        L_0x10f5:
            r9.A0N()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x10fa:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x1110
            java.util.List r3 = (java.util.List) r3     // Catch:{ 5Al -> 0x1350 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r9.A0J(r2, r1, r0)     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3.size()     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = X.AnonymousClass3K3.A1Q(r1, r0)
            goto L_0x10ee
        L_0x1110:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            A0D(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x111b:
            short r5 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r3 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            if (r3 != 0) goto L_0x112b
            r4 = 0
            goto L_0x113d
        L_0x112b:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ 5Al -> 0x1350 }
            int r1 = r3 + -1
            int r0 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r2 = r0 + -1
            int r2 = r2 - r1
            r1 = 0
            java.lang.Object[] r0 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            java.lang.System.arraycopy(r0, r2, r4, r1, r3)     // Catch:{ 5Al -> 0x1350 }
            r9.A0O(r3)     // Catch:{ 5Al -> 0x1350 }
        L_0x113d:
            r0 = r25
            X.4RT r0 = r0.A00(r5)     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r3 = new X.4Gs     // Catch:{ 5Al -> 0x1350 }
            r3.<init>(r0, r4)     // Catch:{ 5Al -> 0x1350 }
            r2 = 0
            r0 = -1
            X.1e9 r1 = new X.1e9     // Catch:{ 5Al -> 0x1350 }
            r1.<init>(r2, r3, r0)     // Catch:{ 5Al -> 0x1350 }
            X.1e8 r0 = new X.1e8     // Catch:{ 5Al -> 0x1350 }
            r0.<init>(r1)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1159:
            java.lang.Number r0 = X.C89554cQ.A00(r21)     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1162:
            java.lang.String r0 = "<="
            r9.A0T(r10, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1169:
            java.lang.String r0 = "<"
            r9.A0T(r8, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1170:
            java.lang.String r0 = ">"
            r9.A0T(r7, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1177:
            java.lang.String r0 = ">="
            r9.A0T(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x117e:
            java.lang.String r0 = "INT64_SHR"
            r9.A0S(r5, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1185:
            r1 = 21
            java.lang.String r0 = "INT64_ASR"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x118e:
            r1 = 20
            java.lang.String r0 = "INT64_SHL"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1197:
            r1 = 19
            java.lang.String r0 = "INT64_XOR"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11a0:
            r1 = 18
            java.lang.String r0 = "INT64_OR"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11a9:
            r1 = 17
            java.lang.String r0 = "INT64_AND"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11b2:
            r1 = 16
            java.lang.String r0 = "INT64_ADD"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11bb:
            r1 = 15
            java.lang.String r0 = "INT64_SUB"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11c4:
            r1 = 14
            java.lang.String r0 = "INT64_MOD"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11cd:
            r1 = 13
            java.lang.String r0 = "INT64_DIV"
            r9.A0S(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11d6:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r9.A0S(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11df:
            r1 = 11
            java.lang.String r0 = ">>>"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11e8:
            java.lang.String r1 = ">>"
            r0 = 10
            r9.A0R(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11f1:
            r1 = 9
            java.lang.String r0 = "<<"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x11fa:
            r1 = 8
            java.lang.String r0 = "^"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1203:
            r1 = 7
            java.lang.String r0 = "|"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x120b:
            r1 = 6
            java.lang.String r0 = "&"
            r9.A0R(r1, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1213:
            java.lang.String r1 = "-"
            r0 = 4
            r9.A0R(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x121b:
            java.lang.String r0 = "%"
            r9.A0R(r10, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1222:
            java.lang.String r0 = "/"
            r9.A0R(r8, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1229:
            java.lang.String r0 = "imul"
            r9.A0R(r7, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1230:
            java.lang.String r0 = "*"
            r9.A0R(r4, r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1237:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x123e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x1244:
            java.lang.Object r0 = r9.A06     // Catch:{ 5Al -> 0x1350 }
            r9.A0U(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x124a:
            boolean r1 = X.AnonymousClass000.A1P(r19)
            java.lang.String r0 = "enter executed more than once"
            if (r1 == 0) goto L_0x12c4
            int r19 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            int r3 = X.AnonymousClass3K4.A09(r18)     // Catch:{ 5Al -> 0x1350 }
            short r2 = r18.getShort()     // Catch:{ 5Al -> 0x1350 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r1 = 0
            r0 = r19
            if (r3 > r0) goto L_0x1268
            r1 = 1
        L_0x1268:
            java.lang.String r0 = "op_enter too many params to copy"
            if (r1 != 0) goto L_0x1275
            A0C(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x1275:
            int r2 = r2 + r19
            int r0 = r2 + 5
            r9.A0P(r0)     // Catch:{ 5Al -> 0x1350 }
            int r4 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r2 = r19 + r4
            r9.A01 = r2     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r1 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = 0
            java.util.Arrays.fill(r1, r4, r2, r0)     // Catch:{ 5Al -> 0x1350 }
            int r2 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r1 = r2 - r10
            int[] r0 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r5 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            r0 = 4
            int r2 = r2 - r0
            java.lang.Object[] r6 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r0 = r6[r2]     // Catch:{ 5Al -> 0x1350 }
            X.4Gs r0 = A03(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.Object[] r2 = r0.A01     // Catch:{ 5Al -> 0x1350 }
            if (r2 == 0) goto L_0x12aa
            int r0 = r2.length     // Catch:{ 5Al -> 0x1350 }
        L_0x129f:
            int r1 = java.lang.Math.min(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            if (r1 == 0) goto L_0x12ad
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r6, r4, r1)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12ac
        L_0x12aa:
            r0 = 0
            goto L_0x129f
        L_0x12ac:
            int r4 = r4 + r1
        L_0x12ad:
            int r3 = X.AnonymousClass3K4.A06(r3, r1, r5)     // Catch:{ 5Al -> 0x1350 }
            if (r3 <= 0) goto L_0x12c1
            java.lang.Object[] r2 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            int r1 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12c1
        L_0x12c0:
            r7 = 1
        L_0x12c1:
            r4 = 0
            goto L_0x0043
        L_0x12c4:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0V(r0)     // Catch:{ 5Al -> 0x1350 }
            goto L_0x12e2
        L_0x12c9:
            java.lang.Object r3 = A08(r9)     // Catch:{ 5Al -> 0x1350 }
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 5Al -> 0x1350 }
            if (r0 == 0) goto L_0x12e3
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = "UserError: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ 5Al -> 0x1350 }
            X.5Al r1 = new X.5Al     // Catch:{ 5Al -> 0x1350 }
            r1.<init>(r0)     // Catch:{ 5Al -> 0x1350 }
        L_0x12e2:
            throw r1     // Catch:{ 5Al -> 0x1350 }
        L_0x12e3:
            java.lang.String r0 = "Expected stack value of string type for opcode "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            r1 = 12
            java.lang.String[] r0 = X.AnonymousClass49C.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r1]     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ 5Al -> 0x1350 }
            A0D(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            goto L_0x0075
        L_0x12fc:
            int r6 = r9.A01     // Catch:{ 5Al -> 0x1350 }
            int r0 = r6 + -1
            java.lang.Object[] r5 = r9.A05     // Catch:{ 5Al -> 0x1350 }
            r4 = r5[r0]     // Catch:{ 5Al -> 0x1350 }
            int r3 = r9.A00     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3 - r10
            int[] r1 = r9.A04     // Catch:{ 5Al -> 0x1350 }
            r2 = r1[r0]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r5[r0] = r4     // Catch:{ 5Al -> 0x1350 }
            r1 = r1[r3]     // Catch:{ 5Al -> 0x1350 }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r6 = r6 - r0
            r9.A0O(r6)     // Catch:{ 5Al -> 0x1350 }
            r9.A00 = r1     // Catch:{ 5Al -> 0x1350 }
            return
        L_0x1324:
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String[] r0 = X.AnonymousClass49C.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r3]     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            A0D(r0, r2)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            throw r0     // Catch:{ 5Al -> 0x1350 }
        L_0x133a:
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 5Al -> 0x1350 }
            java.lang.String[] r0 = X.AnonymousClass49C.A00     // Catch:{ 5Al -> 0x1350 }
            r0 = r0[r7]     // Catch:{ 5Al -> 0x1350 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 5Al -> 0x1350 }
            A0D(r0, r3)     // Catch:{ 5Al -> 0x1350 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Al -> 0x1350 }
            throw r0     // Catch:{ 5Al -> 0x1350 }
        L_0x1350:
            r4 = move-exception
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            java.lang.String r0 = r4.getMessage()
            java.io.StringWriter r1 = r5.append(r0)
            r0 = 10
            java.io.StringWriter r6 = r1.append(r0)
            java.lang.String r0 = "mins stack trace:\n"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r0)
            int r2 = r9.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r9.A05
            r0 = r0[r1]
            X.4Gs r1 = A03(r0)
            r0 = r17
            A09(r1, r7, r0)
        L_0x137b:
            int[] r1 = r9.A04
            r3 = r1[r2]
            if (r3 != 0) goto L_0x13a5
            java.lang.String r0 = r7.toString()
            r6.append(r0)
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L_0x139b
            java.lang.String r0 = "\n\nNative Stack Trace:\n"
            r5.append(r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r5)
            r1.printStackTrace(r0)
        L_0x139b:
            java.lang.String r1 = r5.toString()
            X.5Aq r0 = new X.5Aq
            r0.<init>(r1, r4)
            throw r0
        L_0x13a5:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r3 + -4
            java.lang.Object[] r0 = r9.A05
            r0 = r0[r1]
            X.4Gs r0 = A03(r0)
            A09(r0, r7, r2)
            r2 = r3
            goto L_0x137b
        L_0x13b8:
            r0 = 0
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90934f6.A0M():void");
    }

    public final void A0N() {
        int i2 = this.A01 - 1;
        this.A01 = i2;
        this.A05[i2] = null;
    }

    public final void A0O(int i2) {
        int i3 = this.A01 - i2;
        this.A01 = i3;
        Arrays.fill(this.A05, i3, i2 + i3, (Object) null);
    }

    public final void A0P(int i2) {
        Object[] objArr = this.A05;
        int length = objArr.length;
        int i3 = this.A01;
        if (length - i3 < i2) {
            int i4 = i3 + i2;
            int i5 = 536870912;
            if (i4 > 536870912) {
                throw AnonymousClass000.A0V("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i4);
            if (length <= 536870912) {
                i5 = length;
            }
            Object[] objArr2 = new Object[i5];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            this.A05 = objArr2;
            int[] iArr = new int[i5];
            System.arraycopy(this.A04, 0, iArr, 0, this.A01);
            this.A04 = iArr;
        }
    }

    public final void A0Q(int i2, Object obj) {
        this.A05[(this.A01 - i2) - 1] = obj;
    }

    public final void A0R(int i2, String str) {
        int i3;
        double d2;
        int i4 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i4];
        Object obj2 = objArr[i4 - 1];
        Number A042 = A04(obj2);
        Number A043 = A04(obj);
        if (A042 == null || A043 == null) {
            A0E(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Incompatible operand types of ")), obj2, obj);
            throw AnonymousClass000.A0Z();
        }
        switch (i2) {
            case 0:
                d2 = A042.doubleValue() * A043.doubleValue();
                break;
            case 1:
                d2 = (double) ((int) ((A042.longValue() & 4294967295L) * (A043.longValue() & 4294967295L)));
                break;
            case 2:
                d2 = A042.doubleValue() / A043.doubleValue();
                break;
            case 3:
                d2 = A042.doubleValue() % A043.doubleValue();
                break;
            case 4:
                d2 = A042.doubleValue() - A043.doubleValue();
                break;
            case 5:
                d2 = A042.doubleValue() + A043.doubleValue();
                break;
            case 6:
                i3 = ((int) ((long) A042.doubleValue())) & ((int) ((long) A043.doubleValue()));
                break;
            case 7:
                i3 = ((int) ((long) A042.doubleValue())) | ((int) ((long) A043.doubleValue()));
                break;
            case 8:
                i3 = ((int) ((long) A042.doubleValue())) ^ ((int) ((long) A043.doubleValue()));
                break;
            case 9:
                i3 = ((int) ((long) A042.doubleValue())) << (((int) ((long) A043.doubleValue())) & 31);
                break;
            case 10:
                i3 = ((int) ((long) A042.doubleValue())) >> (((int) ((long) A043.doubleValue())) & 31);
                break;
            default:
                d2 = (double) (((long) (((int) ((long) A042.doubleValue())) >>> (((int) ((long) A043.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        d2 = (double) i3;
        A0Q(1, C89554cQ.A00(d2));
        A0N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        A0Q(1, java.lang.Long.valueOf(r4));
        A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(int r11, java.lang.String r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05
            r2 = r0[r1]
            r3 = 1
            int r1 = r1 - r3
            r1 = r0[r1]
            java.lang.Number r9 = A06(r1)
            java.lang.Number r8 = A06(r2)
            if (r9 == 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            r4 = 0
            r6 = 63
            switch(r11) {
                case 12: goto L_0x0035;
                case 13: goto L_0x003f;
                case 14: goto L_0x00ac;
                case 15: goto L_0x0054;
                case 16: goto L_0x005e;
                case 17: goto L_0x0068;
                case 18: goto L_0x0072;
                case 19: goto L_0x007c;
                case 20: goto L_0x0086;
                case 21: goto L_0x0092;
                default: goto L_0x001f;
            }
        L_0x001f:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >>> r0
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.A0Q(r3, r0)
            r10.A0N()
            return
        L_0x0035:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 * r0
            goto L_0x002a
        L_0x003f:
            long r1 = r8.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "INT64_DIV division by zero"
            goto L_0x00b6
        L_0x004a:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 / r0
            goto L_0x002a
        L_0x0054:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 - r0
            goto L_0x002a
        L_0x005e:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 + r0
            goto L_0x002a
        L_0x0068:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 & r0
            goto L_0x002a
        L_0x0072:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 | r0
            goto L_0x002a
        L_0x007c:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 ^ r0
            goto L_0x002a
        L_0x0086:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 << r0
            goto L_0x002a
        L_0x0092:
            long r4 = r9.longValue()
            long r1 = r8.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >> r0
            goto L_0x002a
        L_0x009e:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r12, r0)
            A0E(r0, r1, r2)
            goto L_0x00b9
        L_0x00ac:
            long r1 = r8.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "INT64_MOD division by zero"
        L_0x00b6:
            A0B(r0)
        L_0x00b9:
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x00be:
            long r4 = r9.longValue()
            long r0 = r8.longValue()
            long r4 = r4 % r0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90934f6.A0S(int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r4 > 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r4 < 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r9 != 1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L_0x003f
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x003f
            long r2 = X.C13700nu.A01(r2)
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x003d
            java.lang.Number r4 = (java.lang.Number) r4
        L_0x0020:
            long r0 = r4.longValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0026:
            if (r9 == 0) goto L_0x0072
            if (r9 == r5) goto L_0x006d
        L_0x002a:
            if (r9 == r6) goto L_0x003a
            if (r4 > 0) goto L_0x002f
        L_0x002e:
            r7 = 1
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A0Q(r5, r0)
            r8.A0N()
            return
        L_0x003a:
            if (r4 >= 0) goto L_0x002f
            goto L_0x002e
        L_0x003d:
            r4 = 0
            goto L_0x0020
        L_0x003f:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L_0x0026
        L_0x0050:
            java.lang.Number r1 = A04(r2)
            java.lang.Number r0 = A04(r4)
            if (r1 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0075
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L_0x0070
            if (r9 == r5) goto L_0x006b
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x002a
        L_0x006b:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x006d:
            if (r4 <= 0) goto L_0x002f
            goto L_0x002e
        L_0x0070:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0072:
            if (r4 < 0) goto L_0x002f
            goto L_0x002e
        L_0x0075:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r10, r0)
            A0E(r0, r2, r4)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90934f6.A0T(int, java.lang.String):void");
    }

    public void A0U(Object obj) {
        Object[] objArr = this.A05;
        int i2 = this.A01;
        objArr[i2] = obj;
        this.A01 = i2 + 1;
    }

    public final void A0V(Object obj, int i2, Object obj2, int i3) {
        A0U(obj);
        int[] iArr = this.A04;
        int i4 = this.A01;
        iArr[i4] = i2;
        this.A01 = i4 + 1;
        A0U(obj2);
        int i5 = this.A01;
        iArr[i5] = i3;
        int i6 = i5 + 1;
        this.A01 = i6;
        iArr[i6] = this.A00;
        int i7 = i6 + 1;
        this.A01 = i7;
        this.A00 = i7 - 1;
    }
}
