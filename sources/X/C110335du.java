package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.5du  reason: invalid class name and case insensitive filesystem */
public class C110335du extends ArrayAdapter {
    public AnonymousClass69A A00;
    public C1223669h A01;
    public List A02 = AnonymousClass000.A0u();
    public final AnonymousClass013 A03;
    public final C18290wS A04;

    public C110335du(Context context, AnonymousClass013 r4, C18290wS r5, C1223669h r6) {
        super(context, R.layout.layout045d, AnonymousClass000.A0u());
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r6;
        this.A01 = r6;
    }

    public int getCount() {
        List list = this.A02;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A02.get(i2);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView;
        int i3;
        WaImageView waImageView;
        int i4;
        PaymentMethodRow paymentMethodRow = view == null ? new PaymentMethodRow(getContext()) : (PaymentMethodRow) view;
        C30671cl A0G = C110115dX.A0G(this.A02, i2);
        if (A0G != null) {
            C1223669h r3 = this.A01;
            String ADi = r3.ADi(A0G);
            if (r3.AfL()) {
                r3.AfY(A0G, paymentMethodRow);
            } else {
                C119405xi.A08(A0G, paymentMethodRow);
            }
            if (TextUtils.isEmpty(ADi)) {
                ADi = C119405xi.A05(getContext(), A0G, this.A04, true);
            }
            paymentMethodRow.A05.setText(ADi);
            paymentMethodRow.A01(r3.ADh(A0G));
            paymentMethodRow.A02(!r3.AfB(A0G));
            String ADf = r3.ADf(A0G);
            if (!TextUtils.isEmpty(ADf)) {
                paymentMethodRow.A03.setText(ADf);
                textView = paymentMethodRow.A03;
                i3 = 0;
            } else {
                textView = paymentMethodRow.A03;
                i3 = 8;
            }
            textView.setVisibility(i3);
            int ADe = r3.ADe(A0G);
            if (ADe == 0) {
                waImageView = paymentMethodRow.A08;
                i4 = 8;
            } else {
                paymentMethodRow.A08.setImageResource(ADe);
                waImageView = paymentMethodRow.A08;
                i4 = 0;
            }
            waImageView.setVisibility(i4);
            C004601z.A0E(paymentMethodRow, R.id.account_number_divider).setVisibility(C13680ns.A02(r3.AfI() ? 1 : 0));
        }
        return paymentMethodRow;
    }

    public int getViewTypeCount() {
        return 1;
    }
}
