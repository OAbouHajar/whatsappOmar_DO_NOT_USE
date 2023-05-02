package X;

import com.obwhatsapp.community.CommunityAdminDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Dp  reason: invalid class name and case insensitive filesystem */
public class C82644Dp {
    public final /* synthetic */ C86224Rt A00;

    public C82644Dp(C86224Rt r1) {
        this.A00 = r1;
    }

    public static void A00(CommunityAdminDialogFragment communityAdminDialogFragment) {
        C82644Dp r0 = communityAdminDialogFragment.A01;
        int i2 = communityAdminDialogFragment.A00;
        UserJid userJid = communityAdminDialogFragment.A02;
        C86224Rt r1 = r0.A00;
        if (!r1.A02.A0I(userJid)) {
            return;
        }
        if (i2 == 3) {
            r1.A04.A00();
        } else if (i2 == 4) {
            r1.A04.A01();
        }
    }
}
