package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1AC  reason: invalid class name */
public final class AnonymousClass1AC extends C18940xV {
    public final C16320sq A00;
    public final C23631Ct A01;
    public final LinkedHashMap A02 = new LinkedHashMap();

    public AnonymousClass1AC(C16320sq r2, C23631Ct r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A06(C16740tZ r8, int i2) {
        C18450wi.A0H(r8, 0);
        if (C88464aY.A00.A00(r8)) {
            Log.i(C18450wi.A06("CrosspostMessageObserver/onMessageAdded crosspostable message ", Long.valueOf(r8.A13)));
            LinkedHashMap linkedHashMap = this.A02;
            Collection values = linkedHashMap.values();
            C18450wi.A0B(values);
            Iterator it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C16740tZ) it.next()).A0H <= 0) {
                        break;
                    }
                } else {
                    Log.i("CrosspostMessageObserver/onMessageAdded all previous messaged delivered. cache cleared");
                    linkedHashMap.clear();
                    break;
                }
            }
            linkedHashMap.put(r8.A11.A01, r8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044 A[LOOP:0: B:10:0x0044->B:13:0x0054, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            r0 = 24
            if (r8 != r0) goto L_0x0056
            X.4aY r0 = X.C88464aY.A00
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0056
            long r1 = r7.A0H
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            long r0 = r7.A13
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "CrosspostMessageObserver/onMessageChanged crosspostable message "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vw r0 = r7.A11
            java.lang.String r2 = r0.A01
            X.C18450wi.A0A(r2)
            java.util.LinkedHashMap r1 = r6.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0039
            r1.put(r2, r7)
        L_0x0039:
            java.util.Collection r0 = r1.values()
            X.C18450wi.A0B(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0044:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r3.next()
            X.0tZ r0 = (X.C16740tZ) r0
            long r1 = r0.A0H
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AC.A07(X.0tZ, int):void");
    }

    public void A08(Collection collection, Map map) {
        C18450wi.A0H(collection, 0);
        this.A00.Acl(new RunnableRunnableShape11S0200000_I0_9(collection, 34, this));
    }
}
