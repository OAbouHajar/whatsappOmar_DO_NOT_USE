package X;

/* renamed from: X.2fG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53222fG implements C14280ou {
    public final /* synthetic */ C27761Ta A00;

    public /* synthetic */ C53222fG(C27761Ta r1) {
        this.A00 = r1;
    }

    public final void AYB(Object obj) {
        C27761Ta r2 = this.A00;
        C65873Wx r0 = ((C98704sq) ((AnonymousClass5UW) ((AnonymousClass2f8) obj).A00)).A01;
        String str = r0 == null ? null : r0.A00;
        C27781Tc r22 = r2.A01;
        if (str != null) {
            r22.A01(str, (String) null, 0);
        } else {
            r22.A01((String) null, "Attestation API returned NULL as JWS result", 1000);
        }
    }
}
