package X;

import android.os.HandlerThread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.1Ur  reason: invalid class name and case insensitive filesystem */
public class C28181Ur extends C28171Uq {
    public final C28191Us A00;
    public final C28201Ut A01 = new C28201Ut(this);
    public final Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28181Ur(HandlerThread handlerThread, C28141Un r4, Executor executor) {
        super(r4, executor);
        C28191Us r1 = new C28191Us(handlerThread);
        this.A00 = r1;
        this.A02 = new HashSet();
    }
}
