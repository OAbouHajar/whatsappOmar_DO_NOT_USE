package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.redex.IDxLAdapterShape1S0100000_I1;
import com.facebook.redex.IDxPropertyShape1S0000000_I1;

/* renamed from: X.0CE  reason: invalid class name */
public class AnonymousClass0CE extends FrameLayout {
    public static final Property A06;
    public static final Property A07;
    public static final Interpolator A08 = C04240Lt.A00(0.17f, 0.17f, 0.0f, 1.0f);
    public AnonymousClass0KW A00 = AnonymousClass0KW.DEFAULT;
    public final Animator.AnimatorListener A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;

    static {
        Class cls = Float.TYPE;
        A07 = new IDxPropertyShape1S0000000_I1(cls, 4);
        A06 = new IDxPropertyShape1S0000000_I1(cls, 5);
    }

    public AnonymousClass0CE(Context context) {
        super(context);
        IDxLAdapterShape1S0100000_I1 iDxLAdapterShape1S0100000_I1 = new IDxLAdapterShape1S0100000_I1(this, 1);
        this.A01 = iDxLAdapterShape1S0100000_I1;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A08;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(iDxLAdapterShape1S0100000_I1);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(iDxLAdapterShape1S0100000_I1);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
        A01();
    }

    public static boolean A00(Context context) {
        return 1 == context.getResources().getConfiguration().getLayoutDirection();
    }

    public final void A01() {
        A02(280, 200);
        Context context = getContext();
        boolean A002 = (Build.VERSION.SDK_INT < 17 || (context.getApplicationInfo().flags & 4194304) == 0) ? false : A00(context);
        ObjectAnimator objectAnimator = this.A04;
        float f2 = -1.0f;
        if (objectAnimator != null) {
            objectAnimator.setProperty(A07);
            float[] fArr = new float[2];
            float f3 = 1.0f;
            if (A002) {
                f3 = -1.0f;
            }
            fArr[0] = f3;
            fArr[1] = 0.0f;
            objectAnimator.setFloatValues(fArr);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setProperty(A07);
            float[] fArr2 = new float[2];
            fArr2[0] = 0.0f;
            float f4 = -1.0f;
            if (A002) {
                f4 = 1.0f;
            }
            fArr2[1] = f4;
            objectAnimator2.setFloatValues(fArr2);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setProperty(A07);
            float[] fArr3 = new float[2];
            float f5 = -1.0f;
            if (A002) {
                f5 = 1.0f;
            }
            fArr3[0] = f5;
            fArr3[1] = 0.0f;
            objectAnimator3.setFloatValues(fArr3);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setProperty(A07);
            float[] fArr4 = new float[2];
            fArr4[0] = 0.0f;
            if (!A002) {
                f2 = 1.0f;
            }
            fArr4[1] = f2;
            objectAnimator4.setFloatValues(fArr4);
        }
    }

    public final void A02(long j2, long j3) {
        ObjectAnimator objectAnimator = this.A04;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j2);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j3);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j2);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j3);
        }
    }

    public final void A03(View view, AnonymousClass0KW r10, boolean z2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (!(r10 == null || this.A00 == r10)) {
            switch (r10.ordinal()) {
                case 1:
                    A02(250, 250);
                    ObjectAnimator objectAnimator3 = this.A04;
                    if (objectAnimator3 != null) {
                        objectAnimator3.setProperty(A06);
                        objectAnimator3.setFloatValues(new float[]{0.0f, 1.0f});
                    }
                    ObjectAnimator objectAnimator4 = this.A05;
                    if (objectAnimator4 != null) {
                        objectAnimator4.setProperty(A06);
                        objectAnimator4.setFloatValues(new float[]{1.0f, 0.0f});
                    }
                    ObjectAnimator objectAnimator5 = this.A02;
                    if (objectAnimator5 != null) {
                        objectAnimator5.setProperty(A06);
                        objectAnimator5.setFloatValues(new float[]{0.0f, 1.0f});
                    }
                    ObjectAnimator objectAnimator6 = this.A03;
                    if (objectAnimator6 != null) {
                        objectAnimator6.setProperty(A06);
                        objectAnimator6.setFloatValues(new float[]{1.0f, 0.0f});
                        break;
                    }
                    break;
                case 2:
                    A02(0, 0);
                    break;
                default:
                    A01();
                    break;
            }
            this.A00 = r10;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        addView(view, new ViewGroup.LayoutParams(-1, -1));
        int childCount = getChildCount();
        if (z2) {
            objectAnimator = this.A04;
            objectAnimator2 = this.A05;
        } else {
            objectAnimator = this.A02;
            objectAnimator2 = this.A03;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == view) {
                childAt.setVisibility(0);
                if (childCount > 1 && objectAnimator != null) {
                    if (objectAnimator.isStarted()) {
                        objectAnimator.cancel();
                    }
                    objectAnimator.setTarget(childAt);
                    objectAnimator.start();
                }
            } else if (childAt.getVisibility() == 0) {
                if (objectAnimator2 != null) {
                    if (objectAnimator2.isStarted()) {
                        objectAnimator2.cancel();
                    }
                    objectAnimator2.setTarget(childAt);
                    objectAnimator2.start();
                } else {
                    removeView(childAt);
                }
            }
        }
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }
}
