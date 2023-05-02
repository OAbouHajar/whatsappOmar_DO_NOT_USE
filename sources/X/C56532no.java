package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.2no  reason: invalid class name and case insensitive filesystem */
public class C56532no extends Transition {
    public int A00;
    public int A01;
    public final Context A02;
    public final Rect A03 = AnonymousClass000.A0J();
    public final C54602hp A04;
    public final boolean A05;
    public final int[] A06 = new int[2];

    public C56532no(Context context, C54602hp r3, boolean z2) {
        this.A04 = r3;
        this.A05 = z2;
        this.A02 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r0 == 0) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.animation.ValueAnimator r7, android.transition.TransitionValues r8, X.C56532no r9) {
        /*
            android.view.View r4 = r8.view
            boolean r0 = r4 instanceof com.obwhatsapp.mediaview.PhotoView
            if (r0 != 0) goto L_0x000a
            boolean r0 = r4 instanceof com.obwhatsapp.components.button.ThumbnailButton
            if (r0 == 0) goto L_0x0067
        L_0x000a:
            java.lang.Object r0 = r7.getAnimatedValue()
            float r7 = X.AnonymousClass000.A04(r0)
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x001a
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r0 - r7
        L_0x001a:
            int[] r1 = r9.A06
            r4.getLocationOnScreen(r1)
            r0 = 1
            r8 = r1[r0]
            int r0 = r4.getHeight()
            int r1 = r8 + r0
            android.graphics.Rect r5 = r9.A03
            r6 = 0
            r5.left = r6
            int r0 = r4.getWidth()
            r5.right = r0
            int r0 = r9.A00
            r3 = 0
            if (r1 <= r0) goto L_0x006b
            if (r0 <= 0) goto L_0x006b
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            int r2 = r4.getHeight()
            int r0 = r9.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
        L_0x0049:
            r5.bottom = r2
            int r1 = r9.A01
            if (r8 >= r1) goto L_0x0068
            if (r1 <= 0) goto L_0x0068
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            int r1 = r1 - r8
            float r0 = (float) r1
            float r7 = r7 * r0
            int r0 = (int) r7
            r5.top = r0
            if (r0 != 0) goto L_0x0070
        L_0x005d:
            int r0 = r4.getHeight()
            if (r2 != r0) goto L_0x0070
            r0 = 0
            X.C004601z.A0i(r4, r0)
        L_0x0067:
            return
        L_0x0068:
            r5.top = r6
            goto L_0x005d
        L_0x006b:
            int r2 = r4.getHeight()
            goto L_0x0049
        L_0x0070:
            X.C004601z.A0i(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56532no.A00(android.animation.ValueAnimator, android.transition.TransitionValues, X.2no):void");
    }

    public void captureEndValues(TransitionValues transitionValues) {
        if (!this.A05) {
            C54602hp r3 = this.A04;
            if (r3.A00(R.string.str1dd3).equals(C004601z.A0L(transitionValues.view))) {
                View view = transitionValues.view;
                int[] iArr = this.A06;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3.A00(R.string.str1dd2).equals(C004601z.A0L(transitionValues.view))) {
                View view2 = transitionValues.view;
                int[] iArr2 = this.A06;
                view2.getLocationOnScreen(iArr2);
                this.A00 = iArr2[1] + transitionValues.view.getHeight();
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        if (this.A05) {
            C54602hp r3 = this.A04;
            if (r3.A00(R.string.str1dd3).equals(C004601z.A0L(transitionValues.view))) {
                View view = transitionValues.view;
                int[] iArr = this.A06;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3.A00(R.string.str1dd2).equals(C004601z.A0L(transitionValues.view))) {
                View view2 = transitionValues.view;
                int[] iArr2 = this.A06;
                view2.getLocationOnScreen(iArr2);
                this.A00 = iArr2[1] + transitionValues.view.getHeight();
            }
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = 0;
        A1Z[1] = 1;
        ValueAnimator ofObject = ValueAnimator.ofObject(floatEvaluator, A1Z);
        ofObject.addUpdateListener(new C91054fI(transitionValues2, this));
        return ofObject;
    }
}
