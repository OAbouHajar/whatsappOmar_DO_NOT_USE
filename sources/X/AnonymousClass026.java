package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.026  reason: invalid class name */
public class AnonymousClass026 extends AnonymousClass027 {
    public AnonymousClass03P A00 = new AnonymousClass03P();

    public void A02() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C019909h r1 = (C019909h) ((Map.Entry) it.next()).getValue();
            r1.A01.A07(r1);
        }
    }

    public void A03() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C019909h r1 = (C019909h) ((Map.Entry) it.next()).getValue();
            r1.A01.A08(r1);
        }
    }

    public void A0C(AnonymousClass028 r3) {
        C019909h r1 = (C019909h) this.A00.A01(r3);
        if (r1 != null) {
            r1.A01.A08(r1);
        }
    }

    public void A0D(AnonymousClass028 r3, AnonymousClass023 r4) {
        if (r3 != null) {
            C019909h r1 = new C019909h(r3, r4);
            C019909h r0 = (C019909h) this.A00.A02(r3, r1);
            if (r0 != null) {
                if (r0.A02 != r4) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
            } else if (this.A00 > 0) {
                r1.A01.A07(r1);
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
