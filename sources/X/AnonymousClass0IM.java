package X;

import android.graphics.Path;

/* renamed from: X.0IM  reason: invalid class name */
public class AnonymousClass0IM extends AnonymousClass0IO {
    public Path A00;
    public final /* synthetic */ AnonymousClass0XJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0IM(Path path, AnonymousClass0XJ r3, float f2) {
        super(r3, f2, 0.0f);
        this.A01 = r3;
        this.A00 = path;
    }

    public void A00(String str) {
        AnonymousClass0XJ r2 = this.A01;
        String str2 = str;
        if (r2.A0w()) {
            AnonymousClass0UF r1 = r2.A02;
            if (r1.A05) {
                r2.A00.drawTextOnPath(str2, this.A00, this.A00, this.A01, r1.A00);
            }
            AnonymousClass0UF r12 = r2.A02;
            if (r12.A06) {
                r2.A00.drawTextOnPath(str2, this.A00, this.A00, this.A01, r12.A01);
            }
        }
        this.A00 += r2.A02.A00.measureText(str);
    }
}
