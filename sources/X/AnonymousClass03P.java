package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.03P  reason: invalid class name */
public class AnonymousClass03P implements Iterable {
    public int A00 = 0;
    public AnonymousClass060 A01;
    public AnonymousClass060 A02;
    public WeakHashMap A03 = new WeakHashMap();

    public AnonymousClass060 A00(Object obj) {
        AnonymousClass060 r1 = this.A02;
        while (r1 != null && !r1.A02.equals(obj)) {
            r1 = r1.A00;
        }
        return r1;
    }

    public Object A01(Object obj) {
        AnonymousClass060 A002 = A00(obj);
        if (A002 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (C011605p AgW : weakHashMap.keySet()) {
                AgW.AgW(A002);
            }
        }
        AnonymousClass060 r1 = A002.A01;
        AnonymousClass060 r0 = A002.A00;
        if (r1 != null) {
            r1.A00 = r0;
        } else {
            this.A02 = r0;
        }
        AnonymousClass060 r02 = A002.A00;
        if (r02 != null) {
            r02.A01 = r1;
        } else {
            this.A01 = r1;
        }
        A002.A00 = null;
        A002.A01 = null;
        return A002.A03;
    }

    public Object A02(Object obj, Object obj2) {
        AnonymousClass060 A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        AnonymousClass060 r1 = new AnonymousClass060(obj, obj2);
        this.A00++;
        AnonymousClass060 r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymousClass03P) {
            AnonymousClass03P r7 = (AnonymousClass03P) obj;
            if (this.A00 == r7.A00) {
                Iterator it = iterator();
                Iterator it2 = r7.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if (entry == null) {
                        if (next == null) {
                        }
                    } else if (!entry.equals(next)) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    public Iterator iterator() {
        AnonymousClass0DF r2 = new AnonymousClass0DF(this.A02, this.A01);
        this.A03.put(r2, Boolean.FALSE);
        return r2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
