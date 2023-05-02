package X;

import java.io.IOException;

/* renamed from: X.59U  reason: invalid class name */
public class AnonymousClass59U implements AnonymousClass5VL {
    public AnonymousClass4WD A00;

    public AnonymousClass59U(AnonymousClass4WD r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        return new C107565Ir(this.A00.A01());
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(e2.getMessage(), e2);
        }
    }
}
