package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.59Q  reason: invalid class name */
public class AnonymousClass59Q implements AnonymousClass5VN {
    public AnonymousClass4WD A00;

    public AnonymousClass59Q(AnonymousClass4WD r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        return new AnonymousClass5IU(AnonymousClass48F.A00(new AnonymousClass40W(this.A00)));
    }

    public InputStream AE1() {
        return new AnonymousClass40W(this.A00);
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("IOException converting stream to byte array: ")), e2);
        }
    }
}
