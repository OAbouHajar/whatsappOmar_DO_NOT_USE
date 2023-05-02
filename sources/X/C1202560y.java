package X;

import com.facebook.redex.IDxSListenerShape50S0200000_3_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.60y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1202560y implements AnonymousClass68M {
    public final /* synthetic */ C35391lr A00;
    public final /* synthetic */ C1222468v A01;
    public final /* synthetic */ C118565ut A02;

    public /* synthetic */ C1202560y(C35391lr r1, C1222468v r2, C118565ut r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void APf(C35391lr r6, AnonymousClass2HJ r7, ArrayList arrayList, boolean z2) {
        C118565ut r0 = this.A02;
        C1222468v r4 = this.A01;
        C35391lr r3 = this.A00;
        if (r7 == null) {
            r0.A0A.A01().A02(z2 ? new IDxSListenerShape50S0200000_3_I1(r3, 4, r4) : new IDxSListenerShape50S0200000_3_I1(arrayList, 5, r4), r6);
        } else {
            r4.AWW(r7, (List) null);
        }
    }
}
