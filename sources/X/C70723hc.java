package X;

import android.transition.Transition;
import com.obwhatsapp.profile.ProfileInfoActivity;

/* renamed from: X.3hc  reason: invalid class name and case insensitive filesystem */
public class C70723hc extends C93824jp {
    public final /* synthetic */ ProfileInfoActivity A00;

    public C70723hc(ProfileInfoActivity profileInfoActivity) {
        this.A00 = profileInfoActivity;
    }

    public void onTransitionStart(Transition transition) {
        ProfileInfoActivity profileInfoActivity = this.A00;
        profileInfoActivity.A01.setScaleX(0.0f);
        profileInfoActivity.A01.setScaleY(0.0f);
        profileInfoActivity.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
    }
}
