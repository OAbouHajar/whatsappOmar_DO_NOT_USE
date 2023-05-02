package X;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.4ae  reason: invalid class name and case insensitive filesystem */
public class C88524ae {
    public static final Pattern A01 = Pattern.compile("\\s*,\\s*");
    public final List A00;

    public C88524ae(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(C90264dr.A00(this.A00, ",", ""));
        return AnonymousClass000.A0h("]", A0r);
    }
}
