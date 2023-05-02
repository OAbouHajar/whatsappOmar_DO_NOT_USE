package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5CW  reason: invalid class name */
public final class AnonymousClass5CW extends CancellationException {
    public final C004001t job;

    public AnonymousClass5CW(String str, Throwable th, C004001t r3) {
        super(str);
        this.job = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5CW)) {
            return false;
        }
        AnonymousClass5CW r3 = (AnonymousClass5CW) obj;
        return C18450wi.A0R(r3.getMessage(), getMessage()) && C18450wi.A0R(r3.job, this.job) && C18450wi.A0R(r3.getCause(), getCause());
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C18450wi.A0F(message);
        return AnonymousClass000.A0E(this.job, AnonymousClass3K4.A07(message)) + AnonymousClass000.A0C(getCause());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(super.toString());
        A0o.append("; job=");
        return AnonymousClass000.A0f(this.job, A0o);
    }
}
