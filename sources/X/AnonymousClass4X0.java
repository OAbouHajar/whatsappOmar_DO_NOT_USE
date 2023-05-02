package X;

/* renamed from: X.4X0  reason: invalid class name */
public abstract class AnonymousClass4X0 {
    public void A00(C89904d8 r2, C89904d8 r3) {
        if (this instanceof C68193d2) {
            r2.next = r3;
        } else {
            ((C68203d3) this).A02.lazySet(r2, r3);
        }
    }

    public void A01(C89904d8 r2, Thread thread) {
        if (this instanceof C68193d2) {
            r2.thread = thread;
        } else {
            ((C68203d3) this).A03.lazySet(r2, thread);
        }
    }

    public boolean A02(C89914d9 r2, C89914d9 r3, C29961bW r4) {
        boolean z2;
        if (!(this instanceof C68193d2)) {
            return AnonymousClass0LG.A00(r4, r2, r3, ((C68203d3) this).A00);
        }
        synchronized (r4) {
            if (r4.listeners == r2) {
                r4.listeners = r3;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public boolean A03(C89904d8 r2, C89904d8 r3, C29961bW r4) {
        boolean z2;
        if (!(this instanceof C68193d2)) {
            return AnonymousClass0LG.A00(r4, r2, r3, ((C68203d3) this).A04);
        }
        synchronized (r4) {
            if (r4.waiters == r2) {
                r4.waiters = r3;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public boolean A04(C29961bW r3, Object obj, Object obj2) {
        boolean z2;
        if (!(this instanceof C68193d2)) {
            return AnonymousClass0LG.A00(r3, (Object) null, obj2, ((C68203d3) this).A01);
        }
        synchronized (r3) {
            if (r3.value == null) {
                r3.value = obj2;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }
}
