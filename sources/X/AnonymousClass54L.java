package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.54L  reason: invalid class name */
public class AnonymousClass54L implements Closeable {
    public AnonymousClass0UN A00 = AnonymousClass0UN.A01;
    public final C09110ev A01;

    public AnonymousClass54L(C09110ev r2) {
        AnonymousClass0T3.A00(C09110ev.A01(r2));
        this.A01 = r2.clone();
    }

    public InputStream A00() {
        C09110ev A03 = this.A01.A03();
        if (A03 == null) {
            return null;
        }
        try {
            return new AnonymousClass0J9((C13600me) A03.A04());
        } finally {
            A03.close();
        }
    }

    public void close() {
        this.A01.close();
    }
}
