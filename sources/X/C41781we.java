package X;

import com.obwhatsapp.R;
import com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0;
import java.util.Collection;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public abstract class C41781we {
    public void A00() {
    }

    public void A01() {
    }

    public void A02(C37771pi r1) {
    }

    public void A03(C37771pi r1) {
    }

    public void A04(String str) {
    }

    public void A05(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = (X.C41791wf) r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.String r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x0024
            r1 = r8
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r1.A00
            X.1wf r0 = (X.C41791wf) r0
            X.1wg r1 = r0.A03
            if (r1 == 0) goto L_0x0024
            java.util.List r6 = r0.A04
            if (r6 == 0) goto L_0x0024
            java.util.HashSet r5 = r0.A0F
            java.util.HashMap r3 = r0.A0E
            java.util.HashMap r4 = r0.A0D
            r2 = r9
            r7 = r10
            r1.AXp(r2, r3, r4, r5, r6, r7)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41781we.A06(java.lang.String, int):void");
    }

    public void A07(String str, String str2) {
    }

    public void A08(Collection collection, boolean z2) {
        if (this instanceof IDxSObserverShape99S0100000_1_I0) {
            IDxSObserverShape99S0100000_1_I0 iDxSObserverShape99S0100000_1_I0 = (IDxSObserverShape99S0100000_1_I0) this;
            switch (iDxSObserverShape99S0100000_1_I0.A01) {
                case 0:
                    AnonymousClass2Ur r1 = (AnonymousClass2Ur) iDxSObserverShape99S0100000_1_I0.A00;
                    r1.A04(collection, true);
                    r1.A0J.A0G();
                    return;
                case 1:
                    C41801wg r12 = ((C41791wf) iDxSObserverShape99S0100000_1_I0.A00).A03;
                    if (r12 != null) {
                        r12.AQw(true, z2);
                        return;
                    }
                    return;
                default:
                    ((C14550pN) iDxSObserverShape99S0100000_1_I0.A00).A05.A09(R.string.str16cd, 1);
                    return;
            }
        }
    }

    public void A09(boolean z2) {
        if (this instanceof IDxSObserverShape99S0100000_1_I0) {
            IDxSObserverShape99S0100000_1_I0 iDxSObserverShape99S0100000_1_I0 = (IDxSObserverShape99S0100000_1_I0) this;
            switch (iDxSObserverShape99S0100000_1_I0.A01) {
                case 1:
                    C41791wf r2 = (C41791wf) iDxSObserverShape99S0100000_1_I0.A00;
                    C41801wg r1 = r2.A03;
                    if (r1 != null) {
                        r1.AQw(true, z2);
                    }
                    C26161Mo r0 = r2.A01;
                    if (r0 != null) {
                        r0.A05();
                        return;
                    }
                    return;
                case 2:
                    ((C14550pN) iDxSObserverShape99S0100000_1_I0.A00).A05.A09(R.string.str16ea, 1);
                    return;
                default:
                    return;
            }
        }
    }
}
