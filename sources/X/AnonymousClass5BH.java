package X;

import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.5BH  reason: invalid class name */
public final class AnonymousClass5BH extends DigestOutputStream {
    public boolean A00;

    public AnonymousClass5BH(OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
    }

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            super.close();
        }
    }
}
