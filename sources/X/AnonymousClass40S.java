package X;

import java.io.IOException;

/* renamed from: X.40S  reason: invalid class name */
public class AnonymousClass40S extends IOException implements C108875Pv {
    public final int errorCode;

    public AnonymousClass40S(int i2, String str) {
        super(str);
        this.errorCode = i2;
    }

    public AnonymousClass40S(String str, Throwable th, int i2) {
        super(str, th);
        this.errorCode = i2;
    }

    public AnonymousClass40S(Throwable th) {
        super(th);
        this.errorCode = 200;
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
