package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3AN  reason: invalid class name */
public final class AnonymousClass3AN {
    public final AnonymousClass4YH A00;
    public final C88964bN A01;
    public final C85844Qf A02;
    public final C84244Ju A03;
    public final C84244Ju A04;
    public final AnonymousClass5MN A05;
    public final AnonymousClass4K0 A06;
    public final C25261Jc A07;
    public final String A08;
    public final List A09 = AnonymousClass000.A0u();
    public final Map A0A = AnonymousClass000.A0x();
    public final Map A0B;
    public final Set A0C;

    public AnonymousClass3AN(AnonymousClass4YH r5, AnonymousClass4O3 r6, C88964bN r7, C85844Qf r8, AnonymousClass5MN r9, AnonymousClass4K0 r10, C25261Jc r11, String str) {
        this.A06 = r10;
        this.A07 = r11;
        this.A08 = str;
        this.A00 = r5;
        this.A01 = r7;
        this.A02 = r8;
        this.A05 = r9;
        if (r6 != null) {
            C84244Ju r1 = r6.A00;
            this.A04 = new C84244Ju(r1);
            this.A03 = r1;
            this.A0B = r6.A05;
            this.A0C = C13680ns.A0o();
            Iterator A0y = AnonymousClass000.A0y(r6.A04);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                Object key = A0z.getKey();
                if (!AnonymousClass45W.A00(A0z.getValue(), r7.A03.get(key))) {
                    this.A0C.add(key);
                }
            }
            return;
        }
        this.A04 = new C84244Ju((C84244Ju) null);
        this.A03 = new C84244Ju((C84244Ju) null);
        this.A0B = Collections.emptyMap();
    }

    public static C31201dg A00(C31201dg r2, C31201dg r3, Object obj, int i2) {
        if (r2 != r3 || !AnonymousClass45W.A00(r3.A02.get(i2), obj)) {
            if (r2 == r3) {
                r2 = new C31201dg(r3, r3, r3.A05, r3.A00);
            }
            r2.A02.put(i2, obj);
        }
        return r2;
    }
}
