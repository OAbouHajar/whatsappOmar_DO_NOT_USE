package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4fG  reason: invalid class name and case insensitive filesystem */
public class C91034fG implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C57562rN A01;

    public C91034fG(RecyclerView recyclerView, C57562rN r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = AnonymousClass000.A03(valueAnimator);
        this.A00.invalidate();
    }
}
