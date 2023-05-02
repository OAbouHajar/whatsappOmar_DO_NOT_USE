package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import org.apache.commons.io.IOUtils;

/* renamed from: X.2g5  reason: invalid class name and case insensitive filesystem */
public class C53672g5 {
    public int A00 = 0;
    public int A01 = 1;
    public long A02 = 0;
    public long A03 = 300;
    public TimeInterpolator A04 = null;

    public C53672g5(long j2) {
        this.A02 = j2;
        this.A03 = 150;
    }

    public C53672g5(TimeInterpolator timeInterpolator, long j2, long j3) {
        this.A02 = j2;
        this.A03 = j3;
        this.A04 = timeInterpolator;
    }

    public void A00(Animator animator) {
        animator.setStartDelay(this.A02);
        animator.setDuration(this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C53572fv.A02;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.A00);
            valueAnimator.setRepeatMode(this.A01);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C53672g5 r7 = (C53672g5) obj;
            if (this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01) {
                TimeInterpolator timeInterpolator = this.A04;
                if (timeInterpolator == null) {
                    timeInterpolator = C53572fv.A02;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = r7.A04;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = C53572fv.A02;
                }
                return cls.equals(timeInterpolator2.getClass());
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A02;
        long j3 = this.A03;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C53572fv.A02;
        }
        return ((((i2 + timeInterpolator.getClass().hashCode()) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.A02);
        sb.append(" duration: ");
        sb.append(this.A03);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C53572fv.A02;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.A00);
        sb.append(" repeatMode: ");
        sb.append(this.A01);
        sb.append("}\n");
        return sb.toString();
    }
}
