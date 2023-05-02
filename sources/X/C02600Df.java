package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Df  reason: invalid class name and case insensitive filesystem */
public final class C02600Df extends AnonymousClass0Rt {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public C02600Df(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }

    public void A00(AnonymousClass0W5 r2, AnonymousClass0W5 r3) {
        this.A02.lazySet(r2, r3);
    }

    public void A01(AnonymousClass0W5 r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public boolean A02(AnonymousClass0U0 r2, AnonymousClass0U0 r3, C08980ei r4) {
        return AnonymousClass0LG.A00(r4, r2, r3, this.A00);
    }

    public boolean A03(AnonymousClass0W5 r2, AnonymousClass0W5 r3, C08980ei r4) {
        return AnonymousClass0LG.A00(r4, r2, r3, this.A04);
    }

    public boolean A04(C08980ei r3, Object obj, Object obj2) {
        return AnonymousClass0LG.A00(r3, (Object) null, obj2, this.A01);
    }
}
