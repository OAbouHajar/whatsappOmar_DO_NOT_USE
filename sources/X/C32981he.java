package X;

import java.security.PrivilegedAction;

/* renamed from: X.1he  reason: invalid class name and case insensitive filesystem */
public final class C32981he implements PrivilegedAction {
    public final /* synthetic */ String A00;

    public C32981he(String str) {
        this.A00 = str;
    }

    public Object run() {
        try {
            return Class.forName(this.A00);
        } catch (Exception unused) {
            return null;
        }
    }
}
