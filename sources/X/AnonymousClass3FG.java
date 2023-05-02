package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3FG  reason: invalid class name */
public final class AnonymousClass3FG implements C109195Rb, C109205Rc {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public List A01 = AnonymousClass000.A0u();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final C17180uf A03;
    public final C85894Qk A04;

    public AnonymousClass3FG(C17180uf r2, C85894Qk r3) {
        C18450wi.A0H(r2, 1);
        this.A03 = r2;
        this.A04 = r3;
        r3.A00.A07 = this;
    }

    public void AMD(int i2, String str) {
        for (AnonymousClass1US r1 : this.A01) {
            if (C18450wi.A0R(str, r1.A03)) {
                r1.A01 = 2;
            }
        }
        AnonymousClass027 r3 = this.A02;
        AnonymousClass4WI r0 = (AnonymousClass4WI) r3.A01();
        String str2 = "unknown";
        if (r0 != null) {
            str2 = r0.A03;
        }
        r3.A09(new AnonymousClass4WI(str2, 4));
    }

    public void AME(Map map) {
        C87014Va r0;
        C18450wi.A0H(map, 0);
        for (AnonymousClass1US r2 : this.A01) {
            if (!(r2.A01 == 1 || (r0 = (C87014Va) map.get(r2.A0B)) == null)) {
                r2.A04 = r0.A01;
                r2.A01 = 1;
            }
        }
        AnonymousClass027 r3 = this.A02;
        AnonymousClass4WI r02 = (AnonymousClass4WI) r3.A01();
        String str = "unknown";
        if (r02 != null) {
            str = r02.A03;
        }
        r3.A09(new AnonymousClass4WI(str, 4));
    }

    public void ARE(int i2) {
        this.A00.A09(Collections.emptyList());
    }

    public void ARF(List list) {
        if (list != null) {
            this.A00.A09(((AnonymousClass4DL) C13690nt.A0Z(list)).A00);
        }
    }
}
