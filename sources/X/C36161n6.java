package X;

import java.util.List;

/* renamed from: X.1n6  reason: invalid class name and case insensitive filesystem */
public class C36161n6 extends Exception {
    public C36161n6() {
    }

    public C36161n6(String str) {
        super(str);
    }

    public C36161n6(Throwable th) {
        super(th);
    }

    public C36161n6(List list) {
        super("No valid sessions.", (Throwable) list.get(0));
    }
}
