package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.0J6  reason: invalid class name */
public class AnonymousClass0J6 extends FilterOutputStream {
    public final /* synthetic */ C05220Pt A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0J6(C05220Pt r1, OutputStream outputStream) {
        super(outputStream);
        this.A00 = r1;
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(int i2) {
        try {
            this.out.write(i2);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(byte[] bArr, int i2, int i3) {
        try {
            this.out.write(bArr, i2, i3);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }
}
