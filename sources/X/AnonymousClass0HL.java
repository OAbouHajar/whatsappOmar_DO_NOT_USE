package X;

import java.util.List;

/* renamed from: X.0HL  reason: invalid class name */
public class AnonymousClass0HL extends AnonymousClass0HC {
    public AnonymousClass0HL(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r2, float f2) {
        return Integer.valueOf(A0E(r2, f2));
    }

    public int A0E(C06520Wl r5, float f2) {
        Object obj;
        Number number;
        Object obj2 = r5.A0F;
        if (obj2 == null || (obj = r5.A09) == null) {
            throw AnonymousClass000.A0V("Missing values for keyframe.");
        }
        AnonymousClass0UV r0 = this.A03;
        if (r0 != null && (number = (Number) AnonymousClass0HC.A01(this, r5, r0, obj2, obj)) != null) {
            return number.intValue();
        }
        int i2 = r5.A05;
        if (i2 == 784923401) {
            i2 = AnonymousClass000.A0D(obj2);
            r5.A05 = i2;
        }
        int i3 = r5.A04;
        if (i3 == 784923401) {
            i3 = AnonymousClass000.A0D(r5.A09);
            r5.A04 = i3;
        }
        return (int) (((float) i2) + (f2 * ((float) (i3 - i2))));
    }
}
