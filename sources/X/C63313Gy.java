package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.redex.IDxUListenerShape11S0101000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.3Gy  reason: invalid class name and case insensitive filesystem */
public class C63313Gy implements AnonymousClass5QM {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public C63313Gy(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public final void A00(boolean z2, boolean z3) {
        int measuredHeight = this.A01.getMeasuredHeight();
        if (this.A01.getVisibility() != 0) {
            this.A01.measure(View.MeasureSpec.makeMeasureSpec(this.A00.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = this.A02;
        AnimatorSet animatorSet = statusesFragment.A01;
        if (animatorSet == null || (!animatorSet.isRunning() && !statusesFragment.A01.isStarted())) {
            statusesFragment.A01 = new AnimatorSet();
            int i2 = 8;
            float f2 = 100.0f;
            float f3 = 0.0f;
            if (z2) {
                i2 = 0;
                f3 = 100.0f;
                f2 = 0.0f;
            }
            int i3 = 1;
            if (z3) {
                i3 = 500;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, f2});
            ofFloat.setDuration((long) i3);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new IDxUListenerShape11S0101000_2_I1(this, measuredHeight));
            ofFloat.addListener(new AnonymousClass3KH(this, i2, z2));
            statusesFragment.A01.playSequentially(new Animator[]{ofFloat});
            C13690nt.A0o(statusesFragment.A01, this, 14);
            if (z2) {
                statusesFragment.A01.setStartDelay(700);
            }
            statusesFragment.A01.start();
        }
    }

    public View AGx(Context context, View view, ViewGroup viewGroup, AnonymousClass2Ao r7, List list, List list2, List list3, List list4, boolean z2) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(R.id.status_sharing_row_view);
        } else {
            View A0H = C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout057d);
            this.A00 = A0H;
            StatusesFragment statusesFragment = this.A02;
            C13700nu.A0R(A0H, statusesFragment, R.string.str1614);
            AnonymousClass2JP.A03(this.A00, R.string.str1614);
            C13680ns.A19(this.A00, this, 29);
            C13680ns.A19(this.A00.findViewById(R.id.status_row_share_to_third_party_button), this, 30);
            this.A01 = this.A00.findViewById(R.id.status_sharing_row_view);
            C49892Wl r1 = statusesFragment.A0k;
            r1.A00 = new C83934Ip(viewGroup, this);
            C83954Ir r0 = r1.A04;
            A00(r0.A00, r0.A01);
        }
        return this.A00;
    }
}
