package X;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5mH  reason: invalid class name and case insensitive filesystem */
public class C113575mH extends C111045fF {
    public Space A00;
    public TextView A01;
    public TextView A02;

    public C113575mH(View view) {
        super(view);
        this.A01 = C13680ns.A0L(view, R.id.payment_amount_header);
        this.A02 = C13680ns.A0L(view, R.id.payment_amount_text);
        this.A00 = (Space) C004601z.A0E(view, R.id.space);
    }
}
