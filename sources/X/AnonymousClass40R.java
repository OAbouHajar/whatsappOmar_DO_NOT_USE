package X;

import java.io.IOException;

/* renamed from: X.40R  reason: invalid class name */
public class AnonymousClass40R extends IOException implements C108875Pv {
    public final int errorCode = 201;

    public AnonymousClass40R(String str) {
        super(str);
    }

    public int ADj() {
        return this.errorCode;
    }

    public String getMessage() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(super.getMessage());
        A0o.append(" (error_code=");
        A0o.append(this.errorCode);
        return AnonymousClass000.A0h(")", A0o);
    }
}
