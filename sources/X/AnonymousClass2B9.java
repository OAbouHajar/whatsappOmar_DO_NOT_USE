package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2B9  reason: invalid class name */
public class AnonymousClass2B9 {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public AnonymousClass2B9() {
        this.A02 = new ArrayList();
        this.A00 = new ArrayList();
        this.A03 = new ArrayList();
        this.A04 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public AnonymousClass2B9(List list, List list2, List list3, List list4, List list5) {
        this.A02 = list;
        this.A00 = list2;
        this.A03 = list3;
        this.A04 = list4;
        this.A01 = list5;
    }

    public static AnonymousClass2B9 A00() {
        return new AnonymousClass2B9();
    }

    public AnonymousClass2B9 A01() {
        return new AnonymousClass2B9(new ArrayList(this.A02), new ArrayList(this.A00), new ArrayList(this.A03), new ArrayList(this.A04), new ArrayList(this.A01));
    }
}
