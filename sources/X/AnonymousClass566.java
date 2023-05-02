package X;

import com.facebook.redex.RunnableRunnableShape1S0210000_I1;
import com.obwhatsapp.community.CommunitySpamReportDialogFragment;
import java.util.List;

/* renamed from: X.566  reason: invalid class name */
public final /* synthetic */ class AnonymousClass566 implements Runnable {
    public final /* synthetic */ CommunitySpamReportDialogFragment A00;
    public final /* synthetic */ AnonymousClass2AS A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass566(CommunitySpamReportDialogFragment communitySpamReportDialogFragment, AnonymousClass2AS r2, C16010sH r3, String str, boolean z2) {
        this.A00 = communitySpamReportDialogFragment;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = z2;
        this.A01 = r2;
    }

    public final void run() {
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = this.A00;
        C16010sH r5 = this.A02;
        String str = this.A03;
        boolean z2 = this.A04;
        AnonymousClass2AS r3 = this.A01;
        communitySpamReportDialogFragment.A02.A01(r5, str, (List) null);
        communitySpamReportDialogFragment.A00.A05();
        communitySpamReportDialogFragment.A00.A0K(new RunnableRunnableShape1S0210000_I1(communitySpamReportDialogFragment, r3, 1, z2));
    }
}
