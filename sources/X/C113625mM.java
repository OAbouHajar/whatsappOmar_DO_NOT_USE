package X;

import android.view.View;
import android.widget.Button;
import com.obwhatsapp.R;

/* renamed from: X.5mM  reason: invalid class name and case insensitive filesystem */
public class C113625mM extends C111045fF {
    public final View A00;
    public final Button A01;
    public final Button A02;
    public final Button A03;
    public final C228019i A04;

    public C113625mM(View view, C228019i r3) {
        super(view);
        this.A04 = r3;
        this.A02 = (Button) C004601z.A0E(view, R.id.request_cancel_button);
        this.A03 = (Button) C004601z.A0E(view, R.id.retry_withdrawal_button);
        this.A01 = (Button) C004601z.A0E(view, R.id.accept_payment_button);
        this.A00 = C004601z.A0E(view, R.id.button_group_view);
    }
}
