package X;

/* renamed from: X.0Dg  reason: invalid class name and case insensitive filesystem */
public class C02610Dg extends C08980ei {
    public final /* synthetic */ C08970eh A00;

    public C02610Dg(C08970eh r1) {
        this.A00 = r1;
    }

    public String A04() {
        AnonymousClass0RM r2 = (AnonymousClass0RM) this.A00.A01.get();
        if (r2 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A0r = AnonymousClass000.A0r("tag=[");
        A0r.append(r2.A02);
        return AnonymousClass000.A0h("]", A0r);
    }
}
