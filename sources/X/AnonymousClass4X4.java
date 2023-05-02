package X;

import java.util.LinkedHashMap;

/* renamed from: X.4X4  reason: invalid class name */
public class AnonymousClass4X4 {
    public int A00 = 0;
    public final AnonymousClass5NV A01;
    public final LinkedHashMap A02 = new LinkedHashMap();

    public AnonymousClass4X4(AnonymousClass5NV r2) {
        this.A01 = r2;
    }

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        remove = this.A02.remove(obj);
        this.A00 -= remove == null ? 0 : this.A01.AG8(remove);
        return remove;
    }

    public synchronized void A03(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        this.A00 -= remove == null ? 0 : this.A01.AG8(remove);
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.AG8(obj2);
    }
}
