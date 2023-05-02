package X;

import java.util.List;

/* renamed from: X.3gQ  reason: invalid class name and case insensitive filesystem */
public class C70293gQ extends AnonymousClass4XQ {
    public List A00;
    public final String A01;
    public final String A02;

    public C70293gQ(String str, List list) {
        this.A02 = AnonymousClass000.A0h((list == null || list.size() <= 0) ? "()" : "(...)", AnonymousClass000.A0q(str));
        if (str != null) {
            this.A01 = str;
            this.A00 = list;
            return;
        }
        this.A00 = null;
    }
}
