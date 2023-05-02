package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ff  reason: invalid class name and case insensitive filesystem */
public final class C46632Ff implements C46642Fg {
    public final C28371Vv A00;

    public C46632Ff(boolean z2) {
        C32461gQ r4 = new C32461gQ("chatstate");
        C32461gQ r3 = new C32461gQ("composing");
        if (z2) {
            r3.A02(new C35081lL("media", "audio"));
        }
        r4.A03(r3.A01());
        this.A00 = r4.A01();
    }

    public C28371Vv ADy() {
        return this.A00;
    }

    public void Aaf(C32461gQ r3, List list) {
        r3.A07(this.A00, list, new ArrayList());
    }
}
