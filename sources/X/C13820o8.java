package X;

import com.facebook.redex.IDxProviderShape98S0200000_2_I0;
import com.google.firebase.iid.Registrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0o8  reason: invalid class name and case insensitive filesystem */
public class C13820o8 extends C13830o9 {
    public static final C13840oA A04 = C13950oM.A00;
    public final C13910oH A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public C13820o8(Iterable iterable, Executor executor, C13760o2... r14) {
        C13910oH r3 = new C13910oH(executor);
        this.A00 = r3;
        ArrayList arrayList = new ArrayList();
        Class<C13910oH> cls = C13910oH.class;
        arrayList.add(C13760o2.A00(cls, r3, cls, C13920oI.class));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Registrar) it.next()).getComponents());
        }
        Collections.addAll(arrayList, r14);
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C13760o2 r8 = (C13760o2) it2.next();
            C13960oN r6 = new C13960oN(r8);
            Iterator it3 = r8.A04.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Class cls2 = (Class) it3.next();
                    C13970oO r2 = new C13970oO(cls2, !(r8.A01 == 0));
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A01) {
                        set.add(r6);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls2}));
                    }
                }
            }
        }
        for (Set<C13960oN> it4 : hashMap.values()) {
            for (C13960oN r62 : it4) {
                for (C13790o5 r0 : r62.A00.A03) {
                    Set<C13960oN> set2 = (Set) hashMap.get(new C13970oO(r0.A01, r0.A00 == 2));
                    if (set2 != null) {
                        for (C13960oN r1 : set2) {
                            r62.A01.add(r1);
                            r1.A02.add(r62);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C13960oN r12 = (C13960oN) it5.next();
            if (r12.A02.isEmpty()) {
                hashSet2.add(r12);
            }
        }
        int i2 = 0;
        while (!hashSet2.isEmpty()) {
            C13960oN r32 = (C13960oN) hashSet2.iterator().next();
            hashSet2.remove(r32);
            i2++;
            for (C13960oN r13 : r32.A01) {
                Set set3 = r13.A02;
                set3.remove(r32);
                if (set3.isEmpty()) {
                    hashSet2.add(r13);
                }
            }
        }
        if (i2 == arrayList.size()) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                this.A01.put(next, new C13850oB(new IDxProviderShape98S0200000_2_I0(next, 1, this)));
            }
            Map map = this.A01;
            for (Map.Entry entry : map.entrySet()) {
                C13760o2 r15 = (C13760o2) entry.getKey();
                if (r15.A01 == 0) {
                    Object value = entry.getValue();
                    for (Object put : r15.A04) {
                        this.A02.put(put, value);
                    }
                }
            }
            for (C13760o2 r4 : map.keySet()) {
                Iterator it7 = r4.A03.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        C13790o5 r16 = (C13790o5) it7.next();
                        if (r16.A00 == 1) {
                            Map map2 = this.A02;
                            Class cls3 = r16.A01;
                            if (!map2.containsKey(cls3)) {
                                throw new C13980oP(String.format("Unsatisfied dependency for component %s: %s", new Object[]{r4, cls3}));
                            }
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : this.A01.entrySet()) {
                C13760o2 r17 = (C13760o2) entry2.getKey();
                if (r17.A01 != 0) {
                    Object value2 = entry2.getValue();
                    for (Object next2 : r17.A04) {
                        if (!hashMap2.containsKey(next2)) {
                            hashMap2.put(next2, new HashSet());
                        }
                        ((Set) hashMap2.get(next2)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                this.A03.put(entry3.getKey(), new C13850oB(new C14000oR((Set) entry3.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            C13960oN r18 = (C13960oN) it8.next();
            if (!r18.A02.isEmpty() && !r18.A01.isEmpty()) {
                arrayList2.add(r18.A00);
            }
        }
        throw new C14010oS(arrayList2);
    }
}
