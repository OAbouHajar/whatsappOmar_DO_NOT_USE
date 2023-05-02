package X;

/* renamed from: X.2J9  reason: invalid class name */
public class AnonymousClass2J9 implements C19550yc {
    public final /* synthetic */ AnonymousClass027 A00;
    public final /* synthetic */ AnonymousClass1T2 A01;

    public AnonymousClass2J9(AnonymousClass027 r1, AnonymousClass1T2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
        this.A00.A09(new C83654Hn((Boolean) null, false));
    }

    public void AQe(C28371Vv r5, String str) {
        this.A00.A09(new C83654Hn((Boolean) null, false));
    }

    public void AYG(C28371Vv r5, String str) {
        AnonymousClass027 r3;
        C83654Hn r2;
        try {
            if ("result".equals(r5.A0N("type", (String) null))) {
                r3 = this.A00;
                C28371Vv A0J = r5.A0J("accept");
                r2 = new C83654Hn(Boolean.valueOf("true".equals(A0J != null ? A0J.A0N("optout", (String) null) : null)), true);
            } else {
                r3 = this.A00;
                r2 = new C83654Hn((Boolean) null, false);
            }
            r3.A09(r2);
        } catch (AnonymousClass1W9 unused) {
            this.A00.A09(new C83654Hn((Boolean) null, false));
        }
    }
}
