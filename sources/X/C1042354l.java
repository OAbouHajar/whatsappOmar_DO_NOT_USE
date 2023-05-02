package X;

import java.io.Serializable;

/* renamed from: X.54l  reason: invalid class name and case insensitive filesystem */
public final class C1042354l implements Serializable {
    public static final long serialVersionUID = 0;
    public final String algorithmName;
    public final int bytes;
    public final String toString;

    public C1042354l(String str, String str2, int i2) {
        this.algorithmName = str;
        this.bytes = i2;
        this.toString = str2;
    }

    private Object readResolve() {
        return new AnonymousClass54n(this.algorithmName, this.toString, this.bytes);
    }
}
