package X;

import java.util.UUID;

/* renamed from: X.0vh  reason: invalid class name and case insensitive filesystem */
public final class C17820vh {
    public String A00;

    public String A00() {
        String str = this.A00;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A00 = str;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return str;
    }
}
