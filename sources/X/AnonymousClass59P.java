package X;

import java.io.IOException;

/* renamed from: X.59P  reason: invalid class name */
public class AnonymousClass59P implements C32071fb, AnonymousClass5R2 {
    public final int A00;
    public final AnonymousClass4WD A01;

    public AnonymousClass59P(AnonymousClass4WD r1, int i2) {
        this.A00 = i2;
        this.A01 = r1;
    }

    public C32051fZ ADB() {
        return new AnonymousClass5HV(this.A01.A01(), this.A00);
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(e2.getMessage(), e2);
        }
    }
}
