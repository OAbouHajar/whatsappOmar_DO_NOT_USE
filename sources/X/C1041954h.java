package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.54h  reason: invalid class name and case insensitive filesystem */
public class C1041954h implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object keys;
    public final Object values;

    public C1041954h(C17930vs r7) {
        Object[] objArr = new Object[r7.size()];
        Object[] objArr2 = new Object[r7.size()];
        C28031Ub it = r7.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(it);
            objArr[i2] = A0z.getKey();
            objArr2[i2] = A0z.getValue();
            i2++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }

    public final Object legacyReadResolve() {
        Object[] objArr = (Object[]) this.keys;
        Object[] objArr2 = (Object[]) this.values;
        AnonymousClass1C5 makeBuilder = makeBuilder(objArr.length);
        for (int i2 = 0; i2 < objArr.length; i2++) {
            makeBuilder.put(objArr[i2], objArr2[i2]);
        }
        return makeBuilder.build();
    }

    public AnonymousClass1C5 makeBuilder(int i2) {
        return new AnonymousClass1C5(i2);
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (!(obj instanceof C17380uz)) {
            return legacyReadResolve();
        }
        C17390v0 r2 = (C17390v0) obj;
        AnonymousClass1C5 makeBuilder = makeBuilder(r2.size());
        C28031Ub it = r2.iterator();
        C28031Ub it2 = ((C17390v0) this.values).iterator();
        while (it.hasNext()) {
            makeBuilder.put(it.next(), it2.next());
        }
        return makeBuilder.build();
    }
}
