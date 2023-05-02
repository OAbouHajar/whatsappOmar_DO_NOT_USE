package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.5fA  reason: invalid class name and case insensitive filesystem */
public class C110995fA extends C005602k {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final C50262Yq A04;

    public C110995fA(View view, C50262Yq r3) {
        super(view);
        this.A00 = C13690nt.A0R(view, R.id.item_thumbnail);
        this.A03 = C13680ns.A0S(view, R.id.item_title);
        this.A02 = C13680ns.A0S(view, R.id.item_quantity);
        this.A01 = C13680ns.A0S(view, R.id.item_price);
        this.A04 = r3;
    }
}
