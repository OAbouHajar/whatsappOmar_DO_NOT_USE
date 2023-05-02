package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.621  reason: invalid class name */
public class AnonymousClass621 implements C1223169c {
    public final /* synthetic */ C28411Vz A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public AnonymousClass621(C28411Vz r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A02 = paymentBottomSheet;
        this.A00 = r1;
    }

    public void A5E(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C13680ns.A0L(indiaUpiSendPaymentActivity.getLayoutInflater().inflate(R.layout.layout0123, viewGroup, true), R.id.amount).setText(this.A00.A9H(indiaUpiSendPaymentActivity.A01, indiaUpiSendPaymentActivity.A0A, 0));
    }

    public String AAl(C30671cl r3, int i2) {
        return this.A01.getString(R.string.str143f);
    }

    public String ABa(C30671cl r2) {
        return null;
    }

    public String ABb(C30671cl r2) {
        return null;
    }

    public String ABu(C30671cl r2, int i2) {
        return null;
    }

    public String ADg(C30671cl r2) {
        return null;
    }

    public boolean AJN() {
        C35511m3 r0 = this.A01.A0B;
        return r0 != null && r0.A0B();
    }

    public void AMf(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        AnonymousClass5vS r3 = indiaUpiSendPaymentActivity.A0Y;
        boolean A47 = indiaUpiSendPaymentActivity.A47();
        int i2 = 0;
        boolean A1V = AnonymousClass000.A1V(indiaUpiSendPaymentActivity.A0I);
        if (!A47 || A1V || !r3.A01.A0C(1718)) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) C004601z.A0E(viewGroup, R.id.payment_description_row);
        indiaUpiSendPaymentActivity.A0W = paymentDescriptionRow;
        paymentDescriptionRow.A01(indiaUpiSendPaymentActivity.A0c);
    }

    public void AMg(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        View inflate = indiaUpiSendPaymentActivity.getLayoutInflater().inflate(R.layout.layout05c1, viewGroup, true);
        C110105dW.A0r(C110105dW.A08(indiaUpiSendPaymentActivity, inflate, C13680ns.A0L(inflate, R.id.text), R.string.str143f), this.A02, 81);
    }

    public void AMi(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        View inflate = indiaUpiSendPaymentActivity.getLayoutInflater().inflate(R.layout.layout030e, viewGroup, true);
        ImageView A0J = C13680ns.A0J(inflate, R.id.payment_recipient_profile_pic);
        TextView A0L = C13680ns.A0L(inflate, R.id.payment_recipient_direction_label);
        TextView A0L2 = C13680ns.A0L(inflate, R.id.payment_recipient_name);
        TextView A0L3 = C13680ns.A0L(inflate, R.id.payment_recipient_vpa);
        C004601z.A0E(inflate, R.id.expand_receiver_details_button).setVisibility(8);
        A0L.setText(R.string.str10d3);
        indiaUpiSendPaymentActivity.A01.A05(A0J, R.drawable.avatar_contact);
        A0L2.setText((CharSequence) C110105dW.A0d(indiaUpiSendPaymentActivity.A07));
        Object obj = indiaUpiSendPaymentActivity.A09.A00;
        AnonymousClass00B.A06(obj);
        A0L3.setText(C13680ns.A0d(indiaUpiSendPaymentActivity, obj, new Object[1], 0, R.string.str0b6f));
    }

    public void ARV(ViewGroup viewGroup, C30671cl r4) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C111345g2.A1g(indiaUpiSendPaymentActivity.getLayoutInflater(), viewGroup, indiaUpiSendPaymentActivity);
    }

    public boolean AfC(C30671cl r2, int i2) {
        return false;
    }

    public boolean AfK(C30671cl r2) {
        return false;
    }

    public boolean AfL() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public boolean Afl() {
        return false;
    }
}
