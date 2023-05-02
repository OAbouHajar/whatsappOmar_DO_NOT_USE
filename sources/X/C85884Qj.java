package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.4Qj  reason: invalid class name and case insensitive filesystem */
public final class C85884Qj {
    public final /* synthetic */ C100744w8 A00;
    public final /* synthetic */ File A01;

    public C85884Qj(C100744w8 r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }

    public final void A00(C114795oc r6) {
        AnonymousClass4RW r2;
        File file;
        C798441n r0;
        int ordinal = r6.ordinal();
        C100744w8 r02 = this.A00;
        switch (ordinal) {
            case 0:
                AnonymousClass4RW r4 = r02.A02;
                String obj = Uri.fromFile(this.A01).toString();
                C18450wi.A0B(obj);
                C14930q1 r22 = r4.A03;
                if (r22 != null) {
                    Object[] A1Z = C13690nt.A1Z();
                    C13690nt.A1L(r4.A00, obj, A1Z);
                    C14980q6.A00(r4.A01, new C14950q3(AnonymousClass1JA.A0R(A1Z)), r22);
                    return;
                }
                return;
            case 1:
                r2 = r02.A02;
                file = this.A01;
                C18450wi.A0A(file);
                r0 = C798441n.USER_CANCELLED;
                break;
            default:
                r2 = r02.A02;
                file = this.A01;
                C18450wi.A0A(file);
                r0 = C798441n.INTERNAL_ERROR;
                break;
        }
        r2.A00(r0);
        file.delete();
    }
}
