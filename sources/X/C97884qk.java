package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.4qk  reason: invalid class name and case insensitive filesystem */
public final class C97884qk implements C53212fE {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ C612338c A01;

    public C97884qk(BasePendingResult basePendingResult, C612338c r2) {
        this.A01 = r2;
        this.A00 = basePendingResult;
    }

    public final void AOr(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
