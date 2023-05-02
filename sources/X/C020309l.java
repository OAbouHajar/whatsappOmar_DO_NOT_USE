package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.09l  reason: invalid class name and case insensitive filesystem */
public class C020309l extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0GE A01;

    public C020309l(View view, AnonymousClass0GE r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        C004601z.A0i(this.A00, (Rect) null);
    }
}
