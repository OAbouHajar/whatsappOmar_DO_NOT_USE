package X;

import java.io.Closeable;

/* renamed from: X.5GL  reason: invalid class name */
public abstract class AnonymousClass5GL extends C11340ia implements Closeable {
    public static final C106175Cv A00 = new C106175Cv();

    public void close() {
        if (this instanceof AnonymousClass5GS) {
            throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
        }
        throw AnonymousClass000.A0V("Cannot be invoked on Dispatchers.IO");
    }
}
