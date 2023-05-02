package X;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxPropertyShape1S0000000_I1;
import com.obwhatsapp.R;
import java.util.Map;

/* renamed from: X.0GG  reason: invalid class name */
public class AnonymousClass0GG extends C015707n {
    public static final Property A01 = new IDxPropertyShape1S0000000_I1(0);
    public static final Property A02 = new IDxPropertyShape1S0000000_I1(1);
    public static final boolean A03;
    public static final String[] A04 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public Matrix A00 = AnonymousClass000.A0H();

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A03 = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.0Bw} */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.0GD] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r0 = r8.A0A(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (r5 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A0S(android.view.ViewGroup r24, X.C06230Uw r25, X.C06230Uw r26) {
        /*
            r23 = this;
            r14 = r25
            if (r25 == 0) goto L_0x0226
            r13 = r26
            if (r26 == 0) goto L_0x0226
            java.util.Map r12 = r14.A02
            java.lang.String r11 = "android:changeTransform:parent"
            boolean r0 = r12.containsKey(r11)
            if (r0 == 0) goto L_0x0226
            java.util.Map r10 = r13.A02
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x0226
            java.lang.Object r9 = r12.get(r11)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r2 = r10.get(r11)
            android.view.View r2 = (android.view.View) r2
            r8 = r23
            boolean r0 = r8.A0R(r9)
            r1 = 1
            if (r0 == 0) goto L_0x0210
            boolean r0 = r8.A0R(r2)
            if (r0 == 0) goto L_0x0210
            X.0Uw r0 = r8.A0A(r9, r1)
            if (r0 == 0) goto L_0x0214
            android.view.View r0 = r0.A00
            if (r2 != r0) goto L_0x0214
        L_0x003f:
            r22 = 0
        L_0x0041:
            java.lang.String r0 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r12.get(r0)
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "android:changeTransform:matrix"
            r12.put(r0, r1)
        L_0x004e:
            java.lang.String r0 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r12.get(r0)
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            r12.put(r0, r1)
        L_0x005b:
            if (r22 == 0) goto L_0x0092
            java.lang.String r4 = "android:changeTransform:parentMatrix"
            java.lang.Object r3 = r10.get(r4)
            android.graphics.Matrix r3 = (android.graphics.Matrix) r3
            android.view.View r1 = r13.A00
            r0 = 2131365005(0x7f0a0c8d, float:1.8349863E38)
            r1.setTag(r0, r3)
            android.graphics.Matrix r2 = r8.A00
            r2.reset()
            r3.invert(r2)
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r1 = r12.get(r0)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x0086
            android.graphics.Matrix r1 = X.AnonymousClass000.A0H()
            r12.put(r0, r1)
        L_0x0086:
            java.lang.Object r0 = r12.get(r4)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            r1.postConcat(r0)
            r1.postConcat(r2)
        L_0x0092:
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r2 = r12.get(r0)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            java.lang.Object r7 = r10.get(r0)
            android.graphics.Matrix r7 = (android.graphics.Matrix) r7
            if (r2 != 0) goto L_0x00a4
            android.graphics.Matrix r2 = X.C04430Mn.A00
        L_0x00a4:
            if (r7 != 0) goto L_0x00a8
            android.graphics.Matrix r7 = X.C04430Mn.A00
        L_0x00a8:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x016a
            r1 = 0
        L_0x00af:
            if (r22 == 0) goto L_0x0160
            if (r1 == 0) goto L_0x0160
            android.view.View r3 = r13.A00
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            java.lang.Object r0 = r10.get(r0)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r0)
            X.0SD r4 = X.C06430Vt.A02
            r9 = r24
            r4.A03(r2, r9)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r5 != r0) goto L_0x00d6
            X.0lP r5 = X.C07790cT.A00(r2, r3, r9)
            if (r5 != 0) goto L_0x011f
        L_0x00d5:
            return r1
        L_0x00d6:
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x021f
            r0 = 2131363846(0x7f0a0806, float:1.8347512E38)
            java.lang.Object r7 = r9.getTag(r0)
            X.0CC r7 = (X.AnonymousClass0CC) r7
            r0 = 2131363845(0x7f0a0805, float:1.834751E38)
            java.lang.Object r5 = r3.getTag(r0)
            X.0Bw r5 = (X.C02430Bw) r5
            r6 = 0
            if (r5 == 0) goto L_0x0100
            android.view.ViewParent r0 = r5.getParent()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == r7) goto L_0x0145
            int r6 = r5.A00
            r0.removeView(r5)
        L_0x0100:
            X.0Bw r5 = new X.0Bw
            r5.<init>(r3)
            r5.A01 = r2
            if (r7 != 0) goto L_0x0130
            X.0CC r7 = new X.0CC
            r7.<init>(r9)
        L_0x010e:
            X.C02430Bw.A00(r9, r7)
            X.C02430Bw.A00(r9, r5)
            r7.A01(r5)
            r5.A00 = r6
        L_0x0119:
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
        L_0x011f:
            java.lang.Object r0 = r12.get(r11)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r14.A00
            r5.AcN(r2, r0)
        L_0x012a:
            X.0GD r0 = r8.A07
            if (r0 == 0) goto L_0x0148
            r8 = r0
            goto L_0x012a
        L_0x0130:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0218
            android.view.ViewGroup r2 = r7.A00
            X.0lR r0 = X.AnonymousClass0We.A01(r2)
            r0.Abr(r7)
            X.0lR r0 = X.AnonymousClass0We.A01(r2)
            r0.A4U(r7)
            goto L_0x010e
        L_0x0145:
            r5.A01 = r2
            goto L_0x0119
        L_0x0148:
            X.0GL r0 = new X.0GL
            r0.<init>(r3, r5)
            r8.A08(r0)
            boolean r0 = A03
            if (r0 == 0) goto L_0x00d5
            if (r2 == r3) goto L_0x015a
            r0 = 0
            r4.A06(r2, r0)
        L_0x015a:
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A06(r3, r0)
            return r1
        L_0x0160:
            boolean r0 = A03
            if (r0 != 0) goto L_0x00d5
            android.view.View r0 = r14.A00
            r9.endViewTransition(r0)
            return r1
        L_0x016a:
            java.lang.String r0 = "android:changeTransform:transforms"
            java.lang.Object r20 = r10.get(r0)
            r0 = r20
            X.0Rh r0 = (X.C05440Rh) r0
            r20 = r0
            android.view.View r6 = r13.A00
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setTranslationX(r1)
            r6.setTranslationY(r1)
            X.C004601z.A0Y(r6, r1)
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setRotationX(r1)
            r6.setRotationY(r1)
            r6.setRotation(r1)
            r0 = 9
            float[] r5 = new float[r0]
            r2.getValues(r5)
            float[] r4 = new float[r0]
            r7.getValues(r4)
            X.0Pq r15 = new X.0Pq
            r15.<init>(r6, r5)
            android.util.Property r16 = A01
            float[] r0 = new float[r0]
            X.0XV r3 = new X.0XV
            r3.<init>(r0)
            r2 = 2
            float[][] r1 = new float[r2][]
            r19 = 0
            r1[r19] = r5
            r18 = 1
            r1[r18] = r4
            r0 = r16
            android.animation.PropertyValuesHolder r17 = android.animation.PropertyValuesHolder.ofObject(r0, r3, r1)
            r16 = r5[r2]
            r1 = 5
            r0 = r5[r1]
            r5 = r4[r2]
            r4 = r4[r1]
            android.graphics.Path r3 = X.AnonymousClass000.A0I()
            r1 = r16
            r3.moveTo(r1, r0)
            r3.lineTo(r5, r4)
            android.util.Property r4 = A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0201
            r0 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r4, r0, r3)
        L_0x01e0:
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r2]
            r0[r19] = r17
            r0[r18] = r1
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r15, r0)
            X.09v r0 = new X.09v
            r21 = r8
            r16 = r0
            r17 = r7
            r18 = r6
            r19 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1.addListener(r0)
            X.AnonymousClass0M9.A00(r1, r0)
            goto L_0x00af
        L_0x0201:
            X.0Ba r1 = new X.0Ba
            r1.<init>(r3, r4)
            float[] r0 = new float[r2]
            r0 = {0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r0)
            goto L_0x01e0
        L_0x0210:
            if (r9 != r2) goto L_0x0214
            goto L_0x003f
        L_0x0214:
            r22 = 1
            goto L_0x0041
        L_0x0218:
            java.lang.String r0 = "This GhostViewHolder is detached!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x021f:
            java.lang.String r0 = "Ghosted views must be parented by a ViewGroup"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0226:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GG.A0S(android.view.ViewGroup, X.0Uw, X.0Uw):android.animation.Animator");
    }

    public String[] A0U() {
        return A04;
    }

    public void A0V(C06230Uw r1) {
        A0X(r1);
    }

    public void A0W(C06230Uw r3) {
        A0X(r3);
        if (!A03) {
            View view = r3.A00;
            ((ViewGroup) view.getParent()).startViewTransition(view);
        }
    }

    public final void A0X(C06230Uw r7) {
        View view = r7.A00;
        if (view.getVisibility() != 8) {
            Map map = r7.A02;
            map.put("android:changeTransform:parent", view.getParent());
            map.put("android:changeTransform:transforms", new C05440Rh(view));
            Matrix matrix = view.getMatrix();
            map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            Matrix A0H = AnonymousClass000.A0H();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            C06430Vt.A02.A02(A0H, viewGroup);
            A0H.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
            map.put("android:changeTransform:parentMatrix", A0H);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }
}
