package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5mJ  reason: invalid class name and case insensitive filesystem */
public class C113595mJ extends C111045fF {
    public ImageView A00;
    public LinearLayout A01;
    public TextView A02;

    public C113595mJ(View view) {
        super(view);
        this.A01 = (LinearLayout) view.findViewById(R.id.payment_support_container);
        this.A00 = C13680ns.A0K(view, R.id.payment_support_icon);
        this.A02 = C13680ns.A0M(view, R.id.payment_support_title);
    }
}
