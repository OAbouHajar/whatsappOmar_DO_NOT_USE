package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.01W  reason: invalid class name */
public abstract class AnonymousClass01W extends AnonymousClass01X {
    public final AnonymousClass0UC A00;

    public AnonymousClass01W(C04800Nz r3) {
        this.A00 = new AnonymousClass0UC(r3, new C07590c9(this));
    }

    public AnonymousClass01W(AnonymousClass0Q5 r4) {
        this.A00 = new AnonymousClass0UC(new AnonymousClass0US(r4).A00(), new C07590c9(this));
    }

    public int A0C() {
        return this.A00.A02.size();
    }

    public Object A0E(int i2) {
        return this.A00.A02.get(i2);
    }

    public void A0F(List list) {
        AnonymousClass0UC r5 = this.A00;
        int i2 = r5.A00 + 1;
        r5.A00 = i2;
        List list2 = r5.A01;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            r5.A01 = null;
            r5.A02 = Collections.emptyList();
            r5.A04.AW0(0, size);
        } else if (list2 == null) {
            r5.A01 = list;
            r5.A02 = Collections.unmodifiableList(list);
            r5.A04.ASG(0, list.size());
        } else {
            r5.A03.A01.execute(new C10420h6(r5, list2, list, i2));
        }
    }
}
