package X;

import java.util.Map;

/* renamed from: X.5zl  reason: invalid class name and case insensitive filesystem */
public class C119875zl implements C20190ze {
    public final C17350uw A00;

    public C119875zl(C17350uw r1) {
        this.A00 = r1;
    }

    public void A68(String str) {
        C27221Qx r1 = this.A00.A00;
        synchronized (r1) {
            r1.A00.remove(str);
        }
    }

    public void Aax(AnonymousClass225 r4, Map map) {
        this.A00.A00(r4, "DEFAULT_JOB_ID", "DEFAULT_NAMESPACE", map);
    }

    public void Aay(AnonymousClass225 r2, String str, String str2, Map map) {
        this.A00.A00(r2, str, str2, map);
    }
}
