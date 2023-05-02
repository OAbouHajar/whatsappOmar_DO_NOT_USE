package X;

import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.53S  reason: invalid class name */
public final class AnonymousClass53S implements C46642Fg {
    public final C28371Vv A00;

    public AnonymousClass53S(List list, List list2) {
        C32461gQ A0S = AnonymousClass3K4.A0S("leave");
        if (C32271fx.A0E(list, 0, FileUtils.ONE_KB)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("getNode");
            }
        }
        if (C32271fx.A0E(list2, 1, FileUtils.ONE_KB)) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A0S.A03(((C83064Ff) it2.next()).A00);
            }
        }
        this.A00 = A0S.A01();
    }

    public C28371Vv ADy() {
        return this.A00;
    }

    public void Aaf(C32461gQ r3, List list) {
        r3.A07(this.A00, list, AnonymousClass000.A0u());
    }
}
