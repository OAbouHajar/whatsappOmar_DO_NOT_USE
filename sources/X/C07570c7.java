package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0c7  reason: invalid class name and case insensitive filesystem */
public class C07570c7 implements C12470kS {
    public final /* synthetic */ RecyclerView A00;

    public C07570c7(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void ASb(View view) {
        C005602k A01 = RecyclerView.A01(view);
        if (A01 != null) {
            RecyclerView recyclerView = this.A00;
            int i2 = A01.A07;
            if (recyclerView.A09 > 0) {
                A01.A04 = i2;
                recyclerView.A15.add(A01);
            } else {
                C004601z.A0d(A01.A0H, i2);
            }
            A01.A07 = 0;
        }
    }
}
