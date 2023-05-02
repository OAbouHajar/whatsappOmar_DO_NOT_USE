package X;

import java.io.IOException;
import java.security.Principal;

/* renamed from: X.5J8  reason: invalid class name */
public class AnonymousClass5J8 extends AnonymousClass5IK implements Principal {
    public AnonymousClass5J8(AnonymousClass5IQ r2) {
        super(r2.A01);
    }

    public byte[] A01() {
        try {
            return A02("DER");
        } catch (IOException e2) {
            throw AnonymousClass000.A0a(e2.toString());
        }
    }

    public String getName() {
        return toString();
    }
}
