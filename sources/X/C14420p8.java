package X;

import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: X.0p8  reason: invalid class name and case insensitive filesystem */
public final class C14420p8 implements C14230op {
    public final /* synthetic */ C14120oe A00;

    public C14420p8(C14120oe r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object Agh(C14210on r5) {
        Throwable th;
        Object obj;
        Class<IOException> cls = IOException.class;
        synchronized (r5.A04) {
            C13710nw.A04("Task is not yet complete", r5.A02);
            if (r5.A05) {
                th = new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(r5.A00)) {
                Exception exc = r5.A00;
                if (exc == null) {
                    obj = r5.A01;
                } else {
                    th = new C105565Ac(exc);
                }
            } else {
                th = cls.cast(r5.A00);
            }
            throw th;
        }
        return C14120oe.A00((Bundle) obj);
    }
}
