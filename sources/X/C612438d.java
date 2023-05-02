package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.38d  reason: invalid class name and case insensitive filesystem */
public final class C612438d {
    public final C28371Vv A00;
    public final C51812cK A01;

    public C612438d(C16050sL r4, C51812cK r5) {
        C32461gQ r2 = new C32461gQ("iq");
        C32461gQ.A00(r2, "xmlns", "w:g2");
        if (C32271fx.A0C(r4, "to")) {
            r2.A02(new C35081lL((Jid) r4, "to"));
        }
        r2.A05(r5.A00, AnonymousClass000.A0u());
        this.A01 = r5;
        this.A00 = r2.A01();
    }

    public void A00(C32461gQ r4, List list) {
        r4.A07(this.A00, list, AnonymousClass000.A0u());
        ArrayList A0n = C13680ns.A0n(Arrays.asList(new String[0]));
        A0n.addAll(0, list);
        this.A01.A00(r4, A0n);
    }
}
