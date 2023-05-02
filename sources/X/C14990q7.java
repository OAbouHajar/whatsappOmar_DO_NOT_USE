package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0q7  reason: invalid class name and case insensitive filesystem */
public class C14990q7 {
    public final Context A00;
    public final SparseArray A01;
    public final AnonymousClass22A A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap(4));
    public final Map A04 = new HashMap(4);
    public final boolean A05;

    public C14990q7(Context context, SparseArray sparseArray, AnonymousClass22A r5) {
        this.A00 = context;
        this.A02 = r5;
        this.A05 = r5.A02.A01;
        this.A01 = sparseArray;
    }

    public Context A00() {
        return this.A00;
    }

    public AnonymousClass22A A01() {
        return this.A02;
    }

    public Object A02(int i2) {
        Object obj = this.A01.get(i2);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("Null value associated with key: ");
        sb.append(this.A00.getResources().getResourceEntryName(i2));
        throw new NullPointerException(sb.toString());
    }

    public Object A03(AnonymousClass5OK r6, C31201dg r7, int i2) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i3 = r7.A00;
        synchronized (this) {
            Map map = this.A04;
            valueOf = Integer.valueOf(i3);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = new Object();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A03;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i2);
            if (obj2 == null) {
                obj2 = r6.ALl(this, r7);
            }
            sparseArray.put(i2, obj2);
        }
        return obj2;
    }

    public boolean A04() {
        return this.A05;
    }
}
