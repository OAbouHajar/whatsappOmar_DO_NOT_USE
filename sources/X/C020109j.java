package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;

/* renamed from: X.09j  reason: invalid class name and case insensitive filesystem */
public class C020109j extends Animator {
    public final int A00;
    public final AnimatorSet A01;

    public C020109j(int i2, Animator animator) {
        this.A00 = i2;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        if (i2 > 0 || i2 == -1) {
            animatorSet.play(animator);
            animatorSet.addListener(new AnonymousClass09t(this));
        }
    }

    public void cancel() {
        this.A01.cancel();
    }

    public void end() {
        this.A01.end();
    }

    public long getDuration() {
        return this.A01.getDuration();
    }

    public long getStartDelay() {
        return this.A01.getStartDelay();
    }

    public boolean isRunning() {
        return this.A01.isRunning();
    }

    public void pause() {
        this.A01.pause();
    }

    public void resume() {
        this.A01.resume();
    }

    public Animator setDuration(long j2) {
        return this.A01.setDuration(j2);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.A01.setInterpolator(timeInterpolator);
    }

    public void setStartDelay(long j2) {
        this.A01.setStartDelay(j2);
    }

    public void start() {
        this.A01.start();
    }
}
