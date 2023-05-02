package com.google.android.material.transformation;

import X.AnonymousClass000;
import X.AnonymousClass0Bo;
import X.AnonymousClass2WK;
import X.AnonymousClass4C9;
import X.C004601z;
import X.C53572fv;
import X.C53672g5;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = AnonymousClass000.A0J();
    public final RectF A01 = AnonymousClass000.A0K();
    public final RectF A02 = AnonymousClass000.A0K();
    public final int[] A03 = new int[2];

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final float A00(C53672g5 r8, AnonymousClass4C9 r9, float f2) {
        long j2 = r8.A02;
        long j3 = r8.A03;
        C53672g5 A032 = r9.A00.A03("expansion");
        float f3 = ((float) (((A032.A02 + A032.A03) + 17) - j2)) / ((float) j3);
        TimeInterpolator timeInterpolator = r8.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C53572fv.A02;
        }
        return AnonymousClass000.A01(0.0f, f2, timeInterpolator.getInterpolation(f3));
    }

    public static final void A01(View view, View view2, AnonymousClass4C9 r7, List list, boolean z2, boolean z3) {
        Property property;
        float[] fArr;
        float f2;
        float A002 = C004601z.A00(view2) - C004601z.A00(view);
        if (z2) {
            if (!z3) {
                view2.setTranslationZ(-A002);
            }
            property = View.TRANSLATION_Z;
            fArr = new float[1];
            f2 = 0.0f;
        } else {
            property = View.TRANSLATION_Z;
            fArr = new float[1];
            f2 = -A002;
        }
        fArr[0] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, fArr);
        r7.A00.A03("elevation").A00(ofFloat);
        list.add(ofFloat);
    }

    public void A0G(AnonymousClass0Bo r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view.getVisibility() == 8) {
            throw AnonymousClass000.A0V("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof AnonymousClass2WK)) {
            return false;
        } else {
            int i2 = ((AnonymousClass2WK) view2).A0F.A00;
            return i2 == 0 || i2 == view.getId();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        if ((r3 instanceof android.view.ViewGroup) != false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet A0J(android.view.View r23, android.view.View r24, boolean r25, boolean r26) {
        /*
            r22 = this;
            r13 = r24
            android.content.Context r1 = r13.getContext()
            r0 = 2130837518(0x7f02000e, float:1.7279992E38)
            r12 = r25
            if (r25 == 0) goto L_0x0010
            r0 = 2130837519(0x7f02000f, float:1.7279994E38)
        L_0x0010:
            X.4C9 r11 = new X.4C9
            r11.<init>()
            X.2fg r0 = X.C53422fg.A00(r1, r0)
            r11.A00 = r0
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.util.ArrayList r15 = X.AnonymousClass000.A0u()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            r14 = r23
            r21 = r26
            if (r1 < r0) goto L_0x003a
            r18 = r11
            r19 = r10
            r20 = r12
            r16 = r14
            r17 = r13
            A01(r16, r17, r18, r19, r20, r21)
        L_0x003a:
            r9 = r22
            android.graphics.RectF r8 = r9.A01
            android.graphics.RectF r7 = r9.A02
            r9.A0K(r8, r14)
            r9.A0K(r7, r13)
            float r1 = r7.centerX()
            float r0 = r8.centerX()
            float r1 = r1 - r0
            r0 = 0
            float r1 = r1 + r0
            r9.A0K(r8, r14)
            r9.A0K(r7, r13)
            float r2 = r7.centerY()
            float r0 = r8.centerY()
            float r2 = r2 - r0
            r17 = 0
            float r2 = r2 + r17
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            if (r25 == 0) goto L_0x0158
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x015c
        L_0x0072:
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationXCurveDownwards"
            X.2g5 r6 = r3.A03(r0)
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationYCurveDownwards"
        L_0x0080:
            X.2g5 r5 = r3.A03(r0)
            r16 = 0
            r0 = 1
            if (r25 == 0) goto L_0x0140
            if (r26 != 0) goto L_0x0093
            float r3 = -r1
            r13.setTranslationX(r3)
            float r3 = -r2
            r13.setTranslationY(r3)
        L_0x0093:
            android.util.Property r4 = android.view.View.TRANSLATION_X
            float[] r3 = new float[r0]
            r3[r16] = r17
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r13, r4, r3)
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r0 = new float[r0]
            r0[r16] = r17
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r13, r3, r0)
            float r1 = -r1
            float r0 = -r2
            float r2 = A00(r6, r11, r1)
            float r1 = A00(r5, r11, r0)
            android.graphics.Rect r0 = r9.A00
            r13.getWindowVisibleDisplayFrame(r0)
            r8.set(r0)
            r9.A0K(r7, r13)
            r7.offset(r2, r1)
            r7.intersect(r8)
            r8.set(r7)
        L_0x00c5:
            r6.A00(r4)
            r5.A00(r3)
            r10.add(r4)
            r10.add(r3)
            r8.width()
            r8.height()
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0110
            r0 = 2131364761(0x7f0a0b99, float:1.8349368E38)
            android.view.View r3 = r13.findViewById(r0)
            if (r3 == 0) goto L_0x013e
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0110
        L_0x00e8:
            r4 = 1
            if (r25 == 0) goto L_0x0133
            if (r26 != 0) goto L_0x00f6
            android.util.Property r1 = X.AnonymousClass3MZ.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            r1.set(r3, r0)
        L_0x00f6:
            android.util.Property r2 = X.AnonymousClass3MZ.A00
            float[] r1 = new float[r4]
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r16] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r2, r1)
        L_0x0102:
            X.2fg r1 = r11.A00
            java.lang.String r0 = "contentFade"
            X.2g5 r0 = r1.A03(r0)
            r0.A00(r2)
            r10.add(r2)
        L_0x0110:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            X.C53702g8.A00(r3, r10)
            X.3KJ r0 = new X.3KJ
            r0.<init>(r13, r14, r9, r12)
            r3.addListener(r0)
            r2 = 0
            int r1 = r15.size()
        L_0x0125:
            if (r2 >= r1) goto L_0x017c
            java.lang.Object r0 = r15.get(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r3.addListener(r0)
            int r2 = r2 + 1
            goto L_0x0125
        L_0x0133:
            android.util.Property r1 = X.AnonymousClass3MZ.A00
            float[] r0 = new float[r4]
            r0[r16] = r17
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r1, r0)
            goto L_0x0102
        L_0x013e:
            r3 = r13
            goto L_0x00e8
        L_0x0140:
            android.util.Property r4 = android.view.View.TRANSLATION_X
            float[] r3 = new float[r0]
            float r1 = -r1
            r3[r16] = r1
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r13, r4, r3)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r0]
            float r0 = -r2
            r3[r16] = r0
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r13, r1, r3)
            goto L_0x00c5
        L_0x0158:
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
        L_0x015c:
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationXCurveUpwards"
            X.2g5 r6 = r3.A03(r0)
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationYCurveUpwards"
            goto L_0x0080
        L_0x016c:
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationXLinear"
            X.2g5 r6 = r3.A03(r0)
            X.2fg r3 = r11.A00
            java.lang.String r0 = "translationYLinear"
            goto L_0x0080
        L_0x017c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A0J(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void A0K(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.A03;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }
}
