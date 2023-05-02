package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

@Deprecated
/* renamed from: X.1n8  reason: invalid class name and case insensitive filesystem */
public class C36181n8 {
    public final C31861f9 A00;
    public final C208211s A01;
    public final AnonymousClass16P A02;

    public C36181n8(C31861f9 r1, C208211s r2, AnonymousClass16P r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public C31881fB A00(C36061mw r5) {
        this.A02.A01();
        AnonymousClass00B.A06(r5);
        C31871fA A002 = this.A00.A00(new C30981dH(C31811f4.A00(r5.A01), r5.A00));
        if (A002 != null) {
            return new C31881fB(A002.A01);
        }
        try {
            return new C31881fB();
        } catch (IOException e2) {
            Log.w("axolotl ioexception while reading fast ratchet sender key record", e2);
            return new C31881fB();
        }
    }

    public void A01(C36061mw r9, C31881fB r10) {
        C208211s r6 = this.A01;
        C30981dH r7 = new C30981dH(C31811f4.A00(r9.A01), r9.A00);
        C28581Wr A0U = C36741o2.A01.A0U();
        Iterator it = r10.A00.iterator();
        while (it.hasNext()) {
            C36221nC r3 = ((C36211nB) it.next()).A00;
            A0U.A03();
            C36741o2 r2 = (C36741o2) A0U.A00;
            AnonymousClass1XE r1 = r2.A00;
            if (!((AnonymousClass1XF) r1).A00) {
                r1 = C28541Wm.A0G(r1);
                r2.A00 = r1;
            }
            r1.add(r3);
        }
        r6.A0Z(r7, A0U.A02().A02());
    }
}
