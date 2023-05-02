package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4UX  reason: invalid class name */
public final class AnonymousClass4UX {
    public final C28371Vv A00;
    public final AnonymousClass4UT A01;
    public final C109085Qq A02;

    public AnonymousClass4UX(C16300so r5, C28371Vv r6, C83094Fi r7) {
        AnonymousClass3K3.A1G(r6);
        this.A01 = (AnonymousClass4UT) C32271fx.A03(r6, new IDxNFunctionShape43S0200000_2_I1(r5, r7.A00, 11), new String[0]);
        C32261fw[] r2 = new C32261fw[10];
        r2[0] = AnonymousClass3K3.A0X(r5, 135);
        r2[1] = AnonymousClass3K3.A0X(r5, 133);
        r2[2] = AnonymousClass3K3.A0X(r5, 127);
        r2[3] = AnonymousClass3K3.A0X(r5, 128);
        r2[4] = AnonymousClass3K3.A0X(r5, 131);
        r2[5] = AnonymousClass3K3.A0X(r5, 130);
        r2[6] = AnonymousClass3K3.A0X(r5, 136);
        r2[7] = AnonymousClass3K3.A0X(r5, 134);
        r2[8] = AnonymousClass3K3.A0X(r5, 132);
        this.A02 = (C109085Qq) C32271fx.A04(r6, "RateLimited|RequestTooLarge|UnsupportedOperation|InvalidParticipantJID|MalformedStanza|GroupDoesNotExist|UserDoesNotHaveAdminPermission|UserIsNotAParticipant|GroupIsSuspended|FallbackClient", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 129), r2, 9), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UX.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UX r5 = (AnonymousClass4UX) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
