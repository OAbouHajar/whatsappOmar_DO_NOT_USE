package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.15j  reason: invalid class name and case insensitive filesystem */
public class C217715j extends C20380zx {
    public AnonymousClass28d A00;
    public final C18930xU A01;
    public final C217515h A02;
    public final C16440t3 A03;
    public final C217615i A04;
    public final ArrayList A05 = new ArrayList();

    public C217715j(C18930xU r2, C217515h r3, C16440t3 r4, C217615i r5, C20360zv r6) {
        super(r6);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void A0A(String str, boolean z2) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            C17790ve r1 = ((C454028l) it.next()).A00;
            C18450wi.A0H(str, 1);
            C453728e r0 = (C453728e) r1.A02.get(str);
            if (r0 != null) {
                r0.ALs(z2);
            }
        }
    }
}
