package X;

import java.io.File;

/* renamed from: X.5EZ  reason: invalid class name */
public final class AnonymousClass5EZ extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass1PF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EZ(AnonymousClass1PF r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        AnonymousClass1PF r0 = this.this$0;
        C38461qp r2 = new C38461qp(r0.A00, r0.A01, r0.A03, new File(r0.A02.A00.getCacheDir(), "privacy_disclosure_image_cache"), "privacy_disclosure_loader");
        r2.A01 = 8388608;
        r2.A05 = true;
        return r2.A00();
    }
}
