package X;

import android.content.Intent;
import com.facebook.redex.IDxUnblockerShape10S0400000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2BX  reason: invalid class name */
public class AnonymousClass2BX {
    public static void A00(C14550pN r1, AnonymousClass01Y r2, C17030uP r3, AnonymousClass2a9 r4, C20260zl r5, UserJid userJid, int i2, int i3) {
        if (A02(r3, r4, r5, userJid)) {
            C14550pN r32 = r1;
            Intent A0J = C14750ph.A0J(r1, userJid, i2, i3);
            AnonymousClass01Y r52 = r2;
            if (r2.A0V(userJid)) {
                int i4 = R.string.str0831;
                if (i2 > 0) {
                    i4 = R.string.str0830;
                }
                r32.Afc(UnblockDialogFragment.A01(new IDxUnblockerShape10S0400000_2_I0(r32, A0J, r52, userJid, 0), r1.getString(i4), R.string.str0242, false));
                return;
            }
            r1.startActivity(A0J);
        }
    }

    public static boolean A01(C16040sK r1, AnonymousClass11R r2) {
        return !r1.A0G() || r2.A00().getBoolean("ddm_settings_feature_flag", false);
    }

    public static boolean A02(C17030uP r0, AnonymousClass2a9 r1, C20260zl r2, UserJid userJid) {
        return !r0.A02(userJid) && !C40561uK.A01(r2, userJid) && r1.A00(userJid) == null;
    }

    public static boolean A03(C15810rt r2, C16070sO r3, C16010sH r4, C217915l r5, C16050sL r6) {
        return r3.A09(r6) && (r3.A0A(r6) || !r4.A0l) && r2.A02(r6) != 3 && !r5.A00(r4);
    }
}
