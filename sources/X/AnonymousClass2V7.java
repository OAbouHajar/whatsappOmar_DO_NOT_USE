package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape10S0101000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.camera.CameraBottomSheetBehavior;
import com.obwhatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.2V7  reason: invalid class name */
public class AnonymousClass2V7 {
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public DragGalleryStripIndicator A03;
    public C54852iN A04;
    public AnonymousClass2OM A05;
    public C16690tT A06;
    public final Resources A07;
    public final View A08;
    public final View A09;
    public final RecyclerView A0A;
    public final CameraBottomSheetBehavior A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        r1 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2V7(android.view.View r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.A08 = r4
            if (r5 == 0) goto L_0x002f
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 1
            r1.setClipChildren(r0)
            r0 = 2131363812(0x7f0a07e4, float:1.8347443E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r3.A02 = r0
            r0 = 2131363301(0x7f0a05e5, float:1.8346407E38)
            android.view.View r1 = X.C004601z.A0E(r4, r0)
            com.obwhatsapp.camera.DragGalleryStripIndicator r1 = (com.obwhatsapp.camera.DragGalleryStripIndicator) r1
            r3.A03 = r1
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131363302(0x7f0a05e6, float:1.8346409E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r3.A01 = r0
        L_0x002f:
            r0 = 2131365678(0x7f0a0f2e, float:1.8351228E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r3.A0A = r0
            r0 = 2131363803(0x7f0a07db, float:1.8347425E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r3.A09 = r0
            android.content.res.Resources r0 = r4.getResources()
            r3.A07 = r0
            r3.A0C = r5
            r3.A0D = r6
            if (r5 == 0) goto L_0x00a6
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x00a6
        L_0x0053:
            com.obwhatsapp.camera.bottomsheet.CameraBottomSheetController$5 r0 = new com.obwhatsapp.camera.bottomsheet.CameraBottomSheetController$5
            r0.<init>(r1, r3, r5)
            r3.A0B = r0
            android.view.View r1 = r3.A09
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setAlpha(r0)
            android.content.res.Resources r2 = r3.A07
            boolean r1 = r3.A0C
            r0 = 2131166575(0x7f07056f, float:1.79474E38)
            if (r1 == 0) goto L_0x0071
            r0 = 2131165501(0x7f07013d, float:1.794522E38)
        L_0x0071:
            int r1 = r2.getDimensionPixelSize(r0)
            com.obwhatsapp.camera.CameraBottomSheetBehavior r0 = r3.A0B
            r0.A0L(r1)
            android.view.View r0 = r3.A08
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0Bo r1 = (X.AnonymousClass0Bo) r1
            com.obwhatsapp.camera.CameraBottomSheetBehavior r0 = r3.A0B
            r1.A01(r0)
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x00a5
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x00a5
            com.obwhatsapp.camera.DragGalleryStripIndicator r0 = r3.A03
            if (r0 == 0) goto L_0x00a5
            r0 = 0
            r1.measure(r0, r0)
            int r0 = r1.getMeasuredHeight()
            int r0 = -r0
            float r0 = (float) r0
            r1.setTranslationY(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x00a5:
            return
        L_0x00a6:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A0A
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V7.<init>(android.view.View, boolean, boolean):void");
    }

    public void A00() {
        C54852iN r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A01() {
        boolean z2 = false;
        if (this.A0B.A0B == 4) {
            z2 = true;
        }
        RecyclerView recyclerView = this.A0A;
        if (!z2) {
            recyclerView.setVisibility(4);
            recyclerView.setAlpha(0.0f);
            View view = this.A01;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.A09;
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
            return;
        }
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(1.0f);
        View view3 = this.A01;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.A09;
        view4.setVisibility(4);
        view4.setAlpha(0.0f);
    }

    public void A02() {
        View view = this.A08;
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            if (!this.A0C) {
                animationSet.addAnimation(translateAnimation);
            }
            animationSet.setDuration(300);
            view.startAnimation(animationSet);
        }
    }

    public void A03(boolean z2) {
        View view;
        float f2 = 1.0f;
        if (z2) {
            f2 = 0.0f;
        }
        float f3 = 1.0f - f2;
        View view2 = this.A02;
        if (view2 != null && (view = this.A01) != null && this.A03 != null) {
            int measuredHeight = view2.getMeasuredHeight();
            int i2 = -measuredHeight;
            int translationY = (int) view.getTranslationY();
            int i3 = z2 ? i2 + translationY : translationY - i2;
            IDxLAdapterShape3S0100000_2_I0 iDxLAdapterShape3S0100000_2_I0 = new IDxLAdapterShape3S0100000_2_I0(this, 10);
            IDxLAdapterShape3S0100000_2_I0 iDxLAdapterShape3S0100000_2_I02 = new IDxLAdapterShape3S0100000_2_I0(this, 11);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new IDxUListenerShape10S0101000_2_I0(this, measuredHeight, 1));
            if (!z2) {
                iDxLAdapterShape3S0100000_2_I0 = iDxLAdapterShape3S0100000_2_I02;
            }
            ofFloat.addListener(iDxLAdapterShape3S0100000_2_I0);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{translationY, i3});
            ofInt.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150);
            animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
            this.A00 = animatorSet;
            animatorSet.start();
        }
    }

    public void A04(boolean z2) {
        if (this.A0B.A0B != 4) {
            return;
        }
        if (!z2 || (this.A07.getConfiguration().orientation == 2 && !this.A0D)) {
            A02();
            return;
        }
        this.A08.setVisibility(0);
        A01();
    }
}
