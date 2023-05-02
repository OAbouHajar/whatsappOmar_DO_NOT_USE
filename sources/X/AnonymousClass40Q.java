package X;

import java.io.IOException;

/* renamed from: X.40Q  reason: invalid class name */
public final class AnonymousClass40Q extends IOException {
    public AnonymousClass40Q() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public AnonymousClass40Q(String str) {
        super(C13680ns.A0g(String.valueOf(str), "CodedOutputStream was writing to a flat byte array and ran out of space.: "));
    }

    public AnonymousClass40Q(String str, Throwable th) {
        super(C13680ns.A0g(String.valueOf(str), "CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
    }

    public AnonymousClass40Q(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
