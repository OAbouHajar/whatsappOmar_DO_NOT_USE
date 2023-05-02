package X;

import java.util.ArrayList;

/* renamed from: X.0Is  reason: invalid class name and case insensitive filesystem */
public final class C03490Is extends AnonymousClass0QT {
    public final ArrayList A00 = new ArrayList(16);

    public void A02(AnonymousClass0QT r2) {
        if (this.A03) {
            r2.A00();
            A03(r2);
            r2.A00();
            r2.A00 = this;
            return;
        }
        throw AnonymousClass000.A0V("Expected object to be mutable");
    }

    public final void A03(Object obj) {
        if (this.A03) {
            this.A00.add(obj);
            return;
        }
        throw AnonymousClass000.A0V("Expected object to be mutable");
    }
}
