package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.3F4  reason: invalid class name */
public final class AnonymousClass3F4 implements AnonymousClass5RY {
    public final /* synthetic */ BusinessProductListBaseFragment A00;

    public AnonymousClass3F4(BusinessProductListBaseFragment businessProductListBaseFragment) {
        this.A00 = businessProductListBaseFragment;
    }

    public void ASd(C35701mM r7, long j2) {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.A00;
        View A06 = businessProductListBaseFragment.A06();
        AnonymousClass013 r4 = businessProductListBaseFragment.A0D;
        if (r4 != null) {
            Object[] A1b = C13680ns.A1b();
            A1b[0] = Long.valueOf(j2);
            C32291fz.A01(A06, r4.A0J(A1b, R.plurals.plurals011c, j2), -1).A03();
            return;
        }
        throw C18450wi.A03("whatsAppLocale");
    }

    public void AVY(C35701mM r9, String str, String str2, String str3, int i2, long j2) {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.A00;
        ((C64433Po) businessProductListBaseFragment.A0J.getValue()).A03.A01(r9, businessProductListBaseFragment.A1D(), str, str2, str3, j2);
    }
}
