package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Wa  reason: invalid class name */
public class AnonymousClass2Wa {
    public final C88184a5 A00;
    public final C31201dg A01;
    public final String A02;

    public AnonymousClass2Wa(C31201dg r20, String str, List list, List list2, List list3, Map map) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        C31201dg r5 = r20;
        C18450wi.A0H(r5, 0);
        List<AnonymousClass4O5> list4 = list2;
        if (list2 != null) {
            arrayList = new ArrayList(AnonymousClass1J9.A0M(list4, 10));
            for (AnonymousClass4O5 r4 : list4) {
                HashMap hashMap = r4.A05;
                if (hashMap != null) {
                    linkedHashMap = new LinkedHashMap(C25421Js.A07(hashMap.size()));
                    for (Map.Entry entry : hashMap.entrySet()) {
                        Object key = entry.getKey();
                        C31201dg A002 = AnonymousClass45Y.A00(r5, new C99314tp((String) entry.getValue()));
                        if (A002 != null) {
                            String A0I = A002.A0I();
                            C18450wi.A0F(A0I);
                            int i2 = A002.A00;
                            List list5 = A002.A05;
                            linkedHashMap.put(key, new AnonymousClass0RH(list5 != null ? C003101j.A0A(list5) : C440222l.A00, i2, A0I));
                        } else {
                            StringBuilder sb = new StringBuilder("Failed to find async component container for ");
                            sb.append(r4.A04);
                            sb.append(':');
                            sb.append(r4.A03);
                            throw new Exception(sb.toString());
                        }
                    }
                    continue;
                } else {
                    linkedHashMap = null;
                }
                String str2 = r4.A04;
                C18450wi.A0B(str2);
                String str3 = r4.A03;
                C18450wi.A0B(str3);
                String str4 = str3;
                arrayList.add(new C05430Rf(r4.A01, r4.A00, r4.A02, str2, str4, linkedHashMap, r4.A06));
            }
        } else {
            arrayList = null;
        }
        this.A00 = new C88184a5(list, list3, arrayList, map);
        this.A01 = r5;
        this.A02 = str;
    }

    public static AnonymousClass2Wa A00(C14960q4 r6, C31201dg r7) {
        Object obj;
        C31201dg r2 = r7;
        if (r6 == null || r7.A01 != 13901) {
            List list = Collections.EMPTY_LIST;
            return new AnonymousClass2Wa(r2, (String) null, list, list, list, Collections.EMPTY_MAP);
        }
        C14930q1 A0H = r7.A0H(35);
        if (A0H != null) {
            try {
                obj = C807345g.A00(C14950q3.A01, A0H, r6);
            } catch (AnonymousClass43P e2) {
                C29691b2.A01("BloksParseResult", "Exception executing Parse Embedded expression", e2);
                obj = A01(new C31201dg(13320));
            }
            return (AnonymousClass2Wa) obj;
        }
        throw new IllegalArgumentException("ParseResultWrapper doesn't have a parse result!");
    }

    public static AnonymousClass2Wa A01(C31201dg r7) {
        List list = Collections.EMPTY_LIST;
        return new AnonymousClass2Wa(r7, (String) null, list, list, list, Collections.EMPTY_MAP);
    }

    public static AnonymousClass2Wa A02(C85424Oj r7, boolean z2) {
        String str = null;
        Map A03 = A03(r7.A05);
        C31201dg r1 = r7.A00;
        if (z2) {
            r1 = AnonymousClass382.A00(new C99154tZ(r1), r1);
        }
        List list = r7.A04;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = r7.A03;
        List list3 = r7.A06;
        if (list3 == null) {
            list3 = Collections.emptyList();
        }
        AnonymousClass4CM r0 = r7.A01;
        if (r0 != null) {
            str = r0.A00;
        }
        return new AnonymousClass2Wa(r1, str, arrayList, list2, list3, A03);
    }

    public static Map A03(List list) {
        if (list == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C87884Za r1 = (C87884Za) it.next();
            hashMap.put(r1.A01, r1);
        }
        return hashMap;
    }

    public static Map A04(List list, Map map) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4ZZ r2 = (AnonymousClass4ZZ) it.next();
            if (map.containsKey(r2.A01)) {
                hashMap.put(r2.A00, hashMap2.remove(r2.A01));
            }
        }
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    public C31201dg A05() {
        return this.A01;
    }
}
