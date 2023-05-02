package X;

import java.io.IOException;

/* renamed from: X.59S  reason: invalid class name */
public class AnonymousClass59S implements AnonymousClass5VK {
    public AnonymousClass4WD A00;

    public AnonymousClass59S(AnonymousClass4WD r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        return new C107545Ip(this.A00.A01());
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw AnonymousClass000.A0V(e2.getMessage());
        }
    }
}
