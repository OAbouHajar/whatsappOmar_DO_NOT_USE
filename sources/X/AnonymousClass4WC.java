package X;

/* renamed from: X.4WC  reason: invalid class name */
public class AnonymousClass4WC {
    public int A00;
    public int A01 = -1;
    public final AnonymousClass28m A02;

    public AnonymousClass4WC(AnonymousClass28m r2) {
        this.A02 = r2;
        A00();
    }

    public final void A00() {
        while (true) {
            int i2 = this.A00;
            AnonymousClass28m r1 = this.A02;
            if (i2 < r1.length && r1.presenceArray[i2] < 0) {
                this.A00 = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A02.length);
    }

    public final void remove() {
        if (this.A01 != -1) {
            AnonymousClass28m r1 = this.A02;
            r1.A02();
            r1.A05(this.A01);
            this.A01 = -1;
            return;
        }
        throw AnonymousClass000.A0V("Call next() before removing element from the iterator.");
    }
}
