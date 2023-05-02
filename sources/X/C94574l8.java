package X;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.4l8  reason: invalid class name and case insensitive filesystem */
public class C94574l8 implements Animation.AnimationListener {
    public final int A00;
    public final /* synthetic */ PhoneContactsSelector A01;

    public C94574l8(PhoneContactsSelector phoneContactsSelector, int i2) {
        this.A01 = phoneContactsSelector;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animation animation) {
        PhoneContactsSelector phoneContactsSelector = this.A01;
        phoneContactsSelector.A05.clearAnimation();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) phoneContactsSelector.A05.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, this.A00, layoutParams.rightMargin, layoutParams.bottomMargin);
        phoneContactsSelector.A05.setLayoutParams(layoutParams);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
