package X;

import android.graphics.Bitmap;

/* renamed from: X.3TV  reason: invalid class name */
public class AnonymousClass3TV extends AnonymousClass4SM {
    public final C82074Bc A00;
    public final AnonymousClass5UM A01;

    public AnonymousClass3TV(C82074Bc r1, AnonymousClass5UM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public C09110ev A01(Bitmap.Config config, int i2, int i3) {
        int i4 = i2 * i3;
        AnonymousClass5UM r3 = this.A01;
        Bitmap bitmap = (Bitmap) r3.get(C89624cY.A00(config) * i4);
        AnonymousClass0T3.A00(AnonymousClass3K3.A1P(bitmap.getAllocationByteCount(), i4 * C89624cY.A00(config)));
        bitmap.reconfigure(i2, i3, config);
        return new C09110ev(this.A00.A00, (C12880l7) r3, (Object) bitmap);
    }
}
