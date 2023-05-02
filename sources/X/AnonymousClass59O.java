package X;

import java.io.IOException;

/* renamed from: X.59O  reason: invalid class name */
public class AnonymousClass59O implements C32071fb, AnonymousClass5R2 {
    public AnonymousClass4WD A00;

    public AnonymousClass59O(AnonymousClass4WD r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        try {
            return new AnonymousClass5HZ(this.A00.A01());
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass40L(e2.getMessage(), e2);
        }
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B("unable to get DER object", e2);
        } catch (IllegalArgumentException e3) {
            throw new AnonymousClass44B("unable to get DER object", e3);
        }
    }
}
