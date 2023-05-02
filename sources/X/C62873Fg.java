package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Fg  reason: invalid class name and case insensitive filesystem */
public class C62873Fg implements C16710tV {
    public final /* synthetic */ C18150wE A00;

    public C62873Fg(C18150wE r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        AnonymousClass4KD r0 = this.A00.A00;
        if (r0 != null) {
            AnonymousClass027 r2 = r0.A00;
            C88194a6 r02 = (C88194a6) r2.A01();
            r2.A09(new C88194a6(r02 == null ? null : r02.A03, i2));
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        AnonymousClass4VZ r7 = (AnonymousClass4VZ) obj;
        AnonymousClass4KD r5 = this.A00.A00;
        if (r5 != null) {
            C18450wi.A0H(r7, 0);
            ArrayList A0u = AnonymousClass000.A0u();
            for (AnonymousClass1US r2 : r7.A01) {
                A0u.add(new C71773l1(new C100764wA(r5, r2), r2));
            }
            String str = r7.A00;
            if (str != null) {
                A0u.add(new C86344Sg(10));
            }
            r5.A00.A09(new C88194a6(new AnonymousClass4VT(str), (List) A0u));
        }
    }
}
