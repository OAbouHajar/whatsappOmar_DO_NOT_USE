package X;

import java.util.Map;

/* renamed from: X.61e  reason: invalid class name and case insensitive filesystem */
public final class C1203161e implements AnonymousClass1IH {
    public Class A8z() {
        return C114925op.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        boolean A0C;
        AnonymousClass176 r6 = (AnonymousClass176) obj;
        C114925op r5 = (C114925op) enumR;
        boolean A19 = C110115dX.A19(r6, r5);
        int A01 = C110115dX.A01(r5, C115425pj.A00);
        if (A01 == A19) {
            A0C = r6.A0C();
        } else if (A01 == 2) {
            A0C = r6.A01.A01().getBoolean("payments_resume_onboarding_banner_started", false);
        } else {
            throw new AnonymousClass2Xe();
        }
        return Boolean.valueOf(A0C);
    }
}
