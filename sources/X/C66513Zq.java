package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Zq  reason: invalid class name and case insensitive filesystem */
public final class C66513Zq extends C14340p0 {
    public final AnonymousClass4GV A00 = new AnonymousClass4GV();

    public final void A00(Throwable th, Throwable th2) {
        if (th2 != th) {
            AnonymousClass4GV r2 = this.A00;
            ReferenceQueue referenceQueue = r2.A00;
            while (true) {
                Reference poll = referenceQueue.poll();
                if (poll == null) {
                    break;
                }
                r2.A01.remove(poll);
            }
            AnonymousClass5BD r0 = new AnonymousClass5BD(th, (ReferenceQueue) null);
            ConcurrentHashMap concurrentHashMap = r2.A01;
            List list = (List) concurrentHashMap.get(r0);
            if (list == null) {
                list = new Vector(2);
                List list2 = (List) concurrentHashMap.putIfAbsent(new AnonymousClass5BD(th, referenceQueue), list);
                if (list2 != null) {
                    list = list2;
                }
            }
            list.add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
