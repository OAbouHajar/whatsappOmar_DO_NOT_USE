package X;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.5hk  reason: invalid class name and case insensitive filesystem */
public class C111985hk extends C38301qZ {
    public final C116025qh A00;
    public final File A01;

    public C111985hk(C15900s5 r10, C17130ua r11, C14730pf r12, C14710pd r13, C20330zs r14, C116025qh r15, C19040xf r16, File file) {
        super(r10, r11, r12, r13, r14, r16, (Executor) null);
        this.A00 = r15;
        this.A01 = file;
    }

    public C30761cu A00(C31701et r2) {
        return new C30761cu();
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return new C88214a8(AnonymousClass1XK.A08, new C38151qK(this.A00.A00, "application/zip"), this.A01);
    }
}
