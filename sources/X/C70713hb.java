package X;

import android.transition.Transition;
import com.obwhatsapp.profile.ProfileInfoActivity;

/* renamed from: X.3hb  reason: invalid class name and case insensitive filesystem */
public class C70713hb extends C93824jp {
    public final /* synthetic */ ProfileInfoActivity A00;

    public C70713hb(ProfileInfoActivity profileInfoActivity) {
        this.A00 = profileInfoActivity;
    }

    public void onTransitionStart(Transition transition) {
        ProfileInfoActivity profileInfoActivity = this.A00;
        profileInfoActivity.A01.setScaleX(1.0f);
        profileInfoActivity.A01.setScaleY(1.0f);
        profileInfoActivity.A01.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125);
    }
}
