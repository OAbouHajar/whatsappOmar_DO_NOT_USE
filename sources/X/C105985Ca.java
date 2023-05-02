package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.5Ca  reason: invalid class name and case insensitive filesystem */
public class C105985Ca extends LinkedBlockingDeque<Runnable> {
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return isEmpty() && super.offer(obj);
    }
}
