package X;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: X.54k  reason: invalid class name and case insensitive filesystem */
public final class C1042254k implements Serializable {
    public static final long serialVersionUID = 0;
    public final int flags;
    public final String pattern;

    public C1042254k(String str, int i2) {
        this.pattern = str;
        this.flags = i2;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.pattern, this.flags);
        C18450wi.A0B(compile);
        return new AnonymousClass22P(compile);
    }
}
