package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4R1  reason: invalid class name */
public final class AnonymousClass4R1 {
    public final C28371Vv A00;
    public final AnonymousClass4FZ A01;

    public AnonymousClass4R1(AnonymousClass4FZ r10, C83034Fc r11, String str) {
        C32461gQ A0S = AnonymousClass3K4.A0S("fds");
        if (C32271fx.A0D(str, 0, 9007199254740991L, false)) {
            C32461gQ.A00(A0S, "config", str);
        }
        A0S.A03(r11.A00);
        A0S.A05(r10.A00, AnonymousClass000.A0u());
        this.A01 = r10;
        this.A00 = A0S.A01();
    }

    public static List A00(C32461gQ r3, AnonymousClass4R1 r4) {
        r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r3.A02(new C35081lL("xmlns", "phoenix"));
        C32461gQ r2 = new C32461gQ("fds");
        r2.A05(r4.A00, new ArrayList());
        List list = Collections.EMPTY_LIST;
        r4.A01(r2, list);
        r3.A03(r2.A01());
        return list;
    }

    public void A01(C32461gQ r4, List list) {
        r4.A07(this.A00, list, AnonymousClass000.A0u());
        ArrayList A0n = C13680ns.A0n(Arrays.asList(new String[0]));
        A0n.addAll(0, list);
        r4.A07(this.A01.A00, A0n, AnonymousClass000.A0u());
    }
}
