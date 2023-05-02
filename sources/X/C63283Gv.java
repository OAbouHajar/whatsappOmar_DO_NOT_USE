package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Gv  reason: invalid class name and case insensitive filesystem */
public class C63283Gv implements AnonymousClass5S7 {
    public final /* synthetic */ C41681wN A00;

    public C63283Gv(C41681wN r1) {
        this.A00 = r1;
    }

    public void AR6(Map map) {
        Iterator A0q = C13680ns.A0q(map);
        while (A0q.hasNext()) {
            Log.e(A0q.next().toString());
        }
        C41681wN r1 = this.A00;
        AnonymousClass1ZR r0 = r1.A01;
        if (r0 != null) {
            r1.A0C(r0.A0W);
        }
    }

    public void AR7(C93644jX r4) {
        C41681wN r2 = this.A00;
        AnonymousClass1ZR r1 = r2.A01;
        if (r1 != null && (r1 instanceof C70643hR)) {
            C70643hR r12 = (C70643hR) r1;
            r12.A00 = r4;
            String str = r4.A04;
            if (str != null) {
                r12.A0K = str;
            }
            String str2 = r4.A02;
            if (str2 != null) {
                r12.A0H = str2;
            }
            byte[] A002 = r4.A00();
            if (A002 != null) {
                r12.A0T = A002;
            }
            r2.A0B.A09(r2.A01);
        }
    }
}
