package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1ev  reason: invalid class name and case insensitive filesystem */
public class C31721ev {
    public boolean A00;
    public final C36021ms A01;
    public final LinkedList A02;

    public C31721ev() {
        this.A02 = new LinkedList();
        this.A00 = false;
        this.A00 = true;
        this.A01 = new C36021ms();
    }

    public C31721ev(byte[] bArr) {
        this.A02 = new LinkedList();
        this.A00 = false;
        C36701ny r2 = (C36701ny) C28541Wm.A0E(C36701ny.A03, bArr);
        C36031mt r1 = r2.A02;
        this.A01 = new C36021ms(r1 == null ? C36031mt.A0E : r1);
        this.A00 = false;
        for (C36031mt r22 : r2.A01) {
            this.A02.add(new C36021ms(r22));
        }
    }

    public byte[] A00() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            linkedList.add(((C36021ms) it.next()).A00);
        }
        C28581Wr A0U = C36701ny.A03.A0U();
        C36031mt r0 = this.A01.A00;
        A0U.A03();
        C36701ny r1 = (C36701ny) A0U.A00;
        r1.A02 = r0;
        r1.A00 |= 1;
        A0U.A03();
        C36701ny r2 = (C36701ny) A0U.A00;
        AnonymousClass1XE r12 = r2.A01;
        if (!((AnonymousClass1XF) r12).A00) {
            r12 = C28541Wm.A0G(r12);
            r2.A01 = r12;
        }
        C28591Ws.A01(linkedList, r12);
        return A0U.A02().A02();
    }
}
