package X;

import android.view.animation.Animation;
import com.obwhatsapp.R;

/* renamed from: X.3gZ  reason: invalid class name and case insensitive filesystem */
public class C70383gZ extends C30551cZ {
    public final /* synthetic */ Animation A00;
    public final /* synthetic */ AnonymousClass1ZL A01;
    public final /* synthetic */ boolean A02;

    public C70383gZ(Animation animation, AnonymousClass1ZL r2, boolean z2) {
        this.A01 = r2;
        this.A02 = z2;
        this.A00 = animation;
    }

    public void onAnimationEnd(Animation animation) {
        boolean z2 = this.A02;
        AnonymousClass1ZL r1 = this.A01;
        int i2 = R.drawable.ic_pause_draft_preview;
        if (z2) {
            i2 = R.drawable.ic_resume_draft_preview;
        }
        r1.A01(i2);
        r1.A0D.startAnimation(this.A00);
    }

    public void onAnimationStart(Animation animation) {
        this.A01.A0D.setClickable(false);
    }
}
