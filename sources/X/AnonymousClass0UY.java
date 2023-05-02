package X;

import java.util.Map;

/* renamed from: X.0UY  reason: invalid class name */
public class AnonymousClass0UY {
    public static final String A04 = C06530Wm.A01("WorkTimer");
    public final C12040jk A00;
    public final Object A01 = new Object();
    public final Map A02 = AnonymousClass000.A0x();
    public final Map A03 = AnonymousClass000.A0x();

    public AnonymousClass0UY(C12040jk r2) {
        this.A00 = r2;
    }

    public void A00(AnonymousClass0R5 r6) {
        synchronized (this.A01) {
            if (((C10060gW) this.A03.remove(r6)) != null) {
                C06530Wm.A00().A02(A04, AnonymousClass000.A0e(r6, "Stopping timer for ", AnonymousClass000.A0o()));
                this.A02.remove(r6);
            }
        }
    }
}
