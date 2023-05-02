package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.io.IOUtils;

/* renamed from: X.3Z1  reason: invalid class name */
public abstract class AnonymousClass3Z1 extends C98284rO {
    public static Map zzjr = new ConcurrentHashMap();
    public C90134dY zzjp = C90134dY.A05;
    public int zzjq = -1;

    public static int A00(C32591gd r3, Object obj) {
        C98284rO r4 = (C98284rO) obj;
        AnonymousClass3Z1 r2 = (AnonymousClass3Z1) r4;
        int i2 = r2.zzjq;
        if (i2 != -1) {
            return i2;
        }
        int AjN = r3.AjN(r4);
        r2.zzjq = AjN;
        return AjN;
    }

    public static C90134dY A01(Object obj) {
        AnonymousClass3Z1 r5 = (AnonymousClass3Z1) obj;
        C90134dY r1 = r5.zzjp;
        if (r1 != C90134dY.A05) {
            return r1;
        }
        C90134dY r0 = new C90134dY(new int[8], new Object[8], 0, true);
        r5.zzjp = r0;
        return r0;
    }

    public static Object A02(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static String A03(AnonymousClass556 r5) {
        String str;
        StringBuilder A0g = C13690nt.A0g(r5.A02());
        for (int i2 = 0; i2 < r5.A02(); i2++) {
            int A01 = r5.A01(i2);
            if (A01 != 34) {
                if (A01 == 39) {
                    str = "\\'";
                } else if (A01 != 92) {
                    switch (A01) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A01 < 32 || A01 > 126) {
                                A0g.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                                A0g.append((char) (((A01 >>> 6) & 3) + 48));
                                A0g.append((char) (((A01 >>> 3) & 7) + 48));
                                A01 = (A01 & 7) + 48;
                            }
                            A0g.append((char) A01);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0g.append(str);
            } else {
                str = "\\\"";
                A0g.append(str);
            }
        }
        return A0g.toString();
    }

    public static final String A04(String str) {
        StringBuilder A0o = AnonymousClass000.A0o();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                A0o.append("_");
            }
            A0o.append(Character.toLowerCase(charAt));
        }
        return A0o.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r1.getReturnType().equals(java.util.List.class) != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        A06(A02(r13, r1, new java.lang.Object[0]), A04(r11), r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        if (java.lang.reflect.Modifier.isPublic(r1.getModifiers()) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass5UZ r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r7 = r0.getDeclaredMethods()
            int r6 = r7.length
            r3 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r2 = "get"
            if (r1 >= r6) goto L_0x0024
            r0 = r7[r1]
            X.AnonymousClass3K2.A1S(r0, r8, r4, r5)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            java.util.Iterator r12 = r8.iterator()
        L_0x0028:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.String r6 = X.AnonymousClass000.A0m(r12)
            java.lang.String r7 = ""
            java.lang.String r8 = r6.replaceFirst(r2, r7)
            java.lang.String r1 = "List"
            boolean r0 = r8.endsWith(r1)
            r9 = 1
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r8.endsWith(r0)
            if (r0 != 0) goto L_0x0087
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = X.AnonymousClass3K3.A0n(r8)
            int r0 = r8.length()
            int r0 = r0 + -4
            java.lang.String r0 = r8.substring(r9, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = X.C13680ns.A0g(r0, r1)
            java.lang.Object r1 = r5.get(r6)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x0087
            java.lang.Class r10 = r1.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0087
        L_0x0079:
            java.lang.String r6 = A04(r11)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A02(r13, r1, r0)
            A06(r0, r6, r14, r15)
            goto L_0x0028
        L_0x0087:
            java.lang.String r1 = "Map"
            boolean r0 = r8.endsWith(r1)
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r1 = X.AnonymousClass3K3.A0n(r8)
            int r0 = r8.length()
            int r0 = r0 + -3
            java.lang.String r0 = r8.substring(r9, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = X.C13680ns.A0g(r0, r1)
            java.lang.Object r1 = r5.get(r6)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00d2
            java.lang.Class r6 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00d2
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00d2
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x00d2
            goto L_0x0079
        L_0x00d2:
            java.lang.String r0 = "set"
            int r6 = r8.length()
            java.lang.String r0 = X.AnonymousClass3K3.A0o(r0, r8, r6)
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L_0x00fe
            int r0 = r6 + -5
            java.lang.String r0 = r8.substring(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.C13680ns.A0g(r0, r2)
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0028
        L_0x00fe:
            java.lang.String r1 = X.AnonymousClass3K3.A0n(r8)
            java.lang.String r0 = r8.substring(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = X.C13680ns.A0g(r0, r1)
            java.lang.String r0 = X.AnonymousClass3K3.A0o(r2, r8, r6)
            java.lang.Object r1 = r5.get(r0)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = "has"
            java.lang.String r0 = X.AnonymousClass3K3.A0o(r0, r8, r6)
            java.lang.Object r6 = r5.get(r0)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r1 = A02(r13, r1, r0)
            if (r6 != 0) goto L_0x0188
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x013a
            boolean r0 = X.AnonymousClass000.A1X(r1)
        L_0x0136:
            if (r0 != 0) goto L_0x0194
            goto L_0x0028
        L_0x013a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0143
            int r0 = X.AnonymousClass000.A0D(r1)
            goto L_0x0136
        L_0x0143:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x014f
            float r6 = X.AnonymousClass000.A04(r1)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            goto L_0x0136
        L_0x014f:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x015c
            double r8 = X.AnonymousClass3K3.A01(r1)
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            goto L_0x0136
        L_0x015c:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0166
            boolean r0 = r1 instanceof X.AnonymousClass556
            if (r0 == 0) goto L_0x016d
            X.556 r7 = X.AnonymousClass556.A00
        L_0x0166:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x0028
            goto L_0x0194
        L_0x016d:
            boolean r0 = r1 instanceof X.AnonymousClass5UZ
            if (r0 == 0) goto L_0x017c
            r0 = r1
            X.5O3 r0 = (X.AnonymousClass5O3) r0
            X.5UZ r0 = r0.AjA()
            if (r1 != r0) goto L_0x0194
            goto L_0x0028
        L_0x017c:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0194
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x0136
        L_0x0188:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A02(r13, r6, r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0028
        L_0x0194:
            java.lang.String r0 = A04(r10)
            A06(r1, r0, r14, r15)
            goto L_0x0028
        L_0x019d:
            X.3Z1 r13 = (X.AnonymousClass3Z1) r13
            X.4dY r3 = r13.zzjp
            if (r3 == 0) goto L_0x01bc
            r2 = 0
        L_0x01a4:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01bc
            int[] r0 = r3.A03
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r2]
            A06(r0, r1, r14, r15)
            int r2 = r2 + 1
            goto L_0x01a4
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z1.A05(X.5UZ, java.lang.StringBuilder, int):void");
    }

    public static final void A06(Object obj, String str, StringBuilder sb, int i2) {
        String A03;
        if (obj instanceof List) {
            for (Object A06 : (List) obj) {
                A06(A06, str, sb, i2);
            }
        } else if (obj instanceof Map) {
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                A06(A0y.next(), str, sb, i2);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                A03 = A03(new AnonymousClass3ZC(((String) obj).getBytes(AnonymousClass4ZB.A03)));
            } else if (obj instanceof AnonymousClass556) {
                sb.append(": \"");
                A03 = A03((AnonymousClass556) obj);
            } else {
                if (obj instanceof AnonymousClass3Z1) {
                    sb.append(" {");
                    A05((C98284rO) obj, sb, i2 + 2);
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    while (i3 < i2) {
                        sb.append(' ');
                        i3++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i2 + 2;
                    A06(entry.getKey(), "key", sb, i5);
                    A06(entry.getValue(), "value", sb, i5);
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    while (i3 < i2) {
                        sb.append(' ');
                        i3++;
                    }
                } else {
                    sb.append(": ");
                    AnonymousClass000.A1I(obj, sb);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A03);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.5Lv, X.3Z2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [X.5Lv, X.3Z2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v17, types: [X.5Lv, X.3Z2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v23, types: [X.5Lv, X.3Z2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        return java.lang.Byte.valueOf(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass3ZN
            if (r0 == 0) goto L_0x0013
            int[] r0 = X.C815648v.A00
            r4 = 1
            int r6 = r6 - r4
            r0 = r0[r6]
            r3 = 0
            switch(r0) {
                case 1: goto L_0x0135;
                case 2: goto L_0x0046;
                case 3: goto L_0x004c;
                case 4: goto L_0x0063;
                case 5: goto L_0x0035;
                case 6: goto L_0x0130;
                case 7: goto L_0x013a;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            boolean r0 = r5 instanceof X.AnonymousClass3ZQ
            if (r0 == 0) goto L_0x0022
            int[] r0 = X.C815648v.A00
            r4 = 1
            int r6 = r6 - r4
            r0 = r0[r6]
            r3 = 0
            switch(r0) {
                case 1: goto L_0x0077;
                case 2: goto L_0x007d;
                case 3: goto L_0x0083;
                case 4: goto L_0x00a8;
                case 5: goto L_0x0066;
                case 6: goto L_0x0130;
                case 7: goto L_0x013a;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x000e
        L_0x0022:
            boolean r1 = r5 instanceof X.AnonymousClass3ZO
            int[] r0 = X.C815548u.A00
            r4 = 1
            int r6 = r6 - r4
            r0 = r0[r6]
            r3 = 0
            if (r1 == 0) goto L_0x0031
            switch(r0) {
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00ab;
                case 6: goto L_0x0130;
                case 7: goto L_0x013a;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x000e
        L_0x0031:
            switch(r0) {
                case 1: goto L_0x0101;
                case 2: goto L_0x0107;
                case 3: goto L_0x010d;
                case 4: goto L_0x012d;
                case 5: goto L_0x00f0;
                case 6: goto L_0x0130;
                case 7: goto L_0x013a;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x000e
        L_0x0035:
            java.lang.Class<X.3ZN> r1 = X.AnonymousClass3ZN.class
            monitor-enter(r1)
            X.3ZN r0 = X.AnonymousClass3ZN.zzbir     // Catch:{ all -> 0x0043 }
            X.3Z2 r3 = new X.3Z2     // Catch:{ all -> 0x0043 }
            r3.<init>(r0)     // Catch:{ all -> 0x0043 }
            X.AnonymousClass3ZN.zzbg = r3     // Catch:{ all -> 0x0043 }
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0043:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            throw r0
        L_0x0046:
            X.3ZK r3 = new X.3ZK
            r3.<init>()
            return r3
        L_0x004c:
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            r1 = 0
            java.lang.String r0 = "zzbiq"
            r2[r1] = r0
            java.lang.Class<X.3ZQ> r0 = X.AnonymousClass3ZQ.class
            r2[r4] = r0
            java.lang.String r1 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b"
            X.3ZN r0 = X.AnonymousClass3ZN.zzbir
            X.4rK r3 = new X.4rK
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0063:
            X.3ZN r3 = X.AnonymousClass3ZN.zzbir
            return r3
        L_0x0066:
            java.lang.Class<X.3ZQ> r1 = X.AnonymousClass3ZQ.class
            monitor-enter(r1)
            X.3ZQ r0 = X.AnonymousClass3ZQ.zzbiv     // Catch:{ all -> 0x0074 }
            X.3Z2 r3 = new X.3Z2     // Catch:{ all -> 0x0074 }
            r3.<init>(r0)     // Catch:{ all -> 0x0074 }
            X.AnonymousClass3ZQ.zzbg = r3     // Catch:{ all -> 0x0074 }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            return r3
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            X.3ZQ r3 = new X.3ZQ
            r3.<init>()
            return r3
        L_0x007d:
            X.3ZL r3 = new X.3ZL
            r3.<init>()
            return r3
        L_0x0083:
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "zzbb"
            r2[r1] = r0
            java.lang.String r0 = "zzya"
            r2[r4] = r0
            r1 = 2
            java.lang.String r0 = "zzbis"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "zzbit"
            r2[r1] = r0
            r1 = 4
            java.lang.String r0 = "zzbiu"
            r2[r1] = r0
            java.lang.String r1 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003"
            X.3ZQ r0 = X.AnonymousClass3ZQ.zzbiv
            X.4rK r3 = new X.4rK
            r3.<init>(r0, r1, r2)
            return r3
        L_0x00a8:
            X.3ZQ r3 = X.AnonymousClass3ZQ.zzbiv
            return r3
        L_0x00ab:
            java.lang.Class<X.3ZO> r1 = X.AnonymousClass3ZO.class
            monitor-enter(r1)
            X.3ZO r0 = X.AnonymousClass3ZO.zzbfc     // Catch:{ all -> 0x00b9 }
            X.3Z2 r3 = new X.3Z2     // Catch:{ all -> 0x00b9 }
            r3.<init>(r0)     // Catch:{ all -> 0x00b9 }
            X.AnonymousClass3ZO.zzbg = r3     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            return r3
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            throw r0
        L_0x00bc:
            X.3ZO r3 = X.AnonymousClass3ZO.zzbfc
            return r3
        L_0x00bf:
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "zzbb"
            r2[r1] = r0
            java.lang.String r0 = "zzbfa"
            r2[r4] = r0
            r1 = 2
            X.5O1 r0 = X.AnonymousClass43E.A00
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "zzbfb"
            r2[r1] = r0
            r1 = 4
            X.5O1 r0 = X.AnonymousClass43F.A00
            r2[r1] = r0
            java.lang.String r1 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001"
            X.3ZO r0 = X.AnonymousClass3ZO.zzbfc
            X.4rK r3 = new X.4rK
            r3.<init>(r0, r1, r2)
            return r3
        L_0x00e4:
            X.3ZJ r3 = new X.3ZJ
            r3.<init>()
            return r3
        L_0x00ea:
            X.3ZO r3 = new X.3ZO
            r3.<init>()
            return r3
        L_0x00f0:
            java.lang.Class<X.3ZP> r1 = X.AnonymousClass3ZP.class
            monitor-enter(r1)
            X.3ZP r0 = X.AnonymousClass3ZP.zztx     // Catch:{ all -> 0x00fe }
            X.3Z2 r3 = new X.3Z2     // Catch:{ all -> 0x00fe }
            r3.<init>(r0)     // Catch:{ all -> 0x00fe }
            X.AnonymousClass3ZP.zzbg = r3     // Catch:{ all -> 0x00fe }
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            return r3
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            throw r0
        L_0x0101:
            X.3ZP r3 = new X.3ZP
            r3.<init>()
            return r3
        L_0x0107:
            X.3ZI r3 = new X.3ZI
            r3.<init>()
            return r3
        L_0x010d:
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "zzbb"
            r2[r1] = r0
            java.lang.String r0 = "zztu"
            r2[r4] = r0
            r1 = 2
            java.lang.String r0 = "zztv"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "zztw"
            r2[r1] = r0
            java.lang.String r1 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002"
            X.3ZP r0 = X.AnonymousClass3ZP.zztx
            X.4rK r3 = new X.4rK
            r3.<init>(r0, r1, r2)
            return r3
        L_0x012d:
            X.3ZP r3 = X.AnonymousClass3ZP.zztx
            return r3
        L_0x0130:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
        L_0x0135:
            X.3ZN r3 = new X.3ZN
            r3.<init>()
        L_0x013a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z1.A07(int):java.lang.Object");
    }

    public final int Aiz() {
        int i2 = this.zzjq;
        if (i2 != -1) {
            return i2;
        }
        int AjN = AnonymousClass3K3.A0Y(this).AjN(this);
        this.zzjq = AjN;
        return AjN;
    }

    public final /* synthetic */ AnonymousClass5UZ AjA() {
        return (C98284rO) A07(6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A07(6).getClass().isInstance(obj)) {
            return false;
        }
        return AnonymousClass3K3.A0Y(this).A8b(this, obj);
    }

    public int hashCode() {
        int i2 = this.zzex;
        if (i2 != 0) {
            return i2;
        }
        int AHj = AnonymousClass3K3.A0Y(this).AHj(this);
        this.zzex = AHj;
        return AHj;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0r = AnonymousClass000.A0r("# ");
        A0r.append(obj);
        A05(this, A0r, 0);
        return A0r.toString();
    }
}
