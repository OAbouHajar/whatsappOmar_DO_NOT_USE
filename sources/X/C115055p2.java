package X;

/* renamed from: X.5p2  reason: invalid class name and case insensitive filesystem */
public class C115055p2 extends Exception {
    public final Exception innerException;

    public C115055p2(Exception exc) {
        this.innerException = exc;
    }

    public String toString() {
        return this.innerException.toString();
    }
}
