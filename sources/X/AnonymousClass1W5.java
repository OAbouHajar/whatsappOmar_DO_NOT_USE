package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* renamed from: X.1W5  reason: invalid class name */
public class AnonymousClass1W5 implements Destroyable {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass1W5(byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public static AnonymousClass1W5 A00() {
        AnonymousClass5T9 r0 = C36471nb.A00().A00;
        byte[] A9P = r0.A9P();
        return new AnonymousClass1W5(r0.generatePublicKey(A9P), A9P);
    }

    public void destroy() {
        if (this.A00.compareAndSet(false, true)) {
            Arrays.fill(this.A01, (byte) 0);
            Arrays.fill(this.A02, (byte) 0);
        }
    }
}
