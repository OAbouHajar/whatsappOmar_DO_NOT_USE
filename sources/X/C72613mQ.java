package X;

import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3mQ  reason: invalid class name and case insensitive filesystem */
public class C72613mQ extends C72823ml {
    public final FrameLayout A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final C17180uf A03;

    public C72613mQ(View view, C17180uf r3) {
        super(view);
        this.A03 = r3;
        this.A02 = C13680ns.A0S(view, R.id.category_name);
        this.A01 = C13690nt.A0R(view, R.id.category_icon);
        this.A00 = (FrameLayout) C004601z.A0E(view, R.id.category_layout);
    }
}
