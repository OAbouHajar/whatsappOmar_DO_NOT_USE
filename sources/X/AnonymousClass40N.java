package X;

import java.io.IOException;

/* renamed from: X.40N  reason: invalid class name */
public final class AnonymousClass40N extends IOException {
    public AnonymousClass40N() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public AnonymousClass40N(String str, Throwable th) {
        super(C13680ns.A0g(String.valueOf(str), "CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
    }

    public AnonymousClass40N(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
