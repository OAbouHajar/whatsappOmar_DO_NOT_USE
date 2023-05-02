package X;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4uT  reason: invalid class name and case insensitive filesystem */
public class C99714uT implements AnonymousClass5MO {
    public final Deque A00 = new LinkedList();
    public final Map A01 = new ConcurrentHashMap();
    public final ReentrantLock A02 = new ReentrantLock();

    public final void A00(String str) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            Deque deque = this.A00;
            deque.removeFirstOccurrence(str);
            deque.addFirst(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        return this.A01.toString();
    }
}
