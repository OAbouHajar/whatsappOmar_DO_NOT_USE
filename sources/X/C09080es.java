package X;

import java.io.Closeable;
import java.util.Map;

/* renamed from: X.0es  reason: invalid class name and case insensitive filesystem */
public abstract class C09080es implements Closeable {
    public Map A00 = AnonymousClass000.A0x();

    public abstract int A00();

    public abstract boolean A01();

    public abstract void close();

    public void finalize() {
        if (!A01()) {
            Object[] objArr = new Object[2];
            objArr[0] = AnonymousClass000.A0c(this);
            AnonymousClass000.A1M(objArr, System.identityHashCode(this), 1);
            AnonymousClass0X1.A03("CloseableImage", "finalize: %s %x still open.", objArr);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
