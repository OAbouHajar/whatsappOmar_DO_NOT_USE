package X;

import java.io.Serializable;

/* renamed from: X.1vQ  reason: invalid class name and case insensitive filesystem */
public final class C41211vQ implements Serializable {
    public final Throwable exception;

    public C41211vQ(Throwable th) {
        this.exception = th;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41211vQ) && C18450wi.A0R(this.exception, ((C41211vQ) obj).exception);
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Failure(");
        sb.append(this.exception);
        sb.append(')');
        return sb.toString();
    }
}
