package X;

/* renamed from: X.0De  reason: invalid class name and case insensitive filesystem */
public final class C02590De extends AnonymousClass0Rt {
    public void A00(AnonymousClass0W5 r1, AnonymousClass0W5 r2) {
        r1.next = r2;
    }

    public void A01(AnonymousClass0W5 r1, Thread thread) {
        r1.thread = thread;
    }

    public boolean A02(AnonymousClass0U0 r2, AnonymousClass0U0 r3, C08980ei r4) {
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

    public boolean A03(AnonymousClass0W5 r2, AnonymousClass0W5 r3, C08980ei r4) {
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

    public boolean A04(C08980ei r3, Object obj, Object obj2) {
        boolean z2;
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
