package X;

import android.util.SparseArray;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0tx  reason: invalid class name and case insensitive filesystem */
public enum C16960tx {
    A08(0),
    A04(12),
    A05(13),
    A06(14),
    A07(15);
    
    public static SparseArray A00;
    public static C16960tx A01;
    public static C16960tx A02;
    public final int version;

    /* access modifiers changed from: public */
    C16960tx(int i2) {
        this.version = i2;
    }

    public static synchronized C16960tx A00() {
        C16960tx r6;
        synchronized (C16960tx.class) {
            r6 = A01;
            if (r6 == null) {
                r6 = A07;
                for (C16960tx r2 : values()) {
                    if (r2.version > r6.version) {
                        r6 = r2;
                    }
                }
                A01 = r6;
            }
        }
        return r6;
    }

    public static synchronized C16960tx A01() {
        C16960tx r6;
        synchronized (C16960tx.class) {
            r6 = A02;
            if (r6 == null) {
                r6 = A04;
                for (C16960tx r2 : values()) {
                    if (r2.version < r6.version) {
                        r6 = r2;
                    }
                }
                A02 = r6;
            }
        }
        return r6;
    }

    public static synchronized C16960tx A02(int i2) {
        C16960tx r0;
        synchronized (C16960tx.class) {
            if (A00 == null) {
                A03();
            }
            r0 = (C16960tx) A00.get(i2);
        }
        return r0;
    }

    public static synchronized void A03() {
        synchronized (C16960tx.class) {
            A00 = new SparseArray(values().length);
            for (C16960tx r2 : values()) {
                A00.append(r2.version, r2);
            }
        }
    }

    public static synchronized C16960tx[] A04(C16960tx r6, C16960tx r7) {
        C16960tx[] r0;
        synchronized (C16960tx.class) {
            if (A00 == null) {
                A03();
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i2 < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i2);
                    if (keyAt >= r6.version && keyAt <= r7.version) {
                        arrayList.add((C16960tx) A00.get(keyAt));
                    }
                    i2++;
                } else {
                    Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(42));
                    r0 = (C16960tx[]) arrayList.toArray(new C16960tx[0]);
                }
            }
        }
        return r0;
    }
}
