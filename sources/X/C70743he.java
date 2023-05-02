package X;

import android.transition.Transition;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3he  reason: invalid class name and case insensitive filesystem */
public class C70743he extends C93824jp {
    public final /* synthetic */ ViewProfilePhoto A00;

    public C70743he(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    public void onTransitionStart(Transition transition) {
        super.onTransitionStart(transition);
        ViewProfilePhoto viewProfilePhoto = this.A00;
        View findViewById = viewProfilePhoto.findViewById(R.id.picture);
        View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
        findViewById.setVisibility(4);
        findViewById2.setVisibility(0);
    }
}
