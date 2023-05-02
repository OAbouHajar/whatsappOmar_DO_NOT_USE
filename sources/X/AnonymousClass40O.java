package X;

import java.io.IOException;

/* renamed from: X.40O  reason: invalid class name */
public class AnonymousClass40O extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public AnonymousClass40O() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public AnonymousClass40O(String str, Throwable th) {
        super(AnonymousClass000.A0h(str, AnonymousClass000.A0r("CodedOutputStream was writing to a flat byte array and ran out of space.: ")), th);
    }

    public AnonymousClass40O(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
