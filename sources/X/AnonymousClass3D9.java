package X;

import android.animation.ObjectAnimator;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape1S0200000_2_I1;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.3D9  reason: invalid class name */
public class AnonymousClass3D9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ AnonymousClass29A A05;
    public final /* synthetic */ AnonymousClass33A A06;

    public AnonymousClass3D9(View view, AnonymousClass29A r2, AnonymousClass33A r3, int i2, int i3, int i4, int i5) {
        this.A06 = r3;
        this.A04 = view;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A05 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        AnonymousClass33A r3 = this.A06;
        r3.A02 = this.A01 - iArr[0];
        r3.A04 = this.A02 - iArr[1];
        float f2 = (float) this.A03;
        r3.A01 = f2 / ((float) view.getWidth());
        float f3 = (float) this.A00;
        float height = f3 / ((float) view.getHeight());
        r3.A00 = height;
        float f4 = r3.A01;
        if (f4 < height) {
            r3.A01 = height;
            r3.A02 = (int) (((float) r3.A02) - (((((float) view.getWidth()) * r3.A01) - f2) / 2.0f));
        } else {
            r3.A00 = f4;
            r3.A04 = (int) (((float) r3.A04) - (((((float) view.getHeight()) * r3.A00) - f3) / 2.0f));
        }
        AnonymousClass29A r7 = this.A05;
        MediaViewBaseFragment mediaViewBaseFragment = r3.A06;
        r3.A03 = mediaViewBaseFragment.A03().getConfiguration().orientation;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(r3.A05, "alpha", new int[]{0, MotionEventCompat.ACTION_MASK});
        ofInt.setDuration(220);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
        C54662hw r9 = mediaViewBaseFragment.A09;
        r9.setPivotX(0.0f);
        r9.setPivotY(0.0f);
        r9.setScaleX(r3.A01);
        r9.setScaleY(r3.A00);
        r9.setTranslationX((float) r3.A02);
        r9.setTranslationY((float) r3.A04);
        View findViewWithTag = mediaViewBaseFragment.A09.findViewWithTag(mediaViewBaseFragment.A1B());
        if (findViewWithTag != null) {
            findViewWithTag.setAlpha(0.0f);
            findViewWithTag.animate().setDuration(110).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
        }
        C13690nt.A0L(r9.animate().setDuration(220)).setListener(new IDxLAdapterShape1S0200000_2_I1(r3, 4, r7));
        return true;
    }
}
