package X;

import com.obwhatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vT  reason: invalid class name and case insensitive filesystem */
public class C100334vT implements C449926n {
    public final /* synthetic */ ComplianceInfoViewModel A00;
    public final /* synthetic */ String A01;

    public C100334vT(ComplianceInfoViewModel complianceInfoViewModel, String str) {
        this.A00 = complianceInfoViewModel;
        this.A01 = str;
    }

    public void ARA(String str, int i2) {
        AnonymousClass027 r1;
        int i3;
        boolean equals = this.A01.equals(str);
        ComplianceInfoViewModel complianceInfoViewModel = this.A00;
        if (equals) {
            complianceInfoViewModel.A04.A0M.remove(this);
            r1 = complianceInfoViewModel.A01;
            i3 = 3;
        } else {
            r1 = complianceInfoViewModel.A01;
            i3 = 2;
        }
        C13680ns.A1O(r1, i3);
    }

    public void ARB(AnonymousClass26S r5, String str) {
        AnonymousClass027 r1;
        int i2;
        C93584jR r12;
        String str2 = this.A01;
        if (str2.equals(str)) {
            ComplianceInfoViewModel complianceInfoViewModel = this.A00;
            complianceInfoViewModel.A04.A0M.remove(this);
            C35701mM A05 = complianceInfoViewModel.A02.A05((UserJid) null, str2);
            if (!(A05 == null || (r12 = A05.A09) == null)) {
                complianceInfoViewModel.A00.A0B(r12);
                r1 = complianceInfoViewModel.A01;
                i2 = 1;
                C13680ns.A1O(r1, i2);
            }
        }
        r1 = this.A00.A01;
        i2 = 2;
        C13680ns.A1O(r1, i2);
    }
}
