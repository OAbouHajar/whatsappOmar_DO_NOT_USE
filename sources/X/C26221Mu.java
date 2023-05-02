package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Mu  reason: invalid class name and case insensitive filesystem */
public class C26221Mu implements C207111h {
    public final C17250um A00;
    public final C207011g A01;
    public final C26211Mt A02;
    public final Map A03;
    public final Map A04;
    public final Map A05 = new HashMap();

    public C26221Mu(C17250um r4, C207011g r5, C26211Mt r6) {
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        for (AnonymousClass2V1 A002 : AnonymousClass4Z2.A00()) {
            A00(A002, this.A05);
        }
        this.A03 = new HashMap();
        this.A04 = new HashMap();
    }

    public static void A00(AnonymousClass2V1 r5, Map map) {
        for (C37781pj r1 : r5.ABx()) {
            Collection collection = (Collection) map.get(r1);
            if (collection == null) {
                collection = new LinkedHashSet();
                map.put(r1, collection);
            }
            collection.add(r5);
        }
    }

    public synchronized void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A00((AnonymousClass2V1) it.next(), this.A04);
        }
    }

    public void A6A() {
        this.A01.A6A();
    }

    public Collection A8y(String str, int i2, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2V1 r1 : this.A02.A02()) {
            if (r1 instanceof C102814zZ) {
                A00(r1, hashMap);
            }
            arrayList.addAll(Arrays.asList(r1.ABx()));
        }
        List<C37781pj> A022 = this.A01.A02(str, arrayList, new ArrayList(), i2, false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(hashMap);
        arrayList2.add(this.A03);
        arrayList2.add(this.A04);
        arrayList2.add(this.A05);
        synchronized (this) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                for (C37781pj r0 : A022) {
                    Collection<AnonymousClass2V1> collection = (Collection) map.get(r0);
                    if (collection != null) {
                        for (AnonymousClass2V1 r12 : collection) {
                            if (r12 instanceof C102814zZ) {
                                linkedHashSet2.add(r12);
                            } else {
                                linkedHashSet.add(r12);
                            }
                        }
                    }
                }
            }
        }
        for (C37781pj r2 : A022) {
            linkedHashSet.add(new C102804zY(r2, this.A00));
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        if (z2) {
            linkedHashSet3 = linkedHashSet;
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet3);
        if (z2) {
            linkedHashSet = linkedHashSet2;
        }
        linkedHashSet4.addAll(linkedHashSet);
        return linkedHashSet4;
    }

    public void Ae3(boolean z2) {
        this.A01.Ae3(z2);
    }

    public int getCount() {
        return this.A01.getCount();
    }
}
