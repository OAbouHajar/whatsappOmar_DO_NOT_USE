package X;

/* renamed from: X.0H7  reason: invalid class name */
public final class AnonymousClass0H7 extends AnonymousClass0Ru {
    public void A00(AnonymousClass0W7 r1, AnonymousClass0W7 r2) {
        r1.next = r2;
    }

    public void A01(AnonymousClass0W7 r1, Thread thread) {
        r1.thread = thread;
    }

    public boolean A02(AnonymousClass0U4 r2, AnonymousClass0U4 r3, C08990ej r4) {
        boolean z2;
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

    public boolean A03(AnonymousClass0W7 r2, AnonymousClass0W7 r3, C08990ej r4) {
        boolean z2;
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

    public boolean A04(C08990ej r2, Object obj, Object obj2) {
        boolean z2;
        synchronized (r2) {
            if (r2.value == obj) {
                r2.value = obj2;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }
}
