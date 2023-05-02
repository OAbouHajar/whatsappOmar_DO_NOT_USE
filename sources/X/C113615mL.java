package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5mL  reason: invalid class name and case insensitive filesystem */
public class C113615mL extends C111045fF {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final C14710pd A03;
    public final C209712h A04;

    public C113615mL(View view, C14710pd r3, C209712h r4) {
        super(view);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = C13680ns.A0L(view, R.id.display_payment_amount);
        this.A00 = C004601z.A0E(view, R.id.payment_expressive_background_container);
        this.A01 = C13680ns.A0J(view, R.id.payment_expressive_background);
    }
}
