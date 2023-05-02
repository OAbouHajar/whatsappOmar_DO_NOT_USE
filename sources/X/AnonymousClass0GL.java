package X;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

/* renamed from: X.0GL  reason: invalid class name */
public class AnonymousClass0GL extends C019409a {
    public View A00;
    public C13060lP A01;

    public AnonymousClass0GL(View view, C13060lP r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public void AZC(C015707n r4) {
        r4.A09(this);
        View view = this.A00;
        if (Build.VERSION.SDK_INT == 28) {
            C07790cT.A02(view);
        } else {
            C02430Bw r1 = (C02430Bw) view.getTag(R.id.ghost_view);
            if (r1 != null) {
                int i2 = r1.A00 - 1;
                r1.A00 = i2;
                if (i2 <= 0) {
                    ((FrameLayout) r1.getParent()).removeView(r1);
                }
            }
        }
        view.setTag(R.id.transition_transform, (Object) null);
        view.setTag(R.id.parent_matrix, (Object) null);
    }

    public void AZD(C015707n r3) {
        this.A01.setVisibility(4);
    }

    public void AZE(C015707n r3) {
        this.A01.setVisibility(0);
    }
}
