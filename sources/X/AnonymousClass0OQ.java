package X;

import java.util.List;

/* renamed from: X.0OQ  reason: invalid class name */
public class AnonymousClass0OQ {
    public final List A00;
    public final List A01;
    public final List A02;

    public AnonymousClass0OQ(List list) {
        this.A01 = list;
        this.A00 = AnonymousClass000.A0w(list);
        this.A02 = AnonymousClass000.A0w(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A00.add(new AnonymousClass0HD(((C04880Oj) list.get(i2)).A01.A00));
            this.A02.add(new AnonymousClass0HL(((C04880Oj) list.get(i2)).A00.A00));
        }
    }
}
