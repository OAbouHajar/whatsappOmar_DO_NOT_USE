package X;

import android.content.res.Resources;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4vd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100434vd implements C108515Oh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14550pN A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C100434vd(C14550pN r1, List list, int i2) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i2;
    }

    public final void AMe(C62723Er r9) {
        C14550pN r7 = this.A01;
        List list = this.A02;
        int i2 = this.A00;
        Resources resources = r7.getResources();
        int size = list.size();
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, i2 + 1);
        AnonymousClass000.A1M(A1Z, list.size(), 1);
        String quantityString = resources.getQuantityString(R.plurals.plurals0015, size, A1Z);
        if (C33871jK.A02) {
            r7.AhY(quantityString);
        } else {
            r7.A2h(quantityString);
        }
        Log.i("product-details/send-product/async load begin");
    }
}
