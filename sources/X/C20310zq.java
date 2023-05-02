package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0zq  reason: invalid class name and case insensitive filesystem */
public abstract class C20310zq {
    public final C15220qW A00;
    public final Integer[] A01 = new Integer[0];

    public C20310zq(C20310zq... r3) {
        this.A00 = new AnonymousClass1DV(new C106625Eo(this, r3));
    }

    public final C20010zM A00(int i2) {
        return (C20010zM) ((Map) this.A00.getValue()).get(Integer.valueOf(i2));
    }

    public Map A01() {
        if (this instanceof AnonymousClass2ZI) {
            AnonymousClass2ZI r3 = (AnonymousClass2ZI) this;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(12, r3.A02);
            linkedHashMap.put(20, r3.A00);
            linkedHashMap.put(13, r3.A01);
            return linkedHashMap;
        } else if (this instanceof AnonymousClass2ZD) {
            AnonymousClass2ZD r32 = (AnonymousClass2ZD) this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(18, r32.A00);
            linkedHashMap2.put(19, r32.A01);
            return linkedHashMap2;
        } else if (this instanceof C25761La) {
            C25761La r33 = (C25761La) this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(8, r33.A00);
            linkedHashMap3.put(0, r33.A02);
            linkedHashMap3.put(14, r33.A03);
            linkedHashMap3.put(11, r33.A01);
            return linkedHashMap3;
        } else if ((this instanceof AnonymousClass1LK) || (this instanceof C20300zp)) {
            return new LinkedHashMap();
        } else {
            AnonymousClass1LZ r34 = (AnonymousClass1LZ) this;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put(4, r34.A02);
            linkedHashMap4.put(1, r34.A0A);
            linkedHashMap4.put(5, r34.A09);
            linkedHashMap4.put(20, r34.A03);
            linkedHashMap4.put(2, r34.A0C);
            linkedHashMap4.put(3, r34.A04);
            linkedHashMap4.put(7, r34.A05);
            linkedHashMap4.put(15, r34.A08);
            linkedHashMap4.put(9, r34.A00);
            linkedHashMap4.put(6, r34.A01);
            linkedHashMap4.put(18, r34.A06);
            linkedHashMap4.put(10, r34.A07);
            linkedHashMap4.put(19, r34.A0B);
            return linkedHashMap4;
        }
    }

    public Integer[] A02() {
        return this.A01;
    }
}
