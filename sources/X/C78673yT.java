package X;

import android.view.View;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;

/* renamed from: X.3yT  reason: invalid class name and case insensitive filesystem */
public class C78673yT extends C34331k5 {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C78673yT(AcceptInviteLinkActivity acceptInviteLinkActivity, String str, String str2) {
        this.A00 = acceptInviteLinkActivity;
        this.A02 = str;
        this.A01 = str2;
    }

    public void A06(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        acceptInviteLinkActivity.startActivity(C14750ph.A0V(acceptInviteLinkActivity, acceptInviteLinkActivity.A0I, this.A02, this.A01, (String) null));
        acceptInviteLinkActivity.overridePendingTransition(0, 0);
        acceptInviteLinkActivity.finish();
    }
}
