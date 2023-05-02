package X;

import android.os.PowerManager;

/* renamed from: X.0yi  reason: invalid class name and case insensitive filesystem */
public class C19610yi implements C19620yj {
    public AnonymousClass2DT A00;
    public C38701rH A01;
    public C38701rH A02;
    public boolean A03;

    public C19610yi(C19510yY r3, C14710pd r4, AnonymousClass15M r5) {
        (r4.A0E(C16620tM.A02, 1617) ? r3.A01 : r5.A02).add(this);
    }

    public synchronized AnonymousClass2DT A00() {
        return this.A00;
    }

    public C38701rH A01() {
        C38701rH r0;
        synchronized (this) {
            r0 = this.A02;
        }
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2DT A002 = A00();
        if (A002 != null) {
            return A002.A0O;
        }
        C38701rH A022 = A02();
        if (A022 == null) {
            return null;
        }
        return A022;
    }

    public synchronized C38701rH A02() {
        return this.A01;
    }

    public void A03() {
        AnonymousClass2DT r2 = this.A00;
        if (r2 != null) {
            boolean z2 = true;
            r2.A0Q = true;
            PowerManager.WakeLock wakeLock = r2.A0b;
            if (wakeLock == null || !wakeLock.isHeld()) {
                z2 = false;
            }
            r2.A0Z = z2;
            r2.A09();
        }
    }

    public void A04() {
        AnonymousClass2DT r1 = this.A00;
        if (r1 != null) {
            r1.A0F(false);
        }
    }

    public void A05() {
        AnonymousClass2DT r1 = this.A00;
        if (r1 != null) {
            r1.A0Q = false;
            if (r1.A0Z) {
                r1.A08();
            }
        }
    }

    public void A06() {
        AnonymousClass2DT r2 = this.A00;
        if (r2 != null) {
            r2.A0I(true, false);
        }
    }

    public synchronized void A07() {
        this.A01 = null;
    }

    public synchronized void A08(AnonymousClass2DT r2) {
        A09(r2, false);
    }

    public synchronized void A09(AnonymousClass2DT r2, boolean z2) {
        this.A03 = z2;
        this.A00 = r2;
        if (r2 != null && r2.A0u) {
            this.A01 = r2.A0O;
        }
    }

    public synchronized void A0A(boolean z2) {
        this.A03 = z2;
    }

    public boolean A0B() {
        AnonymousClass2DT r0 = this.A00;
        return r0 != null && r0.A0J();
    }

    public synchronized boolean A0C() {
        return this.A03;
    }

    public boolean A0D(C16740tZ r3) {
        AnonymousClass2DT r0 = this.A00;
        return r0 != null && r0.A0L(r3);
    }

    public void AS3(boolean z2) {
        if (!z2) {
            A04();
        }
    }
}
