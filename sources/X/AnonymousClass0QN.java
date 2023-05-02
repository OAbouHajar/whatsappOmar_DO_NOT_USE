package X;

import java.util.List;

/* renamed from: X.0QN  reason: invalid class name */
public class AnonymousClass0QN {
    public int A00 = 0;
    public List A01 = null;

    public void A00() {
        this.A00 += 1000;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        for (Object append : this.A01) {
            A0o.append(append);
            A0o.append(' ');
        }
        A0o.append('[');
        A0o.append(this.A00);
        A0o.append(']');
        return A0o.toString();
    }
}
