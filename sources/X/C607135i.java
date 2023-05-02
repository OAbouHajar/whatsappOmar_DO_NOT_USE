package X;

import android.view.View;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.List;

/* renamed from: X.35i  reason: invalid class name and case insensitive filesystem */
public class C607135i extends C34331k5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ C31241dn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C607135i(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C31241dn r2, String str, List list, int i2) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A02 = r2;
        this.A04 = list;
        this.A00 = i2;
        this.A03 = str;
    }

    public void A06(View view) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        C31241dn r6 = this.A02;
        businessDirectoryContextualSearchViewModel.A05 = r6;
        businessDirectoryContextualSearchViewModel.A00 = 1;
        businessDirectoryContextualSearchViewModel.A0U.A01(new AnonymousClass2RC(r6.A01, r6.A00, System.currentTimeMillis()));
        C13680ns.A1P(businessDirectoryContextualSearchViewModel.A0d, 0);
        C17210ui r7 = businessDirectoryContextualSearchViewModel.A0N;
        Long A0W = C13690nt.A0W(businessDirectoryContextualSearchViewModel.A02);
        Long A0W2 = C13690nt.A0W(businessDirectoryContextualSearchViewModel.A01);
        List list = this.A04;
        r7.A0C((Integer) null, (Integer) null, businessDirectoryContextualSearchViewModel.A0P.A02(), A0W, A0W2, C13690nt.A0W(list.size()), Long.valueOf(((long) list.indexOf(r6)) + 1), C13690nt.A0W(this.A00), (Long) null, C13690nt.A0W(businessDirectoryContextualSearchViewModel.A03), this.A03, 45);
        businessDirectoryContextualSearchViewModel.A0E();
    }
}
