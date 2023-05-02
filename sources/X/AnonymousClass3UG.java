package X;

/* renamed from: X.3UG  reason: invalid class name */
public final class AnonymousClass3UG extends C96244o1 {
    public long A00;
    public final AnonymousClass3UX A01 = new AnonymousClass3UX(1);
    public final C90504eH A02 = new C90504eH();

    public AnonymousClass3UG() {
        super(6);
    }

    public void A08() {
    }

    public void A09(long j2, boolean z2) {
        this.A00 = Long.MIN_VALUE;
    }

    public boolean AIm() {
        return AHf();
    }

    public boolean AJY() {
        return true;
    }

    public void Ac6(long j2, long j3) {
        while (!AHf() && this.A00 < 100000 + j2) {
            AnonymousClass3UX r2 = this.A01;
            r2.clear();
            AnonymousClass4G5 r1 = this.A0A;
            r1.A01 = null;
            r1.A00 = null;
            if (A00(r1, r2, false) == -4 && !AnonymousClass4XM.A00(r2)) {
                this.A00 = r2.A00;
            } else {
                return;
            }
        }
    }

    public int AgX(C32491gT r3) {
        return "application/x-camera-motion".equals(r3.A0T) ? 4 : 0;
    }

    public String getName() {
        return "CameraMotionRenderer";
    }
}
