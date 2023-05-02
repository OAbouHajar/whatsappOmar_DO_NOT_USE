package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0H8  reason: invalid class name */
public final class AnonymousClass0H8 extends AnonymousClass0Ru {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public AnonymousClass0H8(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }

    public void A00(AnonymousClass0W7 r2, AnonymousClass0W7 r3) {
        this.A02.lazySet(r2, r3);
    }

    public void A01(AnonymousClass0W7 r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public boolean A02(AnonymousClass0U4 r2, AnonymousClass0U4 r3, C08990ej r4) {
        return AnonymousClass0LG.A00(r4, r2, r3, this.A00);
    }

    public boolean A03(AnonymousClass0W7 r2, AnonymousClass0W7 r3, C08990ej r4) {
        return AnonymousClass0LG.A00(r4, r2, r3, this.A04);
    }

    public boolean A04(C08990ej r2, Object obj, Object obj2) {
        return AnonymousClass0LG.A00(r2, obj, obj2, this.A01);
    }
}
