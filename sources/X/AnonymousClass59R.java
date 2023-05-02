package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.59R  reason: invalid class name */
public class AnonymousClass59R implements AnonymousClass5VN {
    public AnonymousClass5J4 A00;

    public AnonymousClass59R(AnonymousClass5J4 r1) {
        this.A00 = r1;
    }

    public C32051fZ ADB() {
        return new AnonymousClass5IT(this.A00.A01());
    }

    public InputStream AE1() {
        return this.A00;
    }

    public C32051fZ Agm() {
        try {
            return ADB();
        } catch (IOException e2) {
            throw new AnonymousClass44B(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("IOException converting stream to byte array: ")), e2);
        }
    }
}
