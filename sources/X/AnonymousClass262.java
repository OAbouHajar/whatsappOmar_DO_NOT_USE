package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.262  reason: invalid class name */
public class AnonymousClass262 {
    public final /* synthetic */ AnonymousClass260 A00;
    public final /* synthetic */ C25611Kl A01;

    public AnonymousClass262(AnonymousClass260 r1, C25611Kl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass260 r3 = this.A00;
        List list = r3.A05;
        Log.e("DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance.");
        Collections.sort(list, new IDxComparatorShape19S0000000_2_I0(8));
        if (!r3.A00) {
            r3.A03.AVc();
        }
    }
}
