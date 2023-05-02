package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.64m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1211764m implements Runnable {
    public final /* synthetic */ C114105n8 A00;

    public /* synthetic */ C1211764m(C114105n8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass027 r1;
        Boolean bool;
        AnonymousClass5xC r0;
        C114105n8 r6 = this.A00;
        C221116r r8 = r6.A02;
        boolean z2 = true;
        Integer[] numArr = new Integer[1];
        int A1W = C13690nt.A1W(numArr, 20);
        Integer[] numArr2 = new Integer[1];
        numArr2[A1W] = 40;
        List A0c = r8.A0c(numArr, numArr2, -1);
        C14710pd r4 = r6.A04;
        AnonymousClass60V r3 = r6.A05;
        if (!AnonymousClass5xN.A01(r4, r3.A08())) {
            Iterator it = A0c.iterator();
            while (it.hasNext()) {
                C111855hW r02 = (C111855hW) ((AnonymousClass1Vt) it.next()).A0A;
                if (!(r02 == null || (r0 = r02.A0B) == null || !AnonymousClass5xN.A02(r0.A0E))) {
                    it.remove();
                }
            }
        }
        if (A0c.isEmpty()) {
            Integer[] numArr3 = new Integer[1];
            AnonymousClass000.A1M(numArr3, 417, A1W);
            Integer[] numArr4 = new Integer[1];
            numArr4[A1W] = 40;
            Iterator it2 = r8.A0c(numArr3, numArr4, -1).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                AnonymousClass1W2 r12 = ((AnonymousClass1Vt) it2.next()).A0A;
                if (r12 instanceof C111855hW) {
                    AnonymousClass5xC r13 = ((C111855hW) r12).A0B;
                    if (!AnonymousClass5xN.A01(r4, r3.A08())) {
                        if (r13 == null) {
                            continue;
                        } else if (AnonymousClass5xN.A02(r13.A0E)) {
                            continue;
                        }
                    } else if (r13 == null) {
                        continue;
                    }
                    AnonymousClass5xB r2 = r13.A0C;
                    if (r2 != null && r2.A08.equals("UNKNOWN") && r2.A09.equals("INIT")) {
                        break;
                    }
                }
            }
            r1 = r6.A00;
            bool = Boolean.valueOf(z2);
        } else {
            r1 = r6.A00;
            bool = Boolean.TRUE;
        }
        r1.A09(bool);
    }
}
