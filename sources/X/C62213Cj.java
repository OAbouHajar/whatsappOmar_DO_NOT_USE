package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Cj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62213Cj implements View.OnClickListener {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ C85534Ov A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C62213Cj(AcceptInviteLinkActivity acceptInviteLinkActivity, C85534Ov r2, String str, boolean z2) {
        this.A00 = acceptInviteLinkActivity;
        this.A03 = z2;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void onClick(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        boolean z2 = this.A03;
        C85534Ov r2 = this.A01;
        String str = this.A02;
        Log.i("acceptlink/confirmation/ok");
        if (z2) {
            Intent A0x = C14750ph.A0q().A0x(acceptInviteLinkActivity, r2.A05);
            AnonymousClass22U.A00(A0x, "AcceptInviteLinkActivity");
            acceptInviteLinkActivity.A2X(A0x, true);
            return;
        }
        C16050sL r3 = r2.A05;
        int i2 = r2.A02;
        StringBuilder A0r = AnonymousClass000.A0r("acceptlink/sendjoin/");
        C13700nu.A0a(A0r, str);
        A0r.append(r3);
        C13680ns.A1V(A0r);
        TextView A0N = C13680ns.A0N(acceptInviteLinkActivity, R.id.progress_text);
        boolean A0d = acceptInviteLinkActivity.A0F.A0d(i2);
        int i3 = R.string.str0be7;
        if (A0d) {
            i3 = R.string.str0be9;
        }
        A0N.setText(i3);
        acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(0);
        acceptInviteLinkActivity.findViewById(R.id.group_info).setVisibility(4);
        C13680ns.A1I(acceptInviteLinkActivity, R.id.error, 4);
        acceptInviteLinkActivity.A0I = r3;
        C13700nu.A0W(new AnonymousClass36S(acceptInviteLinkActivity, acceptInviteLinkActivity.A05, acceptInviteLinkActivity.A0G, str, i2), acceptInviteLinkActivity.A05);
        if (acceptInviteLinkActivity.getIntent().getBooleanExtra("is_invite_from_referrer", false)) {
            C74503qe r22 = new C74503qe();
            r22.A00 = Integer.valueOf(C40511uF.A03(acceptInviteLinkActivity.A0F, acceptInviteLinkActivity.A0I));
            acceptInviteLinkActivity.A0E.A06(r22);
        }
    }
}
