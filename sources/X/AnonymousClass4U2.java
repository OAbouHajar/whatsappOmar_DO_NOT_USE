package X;

/* renamed from: X.4U2  reason: invalid class name */
public final class AnonymousClass4U2 {
    public final C28371Vv A00;
    public final AnonymousClass5NG A01;

    public AnonymousClass4U2(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "participant");
        C32261fw[] r2 = new C32261fw[4];
        r2[0] = AnonymousClass3K3.A0X(r5, 120);
        r2[1] = AnonymousClass3K3.A0X(r5, 119);
        r2[2] = AnonymousClass3K3.A0X(r5, 118);
        this.A01 = (AnonymousClass5NG) C32271fx.A04(r6, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidContainingLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJid", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 117), r2, 3), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U2.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass4U2) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
