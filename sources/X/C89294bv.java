package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4bv  reason: invalid class name and case insensitive filesystem */
public final class C89294bv {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04;
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ int blockingTasksInBuffer = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C89294bv> cls = C89294bv.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        A03 = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final long A00(C89294bv r7, boolean z2) {
        AnonymousClass55A r5;
        do {
            r5 = (AnonymousClass55A) r7.lastScheduledTask;
            if (r5 == null || (z2 && r5.A01.A00 != 1)) {
                return -2;
            }
            long nanoTime = System.nanoTime() - r5.A00;
            long j2 = AnonymousClass4BM.A04;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
        } while (!AnonymousClass0LG.A00(r7, r5, (Object) null, A04));
        A02(r5);
        return -1;
    }

    public final AnonymousClass55A A01() {
        AnonymousClass55A r2;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (A02.compareAndSet(this, i2, i2 + 1) && (r2 = (AnonymousClass55A) this.A00.getAndSet(i3, (Object) null)) != null) {
                if (r2.A01.A00 == 1) {
                    A01.decrementAndGet(this);
                }
                return r2;
            }
        }
    }

    public final AnonymousClass55A A02(AnonymousClass55A r5) {
        AtomicReferenceArray atomicReferenceArray;
        AnonymousClass55A r3 = (AnonymousClass55A) A04.getAndSet(this, r5);
        if (r3 != null) {
            if (r3.A01.A00 == 1) {
                A01.incrementAndGet(this);
            }
            if (this.producerIndex - this.consumerIndex == 127) {
                return r3;
            }
            int i2 = this.producerIndex & 127;
            while (true) {
                atomicReferenceArray = this.A00;
                if (atomicReferenceArray.get(i2) == null) {
                    break;
                }
                Thread.yield();
            }
            atomicReferenceArray.lazySet(i2, r3);
            A03.incrementAndGet(this);
        }
        return null;
    }
}
