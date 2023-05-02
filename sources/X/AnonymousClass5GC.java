package X;

import java.util.concurrent.Future;

/* renamed from: X.5GC  reason: invalid class name */
public final class AnonymousClass5GC extends AnonymousClass5GF {
    public final Future A00;

    public AnonymousClass5GC(Future future) {
        this.A00 = future;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        A00((Throwable) obj);
        return AnonymousClass22M.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CancelFutureOnCancel[");
        A0r.append(this.A00);
        return AnonymousClass3K2.A0m(A0r);
    }
}
