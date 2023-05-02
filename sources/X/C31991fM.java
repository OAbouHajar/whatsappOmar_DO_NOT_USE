package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.1fM  reason: invalid class name and case insensitive filesystem */
public class C31991fM implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C31991fM(byte[] bArr) {
        this.A01 = bArr;
    }

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
