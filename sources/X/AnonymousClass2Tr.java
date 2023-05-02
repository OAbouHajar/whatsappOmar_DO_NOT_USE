package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.redex.IDxLAdapterShape0S0100001_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape44S0100000_1_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.2Tr  reason: invalid class name */
public class AnonymousClass2Tr {
    public float A00;
    public int A01;
    public int A02 = 0;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public C54882iQ A05 = new IDxSCallbackShape44S0100000_1_I0(this, 0);
    public boolean A06 = true;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final BottomSheetBehavior A0F;
    public final VoipCallControlBottomSheetV2 A0G;
    public final boolean A0H;

    public AnonymousClass2Tr(View view, View view2, C15860rz r5, C14710pd r6, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A0H = C30341cC.A0M(r5, r6);
        this.A0C = view;
        this.A0D = view2;
        this.A0F = BottomSheetBehavior.A00(view);
        this.A0G = voipCallControlBottomSheetV2;
        this.A0E = C004601z.A0E(view, R.id.bottom_sheet);
        this.A0F.A0E = this.A05;
    }

    public void A00() {
        if (this.A08) {
            Activity A002 = C19980zJ.A00(this.A0C.getContext());
            if (Build.VERSION.SDK_INT <= 24 || !A002.isInPictureInPictureMode()) {
                Point point = new Point();
                Rect rect = new Rect();
                A002.getWindowManager().getDefaultDisplay().getSize(point);
                A002.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i2 = point.y - rect.top;
                float f2 = 0.6f;
                if (this.A0H) {
                    f2 = 0.75f;
                }
                this.A00 = (float) ((int) (f2 * ((float) i2)));
                int dimensionPixelSize = A002.getResources().getDimensionPixelSize(R.dimen.dimen00fd);
                if (this.A0B) {
                    dimensionPixelSize += this.A0D.getMeasuredHeight();
                }
                BottomSheetBehavior bottomSheetBehavior = this.A0F;
                if (dimensionPixelSize != (bottomSheetBehavior.A0M ? -1 : bottomSheetBehavior.A09)) {
                    A03(500);
                    bottomSheetBehavior.A0L(dimensionPixelSize);
                }
            }
        }
    }

    public void A01() {
        if (this.A08) {
            View view = this.A0C;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if ((((float) view.getMeasuredHeight()) <= this.A00 && view.getHeight() != view.getMeasuredHeight()) || (((float) view.getMeasuredHeight()) > this.A00 && ((float) view.getHeight()) != this.A00)) {
                AnonymousClass0Bo r2 = (AnonymousClass0Bo) view.getLayoutParams();
                r2.height = Math.min(view.getMeasuredHeight(), (int) this.A00);
                r2.A02 = 0;
                view.setLayoutParams(r2);
            }
            this.A06 = !this.A0B;
        }
    }

    public final void A02(int i2) {
        RunnableRunnableShape0S0101000_I0 runnableRunnableShape0S0101000_I0 = new RunnableRunnableShape0S0101000_I0((Object) this, i2, 7);
        View view = this.A0C;
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !C004601z.A0t(view)) {
            runnableRunnableShape0S0101000_I0.run();
        } else {
            view.post(runnableRunnableShape0S0101000_I0);
        }
    }

    public final void A03(long j2) {
        BottomSheetBehavior bottomSheetBehavior = this.A0F;
        if (!bottomSheetBehavior.A0M && bottomSheetBehavior.A09 > 0) {
            C015607m r1 = new C015607m();
            r1.A04(j2);
            r1.A08(new AnonymousClass3TC(this));
            C015807o.A02((ViewGroup) this.A0C, r1);
        }
    }

    public void A04(TimeInterpolator timeInterpolator, int i2, int i3, int i4, int i5) {
        if (this.A08) {
            if (this.A0F.A0B != 4) {
                i2 = 0;
                i3 = 0;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i4, (float) i5});
            this.A04 = ofFloat;
            ofFloat.setInterpolator(timeInterpolator);
            this.A04.setDuration((long) i2);
            this.A04.setStartDelay((long) i3);
            this.A04.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 7));
            this.A04.start();
        }
    }

    public final void A05(AnonymousClass06y r5) {
        int i2;
        boolean z2 = false;
        if (r5 != null) {
            z2 = true;
        }
        this.A08 = z2;
        StringBuilder sb = new StringBuilder("CallControlBottomSheetBehaviorController setBehavior ");
        sb.append(z2);
        Log.i(sb.toString());
        View view = this.A0C;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof AnonymousClass0Bo) {
            AnonymousClass0Bo r1 = (AnonymousClass0Bo) layoutParams;
            if (r1.A0A != r5) {
                r1.A01(r5);
                view.setLayoutParams(layoutParams);
                C54882iQ r12 = this.A05;
                if (this.A08 || (i2 = this.A02) == 0) {
                    i2 = this.A0F.A0B;
                }
                r12.A02(view, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public void A06(boolean z2) {
        if (this.A08 && !this.A0A) {
            BottomSheetBehavior bottomSheetBehavior = this.A0F;
            float f2 = ((float) (bottomSheetBehavior.A0M ? -1 : bottomSheetBehavior.A09)) * 0.07f;
            View view = this.A0C;
            if (z2) {
                f2 = -f2;
            }
            view.setTranslationY(f2);
        }
    }

    public final void A07(boolean z2) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = 0.0f;
        if (z2) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.A0C.getAlpha(), f2});
        this.A03 = ofFloat;
        ofFloat.setDuration(200);
        this.A03.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 6));
        this.A03.addListener(new IDxLAdapterShape0S0100001_2_I0(this, f2, 1));
        this.A03.start();
    }

    public boolean A08() {
        return this.A08 && this.A0F.A0B == 3;
    }

    public boolean A09() {
        int i2;
        if (this.A08 || (i2 = this.A02) == 0) {
            i2 = this.A0F.A0B;
        }
        return i2 == 5;
    }
}
