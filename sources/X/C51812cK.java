package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2cK  reason: invalid class name and case insensitive filesystem */
public final class C51812cK {
    public final C28371Vv A00;

    public C51812cK(String str) {
        C32461gQ r3 = new C32461gQ("iq");
        r3.A02(new C35081lL("type", "set"));
        if (C32271fx.A0D(str, 0, 9007199254740991L, false)) {
            r3.A02(new C35081lL("id", str));
        }
        this.A00 = r3.A01();
    }

    public void A00(C32461gQ r3, List list) {
        r3.A07(this.A00, list, new ArrayList());
    }
}
