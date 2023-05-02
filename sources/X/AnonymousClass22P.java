package X;

import java.io.Serializable;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.22P  reason: invalid class name */
public final class AnonymousClass22P implements Serializable {
    public Set _options;
    public final Pattern nativePattern;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass22P(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 1
            X.C18450wi.A0H(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2)
            X.C18450wi.A0B(r0)
            r1.<init>((java.util.regex.Pattern) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22P.<init>(java.lang.String):void");
    }

    public AnonymousClass22P(Pattern pattern) {
        this.nativePattern = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C18450wi.A0B(pattern);
        return new C1042254k(pattern, this.nativePattern.flags());
    }

    public String toString() {
        String obj = this.nativePattern.toString();
        C18450wi.A0B(obj);
        return obj;
    }
}
