package X;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.396  reason: invalid class name */
public class AnonymousClass396 {
    public final Set A00 = C13680ns.A0o();
    public final Set A01 = C13680ns.A0o();

    public void A00(int i2) {
        this.A00.add(Integer.valueOf(i2));
    }

    public void A01(Activity activity, Menu menu) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < menu.size(); i5++) {
            MenuItem item = menu.getItem(i5);
            if (item.isVisible()) {
                if (C13690nt.A1V(this.A00, item.getItemId())) {
                    i3++;
                    item.setShowAsAction(0);
                } else {
                    i4++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.dimen000e);
        int min = (Math.min(C13690nt.A0J(activity).getWidth(), C13690nt.A0J(activity).getHeight()) - (dimensionPixelSize << 1)) - (activity.getResources().getDimensionPixelSize(R.dimen.cancel_button_image_alpha) << 1);
        if (i3 > 0) {
            i2 = activity.getResources().getDimensionPixelSize(R.dimen.dimen000f);
        }
        int i6 = min - i2;
        if (i6 < i4 * dimensionPixelSize) {
            if (i3 == 0) {
                i6 -= activity.getResources().getDimensionPixelSize(R.dimen.dimen000f);
            }
            int i7 = i4 - (i6 / dimensionPixelSize);
            if (i7 > 1 || i3 > 0) {
                for (int size = menu.size() - 1; size >= 0 && i7 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !C13690nt.A1V(this.A00, item2.getItemId()) && !C13690nt.A1V(this.A01, item2.getItemId())) {
                        item2.setShowAsAction(1);
                        i7--;
                    }
                }
            }
        }
    }
}
