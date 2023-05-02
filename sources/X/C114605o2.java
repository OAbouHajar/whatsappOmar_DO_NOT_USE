package X;

/* renamed from: X.5o2  reason: invalid class name and case insensitive filesystem */
public class C114605o2 extends C16690tT {
    public final /* synthetic */ C118395uc A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public C114605o2(C118395uc r1, Runnable runnable, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A02.A0L(this.A02);
    }

    public void A09() {
        this.A00.A03.Afu();
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass1Vt r7 = (AnonymousClass1Vt) obj;
        C118395uc r5 = this.A00;
        AnonymousClass69S r4 = r5.A03;
        r4.Ac4();
        if (r7 == null || !r4.AfM(r7.A02)) {
            this.A01.run();
        } else {
            C16830ti r0 = r5.A00;
            AnonymousClass00B.A06(r0);
            r4.Afk(r5.A00.A11.A00, r7.A02, r0.A13);
        }
        r5.A01 = null;
    }
}
