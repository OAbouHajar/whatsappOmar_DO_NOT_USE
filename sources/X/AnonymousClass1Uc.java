package X;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.1Uc  reason: invalid class name */
public class AnonymousClass1Uc extends LinkedTransferQueue<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return tryTransfer(obj);
    }
}
