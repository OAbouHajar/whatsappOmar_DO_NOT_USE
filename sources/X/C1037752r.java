package X;

import com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel;
import java.util.List;

/* renamed from: X.52r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037752r implements AnonymousClass1WE {
    public final /* synthetic */ InAppBugReportingViewModel A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C1037752r(InAppBugReportingViewModel inAppBugReportingViewModel, String str) {
        this.A00 = inAppBugReportingViewModel;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        InAppBugReportingViewModel inAppBugReportingViewModel = this.A00;
        String str = this.A01;
        Iterable<C810946u> iterable = (Iterable) obj;
        C18450wi.A0H(iterable, 2);
        for (C810946u r1 : iterable) {
            if (r1 instanceof C76593uJ) {
                inAppBugReportingViewModel.A00 = ((C76593uJ) r1).A00;
            } else if (r1 instanceof C76613uL) {
                inAppBugReportingViewModel.A02 = ((C76613uL) r1).A00;
            } else if (r1 instanceof C76603uK) {
                inAppBugReportingViewModel.A01 = ((C76603uK) r1).A00;
            }
        }
        C84404Kk r4 = inAppBugReportingViewModel.A05;
        String str2 = inAppBugReportingViewModel.A00;
        String str3 = inAppBugReportingViewModel.A01;
        List list = inAppBugReportingViewModel.A02;
        AnonymousClass2Rv r3 = new AnonymousClass2Rv(inAppBugReportingViewModel);
        C18450wi.A0H(str2, 1);
        r4.A02.Acl(new AnonymousClass56G(r3, r4, str, str2, str3, list));
    }
}
