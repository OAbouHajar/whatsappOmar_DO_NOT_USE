package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.17H  reason: invalid class name */
public class AnonymousClass17H {
    public final C15810rt A00;
    public final C39521sc A01 = new C39521sc();
    public final Map A02 = new ConcurrentHashMap();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public AnonymousClass17H(C15810rt r2) {
        this.A00 = r2;
    }

    public void A00(C39541se r4) {
        C39521sc r2 = this.A01;
        synchronized (r2) {
            for (C16740tZ AhJ : r2.A01.A04().values()) {
                r4.AhJ(AhJ);
            }
            for (Map.Entry value : r2.A02.entrySet()) {
                C16740tZ r0 = (C16740tZ) ((WeakReference) value.getValue()).get();
                if (r0 != null) {
                    r4.AhJ(r0);
                }
            }
        }
        for (C16740tZ AhJ2 : this.A02.values()) {
            r4.AhJ(AhJ2);
        }
        for (C15840rx r02 : this.A00.A0A()) {
            C16740tZ r03 = r02.A0Z;
            if (r03 != null) {
                r4.AhJ(r03);
            }
        }
    }

    public void A01(C15830rv r7) {
        C39521sc r5 = this.A01;
        synchronized (r5) {
            AnonymousClass03L r3 = r5.A01;
            Iterator it = new HashSet(r3.A04().keySet()).iterator();
            while (it.hasNext()) {
                C28381Vw r1 = (C28381Vw) it.next();
                if (r7.equals(r1.A00)) {
                    r3.A03(r1);
                }
            }
            ArrayList arrayList = new ArrayList();
            Map map = r5.A02;
            for (C28381Vw r12 : map.keySet()) {
                if (r7.equals(r12.A00)) {
                    arrayList.add(r12);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove((C28381Vw) it2.next());
            }
        }
        Map map2 = this.A02;
        Iterator it3 = new HashSet(map2.keySet()).iterator();
        while (it3.hasNext()) {
            C28381Vw r13 = (C28381Vw) it3.next();
            if (r7.equals(r13.A00)) {
                map2.remove(r13);
            }
        }
        C15840rx A06 = this.A00.A06(r7);
        if (A06 != null) {
            A06.A0Z = null;
            A06.A0Y = null;
        }
    }

    public void A02(C16740tZ r5) {
        C39521sc r0 = this.A01;
        C28381Vw r3 = r5.A11;
        r0.A00(r5, r3);
        C15810rt r2 = this.A00;
        synchronized (r2) {
            C15840rx A06 = r2.A06(r3.A00);
            if (A06 != null) {
                C16740tZ r02 = A06.A0Z;
                if (r02 != null && r02.A11.equals(r3)) {
                    A06.A0Z = r5;
                }
                C16740tZ r03 = A06.A0Y;
                if (r03 != null && r03.A11.equals(r3)) {
                    A06.A0Y = r5;
                }
            }
        }
    }

    public void A03(C28381Vw r5) {
        C39521sc r1 = this.A01;
        synchronized (r1) {
            r1.A02.remove(r5);
            r1.A01.A03(r5);
        }
        this.A02.remove(r5);
        C15810rt r3 = this.A00;
        synchronized (r3) {
            C15840rx A06 = r3.A06(r5.A00);
            if (A06 != null) {
                C16740tZ r0 = A06.A0Z;
                if (r0 != null && r0.A11.equals(r5)) {
                    A06.A0Z = null;
                }
                C16740tZ r02 = A06.A0Y;
                if (r02 != null && r02.A11.equals(r5)) {
                    A06.A0Y = null;
                }
                C39531sd r03 = A06.A0b;
                if (r03 != null && r03.A00.A11.equals(r5)) {
                    A06.A0b = null;
                }
            }
        }
    }
}
