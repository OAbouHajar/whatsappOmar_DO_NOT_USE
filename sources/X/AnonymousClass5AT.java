package X;

import java.util.List;

/* renamed from: X.5AT  reason: invalid class name */
public class AnonymousClass5AT implements AnonymousClass5R6 {
    public int A00 = -1;
    public final int A01;
    public final List A02;

    public AnonymousClass5AT(List list) {
        this.A02 = list;
        this.A01 = list.size();
    }

    public String readLine() {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 < this.A01) {
            return ((AnonymousClass4JM) this.A02.get(i2)).A00;
        }
        return null;
    }
}
