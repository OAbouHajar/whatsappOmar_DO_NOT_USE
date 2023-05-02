package X;

import java.util.LinkedList;

/* renamed from: X.1nc  reason: invalid class name and case insensitive filesystem */
public class C36481nc {
    public LinkedList A00;
    public C36541ni A01;
    public boolean A02;

    public C36481nc() {
        this.A01 = new C36541ni();
        this.A00 = new LinkedList();
        this.A02 = false;
        this.A02 = true;
    }

    public C36481nc(byte[] bArr) {
        this.A01 = new C36541ni();
        this.A00 = new LinkedList();
        this.A02 = false;
        C36701ny r2 = (C36701ny) C28541Wm.A0E(C36701ny.A03, bArr);
        C36031mt r1 = r2.A02;
        this.A01 = new C36541ni(r1 == null ? C36031mt.A0E : r1);
        this.A02 = false;
        for (C36031mt r22 : r2.A01) {
            this.A00.add(new C36541ni(r22));
        }
    }
}
