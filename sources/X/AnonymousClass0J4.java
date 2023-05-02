package X;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: X.0J4  reason: invalid class name */
public class AnonymousClass0J4 extends ByteArrayOutputStream {
    public final /* synthetic */ C09070er A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0J4(C09070er r1, int i2) {
        super(i2);
        this.A00 = r1;
    }

    public String toString() {
        int i2 = this.count;
        if (i2 > 0) {
            int i3 = i2 - 1;
            if (this.buf[i3] == 13) {
                i2 = i3;
            }
        }
        try {
            return new String(this.buf, 0, i2, this.A00.A04.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
