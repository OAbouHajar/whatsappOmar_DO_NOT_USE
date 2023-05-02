package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.66o  reason: invalid class name and case insensitive filesystem */
public class C1217166o implements Runnable {
    public final /* synthetic */ C1218367a A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ boolean A04;

    public C1217166o(C1218367a r1, Exception exc, Object obj, ArrayList arrayList, boolean z2) {
        this.A00 = r1;
        this.A04 = z2;
        this.A03 = arrayList;
        this.A01 = exc;
        this.A02 = obj;
    }

    public void run() {
        boolean z2 = this.A04;
        if (z2 || !this.A03.isEmpty()) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                C118595uw r1 = (C118595uw) it.next();
                if (z2) {
                    r1.A03(this.A02);
                } else {
                    r1.A02(this.A01);
                }
            }
            return;
        }
        throw C110115dX.A0Z(this.A01);
    }
}
