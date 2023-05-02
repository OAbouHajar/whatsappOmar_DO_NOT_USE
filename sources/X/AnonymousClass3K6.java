package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3K6  reason: invalid class name */
public class AnonymousClass3K6 extends Animator implements Animator.AnimatorListener {
    public ArrayList A00;
    public final Animator A01;

    public AnonymousClass3K6(Animator animator) {
        this.A01 = animator;
        animator.addListener(this);
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A0u();
            this.A00 = arrayList;
        }
        arrayList.add(animatorListener);
    }

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
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

    public TimeInterpolator getInterpolator() {
        return this.A01.getInterpolator();
    }

    public ArrayList getListeners() {
        return this.A00;
    }

    public long getStartDelay() {
        return this.A01.getStartDelay();
    }

    public boolean isPaused() {
        return this.A01.isPaused();
    }

    public boolean isRunning() {
        return this.A01.isRunning();
    }

    public boolean isStarted() {
        return this.A01.isStarted();
    }

    public void onAnimationCancel(Animator animator) {
        Iterator it = ((AbstractCollection) this.A00.clone()).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
    }

    public void onAnimationEnd(Animator animator) {
        Iterator it = ((AbstractCollection) this.A00.clone()).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        Iterator it = ((AbstractCollection) this.A00.clone()).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
        }
    }

    public void onAnimationStart(Animator animator) {
        Iterator it = ((AbstractCollection) this.A00.clone()).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationStart(this);
        }
    }

    public void pause() {
    }

    public void removeAllListeners() {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            arrayList.clear();
            this.A00 = null;
        }
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
            if (this.A00.isEmpty()) {
                this.A00 = null;
            }
        }
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
    }

    public void resume() {
    }

    public Animator setDuration(long j2) {
        this.A01.setDuration(j2);
        return this;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.A01.setInterpolator(timeInterpolator);
    }

    public void setStartDelay(long j2) {
        this.A01.setStartDelay(j2);
    }

    public void setTarget(Object obj) {
        this.A01.setTarget(obj);
    }

    public void setupEndValues() {
        this.A01.setupEndValues();
    }

    public void setupStartValues() {
        this.A01.setupStartValues();
    }

    public void start() {
        this.A01.start();
    }
}
