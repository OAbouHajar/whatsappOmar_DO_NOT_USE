package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.1Uj  reason: invalid class name and case insensitive filesystem */
public class C28101Uj extends LinkedBlockingQueue<Runnable> {
    public C28101Uj() {
        super(2048);
    }

    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (size() == 0) {
            return super.offer(obj);
        }
        return false;
    }
}
