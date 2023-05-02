package X;

import java.util.List;

/* renamed from: X.2L1  reason: invalid class name */
public class AnonymousClass2L1 extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List missingFields = null;

    public AnonymousClass2L1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
