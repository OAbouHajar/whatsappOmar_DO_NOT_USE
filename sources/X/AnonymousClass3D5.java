package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.R;

/* renamed from: X.3D5  reason: invalid class name */
public class AnonymousClass3D5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass33c A00;

    public AnonymousClass3D5(AnonymousClass33c r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass33c r5 = this.A00;
        ViewPager viewPager = r5.A0A;
        int height = viewPager.getHeight();
        int width = viewPager.getWidth();
        if (!(height == 0 || width == 0 || (r5.A01 == width && r5.A00 == height))) {
            r5.A01 = width;
            r5.A00 = height;
            for (AnonymousClass3GL r2 : r5.A0I) {
                if (r2 != null) {
                    r2.A02(r5.A01, r5.A00);
                }
            }
        }
        int width2 = ((View) viewPager.getParent()).getWidth();
        if (width2 != r5.A02) {
            r5.A02 = width2;
            AnonymousClass3GN r6 = r5.A0e;
            if (r6 != null) {
                int dimensionPixelSize = C13680ns.A0D(r6.A08).getDimensionPixelSize(R.dimen.dimen07b1);
                boolean A1Z = C13680ns.A1Z(r6.A0B);
                RecyclerView recyclerView = r6.A0A;
                int i2 = ((width2 / 9) - dimensionPixelSize) >> 1;
                if (A1Z) {
                    recyclerView.setPadding(i2, 0, 0, 0);
                } else {
                    recyclerView.setPadding(0, 0, i2, 0);
                }
            }
        }
    }
}
