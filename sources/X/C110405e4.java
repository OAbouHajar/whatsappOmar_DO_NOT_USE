package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.obwhatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.5e4  reason: invalid class name and case insensitive filesystem */
public class C110405e4 extends LinearLayout implements View.OnClickListener, AnonymousClass006 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C15900s5 A05;
    public AnonymousClass013 A06;
    public C14710pd A07;
    public C35301lh A08;
    public AnonymousClass683 A09;
    public C52662eE A0A;
    public boolean A0B;

    public C110405e4(Context context) {
        super(context);
        if (!this.A0B) {
            this.A0B = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A05 = (C15900s5) A002.ALm.get();
            this.A07 = C16150sX.A0k(A002);
            this.A06 = C16150sX.A0Z(A002);
        }
        LayoutInflater.from(context).inflate(R.layout.layout0344, this);
        int A003 = AnonymousClass00T.A00(context, R.color.color070f);
        C110105dW.A0q(this, R.id.change_icon, A003);
        C110105dW.A0q(this, R.id.reset_icon, A003);
        C110105dW.A0q(this, R.id.switch_payment_provider_icon, A003);
    }

    public void A00() {
        this.A08 = C110105dW.A0J(C110105dW.A0L(), Boolean.class, Boolean.TRUE, "isPinSet");
        this.A04.setText(R.string.str090e);
        this.A00.setVisibility(0);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public void onClick(View view) {
        Intent A022;
        int i2;
        if (view.getId() == R.id.reset_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A09;
            boolean A1X = AnonymousClass000.A1X(this.A08.A00);
            C35521m4 r1 = indiaUpiBankAccountDetailsActivity.A00;
            if (A1X) {
                A022 = IndiaUpiPinPrimerFullSheetActivity.A02(indiaUpiBankAccountDetailsActivity, r1, true);
                i2 = 1017;
            } else {
                A022 = IndiaUpiPinPrimerFullSheetActivity.A02(indiaUpiBankAccountDetailsActivity, r1, false);
                i2 = 1016;
            }
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A022, i2);
        } else if (view.getId() == R.id.change_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A09;
            Intent A042 = C110105dW.A04(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
            C110115dX.A0o(A042, indiaUpiBankAccountDetailsActivity2.A00);
            indiaUpiBankAccountDetailsActivity2.startActivity(A042);
        } else if (view.getId() == R.id.switch_payment_provider_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A09;
            C1209863t r3 = new C1209863t(indiaUpiBankAccountDetailsActivity3);
            C13680ns.A1U(new C114435nl(indiaUpiBankAccountDetailsActivity3, r3, 104), indiaUpiBankAccountDetailsActivity3.A0G);
        } else if (view.getId() == R.id.upi_international_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity4 = (IndiaUpiBankAccountDetailsActivity) this.A09;
            Intent A043 = C110105dW.A04(indiaUpiBankAccountDetailsActivity4, IndiaUpiInternationalActivationActivity.class);
            C110115dX.A0o(A043, indiaUpiBankAccountDetailsActivity4.A00);
            indiaUpiBankAccountDetailsActivity4.Ag3(A043, 1019);
        }
    }

    public void setInternationalActivationView(C93684jb r5) {
        View view = this.A01;
        if (view != null && this.A02 != null) {
            view.setOnClickListener(this);
            boolean z2 = r5.A01;
            View view2 = this.A02;
            if (z2) {
                view2.setVisibility(0);
                this.A01.setVisibility(8);
                return;
            }
            view2.setVisibility(8);
            this.A01.setVisibility(0);
            TextView A0M = C13680ns.A0M(this, R.id.international_desc);
            if (A0M != null) {
                A0M.setText(r5.A00);
            }
        }
    }
}
