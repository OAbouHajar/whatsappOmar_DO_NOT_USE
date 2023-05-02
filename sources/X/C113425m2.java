package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5m2  reason: invalid class name and case insensitive filesystem */
public class C113425m2 extends C111035fE {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public C113425m2(View view) {
        super(view);
        this.A01 = C13680ns.A0J(view, R.id.payout_bank_icon);
        this.A04 = C13680ns.A0L(view, R.id.payout_bank_name);
        this.A03 = C13680ns.A0L(view, R.id.payout_bank_status);
        this.A02 = C110115dX.A05(view, R.id.warning_container);
        this.A00 = (Button) C004601z.A0E(view, R.id.cta_button);
    }
}
