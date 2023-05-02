package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.11e  reason: invalid class name and case insensitive filesystem */
public class C206811e {
    public C206611c A00;
    public final int A01;
    public final Comparator A02 = new IDxComparatorShape19S0000000_2_I0(24);
    public volatile List A03;

    public C206811e(C206611c r3, int i2) {
        this.A00 = r3;
        this.A01 = i2;
    }

    public int A00() {
        int min;
        A05();
        synchronized (this) {
            min = Math.min(this.A01, this.A03.size());
        }
        return min;
    }

    public Object A01(int i2) {
        Object ACV;
        A05();
        synchronized (this) {
            ACV = ((C37891pu) this.A03.get(i2)).ACV();
        }
        return ACV;
    }

    public List A02() {
        List A032;
        A05();
        synchronized (this) {
            A032 = A03(Math.min(this.A01, this.A03.size()));
        }
        return A032;
    }

    public List A03(int i2) {
        A05();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < Math.min(i2, this.A03.size()); i3++) {
                arrayList.add(((C37891pu) this.A03.get(i3)).ACV());
            }
        }
        return arrayList;
    }

    public Map A04() {
        HashMap hashMap;
        A05();
        synchronized (this) {
            hashMap = new HashMap();
            for (C37891pu r0 : this.A03) {
                hashMap.put(r0.ACV(), Float.valueOf(r0.AH5()));
            }
        }
        return hashMap;
    }

    public void A05() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = Collections.synchronizedList(this.A00.AHu());
                }
            }
        }
    }

    public void A06(Object obj) {
        A05();
        synchronized (this) {
            int size = this.A03.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.A00.AaZ(this.A03);
                } else if (((C37891pu) this.A03.get(size)).A6R(obj)) {
                    A08(size);
                }
            }
        }
    }

    public boolean A07(Object obj) {
        boolean z2;
        A05();
        synchronized (this) {
            z2 = false;
            for (C37891pu r3 : this.A03) {
                float AH5 = r3.AH5();
                if (!r3.A6R(obj)) {
                    r3.Af1(((float) Math.round((AH5 * 0.9f) * 100.0f)) / 100.0f);
                } else {
                    r3.Af1(((float) Math.round((AH5 + 1.0f) * 100.0f)) / 100.0f);
                    z2 = true;
                }
            }
            if (!z2) {
                A09(this.A00.A7L(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            AnonymousClass00B.A06(this.A03);
            int size = this.A03.size();
            while (true) {
                size--;
                if (size >= this.A01) {
                    A08(size);
                } else {
                    this.A00.AaZ(this.A03);
                }
            }
        }
        return z2;
    }

    public void A08(int i2) {
        A05();
        synchronized (this) {
            this.A03.remove(i2);
        }
    }

    public void A09(C37891pu r2) {
        A05();
        synchronized (this) {
            this.A03.add(r2);
        }
    }
}
