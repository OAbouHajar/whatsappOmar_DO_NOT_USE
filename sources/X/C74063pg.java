package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3pg  reason: invalid class name and case insensitive filesystem */
public final class C74063pg extends C18940xV {
    public final AnonymousClass4EK A00;
    public final C16050sL A01;

    public C74063pg(AnonymousClass4EK r1, C16050sL r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C15830rv r4, Collection collection, boolean z2) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (AnonymousClass3K4.A1A(C13680ns.A0V(it), this.A01)) {
                }
            }
            return;
        } else if (r4 == null || this.A01.equals(r4)) {
            this.A00.A00.A3X();
        } else {
            return;
        }
        this.A00.A00.A3X();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4.A10 == 5) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16740tZ r4, int r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x001f
            X.0sL r2 = r3.A01
            X.1Vw r1 = r4.A11
            X.0rv r0 = r1.A00
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x001f
            byte r1 = r4.A10
            r0 = 5
            if (r1 != r0) goto L_0x001f
        L_0x0017:
            X.4EK r0 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = r0.A00
            r0.A3X()
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r3.A09(r4)
            if (r0 == 0) goto L_0x001e
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74063pg.A06(X.0tZ, int):void");
    }

    public void A07(C16740tZ r2, int i2) {
        if ((r2 != null && AnonymousClass3K4.A1A(r2, this.A01) && C38621r6.A0N(r2.A10) && i2 == 3) || A09(r2) || i2 == 30) {
            this.A00.A00.A3X();
        }
    }

    public void A08(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ A0V = C13680ns.A0V(it);
            if (AnonymousClass3K4.A1A(A0V, this.A01) && (C38621r6.A0N(A0V.A10) || A0V.A0x)) {
                this.A00.A00.A3X();
                return;
            } else if (A09(A0V)) {
                this.A00.A00.A3X();
            }
        }
    }

    public final boolean A09(C16740tZ r3) {
        if (!(r3 instanceof C30071bh) || !r3.A11.A02) {
            return false;
        }
        return this.A01.equals(((C30071bh) r3).A02);
    }
}
