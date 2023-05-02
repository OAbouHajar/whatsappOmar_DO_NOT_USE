package X;

import java.util.List;

/* renamed from: X.3gP  reason: invalid class name and case insensitive filesystem */
public class C70283gP extends AnonymousClass4XQ {
    public final String A00;
    public final List A01;

    public C70283gP(List list, char c2) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = Character.toString(c2);
            return;
        }
        throw C70003fx.A00("Empty properties");
    }
}
