package X;

import java.io.File;

/* renamed from: X.14U  reason: invalid class name */
public final class AnonymousClass14U {
    public final C27001Qb A00;

    public AnonymousClass14U(C27001Qb r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final File A00(C34151jm r24, File file) {
        C38341qd r9;
        C27001Qb r1 = this.A00;
        C34151jm r3 = r24;
        File file2 = file;
        if (r3.A0H) {
            C16150sX r6 = r1.A01.A00.A01;
            C15900s5 r14 = (C15900s5) r6.ALm.get();
            C20330zs A1I = r6.A1I();
            C14870pt r12 = (C14870pt) r6.AB3.get();
            r9 = new C38291qY((C16300so) r6.A5p.get(), (C16180sb) r6.A8b.get(), r12, (AnonymousClass01Z) r6.AKu.get(), r14, (C17130ua) r6.AN9.get(), (C14730pf) r6.ANy.get(), (C14710pd) r6.A05.get(), A1I, (C209212c) r6.AE1.get(), (C19040xf) r6.ALG.get(), r3, file2);
        } else {
            C16150sX r92 = r1.A00.A00.A01;
            r9 = new C38351qe((C14870pt) r92.AB3.get(), (AnonymousClass01Z) r92.AKu.get(), (C15900s5) r92.ALm.get(), (C17130ua) r92.AN9.get(), (C14730pf) r92.ANy.get(), (C14710pd) r92.A05.get(), r92.A1I(), (C209212c) r92.AE1.get(), (C19040xf) r92.ALG.get(), r3, file2);
        }
        if (r9.A8E().A01 == 0) {
            return r9.ABl();
        }
        return null;
    }
}
