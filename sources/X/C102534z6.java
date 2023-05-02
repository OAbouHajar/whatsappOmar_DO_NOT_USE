package X;

import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4z6  reason: invalid class name and case insensitive filesystem */
public class C102534z6 implements C109335Rq {
    public final /* synthetic */ AcceptInviteLinkActivity A00;

    public C102534z6(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = acceptInviteLinkActivity;
    }

    public void AVJ(C15830rv r2, String str, int i2, long j2) {
        Log.w(C13680ns.A0c(i2, "acceptlink/failed-to-get-group-photo/"));
    }

    public void AVK(AnonymousClass277 r6, long j2) {
        byte[] bArr = r6.A00;
        if (bArr != null) {
            AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
            acceptInviteLinkActivity.A05.A0K(new RunnableRunnableShape2S0200000_I0(bArr, 41, acceptInviteLinkActivity));
        }
    }
}
