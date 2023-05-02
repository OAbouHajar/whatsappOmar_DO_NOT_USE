package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;

/* renamed from: X.2rU  reason: invalid class name and case insensitive filesystem */
public class C57632rU extends AnonymousClass071 {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final C57562rN A03;
    public final boolean A04;

    public C57632rU(C57562rN r3, boolean z2) {
        this.A03 = r3;
        r3.A01 = this;
        this.A02 = AnonymousClass000.A1O((r3.A00 > 0.0f ? 1 : (r3.A00 == 0.0f ? 0 : -1)));
        this.A04 = z2;
        if (z2) {
            r3.A00 = 1.0f;
        }
    }

    public void A01(RecyclerView recyclerView, int i2) {
        if (this.A04) {
            return;
        }
        if (i2 == 0) {
            RunnableRunnableShape12S0200000_I1 runnableRunnableShape12S0200000_I1 = new RunnableRunnableShape12S0200000_I1(this, 27, recyclerView);
            this.A01 = runnableRunnableShape12S0200000_I1;
            recyclerView.postDelayed(runnableRunnableShape12S0200000_I1, 1500);
            return;
        }
        recyclerView.removeCallbacks(this.A01);
        if (!this.A02) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A00.cancel();
            }
            C57562rN r1 = this.A03;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{r1.A00, 1.0f});
            ofFloat.addUpdateListener(new C91034fG(recyclerView, r1));
            ofFloat.setDuration(200);
            ofFloat.start();
            this.A02 = true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C57632rU r4 = (C57632rU) obj;
            if (this.A04 == r4.A04) {
                return this.A03.equals(r4.A03);
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A03;
        return AnonymousClass000.A0F(Boolean.valueOf(this.A04), A1Z, 1);
    }
}
