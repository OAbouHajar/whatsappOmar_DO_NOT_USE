package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3FP  reason: invalid class name */
public final class AnonymousClass3FP implements AnonymousClass5PO {
    public final C14550pN A00;
    public final C20300zp A01;

    public AnonymousClass3FP(C14550pN r1, C20300zp r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        if (i2 == 21) {
            C20290zo r6 = this.A01.A00;
            ClipboardManager A0B = r6.A01.A0B();
            if (A0B == null) {
                return false;
            }
            ArrayList A0i = C13690nt.A0i(map.size());
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                long j2 = ((C16740tZ) A0z.getValue()).A13;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(((C28381Vw) A0z.getKey()).A01);
                A0o.append(':');
                A0i.add(C13680ns.A0j(A0o, j2));
            }
            String A0A = AnonymousClass1ZW.A0A(",\n", A0i);
            A0B.setPrimaryClip(ClipData.newPlainText(A0A, A0A));
            r6.A00.A0H("Message ids copied", 0);
            return true;
        } else if (i2 != 22) {
            return false;
        } else {
            C20280zn r5 = this.A01.A01;
            C14550pN r4 = this.A00;
            r5.A00.A0I("Export messages for internal testing", 0);
            ArrayList A0i2 = C13690nt.A0i(map.size());
            Iterator A0y2 = AnonymousClass000.A0y(map);
            while (A0y2.hasNext()) {
                C13700nu.A0d(A0i2, ((C16740tZ) AnonymousClass000.A0z(A0y2).getValue()).A13);
            }
            C20270zm r0 = r5.A01;
            C13700nu.A0W(new C73923pJ(r4, r0.A00, A0i2), r0.A01);
            return true;
        }
    }
}
