package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1y0  reason: invalid class name */
public class AnonymousClass1y0 {
    public int A00;
    public final Map A01 = new HashMap();
    public final AnonymousClass01J A02;

    public AnonymousClass1y0(AnonymousClass01J r2, int i2) {
        this.A00 = i2;
        this.A02 = r2;
    }

    public C37281ou A00(String str, int i2) {
        if (i2 != this.A00) {
            A01();
            this.A00 = i2;
        }
        Map map = this.A01;
        if (!map.containsKey(str)) {
            C16800tf r1 = (C16800tf) this.A02.get();
            try {
                map.put(str, r1.A02.A0A(str));
                r1.close();
            } catch (Throwable unused) {
            }
        }
        return (C37281ou) map.get(str);
        throw th;
    }

    public void A01() {
        Map map = this.A01;
        for (C37281ou r0 : map.values()) {
            if (r0 != null) {
                r0.A00.close();
            }
        }
        map.clear();
    }
}
