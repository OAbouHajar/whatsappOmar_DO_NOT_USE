package X;

import android.content.res.Resources;
import android.view.animation.Animation;
import com.obwhatsapp.R;

/* renamed from: X.2iX  reason: invalid class name and case insensitive filesystem */
public class C54952iX extends C30551cZ {
    public final /* synthetic */ AnonymousClass2V5 A00;
    public final /* synthetic */ boolean A01;

    public C54952iX(AnonymousClass2V5 r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass2V5 r3 = this.A00;
        boolean z2 = this.A01;
        Resources resources = r3.A0A.getContext().getResources();
        int i2 = R.string.str1730;
        if (z2) {
            i2 = R.string.str172f;
        }
        r3.A0J.setContentDescription(resources.getString(i2));
    }
}
