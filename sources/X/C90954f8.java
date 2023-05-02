package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4f8  reason: invalid class name and case insensitive filesystem */
public final class C90954f8 {
    public static final AnonymousClass45G A00;
    public static final AnonymousClass45G A01;
    public static final AnonymousClass45G A02 = new AnonymousClass45G();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ all -> 0x004c }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r4 = 0
            r5 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002a
            r3 = 1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x002a }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x002a }
            java.lang.reflect.Constructor r2 = X.AnonymousClass3K4.A0c(r2, r0, r1, r4)     // Catch:{ all -> 0x002a }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x002a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = X.AnonymousClass3K4.A0W(r0, r2, r1, r4)     // Catch:{ all -> 0x002a }
            X.45G r0 = (X.AnonymousClass45G) r0     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r0 = r5
        L_0x002b:
            A00 = r0
            r4 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004c
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x004c }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004c }
            r3 = 0
            java.lang.reflect.Constructor r2 = X.AnonymousClass3K4.A0c(r2, r0, r1, r3)     // Catch:{ all -> 0x004c }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = X.AnonymousClass3K4.A0W(r0, r2, r1, r3)     // Catch:{ all -> 0x004c }
            X.45G r0 = (X.AnonymousClass45G) r0     // Catch:{ all -> 0x004c }
            r5 = r0
        L_0x004c:
            A01 = r5
            X.45G r0 = new X.45G
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90954f8.<clinit>():void");
    }

    public static int A00(C32591gd r2, Object obj, int i2) {
        int A0A;
        int A002;
        if (obj instanceof C89354c1) {
            C89354c1 r3 = (C89354c1) obj;
            A0A = AnonymousClass3K3.A0A(i2);
            A002 = r3.A00 != null ? r3.A00.A02() : r3.A01 != null ? r3.A01.Aiz() : 0;
        } else {
            A0A = AnonymousClass3K3.A0A(i2);
            A002 = AnonymousClass3Z1.A00(r2, (AnonymousClass5UZ) obj);
        }
        return AnonymousClass3K4.A05(A002, A0A);
    }

    public static int A01(C32591gd r5, List list, int i2) {
        int A002;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A0A = AnonymousClass3K3.A0A(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C89354c1) {
                C89354c1 r1 = (C89354c1) obj;
                A002 = r1.A00 != null ? r1.A00.A02() : r1.A01 != null ? r1.A01.Aiz() : 0;
            } else {
                A002 = AnonymousClass3Z1.A00(r5, (AnonymousClass5UZ) obj);
            }
            A0A = AnonymousClass3K4.A05(A002, A0A);
        }
        return A0A;
    }

    public static int A02(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z8) {
            AnonymousClass3Z8 r5 = (AnonymousClass3Z8) list;
            i2 = 0;
            while (i3 < size) {
                r5.A03(i3);
                i2 += C32561ga.A01(r5.A01[i3]);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + C32561ga.A01(C13690nt.A0A(list, i3));
                i3++;
            }
        }
        return i2;
    }

    public static int A03(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z8) {
            AnonymousClass3Z8 r5 = (AnonymousClass3Z8) list;
            i2 = 0;
            while (i3 < size) {
                r5.A03(i3);
                i2 += C32561ga.A01(r5.A01[i3]);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + C32561ga.A01(C13690nt.A0A(list, i3));
                i3++;
            }
        }
        return i2;
    }

    public static int A04(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z8) {
            AnonymousClass3Z8 r6 = (AnonymousClass3Z8) list;
            i2 = 0;
            while (i3 < size) {
                r6.A03(i3);
                i2 += C32561ga.A01(AnonymousClass3K3.A0R(r6.A01[i3]));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + C32561ga.A01(AnonymousClass3K2.A0I(list, i3));
                i3++;
            }
        }
        return i2;
    }

    public static int A05(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z7) {
            AnonymousClass3Z7 r4 = (AnonymousClass3Z7) list;
            i2 = 0;
            while (i3 < size) {
                r4.A03(i3);
                i2 += AnonymousClass3K3.A09(r4.A01[i3]);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + AnonymousClass3K3.A09(AnonymousClass000.A0D(list.get(i3)));
                i3++;
            }
        }
        return i2;
    }

    public static int A06(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z7) {
            AnonymousClass3Z7 r4 = (AnonymousClass3Z7) list;
            i2 = 0;
            while (i3 < size) {
                r4.A03(i3);
                i2 += AnonymousClass3K3.A09(r4.A01[i3]);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + AnonymousClass3K3.A09(AnonymousClass000.A0D(list.get(i3)));
                i3++;
            }
        }
        return i2;
    }

    public static int A07(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z7) {
            AnonymousClass3Z7 r4 = (AnonymousClass3Z7) list;
            i2 = 0;
            while (i3 < size) {
                r4.A03(i3);
                i2 += C32561ga.A00(r4.A01[i3]);
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + C32561ga.A00(AnonymousClass000.A0D(list.get(i3)));
                i3++;
            }
        }
        return i2;
    }

    public static int A08(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass3Z7) {
            AnonymousClass3Z7 r5 = (AnonymousClass3Z7) list;
            i2 = 0;
            while (i3 < size) {
                r5.A03(i3);
                int i4 = r5.A01[i3];
                i2 += C32561ga.A00((i4 >> 31) ^ (i4 << 1));
                i3++;
            }
        } else {
            int i5 = 0;
            while (i3 < size) {
                int A0D = AnonymousClass000.A0D(list.get(i3));
                i5 = i2 + C32561ga.A00((A0D >> 31) ^ (A0D << 1));
                i3++;
            }
        }
        return i2;
    }

    public static int A09(List list, int i2) {
        int length;
        int length2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int A0A = AnonymousClass3K3.A0A(i2) * size;
        if (list instanceof C109995Up) {
            C109995Up r5 = (C109995Up) list;
            while (i3 < size) {
                Object AFN = r5.AFN(i3);
                if (AFN instanceof AnonymousClass556) {
                    length2 = ((AnonymousClass556) AFN).A02();
                } else {
                    String str = (String) AFN;
                    try {
                        length2 = C90324dx.A00(str);
                    } catch (AnonymousClass442 unused) {
                        length2 = str.getBytes(AnonymousClass4ZB.A03).length;
                    }
                }
                A0A = AnonymousClass3K4.A05(length2, A0A);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof AnonymousClass556) {
                    length = ((AnonymousClass556) obj).A02();
                } else {
                    String str2 = (String) obj;
                    try {
                        length = C90324dx.A00(str2);
                    } catch (AnonymousClass442 unused2) {
                        length = str2.getBytes(AnonymousClass4ZB.A03).length;
                    }
                }
                A0A = AnonymousClass3K4.A05(length, A0A);
                i3++;
            }
        }
        return A0A;
    }

    public static void A0A(C32591gd r4, C107915Lx r5, List list, int i2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj = list.get(i3);
                C32561ga r1 = r52.A00;
                AnonymousClass5UZ r2 = (AnonymousClass5UZ) obj;
                AnonymousClass3K3.A1A(r1, i2);
                r1.A08(AnonymousClass3Z1.A00(r4, r2));
                r4.Aiv(r1.A00, r2);
            }
        }
    }

    public static void A0B(C107915Lx r5, List list, int i2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (list instanceof C109995Up) {
                C109995Up r3 = (C109995Up) list;
                while (i3 < list.size()) {
                    Object AFN = r3.AFN(i3);
                    boolean z2 = AFN instanceof String;
                    C32561ga r0 = r52.A00;
                    if (z2) {
                        r0.A0A(i2, (String) AFN);
                    } else {
                        AnonymousClass3K2.A16((AnonymousClass556) AFN, r0, i2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r52.A00.A0A(i2, AnonymousClass000.A0n(list, i3));
                i3++;
            }
        }
    }

    public static void A0C(C107915Lx r3, List list, int i2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r32 = (C98344rU) r3;
            for (int i3 = 0; i3 < list.size(); i3++) {
                AnonymousClass3K2.A16((AnonymousClass556) list.get(i3), r32.A00, i2);
            }
        }
    }

    public static void A0D(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 8;
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    r43.A0C(Double.doubleToRawLongBits(AnonymousClass3K3.A01(list.get(i3))));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K4.A0p(r42.A00, i2, Double.doubleToRawLongBits(AnonymousClass3K3.A01(list.get(i3))));
                i3++;
            }
        }
    }

    public static void A0E(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 4;
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    r43.A09(Float.floatToRawIntBits(AnonymousClass000.A04(list.get(i3))));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K3.A1B(r42.A00, i2, Float.floatToRawIntBits(AnonymousClass000.A04(list.get(i3))));
                i3++;
            }
        }
    }

    public static void A0F(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r53 = r52.A00;
                AnonymousClass3K3.A1A(r53, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += C32561ga.A01(C13690nt.A0A(list, i5));
                }
                r53.A08(i4);
                while (i3 < list.size()) {
                    r53.A0B(C13690nt.A0A(list, i3));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r3 = r52.A00;
                long A0A = C13690nt.A0A(list, i3);
                r3.A08(i2 << 3);
                r3.A0B(A0A);
                i3++;
            }
        }
    }

    public static void A0G(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r53 = r52.A00;
                AnonymousClass3K3.A1A(r53, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += C32561ga.A01(C13690nt.A0A(list, i5));
                }
                r53.A08(i4);
                while (i3 < list.size()) {
                    r53.A0B(C13690nt.A0A(list, i3));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r3 = r52.A00;
                long A0A = C13690nt.A0A(list, i3);
                r3.A08(i2 << 3);
                r3.A0B(A0A);
                i3++;
            }
        }
    }

    public static void A0H(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r53 = r52.A00;
                AnonymousClass3K3.A1A(r53, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += C32561ga.A01(AnonymousClass3K2.A0I(list, i5));
                }
                r53.A08(i4);
                while (i3 < list.size()) {
                    r53.A0B(AnonymousClass3K2.A0I(list, i3));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r3 = r52.A00;
                long A0I = AnonymousClass3K2.A0I(list, i3);
                r3.A08(i2 << 3);
                r3.A0B(A0I);
                i3++;
            }
        }
    }

    public static void A0I(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r3 = r52.A00;
                AnonymousClass3K3.A1A(r3, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 8;
                }
                r3.A08(i4);
                while (i3 < list.size()) {
                    r3.A0C(C13690nt.A0A(list, i3));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K4.A0p(r52.A00, i2, C13690nt.A0A(list, i3));
                i3++;
            }
        }
    }

    public static void A0J(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r3 = r52.A00;
                AnonymousClass3K3.A1A(r3, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 8;
                }
                r3.A08(i4);
                while (i3 < list.size()) {
                    r3.A0C(C13690nt.A0A(list, i3));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K4.A0p(r52.A00, i2, C13690nt.A0A(list, i3));
                i3++;
            }
        }
    }

    public static void A0K(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += AnonymousClass3K3.A09(AnonymousClass000.A0D(list.get(i5)));
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    int A0D = AnonymousClass000.A0D(list.get(i3));
                    if (A0D >= 0) {
                        r43.A08(A0D);
                    } else {
                        r43.A0B((long) A0D);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r2 = r42.A00;
                int A0D2 = AnonymousClass000.A0D(list.get(i3));
                r2.A08(i2 << 3);
                if (A0D2 >= 0) {
                    r2.A08(A0D2);
                } else {
                    r2.A0B((long) A0D2);
                }
                i3++;
            }
        }
    }

    public static void A0L(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += C32561ga.A00(AnonymousClass000.A0D(list.get(i5)));
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    r43.A08(AnonymousClass000.A0D(list.get(i3)));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r2 = r42.A00;
                int A0D = AnonymousClass000.A0D(list.get(i3));
                r2.A08(i2 << 3);
                r2.A08(A0D);
                i3++;
            }
        }
    }

    public static void A0M(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r4 = r52.A00;
                AnonymousClass3K3.A1A(r4, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A0D = AnonymousClass000.A0D(list.get(i5));
                    i4 += C32561ga.A00((A0D >> 31) ^ (A0D << 1));
                }
                r4.A08(i4);
                while (i3 < list.size()) {
                    int A0D2 = AnonymousClass000.A0D(list.get(i3));
                    r4.A08((A0D2 >> 31) ^ (A0D2 << 1));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r2 = r52.A00;
                int A0D3 = AnonymousClass000.A0D(list.get(i3));
                r2.A08(i2 << 3);
                r2.A08((A0D3 >> 31) ^ (A0D3 << 1));
                i3++;
            }
        }
    }

    public static void A0N(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r3 = r52.A00;
                AnonymousClass3K3.A1A(r3, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 4;
                }
                r3.A08(i4);
                while (i3 < list.size()) {
                    r3.A09(AnonymousClass000.A0D(list.get(i3)));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K3.A1B(r52.A00, i2, AnonymousClass000.A0D(list.get(i3)));
                i3++;
            }
        }
    }

    public static void A0O(C107915Lx r5, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r52 = (C98344rU) r5;
            int i3 = 0;
            if (z2) {
                C32561ga r3 = r52.A00;
                AnonymousClass3K3.A1A(r3, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4 += 4;
                }
                r3.A08(i4);
                while (i3 < list.size()) {
                    r3.A09(AnonymousClass000.A0D(list.get(i3)));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                AnonymousClass3K3.A1B(r52.A00, i2, AnonymousClass000.A0D(list.get(i3)));
                i3++;
            }
        }
    }

    public static void A0P(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += AnonymousClass3K3.A09(AnonymousClass000.A0D(list.get(i5)));
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    int A0D = AnonymousClass000.A0D(list.get(i3));
                    if (A0D >= 0) {
                        r43.A08(A0D);
                    } else {
                        r43.A0B((long) A0D);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r2 = r42.A00;
                int A0D2 = AnonymousClass000.A0D(list.get(i3));
                r2.A08(i2 << 3);
                if (A0D2 >= 0) {
                    r2.A08(A0D2);
                } else {
                    r2.A0B((long) A0D2);
                }
                i3++;
            }
        }
    }

    public static void A0Q(C107915Lx r4, List list, int i2, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C98344rU r42 = (C98344rU) r4;
            int i3 = 0;
            if (z2) {
                C32561ga r43 = r42.A00;
                AnonymousClass3K3.A1A(r43, i2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5);
                    i4++;
                }
                r43.A08(i4);
                while (i3 < list.size()) {
                    r43.A07(AnonymousClass000.A1X(list.get(i3)) ? (byte) 1 : 0);
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                C32561ga r2 = r42.A00;
                boolean A1X = AnonymousClass000.A1X(list.get(i3));
                r2.A08(i2 << 3);
                r2.A07(A1X ? (byte) 1 : 0);
                i3++;
            }
        }
    }

    public static void A0R(Object obj, Object obj2) {
        AnonymousClass3Z1 r9 = (AnonymousClass3Z1) obj;
        C90134dY r7 = r9.zzjp;
        C90134dY r8 = ((AnonymousClass3Z1) obj2).zzjp;
        if (!r8.equals(C90134dY.A05)) {
            int i2 = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i2);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i2);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            r7 = new C90134dY(copyOf, copyOf2, i2, true);
        }
        r9.zzjp = r7;
    }
}
