package X;

import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.R;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3hd  reason: invalid class name and case insensitive filesystem */
public class C70733hd extends C93824jp {
    public final /* synthetic */ ViewProfilePhoto A00;

    public C70733hd(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    public void onTransitionEnd(Transition transition) {
        super.onTransitionEnd(transition);
        ViewProfilePhoto viewProfilePhoto = this.A00;
        View findViewById = viewProfilePhoto.findViewById(R.id.picture);
        View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(4);
        Window window = viewProfilePhoto.getWindow();
    }
}
