package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4yk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102314yk implements AnonymousClass2VG {
    public final /* synthetic */ C26161Mo A00;

    public /* synthetic */ C102314yk(C26161Mo r1) {
        this.A00 = r1;
    }

    public final void AWX(AnonymousClass2X4 r6) {
        C26161Mo r4 = this.A00;
        List list = r6.A01;
        ArrayList A0i = C13690nt.A0i(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            A0i.add(list.get(i2));
        }
        AnonymousClass027 r1 = r4.A03;
        if ((r1.A01() != null && !((List) r1.A01()).isEmpty()) || !A0i.isEmpty()) {
            r1.A0B(A0i);
        }
    }
}
