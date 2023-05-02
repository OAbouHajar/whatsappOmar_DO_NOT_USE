package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.1mf  reason: invalid class name and case insensitive filesystem */
public class C35891mf implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C35891mf(byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            this.A01 = bArr;
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong length: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
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
