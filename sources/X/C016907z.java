package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.facebook.redex.IDxLAdapterShape0S0100000_I0;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.07z  reason: invalid class name and case insensitive filesystem */
public class C016907z extends AnonymousClass07W implements Animatable {
    public Animator.AnimatorListener A00;
    public ArgbEvaluator A01;
    public Context A02;
    public AnonymousClass0AU A03;
    public AnonymousClass0AV A04;
    public ArrayList A05;
    public final Drawable.Callback A06;

    public C016907z() {
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        this.A06 = new C06750Xn(this);
        this.A02 = null;
        this.A03 = new AnonymousClass0AU();
    }

    public C016907z(Context context) {
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        this.A06 = new C06750Xn(this);
        this.A02 = context;
        this.A03 = new AnonymousClass0AU();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.animation.Animator[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.PropertyValuesHolder[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.animation.Animator} */
    /* JADX WARNING: type inference failed for: r3v21, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c6, code lost:
        if (r0 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02df, code lost:
        if (r1 == null) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e1, code lost:
        r1 = A01(r9, r8, r17, 0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e7, code lost:
        if (r1 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        if (A06(r0.type) != false) goto L_0x015e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator A00(android.animation.AnimatorSet r24, android.content.Context r25, android.content.res.Resources.Theme r26, android.content.res.Resources r27, android.util.AttributeSet r28, org.xmlpull.v1.XmlPullParser r29, int r30) {
        /*
            r23 = 1065353216(0x3f800000, float:1.0)
            r12 = r29
            int r22 = r12.getDepth()
            r13 = 0
            r21 = r13
        L_0x000b:
            int r1 = r12.next()
            r0 = 3
            r11 = 0
            if (r1 != r0) goto L_0x001c
            int r1 = r12.getDepth()
            r0 = r22
            if (r1 <= r0) goto L_0x0322
            goto L_0x000b
        L_0x001c:
            r14 = 1
            if (r1 == r14) goto L_0x0322
            r0 = 2
            if (r1 != r0) goto L_0x000b
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r1.equals(r0)
            r3 = r28
            if (r0 == 0) goto L_0x0052
            android.animation.ObjectAnimator r13 = new android.animation.ObjectAnimator
            r13.<init>()
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r3
            r3 = r13
            r8 = r12
            A02(r3, r4, r5, r6, r7, r8)
        L_0x0041:
            if (r24 == 0) goto L_0x000b
            if (r11 != 0) goto L_0x000b
            if (r21 != 0) goto L_0x004c
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
        L_0x004c:
            r0 = r21
            r0.add(r13)
            goto L_0x000b
        L_0x0052:
            java.lang.String r0 = "animator"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            r4 = 0
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r3
            r9 = r12
            android.animation.ValueAnimator r13 = A02(r4, r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x0068:
            java.lang.String r0 = "set"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009d
            android.animation.AnimatorSet r13 = new android.animation.AnimatorSet
            r13.<init>()
            int[] r2 = X.C014807c.A03
            r1 = r26
            r0 = r27
            android.content.res.TypedArray r1 = X.C014907d.A01(r1, r0, r3, r2)
            java.lang.String r0 = "ordering"
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 != 0) goto L_0x0098
            r9 = 0
        L_0x0088:
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r3
            r3 = r13
            r8 = r12
            A00(r3, r4, r5, r6, r7, r8, r9)
            r1.recycle()
            goto L_0x0041
        L_0x0098:
            int r9 = r1.getInt(r11, r11)
            goto L_0x0088
        L_0x009d:
            java.lang.String r20 = "propertyValuesHolder"
            r0 = r20
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030a
            android.util.AttributeSet r19 = android.util.Xml.asAttributeSet(r12)
            r18 = 0
            r10 = r18
        L_0x00af:
            int r0 = r12.getEventType()
            r3 = 0
            r5 = 3
            if (r0 == r5) goto L_0x02ea
            if (r0 == r14) goto L_0x02ea
            r2 = 2
            if (r0 != r2) goto L_0x02da
            java.lang.String r1 = r12.getName()
            r0 = r20
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02da
            int[] r4 = X.C014807c.A07
            r3 = r26
            r1 = r27
            r0 = r19
            android.content.res.TypedArray r9 = X.C014907d.A01(r3, r1, r0, r4)
            java.lang.String r0 = "propertyName"
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 != 0) goto L_0x02bb
            r8 = 0
        L_0x00dd:
            java.lang.String r0 = "valueType"
            r1 = 4
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 != 0) goto L_0x02b5
            r17 = 4
        L_0x00e8:
            r7 = r17
            r6 = r18
        L_0x00ec:
            int r1 = r12.next()
            if (r1 == r5) goto L_0x01c9
            if (r1 == r14) goto L_0x01c9
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "keyframe"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ec
            r1 = 4
            if (r7 != r1) goto L_0x012c
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.C014807c.A04
            r2 = r26
            r0 = r27
            android.content.res.TypedArray r2 = X.C014907d.A01(r2, r0, r4, r3)
            java.lang.String r0 = "value"
            r7 = 0
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 == 0) goto L_0x0129
            android.util.TypedValue r0 = r2.peekValue(r11)
            if (r0 == 0) goto L_0x0129
            int r0 = r0.type
            boolean r0 = A06(r0)
            if (r0 == 0) goto L_0x0129
            r7 = 3
        L_0x0129:
            r2.recycle()
        L_0x012c:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = X.C014807c.A04
            r2 = r26
            r0 = r27
            android.content.res.TypedArray r2 = X.C014907d.A01(r2, r0, r4, r3)
            java.lang.String r0 = "fraction"
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 == 0) goto L_0x0148
            float r3 = r2.getFloat(r5, r3)
        L_0x0148:
            java.lang.String r4 = "value"
            boolean r0 = X.C014907d.A02(r4, r12)
            if (r0 != 0) goto L_0x01c1
            r0 = 0
        L_0x0151:
            r15 = 0
        L_0x0152:
            if (r7 != r1) goto L_0x0199
            if (r15 == 0) goto L_0x01bc
            int r0 = r0.type
            boolean r0 = A06(r0)
            if (r0 == 0) goto L_0x01a3
        L_0x015e:
            boolean r0 = X.C014907d.A02(r4, r12)
            if (r0 != 0) goto L_0x0194
            r0 = 0
        L_0x0165:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3, r0)
        L_0x0169:
            java.lang.String r0 = "interpolator"
            boolean r0 = X.C014907d.A02(r0, r12)
            if (r0 == 0) goto L_0x0180
            int r1 = r2.getResourceId(r14, r11)
            if (r1 <= 0) goto L_0x0180
            r0 = r25
            android.view.animation.Interpolator r0 = A03(r0, r1)
            r3.setInterpolator(r0)
        L_0x0180:
            r2.recycle()
            if (r3 == 0) goto L_0x018f
            if (r6 != 0) goto L_0x018c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x018c:
            r6.add(r3)
        L_0x018f:
            r12.next()
            goto L_0x00ec
        L_0x0194:
            int r0 = r2.getInt(r11, r11)
            goto L_0x0165
        L_0x0199:
            if (r15 == 0) goto L_0x01b5
            if (r7 == 0) goto L_0x01a3
            if (r7 == r14) goto L_0x015e
            if (r7 == r5) goto L_0x015e
            r3 = 0
            goto L_0x0169
        L_0x01a3:
            r1 = 0
            boolean r0 = X.C014907d.A02(r4, r12)
            if (r0 != 0) goto L_0x01b0
            r0 = 0
        L_0x01ab:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3, r0)
            goto L_0x0169
        L_0x01b0:
            float r0 = r2.getFloat(r11, r1)
            goto L_0x01ab
        L_0x01b5:
            if (r7 == 0) goto L_0x01bc
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3)
            goto L_0x0169
        L_0x01bc:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x0169
        L_0x01c1:
            android.util.TypedValue r0 = r2.peekValue(r11)
            r15 = 1
            if (r0 != 0) goto L_0x0152
            goto L_0x0151
        L_0x01c9:
            if (r6 == 0) goto L_0x02e1
            int r5 = r6.size()
            if (r5 <= 0) goto L_0x02e1
            r4 = 0
            java.lang.Object r3 = r6.get(r11)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            int r0 = r5 + -1
            java.lang.Object r2 = r6.get(r0)
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            float r15 = r2.getFraction()
            r1 = 0
            int r0 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f2
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x028a
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setFraction(r0)
        L_0x01f2:
            float r2 = r3.getFraction()
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0201
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0266
            r3.setFraction(r1)
        L_0x0201:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r5]
            r6.toArray(r3)
        L_0x0206:
            if (r4 >= r5) goto L_0x02c1
            r6 = r3[r4]
            float r0 = r6.getFraction()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0217
            if (r4 != 0) goto L_0x021a
            r6.setFraction(r1)
        L_0x0217:
            int r4 = r4 + 1
            goto L_0x0206
        L_0x021a:
            int r2 = r5 + -1
            if (r4 != r2) goto L_0x0224
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setFraction(r0)
            goto L_0x0217
        L_0x0224:
            int r0 = r4 + 1
            r6 = r4
        L_0x0227:
            if (r0 >= r2) goto L_0x0238
            r15 = r3[r0]
            float r15 = r15.getFraction()
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 >= 0) goto L_0x0238
            int r15 = r0 + 1
            r6 = r0
            r0 = r15
            goto L_0x0227
        L_0x0238:
            int r0 = r6 + 1
            r0 = r3[r0]
            float r16 = r0.getFraction()
            int r0 = r4 + -1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            float r16 = r16 - r0
            r2 = r4
            int r0 = r6 - r4
            int r0 = r0 + 2
            float r0 = (float) r0
            float r16 = r16 / r0
        L_0x0252:
            if (r2 > r6) goto L_0x0217
            r15 = r3[r2]
            int r0 = r2 + -1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            float r0 = r0 + r16
            r15.setFraction(r0)
            int r2 = r2 + 1
            goto L_0x0252
        L_0x0266:
            java.lang.Class r2 = r3.getType()
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L_0x0278
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r1)
        L_0x0272:
            r6.add(r11, r0)
            int r5 = r5 + 1
            goto L_0x0201
        L_0x0278:
            java.lang.Class r2 = r3.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L_0x0285
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r1)
            goto L_0x0272
        L_0x0285:
            android.animation.Keyframe r0 = android.animation.Keyframe.ofObject(r1)
            goto L_0x0272
        L_0x028a:
            int r16 = r6.size()
            java.lang.Class r15 = r2.getType()
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r15 != r0) goto L_0x02a3
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r23)
        L_0x029a:
            r0 = r16
            r6.add(r0, r2)
            int r5 = r5 + 1
            goto L_0x01f2
        L_0x02a3:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L_0x02b0
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r23)
            goto L_0x029a
        L_0x02b0:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r23)
            goto L_0x029a
        L_0x02b5:
            int r17 = r9.getInt(r2, r1)
            goto L_0x00e8
        L_0x02bb:
            java.lang.String r8 = r9.getString(r5)
            goto L_0x00dd
        L_0x02c1:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r8, r3)
            r0 = 3
            if (r7 != r0) goto L_0x02df
            X.0XX r0 = X.AnonymousClass0XX.A00
            r1.setEvaluator(r0)
        L_0x02cd:
            if (r10 != 0) goto L_0x02d4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x02d4:
            r10.add(r1)
        L_0x02d7:
            r9.recycle()
        L_0x02da:
            r12.next()
            goto L_0x00af
        L_0x02df:
            if (r1 != 0) goto L_0x02cd
        L_0x02e1:
            r0 = r17
            android.animation.PropertyValuesHolder r1 = A01(r9, r8, r0, r11, r14)
            if (r1 == 0) goto L_0x02d7
            goto L_0x02cd
        L_0x02ea:
            if (r10 == 0) goto L_0x0307
            int r2 = r10.size()
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r2]
        L_0x02f2:
            if (r3 >= r2) goto L_0x02fd
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x02f2
        L_0x02fd:
            boolean r0 = r13 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L_0x0307
            r0 = r13
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.setValues(r1)
        L_0x0307:
            r11 = 1
            goto L_0x0041
        L_0x030a:
            java.lang.String r0 = "Unknown animator name: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r12.getName()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0322:
            if (r24 == 0) goto L_0x0347
            if (r21 == 0) goto L_0x0347
            int r0 = r21.size()
            android.animation.Animator[] r3 = new android.animation.Animator[r0]
            java.util.Iterator r2 = r21.iterator()
        L_0x0330:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0340
            java.lang.Object r1 = r2.next()
            int r0 = r11 + 1
            r3[r11] = r1
            r11 = r0
            goto L_0x0330
        L_0x0340:
            r0 = r24
            if (r30 != 0) goto L_0x0348
            r0.playTogether(r3)
        L_0x0347:
            return r13
        L_0x0348:
            r0.playSequentially(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016907z.A00(android.animation.AnimatorSet, android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser, int):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011d, code lost:
        if (r16 == 0) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder A01(android.content.res.TypedArray r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r3 = r16
            r10 = r17
            android.util.TypedValue r0 = r14.peekValue(r10)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0126
            r13 = 1
            int r11 = r0.type
        L_0x000f:
            r9 = r18
            android.util.TypedValue r0 = r14.peekValue(r9)
            if (r0 == 0) goto L_0x0122
            r12 = 1
            int r8 = r0.type
        L_0x001a:
            r0 = 4
            r1 = 3
            if (r3 != r0) goto L_0x011d
            if (r13 == 0) goto L_0x0026
            boolean r0 = A06(r11)
            if (r0 != 0) goto L_0x002e
        L_0x0026:
            if (r12 == 0) goto L_0x011b
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x011b
        L_0x002e:
            r3 = 3
        L_0x002f:
            r2 = 0
        L_0x0030:
            r0 = 0
            r7 = 2
            if (r3 != r7) goto L_0x006f
            java.lang.String r8 = r14.getString(r10)
            java.lang.String r6 = r14.getString(r9)
            X.07h[] r3 = X.C015107g.A02(r8)
            X.07h[] r2 = X.C015107g.A02(r6)
            if (r3 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0055
            X.0XW r1 = new X.0XW
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
        L_0x0051:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r0)
        L_0x0055:
            return r0
        L_0x0056:
            X.0XW r1 = new X.0XW
            r1.<init>()
            if (r2 == 0) goto L_0x006a
            boolean r0 = X.C015107g.A01(r3, r2)
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r3
            r0[r5] = r2
            goto L_0x0051
        L_0x006a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            goto L_0x0051
        L_0x006f:
            if (r3 != r1) goto L_0x0118
            X.0XX r3 = X.AnonymousClass0XX.A00
        L_0x0073:
            r6 = 5
            r1 = 0
            if (r2 == 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00a8
            if (r11 != r6) goto L_0x00a3
            float r2 = r14.getDimension(r10, r1)
        L_0x007f:
            if (r12 == 0) goto L_0x009e
            if (r8 != r6) goto L_0x0099
            float r0 = r14.getDimension(r9, r1)
        L_0x0087:
            float[] r1 = new float[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x008d:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r15, r1)
        L_0x0091:
            if (r0 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0055
            r0.setEvaluator(r3)
            return r0
        L_0x0099:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x0087
        L_0x009e:
            float[] r1 = new float[r5]
            r1[r4] = r2
            goto L_0x008d
        L_0x00a3:
            float r2 = r14.getFloat(r10, r1)
            goto L_0x007f
        L_0x00a8:
            if (r8 != r6) goto L_0x00b3
            float r0 = r14.getDimension(r9, r1)
        L_0x00ae:
            float[] r1 = new float[r5]
            r1[r4] = r0
            goto L_0x008d
        L_0x00b3:
            float r0 = r14.getFloat(r9, r1)
            goto L_0x00ae
        L_0x00b8:
            if (r13 == 0) goto L_0x00fa
            if (r11 != r6) goto L_0x00ea
            float r0 = r14.getDimension(r10, r1)
            int r2 = (int) r0
        L_0x00c1:
            if (r12 == 0) goto L_0x00e5
            if (r8 != r6) goto L_0x00d5
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x00ca:
            int[] r1 = new int[r7]
            r1[r4] = r2
            r1[r5] = r0
        L_0x00d0:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r15, r1)
            goto L_0x0091
        L_0x00d5:
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x00e0
            int r0 = r14.getColor(r9, r4)
            goto L_0x00ca
        L_0x00e0:
            int r0 = r14.getInt(r9, r4)
            goto L_0x00ca
        L_0x00e5:
            int[] r1 = new int[r5]
            r1[r4] = r2
            goto L_0x00d0
        L_0x00ea:
            boolean r0 = A06(r11)
            if (r0 == 0) goto L_0x00f5
            int r2 = r14.getColor(r10, r4)
            goto L_0x00c1
        L_0x00f5:
            int r2 = r14.getInt(r10, r4)
            goto L_0x00c1
        L_0x00fa:
            if (r12 == 0) goto L_0x0055
            if (r8 != r6) goto L_0x0108
            float r0 = r14.getDimension(r9, r1)
            int r0 = (int) r0
        L_0x0103:
            int[] r1 = new int[r5]
            r1[r4] = r0
            goto L_0x00d0
        L_0x0108:
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x0113
            int r0 = r14.getColor(r9, r4)
            goto L_0x0103
        L_0x0113:
            int r0 = r14.getInt(r9, r4)
            goto L_0x0103
        L_0x0118:
            r3 = r0
            goto L_0x0073
        L_0x011b:
            r3 = 0
            goto L_0x011f
        L_0x011d:
            if (r16 != 0) goto L_0x002f
        L_0x011f:
            r2 = 1
            goto L_0x0030
        L_0x0122:
            r12 = 0
            r8 = 0
            goto L_0x001a
        L_0x0126:
            r13 = 0
            r11 = 0
            goto L_0x000f
        L_0x012a:
            java.lang.String r0 = " Can't morph from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016907z.A01(android.content.res.TypedArray, java.lang.String, int, int, int):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator A02(ValueAnimator valueAnimator, Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int resourceId;
        String string;
        PropertyValuesHolder propertyValuesHolder;
        boolean z2;
        int i2;
        int i3;
        ValueAnimator valueAnimator2 = valueAnimator;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A012 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A02);
        TypedArray A013 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A06);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j2 = (long) (!C014907d.A02("duration", xmlPullParser2) ? 300 : A012.getInt(1, 300));
        long j3 = (long) (!C014907d.A02("startOffset", xmlPullParser2) ? 0 : A012.getInt(2, 0));
        int i4 = !C014907d.A02("valueType", xmlPullParser2) ? 4 : A012.getInt(7, 4);
        if (C014907d.A02("valueFrom", xmlPullParser2) && C014907d.A02("valueTo", xmlPullParser2)) {
            if (i4 == 4) {
                TypedValue peekValue = A012.peekValue(5);
                boolean z3 = true;
                i4 = 0;
                if (peekValue != null) {
                    z2 = true;
                    i2 = peekValue.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                TypedValue peekValue2 = A012.peekValue(6);
                if (peekValue2 != null) {
                    i3 = peekValue2.type;
                } else {
                    z3 = false;
                    i3 = 0;
                }
                if ((z2 && A06(i2)) || (z3 && A06(i3))) {
                    i4 = 3;
                }
            }
            PropertyValuesHolder A014 = A01(A012, "", i4, 5, 6);
            if (A014 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{A014});
            }
        }
        valueAnimator2.setDuration(j2);
        valueAnimator2.setStartDelay(j3);
        valueAnimator2.setRepeatCount(!C014907d.A02("repeatCount", xmlPullParser2) ? 0 : A012.getInt(3, 0));
        valueAnimator2.setRepeatMode(!C014907d.A02("repeatMode", xmlPullParser2) ? 1 : A012.getInt(4, 1));
        if (A013 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (!C014907d.A02("pathData", xmlPullParser2) || (string = A013.getString(1)) == null) {
                objectAnimator.setPropertyName(!C014907d.A02("propertyName", xmlPullParser2) ? null : A013.getString(0));
            } else {
                String string2 = !C014907d.A02("propertyXName", xmlPullParser2) ? null : A013.getString(2);
                String string3 = !C014907d.A02("propertyYName", xmlPullParser2) ? null : A013.getString(3);
                if (string2 == null && string3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A013.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                Path A002 = C015107g.A00(string);
                float f2 = 1.0f * 0.5f;
                PathMeasure pathMeasure = new PathMeasure(A002, false);
                ArrayList arrayList = new ArrayList();
                float f3 = 0.0f;
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A002, false);
                int min = Math.min(100, ((int) (f4 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / ((float) (min - 1));
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i5 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f3 - ((Number) arrayList.get(i6)).floatValue(), fArr3, (float[]) null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f3 += f5;
                    int i7 = i6 + 1;
                    if (i7 < arrayList.size() && f3 > ((Number) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i6 = i7;
                    }
                    i5++;
                }
                PropertyValuesHolder ofFloat = string2 != null ? PropertyValuesHolder.ofFloat(string2, fArr) : null;
                if (string3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string3, fArr2);
                }
                objectAnimator.setValues(ofFloat == null ? new PropertyValuesHolder[]{propertyValuesHolder} : propertyValuesHolder == null ? new PropertyValuesHolder[]{ofFloat} : new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
            }
        }
        if (C014907d.A02("interpolator", xmlPullParser2) && (resourceId = A012.getResourceId(0, 0)) > 0) {
            valueAnimator2.setInterpolator(A03(context, resourceId));
        }
        A012.recycle();
        if (A013 != null) {
            A013.recycle();
        }
        return valueAnimator2;
    }

    public static Interpolator A03(Context context, int i2) {
        Resources.NotFoundException notFoundException;
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i2 == 17563663) {
            try {
                return new C018608r();
            } catch (XmlPullParserException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't load animation resource ID #0x");
                sb.append(Integer.toHexString(i2));
                notFoundException = new Resources.NotFoundException(sb.toString());
                notFoundException.initCause(e2);
            } catch (IOException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't load animation resource ID #0x");
                sb2.append(Integer.toHexString(i2));
                notFoundException = new Resources.NotFoundException(sb2.toString());
                notFoundException.initCause(e3);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i2 == 17563661) {
            return new C018508q();
        } else {
            if (i2 == 17563662) {
                return new C016007q();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i2);
            context.getResources();
            context.getTheme();
            int depth = animation.getDepth();
            Interpolator interpolator = null;
            while (true) {
                int next = animation.next();
                if (next != 3) {
                    if (next == 1) {
                        break;
                    } else if (next == 2) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(animation);
                        String name = animation.getName();
                        if (name.equals("linearInterpolator")) {
                            interpolator = new LinearInterpolator();
                        } else if (name.equals("accelerateInterpolator")) {
                            interpolator = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            interpolator = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            interpolator = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            interpolator = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            interpolator = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            interpolator = new C07060Yz(context, asAttributeSet, animation);
                        } else {
                            StringBuilder sb3 = new StringBuilder("Unknown interpolator name: ");
                            sb3.append(animation.getName());
                            throw new RuntimeException(sb3.toString());
                        }
                    } else {
                        continue;
                    }
                } else if (animation.getDepth() <= depth) {
                    break;
                }
            }
            animation.close();
            return interpolator;
        }
        throw notFoundException;
    }

    public static C016907z A04(Context context, int i2) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C016907z r2 = new C016907z(context);
            Drawable A042 = AnonymousClass00X.A04(context.getTheme(), context.getResources(), i2);
            r2.A00 = A042;
            A042.setCallback(r2.A06);
            r2.A04 = new AnonymousClass0AV(r2.A00.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    C016907z r0 = new C016907z(context);
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        }
    }

    public static void A05(AnimatedVectorDrawable animatedVectorDrawable, AnonymousClass03Y r2) {
        animatedVectorDrawable.registerAnimationCallback(r2.A00());
    }

    public static boolean A06(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public final void A07(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                A07(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                ArgbEvaluator argbEvaluator = this.A01;
                if (argbEvaluator == null) {
                    argbEvaluator = new ArgbEvaluator();
                    this.A01 = argbEvaluator;
                }
                objectAnimator.setEvaluator(argbEvaluator);
            }
        }
    }

    public void A08(AnonymousClass03Y r3) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            A05((AnimatedVectorDrawable) drawable, r3);
            return;
        }
        ArrayList arrayList = this.A05;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A05 = arrayList;
        }
        if (!arrayList.contains(r3)) {
            this.A05.add(r3);
            Animator.AnimatorListener animatorListener = this.A00;
            if (animatorListener == null) {
                animatorListener = new IDxLAdapterShape0S0100000_I0(this, 1);
                this.A00 = animatorListener;
            }
            this.A03.A00.addListener(animatorListener);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C018208n.A0E(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnonymousClass0AU r1 = this.A03;
        r1.A02.draw(canvas);
        if (r1.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A00(drawable) : this.A03.A02.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A02(drawable) : this.A03.A02.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new AnonymousClass0AV(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getIntrinsicHeight() : this.A03.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getIntrinsicWidth() : this.A03.A02.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getOpacity() : this.A03.A02.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        IllegalStateException th;
        Resources.NotFoundException notFoundException;
        Animator A002;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            C018208n.A05(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        int eventType = xmlPullParser2.getEventType();
        int depth = xmlPullParser2.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser2.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A00);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        AnonymousClass07V A012 = AnonymousClass07V.A01(theme2, resources2, resourceId);
                        A012.A04 = false;
                        A012.setCallback(this.A06);
                        AnonymousClass0AU r2 = this.A03;
                        AnonymousClass07V r1 = r2.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        r2.A02 = A012;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources2.obtainAttributes(attributeSet2, C014807c.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A02;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                A002 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources3 = context.getResources();
                                Resources.Theme theme3 = context.getTheme();
                                XmlResourceParser xmlResourceParser = null;
                                try {
                                    XmlResourceParser animation = resources3.getAnimation(resourceId2);
                                    A002 = A00((AnimatorSet) null, context, theme3, resources3, Xml.asAttributeSet(animation), animation, 0);
                                    if (animation != null) {
                                        animation.close();
                                    }
                                } catch (XmlPullParserException e2) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Can't load animation resource ID #0x");
                                    sb.append(Integer.toHexString(resourceId2));
                                    notFoundException = new Resources.NotFoundException(sb.toString());
                                    notFoundException.initCause(e2);
                                } catch (IOException e3) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Can't load animation resource ID #0x");
                                    sb2.append(Integer.toHexString(resourceId2));
                                    notFoundException = new Resources.NotFoundException(sb2.toString());
                                    notFoundException.initCause(e3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                        throw th;
                                    }
                                }
                            }
                            AnonymousClass0AU r12 = this.A03;
                            A002.setTarget(r12.A02.A03.A08.A0E.get(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                A07(A002);
                            }
                            ArrayList arrayList = r12.A03;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                r12.A03 = arrayList;
                                r12.A01 = new AnonymousClass00N();
                            }
                            arrayList.add(A002);
                            r12.A01.put(A002, string);
                        } else {
                            obtainAttributes.recycle();
                            th = new IllegalStateException("Context can't be null when inflating animators");
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser2.next();
        }
        AnonymousClass0AU r0 = this.A03;
        AnimatorSet animatorSet = r0.A00;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            r0.A00 = animatorSet;
        }
        animatorSet.playTogether(r0.A03);
        return;
        throw notFoundException;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A0F(drawable) : this.A03.A02.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.A00;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.A03.A00.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.isStateful() : this.A03.A02.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        drawable.setBounds(rect);
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        return drawable.setLevel(i2);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.setState(iArr) : this.A03.A02.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.A03.A02.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A0C(drawable, z2);
        } else {
            this.A03.A02.setAutoMirrored(z2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A03.A02.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A0A(drawable, i2);
        } else {
            this.A03.A02.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A04(colorStateList, drawable);
        } else {
            this.A03.A02.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A07(mode, drawable);
        } else {
            this.A03.A02.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.A03.A02.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    public void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnonymousClass0AU r1 = this.A03;
        if (!r1.A00.isStarted()) {
            r1.A00.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A03.A00.end();
        }
    }
}
