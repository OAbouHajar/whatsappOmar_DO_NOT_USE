package X;

import android.graphics.Bitmap;
import java.io.File;
import java.lang.ref.Reference;

/* renamed from: X.5wS  reason: invalid class name */
public class AnonymousClass5wS {
    public static final String A03;
    public final AnonymousClass03L A00 = new AnonymousClass03L(50);
    public final C16980tz A01;
    public final C16320sq A02;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("downloadable");
        String str = File.separator;
        A0r.append(str);
        A0r.append("bloks_pay");
        A0r.append(str);
        A03 = AnonymousClass000.A0h("image", A0r);
    }

    public AnonymousClass5wS(C16980tz r3, C16320sq r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public void A00(C1221868p r5, String str) {
        Bitmap bitmap;
        AnonymousClass03L r3 = this.A00;
        Reference reference = (Reference) r3.A02(str);
        if (reference == null || (bitmap = (Bitmap) reference.get()) == null) {
            C13680ns.A1U(new C114465no(r3, r5, this.A01, str), this.A02);
            return;
        }
        r5.AY2(bitmap);
    }
}
