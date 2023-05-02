package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape220S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.3SI  reason: invalid class name */
public class AnonymousClass3SI extends C005602k {
    public C84334Kd A00;
    public final RadioButton A01;
    public final TextView A02;

    public AnonymousClass3SI(View view) {
        super(view);
        this.A02 = C13680ns.A0L(view, R.id.question);
        RadioButton radioButton = (RadioButton) C004601z.A0E(view, R.id.radio);
        this.A01 = radioButton;
        radioButton.setOnCheckedChangeListener(new IDxCListenerShape220S0100000_2_I1(this, 2));
        C13680ns.A17(this.A02, this, 45);
    }
}
