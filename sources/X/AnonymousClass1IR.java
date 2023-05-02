package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.1IR  reason: invalid class name */
public final class AnonymousClass1IR implements AnonymousClass1IS {
    public final AnonymousClass1IQ A00;

    public AnonymousClass1IR(AnonymousClass1IQ r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public boolean A4S(String str) {
        return this.A00.A01.get(str) != null;
    }

    public void AHH(String str, String str2) {
        AnonymousClass1Z7 r4 = (AnonymousClass1Z7) this.A00.A01.get(str);
        Uri parse = Uri.parse(str2);
        C18450wi.A0B(parse);
        Object A002 = AnonymousClass47A.A00(parse);
        if (A002 == null) {
            A002 = AnonymousClass1Z8.A00;
        }
        if (r4 != null) {
            r4.A02("on_success", C25411Jr.A05(new C25401Jq("deeplink", str2), new C25401Jq("parameters", A002)));
        }
    }

    public void AHI(String str, Map map) {
        AnonymousClass1Z7 r2 = (AnonymousClass1Z7) this.A00.A01.get(str);
        if (r2 != null) {
            r2.A02("on_success", C25421Js.A09(new C25401Jq("parameters", map)));
        }
    }
}
