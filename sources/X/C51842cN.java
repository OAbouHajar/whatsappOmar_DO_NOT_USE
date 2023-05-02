package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2cN  reason: invalid class name and case insensitive filesystem */
public final class C51842cN implements C46642Fg {
    public static final ArrayList A01 = new ArrayList(Arrays.asList(new String[]{"account_sync", "groups"}));
    public final C28371Vv A00;

    public C51842cN(String str, Long l2) {
        C32461gQ r4 = new C32461gQ("clean");
        if (C32271fx.A0B(l2, 0, true)) {
            r4.A02(new C35081lL("timestamp", l2.longValue()));
        }
        r4.A0A(str, "type", A01);
        this.A00 = r4.A01();
    }

    public C28371Vv ADy() {
        return this.A00;
    }

    public void Aaf(C32461gQ r3, List list) {
        r3.A07(this.A00, list, new ArrayList());
    }
}
