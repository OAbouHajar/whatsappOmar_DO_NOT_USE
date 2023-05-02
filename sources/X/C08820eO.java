package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: X.0eO  reason: invalid class name and case insensitive filesystem */
public final class C08820eO implements C12880l7 {
    public /* bridge */ /* synthetic */ void Abg(Object obj) {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                try {
                    AnonymousClass0TR.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", e2);
                } catch (IOException unused) {
                }
            }
        }
    }
}
