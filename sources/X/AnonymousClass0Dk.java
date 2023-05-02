package X;

import java.util.ArrayList;

/* renamed from: X.0Dk  reason: invalid class name */
public abstract class AnonymousClass0Dk extends AnonymousClass0SN {
    public ArrayList A00 = AnonymousClass000.A0u();

    public void A08() {
        this.A00.clear();
        super.A08();
    }

    public void A0B(AnonymousClass0OZ r4) {
        super.A0B(r4);
        int size = this.A00.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AnonymousClass0SN) this.A00.get(i2)).A0B(r4);
        }
    }

    public abstract void A0L();
}
