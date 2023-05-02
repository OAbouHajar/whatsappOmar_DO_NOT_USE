package X;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObjectShape31S0000000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0V7  reason: invalid class name */
public abstract class AnonymousClass0V7 {
    public static final Interpolator A01 = new IDxObjectShape31S0000000_I1(1);
    public static final Interpolator A02 = new IDxObjectShape31S0000000_I1(2);
    public int A00 = -1;

    public final int A00(C005602k r6, RecyclerView recyclerView) {
        int A012 = A01(r6, recyclerView);
        int A06 = C004601z.A06(recyclerView);
        int i2 = A012 & 3158064;
        if (i2 == 0) {
            return A012;
        }
        int i3 = A012 & (i2 ^ -1);
        if (A06 != 0) {
            int i4 = i2 >> 1;
            i3 |= -3158065 & i4;
            i2 = i4 & 3158064;
        }
        return i3 | (i2 >> 2);
    }

    public abstract int A01(C005602k r1, RecyclerView recyclerView);

    public int A02(RecyclerView recyclerView, int i2, int i3, long j2) {
        int i4 = this.A00;
        if (i4 == -1) {
            i4 = recyclerView.getResources().getDimensionPixelSize(R.dimen.dimen049e);
            this.A00 = i4;
        }
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i3)) * i4)) * A02.getInterpolation(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / ((float) i2))));
        if (j2 <= 2000) {
            f2 = ((float) j2) / 2000.0f;
        }
        int interpolation = (int) (((float) signum) * A01.getInterpolation(f2));
        return interpolation == 0 ? i3 > 0 ? 1 : -1 : interpolation;
    }

    public void A03(C005602k r1, int i2) {
    }

    public boolean A04() {
        return true;
    }

    public boolean A05() {
        return true;
    }

    public boolean A06(C005602k r2, C005602k r3, RecyclerView recyclerView) {
        return true;
    }

    public abstract boolean A07(C005602k r1, C005602k r2, RecyclerView recyclerView);
}
