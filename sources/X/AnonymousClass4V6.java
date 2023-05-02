package X;

import java.util.Map;

/* renamed from: X.4V6  reason: invalid class name */
public class AnonymousClass4V6 {
    public C86844Uj A00;
    public C79113zD A01;
    public Map A02;
    public final int A03;
    public final C88514ad A04 = new C88514ad();
    public final AnonymousClass5PB A05;
    public final AnonymousClass5PC A06;
    public volatile boolean A07 = false;

    public AnonymousClass4V6(AnonymousClass5PB r2, AnonymousClass5PC r3, int i2) {
        this.A03 = i2;
        this.A06 = r3;
        this.A05 = r2;
    }

    public synchronized void A00() {
        if (this.A07) {
            this.A07 = false;
            C79113zD r0 = this.A01;
            AnonymousClass00B.A06(r0);
            r0.interrupt();
            this.A01 = null;
        }
    }

    public synchronized void A01() {
        if (!this.A07) {
            this.A07 = true;
            C79113zD r0 = new C79113zD(this);
            this.A01 = r0;
            r0.start();
        }
    }
}
