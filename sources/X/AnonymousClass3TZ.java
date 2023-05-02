package X;

/* renamed from: X.3TZ  reason: invalid class name */
public class AnonymousClass3TZ extends C09080es {
    public C85654Pj A00;

    public AnonymousClass3TZ(C85654Pj r1) {
        this.A00 = r1;
    }

    public synchronized int A00() {
        return A01() ? 0 : this.A00.A00.getSizeInBytes();
    }

    public synchronized boolean A01() {
        return AnonymousClass000.A1W(this.A00);
    }

    public synchronized C85654Pj A02() {
        return this.A00;
    }

    public void close() {
        synchronized (this) {
            C85654Pj r1 = this.A00;
            if (r1 != null) {
                this.A00 = null;
                synchronized (r1) {
                }
            }
        }
    }
}
