package X;

import android.transition.Transition;
import com.obwhatsapp.profile.ProfileInfoActivity;

/* renamed from: X.3ha  reason: invalid class name and case insensitive filesystem */
public class C70703ha extends C93824jp {
    public final /* synthetic */ ProfileInfoActivity A00;

    public C70703ha(ProfileInfoActivity profileInfoActivity) {
        this.A00 = profileInfoActivity;
    }

    public void onTransitionEnd(Transition transition) {
        this.A00.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
    }
}
