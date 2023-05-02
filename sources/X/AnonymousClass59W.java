package X;

import java.io.IOException;

/* renamed from: X.59W  reason: invalid class name */
public class AnonymousClass59W implements AnonymousClass5VM {
    public int A00;
    public AnonymousClass4WD A01;
    public boolean A02;

    public AnonymousClass59W(AnonymousClass4WD r1, int i2, boolean z2) {
        this.A02 = z2;
        this.A00 = i2;
        this.A01 = r1;
    }

    public C32051fZ ADB() {
        return this.A01.A02(this.A00, this.A02);
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(e2.getMessage());
        }
    }
}
