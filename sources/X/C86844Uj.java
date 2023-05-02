package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.4Uj  reason: invalid class name and case insensitive filesystem */
public final class C86844Uj {
    public Map A00 = null;
    public C89134be[] A01;
    public final String A02;
    public final byte[] A03;

    public C86844Uj(String str, byte[] bArr, C89134be[] r4) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = r4;
    }

    public void A00(C798141k r3, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C798141k.class);
            this.A00 = map;
        }
        map.put(r3, obj);
    }

    public String toString() {
        return this.A02;
    }
}
