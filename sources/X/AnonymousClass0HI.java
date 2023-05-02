package X;

import java.util.List;

/* renamed from: X.0HI  reason: invalid class name */
public class AnonymousClass0HI extends AnonymousClass0HC {
    public final AnonymousClass0PT A00 = new AnonymousClass0PT(1.0f, 1.0f);

    public AnonymousClass0HI(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r7, float f2) {
        Object obj;
        Object A01;
        Object obj2 = r7.A0F;
        if (obj2 == null || (obj = r7.A09) == null) {
            throw AnonymousClass000.A0V("Missing values for keyframe.");
        }
        AnonymousClass0PT r5 = (AnonymousClass0PT) obj2;
        AnonymousClass0PT r4 = (AnonymousClass0PT) obj;
        AnonymousClass0UV r0 = this.A03;
        if (r0 != null && (A01 = AnonymousClass0HC.A01(this, r7, r0, r5, r4)) != null) {
            return A01;
        }
        AnonymousClass0PT r3 = this.A00;
        float A012 = AnonymousClass000.A01(r4.A00, r5.A00, f2);
        float A013 = AnonymousClass000.A01(r4.A01, r5.A01, f2);
        r3.A00 = A012;
        r3.A01 = A013;
        return r3;
    }
}
