package X;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
public class C05260Px {
    public int A00 = 0;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = -1;
    public Interpolator A05 = null;
    public boolean A06 = false;

    public void A00(RecyclerView recyclerView) {
        String str;
        int i2 = this.A04;
        if (i2 >= 0) {
            this.A04 = -1;
            recyclerView.A0X(i2);
        } else if (this.A06) {
            Interpolator interpolator = this.A05;
            if (interpolator == null || this.A01 >= 1) {
                int i3 = this.A01;
                if (i3 >= 1) {
                    if (interpolator == null) {
                        recyclerView.A0z.A01(RecyclerView.A1B, this.A02, this.A03, i3);
                    } else {
                        recyclerView.A0z.A01(interpolator, this.A02, this.A03, i3);
                    }
                    int i4 = this.A00 + 1;
                    this.A00 = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                } else {
                    str = "Scroll duration must be a positive number";
                }
            } else {
                str = "If you provide an interpolator, you must set a positive duration";
            }
            throw AnonymousClass000.A0V(str);
        } else {
            this.A00 = 0;
            return;
        }
        this.A06 = false;
    }
}
