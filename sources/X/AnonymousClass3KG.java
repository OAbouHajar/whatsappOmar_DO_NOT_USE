package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: X.3KG  reason: invalid class name */
public class AnonymousClass3KG extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1W7 A01;
    public final /* synthetic */ C85234Nq A02;

    public AnonymousClass3KG(AnonymousClass1W7 r1, C85234Nq r2, long j2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = j2;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A02.A0D.remove(Long.valueOf(this.A00));
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass1W7 r0 = this.A01;
        Handler handler = r0.A00;
        if (handler == null) {
            handler = AnonymousClass000.A0L();
            r0.A00 = handler;
        }
        handler.post(r0.A01);
    }
}
