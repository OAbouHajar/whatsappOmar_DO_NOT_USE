package X;

import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.3tb  reason: invalid class name and case insensitive filesystem */
public class C76243tb extends C55982kl {
    public final View A00 = C004601z.A0E(this.A0H, R.id.search_no_matches);

    public C76243tb(View view) {
        super(view);
    }

    public void A0D(Boolean bool) {
        View view;
        int dimensionPixelSize;
        if (bool == null || bool.booleanValue()) {
            view = this.A0H;
            dimensionPixelSize = C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen06cb);
        } else {
            view = this.A0H;
            dimensionPixelSize = C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen06ca) - C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen06b3);
        }
        this.A00.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom());
    }
}
