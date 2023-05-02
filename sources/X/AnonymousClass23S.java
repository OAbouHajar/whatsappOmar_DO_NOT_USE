package X;

/* renamed from: X.23S  reason: invalid class name */
public class AnonymousClass23S extends Exception {
    public String description = null;
    public final Integer e2eFailureReason;

    public AnonymousClass23S(Integer num) {
        this.e2eFailureReason = num;
    }

    public AnonymousClass23S(Integer num, String str) {
        this.e2eFailureReason = num;
        this.description = str;
    }
}
