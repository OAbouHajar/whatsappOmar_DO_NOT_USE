package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2cL  reason: invalid class name and case insensitive filesystem */
public final class C51822cL implements C46642Fg {
    public final C28371Vv A00;

    public C51822cL(Long l2) {
        C32461gQ r4 = new C32461gQ("clean");
        r4.A02(new C35081lL("type", "syncd_app_state"));
        if (C32271fx.A0B(l2, 0, false)) {
            r4.A02(new C35081lL("timestamp", l2.longValue()));
        }
        this.A00 = r4.A01();
    }

    public C28371Vv ADy() {
        return this.A00;
    }

    public void Aaf(C32461gQ r3, List list) {
        r3.A07(this.A00, list, new ArrayList());
    }
}
