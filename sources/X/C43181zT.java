package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.1zT  reason: invalid class name and case insensitive filesystem */
public class C43181zT extends FileInputStream {
    public long A00;
    public final /* synthetic */ C43171zS A01;
    public final /* synthetic */ AnonymousClass1QX A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43181zT(C43171zS r1, AnonymousClass1QX r2, File file) {
        super(file);
        this.A02 = r2;
        this.A01 = r1;
    }

    public int read(byte[] bArr, int i2, int i3) {
        while (getChannel().size() < this.A00 + ((long) i3) && (!this.A01.A01)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
                return 0;
            }
        }
        int read = super.read(bArr, i2, i3);
        if (read >= 0) {
            this.A00 += (long) read;
        }
        return read;
    }
}
