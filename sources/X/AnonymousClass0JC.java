package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.0JC  reason: invalid class name */
public abstract class AnonymousClass0JC extends OutputStream {
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            C04320Mb.A00(e2);
            throw AnonymousClass000.A0Z();
        }
    }
}
