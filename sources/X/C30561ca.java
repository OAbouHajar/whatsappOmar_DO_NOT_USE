package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
public class C30561ca extends C30551cZ {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ RunnableRunnableShape0S0400000_I0 A01;
    public final /* synthetic */ String A02;

    public C30561ca(TextView textView, RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0, String str) {
        this.A01 = runnableRunnableShape0S0400000_I0;
        this.A00 = textView;
        this.A02 = str;
    }

    public void onAnimationEnd(Animation animation) {
        TextView textView = this.A00;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
        textView.setText(this.A02);
        textView.clearAnimation();
        ((C30511cT) this.A01.A01).A0I = true;
    }
}
