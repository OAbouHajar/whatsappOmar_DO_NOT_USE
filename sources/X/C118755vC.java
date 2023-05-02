package X;

/* renamed from: X.5vC  reason: invalid class name and case insensitive filesystem */
public class C118755vC {
    public final /* synthetic */ AnonymousClass2WZ A00;
    public final /* synthetic */ AnonymousClass5SD A01;
    public final /* synthetic */ C114685oK A02;
    public final /* synthetic */ boolean A03;

    public C118755vC(AnonymousClass2WZ r1, AnonymousClass5SD r2, C114685oK r3, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z2;
        this.A01 = r2;
    }

    public void A00(Exception exc) {
        AnonymousClass2WZ r3 = this.A00;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A02.A02(r3, this.A01, exc.getLocalizedMessage());
    }

    public void A01(String str) {
        this.A02.A00(this.A00, this.A01, str, this.A03);
    }
}
