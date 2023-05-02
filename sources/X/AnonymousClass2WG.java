package X;

import android.content.SharedPreferences;
import com.facebook.redex.IDxUCallbackShape360S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.avatar.home.AvatarHomeActivity;
import com.obwhatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.2WG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2WG implements AnonymousClass2Sv {
    public final /* synthetic */ AvatarHomeActivity A00;

    public /* synthetic */ AnonymousClass2WG(AvatarHomeActivity avatarHomeActivity) {
        this.A00 = avatarHomeActivity;
    }

    public final void AOW() {
        AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) this.A00.A0L.getValue();
        Log.i("onConfirmDeleteAvatarClicked");
        avatarHomeViewModel.A00.A0B(new AnonymousClass2WP(AnonymousClass2WT.A00, true, false, false));
        avatarHomeViewModel.A06.A02(25);
        C27121Qn r4 = avatarHomeViewModel.A04;
        IDxUCallbackShape360S0100000_2_I0 iDxUCallbackShape360S0100000_2_I0 = new IDxUCallbackShape360S0100000_2_I0(avatarHomeViewModel, 0);
        ((SharedPreferences) ((C212013e) r4.A03.get()).A01.getValue()).edit().putBoolean("pref_avatar_user_remote_deletion", true).apply();
        r4.A01.Aco(new RunnableRunnableShape9S0200000_I0_7(r4, 33, iDxUCallbackShape360S0100000_2_I0));
    }
}
