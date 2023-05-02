package X;

import java.io.IOException;

/* renamed from: X.59V  reason: invalid class name */
public class AnonymousClass59V implements AnonymousClass5VL {
    public AnonymousClass4WD A00;

    public AnonymousClass59V(AnonymousClass4WD r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        return new C107575Is(this.A00.A01());
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(e2.getMessage(), e2);
        }
    }
}
