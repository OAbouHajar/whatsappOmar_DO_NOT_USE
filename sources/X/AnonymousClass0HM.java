package X;

import java.util.List;

/* renamed from: X.0HM  reason: invalid class name */
public class AnonymousClass0HM extends AnonymousClass0HC {
    public AnonymousClass0HM(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r2, float f2) {
        return Float.valueOf(A0F(r2, f2));
    }

    public float A0E() {
        return A0F(AnonymousClass0NI.A00(this), A06());
    }

    public float A0F(C06520Wl r6, float f2) {
        Object obj;
        Number number;
        Object obj2 = r6.A0F;
        if (obj2 == null || (obj = r6.A09) == null) {
            throw AnonymousClass000.A0V("Missing values for keyframe.");
        }
        AnonymousClass0UV r0 = this.A03;
        if (r0 != null && (number = (Number) AnonymousClass0HC.A01(this, r6, r0, obj2, obj)) != null) {
            return number.floatValue();
        }
        float f3 = r6.A03;
        if (f3 == -3987645.8f) {
            f3 = AnonymousClass000.A04(obj2);
            r6.A03 = f3;
        }
        float f4 = r6.A01;
        if (f4 == -3987645.8f) {
            f4 = AnonymousClass000.A04(r6.A09);
            r6.A01 = f4;
        }
        return AnonymousClass000.A01(f4, f3, f2);
    }
}
