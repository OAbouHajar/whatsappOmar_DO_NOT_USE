package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.54J  reason: invalid class name */
public final class AnonymousClass54J implements Closeable {
    public C14210on A00;
    public final URL A01;
    public volatile InputStream A02;

    public AnonymousClass54J(URL url) {
        this.A01 = url;
    }

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                try {
                    AnonymousClass4YN.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e2);
                } catch (IOException e3) {
                    throw AnonymousClass3K4.A0T(e3);
                }
            }
        }
    }
}
