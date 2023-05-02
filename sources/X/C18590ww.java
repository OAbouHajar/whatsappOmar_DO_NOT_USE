package X;

import java.io.File;

/* renamed from: X.0ww  reason: invalid class name and case insensitive filesystem */
public class C18590ww {
    public C16900tq A00;

    public C18590ww(C16900tq r1) {
        this.A00 = r1;
    }

    public Long A00() {
        C16900tq r2 = this.A00;
        r2.A04();
        File file = r2.A06;
        if (!file.exists()) {
            return null;
        }
        r2.A04();
        return Long.valueOf(file.length());
    }
}
