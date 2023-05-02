package X;

import android.app.Activity;
import android.view.View;
import com.facebook.redex.IDxUnblockerShape35S0300000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.3Cl  reason: invalid class name and case insensitive filesystem */
public class C62223Cl implements View.OnClickListener {
    public final Activity A00;
    public final AnonymousClass02C A01;
    public final AnonymousClass01Y A02;
    public final C16080sP A03;
    public final C16010sH A04;
    public final C50272Yr A05;

    public C62223Cl(Activity activity, AnonymousClass02C r2, AnonymousClass01Y r3, C16080sP r4, C16010sH r5, C50272Yr r6) {
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void onClick(View view) {
        this.A05.A00(7);
        AnonymousClass01Y r8 = this.A02;
        C16010sH r7 = this.A04;
        Class<UserJid> cls = UserJid.class;
        if (r8.A0V((UserJid) r7.A08(cls))) {
            Activity activity = this.A00;
            String A0d = C13680ns.A0d(activity.getApplicationContext(), this.A03.A08(r7), C13680ns.A1b(), 0, R.string.str1880);
            Jid A08 = r7.A08(cls);
            AnonymousClass00B.A06(A08);
            UnblockDialogFragment.A01(new IDxUnblockerShape35S0300000_2_I1(activity, A08, r8, 0), A0d, 0, false).A1G(this.A01, (String) null);
            return;
        }
        Activity activity2 = this.A00;
        activity2.startActivity(C14750ph.A0m(activity2.getApplicationContext(), Collections.singletonList(r7.A08(cls).getRawString()), 7));
    }
}
