package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.4Jh  reason: invalid class name and case insensitive filesystem */
public final class C84114Jh {
    public final Executor A00;
    public volatile C86314Sd A01;
    public volatile Object A02;

    public C84114Jh(Looper looper, Object obj) {
        this.A00 = new AnonymousClass58G(looper);
        C13710nw.A02(obj, "Listener must not be null");
        this.A02 = obj;
        C13710nw.A05("LocationListener");
        this.A01 = new C86314Sd(obj);
    }
}
