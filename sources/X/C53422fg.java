package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.2fg  reason: invalid class name and case insensitive filesystem */
public class C53422fg {
    public final AnonymousClass00O A00 = new AnonymousClass00O();

    public static C53422fg A00(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return A02(arrayList);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i2));
            Log.w("MotionSpec", sb.toString(), e2);
            return null;
        }
    }

    public static C53422fg A01(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }

    public static C53422fg A02(List list) {
        C53422fg r5 = new C53422fg();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Animator animator = (Animator) list.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C53572fv.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C53572fv.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C53572fv.A04;
                }
                C53672g5 r6 = new C53672g5(interpolator, startDelay, duration);
                r6.A00 = objectAnimator.getRepeatCount();
                r6.A01 = objectAnimator.getRepeatMode();
                r5.A00.put(propertyName, r6);
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return r5;
    }

    public C53672g5 A03(String str) {
        AnonymousClass00O r1 = this.A00;
        if (r1.get(str) != null) {
            return (C53672g5) r1.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C53422fg) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.A00);
        sb.append("}\n");
        return sb.toString();
    }
}
