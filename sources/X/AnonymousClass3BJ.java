package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3BJ  reason: invalid class name */
public abstract class AnonymousClass3BJ {
    public List A00;
    public List A01;
    public Map A02;
    public Map A03;
    public final AnonymousClass416 A04;

    public AnonymousClass3BJ(AnonymousClass416 r5) {
        List<C88574aj> emptyList = Collections.emptyList();
        List<C88574aj> emptyList2 = Collections.emptyList();
        this.A04 = r5;
        for (C88574aj A05 : emptyList) {
            A05(A05);
        }
        for (C88574aj r2 : emptyList2) {
            List list = this.A00;
            if (list == null) {
                list = AnonymousClass000.A0u();
                this.A00 = list;
                if (this.A02 == null) {
                    this.A02 = AnonymousClass000.A0x();
                } else {
                    throw AnonymousClass000.A0V("Binder Map and Binder List out of sync!");
                }
            }
            A01(r2, list, this.A02);
        }
    }

    public static void A01(C88574aj r3, List list, Map map) {
        Class<?> cls = r3.A00.getClass();
        if (map.put(cls, r3) != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                if (((C88574aj) list.get(size)).A00.getClass() == cls) {
                    list.remove(size);
                } else {
                    size--;
                }
            }
            throw AnonymousClass000.A0V("Binder Map and Binder List out of sync!");
        }
        list.add(r3);
    }

    public static void A02(Object obj, Object obj2, List list, List list2, List list3, List list4, Map map) {
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            HashMap hashMap = new HashMap(list2.size());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C88574aj r5 = (C88574aj) it.next();
                AnonymousClass5SJ r3 = r5.A00;
                Class<?> cls = r3.getClass();
                C88574aj r0 = (C88574aj) map.get(cls);
                if (r0 != null) {
                    boolean AfR = r3.AfR(r0.A01, r5.A01, obj, obj2);
                    hashMap.put(cls, Boolean.valueOf(AfR));
                    if (!AfR) {
                    }
                }
                list3.add(r5);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C88574aj r2 = (C88574aj) it2.next();
                Class<?> cls2 = r2.A00.getClass();
                if (!hashMap.containsKey(cls2) || AnonymousClass000.A1X(hashMap.get(cls2))) {
                    list4.add(r2);
                }
            }
        }
    }

    public abstract long A03();

    public String A04() {
        Class<?> cls = getClass();
        String name = cls.getName();
        if (name.length() > 80) {
            return cls.getSimpleName();
        }
        StringBuilder A0r = AnonymousClass000.A0r("<cls>");
        A0r.append(name);
        return AnonymousClass000.A0h("</cls>", A0r);
    }

    public void A05(C88574aj r3) {
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass000.A0u();
            this.A01 = list;
            if (this.A03 == null) {
                this.A03 = AnonymousClass000.A0x();
            } else {
                throw AnonymousClass000.A0V("Binder Map and Binder List out of sync!");
            }
        }
        A01(r3, list, this.A03);
    }

    public final void A06(C88574aj... r3) {
        for (C88574aj A05 : r3) {
            A05(A05);
        }
    }
}
