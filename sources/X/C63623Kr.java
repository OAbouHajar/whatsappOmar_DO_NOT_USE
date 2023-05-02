package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.3Kr  reason: invalid class name and case insensitive filesystem */
public class C63623Kr extends ContentObserver {
    public final /* synthetic */ C16040sK A00;
    public final /* synthetic */ AnonymousClass1GW A01;
    public final /* synthetic */ C19230xz A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63623Kr(C16040sK r2, AnonymousClass1GW r3, C19230xz r4) {
        super((Handler) null);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void onChange(boolean z2) {
        C16040sK r1 = this.A00;
        r1.A0B();
        if (r1.A00 != null && !r1.A0G()) {
            this.A02.A06();
        }
    }
}
