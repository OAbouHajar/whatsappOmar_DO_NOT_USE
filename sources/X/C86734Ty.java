package X;

/* renamed from: X.4Ty  reason: invalid class name and case insensitive filesystem */
public final class C86734Ty {
    public final C28371Vv A00;
    public final AnonymousClass5ND A01;

    public C86734Ty(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "participant");
        C32261fw[] r2 = new C32261fw[2];
        r2[0] = AnonymousClass3K3.A0X(r5, 91);
        this.A01 = (AnonymousClass5ND) C32271fx.A04(r6, "GroupInfoParticipantAdmin|GroupInfoParticipantNonAdmin", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 90), r2, 1), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86734Ty.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86734Ty) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
