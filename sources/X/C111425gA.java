package X;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape242S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentIntegrityAppealActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.obwhatsapp.text.IDxWAdapterShape104S0100000_3_I1;

/* renamed from: X.5gA  reason: invalid class name and case insensitive filesystem */
public abstract class C111425gA extends C14530pL {
    public View A00;
    public Button A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C110685ef A07;

    public void A35() {
        this.A00 = findViewById(R.id.transaction_header);
        this.A06 = C13680ns.A0N(this, R.id.describe_problem_instructions);
        this.A02 = (EditText) findViewById(R.id.describe_problem_field);
        this.A04 = C13680ns.A0N(this, R.id.describe_problem_field_error);
        this.A01 = (Button) findViewById(R.id.contact_support_send_button);
        this.A05 = C13680ns.A0N(this, R.id.help_center_link);
        this.A03 = C13680ns.A0N(this, R.id.describe_contact_info);
        this.A00.setVisibility(8);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = this instanceof BrazilPaymentReportPaymentActivity;
        String string = getResources().getString(z2 ? R.string.str141c : this instanceof BrazilPaymentDPOActivity ? R.string.str1462 : ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) ? R.string.str0593 : R.string.str055f);
        this.A06.setText(i2 >= 24 ? Html.fromHtml(string, 63) : Html.fromHtml(string));
        this.A02.setHint(z2 ? R.string.str141e : this instanceof BrazilPaymentDPOActivity ? R.string.str1464 : R.string.str059f);
        this.A02.addTextChangedListener(new IDxWAdapterShape104S0100000_3_I1(this, 0));
        this.A02.setOnFocusChangeListener(new IDxCListenerShape242S0100000_3_I1(this, 0));
        this.A01.setText((z2 || (this instanceof BrazilPaymentDPOActivity)) ? R.string.str170e : R.string.str14e6);
        C110105dW.A0r(this.A01, this, 13);
        C110105dW.A0r(this.A05, this, 14);
    }

    public void A36() {
        C110685ef r0;
        if (this instanceof BrazilPaymentReportPaymentActivity) {
            r0 = ((BrazilPaymentReportPaymentActivity) this).A00;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            r0 = ((BrazilPaymentDPOActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportP2pActivity) {
            r0 = ((BrazilPaymentContactSupportP2pActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportActivity) {
            BrazilPaymentContactSupportActivity brazilPaymentContactSupportActivity = (BrazilPaymentContactSupportActivity) this;
            r0 = brazilPaymentContactSupportActivity instanceof BrazilPaymentIntegrityAppealActivity ? ((BrazilPaymentIntegrityAppealActivity) brazilPaymentContactSupportActivity).A00 : brazilPaymentContactSupportActivity.A00;
        } else {
            r0 = ((BrazilPaymentContactOmbudsmanActivity) this).A00;
        }
        this.A07 = r0;
        AnonymousClass00B.A06(r0.A01.A01());
        C110105dW.A0x(this, this.A07.A01, 9);
        C110105dW.A0x(this, this.A07.A09, 10);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout014c);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0B(this instanceof BrazilPaymentReportPaymentActivity ? R.string.str141b : this instanceof BrazilPaymentDPOActivity ? R.string.str145d : ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) ? R.string.str0592 : R.string.str055e);
        }
        A36();
        A35();
        if (getIntent() != null) {
            this.A07.A0A(getIntent().getStringExtra("extra_transaction_id"));
        }
        C110685ef r2 = this.A07;
        AnonymousClass2St A0N = C110105dW.A0N();
        A0N.A01("product_flow", "p2m");
        A0N.A00(r2.A06);
        r2.A07.AKU(A0N, C13680ns.A0X(), (Integer) null, r2.A06(), (String) null);
    }
}
