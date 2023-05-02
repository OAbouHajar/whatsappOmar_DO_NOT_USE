package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5m1  reason: invalid class name and case insensitive filesystem */
public class C113415m1 extends C111035fE {
    public Button A00;
    public ImageView A01;
    public TextView A02;

    public C113415m1(View view) {
        super(view);
        this.A01 = C13680ns.A0J(view, R.id.warning_icon);
        this.A02 = C13680ns.A0L(view, R.id.warning_message);
        this.A00 = (Button) C004601z.A0E(view, R.id.cta_button);
    }
}
