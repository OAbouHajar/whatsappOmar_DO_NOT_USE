package X;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.3ul  reason: invalid class name and case insensitive filesystem */
public class C76833ul extends C38301qZ {
    public final C30741cs A00;
    public final AnonymousClass1XK A01;
    public final File A02;
    public final String A03;

    public C76833ul(C15900s5 r10, C17130ua r11, C14730pf r12, C14710pd r13, C20330zs r14, C30741cs r15, AnonymousClass1XK r16, C19040xf r17, File file, String str) {
        super(r10, r11, r12, r13, r14, r17, (Executor) null);
        this.A03 = str;
        this.A02 = file;
        this.A01 = r16;
        this.A00 = r15;
    }

    public C30761cu A00(C31701et r2) {
        return new C30761cu();
    }

    public /* bridge */ /* synthetic */ Object A02() {
        C38151qK r4 = new C38151qK(this.A03, "application/octet-stream");
        File file = this.A02;
        return new C88214a8(this.A00, this.A01, r4, file);
    }
}
