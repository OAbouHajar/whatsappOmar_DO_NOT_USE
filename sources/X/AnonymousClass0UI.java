package X;

import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0UI  reason: invalid class name */
public final class AnonymousClass0UI {
    public static final AnonymousClass03B A00() {
        if (AnonymousClass03B.A06 == null) {
            ReentrantLock reentrantLock = AnonymousClass03B.A05;
            reentrantLock.lock();
            try {
                if (AnonymousClass03B.A06 == null) {
                    AnonymousClass03B.A06 = new AnonymousClass03B(AnonymousClass03B.A04.A01());
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        AnonymousClass03B r0 = AnonymousClass03B.A06;
        C18450wi.A0F(r0);
        return r0;
    }

    public final AnonymousClass03C A01() {
        try {
            Integer A00 = AnonymousClass0W1.A00();
            if (A00 != null && A00.intValue() >= 1 && AnonymousClass0W1.A01()) {
                return new C07900cg();
            }
        } catch (Throwable th) {
            Log.d("EmbeddingBackend", C18450wi.A06("Failed to load embedding extension: ", th));
        }
        Log.d("EmbeddingBackend", "No supported embedding extension found");
        return null;
    }
}
