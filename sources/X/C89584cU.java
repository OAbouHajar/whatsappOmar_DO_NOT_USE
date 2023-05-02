package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4cU  reason: invalid class name and case insensitive filesystem */
public final class C89584cU {
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass4IP r10, java.lang.Object r11) {
        /*
            boolean r0 = r11 instanceof java.util.Map
            if (r0 == 0) goto L_0x00e7
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r11 = (java.util.Map) r11
            java.util.Iterator r9 = X.AnonymousClass000.A0y(r11)
        L_0x000f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0101
            java.util.Map$Entry r8 = X.AnonymousClass000.A0z(r9)
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r8.getKey()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = ".$"
            r1 = 0
            boolean r0 = X.C008703y.A0M(r0, r5)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r2 = r8.getValue()
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = (java.lang.String) r2
            r6 = 0
            X.C18450wi.A0H(r2, r1)
            X.4an r1 = r10.A00
            if (r1 != 0) goto L_0x004c
            java.util.Map r0 = r10.A01
            X.4an r1 = X.C89844d1.A00(r0)
            r10.A00 = r1
        L_0x004c:
            r4 = 0
            X.5OQ[] r0 = new X.AnonymousClass5OQ[r6]     // Catch:{ 3ft -> 0x0053 }
            java.lang.Object r4 = r1.A01(r2, r0)     // Catch:{ 3ft -> 0x0053 }
        L_0x0053:
            if (r4 != 0) goto L_0x00a2
            java.lang.String r0 = "FcsStateIoUtils/evaluate/required path failed to evaluate. Found a null value for '"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.Object r0 = r8.getKey()
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.AssertionError r0 = X.AnonymousClass3K4.A0T(r0)
            throw r0
        L_0x0071:
            java.lang.Object r0 = r8.getKey()
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = ".$?"
            boolean r0 = X.C008703y.A0M(r0, r5)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r2 = r8.getValue()
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = (java.lang.String) r2
            r6 = 0
            X.C18450wi.A0H(r2, r1)
            X.4an r1 = r10.A00
            if (r1 != 0) goto L_0x0099
            java.util.Map r0 = r10.A01
            X.4an r1 = X.C89844d1.A00(r0)
            r10.A00 = r1
        L_0x0099:
            r4 = 0
            X.5OQ[] r0 = new X.AnonymousClass5OQ[r6]     // Catch:{ 3ft -> 0x00a0 }
            java.lang.Object r4 = r1.A01(r2, r0)     // Catch:{ 3ft -> 0x00a0 }
        L_0x00a0:
            if (r4 == 0) goto L_0x000f
        L_0x00a2:
            java.lang.Object r2 = r8.getKey()
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = (java.lang.String) r2
            X.C18450wi.A0H(r2, r6)
            boolean r0 = X.C008703y.A0M(r2, r5)
            if (r0 == 0) goto L_0x00c3
            int r1 = r2.length()
            int r0 = r5.length()
            int r1 = r1 - r0
            java.lang.String r2 = r2.substring(r6, r1)
            X.C18450wi.A0B(r2)
        L_0x00c3:
            r3.put(r2, r4)
            goto L_0x000f
        L_0x00c8:
            java.lang.Object r1 = r8.getKey()
            if (r1 == 0) goto L_0x00db
            java.lang.Object r0 = r8.getValue()
            java.lang.Object r0 = A00(r10, r0)
            r3.put(r1, r0)
            goto L_0x000f
        L_0x00db:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r7)
            throw r0
        L_0x00e0:
            java.lang.String r0 = "FcsStateIoUtils/evaluate/key in map is not string"
            java.lang.AssertionError r0 = X.AnonymousClass3K4.A0T(r0)
            throw r0
        L_0x00e7:
            boolean r0 = r11 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0102
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            r2 = 0
            int r1 = r11.length
        L_0x00f3:
            if (r2 >= r1) goto L_0x0101
            r0 = r11[r2]
            int r2 = r2 + 1
            java.lang.Object r0 = A00(r10, r0)
            r3.add(r0)
            goto L_0x00f3
        L_0x0101:
            return r3
        L_0x0102:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89584cU.A00(X.4IP, java.lang.Object):java.lang.Object");
    }

    public static final Object A01(Map map, Object obj) {
        AnonymousClass4IP r0 = new AnonymousClass4IP(map);
        if (obj == null) {
            return r0.A01;
        }
        Object A00 = A00(r0, obj);
        if (A00 != null) {
            return A00;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Any");
    }

    public static final Map A02(String str, Map map, Map map2) {
        String str2;
        C18450wi.A0H(map, 0);
        if (str == null) {
            return map;
        }
        if (str.equals("$")) {
            return map2;
        }
        if (str.equals("#")) {
            if (map2 == null) {
                map2 = AnonymousClass1Z8.A00;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            return linkedHashMap;
        }
        String str3 = str;
        if (!str.startsWith("$.")) {
            str2 = "FcsStateIoUtils/createPath/path should start with '$.'";
        } else if (!C008603x.A0F(str, "[")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            if (C008703y.A0N(str, "$.")) {
                str3 = str.substring("$.".length());
                C18450wi.A0B(str3);
            }
            Map map3 = linkedHashMap2;
            for (Object next : C008603x.A09(str3, new String[]{"."}, 0)) {
                if (!map3.containsKey(next) || !(map3.get(next) instanceof Map)) {
                    map3.put(next, new LinkedHashMap());
                }
                Object obj = map3.get(next);
                if (obj != null) {
                    map3 = C90284dt.A00(obj);
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            }
            C88604an A00 = C89844d1.A00(linkedHashMap2);
            C89844d1 A002 = C88604an.A00(str, new AnonymousClass5OQ[0]);
            Object obj2 = A00.A01;
            AnonymousClass4RV r7 = A00.A00;
            AnonymousClass420 r8 = AnonymousClass420.AS_PATH_LIST;
            EnumSet<E> noneOf = EnumSet.noneOf(AnonymousClass420.class);
            noneOf.addAll(r7.A03);
            noneOf.addAll(Arrays.asList(new AnonymousClass420[]{r8}));
            AnonymousClass4RU r1 = new AnonymousClass4RU();
            r1.A00 = r7.A00;
            r1.A01 = r7.A01;
            r1.A03.addAll(noneOf);
            Collection collection = r7.A02;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            r1.A02 = collection;
            AnonymousClass4RV A003 = r1.A00();
            C90264dr.A03(obj2, "json can not be null");
            C90264dr.A03(A003, "configuration can not be null");
            AnonymousClass4TN r3 = A002.A00;
            C89314bx r72 = new C89314bx(A003, r3, obj2, true);
            try {
                r3.A00.A02(new C70023fz(obj2), r72, obj2, "");
            } catch (C105625Ai unused) {
            }
            if (r72.A01().isEmpty()) {
                AnonymousClass420 r0 = AnonymousClass420.SUPPRESS_EXCEPTIONS;
                Set set = A003.A03;
                if (set.contains(r0)) {
                    boolean contains = set.contains(r8);
                    boolean contains2 = set.contains(AnonymousClass420.ALWAYS_RETURN_LIST);
                    if (contains || contains2 || !r3.A00.A05()) {
                        ((C99724uU) A003.A00).A00.A01();
                    }
                } else {
                    throw new C69963ft();
                }
            } else {
                List list = r72.A07;
                Collections.sort(list);
                for (AnonymousClass552 r10 : Collections.unmodifiableCollection(list)) {
                    if (r10 instanceof C70023fz) {
                        throw new C69973fu();
                    } else if (r10 instanceof C70043g1) {
                        C70043g1 r102 = (C70043g1) r10;
                        A003.A00.AeR(r102.A00, r102.A00, map2);
                    } else if (r10 instanceof C70033g0) {
                        C70033g0 r103 = (C70033g0) r10;
                        for (Object AeR : r103.A00) {
                            A003.A00.AeR(r103.A00, AeR, map2);
                        }
                    } else if (r10 instanceof C70053g2) {
                        C70053g2 r104 = (C70053g2) r10;
                        A003.A00.AdY(r104.A00, r104.A00, map2);
                    }
                }
                if (A003.A03.contains(r8)) {
                    r72.A01();
                }
            }
            return (Map) A00.A01("$", new AnonymousClass5OQ[0]);
        } else {
            str2 = "FcsStateIoUtils/createPath/currently lacking support for arrays, filters, or multiple targets";
        }
        throw AnonymousClass3K4.A0T(str2);
    }
}
