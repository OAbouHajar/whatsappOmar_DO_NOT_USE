package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;

/* renamed from: X.3kh  reason: invalid class name and case insensitive filesystem */
public class C71603kh extends C65123Sy {
    public final View A00;
    public final WaButton A01;
    public final C57242qY A02;

    public C71603kh(View view, C57242qY r4) {
        super(view);
        this.A00 = view;
        this.A02 = r4;
        WaButton waButton = (WaButton) C004601z.A0E(view, R.id.button_category_see_all);
        this.A01 = waButton;
        C13680ns.A1A(waButton, r4, 40);
    }
}
