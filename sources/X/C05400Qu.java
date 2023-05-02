package X;

import java.util.List;

/* renamed from: X.0Qu  reason: invalid class name and case insensitive filesystem */
public class C05400Qu {
    public List A00 = null;

    public void A00(C05090Pf r4) {
        if (this.A00 == null) {
            this.A00 = AnonymousClass000.A0u();
        }
        int i2 = 0;
        while (true) {
            int size = this.A00.size();
            List list = this.A00;
            if (i2 >= size) {
                list.add(r4);
                return;
            } else if (((C05090Pf) list.get(i2)).A00.A00 > r4.A00.A00) {
                this.A00.add(i2, r4);
                return;
            } else {
                i2++;
            }
        }
    }

    public void A01(C05400Qu r3) {
        List list = r3.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = AnonymousClass000.A0w(list);
            }
            for (C05090Pf A002 : r3.A00) {
                A00(A002);
            }
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        for (Object A1I : list) {
            AnonymousClass000.A1I(A1I, A0o);
            A0o.append(10);
        }
        return A0o.toString();
    }
}
