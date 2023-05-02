package X;

import android.content.res.Configuration;

/* renamed from: X.2Sx  reason: invalid class name and case insensitive filesystem */
public class C49392Sx extends C003401n {
    public int A00;
    public final AnonymousClass027 A01 = new AnonymousClass027();

    public void A05(Configuration configuration) {
        int i2;
        int i3 = C004301w.A00;
        if ((i3 != 3 && i3 != -1) || this.A00 == (i2 = configuration.uiMode & 48)) {
            this.A01.A0B(0);
        } else if (i2 == 16 || i2 == 32) {
            this.A01.A0B(1);
        }
    }
}
