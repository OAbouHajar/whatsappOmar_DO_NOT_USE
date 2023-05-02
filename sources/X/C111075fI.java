package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;

/* renamed from: X.5fI  reason: invalid class name and case insensitive filesystem */
public class C111075fI extends C005602k implements View.OnClickListener {
    public final ImageView A00;
    public final RadioButton A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C116165qv A05;

    public C111075fI(View view, C116165qv r3) {
        super(view);
        this.A00 = C13680ns.A0J(view, R.id.provider_icon);
        this.A03 = C13680ns.A0L(view, R.id.account_number);
        this.A02 = C13680ns.A0L(view, R.id.account_name);
        this.A04 = C13680ns.A0L(view, R.id.account_type);
        this.A01 = (RadioButton) C004601z.A0E(view, R.id.radio_button);
        this.A05 = r3;
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        C116165qv r1 = this.A05;
        int i2 = this.A06;
        if (i2 == -1) {
            i2 = this.A05;
        }
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = r1.A00;
        if (!indiaUpiBankAccountPickerActivity.A0W && (!((C117485t4) indiaUpiBankAccountPickerActivity.A0T.get(i2)).A05)) {
            if (indiaUpiBankAccountPickerActivity.A0T.size() == 1) {
                indiaUpiBankAccountPickerActivity.A3T();
                return;
            }
            ((C117485t4) indiaUpiBankAccountPickerActivity.A0T.get(indiaUpiBankAccountPickerActivity.A01)).A00 = false;
            ((C117485t4) indiaUpiBankAccountPickerActivity.A0T.get(i2)).A00 = true;
            AnonymousClass01X r12 = indiaUpiBankAccountPickerActivity.A0B.A0N;
            if (r12 != null) {
                r12.A02(indiaUpiBankAccountPickerActivity.A01);
                indiaUpiBankAccountPickerActivity.A01 = i2;
                indiaUpiBankAccountPickerActivity.A0B.A0N.A02(i2);
            }
        }
    }
}
