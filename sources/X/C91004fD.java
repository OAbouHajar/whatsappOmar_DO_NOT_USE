package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;

/* renamed from: X.4fD  reason: invalid class name and case insensitive filesystem */
public class C91004fD implements LayoutTransition.TransitionListener {
    public final /* synthetic */ LayoutTransition A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;

    public C91004fD(LayoutTransition layoutTransition, View view, ViewGroup viewGroup) {
        this.A01 = view;
        this.A00 = layoutTransition;
        this.A02 = viewGroup;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
        if (view == this.A01) {
            this.A00.removeTransitionListener(this);
            ViewGroup viewGroup2 = this.A02;
            viewGroup2.postDelayed(new RunnableRunnableShape19S0100000_I1_2(viewGroup2, 6), 100);
        }
    }

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
    }
}
