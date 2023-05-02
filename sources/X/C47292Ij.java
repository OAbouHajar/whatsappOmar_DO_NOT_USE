package X;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.2Ij  reason: invalid class name and case insensitive filesystem */
public class C47292Ij implements C38331qc {
    public final AnonymousClass1XS A00 = new AnonymousClass1XS();
    public final AnonymousClass1XS A01 = new AnonymousClass1XS();
    public final AnonymousClass1XS A02 = new AnonymousClass1XS();
    public final Executor A03;

    public C47292Ij(Executor executor) {
        this.A03 = executor;
    }

    public void AQ1(long j2) {
        this.A00.A04(Long.valueOf(j2));
    }

    public void AQ3(boolean z2) {
        this.A01.A04(Boolean.valueOf(z2));
    }

    public void AQ4(C31701et r3, C30761cu r4) {
        this.A02.A04(Pair.create(r3, r4));
    }
}
