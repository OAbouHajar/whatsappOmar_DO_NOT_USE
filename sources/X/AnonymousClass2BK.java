package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2BK  reason: invalid class name */
public final class AnonymousClass2BK {
    public final C28371Vv A00;
    public final AnonymousClass2BJ A01;

    public AnonymousClass2BK(C16050sL r5, AnonymousClass2BJ r6) {
        C32461gQ r3 = new C32461gQ("iq");
        r3.A02(new C35081lL("xmlns", "w:g2"));
        r3.A02(new C35081lL((Jid) r5, "to"));
        r3.A05(r6.A00, new ArrayList());
        this.A01 = r6;
        this.A00 = r3.A01();
    }

    public void A00(C32461gQ r4, List list) {
        r4.A07(this.A00, list, new ArrayList());
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[0]));
        arrayList.addAll(0, list);
        this.A01.A00(r4, arrayList);
    }
}
