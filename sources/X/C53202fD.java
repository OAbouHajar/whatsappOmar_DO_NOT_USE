package X;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2fD  reason: invalid class name and case insensitive filesystem */
public final class C53202fD implements C53212fE {
    public final /* synthetic */ C438221r A00;
    public final /* synthetic */ C53172fA A01;
    public final /* synthetic */ C53192fC A02;
    public final /* synthetic */ C14370p3 A03;

    public C53202fD(C438221r r1, C53172fA r2, C53192fC r3, C14370p3 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void AOr(Status status) {
        if (status.A01 <= 0) {
            this.A03.A01(this.A01.A6i(this.A00.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.A03.A00.A07(status.A02 != null ? new AnonymousClass3WR(status) : new AnonymousClass43Z(status));
    }
}
